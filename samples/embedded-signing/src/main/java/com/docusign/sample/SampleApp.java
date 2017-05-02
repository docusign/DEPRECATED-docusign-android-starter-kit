package com.docusign.sample;

import android.support.multidex.MultiDexApplication;

import com.docusign.esign.helper.AuthenticationHelper;
import com.docusign.esign.model.LoginAccount;
import com.docusign.sample.utils.Config;

/**
 * Application class
 */

public class SampleApp extends MultiDexApplication {

    private static final String TAG = SampleApp.class.getSimpleName();

    /**
     * Application object
     */
    private static SampleApp sApp;
    /**
     * AccessToken for authentication
     */
    private String mAccessToken;
    /**
     * LoginAccount for account info
     */
    private LoginAccount mAccount;
    private String mLastEnvelopeId;

    private AuthenticationHelper sAuthHelper;

    public static SampleApp getInstance() {
        return sApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sApp = this;
    }

    public AuthenticationHelper getAuthHelper() {
        if (sAuthHelper == null) {
            sAuthHelper = new AuthenticationHelper(Config.DS_BASE_URL ,Config.CLIENT_ID);
        }
        return sAuthHelper;
    }

    public String getAccessToken() {
        return mAccessToken;
    }

    public void setAccessToken(String accessToken) {
        mAccessToken = accessToken;
    }

    public LoginAccount getLoginAccount() {
        return mAccount;
    }

    public void setLoginAccount(LoginAccount account) {
        mAccount = account;
    }

    public String getLastEnvelopeId() {
        return mLastEnvelopeId;
    }

    public void setLastEnvelopeId(String lastEnvelopeId) {
        mLastEnvelopeId = lastEnvelopeId;
    }

}



