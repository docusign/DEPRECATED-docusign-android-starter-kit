package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Defines a billing plan update response object.
 **/
@ApiModel(description = "Defines a billing plan update response object.")
public class BillingPlanUpdateResponse implements Serializable {

    @SerializedName("billingPlanPreview")
    private BillingPlanPreview billingPlanPreview = null;

    @SerializedName("currencyCode")
    private String currencyCode = null;

    @SerializedName("includedSeats")
    private String includedSeats = null;

    @SerializedName("paymentCycle")
    private String paymentCycle = null;

    @SerializedName("paymentMethod")
    private String paymentMethod = null;

    @SerializedName("planId")
    private String planId = null;

    @SerializedName("planName")
    private String planName = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public BillingPlanPreview getBillingPlanPreview() {
        return billingPlanPreview;
    }

    public void setBillingPlanPreview(BillingPlanPreview billingPlanPreview) {
        this.billingPlanPreview = billingPlanPreview;
    }


    /**
     * Specifies the ISO currency code for the account.
     **/
    @ApiModelProperty(value = "Specifies the ISO currency code for the account.")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * The number of seats (users) included.
     **/
    @ApiModelProperty(value = "The number of seats (users) included.")
    public String getIncludedSeats() {
        return includedSeats;
    }

    public void setIncludedSeats(String includedSeats) {
        this.includedSeats = includedSeats;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPaymentCycle() {
        return paymentCycle;
    }

    public void setPaymentCycle(String paymentCycle) {
        this.paymentCycle = paymentCycle;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingPlanUpdateResponse billingPlanUpdateResponse = (BillingPlanUpdateResponse) o;
        return Objects.equals(billingPlanPreview, billingPlanUpdateResponse.billingPlanPreview) &&
                Objects.equals(currencyCode, billingPlanUpdateResponse.currencyCode) &&
                Objects.equals(includedSeats, billingPlanUpdateResponse.includedSeats) &&
                Objects.equals(paymentCycle, billingPlanUpdateResponse.paymentCycle) &&
                Objects.equals(paymentMethod, billingPlanUpdateResponse.paymentMethod) &&
                Objects.equals(planId, billingPlanUpdateResponse.planId) &&
                Objects.equals(planName, billingPlanUpdateResponse.planName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingPlanPreview, currencyCode, includedSeats, paymentCycle, paymentMethod, planId, planName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPlanUpdateResponse {\n");

        sb.append("    billingPlanPreview: ").append(toIndentedString(billingPlanPreview)).append("\n");
        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
        sb.append("    paymentCycle: ").append(toIndentedString(paymentCycle)).append("\n");
        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
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
