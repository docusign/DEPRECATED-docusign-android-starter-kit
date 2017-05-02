package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class FolderItemV2 implements Serializable {

    @SerializedName("completedDateTime")
    private String completedDateTime = null;

    @SerializedName("createdDateTime")
    private String createdDateTime = null;

    @SerializedName("envelopeId")
    private String envelopeId = null;

    @SerializedName("envelopeUri")
    private String envelopeUri = null;

    @SerializedName("expireDateTime")
    private String expireDateTime = null;

    @SerializedName("folderId")
    private String folderId = null;

    @SerializedName("folderUri")
    private String folderUri = null;

    @SerializedName("is21CFRPart11")
    private String is21CFRPart11 = null;

    @SerializedName("isSignatureProviderEnvelope")
    private String isSignatureProviderEnvelope = null;

    @SerializedName("lastModifiedDateTime")
    private String lastModifiedDateTime = null;

    @SerializedName("ownerName")
    private String ownerName = null;

    @SerializedName("recipients")
    private Recipients recipients = null;

    @SerializedName("recipientsUri")
    private String recipientsUri = null;

    @SerializedName("senderCompany")
    private String senderCompany = null;

    @SerializedName("senderEmail")
    private String senderEmail = null;

    @SerializedName("senderName")
    private String senderName = null;

    @SerializedName("senderUserId")
    private String senderUserId = null;

    @SerializedName("sentDateTime")
    private String sentDateTime = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("subject")
    private String subject = null;


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
     * The date and time the envelope is set to expire.
     **/
    @ApiModelProperty(value = "The date and time the envelope is set to expire.")
    public String getExpireDateTime() {
        return expireDateTime;
    }

    public void setExpireDateTime(String expireDateTime) {
        this.expireDateTime = expireDateTime;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getFolderUri() {
        return folderUri;
    }

    public void setFolderUri(String folderUri) {
        this.folderUri = folderUri;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getSenderCompany() {
        return senderCompany;
    }

    public void setSenderCompany(String senderCompany) {
        this.senderCompany = senderCompany;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSenderUserId() {
        return senderUserId;
    }

    public void setSenderUserId(String senderUserId) {
        this.senderUserId = senderUserId;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FolderItemV2 folderItemV2 = (FolderItemV2) o;
        return Objects.equals(completedDateTime, folderItemV2.completedDateTime) &&
                Objects.equals(createdDateTime, folderItemV2.createdDateTime) &&
                Objects.equals(envelopeId, folderItemV2.envelopeId) &&
                Objects.equals(envelopeUri, folderItemV2.envelopeUri) &&
                Objects.equals(expireDateTime, folderItemV2.expireDateTime) &&
                Objects.equals(folderId, folderItemV2.folderId) &&
                Objects.equals(folderUri, folderItemV2.folderUri) &&
                Objects.equals(is21CFRPart11, folderItemV2.is21CFRPart11) &&
                Objects.equals(isSignatureProviderEnvelope, folderItemV2.isSignatureProviderEnvelope) &&
                Objects.equals(lastModifiedDateTime, folderItemV2.lastModifiedDateTime) &&
                Objects.equals(ownerName, folderItemV2.ownerName) &&
                Objects.equals(recipients, folderItemV2.recipients) &&
                Objects.equals(recipientsUri, folderItemV2.recipientsUri) &&
                Objects.equals(senderCompany, folderItemV2.senderCompany) &&
                Objects.equals(senderEmail, folderItemV2.senderEmail) &&
                Objects.equals(senderName, folderItemV2.senderName) &&
                Objects.equals(senderUserId, folderItemV2.senderUserId) &&
                Objects.equals(sentDateTime, folderItemV2.sentDateTime) &&
                Objects.equals(status, folderItemV2.status) &&
                Objects.equals(subject, folderItemV2.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(completedDateTime, createdDateTime, envelopeId, envelopeUri, expireDateTime, folderId, folderUri, is21CFRPart11, isSignatureProviderEnvelope, lastModifiedDateTime, ownerName, recipients, recipientsUri, senderCompany, senderEmail, senderName, senderUserId, sentDateTime, status, subject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FolderItemV2 {\n");

        sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
        sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
        sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
        sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
        sb.append("    expireDateTime: ").append(toIndentedString(expireDateTime)).append("\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    folderUri: ").append(toIndentedString(folderUri)).append("\n");
        sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
        sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
        sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    recipientsUri: ").append(toIndentedString(recipientsUri)).append("\n");
        sb.append("    senderCompany: ").append(toIndentedString(senderCompany)).append("\n");
        sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
        sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
        sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
        sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
