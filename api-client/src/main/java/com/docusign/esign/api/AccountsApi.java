package com.docusign.esign.api;

import com.docusign.esign.model.AccountInformation;
import com.docusign.esign.model.AccountSettingsInformation;
import com.docusign.esign.model.AccountSharedAccess;
import com.docusign.esign.model.AccountSignatureProviders;
import com.docusign.esign.model.BillingChargeResponse;
import com.docusign.esign.model.Brand;
import com.docusign.esign.model.BrandResources;
import com.docusign.esign.model.BrandResourcesList;
import com.docusign.esign.model.BrandsRequest;
import com.docusign.esign.model.BrandsResponse;
import com.docusign.esign.model.CaptiveRecipientInformation;
import com.docusign.esign.model.ConsumerDisclosure;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.ENoteConfiguration;
import com.docusign.esign.model.FileTypeList;
import com.docusign.esign.model.NewAccountDefinition;
import com.docusign.esign.model.NewAccountSummary;
import com.docusign.esign.model.PermissionProfile;
import com.docusign.esign.model.PermissionProfileInformation;
import com.docusign.esign.model.PostTransactionsRequest;
import com.docusign.esign.model.PostTransactionsResponse;
import com.docusign.esign.model.ProvisioningInformation;
import com.docusign.esign.model.RecipientNamesResponse;
import com.docusign.esign.model.TabAccountSettings;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AccountsApi {

    /**
     * Creates new accounts.
     * Creates new DocuSign service accounts.\n\nThis is used to create multiple DocuSign accounts with one call. It uses the same information and formats as the normal a  [Accounts:create](accounts_create) call with the information included within a `newAccountRequests` element. A maximum of 100 new accounts can be created at one time.\n\nNote that the structure of the XML request is slightly different than the JSON request, in that the new account information is included in a `newAccountDefinition` property inside the `newAccountRequests` element.\nResponse\n\nThe response returns the new account ID, password and the default user information for each newly created account.\n\nA 201 code is returned if the call succeeded.  While the call may have succeed, some of the individual account requests may have failed. In the case of failures to create the account,  an `errorDetails` node is added in the response to each specific request that failed.
     *
     * @param previewBillingPlan   When set to **true**, creates the account using a preview billing plan. (optional)
     * @param newAccountDefinition (optional)
     * @return Call<NewAccountSummary>
     */

    @POST("v2/accounts")
    Call<NewAccountSummary> create(
            @Query("preview_billing_plan") String previewBillingPlan, @Body NewAccountDefinition newAccountDefinition
    );


    /**
     * Creates one or more brand profile files for the account.
     * Creates one or more brand profile files for the account. The Account Branding feature (accountSettings properties `canSelfBrandSend` and `canSelfBrandSig`) must be set to **true** for the account to use this call.\n\nAn error is returned if `brandId` property for a brand profile is already set for the account. To upload a new version of an existing brand profile, you must delete the profile and then upload the newer version.\n\nWhen brand profile files are being uploaded, they must be combined into one zip file and the `Content-Type` must be `application/zip`.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param brand     (optional)
     * @return Call<BrandsResponse>
     */

    @POST("v2/accounts/{accountId}/brands")
    Call<BrandsResponse> createBrand(
            @Path("accountId") String accountId, @Body Brand brand
    );


    /**
     * Starts a new eMortgage Transaction
     *
     * @param accountId               The external account number (int) or account ID Guid. (required)
     * @param postTransactionsRequest (optional)
     * @return Call<PostTransactionsResponse>
     */

    @POST("v2/accounts/{accountId}/eMortgage/transactions")
    Call<PostTransactionsResponse> createEMortgageTransaction(
            @Path("accountId") String accountId, @Body PostTransactionsRequest postTransactionsRequest
    );


    /**
     * Creates a new permission profile in the specified account.
     *
     * @param accountId         The external account number (int) or account ID Guid. (required)
     * @param include           (optional)
     * @param permissionProfile (optional)
     * @return Call<PermissionProfile>
     */

    @POST("v2/accounts/{accountId}/permission_profiles")
    Call<PermissionProfile> createPermissionProfile(
            @Path("accountId") String accountId, @Query("include") String include, @Body PermissionProfile permissionProfile
    );


    /**
     * Deletes the specified account.
     * This closes the specified account. You must be an account admin to close your account. Once closed, an account must be reopened by DocuSign.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}")
    Call<Void> delete(
            @Path("accountId") String accountId
    );


    /**
     * Removes a brand.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param brandId   The unique identifier of a brand. (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/brands/{brandId}")
    Call<Void> deleteBrand(
            @Path("accountId") String accountId, @Path("brandId") String brandId
    );


    /**
     * Delete one branding logo.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param brandId   The unique identifier of a brand. (required)
     * @param logoType  One of **Primary**, **Secondary** or **Email**. (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/brands/{brandId}/logos/{logoType}")
    Call<Void> deleteBrandLogoByType(
            @Path("accountId") String accountId, @Path("brandId") String brandId, @Path("logoType") String logoType
    );


    /**
     * Deletes one or more brand profiles.
     * Deletes one or more brand profiles from an account. The Account Branding feature (accountSettings properties `canSelfBrandSend` and `canSelfBrandSend`) must be set to **true** to use this call.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param brandsRequest (optional)
     * @return Call<BrandsResponse>
     */

    @DELETE("v2/accounts/{accountId}/brands")
    Call<BrandsResponse> deleteBrands(
            @Path("accountId") String accountId, @Body BrandsRequest brandsRequest
    );


    /**
     * Deletes the signature for one or more captive recipient records.
     * Deletes the signature for one or more captive recipient records; it is primarily used for testing. This provides a way to reset the signature associated with a client user ID so that a new signature can be created the next time the client user ID is used.
     *
     * @param accountId                   The external account number (int) or account ID Guid. (required)
     * @param recipientPart               (required)
     * @param captiveRecipientInformation (optional)
     * @return Call<CaptiveRecipientInformation>
     */

    @DELETE("v2/accounts/{accountId}/captive_recipients/{recipientPart}")
    Call<CaptiveRecipientInformation> deleteCaptiveRecipient(
            @Path("accountId") String accountId, @Path("recipientPart") String recipientPart, @Body CaptiveRecipientInformation captiveRecipientInformation
    );


    /**
     * Deletes configuration information for the eNote eOriginal integration.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/settings/enote_configuration")
    Call<Void> deleteENoteConfiguration(
            @Path("accountId") String accountId
    );


    /**
     * Deletes a permissions profile within the specified account.
     *
     * @param accountId           The external account number (int) or account ID Guid. (required)
     * @param permissionProfileId (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/permission_profiles/{permissionProfileId}")
    Call<Void> deletePermissionProfile(
            @Path("accountId") String accountId, @Path("permissionProfileId") String permissionProfileId
    );


    /**
     * Retrieves the account information for the specified account.
     * Retrieves the account information for the specified account.\n\n**Response**\nThe `canUpgrade` property contains is a Boolean that indicates whether the account can be upgraded through the API.
     *
     * @param accountId              The external account number (int) or account ID Guid. (required)
     * @param includeAccountSettings When set to **true**, includes the account settings for the account in the response. (optional)
     * @return Call<AccountInformation>
     */

    @GET("v2/accounts/{accountId}")
    Call<AccountInformation> getAccountInformation(
            @Path("accountId") String accountId, @Query("include_account_settings") String includeAccountSettings
    );


    /**
     * Returns tab settings list for specified account
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @return Call<TabAccountSettings>
     */

    @GET("v2/accounts/{accountId}/settings/tabs")
    Call<TabAccountSettings> getAccountTabSettings(
            @Path("accountId") String accountId
    );


    /**
     * Gets list of recurring and usage charges for the account.
     * Retrieves the list of recurring and usage charges for the account. This can be used to determine the charge structure and usage of charge plan items. \n\nPrivileges required: account administrator
     *
     * @param accountId      The external account number (int) or account ID Guid. (required)
     * @param includeCharges Specifies which billing charges to return.\nValid values are:\n\n* envelopes\n* seats\n (optional)
     * @return Call<BillingChargeResponse>
     */

    @GET("v2/accounts/{accountId}/billing_charges")
    Call<BillingChargeResponse> getBillingCharges(
            @Path("accountId") String accountId, @Query("include_charges") String includeCharges
    );


    /**
     * Get information for a specific brand.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param brandId                   The unique identifier of a brand. (required)
     * @param includeExternalReferences (optional)
     * @param includeLogos              (optional)
     * @return Call<Brand>
     */

    @GET("v2/accounts/{accountId}/brands/{brandId}")
    Call<Brand> getBrand(
            @Path("accountId") String accountId, @Path("brandId") String brandId, @Query("include_external_references") String includeExternalReferences, @Query("include_logos") String includeLogos
    );


    /**
     * Obtains the specified image for a brand.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param brandId   The unique identifier of a brand. (required)
     * @param logoType  One of **Primary**, **Secondary** or **Email**. (required)
     * @return Call<Void>
     */

    @GET("v2/accounts/{accountId}/brands/{brandId}/logos/{logoType}")
    Call<Void> getBrandLogoByType(
            @Path("accountId") String accountId, @Path("brandId") String brandId, @Path("logoType") String logoType
    );


    /**
     * Returns the specified account&#39;s list of branding resources (metadata).
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param brandId   The unique identifier of a brand. (required)
     * @return Call<BrandResourcesList>
     */

    @GET("v2/accounts/{accountId}/brands/{brandId}/resources")
    Call<BrandResourcesList> getBrandResources(
            @Path("accountId") String accountId, @Path("brandId") String brandId
    );


    /**
     * Returns the specified branding resource file.
     *
     * @param accountId           The external account number (int) or account ID Guid. (required)
     * @param brandId             The unique identifier of a brand. (required)
     * @param resourceContentType (required)
     * @param langcode            (optional)
     * @param returnMaster        (optional)
     * @return Call<Void>
     */

    @GET("v2/accounts/{accountId}/brands/{brandId}/resources/{resourceContentType}")
    Call<Void> getBrandResourcesByContentType(
            @Path("accountId") String accountId, @Path("brandId") String brandId, @Path("resourceContentType") String resourceContentType, @Query("langcode") String langcode, @Query("return_master") String returnMaster
    );


    /**
     * Gets the Electronic Record and Signature Disclosure.
     * Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, for the requested envelope recipient. This might be different than the current account disclosure depending on account settings, such as branding, and when the account disclosure was last updated. An optional query string can be included to return the language for the disclosure.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param langCode  The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to \uFFFDbrowser\uFFFD to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
     * @return Call<ConsumerDisclosure>
     */

    @GET("v2/accounts/{accountId}/consumer_disclosure/{langCode}")
    Call<ConsumerDisclosure> getConsumerDisclosure(
            @Path("accountId") String accountId, @Path("langCode") String langCode
    );


    /**
     * Gets the Electronic Record and Signature Disclosure for the account.
     * Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param langCode  Specifies the language used in the response. The supported languages, with the language value shown in parenthesis, are: Arabic (ar), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk), and Vietnamese (vi).  Additionally, the value can be set to `browser` to automatically detect the browser language being used by the viewer and display the disclosure in that language.  (optional)
     * @return Call<ConsumerDisclosure>
     */

    @GET("v2/accounts/{accountId}/consumer_disclosure")
    Call<ConsumerDisclosure> getConsumerDisclosureDefault(
            @Path("accountId") String accountId, @Query("langCode") String langCode
    );


    /**
     * Returns the configuration information for the eNote eOriginal integration.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @return Call<ENoteConfiguration>
     */

    @GET("v2/accounts/{accountId}/settings/enote_configuration")
    Call<ENoteConfiguration> getENoteConfiguration(
            @Path("accountId") String accountId
    );


    /**
     * Returns a permissions profile in the specified account.
     *
     * @param accountId           The external account number (int) or account ID Guid. (required)
     * @param permissionProfileId (required)
     * @param include             (optional)
     * @return Call<PermissionProfile>
     */

    @GET("v2/accounts/{accountId}/permission_profiles/{permissionProfileId}")
    Call<PermissionProfile> getPermissionProfile(
            @Path("accountId") String accountId, @Path("permissionProfileId") String permissionProfileId, @Query("include") String include
    );


    /**
     * Retrieves the account provisioning information for the account.
     * Retrieves the account provisioning information for the account.
     *
     * @return Call<ProvisioningInformation>
     */

    @GET("v2/accounts/provisioning")
    Call<ProvisioningInformation> getProvisioning();


    /**
     * Gets a list of brand profiles.
     * Retrieves the list of brand profiles associated with the account and the default brand profiles. The Account Branding feature (accountSettings properties `canSelfBrandSend` and `canSelfBrandSend`)  must be set to **true** for the account to use this call.
     *
     * @param accountId               The external account number (int) or account ID Guid. (required)
     * @param excludeDistributorBrand When set to **true**, excludes distributor brand information from the response set. (optional)
     * @param includeLogos            When set to **true**, returns the logos associated with the brand. (optional)
     * @return Call<BrandsResponse>
     */

    @GET("v2/accounts/{accountId}/brands")
    Call<BrandsResponse> listBrands(
            @Path("accountId") String accountId, @Query("exclude_distributor_brand") String excludeDistributorBrand, @Query("include_logos") String includeLogos
    );


    /**
     * Gets a list of custom fields associated with the account.
     * Retrieves a list of envelope custom fields associated with the account. You can use these fields in the envelopes for your account to record information about the envelope, help search for envelopes and track information. The envelope custom fields are shown in the Envelope Settings section when a user is creating an envelope in the DocuSign member console. The envelope custom fields are not seen by the envelope recipients.\n\nThere are two types of envelope custom fields, text, and list. A text custom field lets the sender enter the value for the field. The list custom field lets the sender select the value of the field from a list you provide.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @return Call<CustomFields>
     */

    @GET("v2/accounts/{accountId}/custom_fields")
    Call<CustomFields> listCustomFields(
            @Path("accountId") String accountId
    );


    /**
     * Gets a list of permission profiles.
     * Retrieves a list of Permission Profiles. Permission Profiles are a standard set of user permissions that you can apply to individual users or users in a Group. This makes it easier to manage user permissions for a large number of users, without having to change permissions on a user-by-user basis.\n\nCurrently, Permission Profiles can only be created and modified in the DocuSign console.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param include   (optional)
     * @return Call<PermissionProfileInformation>
     */

    @GET("v2/accounts/{accountId}/permission_profiles")
    Call<PermissionProfileInformation> listPermissions(
            @Path("accountId") String accountId, @Query("include") String include
    );


    /**
     * Gets recipient names associated with an email address.
     * Retrieves a list of recipients in the specified account that are associated with a email address supplied in the query string.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param email     The email address for the user (optional)
     * @return Call<RecipientNamesResponse>
     */

    @GET("v2/accounts/{accountId}/recipient_names")
    Call<RecipientNamesResponse> listRecipientNamesByEmail(
            @Path("accountId") String accountId, @Query("email") String email
    );


    /**
     * Gets account settings information.
     * Retrieves the account settings information for the specified account.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @return Call<AccountSettingsInformation>
     */

    @GET("v2/accounts/{accountId}/settings")
    Call<AccountSettingsInformation> listSettings(
            @Path("accountId") String accountId
    );


    /**
     * Reserved: Gets the shared item status for one or more users.
     * Reserved: Retrieves shared item status for one or more users and types of items.\n\nUsers with account administration privileges can retrieve shared access information for all account users. Users without account administrator privileges can only retrieve shared access information for themselves and the returned information is limited to the retrieving the status of all members of the account that are sharing their folders to the user. This is equivalent to setting the shared=shared_from.
     *
     * @param accountId                    The external account number (int) or account ID Guid. (required)
     * @param count                        Specifies maximum number of results included in the response. If no value is specified, this defaults to 1000. (optional)
     * @param envelopesNotSharedUserStatus (optional)
     * @param folderIds                    (optional)
     * @param itemType                     Specifies the type of shared item being requested. The accepted values are:\n-envelopes: returns information about envelope sharing between users. (optional)
     * @param searchText                   This can be used to filter user names in the response. The wild-card \u2018*\u2019 (asterisk) can be used around the string. (optional)
     * @param shared                       Specifies which users should be included in the response. Multiple values can be used in the query by using a comma separated list of shared values. If the requestor does not have account administrator privileges, the shared_to value is used. Requestors that do not have account administrator privileges can only use the shared_to, any other setting will result in an error. The accepted values are:\n\n-not_shared: Returns account users that the specified item type is not being shared with and that are not sharing the specified item type with the user.\n\nUser X (Share) X Account user\n\n-shared_to: Returns account users that the specified item type is not being shared with and who are sharing the specified item type with the user (only shared to the user).\n\nUser X (Share) Account user\n\n-shared_from: Returns account users that the specified item type is being shared with and who are not sharing the specified item type with the user (only shared from the user).\n\nUser (Share) &gt;&gt; Account user\n\n-shared_to_and_from: Returns account users that the specified item type is being shared with and who are sharing the specified item type with the user.\n\nUser &lt;&lt; (Share) &gt;&gt; Account user (optional)
     * @param startPosition                If the response set exceeds Count, this can be used to specify that the method should return users starting at the specified index. The first index is 0, and should be used in the first GET call. Typically this number is a multiple of Count. If no value is specified, this defaults to be 0.\n (optional)
     * @param userIds                      A comma separated list of userIds for whom the shared item information is being requested.\n (optional)
     * @return Call<AccountSharedAccess>
     */

    @GET("v2/accounts/{accountId}/shared_access")
    Call<AccountSharedAccess> listSharedAccess(
            @Path("accountId") String accountId, @Query("count") String count, @Query("envelopes_not_shared_user_status") String envelopesNotSharedUserStatus, @Query("folder_ids") String folderIds, @Query("item_type") String itemType, @Query("search_text") String searchText, @Query("shared") String shared, @Query("start_position") String startPosition, @Query("user_ids") String userIds
    );


    /**
     * Returns Account available signature providers for specified account.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @return Call<AccountSignatureProviders>
     */

    @GET("v2/accounts/{accountId}/signatureProviders")
    Call<AccountSignatureProviders> listSignatureProviders(
            @Path("accountId") String accountId
    );


    /**
     * Gets a list of unsupported file types.
     * Retrieves a list of file types (mime-types and file-extensions) that are not supported for upload through the DocuSign system.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @return Call<FileTypeList>
     */

    @GET("v2/accounts/{accountId}/unsupported_file_types")
    Call<FileTypeList> listUnsupportedFileTypes(
            @Path("accountId") String accountId
    );


    /**
     * Modifies tab settings for specified account
     *
     * @param accountId          The external account number (int) or account ID Guid. (required)
     * @param tabAccountSettings (optional)
     * @return Call<TabAccountSettings>
     */

    @PUT("v2/accounts/{accountId}/settings/tabs")
    Call<TabAccountSettings> updateAccountTabSettings(
            @Path("accountId") String accountId, @Body TabAccountSettings tabAccountSettings
    );


    /**
     * Updates an existing brand.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param brandId   The unique identifier of a brand. (required)
     * @param brand     (optional)
     * @return Call<Brand>
     */

    @PUT("v2/accounts/{accountId}/brands/{brandId}")
    Call<Brand> updateBrand(
            @Path("accountId") String accountId, @Path("brandId") String brandId, @Body Brand brand
    );


    /**
     * Put one branding logo.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param brandId   The unique identifier of a brand. (required)
     * @param logoType  One of **Primary**, **Secondary** or **Email**. (required)
     * @return Call<Void>
     */

    @PUT("v2/accounts/{accountId}/brands/{brandId}/logos/{logoType}")
    Call<Void> updateBrandLogoByType(
            @Path("accountId") String accountId, @Path("brandId") String brandId, @Path("logoType") String logoType
    );


    /**
     * Uploads a branding resource file.
     *
     * @param accountId           The external account number (int) or account ID Guid. (required)
     * @param brandId             The unique identifier of a brand. (required)
     * @param resourceContentType (required)
     * @return Call<BrandResources>
     */

    @PUT("v2/accounts/{accountId}/brands/{brandId}/resources/{resourceContentType}")
    Call<BrandResources> updateBrandResourcesByContentType(
            @Path("accountId") String accountId, @Path("brandId") String brandId, @Path("resourceContentType") String resourceContentType
    );


    /**
     * Updates configuration information for the eNote eOriginal integration.
     *
     * @param accountId          The external account number (int) or account ID Guid. (required)
     * @param eNoteConfiguration (optional)
     * @return Call<ENoteConfiguration>
     */

    @PUT("v2/accounts/{accountId}/settings/enote_configuration")
    Call<ENoteConfiguration> updateENoteConfiguration(
            @Path("accountId") String accountId, @Body ENoteConfiguration eNoteConfiguration
    );


    /**
     * Updates a permission profile within the specified account.
     *
     * @param accountId           The external account number (int) or account ID Guid. (required)
     * @param permissionProfileId (required)
     * @param include             (optional)
     * @param permissionProfile   (optional)
     * @return Call<PermissionProfile>
     */

    @PUT("v2/accounts/{accountId}/permission_profiles/{permissionProfileId}")
    Call<PermissionProfile> updatePermissionProfile(
            @Path("accountId") String accountId, @Path("permissionProfileId") String permissionProfileId, @Query("include") String include, @Body PermissionProfile permissionProfile
    );


    /**
     * Updates the account settings for an account.
     * Updates the account settings for the specified account.
     *
     * @param accountId                  The external account number (int) or account ID Guid. (required)
     * @param accountSettingsInformation (optional)
     * @return Call<Void>
     */

    @PUT("v2/accounts/{accountId}/settings")
    Call<Void> updateSettings(
            @Path("accountId") String accountId, @Body AccountSettingsInformation accountSettingsInformation
    );


    /**
     * Reserved: Sets the shared access information for users.
     * Reserved: Sets the shared access information for one or more users.
     *
     * @param accountId           The external account number (int) or account ID Guid. (required)
     * @param itemType            (optional)
     * @param userIds             (optional)
     * @param accountSharedAccess (optional)
     * @return Call<AccountSharedAccess>
     */

    @PUT("v2/accounts/{accountId}/shared_access")
    Call<AccountSharedAccess> updateSharedAccess(
            @Path("accountId") String accountId, @Query("item_type") String itemType, @Query("user_ids") String userIds, @Body AccountSharedAccess accountSharedAccess
    );


}
