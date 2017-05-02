package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeTemplate implements Serializable {

    @SerializedName("allowMarkup")
    private String allowMarkup = null;

    @SerializedName("allowReassign")
    private String allowReassign = null;

    @SerializedName("asynchronous")
    private String asynchronous = null;

    @SerializedName("attachmentsUri")
    private String attachmentsUri = null;

    @SerializedName("authoritativeCopy")
    private String authoritativeCopy = null;

    @SerializedName("autoNavigation")
    private String autoNavigation = null;

    @SerializedName("brandId")
    private String brandId = null;

    @SerializedName("brandLock")
    private String brandLock = null;

    @SerializedName("certificateUri")
    private String certificateUri = null;

    @SerializedName("completedDateTime")
    private String completedDateTime = null;

    @SerializedName("createdDateTime")
    private String createdDateTime = null;

    @SerializedName("customFields")
    private CustomFields customFields = null;

    @SerializedName("customFieldsUri")
    private String customFieldsUri = null;

    @SerializedName("declinedDateTime")
    private String declinedDateTime = null;

    @SerializedName("deletedDateTime")
    private String deletedDateTime = null;

    @SerializedName("deliveredDateTime")
    private String deliveredDateTime = null;

    @SerializedName("documents")
    private java.util.List<Document> documents = new java.util.ArrayList<Document>();

    @SerializedName("documentsCombinedUri")
    private String documentsCombinedUri = null;

    @SerializedName("documentsUri")
    private String documentsUri = null;

    @SerializedName("emailBlurb")
    private String emailBlurb = null;

    @SerializedName("emailSettings")
    private EmailSettings emailSettings = null;

    @SerializedName("emailSubject")
    private String emailSubject = null;

    @SerializedName("enableWetSign")
    private String enableWetSign = null;

    @SerializedName("enforceSignerVisibility")
    private String enforceSignerVisibility = null;

    @SerializedName("envelopeId")
    private String envelopeId = null;

    @SerializedName("envelopeIdStamping")
    private String envelopeIdStamping = null;

    @SerializedName("envelopeTemplateDefinition")
    private EnvelopeTemplateDefinition envelopeTemplateDefinition = null;

    @SerializedName("envelopeUri")
    private String envelopeUri = null;

    @SerializedName("initialSentDateTime")
    private String initialSentDateTime = null;

    @SerializedName("is21CFRPart11")
    private String is21CFRPart11 = null;

    @SerializedName("isSignatureProviderEnvelope")
    private String isSignatureProviderEnvelope = null;

    @SerializedName("lastModifiedDateTime")
    private String lastModifiedDateTime = null;

    @SerializedName("lockInformation")
    private LockInformation lockInformation = null;

    @SerializedName("messageLock")
    private String messageLock = null;

    @SerializedName("notification")
    private Notification notification = null;

    @SerializedName("notificationUri")
    private String notificationUri = null;

    @SerializedName("purgeState")
    private String purgeState = null;

    @SerializedName("recipients")
    private Recipients recipients = null;

    @SerializedName("recipientsLock")
    private String recipientsLock = null;

    @SerializedName("recipientsUri")
    private String recipientsUri = null;

    @SerializedName("sentDateTime")
    private String sentDateTime = null;

    @SerializedName("signingLocation")
    private String signingLocation = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("statusChangedDateTime")
    private String statusChangedDateTime = null;

    @SerializedName("templatesUri")
    private String templatesUri = null;

    @SerializedName("transactionId")
    private String transactionId = null;

    @SerializedName("useDisclosure")
    private String useDisclosure = null;

    @SerializedName("voidedDateTime")
    private String voidedDateTime = null;

    @SerializedName("voidedReason")
    private String voidedReason = null;


    /**
     * When set to **true**, Document Markup is enabled for envelope. Account must have Document Markup enabled to use this
     **/
    @ApiModelProperty(value = "When set to **true**, Document Markup is enabled for envelope. Account must have Document Markup enabled to use this")
    public String getAllowMarkup() {
        return allowMarkup;
    }

    public void setAllowMarkup(String allowMarkup) {
        this.allowMarkup = allowMarkup;
    }


    /**
     * When set to **true**, the recipient can redirect an envelope to a more appropriate recipient.
     **/
    @ApiModelProperty(value = "When set to **true**, the recipient can redirect an envelope to a more appropriate recipient.")
    public String getAllowReassign() {
        return allowReassign;
    }

    public void setAllowReassign(String allowReassign) {
        this.allowReassign = allowReassign;
    }


    /**
     * When set to **true**, the envelope is queued for processing and the value of the `status` property is set to 'Processing'. Additionally, get status calls return 'Processing' until completed.
     **/
    @ApiModelProperty(value = "When set to **true**, the envelope is queued for processing and the value of the `status` property is set to 'Processing'. Additionally, get status calls return 'Processing' until completed.")
    public String getAsynchronous() {
        return asynchronous;
    }

    public void setAsynchronous(String asynchronous) {
        this.asynchronous = asynchronous;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAttachmentsUri() {
        return attachmentsUri;
    }

    public void setAttachmentsUri(String attachmentsUri) {
        this.attachmentsUri = attachmentsUri;
    }


    /**
     * Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.
     **/
    @ApiModelProperty(value = "Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.")
    public String getAuthoritativeCopy() {
        return authoritativeCopy;
    }

    public void setAuthoritativeCopy(String authoritativeCopy) {
        this.authoritativeCopy = authoritativeCopy;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAutoNavigation() {
        return autoNavigation;
    }

    public void setAutoNavigation(String autoNavigation) {
        this.autoNavigation = autoNavigation;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getBrandLock() {
        return brandLock;
    }

    public void setBrandLock(String brandLock) {
        this.brandLock = brandLock;
    }


    /**
     * Retrieves a URI for an endpoint that allows you to easily retrieve certificate information.
     **/
    @ApiModelProperty(value = "Retrieves a URI for an endpoint that allows you to easily retrieve certificate information.")
    public String getCertificateUri() {
        return certificateUri;
    }

    public void setCertificateUri(String certificateUri) {
        this.certificateUri = certificateUri;
    }


    /**
     * Specifies the date and time this item was completed.
     **/
    @ApiModelProperty(value = "Specifies the date and time this item was completed.")
    public String getCompletedDateTime() {
        return completedDateTime;
    }

    public void setCompletedDateTime(String completedDateTime) {
        this.completedDateTime = completedDateTime;
    }


    /**
     * Indicates the date and time the item was created.
     **/
    @ApiModelProperty(value = "Indicates the date and time the item was created.")
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public CustomFields getCustomFields() {
        return customFields;
    }

    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }


    /**
     * Contains a URI for an endpoint that you can use to retrieve the custom fields.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the custom fields.")
    public String getCustomFieldsUri() {
        return customFieldsUri;
    }

    public void setCustomFieldsUri(String customFieldsUri) {
        this.customFieldsUri = customFieldsUri;
    }


    /**
     * The date and time the recipient declined the document.
     **/
    @ApiModelProperty(value = "The date and time the recipient declined the document.")
    public String getDeclinedDateTime() {
        return declinedDateTime;
    }

    public void setDeclinedDateTime(String declinedDateTime) {
        this.declinedDateTime = declinedDateTime;
    }


    /**
     * Specifies the data and time the item was deleted.
     **/
    @ApiModelProperty(value = "Specifies the data and time the item was deleted.")
    public String getDeletedDateTime() {
        return deletedDateTime;
    }

    public void setDeletedDateTime(String deletedDateTime) {
        this.deletedDateTime = deletedDateTime;
    }


    /**
     * Reserved: For DocuSign use only.
     **/
    @ApiModelProperty(value = "Reserved: For DocuSign use only.")
    public String getDeliveredDateTime() {
        return deliveredDateTime;
    }

    public void setDeliveredDateTime(String deliveredDateTime) {
        this.deliveredDateTime = deliveredDateTime;
    }


    /**
     * Complex element contains the details on the documents in the envelope.
     **/
    @ApiModelProperty(value = "Complex element contains the details on the documents in the envelope.")
    public java.util.List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(java.util.List<Document> documents) {
        this.documents = documents;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDocumentsCombinedUri() {
        return documentsCombinedUri;
    }

    public void setDocumentsCombinedUri(String documentsCombinedUri) {
        this.documentsCombinedUri = documentsCombinedUri;
    }


    /**
     * Contains a URI for an endpoint that you can use to retrieve the documents.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the documents.")
    public String getDocumentsUri() {
        return documentsUri;
    }

    public void setDocumentsUri(String documentsUri) {
        this.documentsUri = documentsUri;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEmailBlurb() {
        return emailBlurb;
    }

    public void setEmailBlurb(String emailBlurb) {
        this.emailBlurb = emailBlurb;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public EmailSettings getEmailSettings() {
        return emailSettings;
    }

    public void setEmailSettings(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }


    /**
     * Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.
     **/
    @ApiModelProperty(value = "Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }


    /**
     * When set to **true**, the signer is allowed to print the document and sign it on paper.
     **/
    @ApiModelProperty(value = "When set to **true**, the signer is allowed to print the document and sign it on paper.")
    public String getEnableWetSign() {
        return enableWetSign;
    }

    public void setEnableWetSign(String enableWetSign) {
        this.enableWetSign = enableWetSign;
    }


    /**
     * When set to **true**, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.\n\nYour account must have Document Visibility enabled to use this.
     **/
    @ApiModelProperty(value = "When set to **true**, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.\n\nYour account must have Document Visibility enabled to use this.")
    public String getEnforceSignerVisibility() {
        return enforceSignerVisibility;
    }

    public void setEnforceSignerVisibility(String enforceSignerVisibility) {
        this.enforceSignerVisibility = enforceSignerVisibility;
    }


    /**
     * The envelope ID of the envelope status that failed to post.
     **/
    @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }


    /**
     * When set to **true**, Envelope ID Stamping is enabled.
     **/
    @ApiModelProperty(value = "When set to **true**, Envelope ID Stamping is enabled.")
    public String getEnvelopeIdStamping() {
        return envelopeIdStamping;
    }

    public void setEnvelopeIdStamping(String envelopeIdStamping) {
        this.envelopeIdStamping = envelopeIdStamping;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public EnvelopeTemplateDefinition getEnvelopeTemplateDefinition() {
        return envelopeTemplateDefinition;
    }

    public void setEnvelopeTemplateDefinition(EnvelopeTemplateDefinition envelopeTemplateDefinition) {
        this.envelopeTemplateDefinition = envelopeTemplateDefinition;
    }


    /**
     * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
    public String getEnvelopeUri() {
        return envelopeUri;
    }

    public void setEnvelopeUri(String envelopeUri) {
        this.envelopeUri = envelopeUri;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getInitialSentDateTime() {
        return initialSentDateTime;
    }

    public void setInitialSentDateTime(String initialSentDateTime) {
        this.initialSentDateTime = initialSentDateTime;
    }


    /**
     * When set to **true**, indicates that this module is enabled on the account.
     **/
    @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
    public String getIs21CFRPart11() {
        return is21CFRPart11;
    }

    public void setIs21CFRPart11(String is21CFRPart11) {
        this.is21CFRPart11 = is21CFRPart11;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsSignatureProviderEnvelope() {
        return isSignatureProviderEnvelope;
    }

    public void setIsSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
        this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
    }


    /**
     * The date and time the item was last modified.
     **/
    @ApiModelProperty(value = "The date and time the item was last modified.")
    public String getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(String lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public LockInformation getLockInformation() {
        return lockInformation;
    }

    public void setLockInformation(LockInformation lockInformation) {
        this.lockInformation = lockInformation;
    }


    /**
     * When set to **true**, prevents senders from changing the contents of `emailBlurb` and `emailSubject` properties for the envelope. \n\nAdditionally, this prevents users from making changes to the contents of `emailBlurb` and `emailSubject` properties when correcting envelopes. \n\nHowever, if the `messageLock` node is set to true**** and the `emailSubject` property is empty, senders and correctors are able to add a subject to the envelope.
     **/
    @ApiModelProperty(value = "When set to **true**, prevents senders from changing the contents of `emailBlurb` and `emailSubject` properties for the envelope. \n\nAdditionally, this prevents users from making changes to the contents of `emailBlurb` and `emailSubject` properties when correcting envelopes. \n\nHowever, if the `messageLock` node is set to true**** and the `emailSubject` property is empty, senders and correctors are able to add a subject to the envelope.")
    public String getMessageLock() {
        return messageLock;
    }

    public void setMessageLock(String messageLock) {
        this.messageLock = messageLock;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }


    /**
     * Contains a URI for an endpoint that you can use to retrieve the notifications.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the notifications.")
    public String getNotificationUri() {
        return notificationUri;
    }

    public void setNotificationUri(String notificationUri) {
        this.notificationUri = notificationUri;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPurgeState() {
        return purgeState;
    }

    public void setPurgeState(String purgeState) {
        this.purgeState = purgeState;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Recipients getRecipients() {
        return recipients;
    }

    public void setRecipients(Recipients recipients) {
        this.recipients = recipients;
    }


    /**
     * When set to **true**, prevents senders from changing, correcting, or deleting the recipient information for the envelope.
     **/
    @ApiModelProperty(value = "When set to **true**, prevents senders from changing, correcting, or deleting the recipient information for the envelope.")
    public String getRecipientsLock() {
        return recipientsLock;
    }

    public void setRecipientsLock(String recipientsLock) {
        this.recipientsLock = recipientsLock;
    }


    /**
     * Contains a URI for an endpoint that you can use to retrieve the recipients.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the recipients.")
    public String getRecipientsUri() {
        return recipientsUri;
    }

    public void setRecipientsUri(String recipientsUri) {
        this.recipientsUri = recipientsUri;
    }


    /**
     * The date and time the envelope was sent.
     **/
    @ApiModelProperty(value = "The date and time the envelope was sent.")
    public String getSentDateTime() {
        return sentDateTime;
    }

    public void setSentDateTime(String sentDateTime) {
        this.sentDateTime = sentDateTime;
    }


    /**
     * Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.
     **/
    @ApiModelProperty(value = "Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.")
    public String getSigningLocation() {
        return signingLocation;
    }

    public void setSigningLocation(String signingLocation) {
        this.signingLocation = signingLocation;
    }


    /**
     * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
     **/
    @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * The data and time the status changed.
     **/
    @ApiModelProperty(value = "The data and time the status changed.")
    public String getStatusChangedDateTime() {
        return statusChangedDateTime;
    }

    public void setStatusChangedDateTime(String statusChangedDateTime) {
        this.statusChangedDateTime = statusChangedDateTime;
    }


    /**
     * Contains a URI for an endpoint which you can use to retrieve the templates.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint which you can use to retrieve the templates.")
    public String getTemplatesUri() {
        return templatesUri;
    }

    public void setTemplatesUri(String templatesUri) {
        this.templatesUri = templatesUri;
    }


    /**
     * Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.
     **/
    @ApiModelProperty(value = " Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * When set to **true**, the disclosure is shown to recipients in accordance with the account\u2019s Electronic Record and Signature Disclosure frequency setting. When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients. \n\nIf the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not returned in responses when getting envelope information.
     **/
    @ApiModelProperty(value = "When set to **true**, the disclosure is shown to recipients in accordance with the account\u2019s Electronic Record and Signature Disclosure frequency setting. When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients. \n\nIf the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not returned in responses when getting envelope information.")
    public String getUseDisclosure() {
        return useDisclosure;
    }

    public void setUseDisclosure(String useDisclosure) {
        this.useDisclosure = useDisclosure;
    }


    /**
     * The date and time the envelope or template was voided.
     **/
    @ApiModelProperty(value = "The date and time the envelope or template was voided.")
    public String getVoidedDateTime() {
        return voidedDateTime;
    }

    public void setVoidedDateTime(String voidedDateTime) {
        this.voidedDateTime = voidedDateTime;
    }


    /**
     * The reason the envelope or template was voided.
     **/
    @ApiModelProperty(value = "The reason the envelope or template was voided.")
    public String getVoidedReason() {
        return voidedReason;
    }

    public void setVoidedReason(String voidedReason) {
        this.voidedReason = voidedReason;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeTemplate envelopeTemplate = (EnvelopeTemplate) o;
        return Objects.equals(allowMarkup, envelopeTemplate.allowMarkup) &&
                Objects.equals(allowReassign, envelopeTemplate.allowReassign) &&
                Objects.equals(asynchronous, envelopeTemplate.asynchronous) &&
                Objects.equals(attachmentsUri, envelopeTemplate.attachmentsUri) &&
                Objects.equals(authoritativeCopy, envelopeTemplate.authoritativeCopy) &&
                Objects.equals(autoNavigation, envelopeTemplate.autoNavigation) &&
                Objects.equals(brandId, envelopeTemplate.brandId) &&
                Objects.equals(brandLock, envelopeTemplate.brandLock) &&
                Objects.equals(certificateUri, envelopeTemplate.certificateUri) &&
                Objects.equals(completedDateTime, envelopeTemplate.completedDateTime) &&
                Objects.equals(createdDateTime, envelopeTemplate.createdDateTime) &&
                Objects.equals(customFields, envelopeTemplate.customFields) &&
                Objects.equals(customFieldsUri, envelopeTemplate.customFieldsUri) &&
                Objects.equals(declinedDateTime, envelopeTemplate.declinedDateTime) &&
                Objects.equals(deletedDateTime, envelopeTemplate.deletedDateTime) &&
                Objects.equals(deliveredDateTime, envelopeTemplate.deliveredDateTime) &&
                Objects.equals(documents, envelopeTemplate.documents) &&
                Objects.equals(documentsCombinedUri, envelopeTemplate.documentsCombinedUri) &&
                Objects.equals(documentsUri, envelopeTemplate.documentsUri) &&
                Objects.equals(emailBlurb, envelopeTemplate.emailBlurb) &&
                Objects.equals(emailSettings, envelopeTemplate.emailSettings) &&
                Objects.equals(emailSubject, envelopeTemplate.emailSubject) &&
                Objects.equals(enableWetSign, envelopeTemplate.enableWetSign) &&
                Objects.equals(enforceSignerVisibility, envelopeTemplate.enforceSignerVisibility) &&
                Objects.equals(envelopeId, envelopeTemplate.envelopeId) &&
                Objects.equals(envelopeIdStamping, envelopeTemplate.envelopeIdStamping) &&
                Objects.equals(envelopeTemplateDefinition, envelopeTemplate.envelopeTemplateDefinition) &&
                Objects.equals(envelopeUri, envelopeTemplate.envelopeUri) &&
                Objects.equals(initialSentDateTime, envelopeTemplate.initialSentDateTime) &&
                Objects.equals(is21CFRPart11, envelopeTemplate.is21CFRPart11) &&
                Objects.equals(isSignatureProviderEnvelope, envelopeTemplate.isSignatureProviderEnvelope) &&
                Objects.equals(lastModifiedDateTime, envelopeTemplate.lastModifiedDateTime) &&
                Objects.equals(lockInformation, envelopeTemplate.lockInformation) &&
                Objects.equals(messageLock, envelopeTemplate.messageLock) &&
                Objects.equals(notification, envelopeTemplate.notification) &&
                Objects.equals(notificationUri, envelopeTemplate.notificationUri) &&
                Objects.equals(purgeState, envelopeTemplate.purgeState) &&
                Objects.equals(recipients, envelopeTemplate.recipients) &&
                Objects.equals(recipientsLock, envelopeTemplate.recipientsLock) &&
                Objects.equals(recipientsUri, envelopeTemplate.recipientsUri) &&
                Objects.equals(sentDateTime, envelopeTemplate.sentDateTime) &&
                Objects.equals(signingLocation, envelopeTemplate.signingLocation) &&
                Objects.equals(status, envelopeTemplate.status) &&
                Objects.equals(statusChangedDateTime, envelopeTemplate.statusChangedDateTime) &&
                Objects.equals(templatesUri, envelopeTemplate.templatesUri) &&
                Objects.equals(transactionId, envelopeTemplate.transactionId) &&
                Objects.equals(useDisclosure, envelopeTemplate.useDisclosure) &&
                Objects.equals(voidedDateTime, envelopeTemplate.voidedDateTime) &&
                Objects.equals(voidedReason, envelopeTemplate.voidedReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowMarkup, allowReassign, asynchronous, attachmentsUri, authoritativeCopy, autoNavigation, brandId, brandLock, certificateUri, completedDateTime, createdDateTime, customFields, customFieldsUri, declinedDateTime, deletedDateTime, deliveredDateTime, documents, documentsCombinedUri, documentsUri, emailBlurb, emailSettings, emailSubject, enableWetSign, enforceSignerVisibility, envelopeId, envelopeIdStamping, envelopeTemplateDefinition, envelopeUri, initialSentDateTime, is21CFRPart11, isSignatureProviderEnvelope, lastModifiedDateTime, lockInformation, messageLock, notification, notificationUri, purgeState, recipients, recipientsLock, recipientsUri, sentDateTime, signingLocation, status, statusChangedDateTime, templatesUri, transactionId, useDisclosure, voidedDateTime, voidedReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeTemplate {\n");

        sb.append("    allowMarkup: ").append(toIndentedString(allowMarkup)).append("\n");
        sb.append("    allowReassign: ").append(toIndentedString(allowReassign)).append("\n");
        sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
        sb.append("    attachmentsUri: ").append(toIndentedString(attachmentsUri)).append("\n");
        sb.append("    authoritativeCopy: ").append(toIndentedString(authoritativeCopy)).append("\n");
        sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
        sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
        sb.append("    brandLock: ").append(toIndentedString(brandLock)).append("\n");
        sb.append("    certificateUri: ").append(toIndentedString(certificateUri)).append("\n");
        sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
        sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    customFieldsUri: ").append(toIndentedString(customFieldsUri)).append("\n");
        sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
        sb.append("    deletedDateTime: ").append(toIndentedString(deletedDateTime)).append("\n");
        sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
        sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
        sb.append("    documentsCombinedUri: ").append(toIndentedString(documentsCombinedUri)).append("\n");
        sb.append("    documentsUri: ").append(toIndentedString(documentsUri)).append("\n");
        sb.append("    emailBlurb: ").append(toIndentedString(emailBlurb)).append("\n");
        sb.append("    emailSettings: ").append(toIndentedString(emailSettings)).append("\n");
        sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
        sb.append("    enableWetSign: ").append(toIndentedString(enableWetSign)).append("\n");
        sb.append("    enforceSignerVisibility: ").append(toIndentedString(enforceSignerVisibility)).append("\n");
        sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
        sb.append("    envelopeIdStamping: ").append(toIndentedString(envelopeIdStamping)).append("\n");
        sb.append("    envelopeTemplateDefinition: ").append(toIndentedString(envelopeTemplateDefinition)).append("\n");
        sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
        sb.append("    initialSentDateTime: ").append(toIndentedString(initialSentDateTime)).append("\n");
        sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
        sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
        sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
        sb.append("    lockInformation: ").append(toIndentedString(lockInformation)).append("\n");
        sb.append("    messageLock: ").append(toIndentedString(messageLock)).append("\n");
        sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
        sb.append("    notificationUri: ").append(toIndentedString(notificationUri)).append("\n");
        sb.append("    purgeState: ").append(toIndentedString(purgeState)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    recipientsLock: ").append(toIndentedString(recipientsLock)).append("\n");
        sb.append("    recipientsUri: ").append(toIndentedString(recipientsUri)).append("\n");
        sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
        sb.append("    signingLocation: ").append(toIndentedString(signingLocation)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusChangedDateTime: ").append(toIndentedString(statusChangedDateTime)).append("\n");
        sb.append("    templatesUri: ").append(toIndentedString(templatesUri)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    useDisclosure: ").append(toIndentedString(useDisclosure)).append("\n");
        sb.append("    voidedDateTime: ").append(toIndentedString(voidedDateTime)).append("\n");
        sb.append("    voidedReason: ").append(toIndentedString(voidedReason)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
