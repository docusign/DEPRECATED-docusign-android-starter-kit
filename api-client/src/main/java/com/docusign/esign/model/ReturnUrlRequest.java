package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ReturnUrlRequest implements Serializable {

    @SerializedName("returnUrl")
    private String returnUrl = null;


    /**
     * Identifies the return point after sending the envelope. DocuSign returns to the URL and includes an event parameter that can be used to redirect the recipient to another location. The possible event parameters returned are: \n\n* send (user sends the envelope)\n* save (user saves the envelope)\n* cancel (user cancels the sending transaction. No envelopeId is returned in this case.)\n* error (there is an error when performing the send)\n* sessionEnd (the sending session ends before the user completes another action).
     **/
    @ApiModelProperty(value = "Identifies the return point after sending the envelope. DocuSign returns to the URL and includes an event parameter that can be used to redirect the recipient to another location. The possible event parameters returned are: \n\n* send (user sends the envelope)\n* save (user saves the envelope)\n* cancel (user cancels the sending transaction. No envelopeId is returned in this case.)\n* error (there is an error when performing the send)\n* sessionEnd (the sending session ends before the user completes another action).")
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
        ReturnUrlRequest returnUrlRequest = (ReturnUrlRequest) o;
        return Objects.equals(returnUrl, returnUrlRequest.returnUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReturnUrlRequest {\n");

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
