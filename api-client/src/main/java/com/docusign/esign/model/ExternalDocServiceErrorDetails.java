package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ExternalDocServiceErrorDetails implements Serializable {

    @SerializedName("authenticationUrl")
    private String authenticationUrl = null;

    @SerializedName("errorCode")
    private String errorCode = null;

    @SerializedName("message")
    private String message = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getAuthenticationUrl() {
        return authenticationUrl;
    }

    public void setAuthenticationUrl(String authenticationUrl) {
        this.authenticationUrl = authenticationUrl;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalDocServiceErrorDetails externalDocServiceErrorDetails = (ExternalDocServiceErrorDetails) o;
        return Objects.equals(authenticationUrl, externalDocServiceErrorDetails.authenticationUrl) &&
                Objects.equals(errorCode, externalDocServiceErrorDetails.errorCode) &&
                Objects.equals(message, externalDocServiceErrorDetails.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationUrl, errorCode, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalDocServiceErrorDetails {\n");

        sb.append("    authenticationUrl: ").append(toIndentedString(authenticationUrl)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
