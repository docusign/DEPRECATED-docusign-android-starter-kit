package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeAttachmentsResult implements Serializable {

    @SerializedName("attachments")
    private java.util.List<EnvelopeAttachment> attachments = new java.util.ArrayList<EnvelopeAttachment>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<EnvelopeAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(java.util.List<EnvelopeAttachment> attachments) {
        this.attachments = attachments;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeAttachmentsResult envelopeAttachmentsResult = (EnvelopeAttachmentsResult) o;
        return Objects.equals(attachments, envelopeAttachmentsResult.attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeAttachmentsResult {\n");

        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
