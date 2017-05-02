package com.docusign.esign.helper;

import com.docusign.esign.api.AuthenticationApi;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.auth.ApiKeyAuth;
import com.docusign.esign.model.LoginAccount;
import com.docusign.esign.model.LoginInformation;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Response;

public class AuthenticationHelper {
    private String mIntegratorKey;
    private ApiClient mApiClient;

    public AuthenticationHelper(String baseUrl, String integratorKey) {
        mIntegratorKey = integratorKey;

        // this order is very important!
        mApiClient = new ApiClient();
        mApiClient.setBaseUrl(baseUrl);
        mApiClient.createDefaultAdapter();
    }

    /**
     * Makes the DocuSign login call to get user info as well as the list of account for that user.
     *
     * @param apiKeyAuth a Retrofit interceptor that contains the necessary authentication header
     *                   that is required by DocuSign API. Suppoted methods are OAuth2 access token
     *                   and X-DocuSign-Authentication header. See docs.docusign.com for more infos.
     * @return The list of DocuSign account information related to the logged-in user.
     * @throws Exception API Error message or any other login related error message
     * @see AuthenticationApi
     * @see LoginAccount
     */
    private List<LoginAccount> loginWithAuthHeader(ApiKeyAuth apiKeyAuth) throws Exception {
        List<LoginAccount> loginAccounts = new ArrayList<>();

        // clear any existing form of API authorization (API key, Access token...)
        mApiClient.getApiAuthorizations().clear();
        // use the new authorization data
        mApiClient.addAuthorization("apiKeyAuth", apiKeyAuth);

        try {
            // the login call is provided by AuthenticationApi service class
            AuthenticationApi authApi = mApiClient.createService(AuthenticationApi.class);
            // make the API call to get the account(s) information
            Response<LoginInformation> response = authApi.login("true", "true", "true", "all").execute();
            LoginInformation loginInfo = response.body();
            if (response.errorBody() != null) {
                throw new Exception("Error while calling DocuSign Authentication API: " + response.errorBody().string());
            } else if (loginInfo != null) {
                loginAccounts = loginInfo.getLoginAccounts();
                // parse first account ID (user might belong to multiple accounts) and baseUrl
                String accountId = loginInfo.getLoginAccounts().get(0).getAccountId();
                String baseUrl = loginInfo.getLoginAccounts().get(0).getBaseUrl();
                String[] accountDomain = baseUrl.split("/v2");

                // below code required for production, no effect in demo (same domain)
                mApiClient.setBaseUrl(accountDomain[0]);

            }
        } catch (Exception ex) {
            throw new Exception("Error while calling AuthenticationHelper login: " + ex.getMessage());
        }

        return loginAccounts;
    }

    // This function is deprecated. It makes the /vx/login_information call to the API
    // It uses X-DocuSign-Authentication with password in plain text. Use loginWithOauthToken instead!
    // This can be used ONLY for two-legged authentication, i.e. DocuSign user login isn't required.
    // This is typically the case for server-to-DocuSignAPI or mobile-to-DocuSignAPI integrations.
    @Deprecated
    public List<LoginAccount> loginWithEmailAndPassword(String email, String password) throws Exception {
        // create JSON formatted authentication header
        String creds = "{\"Username\":\"" + email + "\",\"Password\":\"" + password + "\",\"IntegratorKey\":\"" + mIntegratorKey + "\"}";

        // create a Retrofit interceptor for DocuSign authentication header
        ApiKeyAuth apiKeyAuth = new ApiKeyAuth("header", "X-DocuSign-Authentication");
        apiKeyAuth.setApiKey(creds);

        try {
            return loginWithAuthHeader(apiKeyAuth);
        } catch (Exception ex) {
            throw new Exception("Error while calling DocuSign API: " + ex.getMessage());
        }
    }

    /**
     * Uses the access token passed as argument to make DocuSign login call and get the user info
     * as well as the user DocuSign accounts list.
     * @param accessToken a valid and non expired DocuSign OAuth2 access token
     * @return The list of DocuSign account information related to the logged-in user.
     * @throws Exception API Error message or any other login related error message.
     * @see AuthenticationApi
     * @see LoginAccount
     */
    public List<LoginAccount> loginWithOauthToken(String accessToken) throws Exception {
        // OAuth access token
        String creds = "Bearer " + accessToken;

        // create a Retrofit interceptor for DocuSign OAuth2 header
        ApiKeyAuth apiKeyAuth = new ApiKeyAuth("header", "Authorization");
        apiKeyAuth.setApiKey(creds);

        try {
            return loginWithAuthHeader(apiKeyAuth);
        } catch (Exception ex) {
            throw new Exception("Error while calling DocuSign API: " + ex.getMessage());
        }
    }

    /**
     * Getter for the DocuSign API Client instance.
     * @return the DocuSign API Client instance
     */
    public ApiClient getApiClient() {
        return mApiClient;
    }
}
