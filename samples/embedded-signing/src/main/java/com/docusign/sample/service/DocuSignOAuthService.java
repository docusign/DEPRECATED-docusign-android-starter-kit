package com.docusign.sample.service;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Base64;
import android.util.Log;

import com.docusign.sample.models.AccessTokenModel;
import com.docusign.sample.utils.DateDeserializer;
import com.docusign.sample.utils.EnumDeserializer;
import com.docusign.sample.utils.Config;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;

import okhttp3.OkHttpClient;
import okhttp3.OkUrlFactory;

public class DocuSignOAuthService extends IntentService {

    private static final String TAG = DocuSignOAuthService.class.getSimpleName();
    public static final String ACTION_ACCESS_TOKEN = TAG + ".ActionAccessToken";
    public static final String EXTRA_CODE = TAG + ".code";
    public static final String EXTRA_ACCESS_TOKEN = TAG + ".AccessToken";
    public static final String EXTRA_ACCESS_TOKEN_ERROR = TAG + ".AccessTokenError";

    public DocuSignOAuthService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        // see https://developers.docusign.com/esign/guide/authentication/oauth2-implicit
        String token = intent.getStringExtra(EXTRA_ACCESS_TOKEN);

        Intent tokenIntent = new Intent(ACTION_ACCESS_TOKEN);
        tokenIntent.putExtra(EXTRA_ACCESS_TOKEN, token);
        LocalBroadcastManager.getInstance(this).sendBroadcast(tokenIntent);

    }

    public static String getLoginUrl() {
        Uri.Builder oauthBuilder = Uri.parse(Config.OAUTH_BASE_URL)
                .buildUpon()
                .path(Config.FULL_OAUTH_AUTH)
                .appendQueryParameter(Config.PARAMETER_CLIENT_ID, Config.CLIENT_ID)
                .appendQueryParameter(Config.PARAMETER_RESPONSE_TYPE, Config.PARAMETER_TOKEN)
                .appendQueryParameter(Config.PARAMETER_REDIRECT_URI, Config.PARAMETER_CALLBACK)
                .appendQueryParameter(Config.PARAMETER_SCOPE, Config.PARAMETER_SIGNATURE);

        Uri oauthUri = oauthBuilder.build();
        return oauthUri.toString();
    }

    private Gson getGson() {
        return new GsonBuilder()
                .registerTypeHierarchyAdapter(Enum.class, EnumDeserializer.INSTANCE)
                .registerTypeAdapter(Date.class, DateDeserializer.INSTANCE)
                .create();
    }

    private <T> T processJson(InputStream in, Class<T> type) throws Exception {
        InputStreamReader r = new InputStreamReader(in);
        try {
            return getGson().fromJson(r, type);
        } catch (JsonParseException jse) {
            // TODO better error handling
            // for some reason we are getting hit an SSL exception when trying to read the JSON
            // that bubbles up to a json syntax exception. catch for now.
            throw new Exception();
        } finally {
            try {
                r.close();
            } catch (IOException e) {
                Log.d(TAG, e.getMessage());
            }
        }
    }


}
