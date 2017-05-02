package com.docusign.sample;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.regex.Pattern;

import com.docusign.esign.helper.EnvelopesHelper;
import com.docusign.esign.model.EnvelopeSummary;
import com.docusign.esign.model.LoginAccount;
import com.docusign.sample.utils.CameraStoragePermissionsHelper;
import com.docusign.sample.utils.Config;
import com.docusign.sample.service.FirebaseUploadService;

public class SignOrSendActivity extends AppCompatActivity implements View.OnClickListener,
        CameraStoragePermissionsHelper.CameraStoragePermissionCallback {

    private static final String TAG = SignOrSendActivity.class.getSimpleName();

    /**
     * Regex to verify email
     */
    private static final Pattern EMAIL_REGEX = Pattern.compile
            ("^((([^<>()\\[\\]\\\\.,;:\\s@\\\"]+(\\." +
                    "[^<>()\\[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\".+\\\")" +
                    ")@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|" +
                    "(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,})))$");

    /**
     * Bundle argument extra
     */
    private static final String FILE_EXTRA = "SignOrSendActivity.File";
    /**
     * Sign loader id
     */
    private static final int LOAD_SIGN_ENVELOPE = 1;
    /**
     * Send loader id
     */
    private static final int LOAD_SEND_ENVELOPE = 2;
    /**
     * Request code for reading files from the device
     */
    private static final int FILE_REQ_CODE = 100;
    /**
     * Recipient email
     */
    private static String mRecipientEmail;
    /**
     * Helper fragment for runtime permissions
     */
    private CameraStoragePermissionsHelper mPermissionsHelperFragment;
    /**
     * Recipient email
     */
    private EditText mRecipientEmailTxt;
    /**
     * Keep a track of whether we're clicking Send or Sign button
     */
    private boolean mSignEnvelope = false;
    /**
     * Progress Dialog
     */
    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signorsend);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // append the user's first name to the welcome label
        LoginAccount loginAccount = SampleApp.getInstance().getLoginAccount();
        if (loginAccount != null) {
            ((TextView) findViewById(R.id.welcome_text)).
                    setText(getString(R.string.welcome, loginAccount.getName().split(" ")[0]));
        }

        // set up send/sign button click listeners
        findViewById(R.id.sign_btn).setOnClickListener(this);
        findViewById(R.id.send_btn).setOnClickListener(this);

        // find the signer/recipient email field
        mRecipientEmailTxt = (EditText) findViewById(R.id.email);

        // attach the permissions fragment to this activity since we will be asking for permissions
        mPermissionsHelperFragment = (CameraStoragePermissionsHelper) getSupportFragmentManager()
                .findFragmentByTag(CameraStoragePermissionsHelper.TAG);
        if (mPermissionsHelperFragment == null) {
            mPermissionsHelperFragment = CameraStoragePermissionsHelper.newInstance();
            getSupportFragmentManager().beginTransaction()
                    .add(mPermissionsHelperFragment, CameraStoragePermissionsHelper.TAG)
                    .commit();
        }
    }

    @Override
    public void onClick(View v) {
        mRecipientEmail = mRecipientEmailTxt.getText().toString().trim();
        if (!mRecipientEmail.isEmpty() && !isValidEmail(mRecipientEmail)) {
            showError(getString(R.string.enter_valid_email));
            return;
        }

        switch (v.getId()) {
            case R.id.send_btn:
                mSignEnvelope = false;
                break;
            case R.id.sign_btn:
                mSignEnvelope = true;
                break;
        }

        // pop up the file picker
        documentPickChooser();
    }

    /**
     * Choose from the provided default file or select a file from the device
     */
    private void documentPickChooser() {
        // open an alert dialog to present following options
        String[] sigItems = new String[]{
                getString(R.string.send_chooser_default),
                getString(R.string.send_chooser_custom)};

        AlertDialog alertDialog;
        ArrayAdapter<String> optionsAdapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, sigItems);
        AlertDialog.Builder adBuilder = new AlertDialog.Builder(this, R.style.Theme_AppCompat_Light_Dialog_Alert);

        adBuilder.setAdapter(optionsAdapter, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                if (item == 0) {
                        /* check for runtime permissions on M or above. See onStoragePermissionGranted() */
                    mPermissionsHelperFragment.checkStoragePermissions();
                } else {
                        /* check for runtime permissions on M or above. See onStoragePermissionGranted() */
                    mPermissionsHelperFragment.checkCameraStoragePermissions();
                }
            }
        });
        adBuilder.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface arg0) {
            }
        });
        alertDialog = adBuilder.create();
        alertDialog.show();
    }

    @Override
    public void onStoragePermissionGranted() {
        try {
            File file = new File(getFilesDir(), "House.pdf");
            InputStream inputStream = getAssets().open("House.pdf");
            OutputStream outputStream = new FileOutputStream(file);
            try {
                byte buffer[] = new byte[1024];
                int length;
                while ((length = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                }
            } finally {
                outputStream.close();
                inputStream.close();
            }

            callHelper(file);
        } catch (IOException e) {
            showError("Error reading the provided file");
        }
    }

    @Override
    public void onCameraStoragePermissionGranted() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("*/*");
        startActivityForResult(intent, FILE_REQ_CODE);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == FILE_REQ_CODE && resultCode == Activity.RESULT_OK) {
            if (data != null) {
                Uri uri = data.getData();
                callHelper(new File(uri.getPath()));
            } else {
                showError("Error fetching document uri");
            }
        }
    }

    @Override
    public void onBackPressed() {
        // Remove all sessions
        SampleApp.getInstance().setAccessToken(null);

        finish();
    }

    /**
     * Call the helper method to either Sign a document or Send a document
     *
     * @param file the selected file
     */
    private void callHelper(File file) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(FILE_EXTRA, file);

        showLoading(getString(R.string.loading));
        if (mSignEnvelope) {
            signLoader(bundle);
        } else {
            sendLoader(bundle);
        }
    }

    private void startOrResumeLoader(int loaderId, Bundle bundle, LoaderManager.LoaderCallbacks lc) {
        LoaderManager loaderManager = getSupportLoaderManager();
        Loader loader = loaderManager.getLoader(loaderId);
        if (loader == null) {
            loaderManager.initLoader(loaderId, bundle, lc).forceLoad();
        } else {
            loaderManager.restartLoader(loaderId, bundle, lc).forceLoad();
        }
    }

    /**
     * Create the Sign loader and call the Sign helper method
     *
     * @param bundle with the required File as extra
     */
    private void signLoader(Bundle bundle) {
        LoaderManager.LoaderCallbacks lc = new LoaderManager.LoaderCallbacks<String>() {
            @Override
            public Loader<String> onCreateLoader(int id, Bundle args) {
                if (args != null) {
                    LoginAccount loginAccount = SampleApp.getInstance().getLoginAccount();
                    File file = (File) args.getSerializable(FILE_EXTRA);

                    String accountId;
                    if (loginAccount != null) {
                        accountId = loginAccount.getAccountIdGuid();
                        return new SignEnvelopeLoader(
                                SignOrSendActivity.this,
                                accountId,
                                mRecipientEmail,
                                file);
                    } else {
                        return null;
                    }
                }
                return null;
            }

            @Override
            public void onLoadFinished(Loader<String> loader, String data) {
                hideLoading();
                if (data != null) {
                    Intent intent = new Intent(SignOrSendActivity.this, EmbeddedSigningActivity.class);
                    intent.putExtra(EmbeddedSigningActivity.SIGNING_URL, data);
                    intent.putExtra(EmbeddedSigningActivity.RECIPIENT_EMAIL, mRecipientEmail);
                    startActivity(intent);
                } else {
                    showError("DocuSign signing URL is null");
                }
            }

            @Override
            public void onLoaderReset(Loader<String> loader) {
                Log.d(TAG, "resetting");
            }
        };
        startOrResumeLoader(LOAD_SIGN_ENVELOPE, bundle, lc);
    }

    /**
     * Create the Send loader and call the Send helper method
     *
     * @param bundle with the required File as extra
     */
    private void sendLoader(Bundle bundle) {
        LoaderManager.LoaderCallbacks lc = new LoaderManager.LoaderCallbacks<EnvelopeSummary>() {
            @Override
            public Loader<EnvelopeSummary> onCreateLoader(int id, Bundle args) {
                if (args != null) {
                    File file = (File) args.getSerializable(FILE_EXTRA);
                    LoginAccount loginAccount = SampleApp.getInstance().getLoginAccount();
                    if (loginAccount != null) {
                        return new CreateEnvelopeLoader(
                                SignOrSendActivity.this,
                                loginAccount.getAccountId(),
                                mRecipientEmail,
                                file);
                    } else {
                        return null;
                    }
                }
                return null;
            }

            @Override
            public void onLoadFinished(Loader<EnvelopeSummary> loader, EnvelopeSummary data) {
                hideLoading();
                if (data != null) {
                    String message = String.format(getString(R.string.send_success_message),
                            data.getEnvelopeId(), mRecipientEmail);
                    final AlertDialog.Builder builder = new AlertDialog.Builder(SignOrSendActivity.this);
                    builder.setTitle(getString(R.string.send_success_title));
                    builder.setMessage(message);
                    builder.setPositiveButton(getString(R.string.ok),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int which) {
                                }
                            });
                    builder.show();
                } else {
                    showError("Error while sending the envelope");
                }
            }

            @Override
            public void onLoaderReset(Loader<EnvelopeSummary> loader) {

            }
        };
        startOrResumeLoader(LOAD_SEND_ENVELOPE, bundle, lc);
    }


    @Override
    public void onPermissionDenied() {
        showError("You need to allow permission for this to work!");
    }

    /**
     * Show a toast with the given error message
     *
     * @param error String
     */
    private void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    /**
     * Given an email, validate it
     *
     * @param email String
     */
    private boolean isValidEmail(String email) {
        return EMAIL_REGEX.matcher(email).matches();
    }

    /**
     * AsyncTask loader to make the helper call to Sign envelope
     */
    static class SignEnvelopeLoader extends AsyncTaskLoader<String> {
        private String mAccountId;
        private File mFile;
        private String mRecipientEmail;

        SignEnvelopeLoader(Context context, String accountId, String recipientEmail, File file) {
            super(context);
            mAccountId = accountId;
            mRecipientEmail = recipientEmail;
            mFile = file;
        }

        @Override
        public String loadInBackground() {
            String url = null;
            try {
                EnvelopesHelper envelopesHelper = new EnvelopesHelper(SampleApp.getInstance().getAuthHelper().getApiClient());
                EnvelopesHelper.EmbeddedEnvelopeSummary ees = envelopesHelper.requestEmbeddedSignatureFromDocument(mAccountId, mFile, Config.REDIRECT_URL, mRecipientEmail);
                url = ees.url;
                SampleApp.getInstance().setLastEnvelopeId(ees.envelopeId);
            } catch (Exception e) {
                Log.d(TAG, e.getMessage());
            }
            return url;
        }
    }


    /**
     * AsyncTask loader to make the helper call to Send envelope
     */
    static class CreateEnvelopeLoader extends AsyncTaskLoader<EnvelopeSummary> {
        private File mFile;
        private String mAccountId;
        private String mRecipientEmail;

        CreateEnvelopeLoader(Context context, String accountId, String recipientEmail, File file) {
            super(context);
            mAccountId = accountId;
            mRecipientEmail = recipientEmail;
            mFile = file;
        }

        @Override
        public EnvelopeSummary loadInBackground() {
            EnvelopeSummary envelopeSummary;
            try {
                EnvelopesHelper envelopesHelper = new EnvelopesHelper(SampleApp.getInstance().getAuthHelper().getApiClient());
                envelopeSummary = envelopesHelper.requestSignatureFromDocument
                        (mAccountId, mFile, "Please DocuSign this document", mRecipientEmail);
            } catch (Exception e) {
                envelopeSummary = null;
                Log.w(TAG, "Error in sending envelope: " + e.getMessage());
            }
            return envelopeSummary;
        }
    }

    private void showLoading(String message) {
        if (mProgressDialog == null || !mProgressDialog.isShowing()) {
            mProgressDialog = ProgressDialog.show(this, null, message);
            mProgressDialog.setCanceledOnTouchOutside(false);
            mProgressDialog.setCancelable(false);
            mProgressDialog.setIndeterminateDrawable(getResources().getDrawable(R.drawable.progress));
        }
    }

    private void hideLoading() {
        if (mProgressDialog != null && mProgressDialog.isShowing()
                && !isFinishing()) {
            mProgressDialog.dismiss();
        }
    }
}
