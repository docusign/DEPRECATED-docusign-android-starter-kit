package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Provides properties that describe the contents of a workspace folder.
 **/
@ApiModel(description = "Provides properties that describe the contents of a workspace folder.")
public class WorkspaceFolderContents implements Serializable {

    @SerializedName("endPosition")
    private String endPosition = null;

    @SerializedName("folder")
    private WorkspaceItem folder = null;

    @SerializedName("items")
    private java.util.List<WorkspaceItem> items = new java.util.ArrayList<WorkspaceItem>();

    @SerializedName("parentFolders")
    private java.util.List<WorkspaceItem> parentFolders = new java.util.ArrayList<WorkspaceItem>();

    @SerializedName("resultSetSize")
    private String resultSetSize = null;

    @SerializedName("startPosition")
    private String startPosition = null;

    @SerializedName("totalSetSize")
    private String totalSetSize = null;

    @SerializedName("workspaceId")
    private String workspaceId = null;


    /**
     * The last position in the result set.
     **/
    @ApiModelProperty(value = "The last position in the result set. ")
    public String getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(String endPosition) {
        this.endPosition = endPosition;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public WorkspaceItem getFolder() {
        return folder;
    }

    public void setFolder(WorkspaceItem folder) {
        this.folder = folder;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<WorkspaceItem> getItems() {
        return items;
    }

    public void setItems(java.util.List<WorkspaceItem> items) {
        this.items = items;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<WorkspaceItem> getParentFolders() {
        return parentFolders;
    }

    public void setParentFolders(java.util.List<WorkspaceItem> parentFolders) {
        this.parentFolders = parentFolders;
    }


    /**
     * The number of results returned in this response.
     **/
    @ApiModelProperty(value = "The number of results returned in this response. ")
    public String getResultSetSize() {
        return resultSetSize;
    }

    public void setResultSetSize(String resultSetSize) {
        this.resultSetSize = resultSetSize;
    }


    /**
     * Starting position of the current result set.
     **/
    @ApiModelProperty(value = "Starting position of the current result set.")
    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }


    /**
     * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
     **/
    @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
    public String getTotalSetSize() {
        return totalSetSize;
    }

    public void setTotalSetSize(String totalSetSize) {
        this.totalSetSize = totalSetSize;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkspaceFolderContents workspaceFolderContents = (WorkspaceFolderContents) o;
        return Objects.equals(endPosition, workspaceFolderContents.endPosition) &&
                Objects.equals(folder, workspaceFolderContents.folder) &&
                Objects.equals(items, workspaceFolderContents.items) &&
                Objects.equals(parentFolders, workspaceFolderContents.parentFolders) &&
                Objects.equals(resultSetSize, workspaceFolderContents.resultSetSize) &&
                Objects.equals(startPosition, workspaceFolderContents.startPosition) &&
                Objects.equals(totalSetSize, workspaceFolderContents.totalSetSize) &&
                Objects.equals(workspaceId, workspaceFolderContents.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endPosition, folder, items, parentFolders, resultSetSize, startPosition, totalSetSize, workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkspaceFolderContents {\n");

        sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
        sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    parentFolders: ").append(toIndentedString(parentFolders)).append("\n");
        sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
        sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
        sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
