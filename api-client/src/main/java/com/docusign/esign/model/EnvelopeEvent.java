package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeEvent implements Serializable {

    @SerializedName("envelopeEventStatusCode")
    private String envelopeEventStatusCode = null;

    @SerializedName("includeDocuments")
    private String includeDocuments = null;


    /**
     * he envelope status, this can be Sent, Delivered, Completed, Declined, or Voided.
     **/
    @ApiModelProperty(value = "he envelope status, this can be Sent, Delivered, Completed, Declined, or Voided.")
    public String getEnvelopeEventStatusCode() {
        return envelopeEventStatusCode;
    }

    public void setEnvelopeEventStatusCode(String envelopeEventStatusCode) {
        this.envelopeEventStatusCode = envelopeEventStatusCode;
    }


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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeEvent envelopeEvent = (EnvelopeEvent) o;
        return Objects.equals(envelopeEventStatusCode, envelopeEvent.envelopeEventStatusCode) &&
                Objects.equals(includeDocuments, envelopeEvent.includeDocuments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envelopeEventStatusCode, includeDocuments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeEvent {\n");

        sb.append("    envelopeEventStatusCode: ").append(toIndentedString(envelopeEventStatusCode)).append("\n");
        sb.append("    includeDocuments: ").append(toIndentedString(includeDocuments)).append("\n");
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
