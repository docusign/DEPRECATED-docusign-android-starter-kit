package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class AccountSignatureProviderOption implements Serializable {

    @SerializedName("signatureProviderOptionDisplayName")
    private String signatureProviderOptionDisplayName = null;

    @SerializedName("signatureProviderOptionId")
    private String signatureProviderOptionId = null;

    @SerializedName("signatureProviderOptionName")
    private String signatureProviderOptionName = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSignatureProviderOptionDisplayName() {
        return signatureProviderOptionDisplayName;
    }

    public void setSignatureProviderOptionDisplayName(String signatureProviderOptionDisplayName) {
        this.signatureProviderOptionDisplayName = signatureProviderOptionDisplayName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSignatureProviderOptionId() {
        return signatureProviderOptionId;
    }

    public void setSignatureProviderOptionId(String signatureProviderOptionId) {
        this.signatureProviderOptionId = signatureProviderOptionId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSignatureProviderOptionName() {
        return signatureProviderOptionName;
    }

    public void setSignatureProviderOptionName(String signatureProviderOptionName) {
        this.signatureProviderOptionName = signatureProviderOptionName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountSignatureProviderOption accountSignatureProviderOption = (AccountSignatureProviderOption) o;
        return Objects.equals(signatureProviderOptionDisplayName, accountSignatureProviderOption.signatureProviderOptionDisplayName) &&
                Objects.equals(signatureProviderOptionId, accountSignatureProviderOption.signatureProviderOptionId) &&
                Objects.equals(signatureProviderOptionName, accountSignatureProviderOption.signatureProviderOptionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signatureProviderOptionDisplayName, signatureProviderOptionId, signatureProviderOptionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountSignatureProviderOption {\n");

        sb.append("    signatureProviderOptionDisplayName: ").append(toIndentedString(signatureProviderOptionDisplayName)).append("\n");
        sb.append("    signatureProviderOptionId: ").append(toIndentedString(signatureProviderOptionId)).append("\n");
        sb.append("    signatureProviderOptionName: ").append(toIndentedString(signatureProviderOptionName)).append("\n");
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
