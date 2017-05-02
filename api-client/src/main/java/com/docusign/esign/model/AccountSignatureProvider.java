package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class AccountSignatureProvider implements Serializable {

    @SerializedName("isRequired")
    private String isRequired = null;

    @SerializedName("priority")
    private String priority = null;

    @SerializedName("signatureProviderDisplayName")
    private String signatureProviderDisplayName = null;

    @SerializedName("signatureProviderId")
    private String signatureProviderId = null;

    @SerializedName("signatureProviderName")
    private String signatureProviderName = null;

    @SerializedName("signatureProviderOptionsMetadata")
    private java.util.List<AccountSignatureProviderOption> signatureProviderOptionsMetadata = new java.util.ArrayList<AccountSignatureProviderOption>();

    @SerializedName("signatureProviderRequiredOptions")
    private java.util.List<SignatureProviderRequiredOption> signatureProviderRequiredOptions = new java.util.ArrayList<SignatureProviderRequiredOption>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(String isRequired) {
        this.isRequired = isRequired;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSignatureProviderDisplayName() {
        return signatureProviderDisplayName;
    }

    public void setSignatureProviderDisplayName(String signatureProviderDisplayName) {
        this.signatureProviderDisplayName = signatureProviderDisplayName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSignatureProviderId() {
        return signatureProviderId;
    }

    public void setSignatureProviderId(String signatureProviderId) {
        this.signatureProviderId = signatureProviderId;
    }


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
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<AccountSignatureProviderOption> getSignatureProviderOptionsMetadata() {
        return signatureProviderOptionsMetadata;
    }

    public void setSignatureProviderOptionsMetadata(java.util.List<AccountSignatureProviderOption> signatureProviderOptionsMetadata) {
        this.signatureProviderOptionsMetadata = signatureProviderOptionsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<SignatureProviderRequiredOption> getSignatureProviderRequiredOptions() {
        return signatureProviderRequiredOptions;
    }

    public void setSignatureProviderRequiredOptions(java.util.List<SignatureProviderRequiredOption> signatureProviderRequiredOptions) {
        this.signatureProviderRequiredOptions = signatureProviderRequiredOptions;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountSignatureProvider accountSignatureProvider = (AccountSignatureProvider) o;
        return Objects.equals(isRequired, accountSignatureProvider.isRequired) &&
                Objects.equals(priority, accountSignatureProvider.priority) &&
                Objects.equals(signatureProviderDisplayName, accountSignatureProvider.signatureProviderDisplayName) &&
                Objects.equals(signatureProviderId, accountSignatureProvider.signatureProviderId) &&
                Objects.equals(signatureProviderName, accountSignatureProvider.signatureProviderName) &&
                Objects.equals(signatureProviderOptionsMetadata, accountSignatureProvider.signatureProviderOptionsMetadata) &&
                Objects.equals(signatureProviderRequiredOptions, accountSignatureProvider.signatureProviderRequiredOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isRequired, priority, signatureProviderDisplayName, signatureProviderId, signatureProviderName, signatureProviderOptionsMetadata, signatureProviderRequiredOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountSignatureProvider {\n");

        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    signatureProviderDisplayName: ").append(toIndentedString(signatureProviderDisplayName)).append("\n");
        sb.append("    signatureProviderId: ").append(toIndentedString(signatureProviderId)).append("\n");
        sb.append("    signatureProviderName: ").append(toIndentedString(signatureProviderName)).append("\n");
        sb.append("    signatureProviderOptionsMetadata: ").append(toIndentedString(signatureProviderOptionsMetadata)).append("\n");
        sb.append("    signatureProviderRequiredOptions: ").append(toIndentedString(signatureProviderRequiredOptions)).append("\n");
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
