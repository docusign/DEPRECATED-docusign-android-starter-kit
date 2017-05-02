package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Defines an account billing plan response object.
 **/
@ApiModel(description = "Defines an account billing plan response object.")
public class AccountBillingPlanResponse implements Serializable {

    @SerializedName("billingAddress")
    private AccountAddress billingAddress = null;

    @SerializedName("billingAddressIsCreditCardAddress")
    private String billingAddressIsCreditCardAddress = null;

    @SerializedName("billingPlan")
    private AccountBillingPlan billingPlan = null;

    @SerializedName("creditCardInformation")
    private CreditCardInformation creditCardInformation = null;

    @SerializedName("referralInformation")
    private ReferralInformation referralInformation = null;

    @SerializedName("successorPlans")
    private java.util.List<BillingPlan> successorPlans = new java.util.ArrayList<BillingPlan>();


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
     * When set to **true**, the credit card address information is the same as that returned as the billing address. If false, then the billing address is considered a billing contact address, and the credit card address can be different.
     **/
    @ApiModelProperty(value = "When set to **true**, the credit card address information is the same as that returned as the billing address. If false, then the billing address is considered a billing contact address, and the credit card address can be different.")
    public String getBillingAddressIsCreditCardAddress() {
        return billingAddressIsCreditCardAddress;
    }

    public void setBillingAddressIsCreditCardAddress(String billingAddressIsCreditCardAddress) {
        this.billingAddressIsCreditCardAddress = billingAddressIsCreditCardAddress;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public AccountBillingPlan getBillingPlan() {
        return billingPlan;
    }

    public void setBillingPlan(AccountBillingPlan billingPlan) {
        this.billingPlan = billingPlan;
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
        AccountBillingPlanResponse accountBillingPlanResponse = (AccountBillingPlanResponse) o;
        return Objects.equals(billingAddress, accountBillingPlanResponse.billingAddress) &&
                Objects.equals(billingAddressIsCreditCardAddress, accountBillingPlanResponse.billingAddressIsCreditCardAddress) &&
                Objects.equals(billingPlan, accountBillingPlanResponse.billingPlan) &&
                Objects.equals(creditCardInformation, accountBillingPlanResponse.creditCardInformation) &&
                Objects.equals(referralInformation, accountBillingPlanResponse.referralInformation) &&
                Objects.equals(successorPlans, accountBillingPlanResponse.successorPlans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingAddress, billingAddressIsCreditCardAddress, billingPlan, creditCardInformation, referralInformation, successorPlans);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountBillingPlanResponse {\n");

        sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
        sb.append("    billingAddressIsCreditCardAddress: ").append(toIndentedString(billingAddressIsCreditCardAddress)).append("\n");
        sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
        sb.append("    creditCardInformation: ").append(toIndentedString(creditCardInformation)).append("\n");
        sb.append("    referralInformation: ").append(toIndentedString(referralInformation)).append("\n");
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
