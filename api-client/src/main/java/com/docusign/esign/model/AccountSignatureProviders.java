package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class AccountSignatureProviders implements Serializable {

    @SerializedName("signatureProviders")
    private java.util.List<AccountSignatureProvider> signatureProviders = new java.util.ArrayList<AccountSignatureProvider>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<AccountSignatureProvider> getSignatureProviders() {
        return signatureProviders;
    }

    public void setSignatureProviders(java.util.List<AccountSignatureProvider> signatureProviders) {
        this.signatureProviders = signatureProviders;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountSignatureProviders accountSignatureProviders = (AccountSignatureProviders) o;
        return Objects.equals(signatureProviders, accountSignatureProviders.signatureProviders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signatureProviders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountSignatureProviders {\n");

        sb.append("    signatureProviders: ").append(toIndentedString(signatureProviders)).append("\n");
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
