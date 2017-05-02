package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class Document implements Serializable {

    @SerializedName("applyAnchorTabs")
    private String applyAnchorTabs = null;

    @SerializedName("display")
    private String display = null;

    @SerializedName("documentBase64")
    private String documentBase64 = null;

    @SerializedName("documentFields")
    private java.util.List<NameValue> documentFields = new java.util.ArrayList<NameValue>();

    @SerializedName("documentGroup")
    private String documentGroup = null;

    @SerializedName("documentId")
    private String documentId = null;

    @SerializedName("encryptedWithKeyManager")
    private String encryptedWithKeyManager = null;

    @SerializedName("fileExtension")
    private String fileExtension = null;

    @SerializedName("includeInDownload")
    private String includeInDownload = null;

    @SerializedName("matchBoxes")
    private java.util.List<MatchBox> matchBoxes = new java.util.ArrayList<MatchBox>();

    @SerializedName("name")
    private String name = null;

    @SerializedName("order")
    private String order = null;

    @SerializedName("pages")
    private String pages = null;

    @SerializedName("password")
    private String password = null;

    @SerializedName("remoteUrl")
    private String remoteUrl = null;

    @SerializedName("signerMustAcknowledge")
    private String signerMustAcknowledge = null;

    @SerializedName("templateLocked")
    private String templateLocked = null;

    @SerializedName("templateRequired")
    private String templateRequired = null;

    @SerializedName("transformPdfFields")
    private String transformPdfFields = null;

    @SerializedName("uri")
    private String uri = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getApplyAnchorTabs() {
        return applyAnchorTabs;
    }

    public void setApplyAnchorTabs(String applyAnchorTabs) {
        this.applyAnchorTabs = applyAnchorTabs;
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
     * The document\u2019s bytes. This field can be used to include a base64 version of the document bytes within an envelope definition instead of sending the document using a multi-part HTTP request. The maximum document size is smaller if this field is used due to the overhead of the base64 encoding.
     **/
    @ApiModelProperty(value = "The document\u2019s bytes. This field can be used to include a base64 version of the document bytes within an envelope definition instead of sending the document using a multi-part HTTP request. The maximum document size is smaller if this field is used due to the overhead of the base64 encoding.")
    public String getDocumentBase64() {
        return documentBase64;
    }

    public void setDocumentBase64(String documentBase64) {
        this.documentBase64 = documentBase64;
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
     * When set to **true**, the document is been already encrypted by the sender for use with the DocuSign Key Manager Security Appliance.\n
     **/
    @ApiModelProperty(value = "When set to **true**, the document is been already encrypted by the sender for use with the DocuSign Key Manager Security Appliance.\n ")
    public String getEncryptedWithKeyManager() {
        return encryptedWithKeyManager;
    }

    public void setEncryptedWithKeyManager(String encryptedWithKeyManager) {
        this.encryptedWithKeyManager = encryptedWithKeyManager;
    }


    /**
     * The file extension type of the document. If the document is not a PDF it is converted to a PDF.\n
     **/
    @ApiModelProperty(value = "The file extension type of the document. If the document is not a PDF it is converted to a PDF.\n ")
    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
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
     * Matchboxes define areas in a document for document matching when you are creating envelopes. They are only used when you upload and edit a template. \n\nA matchbox consists of 5 elements:\n\n* pageNumber - The document page number  on which the matchbox will appear. \n* xPosition - The x position of the matchbox on a page. \n* yPosition - The y position of the matchbox on a page.\n* width - The width of the matchbox. \n* height - The height of the matchbox. \n
     **/
    @ApiModelProperty(value = "Matchboxes define areas in a document for document matching when you are creating envelopes. They are only used when you upload and edit a template. \n\nA matchbox consists of 5 elements:\n\n* pageNumber - The document page number  on which the matchbox will appear. \n* xPosition - The x position of the matchbox on a page. \n* yPosition - The y position of the matchbox on a page.\n* width - The width of the matchbox. \n* height - The height of the matchbox. \n")
    public java.util.List<MatchBox> getMatchBoxes() {
        return matchBoxes;
    }

    public void setMatchBoxes(java.util.List<MatchBox> matchBoxes) {
        this.matchBoxes = matchBoxes;
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
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * The file id from the cloud storage service where the document is located. This information is returned using [ML:GET /folders] or [ML:/folders/{folderid}].
     **/
    @ApiModelProperty(value = "The file id from the cloud storage service where the document is located. This information is returned using [ML:GET /folders] or [ML:/folders/{folderid}]. ")
    public String getRemoteUrl() {
        return remoteUrl;
    }

    public void setRemoteUrl(String remoteUrl) {
        this.remoteUrl = remoteUrl;
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
     * When set to **true**, PDF form field data is transformed into document tab values when the PDF form field name matches the DocuSign custom tab tabLabel. The resulting PDF form data is also returned in the PDF meta data when requesting the document PDF. See the [ML:Transform PDF Fields] section for more information about how fields are transformed into DocuSign tabs.
     **/
    @ApiModelProperty(value = "When set to **true**, PDF form field data is transformed into document tab values when the PDF form field name matches the DocuSign custom tab tabLabel. The resulting PDF form data is also returned in the PDF meta data when requesting the document PDF. See the [ML:Transform PDF Fields] section for more information about how fields are transformed into DocuSign tabs. ")
    public String getTransformPdfFields() {
        return transformPdfFields;
    }

    public void setTransformPdfFields(String transformPdfFields) {
        this.transformPdfFields = transformPdfFields;
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
        Document document = (Document) o;
        return Objects.equals(applyAnchorTabs, document.applyAnchorTabs) &&
                Objects.equals(display, document.display) &&
                Objects.equals(documentBase64, document.documentBase64) &&
                Objects.equals(documentFields, document.documentFields) &&
                Objects.equals(documentGroup, document.documentGroup) &&
                Objects.equals(documentId, document.documentId) &&
                Objects.equals(encryptedWithKeyManager, document.encryptedWithKeyManager) &&
                Objects.equals(fileExtension, document.fileExtension) &&
                Objects.equals(includeInDownload, document.includeInDownload) &&
                Objects.equals(matchBoxes, document.matchBoxes) &&
                Objects.equals(name, document.name) &&
                Objects.equals(order, document.order) &&
                Objects.equals(pages, document.pages) &&
                Objects.equals(password, document.password) &&
                Objects.equals(remoteUrl, document.remoteUrl) &&
                Objects.equals(signerMustAcknowledge, document.signerMustAcknowledge) &&
                Objects.equals(templateLocked, document.templateLocked) &&
                Objects.equals(templateRequired, document.templateRequired) &&
                Objects.equals(transformPdfFields, document.transformPdfFields) &&
                Objects.equals(uri, document.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyAnchorTabs, display, documentBase64, documentFields, documentGroup, documentId, encryptedWithKeyManager, fileExtension, includeInDownload, matchBoxes, name, order, pages, password, remoteUrl, signerMustAcknowledge, templateLocked, templateRequired, transformPdfFields, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Document {\n");

        sb.append("    applyAnchorTabs: ").append(toIndentedString(applyAnchorTabs)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    documentBase64: ").append(toIndentedString(documentBase64)).append("\n");
        sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
        sb.append("    documentGroup: ").append(toIndentedString(documentGroup)).append("\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    encryptedWithKeyManager: ").append(toIndentedString(encryptedWithKeyManager)).append("\n");
        sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
        sb.append("    includeInDownload: ").append(toIndentedString(includeInDownload)).append("\n");
        sb.append("    matchBoxes: ").append(toIndentedString(matchBoxes)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    remoteUrl: ").append(toIndentedString(remoteUrl)).append("\n");
        sb.append("    signerMustAcknowledge: ").append(toIndentedString(signerMustAcknowledge)).append("\n");
        sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
        sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
        sb.append("    transformPdfFields: ").append(toIndentedString(transformPdfFields)).append("\n");
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
