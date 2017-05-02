package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class CorrectViewRequest implements Serializable {

    @SerializedName("returnUrl")
    private String returnUrl = null;

    @SerializedName("suppressNavigation")
    private String suppressNavigation = null;


    /**
     * The url used after correct/send view session has ended. DocuSign redirects to the url and includes an event parameter that can be used by your app. The event parameters returned are: \n\n* send (user corrected and sent the envelope)\n* save (user saved the envelope)\n* cancel (user canceled the transaction.)\n* error (there was an error when performing the correct or send)\n* sessionEnd (the session ended before the user completed a different action)\n\n###### Note: Include https:// in the URL or the redirect might not succeed on some browsers.
     **/
    @ApiModelProperty(value = "The url used after correct/send view session has ended. DocuSign redirects to the url and includes an event parameter that can be used by your app. The event parameters returned are: \n\n* send (user corrected and sent the envelope)\n* save (user saved the envelope)\n* cancel (user canceled the transaction.)\n* error (there was an error when performing the correct or send)\n* sessionEnd (the session ended before the user completed a different action)\n\n###### Note: Include https:// in the URL or the redirect might not succeed on some browsers. ")
    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }


    /**
     * Specifies whether the window is displayed with or without dressing.
     **/
    @ApiModelProperty(value = "Specifies whether the window is displayed with or without dressing.")
    public String getSuppressNavigation() {
        return suppressNavigation;
    }

    public void setSuppressNavigation(String suppressNavigation) {
        this.suppressNavigation = suppressNavigation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorrectViewRequest correctViewRequest = (CorrectViewRequest) o;
        return Objects.equals(returnUrl, correctViewRequest.returnUrl) &&
                Objects.equals(suppressNavigation, correctViewRequest.suppressNavigation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnUrl, suppressNavigation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorrectViewRequest {\n");

        sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
        sb.append("    suppressNavigation: ").append(toIndentedString(suppressNavigation)).append("\n");
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
