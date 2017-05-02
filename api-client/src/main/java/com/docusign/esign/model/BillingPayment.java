package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information on a billing plan.
 **/
@ApiModel(description = "Contains information on a billing plan.")
public class BillingPayment implements Serializable {

    @SerializedName("amount")
    private String amount = null;

    @SerializedName("invoiceId")
    private String invoiceId = null;

    @SerializedName("paymentId")
    private String paymentId = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingPayment billingPayment = (BillingPayment) o;
        return Objects.equals(amount, billingPayment.amount) &&
                Objects.equals(invoiceId, billingPayment.invoiceId) &&
                Objects.equals(paymentId, billingPayment.paymentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, invoiceId, paymentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPayment {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
        sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
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
