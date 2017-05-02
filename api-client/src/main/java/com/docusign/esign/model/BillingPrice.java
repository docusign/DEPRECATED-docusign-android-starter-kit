package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BillingPrice implements Serializable {

    @SerializedName("beginQuantity")
    private String beginQuantity = null;

    @SerializedName("endQuantity")
    private String endQuantity = null;

    @SerializedName("unitPrice")
    private String unitPrice = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBeginQuantity() {
        return beginQuantity;
    }

    public void setBeginQuantity(String beginQuantity) {
        this.beginQuantity = beginQuantity;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEndQuantity() {
        return endQuantity;
    }

    public void setEndQuantity(String endQuantity) {
        this.endQuantity = endQuantity;
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
        BillingPrice billingPrice = (BillingPrice) o;
        return Objects.equals(beginQuantity, billingPrice.beginQuantity) &&
                Objects.equals(endQuantity, billingPrice.endQuantity) &&
                Objects.equals(unitPrice, billingPrice.unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginQuantity, endQuantity, unitPrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPrice {\n");

        sb.append("    beginQuantity: ").append(toIndentedString(beginQuantity)).append("\n");
        sb.append("    endQuantity: ").append(toIndentedString(endQuantity)).append("\n");
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
