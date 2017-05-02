package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains account settings information.
 **/
@ApiModel(description = "Contains account settings information.")
public class AccountSettingsInformation implements Serializable {

    @SerializedName("accountSettings")
    private java.util.List<NameValue> accountSettings = new java.util.ArrayList<NameValue>();


    /**
     * The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden.
     **/
    @ApiModelProperty(value = "The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden.")
    public java.util.List<NameValue> getAccountSettings() {
        return accountSettings;
    }

    public void setAccountSettings(java.util.List<NameValue> accountSettings) {
        this.accountSettings = accountSettings;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountSettingsInformation accountSettingsInformation = (AccountSettingsInformation) o;
        return Objects.equals(accountSettings, accountSettingsInformation.accountSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountSettingsInformation {\n");

        sb.append("    accountSettings: ").append(toIndentedString(accountSettings)).append("\n");
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
