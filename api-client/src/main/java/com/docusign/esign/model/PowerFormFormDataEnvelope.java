package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PowerFormFormDataEnvelope implements Serializable {

    @SerializedName("envelopeId")
    private String envelopeId = null;

    @SerializedName("recipients")
    private java.util.List<PowerFormFormDataRecipient> recipients = new java.util.ArrayList<PowerFormFormDataRecipient>();


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
     * An array of powerform recipients.
     **/
    @ApiModelProperty(value = "An array of powerform recipients.")
    public java.util.List<PowerFormFormDataRecipient> getRecipients() {
        return recipients;
    }

    public void setRecipients(java.util.List<PowerFormFormDataRecipient> recipients) {
        this.recipients = recipients;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PowerFormFormDataEnvelope powerFormFormDataEnvelope = (PowerFormFormDataEnvelope) o;
        return Objects.equals(envelopeId, powerFormFormDataEnvelope.envelopeId) &&
                Objects.equals(recipients, powerFormFormDataEnvelope.recipients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envelopeId, recipients);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PowerFormFormDataEnvelope {\n");

        sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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
