package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class TemplateDocumentVisibilityList implements Serializable {

    @SerializedName("documentVisibility")
    private java.util.List<DocumentVisibility> documentVisibility = new java.util.ArrayList<DocumentVisibility>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<DocumentVisibility> getDocumentVisibility() {
        return documentVisibility;
    }

    public void setDocumentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
        this.documentVisibility = documentVisibility;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateDocumentVisibilityList templateDocumentVisibilityList = (TemplateDocumentVisibilityList) o;
        return Objects.equals(documentVisibility, templateDocumentVisibilityList.documentVisibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentVisibility);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateDocumentVisibilityList {\n");

        sb.append("    documentVisibility: ").append(toIndentedString(documentVisibility)).append("\n");
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
