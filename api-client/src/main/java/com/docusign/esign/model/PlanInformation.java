package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * An object used to identify the features and attributes of the account being created.
 **/
@ApiModel(description = "An object used to identify the features and attributes of the account being created.")
public class PlanInformation implements Serializable {

    @SerializedName("addOns")
    private java.util.List<AddOn> addOns = new java.util.ArrayList<AddOn>();

    @SerializedName("currencyCode")
    private String currencyCode = null;

    @SerializedName("freeTrialDaysOverride")
    private String freeTrialDaysOverride = null;

    @SerializedName("planFeatureSets")
    private java.util.List<FeatureSet> planFeatureSets = new java.util.ArrayList<FeatureSet>();

    @SerializedName("planId")
    private String planId = null;

    @SerializedName("recipientDomains")
    private java.util.List<RecipientDomain> recipientDomains = new java.util.ArrayList<RecipientDomain>();


    /**
     * Reserved:
     **/
    @ApiModelProperty(value = "Reserved:")
    public java.util.List<AddOn> getAddOns() {
        return addOns;
    }

    public void setAddOns(java.util.List<AddOn> addOns) {
        this.addOns = addOns;
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
     * Reserved for DocuSign use only.
     **/
    @ApiModelProperty(value = "Reserved for DocuSign use only.")
    public String getFreeTrialDaysOverride() {
        return freeTrialDaysOverride;
    }

    public void setFreeTrialDaysOverride(String freeTrialDaysOverride) {
        this.freeTrialDaysOverride = freeTrialDaysOverride;
    }


    /**
     * A complex type that sets the feature sets for the account.
     **/
    @ApiModelProperty(value = "A complex type that sets the feature sets for the account.")
    public java.util.List<FeatureSet> getPlanFeatureSets() {
        return planFeatureSets;
    }

    public void setPlanFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
        this.planFeatureSets = planFeatureSets;
    }


    /**
     * The DocuSign Plan ID for the account.
     **/
    @ApiModelProperty(value = "The DocuSign Plan ID for the account.")
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
    public java.util.List<RecipientDomain> getRecipientDomains() {
        return recipientDomains;
    }

    public void setRecipientDomains(java.util.List<RecipientDomain> recipientDomains) {
        this.recipientDomains = recipientDomains;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanInformation planInformation = (PlanInformation) o;
        return Objects.equals(addOns, planInformation.addOns) &&
                Objects.equals(currencyCode, planInformation.currencyCode) &&
                Objects.equals(freeTrialDaysOverride, planInformation.freeTrialDaysOverride) &&
                Objects.equals(planFeatureSets, planInformation.planFeatureSets) &&
                Objects.equals(planId, planInformation.planId) &&
                Objects.equals(recipientDomains, planInformation.recipientDomains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addOns, currencyCode, freeTrialDaysOverride, planFeatureSets, planId, recipientDomains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanInformation {\n");

        sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    freeTrialDaysOverride: ").append(toIndentedString(freeTrialDaysOverride)).append("\n");
        sb.append("    planFeatureSets: ").append(toIndentedString(planFeatureSets)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    recipientDomains: ").append(toIndentedString(recipientDomains)).append("\n");
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
