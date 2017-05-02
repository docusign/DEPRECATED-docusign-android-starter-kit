package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class DocumentTemplate implements Serializable {

    @SerializedName("documentEndPage")
    private String documentEndPage = null;

    @SerializedName("documentId")
    private String documentId = null;

    @SerializedName("documentStartPage")
    private String documentStartPage = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("templateId")
    private String templateId = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDocumentEndPage() {
        return documentEndPage;
    }

    public void setDocumentEndPage(String documentEndPage) {
        this.documentEndPage = documentEndPage;
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
    public String getDocumentStartPage() {
        return documentStartPage;
    }

    public void setDocumentStartPage(String documentStartPage) {
        this.documentStartPage = documentStartPage;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
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
        DocumentTemplate documentTemplate = (DocumentTemplate) o;
        return Objects.equals(documentEndPage, documentTemplate.documentEndPage) &&
                Objects.equals(documentId, documentTemplate.documentId) &&
                Objects.equals(documentStartPage, documentTemplate.documentStartPage) &&
                Objects.equals(errorDetails, documentTemplate.errorDetails) &&
                Objects.equals(templateId, documentTemplate.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentEndPage, documentId, documentStartPage, errorDetails, templateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentTemplate {\n");

        sb.append("    documentEndPage: ").append(toIndentedString(documentEndPage)).append("\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    documentStartPage: ").append(toIndentedString(documentStartPage)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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
