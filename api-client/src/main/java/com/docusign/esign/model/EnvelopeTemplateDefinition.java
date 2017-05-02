package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * A complex element containing the following information:\n\ntemplateId: Unique identifier of the template. If this is not provided, DocuSign will generate a value. \n\nname: Name of the template. Maximum length: 100 characters.\n\nshared: When set to **true**, the template is shared with the Everyone group in the account. If false, the template is only shared with the Administrator group.\n\npassword: Password, if the template is locked.\n\ndescription: Description of the template. Maximum Length: 500 characters.\n\npageCount: Number of document pages in the template.\n\nfolderName: The name of the folder the template is located in.\n\nfolderId: The ID for the folder.\n\nowner: The userName, email, userId, userType, and userStatus for the template owner.
 **/
@ApiModel(description = "A complex element containing the following information:\n\ntemplateId: Unique identifier of the template. If this is not provided, DocuSign will generate a value. \n\nname: Name of the template. Maximum length: 100 characters.\n\nshared: When set to **true**, the template is shared with the Everyone group in the account. If false, the template is only shared with the Administrator group.\n\npassword: Password, if the template is locked.\n\ndescription: Description of the template. Maximum Length: 500 characters.\n\npageCount: Number of document pages in the template.\n\nfolderName: The name of the folder the template is located in.\n\nfolderId: The ID for the folder.\n\nowner: The userName, email, userId, userType, and userStatus for the template owner.")
public class EnvelopeTemplateDefinition implements Serializable {

    @SerializedName("description")
    private String description = null;

    @SerializedName("folderId")
    private String folderId = null;

    @SerializedName("folderName")
    private String folderName = null;

    @SerializedName("folderUri")
    private String folderUri = null;

    @SerializedName("lastModified")
    private String lastModified = null;

    @SerializedName("lastModifiedBy")
    private UserInfo lastModifiedBy = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("newPassword")
    private String newPassword = null;

    @SerializedName("owner")
    private UserInfo owner = null;

    @SerializedName("pageCount")
    private Integer pageCount = null;

    @SerializedName("parentFolderUri")
    private String parentFolderUri = null;

    @SerializedName("password")
    private String password = null;

    @SerializedName("shared")
    private String shared = null;

    @SerializedName("templateId")
    private String templateId = null;

    @SerializedName("uri")
    private String uri = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * The ID for the folder.
     **/
    @ApiModelProperty(value = "The ID for the folder.")
    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }


    /**
     * The name of the folder in which the template is located.
     **/
    @ApiModelProperty(value = " The name of the folder in which the template is located.")
    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }


    /**
     * The URI of the folder.
     **/
    @ApiModelProperty(value = "The URI of the folder.")
    public String getFolderUri() {
        return folderUri;
    }

    public void setFolderUri(String folderUri) {
        this.folderUri = folderUri;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public UserInfo getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(UserInfo lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
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
     * An integer value specifying the number of document pages in the template. Omit this property if not submitting a page count.
     **/
    @ApiModelProperty(value = "An integer value specifying the number of document pages in the template. Omit this property if not submitting a page count.")
    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getParentFolderUri() {
        return parentFolderUri;
    }

    public void setParentFolderUri(String parentFolderUri) {
        this.parentFolderUri = parentFolderUri;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeTemplateDefinition envelopeTemplateDefinition = (EnvelopeTemplateDefinition) o;
        return Objects.equals(description, envelopeTemplateDefinition.description) &&
                Objects.equals(folderId, envelopeTemplateDefinition.folderId) &&
                Objects.equals(folderName, envelopeTemplateDefinition.folderName) &&
                Objects.equals(folderUri, envelopeTemplateDefinition.folderUri) &&
                Objects.equals(lastModified, envelopeTemplateDefinition.lastModified) &&
                Objects.equals(lastModifiedBy, envelopeTemplateDefinition.lastModifiedBy) &&
                Objects.equals(name, envelopeTemplateDefinition.name) &&
                Objects.equals(newPassword, envelopeTemplateDefinition.newPassword) &&
                Objects.equals(owner, envelopeTemplateDefinition.owner) &&
                Objects.equals(pageCount, envelopeTemplateDefinition.pageCount) &&
                Objects.equals(parentFolderUri, envelopeTemplateDefinition.parentFolderUri) &&
                Objects.equals(password, envelopeTemplateDefinition.password) &&
                Objects.equals(shared, envelopeTemplateDefinition.shared) &&
                Objects.equals(templateId, envelopeTemplateDefinition.templateId) &&
                Objects.equals(uri, envelopeTemplateDefinition.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, folderId, folderName, folderUri, lastModified, lastModifiedBy, name, newPassword, owner, pageCount, parentFolderUri, password, shared, templateId, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeTemplateDefinition {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
        sb.append("    folderUri: ").append(toIndentedString(folderUri)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
        sb.append("    parentFolderUri: ").append(toIndentedString(parentFolderUri)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
