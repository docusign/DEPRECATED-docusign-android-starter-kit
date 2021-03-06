package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class DocumentVisibility implements Serializable {

    @SerializedName("documentId")
    private String documentId = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("recipientId")
    private String recipientId = null;

    @SerializedName("rights")
    private String rights = null;

    @SerializedName("visible")
    private String visible = null;


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
     * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
     **/
    @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DocumentVisibility documentVisibility = (DocumentVisibility) o;
        return Objects.equals(documentId, documentVisibility.documentId) &&
                Objects.equals(errorDetails, documentVisibility.errorDetails) &&
                Objects.equals(recipientId, documentVisibility.recipientId) &&
                Objects.equals(rights, documentVisibility.rights) &&
                Objects.equals(visible, documentVisibility.visible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, errorDetails, recipientId, rights, visible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentVisibility {\n");

        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
        sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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
