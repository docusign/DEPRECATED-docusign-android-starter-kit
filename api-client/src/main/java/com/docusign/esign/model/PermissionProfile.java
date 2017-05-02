package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PermissionProfile implements Serializable {

    @SerializedName("modifiedByUsername")
    private String modifiedByUsername = null;

    @SerializedName("modifiedDateTime")
    private String modifiedDateTime = null;

    @SerializedName("permissionProfileId")
    private String permissionProfileId = null;

    @SerializedName("permissionProfileName")
    private String permissionProfileName = null;

    @SerializedName("settings")
    private AccountRoleSettings settings = null;

    @SerializedName("userCount")
    private String userCount = null;

    @SerializedName("users")
    private java.util.List<UserInformation> users = new java.util.ArrayList<UserInformation>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getModifiedByUsername() {
        return modifiedByUsername;
    }

    public void setModifiedByUsername(String modifiedByUsername) {
        this.modifiedByUsername = modifiedByUsername;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getModifiedDateTime() {
        return modifiedDateTime;
    }

    public void setModifiedDateTime(String modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPermissionProfileId() {
        return permissionProfileId;
    }

    public void setPermissionProfileId(String permissionProfileId) {
        this.permissionProfileId = permissionProfileId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPermissionProfileName() {
        return permissionProfileName;
    }

    public void setPermissionProfileName(String permissionProfileName) {
        this.permissionProfileName = permissionProfileName;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public AccountRoleSettings getSettings() {
        return settings;
    }

    public void setSettings(AccountRoleSettings settings) {
        this.settings = settings;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUserCount() {
        return userCount;
    }

    public void setUserCount(String userCount) {
        this.userCount = userCount;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<UserInformation> getUsers() {
        return users;
    }

    public void setUsers(java.util.List<UserInformation> users) {
        this.users = users;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PermissionProfile permissionProfile = (PermissionProfile) o;
        return Objects.equals(modifiedByUsername, permissionProfile.modifiedByUsername) &&
                Objects.equals(modifiedDateTime, permissionProfile.modifiedDateTime) &&
                Objects.equals(permissionProfileId, permissionProfile.permissionProfileId) &&
                Objects.equals(permissionProfileName, permissionProfile.permissionProfileName) &&
                Objects.equals(settings, permissionProfile.settings) &&
                Objects.equals(userCount, permissionProfile.userCount) &&
                Objects.equals(users, permissionProfile.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modifiedByUsername, modifiedDateTime, permissionProfileId, permissionProfileName, settings, userCount, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionProfile {\n");

        sb.append("    modifiedByUsername: ").append(toIndentedString(modifiedByUsername)).append("\n");
        sb.append("    modifiedDateTime: ").append(toIndentedString(modifiedDateTime)).append("\n");
        sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
        sb.append("    permissionProfileName: ").append(toIndentedString(permissionProfileName)).append("\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
        sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
