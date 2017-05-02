package com.docusign.esign.api;

import com.docusign.esign.model.LoginInformation;
import com.docusign.esign.model.OauthAccess;
import com.docusign.esign.model.SocialAccountInformation;
import com.docusign.esign.model.UserPasswordInformation;
import com.docusign.esign.model.UserSocialIdResult;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AuthenticationApi {

    /**
     * Deletes user&#39;s social account.
     * Deletes a social account from a use&#39;s account.
     *
     * @param accountId                The external account number (int) or account ID Guid. (required)
     * @param userId                   The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param socialAccountInformation (optional)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/users/{userId}/social")
    Call<Void> deleteSocialLogin(
            @Path("accountId") String accountId, @Path("userId") String userId, @Body SocialAccountInformation socialAccountInformation
    );


    /**
     * Creates an authorization token.
     * Creates an OAuth2 authorization server token endpoint.
     *
     * @return Call<OauthAccess>
     */

    @POST("v2/oauth2/token")
    Call<OauthAccess> getOAuthToken();


    /**
     * Gets a list of a user&#39;s social accounts.
     * Retrieves a list of social accounts linked to a user&#39;s account.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param userId    The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @return Call<UserSocialIdResult>
     */

    @GET("v2/accounts/{accountId}/users/{userId}/social")
    Call<UserSocialIdResult> listSocialLogins(
            @Path("accountId") String accountId, @Path("userId") String userId
    );


    /**
     * Gets login information for a specified user.
     * Retrieves login information for a specified user. Each account that is associated with the login credentials is listed. You can use the returned information to determine whether a user is authenticated and select an account to use in future operations.  \n\nThe `baseUrl` property, returned in the response, is used in all future API calls as the base of the request URL. The `baseUrl` property contains the DocuSign server, the API version, and the `accountId` property that is used for the login. This request uses your DocuSign credentials to retrieve the account information.
     *
     * @param apiPassword          When set to **true**, shows the account API password in the response. (optional)
     * @param embedAccountIdGuid   (optional)
     * @param includeAccountIdGuid When set to **true**, shows the account ID GUID in the response. (optional)
     * @param loginSettings        Determines whether login settings are returned in the response.\n\nValid Values:\n\n* all -  All the login settings are returned. \n* none - no login settings are returned. (optional)
     * @return Call<LoginInformation>
     */

    @GET("v2/login_information")
    Call<LoginInformation> login(
            @Query("api_password") String apiPassword, @Query("embed_account_id_guid") String embedAccountIdGuid, @Query("include_account_id_guid") String includeAccountIdGuid, @Query("login_settings") String loginSettings
    );


    /**
     * Revokes an authorization token.
     * Revokes an OAuth2 authorization server token. After the revocation is complete, a caller must re-authenticate to restore access.
     *
     * @return Call<Void>
     */

    @POST("v2/oauth2/revoke")
    Call<Void> revokeOAuthToken();


    /**
     * Updates the password for a specified user.
     * Updates the password for a specified user.
     *
     * @param loginPart               Currently, only the value **password** is supported. (required)
     * @param userPasswordInformation (optional)
     * @return Call<Void>
     */

    @PUT("v2/login_information/{loginPart}")
    Call<Void> updatePassword(
            @Path("loginPart") String loginPart, @Body UserPasswordInformation userPasswordInformation
    );


    /**
     * Adds social account for a user.
     * Adds a new social account to a user&#39;s account.
     *
     * @param accountId                The external account number (int) or account ID Guid. (required)
     * @param userId                   The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param socialAccountInformation (optional)
     * @return Call<Void>
     */

    @PUT("v2/accounts/{accountId}/users/{userId}/social")
    Call<Void> updateSocialLogin(
            @Path("accountId") String accountId, @Path("userId") String userId, @Body SocialAccountInformation socialAccountInformation
    );


}
