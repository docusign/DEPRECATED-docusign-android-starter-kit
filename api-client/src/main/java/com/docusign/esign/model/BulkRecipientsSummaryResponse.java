package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BulkRecipientsSummaryResponse implements Serializable {

    @SerializedName("bulkRecipients")
    private java.util.List<BulkRecipient> bulkRecipients = new java.util.ArrayList<BulkRecipient>();

    @SerializedName("bulkRecipientsCount")
    private String bulkRecipientsCount = null;

    @SerializedName("bulkRecipientsUri")
    private String bulkRecipientsUri = null;

    @SerializedName("errorDetails")
    private java.util.List<ErrorDetails> errorDetails = new java.util.ArrayList<ErrorDetails>();


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
     * The number of items returned in this response.
     **/
    @ApiModelProperty(value = "The number of items returned in this response.")
    public String getBulkRecipientsCount() {
        return bulkRecipientsCount;
    }

    public void setBulkRecipientsCount(String bulkRecipientsCount) {
        this.bulkRecipientsCount = bulkRecipientsCount;
    }


    /**
     * Contains a URI for an endpoint that allows you to easily retrieve bulk recipient information.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that allows you to easily retrieve bulk recipient information.")
    public String getBulkRecipientsUri() {
        return bulkRecipientsUri;
    }

    public void setBulkRecipientsUri(String bulkRecipientsUri) {
        this.bulkRecipientsUri = bulkRecipientsUri;
    }


    /**
     * Array or errors.
     **/
    @ApiModelProperty(value = "Array or errors.")
    public java.util.List<ErrorDetails> getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(java.util.List<ErrorDetails> errorDetails) {
        this.errorDetails = errorDetails;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BulkRecipientsSummaryResponse bulkRecipientsSummaryResponse = (BulkRecipientsSummaryResponse) o;
        return Objects.equals(bulkRecipients, bulkRecipientsSummaryResponse.bulkRecipients) &&
                Objects.equals(bulkRecipientsCount, bulkRecipientsSummaryResponse.bulkRecipientsCount) &&
                Objects.equals(bulkRecipientsUri, bulkRecipientsSummaryResponse.bulkRecipientsUri) &&
                Objects.equals(errorDetails, bulkRecipientsSummaryResponse.errorDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkRecipients, bulkRecipientsCount, bulkRecipientsUri, errorDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkRecipientsSummaryResponse {\n");

        sb.append("    bulkRecipients: ").append(toIndentedString(bulkRecipients)).append("\n");
        sb.append("    bulkRecipientsCount: ").append(toIndentedString(bulkRecipientsCount)).append("\n");
        sb.append("    bulkRecipientsUri: ").append(toIndentedString(bulkRecipientsUri)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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
