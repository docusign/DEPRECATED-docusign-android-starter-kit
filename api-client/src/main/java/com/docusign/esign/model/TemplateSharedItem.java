package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class TemplateSharedItem implements Serializable {

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("owner")
    private UserInfo owner = null;

    @SerializedName("shared")
    private String shared = null;

    @SerializedName("sharedGroups")
    private java.util.List<MemberGroupSharedItem> sharedGroups = new java.util.ArrayList<MemberGroupSharedItem>();

    @SerializedName("sharedUsers")
    private java.util.List<UserSharedItem> sharedUsers = new java.util.ArrayList<UserSharedItem>();

    @SerializedName("templateId")
    private String templateId = null;

    @SerializedName("templateName")
    private String templateName = null;


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
     **/
    @ApiModelProperty(value = "")
    public UserInfo getOwner() {
        return owner;
    }

    public void setOwner(UserInfo owner) {
        this.owner = owner;
    }


    /**
     * When set to **true**, this custom tab is shared.
     **/
    @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
    public String getShared() {
        return shared;
    }

    public void setShared(String shared) {
        this.shared = shared;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<MemberGroupSharedItem> getSharedGroups() {
        return sharedGroups;
    }

    public void setSharedGroups(java.util.List<MemberGroupSharedItem> sharedGroups) {
        this.sharedGroups = sharedGroups;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<UserSharedItem> getSharedUsers() {
        return sharedUsers;
    }

    public void setSharedUsers(java.util.List<UserSharedItem> sharedUsers) {
        this.sharedUsers = sharedUsers;
    }


    /**
     * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
     **/
    @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateSharedItem templateSharedItem = (TemplateSharedItem) o;
        return Objects.equals(errorDetails, templateSharedItem.errorDetails) &&
                Objects.equals(owner, templateSharedItem.owner) &&
                Objects.equals(shared, templateSharedItem.shared) &&
                Objects.equals(sharedGroups, templateSharedItem.sharedGroups) &&
                Objects.equals(sharedUsers, templateSharedItem.sharedUsers) &&
                Objects.equals(templateId, templateSharedItem.templateId) &&
                Objects.equals(templateName, templateSharedItem.templateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorDetails, owner, shared, sharedGroups, sharedUsers, templateId, templateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateSharedItem {\n");

        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    sharedGroups: ").append(toIndentedString(sharedGroups)).append("\n");
        sb.append("    sharedUsers: ").append(toIndentedString(sharedUsers)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
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
