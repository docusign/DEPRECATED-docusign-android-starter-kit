package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Defines an billing payment response object.
 **/
@ApiModel(description = "Defines an billing payment response object.")
public class BillingPaymentResponse implements Serializable {

    @SerializedName("billingPayments")
    private java.util.List<BillingPayment> billingPayments = new java.util.ArrayList<BillingPayment>();


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public java.util.List<BillingPayment> getBillingPayments() {
        return billingPayments;
    }

    public void setBillingPayments(java.util.List<BillingPayment> billingPayments) {
        this.billingPayments = billingPayments;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingPaymentResponse billingPaymentResponse = (BillingPaymentResponse) o;
        return Objects.equals(billingPayments, billingPaymentResponse.billingPayments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingPayments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPaymentResponse {\n");

        sb.append("    billingPayments: ").append(toIndentedString(billingPayments)).append("\n");
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
