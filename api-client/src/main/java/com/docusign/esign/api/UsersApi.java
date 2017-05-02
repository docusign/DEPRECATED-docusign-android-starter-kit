package com.docusign.esign.api;

import com.docusign.esign.model.ContactGetResponse;
import com.docusign.esign.model.ContactModRequest;
import com.docusign.esign.model.ContactUpdateResponse;
import com.docusign.esign.model.CustomSettingsInformation;
import com.docusign.esign.model.NewUsersDefinition;
import com.docusign.esign.model.NewUsersSummary;
import com.docusign.esign.model.UserInfoList;
import com.docusign.esign.model.UserInformation;
import com.docusign.esign.model.UserInformationList;
import com.docusign.esign.model.UserProfile;
import com.docusign.esign.model.UserSettingsInformation;
import com.docusign.esign.model.UserSignature;
import com.docusign.esign.model.UserSignatureDefinition;
import com.docusign.esign.model.UserSignaturesInformation;
import com.docusign.esign.model.UsersResponse;

import okhttp3.ResponseBody;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UsersApi {

    /**
     * Adds news user to the specified account.
     * Adds new users to your account. Set the `userSettings` property in the request to specify the actions the users can perform on the account.
     *
     * @param accountId          The external account number (int) or account ID Guid. (required)
     * @param newUsersDefinition (optional)
     * @return Call<NewUsersSummary>
     */

    @POST("v2/accounts/{accountId}/users")
    Call<NewUsersSummary> create(
            @Path("accountId") String accountId, @Body NewUsersDefinition newUsersDefinition
    );


    /**
     * Adds user Signature and initials images to a Signature.
     * Adds a user signature image and/or user initials image to the specified user. \n\nThe userId property specified in the endpoint must match the authenticated user&#39;s userId and the user must be a member of the account.\n\nThe rules and processes associated with this are:\n\n* If Content-Type is set to application/json, then the default behavior for creating a default signature image, based on the name and a DocuSign font, is used.\n* If Content-Type is set to multipart/form-data, then the request must contain a first part with the user signature information, followed by parts that contain the images.\n\nFor each Image part, the Content-Disposition header has a \&quot;filename\&quot; value that is used to map to the `signatureName` and/or `signatureInitials` properties in the JSON to the image. \n\nFor example: \n`Content-Disposition: file; filename=\&quot;Ron Test20121127083900\&quot;`\n\nIf no matching image (by filename value) is found, then the image is not set. One, both, or neither of the signature and initials images can be set with this call.\n\nThe Content-Transfer-Encoding: base64 header, set in the header for the part containing the image, can be set to indicate that the images are formatted as base64 instead of as binary.\n\nIf successful, 200-OK is returned, and a JSON structure containing the signature information is provided, note that the signatureId can change with each API POST, PUT, or DELETE since the changes to the signature structure cause the current signature to be closed, and a new signature record to be created.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param userId                    The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param userSignaturesInformation (optional)
     * @return Call<UserSignaturesInformation>
     */

    @POST("v2/accounts/{accountId}/users/{userId}/signatures")
    Call<UserSignaturesInformation> createSignatures(
            @Path("accountId") String accountId, @Path("userId") String userId, @Body UserSignaturesInformation userSignaturesInformation
    );


    /**
     * Removes users account privileges.
     * This closes one or more user records in the account. Users are never deleted from an account, but closing a user prevents them from using account functions.\n\nThe response returns whether the API execution was successful (200 - OK) or  if it failed. The response contains a user structure similar to the request and includes the user changes. If an error occurred during the DELETE operation for any of the users, the response for that user contains an `errorDetails` node with `errorCode` and `message` properties.
     *
     * @param accountId    The external account number (int) or account ID Guid. (required)
     * @param userInfoList (optional)
     * @return Call<UsersResponse>
     */

    @DELETE("v2/accounts/{accountId}/users")
    Call<UsersResponse> delete(
            @Path("accountId") String accountId, @Body UserInfoList userInfoList
    );


    /**
     * Replaces a particular contact associated with an account for the DocuSign service.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param contactId The unique identifier of a person in the contacts address book. (required)
     * @return Call<ContactUpdateResponse>
     */

    @DELETE("v2/accounts/{accountId}/contacts/{contactId}")
    Call<ContactUpdateResponse> deleteContactWithId(
            @Path("accountId") String accountId, @Path("contactId") String contactId
    );


    /**
     * Delete contacts associated with an account for the DocuSign service.
     *
     * @param accountId         The external account number (int) or account ID Guid. (required)
     * @param contactModRequest (optional)
     * @return Call<ContactUpdateResponse>
     */

    @DELETE("v2/accounts/{accountId}/contacts")
    Call<ContactUpdateResponse> deleteContacts(
            @Path("accountId") String accountId, @Body ContactModRequest contactModRequest
    );


    /**
     * Deletes custom user settings for a specified user.
     * Deletes the specified custom user settings for a single user.\n\n###Deleting Grouped Custom User Settings###\n\nIf the custom user settings you want to delete are grouped, you must include the following information in the header, after Content-Type, in the request:\n\n`X-DocuSign-User-Settings-Key:group_name`\n\nWhere the `group_name` is your designated name for the group of customer user settings.\n\nIf the extra header information is not included, only the custom user settings that were added without a group are deleted.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param userId                    The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param customSettingsInformation (optional)
     * @return Call<CustomSettingsInformation>
     */

    @DELETE("v2/accounts/{accountId}/users/{userId}/custom_settings")
    Call<CustomSettingsInformation> deleteCustomSettings(
            @Path("accountId") String accountId, @Path("userId") String userId, @Body CustomSettingsInformation customSettingsInformation
    );


    /**
     * Deletes the user profile image for the specified user.
     * Deletes the user profile image from the  specified user&#39;s profile.\n\nThe userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param userId    The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/users/{userId}/profile/image")
    Call<Void> deleteProfileImage(
            @Path("accountId") String accountId, @Path("userId") String userId
    );


    /**
     * Removes removes signature information for the specified user.
     * Removes the signature information for the user.\n\nThe userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.\n\nThe `signatureId` accepts a signature ID or a signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint. \n\nFor example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param signatureId The ID of the signature being accessed. (required)
     * @param userId      The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/users/{userId}/signatures/{signatureId}")
    Call<Void> deleteSignature(
            @Path("accountId") String accountId, @Path("signatureId") String signatureId, @Path("userId") String userId
    );


    /**
     * Deletes the user initials image or the  user signature image for the specified user.
     * Deletes the specified initials image or signature image for the specified user.\n\nThe function deletes one or the other of the image types, to delete both the initials image and signature image you must call the endpoint twice.\n\nThe userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.\n\nThe `signatureId` parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint. \n\nFor example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param imageType   One of **signature_image** or **initials_image**. (required)
     * @param signatureId The ID of the signature being accessed. (required)
     * @param userId      The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @return Call<UserSignature>
     */

    @DELETE("v2/accounts/{accountId}/users/{userId}/signatures/{signatureId}/{imageType}")
    Call<UserSignature> deleteSignatureImage(
            @Path("accountId") String accountId, @Path("imageType") String imageType, @Path("signatureId") String signatureId, @Path("userId") String userId
    );


    /**
     * Gets a particular contact associated with the user&#39;s account.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param contactId The unique identifier of a person in the contacts address book. (required)
     * @return Call<ContactGetResponse>
     */

    @GET("v2/accounts/{accountId}/contacts/{contactId}")
    Call<ContactGetResponse> getContactById(
            @Path("accountId") String accountId, @Path("contactId") String contactId
    );


    /**
     * Gets the user information for a specified user.
     * Retrieves the user information for the specified user. \n\nTo return additional user information that details the last login date, login status, and the user&#39;s password expiration date, set the optional `additional_info` query string parameter to **true**.
     *
     * @param accountId      The external account number (int) or account ID Guid. (required)
     * @param userId         The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param additionalInfo When set to **true**, the full list of user information is returned for each user in the account. (optional)
     * @param email          (optional)
     * @return Call<UserInformation>
     */

    @GET("v2/accounts/{accountId}/users/{userId}")
    Call<UserInformation> getInformation(
            @Path("accountId") String accountId, @Path("userId") String userId, @Query("additional_info") String additionalInfo, @Query("email") String email
    );


    /**
     * Retrieves the user profile for a specified user.
     * Retrieves the user profile information, the privacy settings and personal information (address, phone number, etc.) for the specified user.\n\nThe userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param userId    The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @return Call<UserProfile>
     */

    @GET("v2/accounts/{accountId}/users/{userId}/profile")
    Call<UserProfile> getProfile(
            @Path("accountId") String accountId, @Path("userId") String userId
    );


    /**
     * Retrieves the user profile image for the specified user.
     * Retrieves the user profile picture for the specified user. The image is returned in the same format as uploaded.\n\nThe userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the specified account.\n\nIf successful, the response returns a 200 - OK and the user profile image.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param userId    The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param encoding  (optional)
     * @return Call<ResponseBody>
     */

    @GET("v2/accounts/{accountId}/users/{userId}/profile/image")
    Call<ResponseBody> getProfileImage(
            @Path("accountId") String accountId, @Path("userId") String userId, @Query("encoding") String encoding
    );


    /**
     * Gets the user account settings for a specified user.
     * Retrieves a list of the account settings and email notification information for the specified user.\n\nThe response returns the account setting name/value information and the email notification settings for the specified user. For more information about the different user settings, see the [ML:userSettings list].
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param userId    The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @return Call<UserSettingsInformation>
     */

    @GET("v2/accounts/{accountId}/users/{userId}/settings")
    Call<UserSettingsInformation> getSettings(
            @Path("accountId") String accountId, @Path("userId") String userId
    );


    /**
     * Gets the user signature information for the specified user.
     * Retrieves the structure of a single signature with a known signature name.\n\nThe userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.\n\nThe `signatureId` parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint. \n\nFor example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param signatureId The ID of the signature being accessed. (required)
     * @param userId      The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @return Call<UserSignature>
     */

    @GET("v2/accounts/{accountId}/users/{userId}/signatures/{signatureId}")
    Call<UserSignature> getSignature(
            @Path("accountId") String accountId, @Path("signatureId") String signatureId, @Path("userId") String userId
    );


    /**
     * Retrieves the user initials image or the  user signature image for the specified user.
     * Retrieves the specified initials image or signature image for the specified user. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.\n\nThe userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.\n\nThe `signatureId` parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint. \n\nFor example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.\n\n###### Note: Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param imageType     One of **signature_image** or **initials_image**. (required)
     * @param signatureId   The ID of the signature being accessed. (required)
     * @param userId        The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param includeChrome (optional)
     * @return Call<ResponseBody>
     */

    @GET("v2/accounts/{accountId}/users/{userId}/signatures/{signatureId}/{imageType}")
    Call<ResponseBody> getSignatureImage(
            @Path("accountId") String accountId, @Path("imageType") String imageType, @Path("signatureId") String signatureId, @Path("userId") String userId, @Query("include_chrome") String includeChrome
    );


    /**
     * Retrieves the list of users for the specified account.
     * Retrieves the list of users for the specified account.\n\nThe response returns the list of users for the account along with the information about the result set. If the `additional_info` query was added to the endpoint and set to **true**, the full user information is returned for each user
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param additionalInfo            When set to **true**, the full list of user information is returned for each user in the account. (optional)
     * @param count                     Number of records to return. The number must be greater than 0 and less than or equal to 100.  (optional)
     * @param email                     (optional)
     * @param emailSubstring            Filters the returned user records by the email address or a sub-string of email address. (optional)
     * @param groupId                   Filters user records returned by one or more group Id&#39;s. (optional)
     * @param includeUsersettingsForCsv (optional)
     * @param loginStatus               (optional)
     * @param notGroupId                (optional)
     * @param startPosition             Starting value for the list.  (optional)
     * @param status                    (optional)
     * @param userNameSubstring         Filters the user records returned by the user name or a sub-string of user name. (optional)
     * @return Call<UserInformationList>
     */

    @GET("v2/accounts/{accountId}/users")
    Call<UserInformationList> list(
            @Path("accountId") String accountId, @Query("additional_info") String additionalInfo, @Query("count") String count, @Query("email") String email, @Query("email_substring") String emailSubstring, @Query("group_id") String groupId, @Query("include_usersettings_for_csv") String includeUsersettingsForCsv, @Query("login_status") String loginStatus, @Query("not_group_id") String notGroupId, @Query("start_position") String startPosition, @Query("status") String status, @Query("user_name_substring") String userNameSubstring
    );


    /**
     * Retrieves the custom user settings for a specified user.
     * Retrieves a list of custom user settings for a single user.\n\nCustom settings provide a flexible way to store and retrieve custom user information that can be used in your own system.\n\n###### Note: Custom user settings are not the same as user account settings.\n\n###Getting Grouped Custom User Settings###\n\nIf the custom user settings you want to retrieve are grouped, you must include the following information in the header, after Content-Type, in the request:\n\n`X-DocuSign-User-Settings-Key:group_name`\n\nWhere the `group_name` is your designated name for the group of customer user settings.\n\nIf the extra header information is not included, only the custom user settings that were added without a group are retrieved.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param userId    The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @return Call<CustomSettingsInformation>
     */

    @GET("v2/accounts/{accountId}/users/{userId}/custom_settings")
    Call<CustomSettingsInformation> listCustomSettings(
            @Path("accountId") String accountId, @Path("userId") String userId
    );


    /**
     * Retrieves a list of user signature definitions for a specified user.
     * Retrieves the signature definitions for the specified user.\n\nThe userId parameter specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.\n\nThe `signatureId` parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint. \n\nFor example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param userId    The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @return Call<UserSignaturesInformation>
     */

    @GET("v2/accounts/{accountId}/users/{userId}/signatures")
    Call<UserSignaturesInformation> listSignatures(
            @Path("accountId") String accountId, @Path("userId") String userId
    );


    /**
     * Imports multiple new contacts into the contacts collection from CSV, JSON, or XML (based on content type).
     *
     * @param accountId         The external account number (int) or account ID Guid. (required)
     * @param contactModRequest (optional)
     * @return Call<ContactUpdateResponse>
     */

    @POST("v2/accounts/{accountId}/contacts")
    Call<ContactUpdateResponse> postContacts(
            @Path("accountId") String accountId, @Body ContactModRequest contactModRequest
    );


    /**
     * Replaces contacts associated with an account for the DocuSign service.
     *
     * @param accountId         The external account number (int) or account ID Guid. (required)
     * @param contactModRequest (optional)
     * @return Call<ContactUpdateResponse>
     */

    @PUT("v2/accounts/{accountId}/contacts")
    Call<ContactUpdateResponse> putContacts(
            @Path("accountId") String accountId, @Body ContactModRequest contactModRequest
    );


    /**
     * Adds or updates custom user settings for the specified user.
     * Adds or updates custom user settings for the specified user.\n\n###### Note: Custom user settings are not the same as user account settings.\n\nCustom settings provide a flexible way to store and retrieve custom user information that you can use in your own system.\n\n**Important**: There is a limit on the size for all the custom user settings for a single user. The limit is 4,000 characters, which includes the XML and JSON structure for the settings.\n\n### Grouping Custom User Settings ###\n\nYou can group custom user settings when adding them. Grouping allows you to retrieve settings that are in a specific group, instead of retrieving all the user custom settings.\n\nTo group custom user settings, add the following information in the header, after Content-Type:\n\n`X-DocuSign-User-Settings-Key:group_name`\n\nWhere the `group_name` is your designated name for the group of customer user settings. Grouping is shown in the Example Request Body below.\n\nWhen getting or deleting grouped custom user settings, you must include the extra header information.\n\nGrouping custom user settings is not required and if the extra header information is not included, the custom user settings are added normally and can be retrieved or deleted without including the additional header.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param userId                    The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param customSettingsInformation (optional)
     * @return Call<CustomSettingsInformation>
     */

    @PUT("v2/accounts/{accountId}/users/{userId}/custom_settings")
    Call<CustomSettingsInformation> updateCustomSettings(
            @Path("accountId") String accountId, @Path("userId") String userId, @Body CustomSettingsInformation customSettingsInformation
    );


    /**
     * Updates the user profile information for the specified user.
     * Updates the user&#39;s detail information, profile information, privacy settings, and personal information in the user ID card.\n\nYou can also change a user&#39;s name by changing the information in the `userDetails` property. When changing a user&#39;s name, you can either change the information in the `userName` property OR change the information in `firstName`, `middleName`, `lastName, suffixName`, and `title` properties. Changes to `firstName`, `middleName`, `lastName`, `suffixName`, and `title` properties take precedence over changes to the `userName` property.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param userId      The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param userProfile (optional)
     * @return Call<Void>
     */

    @PUT("v2/accounts/{accountId}/users/{userId}/profile")
    Call<Void> updateProfile(
            @Path("accountId") String accountId, @Path("userId") String userId, @Body UserProfile userProfile
    );


    /**
     * Updates the user profile image for a specified user.
     * Updates the user profile image by uploading an image to the user profile.\n\nThe supported image formats are: gif, png, jpeg, and bmp. The file must be less than 200K. For best viewing results, DocuSign recommends that the image is no more than 79 pixels wide and high.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param userId    The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @return Call<Void>
     */

    @PUT("v2/accounts/{accountId}/users/{userId}/profile/image")
    Call<Void> updateProfileImage(
            @Path("accountId") String accountId, @Path("userId") String userId
    );


    /**
     * Updates the user account settings for a specified user.
     * Updates the account settings list and email notification types for the specified user.
     *
     * @param accountId               The external account number (int) or account ID Guid. (required)
     * @param userId                  The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param userSettingsInformation (optional)
     * @return Call<Void>
     */

    @PUT("v2/accounts/{accountId}/users/{userId}/settings")
    Call<Void> updateSettings(
            @Path("accountId") String accountId, @Path("userId") String userId, @Body UserSettingsInformation userSettingsInformation
    );


    /**
     * Updates the user signature for a specified user.
     * Creates, or updates, the signature font and initials for the specified user. When creating a signature, you use this resource to create the signature name and then add the signature and initials images into the signature.\n\n###### Note: This will also create a default signature for the user when one does not exist.\n\nThe userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.\n\nThe `signatureId` parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint. \n\nFor example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.
     *
     * @param accountId               The external account number (int) or account ID Guid. (required)
     * @param signatureId             The ID of the signature being accessed. (required)
     * @param userId                  The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param closeExistingSignature  When set to **true**, closes the current signature. (optional)
     * @param userSignatureDefinition (optional)
     * @return Call<UserSignature>
     */

    @PUT("v2/accounts/{accountId}/users/{userId}/signatures/{signatureId}")
    Call<UserSignature> updateSignature(
            @Path("accountId") String accountId, @Path("signatureId") String signatureId, @Path("userId") String userId, @Query("close_existing_signature") String closeExistingSignature, @Body UserSignatureDefinition userSignatureDefinition
    );


    /**
     * Updates the user signature image or user initials image for the specified user.
     * Updates the user signature image or user initials image for the specified user. The supported image formats for this file are: gif, png, jpeg, and bmp. The file must be less than 200K.\n\nThe userId property specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.\n\nThe `signatureId` parameter accepts a signature ID or a signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that do not properly encode into a URL. If you use the user name, it is likely that the name includes spaces. In that case, URL encode the name before using it in the endpoint. \n\nFor example encode \&quot;Bob Smith\&quot; as \&quot;Bob%20Smith\&quot;.\n
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param imageType   One of **signature_image** or **initials_image**. (required)
     * @param signatureId The ID of the signature being accessed. (required)
     * @param userId      The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @return Call<UserSignature>
     */

    @PUT("v2/accounts/{accountId}/users/{userId}/signatures/{signatureId}/{imageType}")
    Call<UserSignature> updateSignatureImage(
            @Path("accountId") String accountId, @Path("imageType") String imageType, @Path("signatureId") String signatureId, @Path("userId") String userId
    );


    /**
     * Updates the specified user information.
     *
     * @param accountId       The external account number (int) or account ID Guid. (required)
     * @param userId          The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
     * @param userInformation (optional)
     * @return Call<UserInformation>
     */

    @PUT("v2/accounts/{accountId}/users/{userId}")
    Call<UserInformation> updateUser(
            @Path("accountId") String accountId, @Path("userId") String userId, @Body UserInformation userInformation
    );


    /**
     * Change one or more user in the specified account.
     *
     * @param accountId           The external account number (int) or account ID Guid. (required)
     * @param userInformationList (optional)
     * @return Call<UserInformationList>
     */

    @PUT("v2/accounts/{accountId}/users")
    Call<UserInformationList> updateUsers(
            @Path("accountId") String accountId, @Body UserInformationList userInformationList
    );


}
