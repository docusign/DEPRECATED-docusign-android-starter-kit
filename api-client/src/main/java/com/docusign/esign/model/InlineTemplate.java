package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class InlineTemplate implements Serializable {

    @SerializedName("customFields")
    private CustomFields customFields = null;

    @SerializedName("documents")
    private java.util.List<Document> documents = new java.util.ArrayList<Document>();

    @SerializedName("envelope")
    private Envelope envelope = null;

    @SerializedName("recipients")
    private Recipients recipients = null;

    @SerializedName("sequence")
    private String sequence = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public CustomFields getCustomFields() {
        return customFields;
    }

    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }


    /**
     * Complex element contains the details on the documents in the envelope.
     **/
    @ApiModelProperty(value = "Complex element contains the details on the documents in the envelope.")
    public java.util.List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(java.util.List<Document> documents) {
        this.documents = documents;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Envelope getEnvelope() {
        return envelope;
    }

    public void setEnvelope(Envelope envelope) {
        this.envelope = envelope;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Recipients getRecipients() {
        return recipients;
    }

    public void setRecipients(Recipients recipients) {
        this.recipients = recipients;
    }


    /**
     * Specifies the order in which templates are overlaid.
     **/
    @ApiModelProperty(value = "Specifies the order in which templates are overlaid.")
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineTemplate inlineTemplate = (InlineTemplate) o;
        return Objects.equals(customFields, inlineTemplate.customFields) &&
                Objects.equals(documents, inlineTemplate.documents) &&
                Objects.equals(envelope, inlineTemplate.envelope) &&
                Objects.equals(recipients, inlineTemplate.recipients) &&
                Objects.equals(sequence, inlineTemplate.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customFields, documents, envelope, recipients, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineTemplate {\n");

        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
        sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
