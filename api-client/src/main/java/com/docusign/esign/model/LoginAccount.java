package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class LoginAccount implements Serializable {

    @SerializedName("accountId")
    private String accountId = null;

    @SerializedName("accountIdGuid")
    private String accountIdGuid = null;

    @SerializedName("baseUrl")
    private String baseUrl = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("isDefault")
    private String isDefault = null;

    @SerializedName("loginAccountSettings")
    private java.util.List<NameValue> loginAccountSettings = new java.util.ArrayList<NameValue>();

    @SerializedName("loginUserSettings")
    private java.util.List<NameValue> loginUserSettings = new java.util.ArrayList<NameValue>();

    @SerializedName("name")
    private String name = null;

    @SerializedName("siteDescription")
    private String siteDescription = null;

    @SerializedName("userId")
    private String userId = null;

    @SerializedName("userName")
    private String userName = null;


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
     * The email address for the user.
     **/
    @ApiModelProperty(value = "The email address for the user.")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * This value is true if this is the default account for the user, otherwise false is returned.
     **/
    @ApiModelProperty(value = "This value is true if this is the default account for the user, otherwise false is returned.")
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * A list of settings on the acccount that indicate what features are available.
     **/
    @ApiModelProperty(value = "A list of settings on the acccount that indicate what features are available.")
    public java.util.List<NameValue> getLoginAccountSettings() {
        return loginAccountSettings;
    }

    public void setLoginAccountSettings(java.util.List<NameValue> loginAccountSettings) {
        this.loginAccountSettings = loginAccountSettings;
    }


    /**
     * A list of user-level settings that indicate what user-specific features are available.
     **/
    @ApiModelProperty(value = "A list of user-level settings that indicate what user-specific features are available.")
    public java.util.List<NameValue> getLoginUserSettings() {
        return loginUserSettings;
    }

    public void setLoginUserSettings(java.util.List<NameValue> loginUserSettings) {
        this.loginUserSettings = loginUserSettings;
    }


    /**
     * The name associated with the account.
     **/
    @ApiModelProperty(value = "The name associated with the account.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * An optional descirption of the site that hosts the account.
     **/
    @ApiModelProperty(value = "An optional descirption of the site that hosts the account.")
    public String getSiteDescription() {
        return siteDescription;
    }

    public void setSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * The name of this user as defined by the account.
     **/
    @ApiModelProperty(value = "The name of this user as defined by the account.")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginAccount loginAccount = (LoginAccount) o;
        return Objects.equals(accountId, loginAccount.accountId) &&
                Objects.equals(accountIdGuid, loginAccount.accountIdGuid) &&
                Objects.equals(baseUrl, loginAccount.baseUrl) &&
                Objects.equals(email, loginAccount.email) &&
                Objects.equals(isDefault, loginAccount.isDefault) &&
                Objects.equals(loginAccountSettings, loginAccount.loginAccountSettings) &&
                Objects.equals(loginUserSettings, loginAccount.loginUserSettings) &&
                Objects.equals(name, loginAccount.name) &&
                Objects.equals(siteDescription, loginAccount.siteDescription) &&
                Objects.equals(userId, loginAccount.userId) &&
                Objects.equals(userName, loginAccount.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountIdGuid, baseUrl, email, isDefault, loginAccountSettings, loginUserSettings, name, siteDescription, userId, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginAccount {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountIdGuid: ").append(toIndentedString(accountIdGuid)).append("\n");
        sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    loginAccountSettings: ").append(toIndentedString(loginAccountSettings)).append("\n");
        sb.append("    loginUserSettings: ").append(toIndentedString(loginUserSettings)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    siteDescription: ").append(toIndentedString(siteDescription)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
