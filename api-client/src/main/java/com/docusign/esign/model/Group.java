package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class Group implements Serializable {

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("groupId")
    private String groupId = null;

    @SerializedName("groupName")
    private String groupName = null;

    @SerializedName("groupType")
    private String groupType = null;

    @SerializedName("permissionProfileId")
    private String permissionProfileId = null;

    @SerializedName("users")
    private java.util.List<UserInfo> users = new java.util.ArrayList<UserInfo>();


    /**
     **/
    @ApiModelProperty(value = "")
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }


    /**
     * The DocuSign group ID for the group.
     **/
    @ApiModelProperty(value = "The DocuSign group ID for the group.")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


    /**
     * The name of the group.
     **/
    @ApiModelProperty(value = "The name of the group.")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    /**
     * The group type.
     **/
    @ApiModelProperty(value = "The group type.")
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }


    /**
     * The ID of the permission profile associated with the group.
     **/
    @ApiModelProperty(value = "The ID of the permission profile associated with the group.")
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
    public java.util.List<UserInfo> getUsers() {
        return users;
    }

    public void setUsers(java.util.List<UserInfo> users) {
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
        Group group = (Group) o;
        return Objects.equals(errorDetails, group.errorDetails) &&
                Objects.equals(groupId, group.groupId) &&
                Objects.equals(groupName, group.groupName) &&
                Objects.equals(groupType, group.groupType) &&
                Objects.equals(permissionProfileId, group.permissionProfileId) &&
                Objects.equals(users, group.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorDetails, groupId, groupName, groupType, permissionProfileId, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Group {\n");

        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
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
