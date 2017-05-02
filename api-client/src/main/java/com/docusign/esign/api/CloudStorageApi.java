package com.docusign.esign.api;

import com.docusign.esign.model.CloudStorageProviders;
import com.docusign.esign.model.ExternalFolder;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CloudStorageApi {

    /**
     * Configures the redirect URL information  for one or more cloud storage providers for the specified user.
     * Configures the redirect URL information  for one or more cloud storage providers for the specified user. The redirect URL is added to the authentication URL to complete the return route.
     *
     * @param accountId             The external account number (int) or account ID Guid. (required)
     * @param userId                The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param cloudStorageProviders (optional)
     * @return Call<CloudStorageProviders>
     */

    @POST("v2/accounts/{accountId}/users/{userId}/cloud_storage")
    Call<CloudStorageProviders> createProvider(
            @Path("accountId") String accountId, @Path("userId") String userId, @Body CloudStorageProviders cloudStorageProviders
    );


    /**
     * Deletes the user authentication information for the specified cloud storage provider.
     * Deletes the user authentication information for the specified cloud storage provider. The next time the user tries to access the cloud storage provider, they must pass normal authentication for this cloud storage provider.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param serviceId The ID of the service to access. \n\nValid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;). (required)
     * @param userId    The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @return Call<CloudStorageProviders>
     */

    @DELETE("v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}")
    Call<CloudStorageProviders> deleteProvider(
            @Path("accountId") String accountId, @Path("serviceId") String serviceId, @Path("userId") String userId
    );


    /**
     * Deletes the user authentication information for one or more cloud storage providers.
     * Deletes the user authentication information for one or more cloud storage providers. The next time the user tries to access the cloud storage provider, they must pass normal authentication.
     *
     * @param accountId             The external account number (int) or account ID Guid. (required)
     * @param userId                The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param cloudStorageProviders (optional)
     * @return Call<CloudStorageProviders>
     */

    @DELETE("v2/accounts/{accountId}/users/{userId}/cloud_storage")
    Call<CloudStorageProviders> deleteProviders(
            @Path("accountId") String accountId, @Path("userId") String userId, @Body CloudStorageProviders cloudStorageProviders
    );


    /**
     * Gets the specified Cloud Storage Provider configuration for the User.
     * Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param serviceId   The ID of the service to access. \n\nValid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;). (required)
     * @param userId      The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param redirectUrl The URL the user is redirected to after the cloud storage provider authenticates the user. Using this will append the redirectUrl to the authenticationUrl.\n\nThe redirectUrl is restricted to URLs in the docusign.com or docusign.net domains.\n  (optional)
     * @return Call<CloudStorageProviders>
     */

    @GET("v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}")
    Call<CloudStorageProviders> getProvider(
            @Path("accountId") String accountId, @Path("serviceId") String serviceId, @Path("userId") String userId, @Query("redirectUrl") String redirectUrl
    );


    /**
     * Gets a list of all the items from the specified cloud storage provider.
     * Retrieves a list of all the items in all  the folders associated with the user from the specified cloud storage provider. You can limit the scope of the returned items by providing a comma separated list of folder IDs in the request.
     *
     * @param accountId              The external account number (int) or account ID Guid. (required)
     * @param folderId               The ID of the folder being accessed. (required)
     * @param serviceId              The ID of the service to access. \n\nValid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;). (required)
     * @param userId                 The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param cloudStorageFolderPath (optional)
     * @param count                  An optional value that sets how many items are included in the response. \n\nThe default setting for this is 25.  (optional)
     * @param order                  An optional value that sets the direction order used to sort the item list. \n\nValid values are: \n\n* asc = ascending sort order\n* desc = descending sort order  (optional)
     * @param orderBy                An optional value that sets the file attribute used to sort the item list. \n\nValid values are: \n\n* modified\n* name   (optional)
     * @param searchText             (optional)
     * @param startPosition          Indicates the starting point of the first item included in the response set. It uses a 0-based index. The default setting for this is 0.   (optional)
     * @return Call<ExternalFolder>
     */

    @GET("v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}/folders/{folderId}")
    Call<ExternalFolder> list(
            @Path("accountId") String accountId, @Path("folderId") String folderId, @Path("serviceId") String serviceId, @Path("userId") String userId, @Query("cloud_storage_folder_path") String cloudStorageFolderPath, @Query("count") String count, @Query("order") String order, @Query("order_by") String orderBy, @Query("search_text") String searchText, @Query("start_position") String startPosition
    );


    /**
     * Retrieves a list of all the items in a specified folder from the specified cloud storage provider.
     * Retrieves a list of all the items in a specified folder from the specified cloud storage provider.
     *
     * @param accountId              The external account number (int) or account ID Guid. (required)
     * @param serviceId              The ID of the service to access. \n\nValid values are the service name (\&quot;Box\&quot;) or the numerical serviceId (\&quot;4136\&quot;). (required)
     * @param userId                 The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param cloudStorageFolderPath A comma separated list of folder IDs included in the request.  (optional)
     * @param count                  An optional value that sets how many items are included in the response. \n\nThe default setting for this is 25.  (optional)
     * @param order                  An optional value that sets the direction order used to sort the item list. \n\nValid values are: \n\n* asc = ascending sort order\n* desc = descending sort order  (optional)
     * @param orderBy                An optional value that sets the file attribute used to sort the item list. \n\nValid values are: \n\n* modified\n* name   (optional)
     * @param searchText             (optional)
     * @param startPosition          Indicates the starting point of the first item included in the response set. It uses a 0-based index. The default setting for this is 0.   (optional)
     * @return Call<ExternalFolder>
     */

    @GET("v2/accounts/{accountId}/users/{userId}/cloud_storage/{serviceId}/folders")
    Call<ExternalFolder> listFolders(
            @Path("accountId") String accountId, @Path("serviceId") String serviceId, @Path("userId") String userId, @Query("cloud_storage_folder_path") String cloudStorageFolderPath, @Query("count") String count, @Query("order") String order, @Query("order_by") String orderBy, @Query("search_text") String searchText, @Query("start_position") String startPosition
    );


    /**
     * Get the Cloud Storage Provider configuration for the specified user.
     * Retrieves the list of cloud storage providers enabled for the account and the configuration information for the user.\n\nThe {serviceId} parameter can be either the service name or serviceId.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param userId      The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param redirectUrl The URL the user is redirected to after the cloud storage provider authenticates the user. Using this will append the redirectUrl to the authenticationUrl.\n\nThe redirectUrl is restricted to URLs in the docusign.com or docusign.net domains.\n  (optional)
     * @return Call<CloudStorageProviders>
     */

    @GET("v2/accounts/{accountId}/users/{userId}/cloud_storage")
    Call<CloudStorageProviders> listProviders(
            @Path("accountId") String accountId, @Path("userId") String userId, @Query("redirectUrl") String redirectUrl
    );


}
