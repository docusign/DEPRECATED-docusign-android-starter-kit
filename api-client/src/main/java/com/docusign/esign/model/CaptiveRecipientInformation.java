package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class CaptiveRecipientInformation implements Serializable {

    @SerializedName("captiveRecipients")
    private java.util.List<CaptiveRecipient> captiveRecipients = new java.util.ArrayList<CaptiveRecipient>();


    /**
     * A complex type containing information about one or more captive recipients.
     **/
    @ApiModelProperty(value = "A complex type containing information about one or more captive recipients.")
    public java.util.List<CaptiveRecipient> getCaptiveRecipients() {
        return captiveRecipients;
    }

    public void setCaptiveRecipients(java.util.List<CaptiveRecipient> captiveRecipients) {
        this.captiveRecipients = captiveRecipients;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CaptiveRecipientInformation captiveRecipientInformation = (CaptiveRecipientInformation) o;
        return Objects.equals(captiveRecipients, captiveRecipientInformation.captiveRecipients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(captiveRecipients);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaptiveRecipientInformation {\n");

        sb.append("    captiveRecipients: ").append(toIndentedString(captiveRecipients)).append("\n");
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
