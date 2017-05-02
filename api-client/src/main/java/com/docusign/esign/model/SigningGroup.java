package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class SigningGroup implements Serializable {

    @SerializedName("created")
    private String created = null;

    @SerializedName("createdBy")
    private String createdBy = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("groupEmail")
    private String groupEmail = null;

    @SerializedName("groupName")
    private String groupName = null;

    @SerializedName("groupType")
    private String groupType = null;

    @SerializedName("modified")
    private String modified = null;

    @SerializedName("modifiedBy")
    private String modifiedBy = null;

    @SerializedName("signingGroupId")
    private String signingGroupId = null;

    @SerializedName("users")
    private java.util.List<SigningGroupUser> users = new java.util.ArrayList<SigningGroupUser>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }


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
     *
     **/
    @ApiModelProperty(value = "")
    public String getGroupEmail() {
        return groupEmail;
    }

    public void setGroupEmail(String groupEmail) {
        this.groupEmail = groupEmail;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }


    /**
     * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
     **/
    @ApiModelProperty(value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
    public String getSigningGroupId() {
        return signingGroupId;
    }

    public void setSigningGroupId(String signingGroupId) {
        this.signingGroupId = signingGroupId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<SigningGroupUser> getUsers() {
        return users;
    }

    public void setUsers(java.util.List<SigningGroupUser> users) {
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
        SigningGroup signingGroup = (SigningGroup) o;
        return Objects.equals(created, signingGroup.created) &&
                Objects.equals(createdBy, signingGroup.createdBy) &&
                Objects.equals(errorDetails, signingGroup.errorDetails) &&
                Objects.equals(groupEmail, signingGroup.groupEmail) &&
                Objects.equals(groupName, signingGroup.groupName) &&
                Objects.equals(groupType, signingGroup.groupType) &&
                Objects.equals(modified, signingGroup.modified) &&
                Objects.equals(modifiedBy, signingGroup.modifiedBy) &&
                Objects.equals(signingGroupId, signingGroup.signingGroupId) &&
                Objects.equals(users, signingGroup.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(created, createdBy, errorDetails, groupEmail, groupName, groupType, modified, modifiedBy, signingGroupId, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SigningGroup {\n");

        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    groupEmail: ").append(toIndentedString(groupEmail)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
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
