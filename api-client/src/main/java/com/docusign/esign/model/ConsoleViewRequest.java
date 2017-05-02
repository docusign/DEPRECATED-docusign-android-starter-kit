package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ConsoleViewRequest implements Serializable {

    @SerializedName("envelopeId")
    private String envelopeId = null;

    @SerializedName("returnUrl")
    private String returnUrl = null;


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
     * The URL to be redirected to after the console view session has ended.
     **/
    @ApiModelProperty(value = "The URL to be redirected to after the console view session has ended.")
    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsoleViewRequest consoleViewRequest = (ConsoleViewRequest) o;
        return Objects.equals(envelopeId, consoleViewRequest.envelopeId) &&
                Objects.equals(returnUrl, consoleViewRequest.returnUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envelopeId, returnUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsoleViewRequest {\n");

        sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
        sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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
