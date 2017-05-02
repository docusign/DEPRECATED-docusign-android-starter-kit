package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Defines a billing charge response object.
 **/
@ApiModel(description = "Defines a billing charge response object.")
public class BillingChargeResponse implements Serializable {

    @SerializedName("billingChargeItems")
    private java.util.List<BillingCharge> billingChargeItems = new java.util.ArrayList<BillingCharge>();


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public java.util.List<BillingCharge> getBillingChargeItems() {
        return billingChargeItems;
    }

    public void setBillingChargeItems(java.util.List<BillingCharge> billingChargeItems) {
        this.billingChargeItems = billingChargeItems;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingChargeResponse billingChargeResponse = (BillingChargeResponse) o;
        return Objects.equals(billingChargeItems, billingChargeResponse.billingChargeItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingChargeItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingChargeResponse {\n");

        sb.append("    billingChargeItems: ").append(toIndentedString(billingChargeItems)).append("\n");
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
