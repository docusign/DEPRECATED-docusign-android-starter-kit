package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeDocument implements Serializable {

    @SerializedName("attachmentTabId")
    private String attachmentTabId = null;

    @SerializedName("availableDocumentTypes")
    private java.util.List<SignatureType> availableDocumentTypes = new java.util.ArrayList<SignatureType>();

    @SerializedName("containsPdfFormFields")
    private String containsPdfFormFields = null;

    @SerializedName("display")
    private String display = null;

    @SerializedName("documentFields")
    private java.util.List<NameValue> documentFields = new java.util.ArrayList<NameValue>();

    @SerializedName("documentGroup")
    private String documentGroup = null;

    @SerializedName("documentId")
    private String documentId = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("includeInDownload")
    private String includeInDownload = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("order")
    private String order = null;

    @SerializedName("pages")
    private String pages = null;

    @SerializedName("signerMustAcknowledge")
    private String signerMustAcknowledge = null;

    @SerializedName("templateLocked")
    private String templateLocked = null;

    @SerializedName("templateRequired")
    private String templateRequired = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("uri")
    private String uri = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAttachmentTabId() {
        return attachmentTabId;
    }

    public void setAttachmentTabId(String attachmentTabId) {
        this.attachmentTabId = attachmentTabId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<SignatureType> getAvailableDocumentTypes() {
        return availableDocumentTypes;
    }

    public void setAvailableDocumentTypes(java.util.List<SignatureType> availableDocumentTypes) {
        this.availableDocumentTypes = availableDocumentTypes;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getContainsPdfFormFields() {
        return containsPdfFormFields;
    }

    public void setContainsPdfFormFields(String containsPdfFormFields) {
        this.containsPdfFormFields = containsPdfFormFields;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<NameValue> getDocumentFields() {
        return documentFields;
    }

    public void setDocumentFields(java.util.List<NameValue> documentFields) {
        this.documentFields = documentFields;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDocumentGroup() {
        return documentGroup;
    }

    public void setDocumentGroup(String documentGroup) {
        this.documentGroup = documentGroup;
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
     **/
    @ApiModelProperty(value = "")
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIncludeInDownload() {
        return includeInDownload;
    }

    public void setIncludeInDownload(String includeInDownload) {
        this.includeInDownload = includeInDownload;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSignerMustAcknowledge() {
        return signerMustAcknowledge;
    }

    public void setSignerMustAcknowledge(String signerMustAcknowledge) {
        this.signerMustAcknowledge = signerMustAcknowledge;
    }


    /**
     * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
     **/
    @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
    public String getTemplateLocked() {
        return templateLocked;
    }

    public void setTemplateLocked(String templateLocked) {
        this.templateLocked = templateLocked;
    }


    /**
     * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
     **/
    @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
    public String getTemplateRequired() {
        return templateRequired;
    }

    public void setTemplateRequired(String templateRequired) {
        this.templateRequired = templateRequired;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        EnvelopeDocument envelopeDocument = (EnvelopeDocument) o;
        return Objects.equals(attachmentTabId, envelopeDocument.attachmentTabId) &&
                Objects.equals(availableDocumentTypes, envelopeDocument.availableDocumentTypes) &&
                Objects.equals(containsPdfFormFields, envelopeDocument.containsPdfFormFields) &&
                Objects.equals(display, envelopeDocument.display) &&
                Objects.equals(documentFields, envelopeDocument.documentFields) &&
                Objects.equals(documentGroup, envelopeDocument.documentGroup) &&
                Objects.equals(documentId, envelopeDocument.documentId) &&
                Objects.equals(errorDetails, envelopeDocument.errorDetails) &&
                Objects.equals(includeInDownload, envelopeDocument.includeInDownload) &&
                Objects.equals(name, envelopeDocument.name) &&
                Objects.equals(order, envelopeDocument.order) &&
                Objects.equals(pages, envelopeDocument.pages) &&
                Objects.equals(signerMustAcknowledge, envelopeDocument.signerMustAcknowledge) &&
                Objects.equals(templateLocked, envelopeDocument.templateLocked) &&
                Objects.equals(templateRequired, envelopeDocument.templateRequired) &&
                Objects.equals(type, envelopeDocument.type) &&
                Objects.equals(uri, envelopeDocument.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachmentTabId, availableDocumentTypes, containsPdfFormFields, display, documentFields, documentGroup, documentId, errorDetails, includeInDownload, name, order, pages, signerMustAcknowledge, templateLocked, templateRequired, type, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeDocument {\n");

        sb.append("    attachmentTabId: ").append(toIndentedString(attachmentTabId)).append("\n");
        sb.append("    availableDocumentTypes: ").append(toIndentedString(availableDocumentTypes)).append("\n");
        sb.append("    containsPdfFormFields: ").append(toIndentedString(containsPdfFormFields)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
        sb.append("    documentGroup: ").append(toIndentedString(documentGroup)).append("\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    includeInDownload: ").append(toIndentedString(includeInDownload)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
        sb.append("    signerMustAcknowledge: ").append(toIndentedString(signerMustAcknowledge)).append("\n");
        sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
        sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
