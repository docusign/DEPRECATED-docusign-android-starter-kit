package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BillingPlanInformation implements Serializable {

    @SerializedName("appStoreReceipt")
    private AppStoreReceipt appStoreReceipt = null;

    @SerializedName("billingAddress")
    private AccountAddress billingAddress = null;

    @SerializedName("creditCardInformation")
    private CreditCardInformation creditCardInformation = null;

    @SerializedName("downgradeReason")
    private String downgradeReason = null;

    @SerializedName("enableSupport")
    private String enableSupport = null;

    @SerializedName("includedSeats")
    private String includedSeats = null;

    @SerializedName("incrementalSeats")
    private String incrementalSeats = null;

    @SerializedName("planInformation")
    private PlanInformation planInformation = null;

    @SerializedName("referralInformation")
    private ReferralInformation referralInformation = null;

    @SerializedName("renewalStatus")
    private String renewalStatus = null;

    @SerializedName("saleDiscountAmount")
    private String saleDiscountAmount = null;

    @SerializedName("saleDiscountFixedAmount")
    private String saleDiscountFixedAmount = null;

    @SerializedName("saleDiscountPercent")
    private String saleDiscountPercent = null;

    @SerializedName("saleDiscountPeriods")
    private String saleDiscountPeriods = null;

    @SerializedName("saleDiscountSeatPriceOverride")
    private String saleDiscountSeatPriceOverride = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public AppStoreReceipt getAppStoreReceipt() {
        return appStoreReceipt;
    }

    public void setAppStoreReceipt(AppStoreReceipt appStoreReceipt) {
        this.appStoreReceipt = appStoreReceipt;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public AccountAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(AccountAddress billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public CreditCardInformation getCreditCardInformation() {
        return creditCardInformation;
    }

    public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDowngradeReason() {
        return downgradeReason;
    }

    public void setDowngradeReason(String downgradeReason) {
        this.downgradeReason = downgradeReason;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
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
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getIncrementalSeats() {
        return incrementalSeats;
    }

    public void setIncrementalSeats(String incrementalSeats) {
        this.incrementalSeats = incrementalSeats;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public PlanInformation getPlanInformation() {
        return planInformation;
    }

    public void setPlanInformation(PlanInformation planInformation) {
        this.planInformation = planInformation;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public ReferralInformation getReferralInformation() {
        return referralInformation;
    }

    public void setReferralInformation(ReferralInformation referralInformation) {
        this.referralInformation = referralInformation;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getRenewalStatus() {
        return renewalStatus;
    }

    public void setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSaleDiscountAmount() {
        return saleDiscountAmount;
    }

    public void setSaleDiscountAmount(String saleDiscountAmount) {
        this.saleDiscountAmount = saleDiscountAmount;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSaleDiscountFixedAmount() {
        return saleDiscountFixedAmount;
    }

    public void setSaleDiscountFixedAmount(String saleDiscountFixedAmount) {
        this.saleDiscountFixedAmount = saleDiscountFixedAmount;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSaleDiscountPercent() {
        return saleDiscountPercent;
    }

    public void setSaleDiscountPercent(String saleDiscountPercent) {
        this.saleDiscountPercent = saleDiscountPercent;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSaleDiscountPeriods() {
        return saleDiscountPeriods;
    }

    public void setSaleDiscountPeriods(String saleDiscountPeriods) {
        this.saleDiscountPeriods = saleDiscountPeriods;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSaleDiscountSeatPriceOverride() {
        return saleDiscountSeatPriceOverride;
    }

    public void setSaleDiscountSeatPriceOverride(String saleDiscountSeatPriceOverride) {
        this.saleDiscountSeatPriceOverride = saleDiscountSeatPriceOverride;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingPlanInformation billingPlanInformation = (BillingPlanInformation) o;
        return Objects.equals(appStoreReceipt, billingPlanInformation.appStoreReceipt) &&
                Objects.equals(billingAddress, billingPlanInformation.billingAddress) &&
                Objects.equals(creditCardInformation, billingPlanInformation.creditCardInformation) &&
                Objects.equals(downgradeReason, billingPlanInformation.downgradeReason) &&
                Objects.equals(enableSupport, billingPlanInformation.enableSupport) &&
                Objects.equals(includedSeats, billingPlanInformation.includedSeats) &&
                Objects.equals(incrementalSeats, billingPlanInformation.incrementalSeats) &&
                Objects.equals(planInformation, billingPlanInformation.planInformation) &&
                Objects.equals(referralInformation, billingPlanInformation.referralInformation) &&
                Objects.equals(renewalStatus, billingPlanInformation.renewalStatus) &&
                Objects.equals(saleDiscountAmount, billingPlanInformation.saleDiscountAmount) &&
                Objects.equals(saleDiscountFixedAmount, billingPlanInformation.saleDiscountFixedAmount) &&
                Objects.equals(saleDiscountPercent, billingPlanInformation.saleDiscountPercent) &&
                Objects.equals(saleDiscountPeriods, billingPlanInformation.saleDiscountPeriods) &&
                Objects.equals(saleDiscountSeatPriceOverride, billingPlanInformation.saleDiscountSeatPriceOverride);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appStoreReceipt, billingAddress, creditCardInformation, downgradeReason, enableSupport, includedSeats, incrementalSeats, planInformation, referralInformation, renewalStatus, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPercent, saleDiscountPeriods, saleDiscountSeatPriceOverride);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPlanInformation {\n");

        sb.append("    appStoreReceipt: ").append(toIndentedString(appStoreReceipt)).append("\n");
        sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
        sb.append("    creditCardInformation: ").append(toIndentedString(creditCardInformation)).append("\n");
        sb.append("    downgradeReason: ").append(toIndentedString(downgradeReason)).append("\n");
        sb.append("    enableSupport: ").append(toIndentedString(enableSupport)).append("\n");
        sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
        sb.append("    incrementalSeats: ").append(toIndentedString(incrementalSeats)).append("\n");
        sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
        sb.append("    referralInformation: ").append(toIndentedString(referralInformation)).append("\n");
        sb.append("    renewalStatus: ").append(toIndentedString(renewalStatus)).append("\n");
        sb.append("    saleDiscountAmount: ").append(toIndentedString(saleDiscountAmount)).append("\n");
        sb.append("    saleDiscountFixedAmount: ").append(toIndentedString(saleDiscountFixedAmount)).append("\n");
        sb.append("    saleDiscountPercent: ").append(toIndentedString(saleDiscountPercent)).append("\n");
        sb.append("    saleDiscountPeriods: ").append(toIndentedString(saleDiscountPeriods)).append("\n");
        sb.append("    saleDiscountSeatPriceOverride: ").append(toIndentedString(saleDiscountSeatPriceOverride)).append("\n");
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
