package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Defines a billing payments response object.
 **/
@ApiModel(description = "Defines a billing payments response object.")
public class BillingPaymentsResponse implements Serializable {

    @SerializedName("billingPayments")
    private java.util.List<BillingPaymentItem> billingPayments = new java.util.ArrayList<BillingPaymentItem>();

    @SerializedName("nextUri")
    private String nextUri = null;

    @SerializedName("previousUri")
    private String previousUri = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public java.util.List<BillingPaymentItem> getBillingPayments() {
        return billingPayments;
    }

    public void setBillingPayments(java.util.List<BillingPaymentItem> billingPayments) {
        this.billingPayments = billingPayments;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingPaymentsResponse billingPaymentsResponse = (BillingPaymentsResponse) o;
        return Objects.equals(billingPayments, billingPaymentsResponse.billingPayments) &&
                Objects.equals(nextUri, billingPaymentsResponse.nextUri) &&
                Objects.equals(previousUri, billingPaymentsResponse.previousUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingPayments, nextUri, previousUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPaymentsResponse {\n");

        sb.append("    billingPayments: ").append(toIndentedString(billingPayments)).append("\n");
        sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
        sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
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
