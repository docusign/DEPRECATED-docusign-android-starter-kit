package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ChunkedUploadRequest implements Serializable {

    @SerializedName("chunkedUploadId")
    private String chunkedUploadId = null;

    @SerializedName("data")
    private String data = null;


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
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChunkedUploadRequest chunkedUploadRequest = (ChunkedUploadRequest) o;
        return Objects.equals(chunkedUploadId, chunkedUploadRequest.chunkedUploadId) &&
                Objects.equals(data, chunkedUploadRequest.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chunkedUploadId, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChunkedUploadRequest {\n");

        sb.append("    chunkedUploadId: ").append(toIndentedString(chunkedUploadId)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
