package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class RecipientEvent implements Serializable {

    @SerializedName("includeDocuments")
    private String includeDocuments = null;

    @SerializedName("recipientEventStatusCode")
    private String recipientEventStatusCode = null;


    /**
     * When set to **true**, the PDF documents are included in the message along with the updated XML.
     **/
    @ApiModelProperty(value = "When set to **true**, the PDF documents are included in the message along with the updated XML. ")
    public String getIncludeDocuments() {
        return includeDocuments;
    }

    public void setIncludeDocuments(String includeDocuments) {
        this.includeDocuments = includeDocuments;
    }


    /**
     * The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.
     **/
    @ApiModelProperty(value = "The recipient status, this can be Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.")
    public String getRecipientEventStatusCode() {
        return recipientEventStatusCode;
    }

    public void setRecipientEventStatusCode(String recipientEventStatusCode) {
        this.recipientEventStatusCode = recipientEventStatusCode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecipientEvent recipientEvent = (RecipientEvent) o;
        return Objects.equals(includeDocuments, recipientEvent.includeDocuments) &&
                Objects.equals(recipientEventStatusCode, recipientEvent.recipientEventStatusCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includeDocuments, recipientEventStatusCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecipientEvent {\n");

        sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
        sb.append("    recipientEventStatusCode: ").append(toIndentedString(recipientEventStatusCode)).append("\n");
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
