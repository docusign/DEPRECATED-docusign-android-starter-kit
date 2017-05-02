package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PaymentDetails implements Serializable {

    @SerializedName("currencyCode")
    private String currencyCode = null;

    @SerializedName("gatewayAccountId")
    private String gatewayAccountId = null;

    @SerializedName("lineItems")
    private java.util.List<PaymentLineItem> lineItems = new java.util.ArrayList<PaymentLineItem>();

    @SerializedName("status")
    private String status = null;

    @SerializedName("total")
    private Money total = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getGatewayAccountId() {
        return gatewayAccountId;
    }

    public void setGatewayAccountId(String gatewayAccountId) {
        this.gatewayAccountId = gatewayAccountId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<PaymentLineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(java.util.List<PaymentLineItem> lineItems) {
        this.lineItems = lineItems;
    }


    /**
     * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
     **/
    @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Money getTotal() {
        return total;
    }

    public void setTotal(Money total) {
        this.total = total;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentDetails paymentDetails = (PaymentDetails) o;
        return Objects.equals(currencyCode, paymentDetails.currencyCode) &&
                Objects.equals(gatewayAccountId, paymentDetails.gatewayAccountId) &&
                Objects.equals(lineItems, paymentDetails.lineItems) &&
                Objects.equals(status, paymentDetails.status) &&
                Objects.equals(total, paymentDetails.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, gatewayAccountId, lineItems, status, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentDetails {\n");

        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    gatewayAccountId: ").append(toIndentedString(gatewayAccountId)).append("\n");
        sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
