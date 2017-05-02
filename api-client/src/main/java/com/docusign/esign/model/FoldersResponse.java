package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class FoldersResponse implements Serializable {

    @SerializedName("folders")
    private java.util.List<Folder> folders = new java.util.ArrayList<Folder>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(java.util.List<Folder> folders) {
        this.folders = folders;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FoldersResponse foldersResponse = (FoldersResponse) o;
        return Objects.equals(folders, foldersResponse.folders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FoldersResponse {\n");

        sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
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
