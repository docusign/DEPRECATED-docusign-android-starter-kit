package com.docusign.esign.api;

import com.docusign.esign.model.Attachment;
import com.docusign.esign.model.ChunkedUploadRequest;
import com.docusign.esign.model.ChunkedUploadResponse;
import com.docusign.esign.model.ConsoleViewRequest;
import com.docusign.esign.model.ConsumerDisclosure;
import com.docusign.esign.model.CorrectViewRequest;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.CustomFieldsEnvelope;
import com.docusign.esign.model.DocumentFieldsInformation;
import com.docusign.esign.model.DocumentTemplateList;
import com.docusign.esign.model.DocumentVisibilityList;
import com.docusign.esign.model.EmailSettings;
import com.docusign.esign.model.Envelope;
import com.docusign.esign.model.EnvelopeAttachmentsRequest;
import com.docusign.esign.model.EnvelopeAttachmentsResult;
import com.docusign.esign.model.EnvelopeAuditEventResponse;
import com.docusign.esign.model.EnvelopeDefinition;
import com.docusign.esign.model.EnvelopeDocumentsResult;
import com.docusign.esign.model.EnvelopeFormData;
import com.docusign.esign.model.EnvelopeIdsRequest;
import com.docusign.esign.model.EnvelopeNotificationRequest;
import com.docusign.esign.model.EnvelopeSummary;
import com.docusign.esign.model.EnvelopeUpdateSummary;
import com.docusign.esign.model.EnvelopesInformation;
import com.docusign.esign.model.LockInformation;
import com.docusign.esign.model.LockRequest;
import com.docusign.esign.model.Notification;
import com.docusign.esign.model.PageRequest;
import com.docusign.esign.model.RecipientViewRequest;
import com.docusign.esign.model.Recipients;
import com.docusign.esign.model.RecipientsUpdateSummary;
import com.docusign.esign.model.ReturnUrlRequest;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.TemplateDocumentVisibilityList;
import com.docusign.esign.model.TemplateInformation;
import com.docusign.esign.model.UserSignature;
import com.docusign.esign.model.ViewLinkRequest;
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

public interface EnvelopesApi {

    /**
     * Adds templates to an envelope.
     * Adds templates to the specified envelope.
     *
     * @param accountId            The external account number (int) or account ID Guid. (required)
     * @param envelopeId           The envelopeId Guid of the envelope being accessed. (required)
     * @param documentTemplateList (optional)
     * @return Call<DocumentTemplateList>
     */

    @POST("v2/accounts/{accountId}/envelopes/{envelopeId}/templates")
    Call<DocumentTemplateList> applyTemplate(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body DocumentTemplateList documentTemplateList
    );


    /**
     * Adds templates to a document in an  envelope.
     * Adds templates to a document in the specified envelope.
     *
     * @param accountId            The external account number (int) or account ID Guid. (required)
     * @param documentId           The ID of the document being accessed. (required)
     * @param envelopeId           The envelopeId Guid of the envelope being accessed. (required)
     * @param documentTemplateList (optional)
     * @return Call<DocumentTemplateList>
     */

    @POST("v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates")
    Call<DocumentTemplateList> applyTemplateToDocument(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("envelopeId") String envelopeId, @Body DocumentTemplateList documentTemplateList
    );


    /**
     * Initiate a new ChunkedUpload.
     *
     * @param accountId            The external account number (int) or account ID Guid. (required)
     * @param chunkedUploadRequest (optional)
     * @return Call<ChunkedUploadResponse>
     */

    @POST("v2/accounts/{accountId}/chunked_uploads")
    Call<ChunkedUploadResponse> createChunkedUpload(
            @Path("accountId") String accountId, @Body ChunkedUploadRequest chunkedUploadRequest
    );


    /**
     * Returns a URL to the authentication view UI.
     * Returns a URL that allows you to embed the authentication view of the DocuSign UI in your applications.
     *
     * @param accountId          The external account number (int) or account ID Guid. (required)
     * @param consoleViewRequest (optional)
     * @return Call<ViewUrl>
     */

    @POST("v2/accounts/{accountId}/views/console")
    Call<ViewUrl> createConsoleView(
            @Path("accountId") String accountId, @Body ConsoleViewRequest consoleViewRequest
    );


    /**
     * Returns a URL to the envelope correction UI.
     * Returns a URL that allows you to embed the envelope correction view of the DocuSign UI in your applications.\n\nImportant: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView.
     *
     * @param accountId          The external account number (int) or account ID Guid. (required)
     * @param envelopeId         The envelopeId Guid of the envelope being accessed. (required)
     * @param correctViewRequest (optional)
     * @return Call<ViewUrl>
     */

    @POST("v2/accounts/{accountId}/envelopes/{envelopeId}/views/correct")
    Call<ViewUrl> createCorrectView(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body CorrectViewRequest correctViewRequest
    );


    /**
     * Updates envelope custom fields for an envelope.
     * Updates the envelope custom fields for draft and in-process envelopes.\n\nEach custom field used in an envelope must have a unique name.
     *
     * @param accountId    The external account number (int) or account ID Guid. (required)
     * @param envelopeId   The envelopeId Guid of the envelope being accessed. (required)
     * @param customFields (optional)
     * @return Call<CustomFields>
     */

    @POST("v2/accounts/{accountId}/envelopes/{envelopeId}/custom_fields")
    Call<CustomFields> createCustomFields(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body CustomFields customFields
    );


    /**
     * Creates custom document fields in an existing envelope document.
     * Creates custom document fields in an existing envelope document.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param documentId                The ID of the document being accessed. (required)
     * @param envelopeId                The envelopeId Guid of the envelope being accessed. (required)
     * @param documentFieldsInformation (optional)
     * @return Call<DocumentFieldsInformation>
     */

    @POST("v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields")
    Call<DocumentFieldsInformation> createDocumentFields(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("envelopeId") String envelopeId, @Body DocumentFieldsInformation documentFieldsInformation
    );


    /**
     * Returns a URL to the edit view UI.
     * Returns a URL that allows you to embed the edit view of the DocuSign UI in your applications. This is a one-time use login token that allows the user to be placed into the DocuSign editing view. \n\nUpon sending completion, the user is returned to the return URL provided by the API application.\n\nImportant: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView.
     *
     * @param accountId        The external account number (int) or account ID Guid. (required)
     * @param envelopeId       The envelopeId Guid of the envelope being accessed. (required)
     * @param returnUrlRequest (optional)
     * @return Call<ViewUrl>
     */

    @POST("v2/accounts/{accountId}/envelopes/{envelopeId}/views/edit")
    Call<ViewUrl> createEditView(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body ReturnUrlRequest returnUrlRequest
    );


    /**
     * Adds email setting overrides to an envelope.
     * Adds email override settings, changing the email address to reply to an email address, name, or the BCC for email archive information, for the envelope. Note that adding email settings will only affect email communications that occur after the addition was made.\n\n### Important: The BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, use a Carbon Copies or Certified Deliveries Recipient Type.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param envelopeId    The envelopeId Guid of the envelope being accessed. (required)
     * @param emailSettings (optional)
     * @return Call<EmailSettings>
     */

    @POST("v2/accounts/{accountId}/envelopes/{envelopeId}/email_settings")
    Call<EmailSettings> createEmailSettings(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body EmailSettings emailSettings
    );


    /**
     * Creates an envelope.
     * Creates an envelope. \n\nUsing this function you can:\n* Create an envelope and send it.\n* Create an envelope from an existing template and send it.\n\nIn either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request\u2019s `status` property to `created` instead of `sent`.\n\n## Sending Envelopes\n\nDocuments can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the `documentBase64` field of the [`document` object](#/definitions/document)\n\n### Recipient Types\nAn [`envelopeDefinition` object](#/definitions/envelopeDefinition) is used as the method\u2019s body. Envelope recipients can be defined in the envelope or in templates. The `envelopeDefinition` object\u2019s `recipients` field is an [`EnvelopeRecipients` resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:\n\nRecipient type | Object definition\n-------------- | -----------------\nagent (can add name and email information for later recipients/signers) | [`agent`](#/definitions/agent)\ncarbon copy (receives a copy of the documents) | [`carbonCopy`](#/definitions/carbonCopy)\ncertified delivery  (receives a copy of the documents and must acknowledge receipt) | [`certifiedDelivery`](#/definitions/certifiedDelivery)\neditor (can change recipients and document fields for later recipients/signers) | [`editor`](#/definitions/editor)\nin-person signer (\u201Chosts\u201D someone who signs in-person) | [`inPersonSigner`](#/definitions/inPersonSigner)\nintermediary (can add name and email information for some later recipients/signers.) | [`intermediary`](#/definitions/intermediary)\nsigner (signs and/or updates document fields) | [`signer`](#/definitions/signer)\n\nAdditional information about the different types of recipients is available from the [`EnvelopeRecipients` resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)\n\n### Tabs\nTabs (also referred to as `tags` and as `fields` in the web sending user interface), can be defined in the `envelopeDefinition`, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).\n\nDefining tabs: the `inPersonSigner`, and `signer` recipient objects include a `tabs` field. It is an [`EnvelopeTabs` resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [`EnvelopeTabs` resource](../../EnvelopeTabs) for more information.\n\n## Using Templates\nEnvelopes use specific people or groups as recipients. Templates can specify a role, eg `account_manager.` When a template is used in an envelope, the roles must be replaced with specific people or groups.\n\nWhen you create an envelope using a `templateId`, the different recipient type objects within the [`EnvelopeRecipients` object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template\u2019s roles via the `roleName` property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.\n\n### Message Lock\nWhen a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field `messageLock` is used to lock the email subject and message.\n\nIf an email subject or message is entered before adding or applying a template with `messageLock` **true**, the email subject and message is overwritten with the locked email subject and message from the template.\n\n## Envelope Status\nThe status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope\u2019s status changes. DocuSign limits polling to once every 15 minutes or less frequently.\n\nWhen a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message. \n\nSee the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.\n\n## Webhook Options\nThe two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client. \n\n### eventNotification Webhooks\nThe Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.\n\n### Connect Webhooks\nConnect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc. \n\nConnect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting \u201CGo to Admin\u201D from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.\n\nConnect is available for some DocuSign account types. Please contact DocuSign Sales for more information.\n\n## Composite Templates\n\nThe Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.\n\nEach Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.\n\n* The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the `compositeTemplateId` to which the document should be added. If `compositeTemplateId` is not specified in the content-disposition, the document is applied based on the `documentId` only. If no document object is specified, the composite template inherits the first document.\n\n* Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.\n\n* Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.\n\nPDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set `transformPdfFields` to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.\n\n* PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.\n\n### Compositing the definitions\nEach Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:\n\n* Templates are overlaid in the order of their Sequence value.\n* If Document is not passed into the Composite Template\u2019s `document` field, the *first* template\u2019s document (based on the template\u2019s Sequence value) is used.\n* Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.\n\nFor example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.\n\n* Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.\n\n* If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.\n\n* Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.\n\nFor example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.\n\n* roleName and tabLabel matching is case sensitive.\n\n* The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.\n\n* You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with \u201C\\*\u201D and then the system matches tabs that start with the label.\n\n* If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)\n\n### Including the Document Content for Composite Templates\nDocument content can be supplied inline, using the `documentBase64` or can be included in a multi-part HTTP message. \nIf a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the `compositeTemplateId` to which the document should be added. Using the `compositeTemplateId` sets which documents are associated with particular composite templates. An example of this usage is:\n\n```\n   --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d\n   Content-Type: application/pdf\n   Content-Disposition: file; filename=\&quot;eula.pdf\&quot;; documentId=1; compositeTemplateId=\&quot;1\&quot;\n   Content-Transfer-Encoding: base64\n```\n\n### PDF Form Field Transformation\nOnly the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text\n\nField Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.\n\nWhen transforming a *PDF Form Digital Signature Field,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\n\nAny other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab\n\nWhen transforming *PDF Form Text Fields,* the following rules are used:\n\nIf the PDF Field Name Contains | Then the DocuSign Tab Will be\n------- | --------\nDocuSignSignHere or eSignSignHere | Signature\nDocuSignSignHereOptional or eSignSignHereOptional | Optional Signature\nDocuSignInitialHere or eSignInitialHere | Initials\nDocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials\nDocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID\nDocuSignCompany or eSignCompany | Company\nDocuSignDateSigned or eSignDateSigned | Date Signed\nDocuSignTitle or eSignTitle | Title\nDocuSignFullName or eSignFullName |  Full Name\nDocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment\n\nAny other PDF Form Text Field will be transformed to a DocuSign data (text) tab.\n\nPDF Form Field Names that include \u201CDocuSignIgnoreTransform\u201D or \u201CeSignIgnoreTransform\u201D will not be transformed.\n\nPDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.\n\n## Template Email Subject Merge Fields\nThis feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.\n\nThe merge fields, based on the recipient\u2019s `roleName`, are added to the `emailSubject` when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.\n\nBoth the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.\n\nIf merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.\n\n* To add a recipient\u2019s name in the subject line add the following text in the `emailSubject` when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_UserName]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,`\n\n* To add a recipient\u2019s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:\n\n   [[&lt;roleName&gt;_Email]]\n\n   Example:\n\n   `\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,`\n\nIn both cases the &lt;roleName&gt; is the recipient\u2019s `roleName` in the template.\n\nFor cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.\n\n## Branding an envelope\nThe following rules are used to determine the `brandId` used in an envelope:\n\n* If a `brandId` is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope.\n* If more than one template is used in an envelope and more than one `brandId` is specified, the first `brandId` specified is used throughout the envelope.\n* In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account\u2019s default signing brand is used.\n* For envelopes that do not meet any of the previous criteria, the account\u2019s default signing brand is used for the envelope.\n\n## BCC Email address feature \nThe BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don\u2019t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.\n\n## Merge Recipient Roles for Draft Envelopes\nWhen an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.\n\nTo prevent this, the query parameter `merge_roles_on_draft` should be added when posting a draft envelope (status=created) with multiple templates. Doing this will merge template roles and remove empty recipients.\n\n###### Note: DocuSign recommends that the `merge_roles_on_draft` query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
     *
     * @param accountId              The external account number (int) or account ID Guid. (required)
     * @param cdseMode               (optional)
     * @param completedDocumentsOnly If set to true then we want to set the sourceEnvelopeId to indicate that this is a\&quot;forward\&quot; envelope action (optional)
     * @param mergeRolesOnDraft      When set to **true**, merges template roles and remove empty recipients when you create an envelope with multiple templates. (optional)
     * @param envelopeDefinition     (optional)
     * @return Call<EnvelopeSummary>
     */

    @POST("v2/accounts/{accountId}/envelopes")
    Call<EnvelopeSummary> createEnvelope(
            @Path("accountId") String accountId, @Query("cdse_mode") String cdseMode, @Query("completed_documents_only") String completedDocumentsOnly, @Query("merge_roles_on_draft") String mergeRolesOnDraft, @Body EnvelopeDefinition envelopeDefinition
    );


    /**
     * Lock an envelope.
     * Locks the specified envelope, and sets the time until the lock expires, to prevent other users or recipients from accessing and changing the envelope.\n\n###### Note: Users must have envelope locking capability enabled to use this function (userSetting `canLockEnvelopes` must be  set to true for the user).
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param lockRequest (optional)
     * @return Call<LockInformation>
     */

    @POST("v2/accounts/{accountId}/envelopes/{envelopeId}/lock")
    Call<LockInformation> createLock(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body LockRequest lockRequest
    );


    /**
     * Adds one or more recipients to an envelope.
     * Adds one or more recipients to an envelope.\n\nFor an in process envelope, one that has been sent and has not been completed or voided, an email is sent to a new recipient when they are reached in the routing order. If the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient, an email is only sent if the optional `resend_envelope` query string is set to **true**.
     *
     * @param accountId      The external account number (int) or account ID Guid. (required)
     * @param envelopeId     The envelopeId Guid of the envelope being accessed. (required)
     * @param resendEnvelope When set to **true**, resends the   envelope if the new recipient&#39;s routing order is before or the same as the envelope\u2019s next recipient. (optional)
     * @param recipients     (optional)
     * @return Call<Recipients>
     */

    @POST("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients")
    Call<Recipients> createRecipient(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Query("resend_envelope") String resendEnvelope, @Body Recipients recipients
    );


    /**
     * Returns a URL to the recipient view UI.
     * Returns a URL that allows you to embed the recipient view of the DocuSign UI in your applications. This call cannot be used to view draft envelopes, since those envelopes have not been sent. \n\nImportant: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. \n\nAn entry is added into the Security Level section of the DocuSign Certificate of Completion that reflects the `securityDomain` and `authenticationMethod` properties used to verify the user identity.
     *
     * @param accountId            The external account number (int) or account ID Guid. (required)
     * @param envelopeId           The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientViewRequest (optional)
     * @return Call<ViewUrl>
     */

    @POST("v2/accounts/{accountId}/envelopes/{envelopeId}/views/recipient")
    Call<ViewUrl> createRecipientView(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body RecipientViewRequest recipientViewRequest
    );


    /**
     * Returns a URL to the sender view UI.
     * Returns a URL that allows you to embed the sender view of the DocuSign UI in your applications. This is a one-time use login token that allows the user to be placed into the DocuSign sending view. \n\nUpon sending completion, the user is returned to the return URL provided by the API application.\n\nImportant: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView.
     *
     * @param accountId        The external account number (int) or account ID Guid. (required)
     * @param envelopeId       The envelopeId Guid of the envelope being accessed. (required)
     * @param returnUrlRequest (optional)
     * @return Call<ViewUrl>
     */

    @POST("v2/accounts/{accountId}/envelopes/{envelopeId}/views/sender")
    Call<ViewUrl> createSenderView(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body ReturnUrlRequest returnUrlRequest
    );


    /**
     * Adds tabs for a recipient.
     * Adds one or more tabs for a recipient.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId The ID of the recipient being accessed. (required)
     * @param tabs        (optional)
     * @return Call<Tabs>
     */

    @POST("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs")
    Call<Tabs> createTabs(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId, @Body Tabs tabs
    );


    /**
     * Reserved: Returns a URL to the secure link view UI.
     * Reserved: Returns a URL that allows you to embed the secure link view of the DocuSign UI in your applications.
     *
     * @param accountId       The external account number (int) or account ID Guid. (required)
     * @param envelopeId      The envelopeId Guid of the envelope being accessed. (required)
     * @param viewLinkRequest (optional)
     * @return Call<ViewUrl>
     */

    @POST("v2/accounts/{accountId}/envelopes/{envelopeId}/views/viewlink")
    Call<ViewUrl> createViewLink(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body ViewLinkRequest viewLinkRequest
    );


    /**
     * Delete one or more attachments from a DRAFT envelope.
     *
     * @param accountId                  The external account number (int) or account ID Guid. (required)
     * @param envelopeId                 The envelopeId Guid of the envelope being accessed. (required)
     * @param envelopeAttachmentsRequest (optional)
     * @return Call<EnvelopeAttachmentsResult>
     */

    @DELETE("v2/accounts/{accountId}/envelopes/{envelopeId}/attachments")
    Call<EnvelopeAttachmentsResult> deleteAttachments(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body EnvelopeAttachmentsRequest envelopeAttachmentsRequest
    );


    /**
     * Delete an existing ChunkedUpload.
     *
     * @param accountId       The external account number (int) or account ID Guid. (required)
     * @param chunkedUploadId (required)
     * @return Call<ChunkedUploadResponse>
     */

    @DELETE("v2/accounts/{accountId}/chunked_uploads/{chunkedUploadId}")
    Call<ChunkedUploadResponse> deleteChunkedUpload(
            @Path("accountId") String accountId, @Path("chunkedUploadId") String chunkedUploadId
    );


    /**
     * Deletes envelope custom fields for draft and in-process envelopes.
     * Deletes envelope custom fields for draft and in-process envelopes.
     *
     * @param accountId    The external account number (int) or account ID Guid. (required)
     * @param envelopeId   The envelopeId Guid of the envelope being accessed. (required)
     * @param customFields (optional)
     * @return Call<CustomFields>
     */

    @DELETE("v2/accounts/{accountId}/envelopes/{envelopeId}/custom_fields")
    Call<CustomFields> deleteCustomFields(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body CustomFields customFields
    );


    /**
     * Deletes custom document fields from an existing envelope document.
     * Deletes custom document fields from an existing envelope document.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param documentId                The ID of the document being accessed. (required)
     * @param envelopeId                The envelopeId Guid of the envelope being accessed. (required)
     * @param documentFieldsInformation (optional)
     * @return Call<DocumentFieldsInformation>
     */

    @DELETE("v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields")
    Call<DocumentFieldsInformation> deleteDocumentFields(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("envelopeId") String envelopeId, @Body DocumentFieldsInformation documentFieldsInformation
    );


    /**
     * Deletes a page from a document in an envelope.
     * Deletes a page from a document in an envelope based on the page number.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param documentId The ID of the document being accessed. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @param pageNumber The page number being accessed. (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}")
    Call<Void> deleteDocumentPage(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("envelopeId") String envelopeId, @Path("pageNumber") String pageNumber
    );


    /**
     * Deletes documents from a draft envelope.
     * Deletes one or more documents from an existing draft envelope.
     *
     * @param accountId          The external account number (int) or account ID Guid. (required)
     * @param envelopeId         The envelopeId Guid of the envelope being accessed. (required)
     * @param envelopeDefinition (optional)
     * @return Call<EnvelopeDocumentsResult>
     */

    @DELETE("v2/accounts/{accountId}/envelopes/{envelopeId}/documents")
    Call<EnvelopeDocumentsResult> deleteDocuments(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body EnvelopeDefinition envelopeDefinition
    );


    /**
     * Deletes the email setting overrides for an envelope.
     * Deletes all existing email override settings for the envelope. If you want to delete an individual email override setting, use the PUT and set the value to an empty string. Note that deleting email settings will only affect email communications that occur after the deletion and the normal account email settings are used for future email communications.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @return Call<EmailSettings>
     */

    @DELETE("v2/accounts/{accountId}/envelopes/{envelopeId}/email_settings")
    Call<EmailSettings> deleteEmailSettings(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId
    );


    /**
     * Deletes an envelope lock.
     * Deletes the lock from the specified envelope. The `X-DocuSign-Edit` header must be included in the request.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @return Call<LockInformation>
     */

    @DELETE("v2/accounts/{accountId}/envelopes/{envelopeId}/lock")
    Call<LockInformation> deleteLock(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId
    );


    /**
     * Deletes a recipient from an envelope.
     * Deletes the specified recipient file from the specified envelope. This cannot be used if the envelope has been sent.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId The ID of the recipient being accessed. (required)
     * @return Call<Recipients>
     */

    @DELETE("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}")
    Call<Recipients> deleteRecipient(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId
    );


    /**
     * Deletes recipients from an envelope.
     * Deletes one or more recipients from a draft or sent envelope. Recipients to be deleted are listed in the request, with the `recipientId` being used as the key for deleting recipients.\n\nIf the envelope is `In Process`, meaning that it has been sent and has not  been completed or voided, recipients that have completed their actions cannot be deleted.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @param recipients (optional)
     * @return Call<Recipients>
     */

    @DELETE("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients")
    Call<Recipients> deleteRecipients(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body Recipients recipients
    );


    /**
     * Deletes the tabs associated with a recipient.
     * Deletes one or more tabs associated with a recipient in a draft envelope.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId The ID of the recipient being accessed. (required)
     * @param tabs        (optional)
     * @return Call<Tabs>
     */

    @DELETE("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs")
    Call<Tabs> deleteTabs(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId, @Body Tabs tabs
    );


    /**
     * Deletes a template from a document in an existing envelope.
     * Deletes the specified template from a document in an existing envelope.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param documentId The ID of the document being accessed. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @param templateId The ID of the template being accessed. (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates/{templateId}")
    Call<Void> deleteTemplatesFromDocument(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("envelopeId") String envelopeId, @Path("templateId") String templateId
    );


    /**
     * Reserved: Expires a secure view link.
     * Reserved: Expires a secure view link
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/envelopes/{envelopeId}/views/viewlink")
    Call<Void> deleteViewLink(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId
    );


    /**
     * Retrieves an attachment from the envelope.
     *
     * @param accountId    The external account number (int) or account ID Guid. (required)
     * @param attachmentId (required)
     * @param envelopeId   The envelopeId Guid of the envelope being accessed. (required)
     * @return Call<Void>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/attachments/{attachmentId}")
    Call<Void> getAttachment(
            @Path("accountId") String accountId, @Path("attachmentId") String attachmentId, @Path("envelopeId") String envelopeId
    );


    /**
     * Returns a list of attachments associated with the specified envelope
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @return Call<EnvelopeAttachmentsResult>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/attachments")
    Call<EnvelopeAttachmentsResult> getAttachments(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId
    );


    /**
     * Retrieves the current metadata of a ChunkedUpload.
     *
     * @param accountId       The external account number (int) or account ID Guid. (required)
     * @param chunkedUploadId (required)
     * @param include         (optional)
     * @return Call<ChunkedUploadResponse>
     */

    @GET("v2/accounts/{accountId}/chunked_uploads/{chunkedUploadId}")
    Call<ChunkedUploadResponse> getChunkedUpload(
            @Path("accountId") String accountId, @Path("chunkedUploadId") String chunkedUploadId, @Query("include") String include
    );


    /**
     * Reserved: Gets the Electronic Record and Signature Disclosure associated with the account.
     * Reserved: Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param langCode    The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to \uFFFDbrowser\uFFFD to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
     * @param recipientId The ID of the recipient being accessed. (required)
     * @param langCode2   (optional)
     * @return Call<ConsumerDisclosure>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/consumer_disclosure/{langCode}")
    Call<ConsumerDisclosure> getConsumerDisclosure(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("langCode") String langCode, @Path("recipientId") String recipientId, @Query("langCode") String langCode2
    );


    /**
     * Gets the Electronic Record and Signature Disclosure associated with the account.
     * Retrieves the Electronic Record and Signature Disclosure, with html formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId The ID of the recipient being accessed. (required)
     * @param langCode    (optional)
     * @return Call<ConsumerDisclosure>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/consumer_disclosure")
    Call<ConsumerDisclosure> getConsumerDisclosureDefault(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId, @Query("langCode") String langCode
    );


    /**
     * Gets a document from an envelope.
     * Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.\n\nYou can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted. \n\nTo retrieve the combined content replace the `{documentId}` parameter in the endpoint with `combined`.\n/accounts/{accountId}/envelopes/{envelopeId}/documents/combined
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param documentId  The ID of the document being accessed. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param certificate When set to **false**, the envelope signing certificate is removed from the download. (optional)
     * @param encoding    (optional)
     * @param encrypt     When set to **true**, the PDF bytes returned in the response are encrypted for all the key managers configured on your DocuSign account. The documents can be decrypted with the KeyManager Decrypt Document API. (optional)
     * @param language    Specifies the language for the Certificate of Completion in the response. The supported languages, with the language value shown in parenthesis, are: Chinese Simplified (zh_CN), , Chinese Traditional (zh_TW), Dutch (nl), English US (en), French (fr), German (de), Italian (it), Japanese (ja), Korean (ko), Portuguese (pt), Portuguese (Brazil) (pt_BR), Russian (ru), Spanish (es).  (optional)
     * @param recipientId (optional)
     * @param showChanges When set to **true**, any changed fields for the returned PDF are highlighted in yellow and optional signatures or initials outlined in red.  (optional)
     * @param watermark   When set to **true**, the account has the watermark feature enabled, and the envelope is not complete, the watermark for the account is added to the PDF documents. This option can remove the watermark.  (optional)
     * @return Call<ResponseBody>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}")
    Call<ResponseBody> getDocument(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("envelopeId") String envelopeId, @Query("certificate") String certificate, @Query("encoding") String encoding, @Query("encrypt") String encrypt, @Query("language") String language, @Query("recipient_id") String recipientId, @Query("show_changes") String showChanges, @Query("watermark") String watermark
    );


    /**
     * Gets a page image from an envelope for display.
     * Retrieves a page image for display from the specified envelope.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param documentId  The ID of the document being accessed. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param pageNumber  The page number being accessed. (required)
     * @param dpi         Sets the dpi for the image. (optional)
     * @param maxHeight   Sets the maximum height for the page image in pixels. The dpi is recalculated based on this setting. (optional)
     * @param maxWidth    Sets the maximum width for the page image in pixels. The dpi is recalculated based on this setting. (optional)
     * @param showChanges (optional)
     * @return Call<ResponseBody>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}/page_image")
    Call<ResponseBody> getDocumentPageImage(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("envelopeId") String envelopeId, @Path("pageNumber") String pageNumber, @Query("dpi") String dpi, @Query("max_height") String maxHeight, @Query("max_width") String maxWidth, @Query("show_changes") String showChanges
    );


    /**
     * Gets the email setting overrides for an envelope.
     * Retrieves the email override settings for the specified envelope.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @return Call<EmailSettings>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/email_settings")
    Call<EmailSettings> getEmailSettings(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId
    );


    /**
     * Gets the status of a envelope.
     * Retrieves the overall status for the specified envelope.
     *
     * @param accountId      The external account number (int) or account ID Guid. (required)
     * @param envelopeId     The envelopeId Guid of the envelope being accessed. (required)
     * @param advancedUpdate When true, envelope information can be added or modified. (optional)
     * @param include        (optional)
     * @return Call<Envelope>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}")
    Call<Envelope> getEnvelope(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Query("advanced_update") String advancedUpdate, @Query("include") String include
    );


    /**
     * Returns envelope form data for an existing envelope.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @return Call<EnvelopeFormData>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/form_data")
    Call<EnvelopeFormData> getFormData(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId
    );


    /**
     * Gets envelope lock information.
     * Retrieves general information about the envelope lock.\n\nIf the call is made by the locked by user and the request has the same integrator key as original, then the `X-DocuSign-Edit` header and additional lock information is included in the response. This allows users to recover a lost editing session token and the `X-DocuSign-Edit` header.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @return Call<LockInformation>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/lock")
    Call<LockInformation> getLock(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId
    );


    /**
     * Gets envelope notification information.
     * Retrieves the envelope notification, reminders and expirations, information for an existing envelope.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @return Call<Notification>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/notification")
    Call<Notification> getNotificationSettings(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId
    );


    /**
     * Returns document visibility for the recipients
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId The ID of the recipient being accessed. (required)
     * @return Call<DocumentVisibilityList>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/document_visibility")
    Call<DocumentVisibilityList> getRecipientDocumentVisibility(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId
    );


    /**
     * Gets the initials image for a user.
     * Retrieves the initials image for the specified user. The image is returned in the same format as it was uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.\n\nThe userId specified in the endpoint must match the authenticated user&#39;s user id and the user must be a member of the account.\n\nThe `signatureIdOrName` paramter accepts signature ID or signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that do not properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint. \n\nFor example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;\n\nOlder envelopes might only contain chromed images. If getting the non-chromed image fails, try getting the chromed image.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param envelopeId    The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId   The ID of the recipient being accessed. (required)
     * @param includeChrome The added line and identifier around the initial image. Note: Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image. (optional)
     * @return Call<ResponseBody>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/initials_image")
    Call<ResponseBody> getRecipientInitialsImage(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId, @Query("include_chrome") String includeChrome
    );


    /**
     * Gets signature information for a signer or sign-in-person recipient.
     * Retrieves signature information for a signer or sign-in-person recipient.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId The ID of the recipient being accessed. (required)
     * @return Call<UserSignature>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/signature")
    Call<UserSignature> getRecipientSignature(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId
    );


    /**
     * Retrieve signature image information for a signer/sign-in-person recipient.
     * Retrieves the specified user signature image. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.\n\nThe userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.\n\nThe `signatureIdOrName` parameter accepts signature ID or signature name. DocuSign recommends you use signature ID (`signatureId`), since some names contain characters that don&#39;t properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint. \n\nFor example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;\n\nOlder envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param envelopeId    The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId   The ID of the recipient being accessed. (required)
     * @param includeChrome When set to **true**, indicates the chromed version of the signature image should be retrieved. (optional)
     * @return Call<ResponseBody>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/signature_image")
    Call<ResponseBody> getRecipientSignatureImage(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId, @Query("include_chrome") String includeChrome
    );


    /**
     * Returns document visibility for the recipients
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param recipientId The ID of the recipient being accessed. (required)
     * @param templateId  The ID of the template being accessed. (required)
     * @return Call<DocumentVisibilityList>
     */

    @GET("v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/document_visibility")
    Call<DocumentVisibilityList> getTemplateRecipientDocumentVisibility(
            @Path("accountId") String accountId, @Path("recipientId") String recipientId, @Path("templateId") String templateId
    );


    /**
     * Gets the envelope audit events for an envelope.
     * Gets the envelope audit events for the specified envelope.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @return Call<EnvelopeAuditEventResponse>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/audit_events")
    Call<EnvelopeAuditEventResponse> listAuditEvents(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId
    );


    /**
     * Gets the custom field information for the specified envelope.
     * Retrieves the custom field information for the specified envelope. You can use these fields in the envelopes for your account to record information about the envelope, help search for envelopes, and track information. The envelope custom fields are shown in the Envelope Settings section when a user is creating an envelope in the DocuSign member console. The envelope custom fields are not seen by the envelope recipients.\n\nThere are two types of envelope custom fields, text, and list. A text custom field lets the sender enter the value for the field. With a list custom field, the sender selects the value of the field from a pre-made list.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @return Call<CustomFieldsEnvelope>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/custom_fields")
    Call<CustomFieldsEnvelope> listCustomFields(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId
    );


    /**
     * Gets the custom document fields from an  existing envelope document.
     * Retrieves the custom document field information from an existing envelope document.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param documentId The ID of the document being accessed. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @return Call<DocumentFieldsInformation>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields")
    Call<DocumentFieldsInformation> listDocumentFields(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("envelopeId") String envelopeId
    );


    /**
     * Gets a list of envelope documents.
     * Retrieves a list of documents associated with the specified envelope.
     *
     * @param accountId       The external account number (int) or account ID Guid. (required)
     * @param envelopeId      The envelopeId Guid of the envelope being accessed. (required)
     * @param includeMetadata (optional)
     * @return Call<EnvelopeDocumentsResult>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/documents")
    Call<EnvelopeDocumentsResult> listDocuments(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Query("include_metadata") String includeMetadata
    );


    /**
     * Gets the status of recipients for an envelope.
     * Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list. \n\nThe `currentRoutingOrder` property of the response contains the `routingOrder` value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param envelopeId                The envelopeId Guid of the envelope being accessed. (required)
     * @param includeAnchorTabLocations When set to **true** and `include_tabs` is set to **true**, all tabs with anchor tab properties are included in the response.  (optional)
     * @param includeExtended           When set to **true**, the extended properties are included in the response.  (optional)
     * @param includeMetadata           (optional)
     * @param includeTabs               When set to **true**, the tab information associated with the recipient is included in the response. (optional)
     * @return Call<Recipients>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients")
    Call<Recipients> listRecipients(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Query("include_anchor_tab_locations") String includeAnchorTabLocations, @Query("include_extended") String includeExtended, @Query("include_metadata") String includeMetadata, @Query("include_tabs") String includeTabs
    );


    /**
     * Gets the envelope status for the specified envelopes.
     * Retrieves the envelope status for the specified envelopes.
     *
     * @param accountId          The external account number (int) or account ID Guid. (required)
     * @param email              (optional)
     * @param fromDate           (optional)
     * @param startPosition      (optional)
     * @param toDate             (optional)
     * @param envelopeIdsRequest (optional)
     * @return Call<EnvelopesInformation>
     */

    @PUT("v2/accounts/{accountId}/envelopes/status")
    Call<EnvelopesInformation> listStatus(
            @Path("accountId") String accountId, @Query("email") String email, @Query("from_date") String fromDate, @Query("start_position") String startPosition, @Query("to_date") String toDate, @Body EnvelopeIdsRequest envelopeIdsRequest
    );


    /**
     * Gets status changes for one or more envelopes.
     * Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.\n\n### Important: Unless you are requesting the status for specific envelopes (using the `envelopeIds` or `transactionIds` properties), you must add a set the `from_date` property in the request.\n\nGetting envelope status using `transactionIds` is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.\n\n### Request Envelope Status Notes ###\n\nThe REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (`from_to_status`) set to `Delivered` &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.\n\nTo avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.\n\nFor example, a request with a status qualifier (from_to_status) of `Delivered` and a status of \&quot;`Created`,`Sent`\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of `Created` or `Sent`, and since an envelope that has been delivered can never have a status of `Created` or `Sent`, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.\n\nClient applications should check that the statuses they are requesting make sense for a given status qualifier.
     *
     * @param accountId             The external account number (int) or account ID Guid. (required)
     * @param acStatus              Specifies the Authoritative Copy Status for the envelopes. The possible values are: Unknown, Original, Transferred, AuthoritativeCopy, AuthoritativeCopyExportPending, AuthoritativeCopyExported, DepositPending, Deposited, DepositedEO, or DepositFailed. (optional)
     * @param block                 (optional)
     * @param count                 (optional)
     * @param customField           This specifies the envelope custom field name and value searched for in the envelope information. The value portion of the query can use partial strings by adding &#39;%&#39; (percent sign) around the custom field query value. \n\nExample 1: If you have an envelope custom field called \&quot;Region\&quot; and you want to search for all envelopes where the value is \&quot;West\&quot; you would use the query: `?custom_field=Region=West`. \n\nExample 2: To search for envelopes where the `ApplicationID` custom field has the value or partial value of \&quot;DocuSign\&quot; in field, the query would be: `?custom_field=ApplicationId=%DocuSign%` This would find envelopes where the custom field value is \&quot;DocuSign for Salesforce\&quot; or \&quot;DocuSign envelope.\&quot; \n (optional)
     * @param email                 (optional)
     * @param envelopeIds           (optional)
     * @param exclude               (optional)
     * @param folderIds             (optional)
     * @param folderTypes           (optional)
     * @param fromDate              The date/time setting that specifies the date/time when the request begins checking for status changes for envelopes in the account.\n\nThis is required unless &#39;envelopeId&#39;s are used. (optional)
     * @param fromToStatus          This is the status type checked for in the `from_date`/`to_date` period. If `changed` is specified, then envelopes that changed status during the period are found. If for example, `created` is specified, then envelopes created during the period are found. Default is `changed`. \n\nPossible values are: Voided, Changed, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut and Processing. (optional)
     * @param include               (optional)
     * @param intersectingFolderIds (optional)
     * @param order                 (optional)
     * @param orderBy               (optional)
     * @param powerformids          (optional)
     * @param searchText            (optional)
     * @param startPosition         (optional)
     * @param status                The list of current statuses to include in the response. By default, all envelopes found are returned. If values are specified, then of the envelopes found, only those with the current status specified are returned in the results. \n\nPossible values are: Voided, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut and Processing. (optional)
     * @param toDate                Optional date/time setting that specifies the date/time when the request stops for status changes for envelopes in the account. If no entry, the system uses the time of the call as the `to_date`.  (optional)
     * @param transactionIds        If included in the query string, this is a comma separated list of envelope `transactionId`s. \n\nIf included in the `request_body`, this is a list of envelope `transactionId`s. \n\n###### Note: `transactionId`s are only valid in the DocuSign system for seven days.\n (optional)
     * @param userFilter            (optional)
     * @param userId                (optional)
     * @param userName              (optional)
     * @return Call<EnvelopesInformation>
     */

    @GET("v2/accounts/{accountId}/envelopes")
    Call<EnvelopesInformation> listStatusChanges(
            @Path("accountId") String accountId, @Query("ac_status") String acStatus, @Query("block") String block, @Query("count") String count, @Query("custom_field") String customField, @Query("email") String email, @Query("envelope_ids") String envelopeIds, @Query("exclude") String exclude, @Query("folder_ids") String folderIds, @Query("folder_types") String folderTypes, @Query("from_date") String fromDate, @Query("from_to_status") String fromToStatus, @Query("include") String include, @Query("intersecting_folder_ids") String intersectingFolderIds, @Query("order") String order, @Query("order_by") String orderBy, @Query("powerformids") String powerformids, @Query("search_text") String searchText, @Query("start_position") String startPosition, @Query("status") String status, @Query("to_date") String toDate, @Query("transaction_ids") String transactionIds, @Query("user_filter") String userFilter, @Query("user_id") String userId, @Query("user_name") String userName
    );


    /**
     * Gets the tabs information for a signer or sign-in-person recipient in an envelope.
     * Retrieves information about the tabs associated with a recipient in a draft envelope.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param envelopeId                The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId               The ID of the recipient being accessed. (required)
     * @param includeAnchorTabLocations When set to **true**, all tabs with anchor tab properties are included in the response.  (optional)
     * @param includeMetadata           (optional)
     * @return Call<Tabs>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs")
    Call<Tabs> listTabs(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId, @Query("include_anchor_tab_locations") String includeAnchorTabLocations, @Query("include_metadata") String includeMetadata
    );


    /**
     * Get List of Templates used in an Envelope
     * This returns a list of the server-side templates, their name and ID, used in an envelope.\n
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @param include    The possible values are:  matching_applied \u2013 This returns template matching information for the template. (optional)
     * @return Call<TemplateInformation>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/templates")
    Call<TemplateInformation> listTemplates(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Query("include") String include
    );


    /**
     * Gets the templates associated with a document in an existing envelope.
     * Retrieves the templates associated with a document in the specified envelope.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param documentId The ID of the document being accessed. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @param include    (optional)
     * @return Call<TemplateInformation>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates")
    Call<TemplateInformation> listTemplatesForDocument(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("envelopeId") String envelopeId, @Query("include") String include
    );


    /**
     * Add an attachment to a DRAFT or IN-PROCESS envelope.
     *
     * @param accountId    The external account number (int) or account ID Guid. (required)
     * @param attachmentId (required)
     * @param envelopeId   The envelopeId Guid of the envelope being accessed. (required)
     * @param attachment   (optional)
     * @return Call<EnvelopeAttachmentsResult>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/attachments/{attachmentId}")
    Call<EnvelopeAttachmentsResult> putAttachment(
            @Path("accountId") String accountId, @Path("attachmentId") String attachmentId, @Path("envelopeId") String envelopeId, @Body Attachment attachment
    );


    /**
     * Add one or more attachments to a DRAFT or IN-PROCESS envelope.
     *
     * @param accountId                  The external account number (int) or account ID Guid. (required)
     * @param envelopeId                 The envelopeId Guid of the envelope being accessed. (required)
     * @param envelopeAttachmentsRequest (optional)
     * @return Call<EnvelopeAttachmentsResult>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/attachments")
    Call<EnvelopeAttachmentsResult> putAttachments(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body EnvelopeAttachmentsRequest envelopeAttachmentsRequest
    );


    /**
     * Rotates page image from an envelope for display.
     * Rotates page image from an envelope for display. The page image can be rotated to the left or right.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param documentId  The ID of the document being accessed. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param pageNumber  The page number being accessed. (required)
     * @param pageRequest (optional)
     * @return Call<Void>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}/page_image")
    Call<Void> rotateDocumentPage(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("envelopeId") String envelopeId, @Path("pageNumber") String pageNumber, @Body PageRequest pageRequest
    );


    /**
     * Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft
     * The Put Envelopes endpoint provides the following functionality:\n\n* Sends the specified single draft envelope.\nAdd {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.\n\n* Voids the specified in-process envelope.\nAdd {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.\n\n* Replaces the current email subject and message for a draft envelope.\nAdd {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.\n\n* Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system.\nAdd {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.\n\n*Additional information on purging documents*\n\nThe purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).\n\n###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period. \n###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents. \n###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.\n\nWhen the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.\n\nIf `purgeState=\&quot;documents_queued\&quot;` is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If `purgeState= \&quot;documents_and_metadata_queued\&quot;` is used in the request, then the documents, attachments, and tabs are deleted.
     *
     * @param accountId      The external account number (int) or account ID Guid. (required)
     * @param envelopeId     The envelopeId Guid of the envelope being accessed. (required)
     * @param advancedUpdate When set to **true**, allows the caller to update recipients, tabs, custom fields, notification, email settings and other envelope attributes. (optional)
     * @param resendEnvelope When set to **true**, sends the specified envelope again. (optional)
     * @param envelope       (optional)
     * @return Call<EnvelopeUpdateSummary>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}")
    Call<EnvelopeUpdateSummary> update(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Query("advanced_update") String advancedUpdate, @Query("resend_envelope") String resendEnvelope, @Body Envelope envelope
    );


    /**
     * Integrity-Check and Commit a ChunkedUpload, readying it for use elsewhere.
     *
     * @param accountId       The external account number (int) or account ID Guid. (required)
     * @param chunkedUploadId (required)
     * @param action          (optional)
     * @return Call<ChunkedUploadResponse>
     */

    @PUT("v2/accounts/{accountId}/chunked_uploads/{chunkedUploadId}")
    Call<ChunkedUploadResponse> updateChunkedUpload(
            @Path("accountId") String accountId, @Path("chunkedUploadId") String chunkedUploadId, @Query("action") String action
    );


    /**
     * Add a chunk, a chunk &#39;part&#39;, to an existing ChunkedUpload.
     *
     * @param accountId            The external account number (int) or account ID Guid. (required)
     * @param chunkedUploadId      (required)
     * @param chunkedUploadPartSeq (required)
     * @param chunkedUploadRequest (optional)
     * @return Call<ChunkedUploadResponse>
     */

    @PUT("v2/accounts/{accountId}/chunked_uploads/{chunkedUploadId}/{chunkedUploadPartSeq}")
    Call<ChunkedUploadResponse> updateChunkedUploadPart(
            @Path("accountId") String accountId, @Path("chunkedUploadId") String chunkedUploadId, @Path("chunkedUploadPartSeq") String chunkedUploadPartSeq, @Body ChunkedUploadRequest chunkedUploadRequest
    );


    /**
     * Updates envelope custom fields in an envelope.
     * Updates the envelope custom fields in draft and in-process envelopes.\n\nEach custom field used in an envelope must have a unique name.\n
     *
     * @param accountId    The external account number (int) or account ID Guid. (required)
     * @param envelopeId   The envelopeId Guid of the envelope being accessed. (required)
     * @param customFields (optional)
     * @return Call<CustomFields>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/custom_fields")
    Call<CustomFields> updateCustomFields(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body CustomFields customFields
    );


    /**
     * Adds a document to an existing draft envelope.
     * Adds a document to an existing draft envelope.
     *
     * @param accountId           The external account number (int) or account ID Guid. (required)
     * @param documentId          The ID of the document being accessed. (required)
     * @param envelopeId          The envelopeId Guid of the envelope being accessed. (required)
     * @param applyDocumentFields (optional)
     * @return Call<Void>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}")
    Call<Void> updateDocument(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("envelopeId") String envelopeId, @Query("apply_document_fields") String applyDocumentFields
    );


    /**
     * Updates existing custom document fields in an existing envelope document.
     * Updates existing custom document fields in an existing envelope document.
     *
     * @param accountId                 The external account number (int) or account ID Guid. (required)
     * @param documentId                The ID of the document being accessed. (required)
     * @param envelopeId                The envelopeId Guid of the envelope being accessed. (required)
     * @param documentFieldsInformation (optional)
     * @return Call<DocumentFieldsInformation>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields")
    Call<DocumentFieldsInformation> updateDocumentFields(
            @Path("accountId") String accountId, @Path("documentId") String documentId, @Path("envelopeId") String envelopeId, @Body DocumentFieldsInformation documentFieldsInformation
    );


    /**
     * Adds one or more documents to an existing envelope document.
     * Adds one or more documents to an existing envelope document.
     *
     * @param accountId           The external account number (int) or account ID Guid. (required)
     * @param envelopeId          The envelopeId Guid of the envelope being accessed. (required)
     * @param applyDocumentFields When true, Document fields can be added or modified while adding or modifying envelope documents. (optional)
     * @param envelopeDefinition  (optional)
     * @return Call<EnvelopeDocumentsResult>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/documents")
    Call<EnvelopeDocumentsResult> updateDocuments(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Query("apply_document_fields") String applyDocumentFields, @Body EnvelopeDefinition envelopeDefinition
    );


    /**
     * Updates the email setting overrides for an envelope.
     * Updates the existing email override settings for the specified envelope. Note that modifying email settings will only affect email communications that occur after the modification was made.\n\nThis can also be used to delete an individual email override setting by using an empty string for the value to be deleted.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param envelopeId    The envelopeId Guid of the envelope being accessed. (required)
     * @param emailSettings (optional)
     * @return Call<EmailSettings>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/email_settings")
    Call<EmailSettings> updateEmailSettings(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body EmailSettings emailSettings
    );


    /**
     * Updates an envelope lock.
     * Updates the lock duration time or update the `lockedByApp` property information for the specified envelope. The user and integrator key must match the user specified by the `lockByUser` property and integrator key information and the `X-DocuSign-Edit` header must be included or an error will be generated.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param lockRequest (optional)
     * @return Call<LockInformation>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/lock")
    Call<LockInformation> updateLock(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body LockRequest lockRequest
    );


    /**
     * Sets envelope notification (Reminders/Expirations) structure for an existing envelope.
     *
     * @param accountId                   The external account number (int) or account ID Guid. (required)
     * @param envelopeId                  The envelopeId Guid of the envelope being accessed. (required)
     * @param envelopeNotificationRequest (optional)
     * @return Call<Notification>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/notification")
    Call<Notification> updateNotificationSettings(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body EnvelopeNotificationRequest envelopeNotificationRequest
    );


    /**
     * Updates document visibility for the recipients
     *
     * @param accountId              The external account number (int) or account ID Guid. (required)
     * @param envelopeId             The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId            The ID of the recipient being accessed. (required)
     * @param documentVisibilityList (optional)
     * @return Call<DocumentVisibilityList>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/document_visibility")
    Call<DocumentVisibilityList> updateRecipientDocumentVisibility(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId, @Body DocumentVisibilityList documentVisibilityList
    );


    /**
     * Sets the initials image for an accountless signer.
     * Updates the initials image for a signer that does not have a DocuSign account. The supported image formats for this file are: gif, png, jpeg, and bmp. The file size must be less than 200K.\n\nFor the Authentication/Authorization for this call, the credentials must match the sender of the envelope, the recipient must be an accountless signer or in person signer. The account must have the `CanSendEnvelope` property set to **true** and the `ExpressSendOnly` property in `SendingUser` structure must be set to **false**.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId The ID of the recipient being accessed. (required)
     * @return Call<Void>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/initials_image")
    Call<Void> updateRecipientInitialsImage(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId
    );


    /**
     * Sets the signature image for an accountless signer.
     * Updates the signature image for an accountless signer. The supported image formats for this file are: gif, png, jpeg, and bmp. The file size must be less than 200K.\n\nFor the Authentication/Authorization for this call, the credentials must match the sender of the envelope, the recipient must be an accountless signer or in person signer. The account must have the `CanSendEnvelope` property set to **true** and the `ExpressSendOnly` property in `SendingUser` structure must be set to **false**.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId The ID of the recipient being accessed. (required)
     * @return Call<Void>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/signature_image")
    Call<Void> updateRecipientSignatureImage(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId
    );


    /**
     * Updates recipients in a draft envelope or corrects recipient information for an in process envelope.
     * Updates recipients in a draft envelope or corrects recipient information for an in process envelope. \n\nFor draft envelopes, you can edit the following properties: `email`, `userName`, `routingOrder`, `faxNumber`, `deliveryMethod`, `accessCode`, and `requireIdLookup`.\n\nOnce an envelope has been sent, you can only edit: `email`, `userName`, `signerName`, `routingOrder`, `faxNumber`, and `deliveryMethod`. You can also select to resend an envelope by using the `resend_envelope` option.\n\nIf you send information for a recipient that does not already exist in a draft envelope, the recipient is added to the envelope (similar to the POST).
     *
     * @param accountId      The external account number (int) or account ID Guid. (required)
     * @param envelopeId     The envelopeId Guid of the envelope being accessed. (required)
     * @param resendEnvelope When set to **true**, resends the   envelope if the new recipient&#39;s routing order is before or the same as the envelope\u2019s next recipient. (optional)
     * @param recipients     (optional)
     * @return Call<RecipientsUpdateSummary>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients")
    Call<RecipientsUpdateSummary> updateRecipients(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Query("resend_envelope") String resendEnvelope, @Body Recipients recipients
    );


    /**
     * Updates document visibility for the recipients
     *
     * @param accountId              The external account number (int) or account ID Guid. (required)
     * @param envelopeId             The envelopeId Guid of the envelope being accessed. (required)
     * @param documentVisibilityList (optional)
     * @return Call<DocumentVisibilityList>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/document_visibility")
    Call<DocumentVisibilityList> updateRecipientsDocumentVisibility(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Body DocumentVisibilityList documentVisibilityList
    );


    /**
     * Updates the tabs for a recipient.\n\n
     * Updates one or more tabs for a recipient in a draft envelope.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId The ID of the recipient being accessed. (required)
     * @param tabs        (optional)
     * @return Call<Tabs>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs")
    Call<Tabs> updateTabs(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId, @Body Tabs tabs
    );


    /**
     * Updates document visibility for the recipients
     *
     * @param accountId                      The external account number (int) or account ID Guid. (required)
     * @param recipientId                    The ID of the recipient being accessed. (required)
     * @param templateId                     The ID of the template being accessed. (required)
     * @param templateDocumentVisibilityList (optional)
     * @return Call<TemplateDocumentVisibilityList>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/document_visibility")
    Call<TemplateDocumentVisibilityList> updateTemplateRecipientDocumentVisibility(
            @Path("accountId") String accountId, @Path("recipientId") String recipientId, @Path("templateId") String templateId, @Body TemplateDocumentVisibilityList templateDocumentVisibilityList
    );


    /**
     * Updates document visibility for the recipients
     *
     * @param accountId                      The external account number (int) or account ID Guid. (required)
     * @param templateId                     The ID of the template being accessed. (required)
     * @param templateDocumentVisibilityList (optional)
     * @return Call<TemplateDocumentVisibilityList>
     */

    @PUT("v2/accounts/{accountId}/templates/{templateId}/recipients/document_visibility")
    Call<TemplateDocumentVisibilityList> updateTemplateRecipientsDocumentVisibility(
            @Path("accountId") String accountId, @Path("templateId") String templateId, @Body TemplateDocumentVisibilityList templateDocumentVisibilityList
    );


}
