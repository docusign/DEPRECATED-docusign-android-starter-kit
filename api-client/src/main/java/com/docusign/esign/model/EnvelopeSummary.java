package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeSummary implements Serializable {

    @SerializedName("envelopeId")
    private String envelopeId = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("statusDateTime")
    private String statusDateTime = null;

    @SerializedName("uri")
    private String uri = null;


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
     * The DateTime that the envelope changed status (i.e. was created or sent.)
     **/
    @ApiModelProperty(value = "The DateTime that the envelope changed status (i.e. was created or sent.)")
    public String getStatusDateTime() {
        return statusDateTime;
    }

    public void setStatusDateTime(String statusDateTime) {
        this.statusDateTime = statusDateTime;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeSummary envelopeSummary = (EnvelopeSummary) o;
        return Objects.equals(envelopeId, envelopeSummary.envelopeId) &&
                Objects.equals(status, envelopeSummary.status) &&
                Objects.equals(statusDateTime, envelopeSummary.statusDateTime) &&
                Objects.equals(uri, envelopeSummary.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envelopeId, status, statusDateTime, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeSummary {\n");

        sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusDateTime: ").append(toIndentedString(statusDateTime)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
