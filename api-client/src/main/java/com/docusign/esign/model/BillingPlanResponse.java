package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Defines a billing plan response object.
 **/
@ApiModel(description = "Defines a billing plan response object.")
public class BillingPlanResponse implements Serializable {

    @SerializedName("billingPlan")
    private BillingPlan billingPlan = null;

    @SerializedName("successorPlans")
    private java.util.List<BillingPlan> successorPlans = new java.util.ArrayList<BillingPlan>();


    /**
     **/
    @ApiModelProperty(value = "")
    public BillingPlan getBillingPlan() {
        return billingPlan;
    }

    public void setBillingPlan(BillingPlan billingPlan) {
        this.billingPlan = billingPlan;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<BillingPlan> getSuccessorPlans() {
        return successorPlans;
    }

    public void setSuccessorPlans(java.util.List<BillingPlan> successorPlans) {
        this.successorPlans = successorPlans;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingPlanResponse billingPlanResponse = (BillingPlanResponse) o;
        return Objects.equals(billingPlan, billingPlanResponse.billingPlan) &&
                Objects.equals(successorPlans, billingPlanResponse.successorPlans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingPlan, successorPlans);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPlanResponse {\n");

        sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
        sb.append("    successorPlans: ").append(toIndentedString(successorPlans)).append("\n");
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
