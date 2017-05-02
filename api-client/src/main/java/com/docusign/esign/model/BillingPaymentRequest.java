package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BillingPaymentRequest implements Serializable {

    @SerializedName("paymentAmount")
    private String paymentAmount = null;


    /**
     * The payment amount for the past due invoices. This value must match the pastDueBalance value retrieved using Get Past Due Invoices.
     **/
    @ApiModelProperty(value = "The payment amount for the past due invoices. This value must match the pastDueBalance value retrieved using Get Past Due Invoices.")
    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingPaymentRequest billingPaymentRequest = (BillingPaymentRequest) o;
        return Objects.equals(paymentAmount, billingPaymentRequest.paymentAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPaymentRequest {\n");

        sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
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
