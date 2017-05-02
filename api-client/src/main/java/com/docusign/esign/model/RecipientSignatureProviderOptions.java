package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class RecipientSignatureProviderOptions implements Serializable {

    @SerializedName("cpfNumber")
    private String cpfNumber = null;

    @SerializedName("oneTimePassword")
    private String oneTimePassword = null;

    @SerializedName("signerRole")
    private String signerRole = null;

    @SerializedName("sms")
    private String sms = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCpfNumber() {
        return cpfNumber;
    }

    public void setCpfNumber(String cpfNumber) {
        this.cpfNumber = cpfNumber;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getOneTimePassword() {
        return oneTimePassword;
    }

    public void setOneTimePassword(String oneTimePassword) {
        this.oneTimePassword = oneTimePassword;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSignerRole() {
        return signerRole;
    }

    public void setSignerRole(String signerRole) {
        this.signerRole = signerRole;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecipientSignatureProviderOptions recipientSignatureProviderOptions = (RecipientSignatureProviderOptions) o;
        return Objects.equals(cpfNumber, recipientSignatureProviderOptions.cpfNumber) &&
                Objects.equals(oneTimePassword, recipientSignatureProviderOptions.oneTimePassword) &&
                Objects.equals(signerRole, recipientSignatureProviderOptions.signerRole) &&
                Objects.equals(sms, recipientSignatureProviderOptions.sms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpfNumber, oneTimePassword, signerRole, sms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecipientSignatureProviderOptions {\n");

        sb.append("    cpfNumber: ").append(toIndentedString(cpfNumber)).append("\n");
        sb.append("    oneTimePassword: ").append(toIndentedString(oneTimePassword)).append("\n");
        sb.append("    signerRole: ").append(toIndentedString(signerRole)).append("\n");
        sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
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
