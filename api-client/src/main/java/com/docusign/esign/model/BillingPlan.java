package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information about a billing plan.
 **/
@ApiModel(description = "Contains information about a billing plan.")
public class BillingPlan implements Serializable {

    @SerializedName("appStoreProducts")
    private java.util.List<AppStoreProduct> appStoreProducts = new java.util.ArrayList<AppStoreProduct>();

    @SerializedName("currencyPlanPrices")
    private java.util.List<CurrencyPlanPrice> currencyPlanPrices = new java.util.ArrayList<CurrencyPlanPrice>();

    @SerializedName("enableSupport")
    private String enableSupport = null;

    @SerializedName("includedSeats")
    private String includedSeats = null;

    @SerializedName("otherDiscountPercent")
    private String otherDiscountPercent = null;

    @SerializedName("paymentCycle")
    private String paymentCycle = null;

    @SerializedName("paymentMethod")
    private String paymentMethod = null;

    @SerializedName("perSeatPrice")
    private String perSeatPrice = null;

    @SerializedName("planClassification")
    private String planClassification = null;

    @SerializedName("planFeatureSets")
    private java.util.List<FeatureSet> planFeatureSets = new java.util.ArrayList<FeatureSet>();

    @SerializedName("planId")
    private String planId = null;

    @SerializedName("planName")
    private String planName = null;

    @SerializedName("seatDiscounts")
    private java.util.List<SeatDiscount> seatDiscounts = new java.util.ArrayList<SeatDiscount>();

    @SerializedName("supportIncidentFee")
    private String supportIncidentFee = null;

    @SerializedName("supportPlanFee")
    private String supportPlanFee = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public java.util.List<AppStoreProduct> getAppStoreProducts() {
        return appStoreProducts;
    }

    public void setAppStoreProducts(java.util.List<AppStoreProduct> appStoreProducts) {
        this.appStoreProducts = appStoreProducts;
    }


    /**
     * Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, and seatFee that are configured for this plan feature set.
     **/
    @ApiModelProperty(value = "Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, and seatFee that are configured for this plan feature set.")
    public java.util.List<CurrencyPlanPrice> getCurrencyPlanPrices() {
        return currencyPlanPrices;
    }

    public void setCurrencyPlanPrices(java.util.List<CurrencyPlanPrice> currencyPlanPrices) {
        this.currencyPlanPrices = currencyPlanPrices;
    }


    /**
     * When set to **true**, then customer support is provided as part of the account plan.
     **/
    @ApiModelProperty(value = "When set to **true**, then customer support is provided as part of the account plan.")
    public String getEnableSupport() {
        return enableSupport;
    }

    public void setEnableSupport(String enableSupport) {
        this.enableSupport = enableSupport;
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
    public String getOtherDiscountPercent() {
        return otherDiscountPercent;
    }

    public void setOtherDiscountPercent(String otherDiscountPercent) {
        this.otherDiscountPercent = otherDiscountPercent;
    }


    /**
     * The payment cycle associated with the plan. The possible values are: Monthly or Annually.
     **/
    @ApiModelProperty(value = " The payment cycle associated with the plan. The possible values are: Monthly or Annually. ")
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
     * The per seat price for the plan.
     **/
    @ApiModelProperty(value = "The per seat price for the plan.")
    public String getPerSeatPrice() {
        return perSeatPrice;
    }

    public void setPerSeatPrice(String perSeatPrice) {
        this.perSeatPrice = perSeatPrice;
    }


    /**
     * Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.
     **/
    @ApiModelProperty(value = "Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.")
    public String getPlanClassification() {
        return planClassification;
    }

    public void setPlanClassification(String planClassification) {
        this.planClassification = planClassification;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<FeatureSet> getPlanFeatureSets() {
        return planFeatureSets;
    }

    public void setPlanFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
        this.planFeatureSets = planFeatureSets;
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
     * The name of the Billing Plan.
     **/
    @ApiModelProperty(value = "The name of the Billing Plan.")
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<SeatDiscount> getSeatDiscounts() {
        return seatDiscounts;
    }

    public void setSeatDiscounts(java.util.List<SeatDiscount> seatDiscounts) {
        this.seatDiscounts = seatDiscounts;
    }


    /**
     * The support incident fee charged for each support incident.
     **/
    @ApiModelProperty(value = "The support incident fee charged for each support incident.")
    public String getSupportIncidentFee() {
        return supportIncidentFee;
    }

    public void setSupportIncidentFee(String supportIncidentFee) {
        this.supportIncidentFee = supportIncidentFee;
    }


    /**
     * The support plan fee charged for this plan.
     **/
    @ApiModelProperty(value = "The support plan fee charged for this plan.")
    public String getSupportPlanFee() {
        return supportPlanFee;
    }

    public void setSupportPlanFee(String supportPlanFee) {
        this.supportPlanFee = supportPlanFee;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingPlan billingPlan = (BillingPlan) o;
        return Objects.equals(appStoreProducts, billingPlan.appStoreProducts) &&
                Objects.equals(currencyPlanPrices, billingPlan.currencyPlanPrices) &&
                Objects.equals(enableSupport, billingPlan.enableSupport) &&
                Objects.equals(includedSeats, billingPlan.includedSeats) &&
                Objects.equals(otherDiscountPercent, billingPlan.otherDiscountPercent) &&
                Objects.equals(paymentCycle, billingPlan.paymentCycle) &&
                Objects.equals(paymentMethod, billingPlan.paymentMethod) &&
                Objects.equals(perSeatPrice, billingPlan.perSeatPrice) &&
                Objects.equals(planClassification, billingPlan.planClassification) &&
                Objects.equals(planFeatureSets, billingPlan.planFeatureSets) &&
                Objects.equals(planId, billingPlan.planId) &&
                Objects.equals(planName, billingPlan.planName) &&
                Objects.equals(seatDiscounts, billingPlan.seatDiscounts) &&
                Objects.equals(supportIncidentFee, billingPlan.supportIncidentFee) &&
                Objects.equals(supportPlanFee, billingPlan.supportPlanFee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appStoreProducts, currencyPlanPrices, enableSupport, includedSeats, otherDiscountPercent, paymentCycle, paymentMethod, perSeatPrice, planClassification, planFeatureSets, planId, planName, seatDiscounts, supportIncidentFee, supportPlanFee);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPlan {\n");

        sb.append("    appStoreProducts: ").append(toIndentedString(appStoreProducts)).append("\n");
        sb.append("    currencyPlanPrices: ").append(toIndentedString(currencyPlanPrices)).append("\n");
        sb.append("    enableSupport: ").append(toIndentedString(enableSupport)).append("\n");
        sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
        sb.append("    otherDiscountPercent: ").append(toIndentedString(otherDiscountPercent)).append("\n");
        sb.append("    paymentCycle: ").append(toIndentedString(paymentCycle)).append("\n");
        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
        sb.append("    perSeatPrice: ").append(toIndentedString(perSeatPrice)).append("\n");
        sb.append("    planClassification: ").append(toIndentedString(planClassification)).append("\n");
        sb.append("    planFeatureSets: ").append(toIndentedString(planFeatureSets)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
        sb.append("    seatDiscounts: ").append(toIndentedString(seatDiscounts)).append("\n");
        sb.append("    supportIncidentFee: ").append(toIndentedString(supportIncidentFee)).append("\n");
        sb.append("    supportPlanFee: ").append(toIndentedString(supportPlanFee)).append("\n");
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
