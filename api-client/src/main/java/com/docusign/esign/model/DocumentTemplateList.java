package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class DocumentTemplateList implements Serializable {

    @SerializedName("documentTemplates")
    private java.util.List<DocumentTemplate> documentTemplates = new java.util.ArrayList<DocumentTemplate>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<DocumentTemplate> getDocumentTemplates() {
        return documentTemplates;
    }

    public void setDocumentTemplates(java.util.List<DocumentTemplate> documentTemplates) {
        this.documentTemplates = documentTemplates;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DocumentTemplateList documentTemplateList = (DocumentTemplateList) o;
        return Objects.equals(documentTemplates, documentTemplateList.documentTemplates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentTemplates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentTemplateList {\n");

        sb.append("    documentTemplates: ").append(toIndentedString(documentTemplates)).append("\n");
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
