package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class FoldersRequest implements Serializable {

    @SerializedName("envelopeIds")
    private java.util.List<String> envelopeIds = new java.util.ArrayList<String>();

    @SerializedName("fromFolderId")
    private String fromFolderId = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<String> getEnvelopeIds() {
        return envelopeIds;
    }

    public void setEnvelopeIds(java.util.List<String> envelopeIds) {
        this.envelopeIds = envelopeIds;
    }


    /**
     * The folder ID the envelope is being moved from.
     **/
    @ApiModelProperty(value = " The folder ID the envelope is being moved from.")
    public String getFromFolderId() {
        return fromFolderId;
    }

    public void setFromFolderId(String fromFolderId) {
        this.fromFolderId = fromFolderId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FoldersRequest foldersRequest = (FoldersRequest) o;
        return Objects.equals(envelopeIds, foldersRequest.envelopeIds) &&
                Objects.equals(fromFolderId, foldersRequest.fromFolderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envelopeIds, fromFolderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FoldersRequest {\n");

        sb.append("    envelopeIds: ").append(toIndentedString(envelopeIds)).append("\n");
        sb.append("    fromFolderId: ").append(toIndentedString(fromFolderId)).append("\n");
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
