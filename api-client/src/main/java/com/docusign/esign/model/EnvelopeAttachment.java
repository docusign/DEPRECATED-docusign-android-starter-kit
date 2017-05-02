package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeAttachment implements Serializable {

    @SerializedName("accessControl")
    private String accessControl = null;

    @SerializedName("attachmentId")
    private String attachmentId = null;

    @SerializedName("attachmentType")
    private String attachmentType = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("label")
    private String label = null;

    @SerializedName("name")
    private String name = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(String accessControl) {
        this.accessControl = accessControl;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
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
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeAttachment envelopeAttachment = (EnvelopeAttachment) o;
        return Objects.equals(accessControl, envelopeAttachment.accessControl) &&
                Objects.equals(attachmentId, envelopeAttachment.attachmentId) &&
                Objects.equals(attachmentType, envelopeAttachment.attachmentType) &&
                Objects.equals(errorDetails, envelopeAttachment.errorDetails) &&
                Objects.equals(label, envelopeAttachment.label) &&
                Objects.equals(name, envelopeAttachment.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessControl, attachmentId, attachmentType, errorDetails, label, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeAttachment {\n");

        sb.append("    accessControl: ").append(toIndentedString(accessControl)).append("\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
        sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
