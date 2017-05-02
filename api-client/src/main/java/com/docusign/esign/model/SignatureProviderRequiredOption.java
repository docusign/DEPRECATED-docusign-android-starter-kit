package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class SignatureProviderRequiredOption implements Serializable {

    @SerializedName("requiredSignatureProviderOptionIds")
    private java.util.List<String> requiredSignatureProviderOptionIds = new java.util.ArrayList<String>();

    @SerializedName("signerType")
    private String signerType = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<String> getRequiredSignatureProviderOptionIds() {
        return requiredSignatureProviderOptionIds;
    }

    public void setRequiredSignatureProviderOptionIds(java.util.List<String> requiredSignatureProviderOptionIds) {
        this.requiredSignatureProviderOptionIds = requiredSignatureProviderOptionIds;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSignerType() {
        return signerType;
    }

    public void setSignerType(String signerType) {
        this.signerType = signerType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SignatureProviderRequiredOption signatureProviderRequiredOption = (SignatureProviderRequiredOption) o;
        return Objects.equals(requiredSignatureProviderOptionIds, signatureProviderRequiredOption.requiredSignatureProviderOptionIds) &&
                Objects.equals(signerType, signatureProviderRequiredOption.signerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requiredSignatureProviderOptionIds, signerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignatureProviderRequiredOption {\n");

        sb.append("    requiredSignatureProviderOptionIds: ").append(toIndentedString(requiredSignatureProviderOptionIds)).append("\n");
        sb.append("    signerType: ").append(toIndentedString(signerType)).append("\n");
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
