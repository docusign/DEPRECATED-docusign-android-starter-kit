package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Provides properties that describe a workspace.
 **/
@ApiModel(description = "Provides properties that describe a workspace.")
public class Workspace implements Serializable {

    @SerializedName("billableAccountId")
    private String billableAccountId = null;

    @SerializedName("created")
    private String created = null;

    @SerializedName("createdByInformation")
    private WorkspaceUser createdByInformation = null;

    @SerializedName("lastModified")
    private String lastModified = null;

    @SerializedName("lastModifiedByInformation")
    private WorkspaceUser lastModifiedByInformation = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("workspaceBaseUrl")
    private String workspaceBaseUrl = null;

    @SerializedName("workspaceDescription")
    private String workspaceDescription = null;

    @SerializedName("workspaceId")
    private String workspaceId = null;

    @SerializedName("workspaceName")
    private String workspaceName = null;

    @SerializedName("workspaceUri")
    private String workspaceUri = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getBillableAccountId() {
        return billableAccountId;
    }

    public void setBillableAccountId(String billableAccountId) {
        this.billableAccountId = billableAccountId;
    }


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
     **/
    @ApiModelProperty(value = "")
    public WorkspaceUser getCreatedByInformation() {
        return createdByInformation;
    }

    public void setCreatedByInformation(WorkspaceUser createdByInformation) {
        this.createdByInformation = createdByInformation;
    }


    /**
     * Utc date and time the comment was last updated (can only be done by creator.)
     **/
    @ApiModelProperty(value = "Utc date and time the comment was last updated (can only be done by creator.)")
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
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
     * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
     **/
    @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * The relative URL that may be used to access the workspace.
     **/
    @ApiModelProperty(value = "The relative URL that may be used to access the workspace.")
    public String getWorkspaceBaseUrl() {
        return workspaceBaseUrl;
    }

    public void setWorkspaceBaseUrl(String workspaceBaseUrl) {
        this.workspaceBaseUrl = workspaceBaseUrl;
    }


    /**
     * Text describing the purpose of the workspace.
     **/
    @ApiModelProperty(value = "Text describing the purpose of the workspace.")
    public String getWorkspaceDescription() {
        return workspaceDescription;
    }

    public void setWorkspaceDescription(String workspaceDescription) {
        this.workspaceDescription = workspaceDescription;
    }


    /**
     * The id of the workspace, always populated.
     **/
    @ApiModelProperty(value = "The id of the workspace, always populated.")
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }


    /**
     * The name of the workspace.
     **/
    @ApiModelProperty(value = "The name of the workspace.")
    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }


    /**
     * The relative URI that may be used to access the workspace.
     **/
    @ApiModelProperty(value = "The relative URI that may be used to access the workspace.")
    public String getWorkspaceUri() {
        return workspaceUri;
    }

    public void setWorkspaceUri(String workspaceUri) {
        this.workspaceUri = workspaceUri;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Workspace workspace = (Workspace) o;
        return Objects.equals(billableAccountId, workspace.billableAccountId) &&
                Objects.equals(created, workspace.created) &&
                Objects.equals(createdByInformation, workspace.createdByInformation) &&
                Objects.equals(lastModified, workspace.lastModified) &&
                Objects.equals(lastModifiedByInformation, workspace.lastModifiedByInformation) &&
                Objects.equals(status, workspace.status) &&
                Objects.equals(workspaceBaseUrl, workspace.workspaceBaseUrl) &&
                Objects.equals(workspaceDescription, workspace.workspaceDescription) &&
                Objects.equals(workspaceId, workspace.workspaceId) &&
                Objects.equals(workspaceName, workspace.workspaceName) &&
                Objects.equals(workspaceUri, workspace.workspaceUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billableAccountId, created, createdByInformation, lastModified, lastModifiedByInformation, status, workspaceBaseUrl, workspaceDescription, workspaceId, workspaceName, workspaceUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Workspace {\n");

        sb.append("    billableAccountId: ").append(toIndentedString(billableAccountId)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    createdByInformation: ").append(toIndentedString(createdByInformation)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    lastModifiedByInformation: ").append(toIndentedString(lastModifiedByInformation)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    workspaceBaseUrl: ").append(toIndentedString(workspaceBaseUrl)).append("\n");
        sb.append("    workspaceDescription: ").append(toIndentedString(workspaceDescription)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
        sb.append("    workspaceUri: ").append(toIndentedString(workspaceUri)).append("\n");
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
