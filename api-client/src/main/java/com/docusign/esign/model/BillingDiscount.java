package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BillingDiscount implements Serializable {

    @SerializedName("beginQuantity")
    private String beginQuantity = null;

    @SerializedName("discount")
    private String discount = null;

    @SerializedName("endQuantity")
    private String endQuantity = null;


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
    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingDiscount billingDiscount = (BillingDiscount) o;
        return Objects.equals(beginQuantity, billingDiscount.beginQuantity) &&
                Objects.equals(discount, billingDiscount.discount) &&
                Objects.equals(endQuantity, billingDiscount.endQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginQuantity, discount, endQuantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingDiscount {\n");

        sb.append("    beginQuantity: ").append(toIndentedString(beginQuantity)).append("\n");
        sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
        sb.append("    endQuantity: ").append(toIndentedString(endQuantity)).append("\n");
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
