package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeFormData implements Serializable {

    @SerializedName("emailSubject")
    private String emailSubject = null;

    @SerializedName("envelopeId")
    private String envelopeId = null;

    @SerializedName("formData")
    private java.util.List<NameValue> formData = new java.util.ArrayList<NameValue>();

    @SerializedName("recipientFormData")
    private java.util.List<RecipientFormData> recipientFormData = new java.util.ArrayList<RecipientFormData>();

    @SerializedName("sentDateTime")
    private String sentDateTime = null;

    @SerializedName("status")
    private String status = null;


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
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<NameValue> getFormData() {
        return formData;
    }

    public void setFormData(java.util.List<NameValue> formData) {
        this.formData = formData;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<RecipientFormData> getRecipientFormData() {
        return recipientFormData;
    }

    public void setRecipientFormData(java.util.List<RecipientFormData> recipientFormData) {
        this.recipientFormData = recipientFormData;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeFormData envelopeFormData = (EnvelopeFormData) o;
        return Objects.equals(emailSubject, envelopeFormData.emailSubject) &&
                Objects.equals(envelopeId, envelopeFormData.envelopeId) &&
                Objects.equals(formData, envelopeFormData.formData) &&
                Objects.equals(recipientFormData, envelopeFormData.recipientFormData) &&
                Objects.equals(sentDateTime, envelopeFormData.sentDateTime) &&
                Objects.equals(status, envelopeFormData.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailSubject, envelopeId, formData, recipientFormData, sentDateTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeFormData {\n");

        sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
        sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
        sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
        sb.append("    recipientFormData: ").append(toIndentedString(recipientFormData)).append("\n");
        sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
