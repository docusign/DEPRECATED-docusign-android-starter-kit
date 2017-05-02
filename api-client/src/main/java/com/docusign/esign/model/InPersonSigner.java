package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class InPersonSigner implements Serializable {

    @SerializedName("accessCode")
    private String accessCode = null;

    @SerializedName("addAccessCodeToEmail")
    private String addAccessCodeToEmail = null;

    @SerializedName("autoNavigation")
    private String autoNavigation = null;

    @SerializedName("canSignOffline")
    private String canSignOffline = null;

    @SerializedName("clientUserId")
    private String clientUserId = null;

    @SerializedName("customFields")
    private java.util.List<String> customFields = new java.util.ArrayList<String>();

    @SerializedName("declinedDateTime")
    private String declinedDateTime = null;

    @SerializedName("declinedReason")
    private String declinedReason = null;

    @SerializedName("defaultRecipient")
    private String defaultRecipient = null;

    @SerializedName("deliveredDateTime")
    private String deliveredDateTime = null;

    @SerializedName("deliveryMethod")
    private String deliveryMethod = null;

    @SerializedName("documentVisibility")
    private java.util.List<DocumentVisibility> documentVisibility = new java.util.ArrayList<DocumentVisibility>();

    @SerializedName("emailNotification")
    private RecipientEmailNotification emailNotification = null;

    @SerializedName("embeddedRecipientStartURL")
    private String embeddedRecipientStartURL = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("faxNumber")
    private String faxNumber = null;

    @SerializedName("hostEmail")
    private String hostEmail = null;

    @SerializedName("hostName")
    private String hostName = null;

    @SerializedName("idCheckConfigurationName")
    private String idCheckConfigurationName = null;

    @SerializedName("idCheckInformationInput")
    private IdCheckInformationInput idCheckInformationInput = null;

    @SerializedName("inheritEmailNotificationConfiguration")
    private String inheritEmailNotificationConfiguration = null;

    @SerializedName("inPersonSigningType")
    private String inPersonSigningType = null;

    @SerializedName("notaryHost")
    private NotaryHost notaryHost = null;

    @SerializedName("note")
    private String note = null;

    @SerializedName("offlineAttributes")
    private OfflineAttributes offlineAttributes = null;

    @SerializedName("phoneAuthentication")
    private RecipientPhoneAuthentication phoneAuthentication = null;

    @SerializedName("recipientAttachments")
    private java.util.List<RecipientAttachment> recipientAttachments = new java.util.ArrayList<RecipientAttachment>();

    @SerializedName("recipientAuthenticationStatus")
    private AuthenticationStatus recipientAuthenticationStatus = null;

    @SerializedName("recipientId")
    private String recipientId = null;

    @SerializedName("recipientIdGuid")
    private String recipientIdGuid = null;

    @SerializedName("recipientSignatureProviders")
    private java.util.List<RecipientSignatureProvider> recipientSignatureProviders = new java.util.ArrayList<RecipientSignatureProvider>();

    @SerializedName("recipientSuppliesTabs")
    private String recipientSuppliesTabs = null;

    @SerializedName("requireIdLookup")
    private String requireIdLookup = null;

    @SerializedName("requireSignerCertificate")
    private String requireSignerCertificate = null;

    @SerializedName("requireSignOnPaper")
    private String requireSignOnPaper = null;

    @SerializedName("roleName")
    private String roleName = null;

    @SerializedName("routingOrder")
    private String routingOrder = null;

    @SerializedName("samlAuthentication")
    private RecipientSAMLAuthentication samlAuthentication = null;

    @SerializedName("sentDateTime")
    private String sentDateTime = null;

    @SerializedName("signatureInfo")
    private RecipientSignatureInformation signatureInfo = null;

    @SerializedName("signedDateTime")
    private String signedDateTime = null;

    @SerializedName("signerEmail")
    private String signerEmail = null;

    @SerializedName("signerName")
    private String signerName = null;

    @SerializedName("signInEachLocation")
    private String signInEachLocation = null;

    @SerializedName("signingGroupId")
    private String signingGroupId = null;

    @SerializedName("signingGroupName")
    private String signingGroupName = null;

    @SerializedName("signingGroupUsers")
    private java.util.List<UserInfo> signingGroupUsers = new java.util.ArrayList<UserInfo>();

    @SerializedName("smsAuthentication")
    private RecipientSMSAuthentication smsAuthentication = null;

    @SerializedName("socialAuthentications")
    private java.util.List<SocialAuthentication> socialAuthentications = new java.util.ArrayList<SocialAuthentication>();

    @SerializedName("status")
    private String status = null;

    @SerializedName("tabs")
    private Tabs tabs = null;

    @SerializedName("templateLocked")
    private String templateLocked = null;

    @SerializedName("templateRequired")
    private String templateRequired = null;

    @SerializedName("totalTabCount")
    private String totalTabCount = null;

    @SerializedName("userId")
    private String userId = null;


    /**
     * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and it must conform to the account\u2019s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then the access code is not required.
     **/
    @ApiModelProperty(value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and it must conform to the account\u2019s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then the access code is not required.")
    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }


    /**
     * This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.
     **/
    @ApiModelProperty(value = "This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.")
    public String getAddAccessCodeToEmail() {
        return addAccessCodeToEmail;
    }

    public void setAddAccessCodeToEmail(String addAccessCodeToEmail) {
        this.addAccessCodeToEmail = addAccessCodeToEmail;
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
     * When set to **true**, specifies that the signer can perform the signing ceremony offline.
     **/
    @ApiModelProperty(value = "When set to **true**, specifies that the signer can perform the signing ceremony offline.")
    public String getCanSignOffline() {
        return canSignOffline;
    }

    public void setCanSignOffline(String canSignOffline) {
        this.canSignOffline = canSignOffline;
    }


    /**
     * Specifies whether the recipient is embedded or remote. \n\nIf the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng. \n\nMaximum length: 100 characters.
     **/
    @ApiModelProperty(value = "Specifies whether the recipient is embedded or remote. \n\nIf the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng. \n\nMaximum length: 100 characters. ")
    public String getClientUserId() {
        return clientUserId;
    }

    public void setClientUserId(String clientUserId) {
        this.clientUserId = clientUserId;
    }


    /**
     * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.
     **/
    @ApiModelProperty(value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
    public java.util.List<String> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(java.util.List<String> customFields) {
        this.customFields = customFields;
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
     * The reason the recipient declined the document.
     **/
    @ApiModelProperty(value = "The reason the recipient declined the document.")
    public String getDeclinedReason() {
        return declinedReason;
    }

    public void setDeclinedReason(String declinedReason) {
        this.declinedReason = declinedReason;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDefaultRecipient() {
        return defaultRecipient;
    }

    public void setDefaultRecipient(String defaultRecipient) {
        this.defaultRecipient = defaultRecipient;
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
     * Reserved: For DocuSign use only.
     **/
    @ApiModelProperty(value = "Reserved: For DocuSign use only.")
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<DocumentVisibility> getDocumentVisibility() {
        return documentVisibility;
    }

    public void setDocumentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
        this.documentVisibility = documentVisibility;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public RecipientEmailNotification getEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(RecipientEmailNotification emailNotification) {
        this.emailNotification = emailNotification;
    }


    /**
     * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender\u2019s system (the server responding to the URL) must request a recipient token to launch a signing session. \n\nIf set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.\n\nIt is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient\u2019s identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.\n\nIf the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets. \n\n*Example*: \n\n`http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]`
     **/
    @ApiModelProperty(value = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender\u2019s system (the server responding to the URL) must request a recipient token to launch a signing session. \n\nIf set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.\n\nIt is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient\u2019s identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.\n\nIf the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets. \n\n*Example*: \n\n`http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` ")
    public String getEmbeddedRecipientStartURL() {
        return embeddedRecipientStartURL;
    }

    public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
        this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }


    /**
     * Reserved:
     **/
    @ApiModelProperty(value = "Reserved:")
    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getHostEmail() {
        return hostEmail;
    }

    public void setHostEmail(String hostEmail) {
        this.hostEmail = hostEmail;
    }


    /**
     * Specifies the name of the signing host. It is a required element for In Person Signers recipient Type. \nMaximum Length: 100 characters.
     **/
    @ApiModelProperty(value = "Specifies the name of the signing host. It is a required element for In Person Signers recipient Type. \nMaximum Length: 100 characters.")
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }


    /**
     * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.\n\n*Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.
     **/
    @ApiModelProperty(value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.\n\n*Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
    public String getIdCheckConfigurationName() {
        return idCheckConfigurationName;
    }

    public void setIdCheckConfigurationName(String idCheckConfigurationName) {
        this.idCheckConfigurationName = idCheckConfigurationName;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public IdCheckInformationInput getIdCheckInformationInput() {
        return idCheckInformationInput;
    }

    public void setIdCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
        this.idCheckInformationInput = idCheckInformationInput;
    }


    /**
     * When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account.
     **/
    @ApiModelProperty(value = "When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. ")
    public String getInheritEmailNotificationConfiguration() {
        return inheritEmailNotificationConfiguration;
    }

    public void setInheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
        this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getInPersonSigningType() {
        return inPersonSigningType;
    }

    public void setInPersonSigningType(String inPersonSigningType) {
        this.inPersonSigningType = inPersonSigningType;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public NotaryHost getNotaryHost() {
        return notaryHost;
    }

    public void setNotaryHost(NotaryHost notaryHost) {
        this.notaryHost = notaryHost;
    }


    /**
     * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.\n\nMaximum Length: 1000 characters.
     **/
    @ApiModelProperty(value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.\n\nMaximum Length: 1000 characters.")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public OfflineAttributes getOfflineAttributes() {
        return offlineAttributes;
    }

    public void setOfflineAttributes(OfflineAttributes offlineAttributes) {
        this.offlineAttributes = offlineAttributes;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public RecipientPhoneAuthentication getPhoneAuthentication() {
        return phoneAuthentication;
    }

    public void setPhoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
        this.phoneAuthentication = phoneAuthentication;
    }


    /**
     * Reserved:
     **/
    @ApiModelProperty(value = "Reserved:")
    public java.util.List<RecipientAttachment> getRecipientAttachments() {
        return recipientAttachments;
    }

    public void setRecipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
        this.recipientAttachments = recipientAttachments;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public AuthenticationStatus getRecipientAuthenticationStatus() {
        return recipientAuthenticationStatus;
    }

    public void setRecipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
        this.recipientAuthenticationStatus = recipientAuthenticationStatus;
    }


    /**
     * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
     **/
    @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getRecipientIdGuid() {
        return recipientIdGuid;
    }

    public void setRecipientIdGuid(String recipientIdGuid) {
        this.recipientIdGuid = recipientIdGuid;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<RecipientSignatureProvider> getRecipientSignatureProviders() {
        return recipientSignatureProviders;
    }

    public void setRecipientSignatureProviders(java.util.List<RecipientSignatureProvider> recipientSignatureProviders) {
        this.recipientSignatureProviders = recipientSignatureProviders;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getRecipientSuppliesTabs() {
        return recipientSuppliesTabs;
    }

    public void setRecipientSuppliesTabs(String recipientSuppliesTabs) {
        this.recipientSuppliesTabs = recipientSuppliesTabs;
    }


    /**
     * When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity.
     **/
    @ApiModelProperty(value = "When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. ")
    public String getRequireIdLookup() {
        return requireIdLookup;
    }

    public void setRequireIdLookup(String requireIdLookup) {
        this.requireIdLookup = requireIdLookup;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getRequireSignerCertificate() {
        return requireSignerCertificate;
    }

    public void setRequireSignerCertificate(String requireSignerCertificate) {
        this.requireSignerCertificate = requireSignerCertificate;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getRequireSignOnPaper() {
        return requireSignOnPaper;
    }

    public void setRequireSignOnPaper(String requireSignOnPaper) {
        this.requireSignOnPaper = requireSignOnPaper;
    }


    /**
     * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
     **/
    @ApiModelProperty(value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    /**
     * Specifies the routing order of the recipient in the envelope.
     **/
    @ApiModelProperty(value = "Specifies the routing order of the recipient in the envelope. ")
    public String getRoutingOrder() {
        return routingOrder;
    }

    public void setRoutingOrder(String routingOrder) {
        this.routingOrder = routingOrder;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public RecipientSAMLAuthentication getSamlAuthentication() {
        return samlAuthentication;
    }

    public void setSamlAuthentication(RecipientSAMLAuthentication samlAuthentication) {
        this.samlAuthentication = samlAuthentication;
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
     **/
    @ApiModelProperty(value = "")
    public RecipientSignatureInformation getSignatureInfo() {
        return signatureInfo;
    }

    public void setSignatureInfo(RecipientSignatureInformation signatureInfo) {
        this.signatureInfo = signatureInfo;
    }


    /**
     * Reserved: For DocuSign use only.
     **/
    @ApiModelProperty(value = "Reserved: For DocuSign use only. ")
    public String getSignedDateTime() {
        return signedDateTime;
    }

    public void setSignedDateTime(String signedDateTime) {
        this.signedDateTime = signedDateTime;
    }


    /**
     * The email address for an InPersonSigner recipient Type. \n\nMaximum Length: 100 characters.
     **/
    @ApiModelProperty(value = "The email address for an InPersonSigner recipient Type. \n\nMaximum Length: 100 characters. ")
    public String getSignerEmail() {
        return signerEmail;
    }

    public void setSignerEmail(String signerEmail) {
        this.signerEmail = signerEmail;
    }


    /**
     * Required. The full legal name of a signer for the envelope. \n\nMaximum Length: 100 characters.\n\n\n
     **/
    @ApiModelProperty(value = "Required. The full legal name of a signer for the envelope. \n\nMaximum Length: 100 characters.\n\n\n")
    public String getSignerName() {
        return signerName;
    }

    public void setSignerName(String signerName) {
        this.signerName = signerName;
    }


    /**
     * When set to **true**, specifies that the signer must sign in all locations.
     **/
    @ApiModelProperty(value = "When set to **true**, specifies that the signer must sign in all locations.")
    public String getSignInEachLocation() {
        return signInEachLocation;
    }

    public void setSignInEachLocation(String signInEachLocation) {
        this.signInEachLocation = signInEachLocation;
    }


    /**
     * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
     **/
    @ApiModelProperty(value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
    public String getSigningGroupId() {
        return signingGroupId;
    }

    public void setSigningGroupId(String signingGroupId) {
        this.signingGroupId = signingGroupId;
    }


    /**
     * The display name for the signing group. \n\nMaximum Length: 100 characters.
     **/
    @ApiModelProperty(value = "The display name for the signing group. \n\nMaximum Length: 100 characters. ")
    public String getSigningGroupName() {
        return signingGroupName;
    }

    public void setSigningGroupName(String signingGroupName) {
        this.signingGroupName = signingGroupName;
    }


    /**
     * A complex type that contains information about users in the signing group.
     **/
    @ApiModelProperty(value = "A complex type that contains information about users in the signing group.")
    public java.util.List<UserInfo> getSigningGroupUsers() {
        return signingGroupUsers;
    }

    public void setSigningGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
        this.signingGroupUsers = signingGroupUsers;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public RecipientSMSAuthentication getSmsAuthentication() {
        return smsAuthentication;
    }

    public void setSmsAuthentication(RecipientSMSAuthentication smsAuthentication) {
        this.smsAuthentication = smsAuthentication;
    }


    /**
     * Lists the social ID type that can be used for recipient authentication.
     **/
    @ApiModelProperty(value = " Lists the social ID type that can be used for recipient authentication.")
    public java.util.List<SocialAuthentication> getSocialAuthentications() {
        return socialAuthentications;
    }

    public void setSocialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
        this.socialAuthentications = socialAuthentications;
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
     **/
    @ApiModelProperty(value = "")
    public Tabs getTabs() {
        return tabs;
    }

    public void setTabs(Tabs tabs) {
        this.tabs = tabs;
    }


    /**
     * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
     **/
    @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
    public String getTemplateLocked() {
        return templateLocked;
    }

    public void setTemplateLocked(String templateLocked) {
        this.templateLocked = templateLocked;
    }


    /**
     * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
     **/
    @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
    public String getTemplateRequired() {
        return templateRequired;
    }

    public void setTemplateRequired(String templateRequired) {
        this.templateRequired = templateRequired;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTotalTabCount() {
        return totalTabCount;
    }

    public void setTotalTabCount(String totalTabCount) {
        this.totalTabCount = totalTabCount;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InPersonSigner inPersonSigner = (InPersonSigner) o;
        return Objects.equals(accessCode, inPersonSigner.accessCode) &&
                Objects.equals(addAccessCodeToEmail, inPersonSigner.addAccessCodeToEmail) &&
                Objects.equals(autoNavigation, inPersonSigner.autoNavigation) &&
                Objects.equals(canSignOffline, inPersonSigner.canSignOffline) &&
                Objects.equals(clientUserId, inPersonSigner.clientUserId) &&
                Objects.equals(customFields, inPersonSigner.customFields) &&
                Objects.equals(declinedDateTime, inPersonSigner.declinedDateTime) &&
                Objects.equals(declinedReason, inPersonSigner.declinedReason) &&
                Objects.equals(defaultRecipient, inPersonSigner.defaultRecipient) &&
                Objects.equals(deliveredDateTime, inPersonSigner.deliveredDateTime) &&
                Objects.equals(deliveryMethod, inPersonSigner.deliveryMethod) &&
                Objects.equals(documentVisibility, inPersonSigner.documentVisibility) &&
                Objects.equals(emailNotification, inPersonSigner.emailNotification) &&
                Objects.equals(embeddedRecipientStartURL, inPersonSigner.embeddedRecipientStartURL) &&
                Objects.equals(errorDetails, inPersonSigner.errorDetails) &&
                Objects.equals(faxNumber, inPersonSigner.faxNumber) &&
                Objects.equals(hostEmail, inPersonSigner.hostEmail) &&
                Objects.equals(hostName, inPersonSigner.hostName) &&
                Objects.equals(idCheckConfigurationName, inPersonSigner.idCheckConfigurationName) &&
                Objects.equals(idCheckInformationInput, inPersonSigner.idCheckInformationInput) &&
                Objects.equals(inheritEmailNotificationConfiguration, inPersonSigner.inheritEmailNotificationConfiguration) &&
                Objects.equals(inPersonSigningType, inPersonSigner.inPersonSigningType) &&
                Objects.equals(notaryHost, inPersonSigner.notaryHost) &&
                Objects.equals(note, inPersonSigner.note) &&
                Objects.equals(offlineAttributes, inPersonSigner.offlineAttributes) &&
                Objects.equals(phoneAuthentication, inPersonSigner.phoneAuthentication) &&
                Objects.equals(recipientAttachments, inPersonSigner.recipientAttachments) &&
                Objects.equals(recipientAuthenticationStatus, inPersonSigner.recipientAuthenticationStatus) &&
                Objects.equals(recipientId, inPersonSigner.recipientId) &&
                Objects.equals(recipientIdGuid, inPersonSigner.recipientIdGuid) &&
                Objects.equals(recipientSignatureProviders, inPersonSigner.recipientSignatureProviders) &&
                Objects.equals(recipientSuppliesTabs, inPersonSigner.recipientSuppliesTabs) &&
                Objects.equals(requireIdLookup, inPersonSigner.requireIdLookup) &&
                Objects.equals(requireSignerCertificate, inPersonSigner.requireSignerCertificate) &&
                Objects.equals(requireSignOnPaper, inPersonSigner.requireSignOnPaper) &&
                Objects.equals(roleName, inPersonSigner.roleName) &&
                Objects.equals(routingOrder, inPersonSigner.routingOrder) &&
                Objects.equals(samlAuthentication, inPersonSigner.samlAuthentication) &&
                Objects.equals(sentDateTime, inPersonSigner.sentDateTime) &&
                Objects.equals(signatureInfo, inPersonSigner.signatureInfo) &&
                Objects.equals(signedDateTime, inPersonSigner.signedDateTime) &&
                Objects.equals(signerEmail, inPersonSigner.signerEmail) &&
                Objects.equals(signerName, inPersonSigner.signerName) &&
                Objects.equals(signInEachLocation, inPersonSigner.signInEachLocation) &&
                Objects.equals(signingGroupId, inPersonSigner.signingGroupId) &&
                Objects.equals(signingGroupName, inPersonSigner.signingGroupName) &&
                Objects.equals(signingGroupUsers, inPersonSigner.signingGroupUsers) &&
                Objects.equals(smsAuthentication, inPersonSigner.smsAuthentication) &&
                Objects.equals(socialAuthentications, inPersonSigner.socialAuthentications) &&
                Objects.equals(status, inPersonSigner.status) &&
                Objects.equals(tabs, inPersonSigner.tabs) &&
                Objects.equals(templateLocked, inPersonSigner.templateLocked) &&
                Objects.equals(templateRequired, inPersonSigner.templateRequired) &&
                Objects.equals(totalTabCount, inPersonSigner.totalTabCount) &&
                Objects.equals(userId, inPersonSigner.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessCode, addAccessCodeToEmail, autoNavigation, canSignOffline, clientUserId, customFields, declinedDateTime, declinedReason, defaultRecipient, deliveredDateTime, deliveryMethod, documentVisibility, emailNotification, embeddedRecipientStartURL, errorDetails, faxNumber, hostEmail, hostName, idCheckConfigurationName, idCheckInformationInput, inheritEmailNotificationConfiguration, inPersonSigningType, notaryHost, note, offlineAttributes, phoneAuthentication, recipientAttachments, recipientAuthenticationStatus, recipientId, recipientIdGuid, recipientSignatureProviders, recipientSuppliesTabs, requireIdLookup, requireSignerCertificate, requireSignOnPaper, roleName, routingOrder, samlAuthentication, sentDateTime, signatureInfo, signedDateTime, signerEmail, signerName, signInEachLocation, signingGroupId, signingGroupName, signingGroupUsers, smsAuthentication, socialAuthentications, status, tabs, templateLocked, templateRequired, totalTabCount, userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InPersonSigner {\n");

        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
        sb.append("    addAccessCodeToEmail: ").append(toIndentedString(addAccessCodeToEmail)).append("\n");
        sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
        sb.append("    canSignOffline: ").append(toIndentedString(canSignOffline)).append("\n");
        sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
        sb.append("    declinedReason: ").append(toIndentedString(declinedReason)).append("\n");
        sb.append("    defaultRecipient: ").append(toIndentedString(defaultRecipient)).append("\n");
        sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
        sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
        sb.append("    documentVisibility: ").append(toIndentedString(documentVisibility)).append("\n");
        sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
        sb.append("    embeddedRecipientStartURL: ").append(toIndentedString(embeddedRecipientStartURL)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
        sb.append("    hostEmail: ").append(toIndentedString(hostEmail)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
        sb.append("    idCheckInformationInput: ").append(toIndentedString(idCheckInformationInput)).append("\n");
        sb.append("    inheritEmailNotificationConfiguration: ").append(toIndentedString(inheritEmailNotificationConfiguration)).append("\n");
        sb.append("    inPersonSigningType: ").append(toIndentedString(inPersonSigningType)).append("\n");
        sb.append("    notaryHost: ").append(toIndentedString(notaryHost)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    offlineAttributes: ").append(toIndentedString(offlineAttributes)).append("\n");
        sb.append("    phoneAuthentication: ").append(toIndentedString(phoneAuthentication)).append("\n");
        sb.append("    recipientAttachments: ").append(toIndentedString(recipientAttachments)).append("\n");
        sb.append("    recipientAuthenticationStatus: ").append(toIndentedString(recipientAuthenticationStatus)).append("\n");
        sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
        sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
        sb.append("    recipientSignatureProviders: ").append(toIndentedString(recipientSignatureProviders)).append("\n");
        sb.append("    recipientSuppliesTabs: ").append(toIndentedString(recipientSuppliesTabs)).append("\n");
        sb.append("    requireIdLookup: ").append(toIndentedString(requireIdLookup)).append("\n");
        sb.append("    requireSignerCertificate: ").append(toIndentedString(requireSignerCertificate)).append("\n");
        sb.append("    requireSignOnPaper: ").append(toIndentedString(requireSignOnPaper)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
        sb.append("    samlAuthentication: ").append(toIndentedString(samlAuthentication)).append("\n");
        sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
        sb.append("    signatureInfo: ").append(toIndentedString(signatureInfo)).append("\n");
        sb.append("    signedDateTime: ").append(toIndentedString(signedDateTime)).append("\n");
        sb.append("    signerEmail: ").append(toIndentedString(signerEmail)).append("\n");
        sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
        sb.append("    signInEachLocation: ").append(toIndentedString(signInEachLocation)).append("\n");
        sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
        sb.append("    signingGroupName: ").append(toIndentedString(signingGroupName)).append("\n");
        sb.append("    signingGroupUsers: ").append(toIndentedString(signingGroupUsers)).append("\n");
        sb.append("    smsAuthentication: ").append(toIndentedString(smsAuthentication)).append("\n");
        sb.append("    socialAuthentications: ").append(toIndentedString(socialAuthentications)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
        sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
        sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
        sb.append("    totalTabCount: ").append(toIndentedString(totalTabCount)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
