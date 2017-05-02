package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information about an item on a billing invoice.
 **/
@ApiModel(description = "Contains information about an item on a billing invoice.")
public class BillingInvoiceItem implements Serializable {

    @SerializedName("chargeAmount")
    private String chargeAmount = null;

    @SerializedName("chargeName")
    private String chargeName = null;

    @SerializedName("invoiceItemId")
    private String invoiceItemId = null;

    @SerializedName("quantity")
    private String quantity = null;

    @SerializedName("unitPrice")
    private String unitPrice = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getInvoiceItemId() {
        return invoiceItemId;
    }

    public void setInvoiceItemId(String invoiceItemId) {
        this.invoiceItemId = invoiceItemId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingInvoiceItem billingInvoiceItem = (BillingInvoiceItem) o;
        return Objects.equals(chargeAmount, billingInvoiceItem.chargeAmount) &&
                Objects.equals(chargeName, billingInvoiceItem.chargeName) &&
                Objects.equals(invoiceItemId, billingInvoiceItem.invoiceItemId) &&
                Objects.equals(quantity, billingInvoiceItem.quantity) &&
                Objects.equals(unitPrice, billingInvoiceItem.unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargeAmount, chargeName, invoiceItemId, quantity, unitPrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingInvoiceItem {\n");

        sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
        sb.append("    chargeName: ").append(toIndentedString(chargeName)).append("\n");
        sb.append("    invoiceItemId: ").append(toIndentedString(invoiceItemId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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
