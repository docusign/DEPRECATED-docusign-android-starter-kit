package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Defines a billing payment request object.
 **/
@ApiModel(description = "Defines a billing payment request object.")
public class BillingPaymentItem implements Serializable {

    @SerializedName("amount")
    private String amount = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("paymentDate")
    private String paymentDate = null;

    @SerializedName("paymentId")
    private String paymentId = null;

    @SerializedName("paymentNumber")
    private String paymentNumber = null;


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
     *
     **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
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


    /**
     * When set to **true**, a PDF version of the invoice is available. \n\nTo get the PDF, make the call again and change \"Accept:\" in the header to \"Accept: application/pdf\".
     **/
    @ApiModelProperty(value = "When set to **true**, a PDF version of the invoice is available. \n\nTo get the PDF, make the call again and change \"Accept:\" in the header to \"Accept: application/pdf\".")
    public String getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingPaymentItem billingPaymentItem = (BillingPaymentItem) o;
        return Objects.equals(amount, billingPaymentItem.amount) &&
                Objects.equals(description, billingPaymentItem.description) &&
                Objects.equals(paymentDate, billingPaymentItem.paymentDate) &&
                Objects.equals(paymentId, billingPaymentItem.paymentId) &&
                Objects.equals(paymentNumber, billingPaymentItem.paymentNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, description, paymentDate, paymentId, paymentNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPaymentItem {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
        sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
        sb.append("    paymentNumber: ").append(toIndentedString(paymentNumber)).append("\n");
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
