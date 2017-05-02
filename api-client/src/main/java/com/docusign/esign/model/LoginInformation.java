package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class LoginInformation implements Serializable {

    @SerializedName("apiPassword")
    private String apiPassword = null;

    @SerializedName("loginAccounts")
    private java.util.List<LoginAccount> loginAccounts = new java.util.ArrayList<LoginAccount>();


    /**
     * Contains a token that can be used for authentication in API calls instead of using the user name and password. Only returned if the `api_password=true` query string is added to the URL.
     **/
    @ApiModelProperty(value = "Contains a token that can be used for authentication in API calls instead of using the user name and password. Only returned if the `api_password=true` query string is added to the URL.")
    public String getApiPassword() {
        return apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
    }


    /**
     * The list of accounts that authenticating user is a member of.
     **/
    @ApiModelProperty(value = "The list of accounts that authenticating user is a member of.")
    public java.util.List<LoginAccount> getLoginAccounts() {
        return loginAccounts;
    }

    public void setLoginAccounts(java.util.List<LoginAccount> loginAccounts) {
        this.loginAccounts = loginAccounts;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginInformation loginInformation = (LoginInformation) o;
        return Objects.equals(apiPassword, loginInformation.apiPassword) &&
                Objects.equals(loginAccounts, loginInformation.loginAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiPassword, loginAccounts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginInformation {\n");

        sb.append("    apiPassword: ").append(toIndentedString(apiPassword)).append("\n");
        sb.append("    loginAccounts: ").append(toIndentedString(loginAccounts)).append("\n");
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
