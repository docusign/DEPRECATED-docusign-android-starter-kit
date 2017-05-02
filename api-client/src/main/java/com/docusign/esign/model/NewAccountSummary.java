package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class NewAccountSummary implements Serializable {

    @SerializedName("accountId")
    private String accountId = null;

    @SerializedName("accountIdGuid")
    private String accountIdGuid = null;

    @SerializedName("accountName")
    private String accountName = null;

    @SerializedName("apiPassword")
    private String apiPassword = null;

    @SerializedName("baseUrl")
    private String baseUrl = null;

    @SerializedName("billingPlanPreview")
    private BillingPlanPreview billingPlanPreview = null;

    @SerializedName("userId")
    private String userId = null;


    /**
     * The account ID associated with the envelope.
     **/
    @ApiModelProperty(value = "The account ID associated with the envelope.")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    /**
     * The GUID associated with the account ID.
     **/
    @ApiModelProperty(value = "The GUID associated with the account ID.")
    public String getAccountIdGuid() {
        return accountIdGuid;
    }

    public void setAccountIdGuid(String accountIdGuid) {
        this.accountIdGuid = accountIdGuid;
    }


    /**
     * The account name for the new account.
     **/
    @ApiModelProperty(value = "The account name for the new account.")
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    /**
     * Contains a token that can be used for authentication in API calls instead of using the user name and password.
     **/
    @ApiModelProperty(value = "Contains a token that can be used for authentication in API calls instead of using the user name and password.")
    public String getApiPassword() {
        return apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
    }


    /**
     * The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located, and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.
     **/
    @ApiModelProperty(value = "The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located, and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.")
    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public BillingPlanPreview getBillingPlanPreview() {
        return billingPlanPreview;
    }

    public void setBillingPlanPreview(BillingPlanPreview billingPlanPreview) {
        this.billingPlanPreview = billingPlanPreview;
    }


    /**
     * Specifies the user ID of the new user.
     **/
    @ApiModelProperty(value = "Specifies the user ID of the new user.")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NewAccountSummary newAccountSummary = (NewAccountSummary) o;
        return Objects.equals(accountId, newAccountSummary.accountId) &&
                Objects.equals(accountIdGuid, newAccountSummary.accountIdGuid) &&
                Objects.equals(accountName, newAccountSummary.accountName) &&
                Objects.equals(apiPassword, newAccountSummary.apiPassword) &&
                Objects.equals(baseUrl, newAccountSummary.baseUrl) &&
                Objects.equals(billingPlanPreview, newAccountSummary.billingPlanPreview) &&
                Objects.equals(userId, newAccountSummary.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountIdGuid, accountName, apiPassword, baseUrl, billingPlanPreview, userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewAccountSummary {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountIdGuid: ").append(toIndentedString(accountIdGuid)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    apiPassword: ").append(toIndentedString(apiPassword)).append("\n");
        sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
        sb.append("    billingPlanPreview: ").append(toIndentedString(billingPlanPreview)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
