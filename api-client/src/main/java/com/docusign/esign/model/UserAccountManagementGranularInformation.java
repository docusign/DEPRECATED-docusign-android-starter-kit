package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class UserAccountManagementGranularInformation implements Serializable {

    @SerializedName("canManageAdmins")
    private String canManageAdmins = null;

    @SerializedName("canManageAdminsMetadata")
    private SettingsMetadata canManageAdminsMetadata = null;

    @SerializedName("canManageGroups")
    private String canManageGroups = null;

    @SerializedName("canManageGroupsMetadata")
    private SettingsMetadata canManageGroupsMetadata = null;

    @SerializedName("canManageSharing")
    private String canManageSharing = null;

    @SerializedName("canManageSharingMetadata")
    private SettingsMetadata canManageSharingMetadata = null;

    @SerializedName("canManageUsers")
    private String canManageUsers = null;

    @SerializedName("canManageUsersMetadata")
    private SettingsMetadata canManageUsersMetadata = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCanManageAdmins() {
        return canManageAdmins;
    }

    public void setCanManageAdmins(String canManageAdmins) {
        this.canManageAdmins = canManageAdmins;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getCanManageAdminsMetadata() {
        return canManageAdminsMetadata;
    }

    public void setCanManageAdminsMetadata(SettingsMetadata canManageAdminsMetadata) {
        this.canManageAdminsMetadata = canManageAdminsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCanManageGroups() {
        return canManageGroups;
    }

    public void setCanManageGroups(String canManageGroups) {
        this.canManageGroups = canManageGroups;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getCanManageGroupsMetadata() {
        return canManageGroupsMetadata;
    }

    public void setCanManageGroupsMetadata(SettingsMetadata canManageGroupsMetadata) {
        this.canManageGroupsMetadata = canManageGroupsMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCanManageSharing() {
        return canManageSharing;
    }

    public void setCanManageSharing(String canManageSharing) {
        this.canManageSharing = canManageSharing;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getCanManageSharingMetadata() {
        return canManageSharingMetadata;
    }

    public void setCanManageSharingMetadata(SettingsMetadata canManageSharingMetadata) {
        this.canManageSharingMetadata = canManageSharingMetadata;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCanManageUsers() {
        return canManageUsers;
    }

    public void setCanManageUsers(String canManageUsers) {
        this.canManageUsers = canManageUsers;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SettingsMetadata getCanManageUsersMetadata() {
        return canManageUsersMetadata;
    }

    public void setCanManageUsersMetadata(SettingsMetadata canManageUsersMetadata) {
        this.canManageUsersMetadata = canManageUsersMetadata;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserAccountManagementGranularInformation userAccountManagementGranularInformation = (UserAccountManagementGranularInformation) o;
        return Objects.equals(canManageAdmins, userAccountManagementGranularInformation.canManageAdmins) &&
                Objects.equals(canManageAdminsMetadata, userAccountManagementGranularInformation.canManageAdminsMetadata) &&
                Objects.equals(canManageGroups, userAccountManagementGranularInformation.canManageGroups) &&
                Objects.equals(canManageGroupsMetadata, userAccountManagementGranularInformation.canManageGroupsMetadata) &&
                Objects.equals(canManageSharing, userAccountManagementGranularInformation.canManageSharing) &&
                Objects.equals(canManageSharingMetadata, userAccountManagementGranularInformation.canManageSharingMetadata) &&
                Objects.equals(canManageUsers, userAccountManagementGranularInformation.canManageUsers) &&
                Objects.equals(canManageUsersMetadata, userAccountManagementGranularInformation.canManageUsersMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canManageAdmins, canManageAdminsMetadata, canManageGroups, canManageGroupsMetadata, canManageSharing, canManageSharingMetadata, canManageUsers, canManageUsersMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAccountManagementGranularInformation {\n");

        sb.append("    canManageAdmins: ").append(toIndentedString(canManageAdmins)).append("\n");
        sb.append("    canManageAdminsMetadata: ").append(toIndentedString(canManageAdminsMetadata)).append("\n");
        sb.append("    canManageGroups: ").append(toIndentedString(canManageGroups)).append("\n");
        sb.append("    canManageGroupsMetadata: ").append(toIndentedString(canManageGroupsMetadata)).append("\n");
        sb.append("    canManageSharing: ").append(toIndentedString(canManageSharing)).append("\n");
        sb.append("    canManageSharingMetadata: ").append(toIndentedString(canManageSharingMetadata)).append("\n");
        sb.append("    canManageUsers: ").append(toIndentedString(canManageUsers)).append("\n");
        sb.append("    canManageUsersMetadata: ").append(toIndentedString(canManageUsersMetadata)).append("\n");
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
