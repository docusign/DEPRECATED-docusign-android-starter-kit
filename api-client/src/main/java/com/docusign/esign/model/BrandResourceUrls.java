package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BrandResourceUrls implements Serializable {

    @SerializedName("email")
    private String email = null;

    @SerializedName("sending")
    private String sending = null;

    @SerializedName("signing")
    private String signing = null;

    @SerializedName("signingCaptive")
    private String signingCaptive = null;


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
    public String getSending() {
        return sending;
    }

    public void setSending(String sending) {
        this.sending = sending;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSigning() {
        return signing;
    }

    public void setSigning(String signing) {
        this.signing = signing;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSigningCaptive() {
        return signingCaptive;
    }

    public void setSigningCaptive(String signingCaptive) {
        this.signingCaptive = signingCaptive;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandResourceUrls brandResourceUrls = (BrandResourceUrls) o;
        return Objects.equals(email, brandResourceUrls.email) &&
                Objects.equals(sending, brandResourceUrls.sending) &&
                Objects.equals(signing, brandResourceUrls.signing) &&
                Objects.equals(signingCaptive, brandResourceUrls.signingCaptive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, sending, signing, signingCaptive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandResourceUrls {\n");

        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    sending: ").append(toIndentedString(sending)).append("\n");
        sb.append("    signing: ").append(toIndentedString(signing)).append("\n");
        sb.append("    signingCaptive: ").append(toIndentedString(signingCaptive)).append("\n");
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
