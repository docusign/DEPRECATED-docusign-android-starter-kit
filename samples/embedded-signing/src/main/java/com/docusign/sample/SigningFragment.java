package com.docusign.sample;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.docusign.esign.helper.EnvelopesHelper;
import com.docusign.esign.model.LoginAccount;
import com.docusign.sample.service.FirebaseUploadService;
import com.docusign.sample.utils.Config;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SigningFragment extends Fragment {

    public static final String TAG = SigningFragment.class.getSimpleName();
    private static final int STORE_SIGNED_ENVELOPE = 1;

    private ViewGroup mWebViewParent;
    private ProgressDialog mProgress;
    private String mSigningUrl;
    private String mRecipientEmail;

    private final BroadcastReceiver mFirebaseUploadReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = null;
            boolean success;
            if (intent != null) {
                action = intent.getAction();
            }
            success = action != null && action.equalsIgnoreCase(FirebaseUploadService.UPLOAD_COMPLETED);
            signingCompleted(intent, success);
        }
    };

    public static SigningFragment newInstance(String url, String recipientEmail) {
        SigningFragment sf = new SigningFragment();

        Bundle bundle = new Bundle();
        bundle.putString(EmbeddedSigningActivity.SIGNING_URL, url);
        bundle.putString(EmbeddedSigningActivity.RECIPIENT_EMAIL, recipientEmail);
        sf.setArguments(bundle);

        return sf;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSigningUrl = getArguments().getString(EmbeddedSigningActivity.SIGNING_URL);
        mRecipientEmail = getArguments().getString(EmbeddedSigningActivity.RECIPIENT_EMAIL);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_signing, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mWebViewParent = (LinearLayout) view.findViewById(R.id.webView_parent);
        recreateWebView();
    }

    @Override
    public void onResume() {
        super.onResume();
        LocalBroadcastManager.getInstance(getActivity()).
                registerReceiver(mFirebaseUploadReceiver, FirebaseUploadService.getIntentFilter());

    }

    @Override
    public void onPause() {
        super.onPause();
        LocalBroadcastManager.getInstance(getActivity()).
                unregisterReceiver(mFirebaseUploadReceiver);
    }

    @SuppressLint("AddJavascriptInterface")
    private void recreateWebView() {
        if (mSigningUrl != null) {

            WebView webView = new WebView(getActivity());
            if (mWebViewParent != null) {
                mWebViewParent.removeAllViews();
                mWebViewParent.addView(webView, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            }

            webView.setFocusable(true);
            webView.requestFocus();
            setUpWebViewDefaults(webView);
            webView.setWebViewClient(new DSSigningWebViewClient());

            webView.loadUrl(mSigningUrl);
        }
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @SuppressWarnings("SetJavaScriptEnabled")
    private void setUpWebViewDefaults(WebView webView) {
        WebSettings settings = webView.getSettings();

        // Enable Javascript
        settings.setJavaScriptEnabled(true);

        // Enable pinch to zoom without the zoom buttons
        settings.setBuiltInZoomControls(true);

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.HONEYCOMB) {
            // Hide the zoom controls for HONEYCOMB+
            settings.setDisplayZoomControls(false);
        }
    }

    private void showLoading(String message) {
        if (mProgress == null || !mProgress.isShowing()) {
            mProgress = ProgressDialog.show(getActivity(), null, message);
            mProgress.setCanceledOnTouchOutside(false);
            mProgress.setCancelable(false);
            mProgress.setIndeterminateDrawable(getResources().getDrawable(R.drawable.progress));
        }
    }

    private void hideLoading() {
        Activity activity = getActivity();
        if (mProgress != null && mProgress.isShowing()
                && activity != null && !activity.isFinishing()) {
            mProgress.dismiss();
        }
    }

    private class DSSigningWebViewClient extends WebViewClient {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            showLoading(getString(R.string.loading));
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            Log.d(TAG, url);
            hideLoading();
            Uri uri = Uri.parse(url);
            String event = uri.getQueryParameter("event");
            if (event != null && "signing_complete".contentEquals(event)) {
                storeSignedDocumentLoader(new Bundle());
            }
        }
    }

    private void startOrResumeLoader(int loaderId, Bundle bundle, LoaderManager.LoaderCallbacks lc) {
        LoaderManager loaderManager = getActivity().getSupportLoaderManager();
        Loader loader = loaderManager.getLoader(loaderId);
        if (loader == null) {
            loaderManager.initLoader(loaderId, bundle, lc).forceLoad();
        } else {
            loaderManager.restartLoader(loaderId, bundle, lc).forceLoad();
        }
    }

    /**
     * Create the loader to download the signed document from DocuSign and persist it in Firebase
     */
    private void storeSignedDocumentLoader(Bundle bundle) {
        LoaderManager.LoaderCallbacks lc = new LoaderManager.LoaderCallbacks<String>() {
            @Override
            public Loader<String> onCreateLoader(int id, Bundle args) {
                showLoading(getString(R.string.loading));
                return new StoreSignedDocumentLoader(
                        SigningFragment.this.getActivity());
            }

            @Override
            public void onLoadFinished(Loader<String> loader, String data) {
                /* no-op because we listen to the Firebase upload service broadcast */
            }

            @Override
            public void onLoaderReset(Loader<String> loader) {
                Log.d(TAG, "resetting");
            }
        };
        startOrResumeLoader(STORE_SIGNED_ENVELOPE, bundle, lc);
    }

    public void signingCompleted(Intent intent, boolean success) {
        hideLoading();
        Uri downloadUri = null;
        if (intent != null) {
            downloadUri = intent.getParcelableExtra(FirebaseUploadService.EXTRA_DOWNLOAD_URL);
        }

        String title = success ? getString(R.string.signing_completed_title) : getString(R.string.signing_failed_title);
        String message = success ? String.format(getString(R.string.signing_completed_message), mRecipientEmail, downloadUri.toString())
                : getString(R.string.signing_failed_message);

        AlertDialog dialog = new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        getActivity().finish();
                    }
                })
                .setCancelable(false)
                .create();

        dialog.setCanceledOnTouchOutside(false);
        if (!getActivity().isFinishing()) {
            dialog.show();
        }
    }

    /**
     * AsyncTask loader to download the signed document from DocuSign and persist it in Firebase
     */
    static class StoreSignedDocumentLoader extends AsyncTaskLoader<String> {

        StoreSignedDocumentLoader(Context context) {
            super(context);
        }

        private void uploadFromUri(Uri fileUri) {
            FirebaseUploadService fus = new FirebaseUploadService();
            fus.uploadFromUri(fileUri);
        }

        @Override
        public String loadInBackground() {
            String url = null;
            EnvelopesHelper envelopesHelper = new EnvelopesHelper(SampleApp.getInstance().getAuthHelper().getApiClient());
            try {
                byte[] pdfBytes = envelopesHelper.getEnvelopeDocument(SampleApp.getInstance().getLoginAccount().getAccountId(), SampleApp.getInstance().getLastEnvelopeId(), "1");
                File f = File.createTempFile("ds_env_", ".pdf", getContext().getCacheDir());
                FileOutputStream fos = new FileOutputStream(f.getAbsolutePath());
                try {
                    fos.write(pdfBytes);
                    Uri tempFileUri = new Uri.Builder()
                            .path(f.toString())
                            .scheme("file")
                            .build();
                    uploadFromUri(tempFileUri);
                } finally {
                    f.delete();
                    fos.close();
                }
            } catch (Exception ex) {
                Log.d(TAG, ex.getMessage());
            }
            return url;
        }
    }

}
