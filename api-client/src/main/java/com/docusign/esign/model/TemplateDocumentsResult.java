package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class TemplateDocumentsResult implements Serializable {

    @SerializedName("templateDocuments")
    private java.util.List<EnvelopeDocument> templateDocuments = new java.util.ArrayList<EnvelopeDocument>();

    @SerializedName("templateId")
    private String templateId = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<EnvelopeDocument> getTemplateDocuments() {
        return templateDocuments;
    }

    public void setTemplateDocuments(java.util.List<EnvelopeDocument> templateDocuments) {
        this.templateDocuments = templateDocuments;
    }


    /**
     * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
     **/
    @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateDocumentsResult templateDocumentsResult = (TemplateDocumentsResult) o;
        return Objects.equals(templateDocuments, templateDocumentsResult.templateDocuments) &&
                Objects.equals(templateId, templateDocumentsResult.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateDocuments, templateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateDocumentsResult {\n");

        sb.append("    templateDocuments: ").append(toIndentedString(templateDocuments)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
