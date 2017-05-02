package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class UserSettingsInformation implements Serializable {

    @SerializedName("accountManagementGranular")
    private UserAccountManagementGranularInformation accountManagementGranular = null;

    @SerializedName("senderEmailNotifications")
    private SenderEmailNotifications senderEmailNotifications = null;

    @SerializedName("signerEmailNotifications")
    private SignerEmailNotifications signerEmailNotifications = null;

    @SerializedName("userSettings")
    private java.util.List<NameValue> userSettings = new java.util.ArrayList<NameValue>();


    /**
     **/
    @ApiModelProperty(value = "")
    public UserAccountManagementGranularInformation getAccountManagementGranular() {
        return accountManagementGranular;
    }

    public void setAccountManagementGranular(UserAccountManagementGranularInformation accountManagementGranular) {
        this.accountManagementGranular = accountManagementGranular;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SenderEmailNotifications getSenderEmailNotifications() {
        return senderEmailNotifications;
    }

    public void setSenderEmailNotifications(SenderEmailNotifications senderEmailNotifications) {
        this.senderEmailNotifications = senderEmailNotifications;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SignerEmailNotifications getSignerEmailNotifications() {
        return signerEmailNotifications;
    }

    public void setSignerEmailNotifications(SignerEmailNotifications signerEmailNotifications) {
        this.signerEmailNotifications = signerEmailNotifications;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<NameValue> getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(java.util.List<NameValue> userSettings) {
        this.userSettings = userSettings;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserSettingsInformation userSettingsInformation = (UserSettingsInformation) o;
        return Objects.equals(accountManagementGranular, userSettingsInformation.accountManagementGranular) &&
                Objects.equals(senderEmailNotifications, userSettingsInformation.senderEmailNotifications) &&
                Objects.equals(signerEmailNotifications, userSettingsInformation.signerEmailNotifications) &&
                Objects.equals(userSettings, userSettingsInformation.userSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountManagementGranular, senderEmailNotifications, signerEmailNotifications, userSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserSettingsInformation {\n");

        sb.append("    accountManagementGranular: ").append(toIndentedString(accountManagementGranular)).append("\n");
        sb.append("    senderEmailNotifications: ").append(toIndentedString(senderEmailNotifications)).append("\n");
        sb.append("    signerEmailNotifications: ").append(toIndentedString(signerEmailNotifications)).append("\n");
        sb.append("    userSettings: ").append(toIndentedString(userSettings)).append("\n");
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
