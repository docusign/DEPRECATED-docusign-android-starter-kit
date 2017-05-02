package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BulkRecipientsResponse implements Serializable {

    @SerializedName("bulkRecipients")
    private java.util.List<BulkRecipient> bulkRecipients = new java.util.ArrayList<BulkRecipient>();

    @SerializedName("endPosition")
    private String endPosition = null;

    @SerializedName("nextUri")
    private String nextUri = null;

    @SerializedName("previousUri")
    private String previousUri = null;

    @SerializedName("resultSetSize")
    private String resultSetSize = null;

    @SerializedName("startPosition")
    private String startPosition = null;

    @SerializedName("totalSetSize")
    private String totalSetSize = null;


    /**
     * A complex type containing information about the bulk recipients in the response.
     **/
    @ApiModelProperty(value = "A complex type containing information about the bulk recipients in the response.")
    public java.util.List<BulkRecipient> getBulkRecipients() {
        return bulkRecipients;
    }

    public void setBulkRecipients(java.util.List<BulkRecipient> bulkRecipients) {
        this.bulkRecipients = bulkRecipients;
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
        BulkRecipientsResponse bulkRecipientsResponse = (BulkRecipientsResponse) o;
        return Objects.equals(bulkRecipients, bulkRecipientsResponse.bulkRecipients) &&
                Objects.equals(endPosition, bulkRecipientsResponse.endPosition) &&
                Objects.equals(nextUri, bulkRecipientsResponse.nextUri) &&
                Objects.equals(previousUri, bulkRecipientsResponse.previousUri) &&
                Objects.equals(resultSetSize, bulkRecipientsResponse.resultSetSize) &&
                Objects.equals(startPosition, bulkRecipientsResponse.startPosition) &&
                Objects.equals(totalSetSize, bulkRecipientsResponse.totalSetSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkRecipients, endPosition, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkRecipientsResponse {\n");

        sb.append("    bulkRecipients: ").append(toIndentedString(bulkRecipients)).append("\n");
        sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
        sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
        sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
        sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
        sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
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
