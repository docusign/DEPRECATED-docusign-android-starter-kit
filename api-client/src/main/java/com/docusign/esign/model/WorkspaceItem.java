package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * A workspaceItem (file type only) representing the file. This property is only returned in response to file specific GET call.
 **/
@ApiModel(description = "A workspaceItem (file type only) representing the file. This property is only returned in response to file specific GET call.")
public class WorkspaceItem implements Serializable {

    @SerializedName("callerAuthorization")
    private WorkspaceUserAuthorization callerAuthorization = null;

    @SerializedName("contentType")
    private String contentType = null;

    @SerializedName("created")
    private String created = null;

    @SerializedName("createdById")
    private String createdById = null;

    @SerializedName("createdByInformation")
    private WorkspaceUser createdByInformation = null;

    @SerializedName("extension")
    private String extension = null;

    @SerializedName("fileSize")
    private String fileSize = null;

    @SerializedName("fileUri")
    private String fileUri = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("isPublic")
    private String isPublic = null;

    @SerializedName("lastModified")
    private String lastModified = null;

    @SerializedName("lastModifiedById")
    private String lastModifiedById = null;

    @SerializedName("lastModifiedByInformation")
    private WorkspaceUser lastModifiedByInformation = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("pageCount")
    private String pageCount = null;

    @SerializedName("parentFolderId")
    private String parentFolderId = null;

    @SerializedName("parentFolderUri")
    private String parentFolderUri = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("uri")
    private String uri = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public WorkspaceUserAuthorization getCallerAuthorization() {
        return callerAuthorization;
    }

    public void setCallerAuthorization(WorkspaceUserAuthorization callerAuthorization) {
        this.callerAuthorization = callerAuthorization;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }


    /**
     * The UTC DateTime when the workspace item was created.
     **/
    @ApiModelProperty(value = "The UTC DateTime when the workspace item was created.")
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
    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public WorkspaceUser getCreatedByInformation() {
        return createdByInformation;
    }

    public void setCreatedByInformation(WorkspaceUser createdByInformation) {
        this.createdByInformation = createdByInformation;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getFileUri() {
        return fileUri;
    }

    public void setFileUri(String fileUri) {
        this.fileUri = fileUri;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    /**
     * If true, this supersedes need for bit mask permission with workspaceUserAuthorization
     **/
    @ApiModelProperty(value = " If true, this supersedes need for bit mask permission with workspaceUserAuthorization")
    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
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
     * Utc date and time the comment was last updated (can only be done by creator)
     **/
    @ApiModelProperty(value = "Utc date and time the comment was last updated (can only be done by creator)")
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public WorkspaceUser getLastModifiedByInformation() {
        return lastModifiedByInformation;
    }

    public void setLastModifiedByInformation(WorkspaceUser lastModifiedByInformation) {
        this.lastModifiedByInformation = lastModifiedByInformation;
    }


    /**
     * A simple string description of the item, such as a file name or a folder name.
     **/
    @ApiModelProperty(value = "A simple string description of the item, such as a file name or a folder name.")
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
    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }


    /**
     * The ID of the parent folder. This is the GUID of the parent folder, or the special value 'root' for the root folder.
     **/
    @ApiModelProperty(value = "The ID of the parent folder. This is the GUID of the parent folder, or the special value 'root' for the root folder.")
    public String getParentFolderId() {
        return parentFolderId;
    }

    public void setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
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
     * The type of the workspace item. Valid values are file, folder.
     **/
    @ApiModelProperty(value = "The type of the workspace item. Valid values are file, folder.")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        WorkspaceItem workspaceItem = (WorkspaceItem) o;
        return Objects.equals(callerAuthorization, workspaceItem.callerAuthorization) &&
                Objects.equals(contentType, workspaceItem.contentType) &&
                Objects.equals(created, workspaceItem.created) &&
                Objects.equals(createdById, workspaceItem.createdById) &&
                Objects.equals(createdByInformation, workspaceItem.createdByInformation) &&
                Objects.equals(extension, workspaceItem.extension) &&
                Objects.equals(fileSize, workspaceItem.fileSize) &&
                Objects.equals(fileUri, workspaceItem.fileUri) &&
                Objects.equals(id, workspaceItem.id) &&
                Objects.equals(isPublic, workspaceItem.isPublic) &&
                Objects.equals(lastModified, workspaceItem.lastModified) &&
                Objects.equals(lastModifiedById, workspaceItem.lastModifiedById) &&
                Objects.equals(lastModifiedByInformation, workspaceItem.lastModifiedByInformation) &&
                Objects.equals(name, workspaceItem.name) &&
                Objects.equals(pageCount, workspaceItem.pageCount) &&
                Objects.equals(parentFolderId, workspaceItem.parentFolderId) &&
                Objects.equals(parentFolderUri, workspaceItem.parentFolderUri) &&
                Objects.equals(type, workspaceItem.type) &&
                Objects.equals(uri, workspaceItem.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callerAuthorization, contentType, created, createdById, createdByInformation, extension, fileSize, fileUri, id, isPublic, lastModified, lastModifiedById, lastModifiedByInformation, name, pageCount, parentFolderId, parentFolderUri, type, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkspaceItem {\n");

        sb.append("    callerAuthorization: ").append(toIndentedString(callerAuthorization)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
        sb.append("    createdByInformation: ").append(toIndentedString(createdByInformation)).append("\n");
        sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileUri: ").append(toIndentedString(fileUri)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    lastModifiedById: ").append(toIndentedString(lastModifiedById)).append("\n");
        sb.append("    lastModifiedByInformation: ").append(toIndentedString(lastModifiedByInformation)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
        sb.append("    parentFolderId: ").append(toIndentedString(parentFolderId)).append("\n");
        sb.append("    parentFolderUri: ").append(toIndentedString(parentFolderUri)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
