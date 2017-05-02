package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class AccountRoleSettings implements Serializable {

    @SerializedName("allowAccountManagement")
    private String allowAccountManagement = null;

    @SerializedName("allowAccountManagementMetadata")
    private SettingsMetadata allowAccountManagementMetadata = null;

    @SerializedName("allowApiAccess")
    private String allowApiAccess = null;

    @SerializedName("allowApiAccessMetadata")
    private SettingsMetadata allowApiAccessMetadata = null;

    @SerializedName("allowApiAccessToAccount")
    private String allowApiAccessToAccount = null;

    @SerializedName("allowApiAccessToAccountMetadata")
    private SettingsMetadata allowApiAccessToAccountMetadata = null;

    @SerializedName("allowApiSendingOnBehalfOfOthers")
    private String allowApiSendingOnBehalfOfOthers = null;

    @SerializedName("allowApiSendingOnBehalfOfOthersMetadata")
    private SettingsMetadata allowApiSendingOnBehalfOfOthersMetadata = null;

    @SerializedName("allowApiSequentialSigning")
    private String allowApiSequentialSigning = null;

    @SerializedName("allowApiSequentialSigningMetadata")
    private SettingsMetadata allowApiSequentialSigningMetadata = null;

    @SerializedName("allowBulkSending")
    private String allowBulkSending = null;

    @SerializedName("allowBulkSendingMetadata")
    private SettingsMetadata allowBulkSendingMetadata = null;

    @SerializedName("allowDocuSignDesktopClient")
    private String allowDocuSignDesktopClient = null;

    @SerializedName("allowDocuSignDesktopClientMetadata")
    private SettingsMetadata allowDocuSignDesktopClientMetadata = null;

    @SerializedName("allowedAddressBookAccess")
    private String allowedAddressBookAccess = null;

    @SerializedName("allowedAddressBookAccessMetadata")
    private SettingsMetadata allowedAddressBookAccessMetadata = null;

    @SerializedName("allowedTemplateAccess")
    private String allowedTemplateAccess = null;

    @SerializedName("allowedTemplateAccessMetadata")
    private SettingsMetadata allowedTemplateAccessMetadata = null;

    @SerializedName("allowedToBeEnvelopeTransferRecipient")
    private String allowedToBeEnvelopeTransferRecipient = null;

    @SerializedName("allowedToBeEnvelopeTransferRecipientMetadata")
    private SettingsMetadata allowedToBeEnvelopeTransferRecipientMetadata = null;

    @SerializedName("allowEnvelopeSending")
    private String allowEnvelopeSending = null;

    @SerializedName("allowEnvelopeSendingMetadata")
    private SettingsMetadata allowEnvelopeSendingMetadata = null;

    @SerializedName("allowSendersToSetRecipientEmailLanguage")
    private String allowSendersToSetRecipientEmailLanguage = null;

    @SerializedName("allowSendersToSetRecipientEmailLanguageMetadata")
    private SettingsMetadata allowSendersToSetRecipientEmailLanguageMetadata = null;

    @SerializedName("allowSignerAttachments")
    private String allowSignerAttachments = null;

    @SerializedName("allowSignerAttachmentsMetadata")
    private SettingsMetadata allowSignerAttachmentsMetadata = null;

    @SerializedName("allowSupplementalDocuments")
    private String allowSupplementalDocuments = null;

    @SerializedName("allowSupplementalDocumentsMetadata")
    private SettingsMetadata allowSupplementalDocumentsMetadata = null;

    @SerializedName("allowTaggingInSendAndCorrect")
    private String allowTaggingInSendAndCorrect = null;

    @SerializedName("allowTaggingInSendAndCorrectMetadata")
    private SettingsMetadata allowTaggingInSendAndCorrectMetadata = null;

    @SerializedName("allowVaulting")
    private String allowVaulting = null;

    @SerializedName("allowVaultingMetadata")
    private SettingsMetadata allowVaultingMetadata = null;

    @SerializedName("allowWetSigningOverride")
    private String allowWetSigningOverride = null;

    @SerializedName("allowWetSigningOverrideMetadata")
    private SettingsMetadata allowWetSigningOverrideMetadata = null;

    @SerializedName("canCreateWorkspaces")
    private String canCreateWorkspaces = null;

    @SerializedName("canCreateWorkspacesMetadata")
    private SettingsMetadata canCreateWorkspacesMetadata = null;

    @SerializedName("disableDocumentUpload")
    private String disableDocumentUpload = null;

    @SerializedName("disableDocumentUploadMetadata")
    private SettingsMetadata disableDocumentUploadMetadata = null;

    @SerializedName("disableOtherActions")
    private String disableOtherActions = null;

    @SerializedName("disableOtherActionsMetadata")
    private SettingsMetadata disableOtherActionsMetadata = null;

    @SerializedName("enableApiRequestLogging")
    private String enableApiRequestLogging = null;

    @SerializedName("enableApiRequestLoggingMetadata")
    private SettingsMetadata enableApiRequestLoggingMetadata = null;

    @SerializedName("enableRecipientViewingNotifications")
    private String enableRecipientViewingNotifications = null;

    @SerializedName("enableRecipientViewingNotificationsMetadata")
    private SettingsMetadata enableRecipientViewingNotificationsMetadata = null;

    @SerializedName("enableSequentialSigningInterface")
    private String enableSequentialSigningInterface = null;

    @SerializedName("enableSequentialSigningInterfaceMetadata")
    private SettingsMetadata enableSequentialSigningInterfaceMetadata = null;

    @SerializedName("enableTransactionPointIntegration")
    private String enableTransactionPointIntegration = null;

    @SerializedName("enableTransactionPointIntegrationMetadata")
    private SettingsMetadata enableTransactionPointIntegrationMetadata = null;

    @SerializedName("powerFormRole")
    private String powerFormRole = null;

    @SerializedName("powerFormRoleMetadata")
    private SettingsMetadata powerFormRoleMetadata = null;

    @SerializedName("receiveCompletedSelfSignedDocumentsAsEmailLinks")
    private String receiveCompletedSelfSignedDocumentsAsEmailLinks = null;

    @SerializedName("receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata")
    private SettingsMetadata receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata = null;

    @SerializedName("supplementalDocumentsMustAccept")
    private String supplementalDocumentsMustAccept = null;

    @SerializedName("supplementalDocumentsMustAcceptMetadata")
    private SettingsMetadata supplementalDocumentsMustAcceptMetadata = null;

    @SerializedName("supplementalDocumentsMustRead")
    private String supplementalDocumentsMustRead = null;

    @SerializedName("supplementalDocumentsMustReadMetadata")
    private SettingsMetadata supplementalDocumentsMustReadMetadata = null;

    @SerializedName("supplementalDocumentsMustView")
    private String supplementalDocumentsMustView = null;

    @SerializedName("supplementalDocumentsMustViewMetadata")
    private SettingsMetadata supplementalDocumentsMustViewMetadata = null;

    @SerializedName("useNewDocuSignExperienceInterface")
    private String useNewDocuSignExperienceInterface = null;

    @SerializedName("useNewDocuSignExperienceInterfaceMetadata")
    private SettingsMetadata useNewDocuSignExperienceInterfaceMetadata = null;

    @SerializedName("useNewSendingInterface")
    private String useNewSendingInterface = null;

    @SerializedName("useNewSendingInterfaceMetadata")
    private SettingsMetadata useNewSendingInterfaceMetadata = null;

    @SerializedName("vaultingMode")
    private String vaultingMode = null;

    @SerializedName("vaultingModeMetadata")
    private SettingsMetadata vaultingModeMetadata = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowAccountManagement() {
        return allowAccountManagement;
    }

    public void setAllowAccountManagement(String allowAccountManagement) {
        this.allowAccountManagement = allowAccountManagement;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowAccountManagementMetadata() {
        return allowAccountManagementMetadata;
    }

    public void setAllowAccountManagementMetadata(SettingsMetadata allowAccountManagementMetadata) {
        this.allowAccountManagementMetadata = allowAccountManagementMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowApiAccess() {
        return allowApiAccess;
    }

    public void setAllowApiAccess(String allowApiAccess) {
        this.allowApiAccess = allowApiAccess;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowApiAccessMetadata() {
        return allowApiAccessMetadata;
    }

    public void setAllowApiAccessMetadata(SettingsMetadata allowApiAccessMetadata) {
        this.allowApiAccessMetadata = allowApiAccessMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowApiAccessToAccount() {
        return allowApiAccessToAccount;
    }

    public void setAllowApiAccessToAccount(String allowApiAccessToAccount) {
        this.allowApiAccessToAccount = allowApiAccessToAccount;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowApiAccessToAccountMetadata() {
        return allowApiAccessToAccountMetadata;
    }

    public void setAllowApiAccessToAccountMetadata(SettingsMetadata allowApiAccessToAccountMetadata) {
        this.allowApiAccessToAccountMetadata = allowApiAccessToAccountMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowApiSendingOnBehalfOfOthers() {
        return allowApiSendingOnBehalfOfOthers;
    }

    public void setAllowApiSendingOnBehalfOfOthers(String allowApiSendingOnBehalfOfOthers) {
        this.allowApiSendingOnBehalfOfOthers = allowApiSendingOnBehalfOfOthers;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowApiSendingOnBehalfOfOthersMetadata() {
        return allowApiSendingOnBehalfOfOthersMetadata;
    }

    public void setAllowApiSendingOnBehalfOfOthersMetadata(SettingsMetadata allowApiSendingOnBehalfOfOthersMetadata) {
        this.allowApiSendingOnBehalfOfOthersMetadata = allowApiSendingOnBehalfOfOthersMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowApiSequentialSigning() {
        return allowApiSequentialSigning;
    }

    public void setAllowApiSequentialSigning(String allowApiSequentialSigning) {
        this.allowApiSequentialSigning = allowApiSequentialSigning;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowApiSequentialSigningMetadata() {
        return allowApiSequentialSigningMetadata;
    }

    public void setAllowApiSequentialSigningMetadata(SettingsMetadata allowApiSequentialSigningMetadata) {
        this.allowApiSequentialSigningMetadata = allowApiSequentialSigningMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowBulkSending() {
        return allowBulkSending;
    }

    public void setAllowBulkSending(String allowBulkSending) {
        this.allowBulkSending = allowBulkSending;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowBulkSendingMetadata() {
        return allowBulkSendingMetadata;
    }

    public void setAllowBulkSendingMetadata(SettingsMetadata allowBulkSendingMetadata) {
        this.allowBulkSendingMetadata = allowBulkSendingMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowDocuSignDesktopClient() {
        return allowDocuSignDesktopClient;
    }

    public void setAllowDocuSignDesktopClient(String allowDocuSignDesktopClient) {
        this.allowDocuSignDesktopClient = allowDocuSignDesktopClient;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowDocuSignDesktopClientMetadata() {
        return allowDocuSignDesktopClientMetadata;
    }

    public void setAllowDocuSignDesktopClientMetadata(SettingsMetadata allowDocuSignDesktopClientMetadata) {
        this.allowDocuSignDesktopClientMetadata = allowDocuSignDesktopClientMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowedAddressBookAccess() {
        return allowedAddressBookAccess;
    }

    public void setAllowedAddressBookAccess(String allowedAddressBookAccess) {
        this.allowedAddressBookAccess = allowedAddressBookAccess;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowedAddressBookAccessMetadata() {
        return allowedAddressBookAccessMetadata;
    }

    public void setAllowedAddressBookAccessMetadata(SettingsMetadata allowedAddressBookAccessMetadata) {
        this.allowedAddressBookAccessMetadata = allowedAddressBookAccessMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowedTemplateAccess() {
        return allowedTemplateAccess;
    }

    public void setAllowedTemplateAccess(String allowedTemplateAccess) {
        this.allowedTemplateAccess = allowedTemplateAccess;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowedTemplateAccessMetadata() {
        return allowedTemplateAccessMetadata;
    }

    public void setAllowedTemplateAccessMetadata(SettingsMetadata allowedTemplateAccessMetadata) {
        this.allowedTemplateAccessMetadata = allowedTemplateAccessMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowedToBeEnvelopeTransferRecipient() {
        return allowedToBeEnvelopeTransferRecipient;
    }

    public void setAllowedToBeEnvelopeTransferRecipient(String allowedToBeEnvelopeTransferRecipient) {
        this.allowedToBeEnvelopeTransferRecipient = allowedToBeEnvelopeTransferRecipient;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowedToBeEnvelopeTransferRecipientMetadata() {
        return allowedToBeEnvelopeTransferRecipientMetadata;
    }

    public void setAllowedToBeEnvelopeTransferRecipientMetadata(SettingsMetadata allowedToBeEnvelopeTransferRecipientMetadata) {
        this.allowedToBeEnvelopeTransferRecipientMetadata = allowedToBeEnvelopeTransferRecipientMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowEnvelopeSending() {
        return allowEnvelopeSending;
    }

    public void setAllowEnvelopeSending(String allowEnvelopeSending) {
        this.allowEnvelopeSending = allowEnvelopeSending;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowEnvelopeSendingMetadata() {
        return allowEnvelopeSendingMetadata;
    }

    public void setAllowEnvelopeSendingMetadata(SettingsMetadata allowEnvelopeSendingMetadata) {
        this.allowEnvelopeSendingMetadata = allowEnvelopeSendingMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowSendersToSetRecipientEmailLanguage() {
        return allowSendersToSetRecipientEmailLanguage;
    }

    public void setAllowSendersToSetRecipientEmailLanguage(String allowSendersToSetRecipientEmailLanguage) {
        this.allowSendersToSetRecipientEmailLanguage = allowSendersToSetRecipientEmailLanguage;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowSendersToSetRecipientEmailLanguageMetadata() {
        return allowSendersToSetRecipientEmailLanguageMetadata;
    }

    public void setAllowSendersToSetRecipientEmailLanguageMetadata(SettingsMetadata allowSendersToSetRecipientEmailLanguageMetadata) {
        this.allowSendersToSetRecipientEmailLanguageMetadata = allowSendersToSetRecipientEmailLanguageMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowSignerAttachments() {
        return allowSignerAttachments;
    }

    public void setAllowSignerAttachments(String allowSignerAttachments) {
        this.allowSignerAttachments = allowSignerAttachments;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowSignerAttachmentsMetadata() {
        return allowSignerAttachmentsMetadata;
    }

    public void setAllowSignerAttachmentsMetadata(SettingsMetadata allowSignerAttachmentsMetadata) {
        this.allowSignerAttachmentsMetadata = allowSignerAttachmentsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowSupplementalDocuments() {
        return allowSupplementalDocuments;
    }

    public void setAllowSupplementalDocuments(String allowSupplementalDocuments) {
        this.allowSupplementalDocuments = allowSupplementalDocuments;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowSupplementalDocumentsMetadata() {
        return allowSupplementalDocumentsMetadata;
    }

    public void setAllowSupplementalDocumentsMetadata(SettingsMetadata allowSupplementalDocumentsMetadata) {
        this.allowSupplementalDocumentsMetadata = allowSupplementalDocumentsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowTaggingInSendAndCorrect() {
        return allowTaggingInSendAndCorrect;
    }

    public void setAllowTaggingInSendAndCorrect(String allowTaggingInSendAndCorrect) {
        this.allowTaggingInSendAndCorrect = allowTaggingInSendAndCorrect;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowTaggingInSendAndCorrectMetadata() {
        return allowTaggingInSendAndCorrectMetadata;
    }

    public void setAllowTaggingInSendAndCorrectMetadata(SettingsMetadata allowTaggingInSendAndCorrectMetadata) {
        this.allowTaggingInSendAndCorrectMetadata = allowTaggingInSendAndCorrectMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowVaulting() {
        return allowVaulting;
    }

    public void setAllowVaulting(String allowVaulting) {
        this.allowVaulting = allowVaulting;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowVaultingMetadata() {
        return allowVaultingMetadata;
    }

    public void setAllowVaultingMetadata(SettingsMetadata allowVaultingMetadata) {
        this.allowVaultingMetadata = allowVaultingMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllowWetSigningOverride() {
        return allowWetSigningOverride;
    }

    public void setAllowWetSigningOverride(String allowWetSigningOverride) {
        this.allowWetSigningOverride = allowWetSigningOverride;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getAllowWetSigningOverrideMetadata() {
        return allowWetSigningOverrideMetadata;
    }

    public void setAllowWetSigningOverrideMetadata(SettingsMetadata allowWetSigningOverrideMetadata) {
        this.allowWetSigningOverrideMetadata = allowWetSigningOverrideMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCanCreateWorkspaces() {
        return canCreateWorkspaces;
    }

    public void setCanCreateWorkspaces(String canCreateWorkspaces) {
        this.canCreateWorkspaces = canCreateWorkspaces;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getCanCreateWorkspacesMetadata() {
        return canCreateWorkspacesMetadata;
    }

    public void setCanCreateWorkspacesMetadata(SettingsMetadata canCreateWorkspacesMetadata) {
        this.canCreateWorkspacesMetadata = canCreateWorkspacesMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDisableDocumentUpload() {
        return disableDocumentUpload;
    }

    public void setDisableDocumentUpload(String disableDocumentUpload) {
        this.disableDocumentUpload = disableDocumentUpload;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getDisableDocumentUploadMetadata() {
        return disableDocumentUploadMetadata;
    }

    public void setDisableDocumentUploadMetadata(SettingsMetadata disableDocumentUploadMetadata) {
        this.disableDocumentUploadMetadata = disableDocumentUploadMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDisableOtherActions() {
        return disableOtherActions;
    }

    public void setDisableOtherActions(String disableOtherActions) {
        this.disableOtherActions = disableOtherActions;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getDisableOtherActionsMetadata() {
        return disableOtherActionsMetadata;
    }

    public void setDisableOtherActionsMetadata(SettingsMetadata disableOtherActionsMetadata) {
        this.disableOtherActionsMetadata = disableOtherActionsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEnableApiRequestLogging() {
        return enableApiRequestLogging;
    }

    public void setEnableApiRequestLogging(String enableApiRequestLogging) {
        this.enableApiRequestLogging = enableApiRequestLogging;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getEnableApiRequestLoggingMetadata() {
        return enableApiRequestLoggingMetadata;
    }

    public void setEnableApiRequestLoggingMetadata(SettingsMetadata enableApiRequestLoggingMetadata) {
        this.enableApiRequestLoggingMetadata = enableApiRequestLoggingMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEnableRecipientViewingNotifications() {
        return enableRecipientViewingNotifications;
    }

    public void setEnableRecipientViewingNotifications(String enableRecipientViewingNotifications) {
        this.enableRecipientViewingNotifications = enableRecipientViewingNotifications;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getEnableRecipientViewingNotificationsMetadata() {
        return enableRecipientViewingNotificationsMetadata;
    }

    public void setEnableRecipientViewingNotificationsMetadata(SettingsMetadata enableRecipientViewingNotificationsMetadata) {
        this.enableRecipientViewingNotificationsMetadata = enableRecipientViewingNotificationsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEnableSequentialSigningInterface() {
        return enableSequentialSigningInterface;
    }

    public void setEnableSequentialSigningInterface(String enableSequentialSigningInterface) {
        this.enableSequentialSigningInterface = enableSequentialSigningInterface;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getEnableSequentialSigningInterfaceMetadata() {
        return enableSequentialSigningInterfaceMetadata;
    }

    public void setEnableSequentialSigningInterfaceMetadata(SettingsMetadata enableSequentialSigningInterfaceMetadata) {
        this.enableSequentialSigningInterfaceMetadata = enableSequentialSigningInterfaceMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEnableTransactionPointIntegration() {
        return enableTransactionPointIntegration;
    }

    public void setEnableTransactionPointIntegration(String enableTransactionPointIntegration) {
        this.enableTransactionPointIntegration = enableTransactionPointIntegration;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getEnableTransactionPointIntegrationMetadata() {
        return enableTransactionPointIntegrationMetadata;
    }

    public void setEnableTransactionPointIntegrationMetadata(SettingsMetadata enableTransactionPointIntegrationMetadata) {
        this.enableTransactionPointIntegrationMetadata = enableTransactionPointIntegrationMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPowerFormRole() {
        return powerFormRole;
    }

    public void setPowerFormRole(String powerFormRole) {
        this.powerFormRole = powerFormRole;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getPowerFormRoleMetadata() {
        return powerFormRoleMetadata;
    }

    public void setPowerFormRoleMetadata(SettingsMetadata powerFormRoleMetadata) {
        this.powerFormRoleMetadata = powerFormRoleMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getReceiveCompletedSelfSignedDocumentsAsEmailLinks() {
        return receiveCompletedSelfSignedDocumentsAsEmailLinks;
    }

    public void setReceiveCompletedSelfSignedDocumentsAsEmailLinks(String receiveCompletedSelfSignedDocumentsAsEmailLinks) {
        this.receiveCompletedSelfSignedDocumentsAsEmailLinks = receiveCompletedSelfSignedDocumentsAsEmailLinks;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getReceiveCompletedSelfSignedDocumentsAsEmailLinksMetadata() {
        return receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata;
    }

    public void setReceiveCompletedSelfSignedDocumentsAsEmailLinksMetadata(SettingsMetadata receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata) {
        this.receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata = receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSupplementalDocumentsMustAccept() {
        return supplementalDocumentsMustAccept;
    }

    public void setSupplementalDocumentsMustAccept(String supplementalDocumentsMustAccept) {
        this.supplementalDocumentsMustAccept = supplementalDocumentsMustAccept;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getSupplementalDocumentsMustAcceptMetadata() {
        return supplementalDocumentsMustAcceptMetadata;
    }

    public void setSupplementalDocumentsMustAcceptMetadata(SettingsMetadata supplementalDocumentsMustAcceptMetadata) {
        this.supplementalDocumentsMustAcceptMetadata = supplementalDocumentsMustAcceptMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSupplementalDocumentsMustRead() {
        return supplementalDocumentsMustRead;
    }

    public void setSupplementalDocumentsMustRead(String supplementalDocumentsMustRead) {
        this.supplementalDocumentsMustRead = supplementalDocumentsMustRead;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getSupplementalDocumentsMustReadMetadata() {
        return supplementalDocumentsMustReadMetadata;
    }

    public void setSupplementalDocumentsMustReadMetadata(SettingsMetadata supplementalDocumentsMustReadMetadata) {
        this.supplementalDocumentsMustReadMetadata = supplementalDocumentsMustReadMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSupplementalDocumentsMustView() {
        return supplementalDocumentsMustView;
    }

    public void setSupplementalDocumentsMustView(String supplementalDocumentsMustView) {
        this.supplementalDocumentsMustView = supplementalDocumentsMustView;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getSupplementalDocumentsMustViewMetadata() {
        return supplementalDocumentsMustViewMetadata;
    }

    public void setSupplementalDocumentsMustViewMetadata(SettingsMetadata supplementalDocumentsMustViewMetadata) {
        this.supplementalDocumentsMustViewMetadata = supplementalDocumentsMustViewMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUseNewDocuSignExperienceInterface() {
        return useNewDocuSignExperienceInterface;
    }

    public void setUseNewDocuSignExperienceInterface(String useNewDocuSignExperienceInterface) {
        this.useNewDocuSignExperienceInterface = useNewDocuSignExperienceInterface;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getUseNewDocuSignExperienceInterfaceMetadata() {
        return useNewDocuSignExperienceInterfaceMetadata;
    }

    public void setUseNewDocuSignExperienceInterfaceMetadata(SettingsMetadata useNewDocuSignExperienceInterfaceMetadata) {
        this.useNewDocuSignExperienceInterfaceMetadata = useNewDocuSignExperienceInterfaceMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUseNewSendingInterface() {
        return useNewSendingInterface;
    }

    public void setUseNewSendingInterface(String useNewSendingInterface) {
        this.useNewSendingInterface = useNewSendingInterface;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getUseNewSendingInterfaceMetadata() {
        return useNewSendingInterfaceMetadata;
    }

    public void setUseNewSendingInterfaceMetadata(SettingsMetadata useNewSendingInterfaceMetadata) {
        this.useNewSendingInterfaceMetadata = useNewSendingInterfaceMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getVaultingMode() {
        return vaultingMode;
    }

    public void setVaultingMode(String vaultingMode) {
        this.vaultingMode = vaultingMode;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getVaultingModeMetadata() {
        return vaultingModeMetadata;
    }

    public void setVaultingModeMetadata(SettingsMetadata vaultingModeMetadata) {
        this.vaultingModeMetadata = vaultingModeMetadata;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountRoleSettings accountRoleSettings = (AccountRoleSettings) o;
        return Objects.equals(allowAccountManagement, accountRoleSettings.allowAccountManagement) &&
                Objects.equals(allowAccountManagementMetadata, accountRoleSettings.allowAccountManagementMetadata) &&
                Objects.equals(allowApiAccess, accountRoleSettings.allowApiAccess) &&
                Objects.equals(allowApiAccessMetadata, accountRoleSettings.allowApiAccessMetadata) &&
                Objects.equals(allowApiAccessToAccount, accountRoleSettings.allowApiAccessToAccount) &&
                Objects.equals(allowApiAccessToAccountMetadata, accountRoleSettings.allowApiAccessToAccountMetadata) &&
                Objects.equals(allowApiSendingOnBehalfOfOthers, accountRoleSettings.allowApiSendingOnBehalfOfOthers) &&
                Objects.equals(allowApiSendingOnBehalfOfOthersMetadata, accountRoleSettings.allowApiSendingOnBehalfOfOthersMetadata) &&
                Objects.equals(allowApiSequentialSigning, accountRoleSettings.allowApiSequentialSigning) &&
                Objects.equals(allowApiSequentialSigningMetadata, accountRoleSettings.allowApiSequentialSigningMetadata) &&
                Objects.equals(allowBulkSending, accountRoleSettings.allowBulkSending) &&
                Objects.equals(allowBulkSendingMetadata, accountRoleSettings.allowBulkSendingMetadata) &&
                Objects.equals(allowDocuSignDesktopClient, accountRoleSettings.allowDocuSignDesktopClient) &&
                Objects.equals(allowDocuSignDesktopClientMetadata, accountRoleSettings.allowDocuSignDesktopClientMetadata) &&
                Objects.equals(allowedAddressBookAccess, accountRoleSettings.allowedAddressBookAccess) &&
                Objects.equals(allowedAddressBookAccessMetadata, accountRoleSettings.allowedAddressBookAccessMetadata) &&
                Objects.equals(allowedTemplateAccess, accountRoleSettings.allowedTemplateAccess) &&
                Objects.equals(allowedTemplateAccessMetadata, accountRoleSettings.allowedTemplateAccessMetadata) &&
                Objects.equals(allowedToBeEnvelopeTransferRecipient, accountRoleSettings.allowedToBeEnvelopeTransferRecipient) &&
                Objects.equals(allowedToBeEnvelopeTransferRecipientMetadata, accountRoleSettings.allowedToBeEnvelopeTransferRecipientMetadata) &&
                Objects.equals(allowEnvelopeSending, accountRoleSettings.allowEnvelopeSending) &&
                Objects.equals(allowEnvelopeSendingMetadata, accountRoleSettings.allowEnvelopeSendingMetadata) &&
                Objects.equals(allowSendersToSetRecipientEmailLanguage, accountRoleSettings.allowSendersToSetRecipientEmailLanguage) &&
                Objects.equals(allowSendersToSetRecipientEmailLanguageMetadata, accountRoleSettings.allowSendersToSetRecipientEmailLanguageMetadata) &&
                Objects.equals(allowSignerAttachments, accountRoleSettings.allowSignerAttachments) &&
                Objects.equals(allowSignerAttachmentsMetadata, accountRoleSettings.allowSignerAttachmentsMetadata) &&
                Objects.equals(allowSupplementalDocuments, accountRoleSettings.allowSupplementalDocuments) &&
                Objects.equals(allowSupplementalDocumentsMetadata, accountRoleSettings.allowSupplementalDocumentsMetadata) &&
                Objects.equals(allowTaggingInSendAndCorrect, accountRoleSettings.allowTaggingInSendAndCorrect) &&
                Objects.equals(allowTaggingInSendAndCorrectMetadata, accountRoleSettings.allowTaggingInSendAndCorrectMetadata) &&
                Objects.equals(allowVaulting, accountRoleSettings.allowVaulting) &&
                Objects.equals(allowVaultingMetadata, accountRoleSettings.allowVaultingMetadata) &&
                Objects.equals(allowWetSigningOverride, accountRoleSettings.allowWetSigningOverride) &&
                Objects.equals(allowWetSigningOverrideMetadata, accountRoleSettings.allowWetSigningOverrideMetadata) &&
                Objects.equals(canCreateWorkspaces, accountRoleSettings.canCreateWorkspaces) &&
                Objects.equals(canCreateWorkspacesMetadata, accountRoleSettings.canCreateWorkspacesMetadata) &&
                Objects.equals(disableDocumentUpload, accountRoleSettings.disableDocumentUpload) &&
                Objects.equals(disableDocumentUploadMetadata, accountRoleSettings.disableDocumentUploadMetadata) &&
                Objects.equals(disableOtherActions, accountRoleSettings.disableOtherActions) &&
                Objects.equals(disableOtherActionsMetadata, accountRoleSettings.disableOtherActionsMetadata) &&
                Objects.equals(enableApiRequestLogging, accountRoleSettings.enableApiRequestLogging) &&
                Objects.equals(enableApiRequestLoggingMetadata, accountRoleSettings.enableApiRequestLoggingMetadata) &&
                Objects.equals(enableRecipientViewingNotifications, accountRoleSettings.enableRecipientViewingNotifications) &&
                Objects.equals(enableRecipientViewingNotificationsMetadata, accountRoleSettings.enableRecipientViewingNotificationsMetadata) &&
                Objects.equals(enableSequentialSigningInterface, accountRoleSettings.enableSequentialSigningInterface) &&
                Objects.equals(enableSequentialSigningInterfaceMetadata, accountRoleSettings.enableSequentialSigningInterfaceMetadata) &&
                Objects.equals(enableTransactionPointIntegration, accountRoleSettings.enableTransactionPointIntegration) &&
                Objects.equals(enableTransactionPointIntegrationMetadata, accountRoleSettings.enableTransactionPointIntegrationMetadata) &&
                Objects.equals(powerFormRole, accountRoleSettings.powerFormRole) &&
                Objects.equals(powerFormRoleMetadata, accountRoleSettings.powerFormRoleMetadata) &&
                Objects.equals(receiveCompletedSelfSignedDocumentsAsEmailLinks, accountRoleSettings.receiveCompletedSelfSignedDocumentsAsEmailLinks) &&
                Objects.equals(receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata, accountRoleSettings.receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata) &&
                Objects.equals(supplementalDocumentsMustAccept, accountRoleSettings.supplementalDocumentsMustAccept) &&
                Objects.equals(supplementalDocumentsMustAcceptMetadata, accountRoleSettings.supplementalDocumentsMustAcceptMetadata) &&
                Objects.equals(supplementalDocumentsMustRead, accountRoleSettings.supplementalDocumentsMustRead) &&
                Objects.equals(supplementalDocumentsMustReadMetadata, accountRoleSettings.supplementalDocumentsMustReadMetadata) &&
                Objects.equals(supplementalDocumentsMustView, accountRoleSettings.supplementalDocumentsMustView) &&
                Objects.equals(supplementalDocumentsMustViewMetadata, accountRoleSettings.supplementalDocumentsMustViewMetadata) &&
                Objects.equals(useNewDocuSignExperienceInterface, accountRoleSettings.useNewDocuSignExperienceInterface) &&
                Objects.equals(useNewDocuSignExperienceInterfaceMetadata, accountRoleSettings.useNewDocuSignExperienceInterfaceMetadata) &&
                Objects.equals(useNewSendingInterface, accountRoleSettings.useNewSendingInterface) &&
                Objects.equals(useNewSendingInterfaceMetadata, accountRoleSettings.useNewSendingInterfaceMetadata) &&
                Objects.equals(vaultingMode, accountRoleSettings.vaultingMode) &&
                Objects.equals(vaultingModeMetadata, accountRoleSettings.vaultingModeMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowAccountManagement, allowAccountManagementMetadata, allowApiAccess, allowApiAccessMetadata, allowApiAccessToAccount, allowApiAccessToAccountMetadata, allowApiSendingOnBehalfOfOthers, allowApiSendingOnBehalfOfOthersMetadata, allowApiSequentialSigning, allowApiSequentialSigningMetadata, allowBulkSending, allowBulkSendingMetadata, allowDocuSignDesktopClient, allowDocuSignDesktopClientMetadata, allowedAddressBookAccess, allowedAddressBookAccessMetadata, allowedTemplateAccess, allowedTemplateAccessMetadata, allowedToBeEnvelopeTransferRecipient, allowedToBeEnvelopeTransferRecipientMetadata, allowEnvelopeSending, allowEnvelopeSendingMetadata, allowSendersToSetRecipientEmailLanguage, allowSendersToSetRecipientEmailLanguageMetadata, allowSignerAttachments, allowSignerAttachmentsMetadata, allowSupplementalDocuments, allowSupplementalDocumentsMetadata, allowTaggingInSendAndCorrect, allowTaggingInSendAndCorrectMetadata, allowVaulting, allowVaultingMetadata, allowWetSigningOverride, allowWetSigningOverrideMetadata, canCreateWorkspaces, canCreateWorkspacesMetadata, disableDocumentUpload, disableDocumentUploadMetadata, disableOtherActions, disableOtherActionsMetadata, enableApiRequestLogging, enableApiRequestLoggingMetadata, enableRecipientViewingNotifications, enableRecipientViewingNotificationsMetadata, enableSequentialSigningInterface, enableSequentialSigningInterfaceMetadata, enableTransactionPointIntegration, enableTransactionPointIntegrationMetadata, powerFormRole, powerFormRoleMetadata, receiveCompletedSelfSignedDocumentsAsEmailLinks, receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata, supplementalDocumentsMustAccept, supplementalDocumentsMustAcceptMetadata, supplementalDocumentsMustRead, supplementalDocumentsMustReadMetadata, supplementalDocumentsMustView, supplementalDocumentsMustViewMetadata, useNewDocuSignExperienceInterface, useNewDocuSignExperienceInterfaceMetadata, useNewSendingInterface, useNewSendingInterfaceMetadata, vaultingMode, vaultingModeMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountRoleSettings {\n");

        sb.append("    allowAccountManagement: ").append(toIndentedString(allowAccountManagement)).append("\n");
        sb.append("    allowAccountManagementMetadata: ").append(toIndentedString(allowAccountManagementMetadata)).append("\n");
        sb.append("    allowApiAccess: ").append(toIndentedString(allowApiAccess)).append("\n");
        sb.append("    allowApiAccessMetadata: ").append(toIndentedString(allowApiAccessMetadata)).append("\n");
        sb.append("    allowApiAccessToAccount: ").append(toIndentedString(allowApiAccessToAccount)).append("\n");
        sb.append("    allowApiAccessToAccountMetadata: ").append(toIndentedString(allowApiAccessToAccountMetadata)).append("\n");
        sb.append("    allowApiSendingOnBehalfOfOthers: ").append(toIndentedString(allowApiSendingOnBehalfOfOthers)).append("\n");
        sb.append("    allowApiSendingOnBehalfOfOthersMetadata: ").append(toIndentedString(allowApiSendingOnBehalfOfOthersMetadata)).append("\n");
        sb.append("    allowApiSequentialSigning: ").append(toIndentedString(allowApiSequentialSigning)).append("\n");
        sb.append("    allowApiSequentialSigningMetadata: ").append(toIndentedString(allowApiSequentialSigningMetadata)).append("\n");
        sb.append("    allowBulkSending: ").append(toIndentedString(allowBulkSending)).append("\n");
        sb.append("    allowBulkSendingMetadata: ").append(toIndentedString(allowBulkSendingMetadata)).append("\n");
        sb.append("    allowDocuSignDesktopClient: ").append(toIndentedString(allowDocuSignDesktopClient)).append("\n");
        sb.append("    allowDocuSignDesktopClientMetadata: ").append(toIndentedString(allowDocuSignDesktopClientMetadata)).append("\n");
        sb.append("    allowedAddressBookAccess: ").append(toIndentedString(allowedAddressBookAccess)).append("\n");
        sb.append("    allowedAddressBookAccessMetadata: ").append(toIndentedString(allowedAddressBookAccessMetadata)).append("\n");
        sb.append("    allowedTemplateAccess: ").append(toIndentedString(allowedTemplateAccess)).append("\n");
        sb.append("    allowedTemplateAccessMetadata: ").append(toIndentedString(allowedTemplateAccessMetadata)).append("\n");
        sb.append("    allowedToBeEnvelopeTransferRecipient: ").append(toIndentedString(allowedToBeEnvelopeTransferRecipient)).append("\n");
        sb.append("    allowedToBeEnvelopeTransferRecipientMetadata: ").append(toIndentedString(allowedToBeEnvelopeTransferRecipientMetadata)).append("\n");
        sb.append("    allowEnvelopeSending: ").append(toIndentedString(allowEnvelopeSending)).append("\n");
        sb.append("    allowEnvelopeSendingMetadata: ").append(toIndentedString(allowEnvelopeSendingMetadata)).append("\n");
        sb.append("    allowSendersToSetRecipientEmailLanguage: ").append(toIndentedString(allowSendersToSetRecipientEmailLanguage)).append("\n");
        sb.append("    allowSendersToSetRecipientEmailLanguageMetadata: ").append(toIndentedString(allowSendersToSetRecipientEmailLanguageMetadata)).append("\n");
        sb.append("    allowSignerAttachments: ").append(toIndentedString(allowSignerAttachments)).append("\n");
        sb.append("    allowSignerAttachmentsMetadata: ").append(toIndentedString(allowSignerAttachmentsMetadata)).append("\n");
        sb.append("    allowSupplementalDocuments: ").append(toIndentedString(allowSupplementalDocuments)).append("\n");
        sb.append("    allowSupplementalDocumentsMetadata: ").append(toIndentedString(allowSupplementalDocumentsMetadata)).append("\n");
        sb.append("    allowTaggingInSendAndCorrect: ").append(toIndentedString(allowTaggingInSendAndCorrect)).append("\n");
        sb.append("    allowTaggingInSendAndCorrectMetadata: ").append(toIndentedString(allowTaggingInSendAndCorrectMetadata)).append("\n");
        sb.append("    allowVaulting: ").append(toIndentedString(allowVaulting)).append("\n");
        sb.append("    allowVaultingMetadata: ").append(toIndentedString(allowVaultingMetadata)).append("\n");
        sb.append("    allowWetSigningOverride: ").append(toIndentedString(allowWetSigningOverride)).append("\n");
        sb.append("    allowWetSigningOverrideMetadata: ").append(toIndentedString(allowWetSigningOverrideMetadata)).append("\n");
        sb.append("    canCreateWorkspaces: ").append(toIndentedString(canCreateWorkspaces)).append("\n");
        sb.append("    canCreateWorkspacesMetadata: ").append(toIndentedString(canCreateWorkspacesMetadata)).append("\n");
        sb.append("    disableDocumentUpload: ").append(toIndentedString(disableDocumentUpload)).append("\n");
        sb.append("    disableDocumentUploadMetadata: ").append(toIndentedString(disableDocumentUploadMetadata)).append("\n");
        sb.append("    disableOtherActions: ").append(toIndentedString(disableOtherActions)).append("\n");
        sb.append("    disableOtherActionsMetadata: ").append(toIndentedString(disableOtherActionsMetadata)).append("\n");
        sb.append("    enableApiRequestLogging: ").append(toIndentedString(enableApiRequestLogging)).append("\n");
        sb.append("    enableApiRequestLoggingMetadata: ").append(toIndentedString(enableApiRequestLoggingMetadata)).append("\n");
        sb.append("    enableRecipientViewingNotifications: ").append(toIndentedString(enableRecipientViewingNotifications)).append("\n");
        sb.append("    enableRecipientViewingNotificationsMetadata: ").append(toIndentedString(enableRecipientViewingNotificationsMetadata)).append("\n");
        sb.append("    enableSequentialSigningInterface: ").append(toIndentedString(enableSequentialSigningInterface)).append("\n");
        sb.append("    enableSequentialSigningInterfaceMetadata: ").append(toIndentedString(enableSequentialSigningInterfaceMetadata)).append("\n");
        sb.append("    enableTransactionPointIntegration: ").append(toIndentedString(enableTransactionPointIntegration)).append("\n");
        sb.append("    enableTransactionPointIntegrationMetadata: ").append(toIndentedString(enableTransactionPointIntegrationMetadata)).append("\n");
        sb.append("    powerFormRole: ").append(toIndentedString(powerFormRole)).append("\n");
        sb.append("    powerFormRoleMetadata: ").append(toIndentedString(powerFormRoleMetadata)).append("\n");
        sb.append("    receiveCompletedSelfSignedDocumentsAsEmailLinks: ").append(toIndentedString(receiveCompletedSelfSignedDocumentsAsEmailLinks)).append("\n");
        sb.append("    receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata: ").append(toIndentedString(receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata)).append("\n");
        sb.append("    supplementalDocumentsMustAccept: ").append(toIndentedString(supplementalDocumentsMustAccept)).append("\n");
        sb.append("    supplementalDocumentsMustAcceptMetadata: ").append(toIndentedString(supplementalDocumentsMustAcceptMetadata)).append("\n");
        sb.append("    supplementalDocumentsMustRead: ").append(toIndentedString(supplementalDocumentsMustRead)).append("\n");
        sb.append("    supplementalDocumentsMustReadMetadata: ").append(toIndentedString(supplementalDocumentsMustReadMetadata)).append("\n");
        sb.append("    supplementalDocumentsMustView: ").append(toIndentedString(supplementalDocumentsMustView)).append("\n");
        sb.append("    supplementalDocumentsMustViewMetadata: ").append(toIndentedString(supplementalDocumentsMustViewMetadata)).append("\n");
        sb.append("    useNewDocuSignExperienceInterface: ").append(toIndentedString(useNewDocuSignExperienceInterface)).append("\n");
        sb.append("    useNewDocuSignExperienceInterfaceMetadata: ").append(toIndentedString(useNewDocuSignExperienceInterfaceMetadata)).append("\n");
        sb.append("    useNewSendingInterface: ").append(toIndentedString(useNewSendingInterface)).append("\n");
        sb.append("    useNewSendingInterfaceMetadata: ").append(toIndentedString(useNewSendingInterfaceMetadata)).append("\n");
        sb.append("    vaultingMode: ").append(toIndentedString(vaultingMode)).append("\n");
        sb.append("    vaultingModeMetadata: ").append(toIndentedString(vaultingModeMetadata)).append("\n");
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
