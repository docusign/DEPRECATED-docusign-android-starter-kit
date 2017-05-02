package com.docusign.sample.utils;

public class Config {

    // TODO Use your DocuSign config!!!
    public static final String CLIENT_ID = "<DocuSign_Client_ID_goes_here>";
    public static final String CLIENT_SECRET = "<DocuSign_Client_Secret_goes_here>";
    public static final String DS_BASE_URL = "https://demo.docusign.net/restapi";

    // Firebase APP settings
    public static final String FIREBASE_STORAGE_URL = "gs://docusign-embedded-signing.appspot.com";

    // for production environment update to "https://account.docusign.com/"
    public static final String OAUTH_BASE_URL = "https://account-d.docusign.com/";
    public static final String REDIRECT_URL = "https://momentum.docusign.com/san-francisco2017/en/developer-value";
    public static final String FULL_OAUTH_AUTH = "oauth/auth";
    public static final String FULL_OAUTH_TOKEN = "oauth/token";
    public static final String PARAMETER_CLIENT_ID = "client_id";
    public static final String PARAMETER_RESPONSE_TYPE = "response_type";
    public static final String PARAMETER_CODE = "code";
    public static final String PARAMETER_SCOPE = "scope";
    public static final String PARAMETER_ALL = "signature";
    public static final String PARAMETER_ERROR = "error";
    public static final String PARAMETER_ERROR_DETAILS = "error_description";
    public static final String PARAMETER_REDIRECT_URI = "redirect_uri";
    public static final String PARAMETER_CALLBACK = "dsmomentum://oauth/callback";
    public static final String PARAMETER_GRANT_TYPE = "grant_type";
    public static final String PARAMETER_AUTHORIZATION_CODE = "authorization_code";
    public static final String AUTHORIZATION = "Authorization";
    public static final String BASIC = "Basic";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_X_FORM_URLENCODED = "application/x-www-form-urlencoded";
    public static final String UTF8 = "utf-8";
    public static final String HTTP_POST = "POST";

    private Config() {
    }

}

