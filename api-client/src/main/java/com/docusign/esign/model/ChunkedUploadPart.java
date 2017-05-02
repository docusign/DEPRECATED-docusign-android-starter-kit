package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ChunkedUploadPart implements Serializable {

    @SerializedName("sequence")
    private String sequence = null;

    @SerializedName("size")
    private String size = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChunkedUploadPart chunkedUploadPart = (ChunkedUploadPart) o;
        return Objects.equals(sequence, chunkedUploadPart.sequence) &&
                Objects.equals(size, chunkedUploadPart.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequence, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChunkedUploadPart {\n");

        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
