package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class FileTypeList implements Serializable {

    @SerializedName("fileTypes")
    private java.util.List<FileType> fileTypes = new java.util.ArrayList<FileType>();


    /**
     * A collection of file types.
     **/
    @ApiModelProperty(value = "A collection of file types.")
    public java.util.List<FileType> getFileTypes() {
        return fileTypes;
    }

    public void setFileTypes(java.util.List<FileType> fileTypes) {
        this.fileTypes = fileTypes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileTypeList fileTypeList = (FileTypeList) o;
        return Objects.equals(fileTypes, fileTypeList.fileTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileTypeList {\n");

        sb.append("    fileTypes: ").append(toIndentedString(fileTypes)).append("\n");
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
