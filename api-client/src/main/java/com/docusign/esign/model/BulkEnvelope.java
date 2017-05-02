package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BulkEnvelope implements Serializable {

    @SerializedName("bulkRecipientRow")
    private String bulkRecipientRow = null;

    @SerializedName("bulkStatus")
    private String bulkStatus = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("envelopeId")
    private String envelopeId = null;

    @SerializedName("envelopeUri")
    private String envelopeUri = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("submittedDateTime")
    private String submittedDateTime = null;

    @SerializedName("transactionId")
    private String transactionId = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBulkRecipientRow() {
        return bulkRecipientRow;
    }

    public void setBulkRecipientRow(String bulkRecipientRow) {
        this.bulkRecipientRow = bulkRecipientRow;
    }


    /**
     * Indicates the status of the bulk send operation. Returned values can be:\n* queued\n* processing\n* sent\n* failed
     **/
    @ApiModelProperty(value = "Indicates the status of the bulk send operation. Returned values can be:\n* queued\n* processing\n* sent\n* failed")
    public String getBulkStatus() {
        return bulkStatus;
    }

    public void setBulkStatus(String bulkStatus) {
        this.bulkStatus = bulkStatus;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * The envelope ID of the envelope status that failed to post.
     **/
    @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }


    /**
     * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
    public String getEnvelopeUri() {
        return envelopeUri;
    }

    public void setEnvelopeUri(String envelopeUri) {
        this.envelopeUri = envelopeUri;
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
    public String getSubmittedDateTime() {
        return submittedDateTime;
    }

    public void setSubmittedDateTime(String submittedDateTime) {
        this.submittedDateTime = submittedDateTime;
    }


    /**
     * Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.
     **/
    @ApiModelProperty(value = " Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BulkEnvelope bulkEnvelope = (BulkEnvelope) o;
        return Objects.equals(bulkRecipientRow, bulkEnvelope.bulkRecipientRow) &&
                Objects.equals(bulkStatus, bulkEnvelope.bulkStatus) &&
                Objects.equals(email, bulkEnvelope.email) &&
                Objects.equals(envelopeId, bulkEnvelope.envelopeId) &&
                Objects.equals(envelopeUri, bulkEnvelope.envelopeUri) &&
                Objects.equals(errorDetails, bulkEnvelope.errorDetails) &&
                Objects.equals(name, bulkEnvelope.name) &&
                Objects.equals(submittedDateTime, bulkEnvelope.submittedDateTime) &&
                Objects.equals(transactionId, bulkEnvelope.transactionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkRecipientRow, bulkStatus, email, envelopeId, envelopeUri, errorDetails, name, submittedDateTime, transactionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkEnvelope {\n");

        sb.append("    bulkRecipientRow: ").append(toIndentedString(bulkRecipientRow)).append("\n");
        sb.append("    bulkStatus: ").append(toIndentedString(bulkStatus)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
        sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    submittedDateTime: ").append(toIndentedString(submittedDateTime)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
