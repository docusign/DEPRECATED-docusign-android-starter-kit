package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class DocumentFieldsInformation implements Serializable {

    @SerializedName("documentFields")
    private java.util.List<NameValue> documentFields = new java.util.ArrayList<NameValue>();


    /**
     * The array of name/value custom data strings to be added to a document. Custom document field information is returned in the status, but otherwise is not used by DocuSign. The array contains the elements: \n\n* name \u2013 A string that can be a maximum of 50 characters. \n* value \u2013 A string that can be a maximum of 200 characters.\n\n*IMPORTANT*: If you are using xml, the name/value pair is contained in a nameValue element. \n
     **/
    @ApiModelProperty(value = "The array of name/value custom data strings to be added to a document. Custom document field information is returned in the status, but otherwise is not used by DocuSign. The array contains the elements: \n\n* name \u2013 A string that can be a maximum of 50 characters. \n* value \u2013 A string that can be a maximum of 200 characters.\n\n*IMPORTANT*: If you are using xml, the name/value pair is contained in a nameValue element. \n")
    public java.util.List<NameValue> getDocumentFields() {
        return documentFields;
    }

    public void setDocumentFields(java.util.List<NameValue> documentFields) {
        this.documentFields = documentFields;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DocumentFieldsInformation documentFieldsInformation = (DocumentFieldsInformation) o;
        return Objects.equals(documentFields, documentFieldsInformation.documentFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentFieldsInformation {\n");

        sb.append("    documentFields: ").append(toIndentedString(documentFields)).append("\n");
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
