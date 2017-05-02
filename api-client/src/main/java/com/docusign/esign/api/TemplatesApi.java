package com.docusign.esign.api;

import com.docusign.esign.model.BulkRecipientsRequest;
import com.docusign.esign.model.BulkRecipientsResponse;
import com.docusign.esign.model.BulkRecipientsSummaryResponse;
import com.docusign.esign.model.BulkRecipientsUpdateResponse;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.DocumentFieldsInformation;
import com.docusign.esign.model.EnvelopeDefinition;
import com.docusign.esign.model.EnvelopeDocument;
import com.docusign.esign.model.EnvelopeTemplate;
import com.docusign.esign.model.EnvelopeTemplateResults;
import com.docusign.esign.model.GroupInformation;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.LockRequest;
import com.docusign.esign.model.Notification;
import com.docusign.esign.model.PageRequest;
import com.docusign.esign.model.Recipients;
import com.docusign.esign.model.RecipientsUpdateSummary;
import com.docusign.esign.model.ReturnUrlRequest;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.TemplateCustomFields;
import com.docusign.esign.model.TemplateDocumentsResult;
import com.docusign.esign.model.TemplateNotificationRequest;
import com.docusign.esign.model.TemplateRecipients;
import com.docusign.esign.model.TemplateSummary;
import com.docusign.esign.model.TemplateTabs;
import com.docusign.esign.model.TemplateUpdateSummary;
import com.docusign.esign.model.ViewUrl;

import okhttp3.ResponseBody;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TemplatesApi {

    /**
     * Creates custom document fields in an existing template document.
     * Creates custom document fields in an existing template document.
     *
     * @param accountId            The external account number (int) or account ID Guid. (required)
     * @param templateId           The ID of the template being accessed. (required)
     * @param templateCustomFields (optional)
     * @return Call<CustomFields>
     */

    @POST("v2/accounts/{accountId}/templates/{templateId}/custom_fields")
    Call<CustomFields> createCustomFields(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Body TemplateCustomFields templateCustomFields
    );


    /**
     * Creates custom document fields in an existing template document.
     * Creates custom document fields in an existing template document.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param documentId                The ID of the document being accessed. (required)
     * @param templateId                The ID of the template being accessed. (required)
     * @param documentFieldsInformation (optional)
     * @return Call<DocumentFieldsInformation>
     */

    @POST("v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields")
    Call<DocumentFieldsInformation> createDocumentFields(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("templateId") String templateId, @Body DocumentFieldsInformation documentFieldsInformation
    );


    /**
     * Provides a URL to start an edit view of the Template UI
     *
     * @param accountId        The external account number (int) or account ID Guid. (required)
     * @param templateId       The ID of the template being accessed. (required)
     * @param returnUrlRequest (optional)
     * @return Call<ViewUrl>
     */

    @POST("v2/accounts/{accountId}/templates/{templateId}/views/edit")
    Call<ViewUrl> createEditView(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Body ReturnUrlRequest returnUrlRequest
    );


    /**
     * Lock a template.
     * Locks the specified template, and sets the time until the lock expires, to prevent other users or recipients from accessing and changing the template.\n\n###### Note: Users must have envelope locking capability enabled to use this function (the userSetting property `canLockEnvelopes` must be set to **true** for the user).
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param templateId  The ID of the template being accessed. (required)
     * @param lockRequest (optional)
     * @return Call<LockInformation>
     */

    @POST("v2/accounts/{accountId}/templates/{templateId}/lock")
    Call<LockInformation> createLock(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Body LockRequest lockRequest
    );


    /**
     * Adds tabs for a recipient.
     * Adds one or more recipients to a template.
     *
     * @param accountId          The external account number (int) or account ID Guid. (required)
     * @param templateId         The ID of the template being accessed. (required)
     * @param resendEnvelope     (optional)
     * @param templateRecipients (optional)
     * @return Call<Recipients>
     */

    @POST("v2/accounts/{accountId}/templates/{templateId}/recipients")
    Call<Recipients> createRecipients(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Query("resend_envelope") String resendEnvelope, @Body TemplateRecipients templateRecipients
    );


    /**
     * Adds tabs for a recipient.
     * Adds one or more tabs for a recipient.
     *
     * @param accountId    The external account number (int) or account ID Guid. (required)
     * @param recipientId  The ID of the recipient being accessed. (required)
     * @param templateId   The ID of the template being accessed. (required)
     * @param templateTabs (optional)
     * @return Call<Tabs>
     */

    @POST("v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs")
    Call<Tabs> createTabs(
            @Path("accountId") String accountId, @Path("recipientId") String recipientId, @Path("templateId") String templateId, @Body TemplateTabs templateTabs
    );


    /**
     * Creates an envelope from a template.
     * Creates a template definition using a multipart request.\n\n###Template Email Subject Merge Fields\n\nCall this endpoint to insert a recipient name and email address merge fields into the email subject line when creating or sending from a template.\n\nThe merge fields, based on the recipient\u2019s role name, are added to the `emailSubject` property when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.\n\nBoth the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.\n###### Note: If merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.\n\nTo add a recipient\u2019s name in the subject line add the following text in the `emailSubject` property when creating the template or when sending an envelope from a template:\n\n[[&lt;roleName&gt;_UserName]]\n\nExample:\n\n`\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,`\n\nTo add a recipient\u2019s email address in the subject line add the following text in the `emailSubject` property when creating the template or when sending an envelope from a template:\n\n[[&lt;roleName&gt;_Email]]\n\nExample:\n\n`\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,`\n\n\nIn both cases the &lt;roleName&gt; is the recipient&#39;s contents of the `roleName` property in the template.\n\nFor cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.
     *
     * @param accountId        The external account number (int) or account ID Guid. (required)
     * @param envelopeTemplate (optional)
     * @return Call<TemplateSummary>
     */

    @POST("v2/accounts/{accountId}/templates")
    Call<TemplateSummary> createTemplate(
            @Path("accountId") String accountId, @Body EnvelopeTemplate envelopeTemplate
    );


    /**
     * Deletes the bulk recipient list on a template.
     * Deletes the bulk recipient list on a template.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param recipientId The ID of the recipient being accessed. (required)
     * @param templateId  The ID of the template being accessed. (required)
     * @return Call<BulkRecipientsUpdateResponse>
     */

    @DELETE("v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/bulk_recipients")
    Call<BulkRecipientsUpdateResponse> deleteBulkRecipients(
            @Path("accountId") String accountId, @Path("recipientId") String recipientId, @Path("templateId") String templateId
    );


    /**
     * Deletes envelope custom fields in a template.
     * Deletes envelope custom fields in a template.
     *
     * @param accountId            The external account number (int) or account ID Guid. (required)
     * @param templateId           The ID of the template being accessed. (required)
     * @param templateCustomFields (optional)
     * @return Call<CustomFields>
     */

    @DELETE("v2/accounts/{accountId}/templates/{templateId}/custom_fields")
    Call<CustomFields> deleteCustomFields(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Body TemplateCustomFields templateCustomFields
    );


    /**
     * Deletes custom document fields from an existing template document.
     * Deletes custom document fields from an existing template document.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param documentId                The ID of the document being accessed. (required)
     * @param templateId                The ID of the template being accessed. (required)
     * @param documentFieldsInformation (optional)
     * @return Call<DocumentFieldsInformation>
     */

    @DELETE("v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields")
    Call<DocumentFieldsInformation> deleteDocumentFields(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("templateId") String templateId, @Body DocumentFieldsInformation documentFieldsInformation
    );


    /**
     * Deletes a page from a document in an template.
     * Deletes a page from a document in a template based on the page number.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param documentId  The ID of the document being accessed. (required)
     * @param pageNumber  The page number being accessed. (required)
     * @param templateId  The ID of the template being accessed. (required)
     * @param pageRequest (optional)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}")
    Call<Void> deleteDocumentPage(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("pageNumber") String pageNumber, @Path("templateId") String templateId, @Body PageRequest pageRequest
    );


    /**
     * Deletes documents from a template.
     * Deletes one or more documents from an existing template.
     *
     * @param accountId          The external account number (int) or account ID Guid. (required)
     * @param templateId         The ID of the template being accessed. (required)
     * @param envelopeDefinition (optional)
     * @return Call<TemplateDocumentsResult>
     */

    @DELETE("v2/accounts/{accountId}/templates/{templateId}/documents")
    Call<TemplateDocumentsResult> deleteDocuments(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Body EnvelopeDefinition envelopeDefinition
    );


    /**
     * Removes a member group&#39;s sharing permissions for a template.
     * Removes a member group&#39;s sharing permissions for a specified template.
     *
     * @param accountId        The external account number (int) or account ID Guid. (required)
     * @param templateId       The ID of the template being accessed. (required)
     * @param templatePart     Currently, the only defined part is **groups**. (required)
     * @param groupInformation (optional)
     * @return Call<GroupInformation>
     */

    @DELETE("v2/accounts/{accountId}/templates/{templateId}/{templatePart}")
    Call<GroupInformation> deleteGroupShare(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Path("templatePart") String templatePart, @Body GroupInformation groupInformation
    );


    /**
     * Deletes a template lock.
     * Deletes the lock from the specified template. The `X-DocuSign-Edit` header must be included in the request.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param templateId  The ID of the template being accessed. (required)
     * @param lockRequest (optional)
     * @return Call<LockInformation>
     */

    @DELETE("v2/accounts/{accountId}/templates/{templateId}/lock")
    Call<LockInformation> deleteLock(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Body LockRequest lockRequest
    );


    /**
     * Deletes the specified recipient file from a template.
     * Deletes the specified recipient file from the specified template.
     *
     * @param accountId          The external account number (int) or account ID Guid. (required)
     * @param recipientId        The ID of the recipient being accessed. (required)
     * @param templateId         The ID of the template being accessed. (required)
     * @param templateRecipients (optional)
     * @return Call<Recipients>
     */

    @DELETE("v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}")
    Call<Recipients> deleteRecipient(
            @Path("accountId") String accountId, @Path("recipientId") String recipientId, @Path("templateId") String templateId, @Body TemplateRecipients templateRecipients
    );


    /**
     * Deletes recipients from a template.
     * Deletes one or more recipients from a template. Recipients to be deleted are listed in the request, with the `recipientId` being used as the key for deleting recipients.
     *
     * @param accountId          The external account number (int) or account ID Guid. (required)
     * @param templateId         The ID of the template being accessed. (required)
     * @param templateRecipients (optional)
     * @return Call<Recipients>
     */

    @DELETE("v2/accounts/{accountId}/templates/{templateId}/recipients")
    Call<Recipients> deleteRecipients(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Body TemplateRecipients templateRecipients
    );


    /**
     * Deletes the tabs associated with a recipient in a template.
     * Deletes one or more tabs associated with a recipient in a template.
     *
     * @param accountId    The external account number (int) or account ID Guid. (required)
     * @param recipientId  The ID of the recipient being accessed. (required)
     * @param templateId   The ID of the template being accessed. (required)
     * @param templateTabs (optional)
     * @return Call<Tabs>
     */

    @DELETE("v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs")
    Call<Tabs> deleteTabs(
            @Path("accountId") String accountId, @Path("recipientId") String recipientId, @Path("templateId") String templateId, @Body TemplateTabs templateTabs
    );


    /**
     * Gets a list of templates for a specified account.
     * Retrieves the definition of the specified template.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param templateId The ID of the template being accessed. (required)
     * @param include    (optional)
     * @return Call<EnvelopeTemplate>
     */

    @GET("v2/accounts/{accountId}/templates/{templateId}")
    Call<EnvelopeTemplate> get(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Query("include") String include
    );


    /**
     * Gets PDF documents from a template.
     * Retrieves one or more PDF documents from the specified template.\n\nYou can specify the ID of the document to retrieve or can specify `combined` to retrieve all documents in the template as one pdf.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param documentId  The ID of the document being accessed. (required)
     * @param templateId  The ID of the template being accessed. (required)
     * @param encrypt     (optional)
     * @param showChanges (optional)
     * @return Call<ResponseBody>
     */

    @GET("v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}")
    Call<ResponseBody> getDocument(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("templateId") String templateId, @Query("encrypt") String encrypt, @Query("show_changes") String showChanges
    );


    /**
     * Gets a page image from a template for display.
     * Retrieves a page image for display from the specified template.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param documentId  The ID of the document being accessed. (required)
     * @param pageNumber  The page number being accessed. (required)
     * @param templateId  The ID of the template being accessed. (required)
     * @param dpi         (optional)
     * @param maxHeight   (optional)
     * @param maxWidth    (optional)
     * @param showChanges (optional)
     * @return Call<ResponseBody>
     */

    @GET("v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}/page_image")
    Call<ResponseBody> getDocumentPageImage(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("pageNumber") String pageNumber, @Path("templateId") String templateId, @Query("dpi") String dpi, @Query("max_height") String maxHeight, @Query("max_width") String maxWidth, @Query("show_changes") String showChanges
    );


    /**
     * Gets template lock information.
     * Retrieves general information about the template lock.\n\nIf the call is made by the user who has the lock and the request has the same integrator key as original, then the `X-DocuSign-Edit` header  field and additional lock information is included in the response. This allows users to recover a lost editing session token and the `X-DocuSign-Edit` header.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param templateId The ID of the template being accessed. (required)
     * @return Call<LockInformation>
     */

    @GET("v2/accounts/{accountId}/templates/{templateId}/lock")
    Call<LockInformation> getLock(
            @Path("accountId") String accountId, @Path("templateId") String templateId
    );


    /**
     * Gets template notification information.
     * Retrieves the envelope notification, reminders and expirations, information for an existing template.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param templateId The ID of the template being accessed. (required)
     * @return Call<Notification>
     */

    @GET("v2/accounts/{accountId}/templates/{templateId}/notification")
    Call<Notification> getNotificationSettings(
            @Path("accountId") String accountId, @Path("templateId") String templateId
    );


    /**
     * Gets the bulk recipient file from a template.
     * Retrieves the bulk recipient file information from a template that has a bulk recipient.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param recipientId   The ID of the recipient being accessed. (required)
     * @param templateId    The ID of the template being accessed. (required)
     * @param includeTabs   (optional)
     * @param startPosition (optional)
     * @return Call<BulkRecipientsResponse>
     */

    @GET("v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/bulk_recipients")
    Call<BulkRecipientsResponse> listBulkRecipients(
            @Path("accountId") String accountId, @Path("recipientId") String recipientId, @Path("templateId") String templateId, @Query("include_tabs") String includeTabs, @Query("start_position") String startPosition
    );


    /**
     * Gets the custom document fields from a template.
     * Retrieves the custom document field information from an existing template.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param templateId The ID of the template being accessed. (required)
     * @return Call<CustomFields>
     */

    @GET("v2/accounts/{accountId}/templates/{templateId}/custom_fields")
    Call<CustomFields> listCustomFields(
            @Path("accountId") String accountId, @Path("templateId") String templateId
    );


    /**
     * Gets the custom document fields for a an existing template document.
     * Retrieves the custom document fields for an existing template document.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param documentId The ID of the document being accessed. (required)
     * @param templateId The ID of the template being accessed. (required)
     * @return Call<DocumentFieldsInformation>
     */

    @GET("v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields")
    Call<DocumentFieldsInformation> listDocumentFields(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("templateId") String templateId
    );


    /**
     * Gets a list of documents associated with a template.
     * Retrieves a list of documents associated with the specified template.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param templateId The ID of the template being accessed. (required)
     * @return Call<TemplateDocumentsResult>
     */

    @GET("v2/accounts/{accountId}/templates/{templateId}/documents")
    Call<TemplateDocumentsResult> listDocuments(
            @Path("accountId") String accountId, @Path("templateId") String templateId
    );


    /**
     * Gets recipient information from a template.
     * Retrieves the information for all recipients in the specified template.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param templateId                The ID of the template being accessed. (required)
     * @param includeAnchorTabLocations When set to **true** and `include_tabs` is set to **true**, all tabs with anchor tab properties are included in the response.  (optional)
     * @param includeExtended           When set to **true**, the extended properties are included in the response.  (optional)
     * @param includeTabs               When set to **true**, the tab information associated with the recipient is included in the response. (optional)
     * @return Call<Recipients>
     */

    @GET("v2/accounts/{accountId}/templates/{templateId}/recipients")
    Call<Recipients> listRecipients(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Query("include_anchor_tab_locations") String includeAnchorTabLocations, @Query("include_extended") String includeExtended, @Query("include_tabs") String includeTabs
    );


    /**
     * Gets the tabs information for a signer or sign-in-person recipient in a template.
     * Gets the tabs information for a signer or sign-in-person recipient in a template.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param recipientId               The ID of the recipient being accessed. (required)
     * @param templateId                The ID of the template being accessed. (required)
     * @param includeAnchorTabLocations When set to **true**, all tabs with anchor tab properties are included in the response.  (optional)
     * @param includeMetadata           (optional)
     * @return Call<Tabs>
     */

    @GET("v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs")
    Call<Tabs> listTabs(
            @Path("accountId") String accountId, @Path("recipientId") String recipientId, @Path("templateId") String templateId, @Query("include_anchor_tab_locations") String includeAnchorTabLocations, @Query("include_metadata") String includeMetadata
    );


    /**
     * Gets the definition of a template.
     * Retrieves the list of templates for the specified account. The request can be limited to a specific folder.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param count         Number of records to return in the cache. (optional)
     * @param folder        The query value can be a folder name or folder ID. The response will only return templates in the specified folder. (optional)
     * @param folderIds     A comma separated list of folder ID GUIDs. (optional)
     * @param fromDate      Start of the search date range. Only returns templates created on or after this date/time. If no value is specified, there is no limit on the earliest date created. (optional)
     * @param include       A comma separated list of additional template attributes to include in the response. Valid values are: recipients, folders, documents, custom_fields, and notifications. (optional)
     * @param order         Sets the direction order used to sort the list. Valid values are: -asc = ascending sort order (a to z)  -desc = descending sort order (z to a) (optional)
     * @param orderBy       Sets the file attribute used to sort the list. Valid values are:  -name: template name  -modified: date/time template was last modified.  -used: date/time the template was last used. (optional)
     * @param searchText    The search text used to search the names of templates. (optional)
     * @param shared        (optional)
     * @param sharedByMe    If true, the response only includes templates shared by the user. If false, the response only returns template not shared by the user. If not specified, the response is not affected. (optional)
     * @param startPosition The starting index for the first template shown in the response. This must be greater than or equal to 0 (zero). (optional)
     * @param toDate        End of the search date range. Only returns templates created up to this date/time. If no value is provided, this defaults to the current date. (optional)
     * @param usedFromDate  Start of the search date range. Only returns templates used or edited on or after this date/time. If no value is specified, there is no limit on the earliest date used. (optional)
     * @param usedToDate    End of the search date range. Only returns templates used or edited up to this date/time. If no value is provided, this defaults to the current date. (optional)
     * @param userFilter    Sets if the templates shown in the response Valid values are:  -owned_by_me: only shows templates the user owns.  -shared_with_me: only shows templates that are shared with the user.  -all: shows all templates owned or shared with the user. (optional)
     * @return Call<EnvelopeTemplateResults>
     */

    @GET("v2/accounts/{accountId}/templates")
    Call<EnvelopeTemplateResults> listTemplates(
            @Path("accountId") String accountId, @Query("count") String count, @Query("folder") String folder, @Query("folder_ids") String folderIds, @Query("from_date") String fromDate, @Query("include") String include, @Query("order") String order, @Query("order_by") String orderBy, @Query("search_text") String searchText, @Query("shared") String shared, @Query("shared_by_me") String sharedByMe, @Query("start_position") String startPosition, @Query("to_date") String toDate, @Query("used_from_date") String usedFromDate, @Query("used_to_date") String usedToDate, @Query("user_filter") String userFilter
    );


    /**
     * Rotates page image from a template for display.
     * Rotates page image from a template for display. The page image can be rotated to the left or right.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param documentId  The ID of the document being accessed. (required)
     * @param pageNumber  The page number being accessed. (required)
     * @param templateId  The ID of the template being accessed. (required)
     * @param pageRequest (optional)
     * @return Call<Void>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/pages/{pageNumber}/page_image")
    Call<Void> rotateDocumentPage(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("pageNumber") String pageNumber, @Path("templateId") String templateId, @Body PageRequest pageRequest
    );


    /**
     * Updates an existing template.
     * Updates an existing template.
     *
     * @param accountId        The external account number (int) or account ID Guid. (required)
     * @param templateId       The ID of the template being accessed. (required)
     * @param envelopeTemplate (optional)
     * @return Call<TemplateUpdateSummary>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}")
    Call<TemplateUpdateSummary> update(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Body EnvelopeTemplate envelopeTemplate
    );


    /**
     * Adds or replaces the bulk recipients list in a template.
     * Updates the bulk recipients in a template using a file upload. The Content-Type supported for uploading a bulk recipient file is CSV (text/csv).\n\nThe REST API does not support modifying individual rows or values in the bulk recipients file. It only allows the entire file to be added or replaced with a new file.
     *
     * @param accountId             The external account number (int) or account ID Guid. (required)
     * @param recipientId           The ID of the recipient being accessed. (required)
     * @param templateId            The ID of the template being accessed. (required)
     * @param bulkRecipientsRequest (optional)
     * @return Call<BulkRecipientsSummaryResponse>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/bulk_recipients")
    Call<BulkRecipientsSummaryResponse> updateBulkRecipients(
            @Path("accountId") String accountId, @Path("recipientId") String recipientId, @Path("templateId") String templateId, @Body BulkRecipientsRequest bulkRecipientsRequest
    );


    /**
     * Updates envelope custom fields in a template.
     * Updates the custom fields in a template.\n\nEach custom field used in a template must have a unique name.
     *
     * @param accountId            The external account number (int) or account ID Guid. (required)
     * @param templateId           The ID of the template being accessed. (required)
     * @param templateCustomFields (optional)
     * @return Call<CustomFields>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}/custom_fields")
    Call<CustomFields> updateCustomFields(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Body TemplateCustomFields templateCustomFields
    );


    /**
     * Adds a document to a template document.
     * Adds the specified document to an existing template document.
     *
     * @param accountId            The external account number (int) or account ID Guid. (required)
     * @param documentId           The ID of the document being accessed. (required)
     * @param templateId           The ID of the template being accessed. (required)
     * @param applyDocumentFields  (optional)
     * @param isEnvelopeDefinition (optional)
     * @param envelopeDefinition   (optional)
     * @return Call<EnvelopeDocument>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}")
    Call<EnvelopeDocument> updateDocument(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("templateId") String templateId, @Query("apply_document_fields") String applyDocumentFields, @Query("is_envelope_definition") String isEnvelopeDefinition, @Body EnvelopeDefinition envelopeDefinition
    );


    /**
     * Updates existing custom document fields in an existing template document.
     * Updates existing custom document fields in an existing template document.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param documentId                The ID of the document being accessed. (required)
     * @param templateId                The ID of the template being accessed. (required)
     * @param documentFieldsInformation (optional)
     * @return Call<DocumentFieldsInformation>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}/documents/{documentId}/fields")
    Call<DocumentFieldsInformation> updateDocumentFields(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("templateId") String templateId, @Body DocumentFieldsInformation documentFieldsInformation
    );


    /**
     * Adds documents to a template document.
     * Adds one or more documents to an existing template document.
     *
     * @param accountId           The external account number (int) or account ID Guid. (required)
     * @param templateId          The ID of the template being accessed. (required)
     * @param applyDocumentFields (optional)
     * @param envelopeDefinition  (optional)
     * @return Call<TemplateDocumentsResult>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}/documents")
    Call<TemplateDocumentsResult> updateDocuments(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Query("apply_document_fields") String applyDocumentFields, @Body EnvelopeDefinition envelopeDefinition
    );


    /**
     * Shares a template with a group
     * Shares a template with the specified members group.
     *
     * @param accountId        The external account number (int) or account ID Guid. (required)
     * @param templateId       The ID of the template being accessed. (required)
     * @param templatePart     Currently, the only defined part is **groups**. (required)
     * @param groupInformation (optional)
     * @return Call<GroupInformation>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}/{templatePart}")
    Call<GroupInformation> updateGroupShare(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Path("templatePart") String templatePart, @Body GroupInformation groupInformation
    );


    /**
     * Updates a template lock.
     * Updates the lock duration time or update the `lockedByApp` property information for the specified template. The user and integrator key must match the user specified by the `lockByUser` property and integrator key information and the `X-DocuSign-Edit` header must be included or an error will be generated.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param templateId  The ID of the template being accessed. (required)
     * @param lockRequest (optional)
     * @return Call<LockInformation>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}/lock")
    Call<LockInformation> updateLock(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Body LockRequest lockRequest
    );


    /**
     * Updates the notification  structure for an existing template.
     * Updates the notification structure for an existing template. Use this endpoint to set reminder and expiration notifications.
     *
     * @param accountId                   The external account number (int) or account ID Guid. (required)
     * @param templateId                  The ID of the template being accessed. (required)
     * @param templateNotificationRequest (optional)
     * @return Call<Notification>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}/notification")
    Call<Notification> updateNotificationSettings(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Body TemplateNotificationRequest templateNotificationRequest
    );


    /**
     * Updates recipients in a template.
     * Updates recipients in a template. \n\nYou can edit the following properties: `email`, `userName`, `routingOrder`, `faxNumber`, `deliveryMethod`, `accessCode`, and `requireIdLookup`.
     *
     * @param accountId          The external account number (int) or account ID Guid. (required)
     * @param templateId         The ID of the template being accessed. (required)
     * @param resendEnvelope     (optional)
     * @param templateRecipients (optional)
     * @return Call<RecipientsUpdateSummary>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}/recipients")
    Call<RecipientsUpdateSummary> updateRecipients(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Query("resend_envelope") String resendEnvelope, @Body TemplateRecipients templateRecipients
    );


    /**
     * Updates the tabs for a recipient.
     * Updates one or more tabs for a recipient in a template.
     *
     * @param accountId    The external account number (int) or account ID Guid. (required)
     * @param recipientId  The ID of the recipient being accessed. (required)
     * @param templateId   The ID of the template being accessed. (required)
     * @param templateTabs (optional)
     * @return Call<Tabs>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/tabs")
    Call<Tabs> updateTabs(
            @Path("accountId") String accountId, @Path("recipientId") String recipientId, @Path("templateId") String templateId, @Body TemplateTabs templateTabs
    );


}
