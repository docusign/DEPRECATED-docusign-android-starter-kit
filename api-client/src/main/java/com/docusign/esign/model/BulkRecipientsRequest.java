package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BulkRecipientsRequest implements Serializable {

    @SerializedName("bulkRecipients")
    private java.util.List<BulkRecipient> bulkRecipients = new java.util.ArrayList<BulkRecipient>();


    /**
     * A complex type containing information about the bulk recipients in the request.
     **/
    @ApiModelProperty(value = "A complex type containing information about the bulk recipients in the request.")
    public java.util.List<BulkRecipient> getBulkRecipients() {
        return bulkRecipients;
    }

    public void setBulkRecipients(java.util.List<BulkRecipient> bulkRecipients) {
        this.bulkRecipients = bulkRecipients;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BulkRecipientsRequest bulkRecipientsRequest = (BulkRecipientsRequest) o;
        return Objects.equals(bulkRecipients, bulkRecipientsRequest.bulkRecipients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkRecipients);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkRecipientsRequest {\n");

        sb.append("    bulkRecipients: ").append(toIndentedString(bulkRecipients)).append("\n");
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
