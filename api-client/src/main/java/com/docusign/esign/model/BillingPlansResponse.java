package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Defines a billing plans response object.
 **/
@ApiModel(description = "Defines a billing plans response object.")
public class BillingPlansResponse implements Serializable {

    @SerializedName("billingPlans")
    private java.util.List<BillingPlan> billingPlans = new java.util.ArrayList<BillingPlan>();


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public java.util.List<BillingPlan> getBillingPlans() {
        return billingPlans;
    }

    public void setBillingPlans(java.util.List<BillingPlan> billingPlans) {
        this.billingPlans = billingPlans;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingPlansResponse billingPlansResponse = (BillingPlansResponse) o;
        return Objects.equals(billingPlans, billingPlansResponse.billingPlans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingPlans);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPlansResponse {\n");

        sb.append("    billingPlans: ").append(toIndentedString(billingPlans)).append("\n");
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
