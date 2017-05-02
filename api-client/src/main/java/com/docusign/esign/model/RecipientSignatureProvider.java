package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class RecipientSignatureProvider implements Serializable {

    @SerializedName("signatureProviderName")
    private String signatureProviderName = null;

    @SerializedName("signatureProviderOptions")
    private RecipientSignatureProviderOptions signatureProviderOptions = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSignatureProviderName() {
        return signatureProviderName;
    }

    public void setSignatureProviderName(String signatureProviderName) {
        this.signatureProviderName = signatureProviderName;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public RecipientSignatureProviderOptions getSignatureProviderOptions() {
        return signatureProviderOptions;
    }

    public void setSignatureProviderOptions(RecipientSignatureProviderOptions signatureProviderOptions) {
        this.signatureProviderOptions = signatureProviderOptions;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecipientSignatureProvider recipientSignatureProvider = (RecipientSignatureProvider) o;
        return Objects.equals(signatureProviderName, recipientSignatureProvider.signatureProviderName) &&
                Objects.equals(signatureProviderOptions, recipientSignatureProvider.signatureProviderOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signatureProviderName, signatureProviderOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecipientSignatureProvider {\n");

        sb.append("    signatureProviderName: ").append(toIndentedString(signatureProviderName)).append("\n");
        sb.append("    signatureProviderOptions: ").append(toIndentedString(signatureProviderOptions)).append("\n");
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
