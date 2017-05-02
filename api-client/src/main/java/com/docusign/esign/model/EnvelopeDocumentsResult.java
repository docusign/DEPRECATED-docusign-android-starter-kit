package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeDocumentsResult implements Serializable {

    @SerializedName("envelopeDocuments")
    private java.util.List<EnvelopeDocument> envelopeDocuments = new java.util.ArrayList<EnvelopeDocument>();

    @SerializedName("envelopeId")
    private String envelopeId = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<EnvelopeDocument> getEnvelopeDocuments() {
        return envelopeDocuments;
    }

    public void setEnvelopeDocuments(java.util.List<EnvelopeDocument> envelopeDocuments) {
        this.envelopeDocuments = envelopeDocuments;
    }


    /**
     * The envelope ID of the envelope status that failed to post.
     **/
    @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeDocumentsResult envelopeDocumentsResult = (EnvelopeDocumentsResult) o;
        return Objects.equals(envelopeDocuments, envelopeDocumentsResult.envelopeDocuments) &&
                Objects.equals(envelopeId, envelopeDocumentsResult.envelopeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envelopeDocuments, envelopeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeDocumentsResult {\n");

        sb.append("    envelopeDocuments: ").append(toIndentedString(envelopeDocuments)).append("\n");
        sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
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
