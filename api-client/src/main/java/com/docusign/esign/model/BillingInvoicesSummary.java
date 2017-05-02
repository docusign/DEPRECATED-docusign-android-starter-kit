package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BillingInvoicesSummary implements Serializable {

    @SerializedName("billingInvoices")
    private java.util.List<BillingInvoice> billingInvoices = new java.util.ArrayList<BillingInvoice>();

    @SerializedName("pastDueBalance")
    private String pastDueBalance = null;

    @SerializedName("paymentAllowed")
    private String paymentAllowed = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public java.util.List<BillingInvoice> getBillingInvoices() {
        return billingInvoices;
    }

    public void setBillingInvoices(java.util.List<BillingInvoice> billingInvoices) {
        this.billingInvoices = billingInvoices;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPastDueBalance() {
        return pastDueBalance;
    }

    public void setPastDueBalance(String pastDueBalance) {
        this.pastDueBalance = pastDueBalance;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPaymentAllowed() {
        return paymentAllowed;
    }

    public void setPaymentAllowed(String paymentAllowed) {
        this.paymentAllowed = paymentAllowed;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingInvoicesSummary billingInvoicesSummary = (BillingInvoicesSummary) o;
        return Objects.equals(billingInvoices, billingInvoicesSummary.billingInvoices) &&
                Objects.equals(pastDueBalance, billingInvoicesSummary.pastDueBalance) &&
                Objects.equals(paymentAllowed, billingInvoicesSummary.paymentAllowed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingInvoices, pastDueBalance, paymentAllowed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingInvoicesSummary {\n");

        sb.append("    billingInvoices: ").append(toIndentedString(billingInvoices)).append("\n");
        sb.append("    pastDueBalance: ").append(toIndentedString(pastDueBalance)).append("\n");
        sb.append("    paymentAllowed: ").append(toIndentedString(paymentAllowed)).append("\n");
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
