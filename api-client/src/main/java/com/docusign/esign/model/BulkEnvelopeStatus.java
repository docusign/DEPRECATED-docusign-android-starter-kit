package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BulkEnvelopeStatus implements Serializable {

    @SerializedName("batchId")
    private String batchId = null;

    @SerializedName("batchSize")
    private String batchSize = null;

    @SerializedName("bulkEnvelopes")
    private java.util.List<BulkEnvelope> bulkEnvelopes = new java.util.ArrayList<BulkEnvelope>();

    @SerializedName("bulkEnvelopesBatchUri")
    private String bulkEnvelopesBatchUri = null;

    @SerializedName("endPosition")
    private String endPosition = null;

    @SerializedName("failed")
    private String failed = null;

    @SerializedName("nextUri")
    private String nextUri = null;

    @SerializedName("previousUri")
    private String previousUri = null;

    @SerializedName("queued")
    private String queued = null;

    @SerializedName("resultSetSize")
    private String resultSetSize = null;

    @SerializedName("sent")
    private String sent = null;

    @SerializedName("startPosition")
    private String startPosition = null;

    @SerializedName("submittedDate")
    private String submittedDate = null;

    @SerializedName("totalSetSize")
    private String totalSetSize = null;


    /**
     * Specifies an identifier which can be used to retrieve a more detailed status of individual bulk recipient batches.
     **/
    @ApiModelProperty(value = "Specifies an identifier which can be used to retrieve a more detailed status of individual bulk recipient batches.")
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }


    /**
     * The number of items returned in this response.
     **/
    @ApiModelProperty(value = "The number of items returned in this response.")
    public String getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(String batchSize) {
        this.batchSize = batchSize;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public java.util.List<BulkEnvelope> getBulkEnvelopes() {
        return bulkEnvelopes;
    }

    public void setBulkEnvelopes(java.util.List<BulkEnvelope> bulkEnvelopes) {
        this.bulkEnvelopes = bulkEnvelopes;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBulkEnvelopesBatchUri() {
        return bulkEnvelopesBatchUri;
    }

    public void setBulkEnvelopesBatchUri(String bulkEnvelopesBatchUri) {
        this.bulkEnvelopesBatchUri = bulkEnvelopesBatchUri;
    }


    /**
     * The last position in the result set.
     **/
    @ApiModelProperty(value = "The last position in the result set. ")
    public String getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(String endPosition) {
        this.endPosition = endPosition;
    }


    /**
     * The number of entries with a status of failed.
     **/
    @ApiModelProperty(value = "The number of entries with a status of failed. ")
    public String getFailed() {
        return failed;
    }

    public void setFailed(String failed) {
        this.failed = failed;
    }


    /**
     * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null.
     **/
    @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
    public String getNextUri() {
        return nextUri;
    }

    public void setNextUri(String nextUri) {
        this.nextUri = nextUri;
    }


    /**
     * The postal code for the billing address.
     **/
    @ApiModelProperty(value = "The postal code for the billing address.")
    public String getPreviousUri() {
        return previousUri;
    }

    public void setPreviousUri(String previousUri) {
        this.previousUri = previousUri;
    }


    /**
     * The number of entries with a status of queued.
     **/
    @ApiModelProperty(value = "The number of entries with a status of queued. ")
    public String getQueued() {
        return queued;
    }

    public void setQueued(String queued) {
        this.queued = queued;
    }


    /**
     * The number of results returned in this response.
     **/
    @ApiModelProperty(value = "The number of results returned in this response. ")
    public String getResultSetSize() {
        return resultSetSize;
    }

    public void setResultSetSize(String resultSetSize) {
        this.resultSetSize = resultSetSize;
    }


    /**
     * The number of entries with a status of sent.
     **/
    @ApiModelProperty(value = "The number of entries with a status of sent.")
    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }


    /**
     * Starting position of the current result set.
     **/
    @ApiModelProperty(value = "Starting position of the current result set.")
    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(String submittedDate) {
        this.submittedDate = submittedDate;
    }


    /**
     * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
     **/
    @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
    public String getTotalSetSize() {
        return totalSetSize;
    }

    public void setTotalSetSize(String totalSetSize) {
        this.totalSetSize = totalSetSize;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BulkEnvelopeStatus bulkEnvelopeStatus = (BulkEnvelopeStatus) o;
        return Objects.equals(batchId, bulkEnvelopeStatus.batchId) &&
                Objects.equals(batchSize, bulkEnvelopeStatus.batchSize) &&
                Objects.equals(bulkEnvelopes, bulkEnvelopeStatus.bulkEnvelopes) &&
                Objects.equals(bulkEnvelopesBatchUri, bulkEnvelopeStatus.bulkEnvelopesBatchUri) &&
                Objects.equals(endPosition, bulkEnvelopeStatus.endPosition) &&
                Objects.equals(failed, bulkEnvelopeStatus.failed) &&
                Objects.equals(nextUri, bulkEnvelopeStatus.nextUri) &&
                Objects.equals(previousUri, bulkEnvelopeStatus.previousUri) &&
                Objects.equals(queued, bulkEnvelopeStatus.queued) &&
                Objects.equals(resultSetSize, bulkEnvelopeStatus.resultSetSize) &&
                Objects.equals(sent, bulkEnvelopeStatus.sent) &&
                Objects.equals(startPosition, bulkEnvelopeStatus.startPosition) &&
                Objects.equals(submittedDate, bulkEnvelopeStatus.submittedDate) &&
                Objects.equals(totalSetSize, bulkEnvelopeStatus.totalSetSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchId, batchSize, bulkEnvelopes, bulkEnvelopesBatchUri, endPosition, failed, nextUri, previousUri, queued, resultSetSize, sent, startPosition, submittedDate, totalSetSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkEnvelopeStatus {\n");

        sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
        sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
        sb.append("    bulkEnvelopes: ").append(toIndentedString(bulkEnvelopes)).append("\n");
        sb.append("    bulkEnvelopesBatchUri: ").append(toIndentedString(bulkEnvelopesBatchUri)).append("\n");
        sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
        sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
        sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
        sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
        sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
        sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
        sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
        sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
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
