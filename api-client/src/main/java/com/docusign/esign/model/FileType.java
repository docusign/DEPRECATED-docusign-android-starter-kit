package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class FileType implements Serializable {

    @SerializedName("fileExtension")
    private String fileExtension = null;

    @SerializedName("mimeType")
    private String mimeType = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }


    /**
     * The mime-type of a file type listed in a fileTypes collection.
     **/
    @ApiModelProperty(value = "The mime-type of a file type listed in a fileTypes collection.")
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileType fileType = (FileType) o;
        return Objects.equals(fileExtension, fileType.fileExtension) &&
                Objects.equals(mimeType, fileType.mimeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileExtension, mimeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileType {\n");

        sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
        sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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
