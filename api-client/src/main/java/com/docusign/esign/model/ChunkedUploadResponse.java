package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ChunkedUploadResponse implements Serializable {

    @SerializedName("checksum")
    private String checksum = null;

    @SerializedName("chunkedUploadId")
    private String chunkedUploadId = null;

    @SerializedName("chunkedUploadParts")
    private java.util.List<ChunkedUploadPart> chunkedUploadParts = new java.util.ArrayList<ChunkedUploadPart>();

    @SerializedName("chunkedUploadUri")
    private String chunkedUploadUri = null;

    @SerializedName("committed")
    private String committed = null;

    @SerializedName("expirationDateTime")
    private String expirationDateTime = null;

    @SerializedName("totalSize")
    private String totalSize = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getChunkedUploadId() {
        return chunkedUploadId;
    }

    public void setChunkedUploadId(String chunkedUploadId) {
        this.chunkedUploadId = chunkedUploadId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<ChunkedUploadPart> getChunkedUploadParts() {
        return chunkedUploadParts;
    }

    public void setChunkedUploadParts(java.util.List<ChunkedUploadPart> chunkedUploadParts) {
        this.chunkedUploadParts = chunkedUploadParts;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getChunkedUploadUri() {
        return chunkedUploadUri;
    }

    public void setChunkedUploadUri(String chunkedUploadUri) {
        this.chunkedUploadUri = chunkedUploadUri;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCommitted() {
        return committed;
    }

    public void setCommitted(String committed) {
        this.committed = committed;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(String expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(String totalSize) {
        this.totalSize = totalSize;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChunkedUploadResponse chunkedUploadResponse = (ChunkedUploadResponse) o;
        return Objects.equals(checksum, chunkedUploadResponse.checksum) &&
                Objects.equals(chunkedUploadId, chunkedUploadResponse.chunkedUploadId) &&
                Objects.equals(chunkedUploadParts, chunkedUploadResponse.chunkedUploadParts) &&
                Objects.equals(chunkedUploadUri, chunkedUploadResponse.chunkedUploadUri) &&
                Objects.equals(committed, chunkedUploadResponse.committed) &&
                Objects.equals(expirationDateTime, chunkedUploadResponse.expirationDateTime) &&
                Objects.equals(totalSize, chunkedUploadResponse.totalSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checksum, chunkedUploadId, chunkedUploadParts, chunkedUploadUri, committed, expirationDateTime, totalSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChunkedUploadResponse {\n");

        sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
        sb.append("    chunkedUploadId: ").append(toIndentedString(chunkedUploadId)).append("\n");
        sb.append("    chunkedUploadParts: ").append(toIndentedString(chunkedUploadParts)).append("\n");
        sb.append("    chunkedUploadUri: ").append(toIndentedString(chunkedUploadUri)).append("\n");
        sb.append("    committed: ").append(toIndentedString(committed)).append("\n");
        sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
