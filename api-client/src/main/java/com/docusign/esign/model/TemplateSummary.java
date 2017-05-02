package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class TemplateSummary implements Serializable {

    @SerializedName("applied")
    private String applied = null;

    @SerializedName("documentId")
    private String documentId = null;

    @SerializedName("documentName")
    private String documentName = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("templateId")
    private String templateId = null;

    @SerializedName("templateMatch")
    private TemplateMatch templateMatch = null;

    @SerializedName("uri")
    private String uri = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getApplied() {
        return applied;
    }

    public void setApplied(String applied) {
        this.applied = applied;
    }


    /**
     * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
     **/
    @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


    /**
     **/
    @ApiModelProperty(value = "")
    public TemplateMatch getTemplateMatch() {
        return templateMatch;
    }

    public void setTemplateMatch(TemplateMatch templateMatch) {
        this.templateMatch = templateMatch;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateSummary templateSummary = (TemplateSummary) o;
        return Objects.equals(applied, templateSummary.applied) &&
                Objects.equals(documentId, templateSummary.documentId) &&
                Objects.equals(documentName, templateSummary.documentName) &&
                Objects.equals(name, templateSummary.name) &&
                Objects.equals(templateId, templateSummary.templateId) &&
                Objects.equals(templateMatch, templateSummary.templateMatch) &&
                Objects.equals(uri, templateSummary.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applied, documentId, documentName, name, templateId, templateMatch, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateSummary {\n");

        sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateMatch: ").append(toIndentedString(templateMatch)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
