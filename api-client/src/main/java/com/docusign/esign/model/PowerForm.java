package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PowerForm implements Serializable {

    @SerializedName("createdDateTime")
    private String createdDateTime = null;

    @SerializedName("emailBody")
    private String emailBody = null;

    @SerializedName("emailSubject")
    private String emailSubject = null;

    @SerializedName("envelopes")
    private java.util.List<Envelope> envelopes = new java.util.ArrayList<Envelope>();

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("instructions")
    private String instructions = null;

    @SerializedName("isActive")
    private String isActive = null;

    @SerializedName("lastUsed")
    private String lastUsed = null;

    @SerializedName("limitUseInterval")
    private String limitUseInterval = null;

    @SerializedName("limitUseIntervalEnabled")
    private String limitUseIntervalEnabled = null;

    @SerializedName("limitUseIntervalUnits")
    private String limitUseIntervalUnits = null;

    @SerializedName("maxUseEnabled")
    private String maxUseEnabled = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("powerFormId")
    private String powerFormId = null;

    @SerializedName("powerFormUrl")
    private String powerFormUrl = null;

    @SerializedName("recipients")
    private java.util.List<PowerFormRecipient> recipients = new java.util.ArrayList<PowerFormRecipient>();

    @SerializedName("senderName")
    private String senderName = null;

    @SerializedName("senderUserId")
    private String senderUserId = null;

    @SerializedName("signingMode")
    private String signingMode = null;

    @SerializedName("templateId")
    private String templateId = null;

    @SerializedName("templateName")
    private String templateName = null;

    @SerializedName("timesUsed")
    private String timesUsed = null;

    @SerializedName("uri")
    private String uri = null;

    @SerializedName("usesRemaining")
    private String usesRemaining = null;


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
     * Specifies the email body of the message sent to the recipient. \n\nMaximum length: 10000 characters.
     **/
    @ApiModelProperty(value = "Specifies the email body of the message sent to the recipient. \n\nMaximum length: 10000 characters. ")
    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
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
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<Envelope> getEnvelopes() {
        return envelopes;
    }

    public void setEnvelopes(java.util.List<Envelope> envelopes) {
        this.envelopes = envelopes;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(String lastUsed) {
        this.lastUsed = lastUsed;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getLimitUseInterval() {
        return limitUseInterval;
    }

    public void setLimitUseInterval(String limitUseInterval) {
        this.limitUseInterval = limitUseInterval;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getLimitUseIntervalEnabled() {
        return limitUseIntervalEnabled;
    }

    public void setLimitUseIntervalEnabled(String limitUseIntervalEnabled) {
        this.limitUseIntervalEnabled = limitUseIntervalEnabled;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getLimitUseIntervalUnits() {
        return limitUseIntervalUnits;
    }

    public void setLimitUseIntervalUnits(String limitUseIntervalUnits) {
        this.limitUseIntervalUnits = limitUseIntervalUnits;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getMaxUseEnabled() {
        return maxUseEnabled;
    }

    public void setMaxUseEnabled(String maxUseEnabled) {
        this.maxUseEnabled = maxUseEnabled;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPowerFormId() {
        return powerFormId;
    }

    public void setPowerFormId(String powerFormId) {
        this.powerFormId = powerFormId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPowerFormUrl() {
        return powerFormUrl;
    }

    public void setPowerFormUrl(String powerFormUrl) {
        this.powerFormUrl = powerFormUrl;
    }


    /**
     * An array of powerform recipients.
     **/
    @ApiModelProperty(value = "An array of powerform recipients.")
    public java.util.List<PowerFormRecipient> getRecipients() {
        return recipients;
    }

    public void setRecipients(java.util.List<PowerFormRecipient> recipients) {
        this.recipients = recipients;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getSigningMode() {
        return signingMode;
    }

    public void setSigningMode(String signingMode) {
        this.signingMode = signingMode;
    }


    /**
     * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
     **/
    @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTimesUsed() {
        return timesUsed;
    }

    public void setTimesUsed(String timesUsed) {
        this.timesUsed = timesUsed;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUsesRemaining() {
        return usesRemaining;
    }

    public void setUsesRemaining(String usesRemaining) {
        this.usesRemaining = usesRemaining;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PowerForm powerForm = (PowerForm) o;
        return Objects.equals(createdDateTime, powerForm.createdDateTime) &&
                Objects.equals(emailBody, powerForm.emailBody) &&
                Objects.equals(emailSubject, powerForm.emailSubject) &&
                Objects.equals(envelopes, powerForm.envelopes) &&
                Objects.equals(errorDetails, powerForm.errorDetails) &&
                Objects.equals(instructions, powerForm.instructions) &&
                Objects.equals(isActive, powerForm.isActive) &&
                Objects.equals(lastUsed, powerForm.lastUsed) &&
                Objects.equals(limitUseInterval, powerForm.limitUseInterval) &&
                Objects.equals(limitUseIntervalEnabled, powerForm.limitUseIntervalEnabled) &&
                Objects.equals(limitUseIntervalUnits, powerForm.limitUseIntervalUnits) &&
                Objects.equals(maxUseEnabled, powerForm.maxUseEnabled) &&
                Objects.equals(name, powerForm.name) &&
                Objects.equals(powerFormId, powerForm.powerFormId) &&
                Objects.equals(powerFormUrl, powerForm.powerFormUrl) &&
                Objects.equals(recipients, powerForm.recipients) &&
                Objects.equals(senderName, powerForm.senderName) &&
                Objects.equals(senderUserId, powerForm.senderUserId) &&
                Objects.equals(signingMode, powerForm.signingMode) &&
                Objects.equals(templateId, powerForm.templateId) &&
                Objects.equals(templateName, powerForm.templateName) &&
                Objects.equals(timesUsed, powerForm.timesUsed) &&
                Objects.equals(uri, powerForm.uri) &&
                Objects.equals(usesRemaining, powerForm.usesRemaining);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdDateTime, emailBody, emailSubject, envelopes, errorDetails, instructions, isActive, lastUsed, limitUseInterval, limitUseIntervalEnabled, limitUseIntervalUnits, maxUseEnabled, name, powerFormId, powerFormUrl, recipients, senderName, senderUserId, signingMode, templateId, templateName, timesUsed, uri, usesRemaining);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PowerForm {\n");

        sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
        sb.append("    emailBody: ").append(toIndentedString(emailBody)).append("\n");
        sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
        sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
        sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
        sb.append("    limitUseInterval: ").append(toIndentedString(limitUseInterval)).append("\n");
        sb.append("    limitUseIntervalEnabled: ").append(toIndentedString(limitUseIntervalEnabled)).append("\n");
        sb.append("    limitUseIntervalUnits: ").append(toIndentedString(limitUseIntervalUnits)).append("\n");
        sb.append("    maxUseEnabled: ").append(toIndentedString(maxUseEnabled)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    powerFormId: ").append(toIndentedString(powerFormId)).append("\n");
        sb.append("    powerFormUrl: ").append(toIndentedString(powerFormUrl)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
        sb.append("    senderUserId: ").append(toIndentedString(senderUserId)).append("\n");
        sb.append("    signingMode: ").append(toIndentedString(signingMode)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    timesUsed: ").append(toIndentedString(timesUsed)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    usesRemaining: ").append(toIndentedString(usesRemaining)).append("\n");
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
