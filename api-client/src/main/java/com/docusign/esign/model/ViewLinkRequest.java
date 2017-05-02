package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ViewLinkRequest implements Serializable {

    @SerializedName("email")
    private String email = null;

    @SerializedName("returnUrl")
    private String returnUrl = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
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
        ViewLinkRequest viewLinkRequest = (ViewLinkRequest) o;
        return Objects.equals(email, viewLinkRequest.email) &&
                Objects.equals(returnUrl, viewLinkRequest.returnUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, returnUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ViewLinkRequest {\n");

        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
