package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * A complex type that contains the following information for entering referral and discount information. The following items are included in the referral information (all string content): enableSupport, includedSeats, saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, saleDiscountSeatPriceOverride, planStartMonth, referralCode, referrerName, advertisementId, publisherId, shopperId, promoCode, groupMemberId, idType, and industry \n\n###### Note: saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, and saleDiscountSeatPriceOverride are reserved for DoucSign use only.
 **/
@ApiModel(description = "A complex type that contains the following information for entering referral and discount information. The following items are included in the referral information (all string content): enableSupport, includedSeats, saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, saleDiscountSeatPriceOverride, planStartMonth, referralCode, referrerName, advertisementId, publisherId, shopperId, promoCode, groupMemberId, idType, and industry \n\n###### Note: saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, and saleDiscountSeatPriceOverride are reserved for DoucSign use only.")
public class ReferralInformation implements Serializable {

    @SerializedName("advertisementId")
    private String advertisementId = null;

    @SerializedName("enableSupport")
    private String enableSupport = null;

    @SerializedName("externalOrgId")
    private String externalOrgId = null;

    @SerializedName("groupMemberId")
    private String groupMemberId = null;

    @SerializedName("idType")
    private String idType = null;

    @SerializedName("includedSeats")
    private String includedSeats = null;

    @SerializedName("industry")
    private String industry = null;

    @SerializedName("planStartMonth")
    private String planStartMonth = null;

    @SerializedName("promoCode")
    private String promoCode = null;

    @SerializedName("publisherId")
    private String publisherId = null;

    @SerializedName("referralCode")
    private String referralCode = null;

    @SerializedName("referrerName")
    private String referrerName = null;

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

    @SerializedName("shopperId")
    private String shopperId = null;


    /**
     * A complex type that contains the following information for entering referral and discount information. The following items are included in the referral information (all string content): enableSupport, includedSeats, saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, saleDiscountSeatPriceOverride, planStartMonth, referralCode, referrerName, advertisementId, publisherId, shopperId, promoCode, groupMemberId, idType, and industry.\n\n###### Note: saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, and saleDiscountSeatPriceOverride are reserved for DoucSign use only. \n
     **/
    @ApiModelProperty(value = "A complex type that contains the following information for entering referral and discount information. The following items are included in the referral information (all string content): enableSupport, includedSeats, saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, saleDiscountSeatPriceOverride, planStartMonth, referralCode, referrerName, advertisementId, publisherId, shopperId, promoCode, groupMemberId, idType, and industry.\n\n###### Note: saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, and saleDiscountSeatPriceOverride are reserved for DoucSign use only. \n")
    public String getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(String advertisementId) {
        this.advertisementId = advertisementId;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getExternalOrgId() {
        return externalOrgId;
    }

    public void setExternalOrgId(String externalOrgId) {
        this.externalOrgId = externalOrgId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getGroupMemberId() {
        return groupMemberId;
    }

    public void setGroupMemberId(String groupMemberId) {
        this.groupMemberId = groupMemberId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
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
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPlanStartMonth() {
        return planStartMonth;
    }

    public void setPlanStartMonth(String planStartMonth) {
        this.planStartMonth = planStartMonth;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getReferrerName() {
        return referrerName;
    }

    public void setReferrerName(String referrerName) {
        this.referrerName = referrerName;
    }


    /**
     * Reserved for DocuSign use only.
     **/
    @ApiModelProperty(value = "Reserved for DocuSign use only.")
    public String getSaleDiscountAmount() {
        return saleDiscountAmount;
    }

    public void setSaleDiscountAmount(String saleDiscountAmount) {
        this.saleDiscountAmount = saleDiscountAmount;
    }


    /**
     * Reserved for DocuSign use only.
     **/
    @ApiModelProperty(value = "Reserved for DocuSign use only.")
    public String getSaleDiscountFixedAmount() {
        return saleDiscountFixedAmount;
    }

    public void setSaleDiscountFixedAmount(String saleDiscountFixedAmount) {
        this.saleDiscountFixedAmount = saleDiscountFixedAmount;
    }


    /**
     * Reserved for DocuSign use only.
     **/
    @ApiModelProperty(value = "Reserved for DocuSign use only.")
    public String getSaleDiscountPercent() {
        return saleDiscountPercent;
    }

    public void setSaleDiscountPercent(String saleDiscountPercent) {
        this.saleDiscountPercent = saleDiscountPercent;
    }


    /**
     * Reserved for DocuSign use only.
     **/
    @ApiModelProperty(value = "Reserved for DocuSign use only.")
    public String getSaleDiscountPeriods() {
        return saleDiscountPeriods;
    }

    public void setSaleDiscountPeriods(String saleDiscountPeriods) {
        this.saleDiscountPeriods = saleDiscountPeriods;
    }


    /**
     * Reserved for DocuSign use only.
     **/
    @ApiModelProperty(value = "Reserved for DocuSign use only.")
    public String getSaleDiscountSeatPriceOverride() {
        return saleDiscountSeatPriceOverride;
    }

    public void setSaleDiscountSeatPriceOverride(String saleDiscountSeatPriceOverride) {
        this.saleDiscountSeatPriceOverride = saleDiscountSeatPriceOverride;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReferralInformation referralInformation = (ReferralInformation) o;
        return Objects.equals(advertisementId, referralInformation.advertisementId) &&
                Objects.equals(enableSupport, referralInformation.enableSupport) &&
                Objects.equals(externalOrgId, referralInformation.externalOrgId) &&
                Objects.equals(groupMemberId, referralInformation.groupMemberId) &&
                Objects.equals(idType, referralInformation.idType) &&
                Objects.equals(includedSeats, referralInformation.includedSeats) &&
                Objects.equals(industry, referralInformation.industry) &&
                Objects.equals(planStartMonth, referralInformation.planStartMonth) &&
                Objects.equals(promoCode, referralInformation.promoCode) &&
                Objects.equals(publisherId, referralInformation.publisherId) &&
                Objects.equals(referralCode, referralInformation.referralCode) &&
                Objects.equals(referrerName, referralInformation.referrerName) &&
                Objects.equals(saleDiscountAmount, referralInformation.saleDiscountAmount) &&
                Objects.equals(saleDiscountFixedAmount, referralInformation.saleDiscountFixedAmount) &&
                Objects.equals(saleDiscountPercent, referralInformation.saleDiscountPercent) &&
                Objects.equals(saleDiscountPeriods, referralInformation.saleDiscountPeriods) &&
                Objects.equals(saleDiscountSeatPriceOverride, referralInformation.saleDiscountSeatPriceOverride) &&
                Objects.equals(shopperId, referralInformation.shopperId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(advertisementId, enableSupport, externalOrgId, groupMemberId, idType, includedSeats, industry, planStartMonth, promoCode, publisherId, referralCode, referrerName, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPercent, saleDiscountPeriods, saleDiscountSeatPriceOverride, shopperId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReferralInformation {\n");

        sb.append("    advertisementId: ").append(toIndentedString(advertisementId)).append("\n");
        sb.append("    enableSupport: ").append(toIndentedString(enableSupport)).append("\n");
        sb.append("    externalOrgId: ").append(toIndentedString(externalOrgId)).append("\n");
        sb.append("    groupMemberId: ").append(toIndentedString(groupMemberId)).append("\n");
        sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
        sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
        sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
        sb.append("    planStartMonth: ").append(toIndentedString(planStartMonth)).append("\n");
        sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
        sb.append("    publisherId: ").append(toIndentedString(publisherId)).append("\n");
        sb.append("    referralCode: ").append(toIndentedString(referralCode)).append("\n");
        sb.append("    referrerName: ").append(toIndentedString(referrerName)).append("\n");
        sb.append("    saleDiscountAmount: ").append(toIndentedString(saleDiscountAmount)).append("\n");
        sb.append("    saleDiscountFixedAmount: ").append(toIndentedString(saleDiscountFixedAmount)).append("\n");
        sb.append("    saleDiscountPercent: ").append(toIndentedString(saleDiscountPercent)).append("\n");
        sb.append("    saleDiscountPeriods: ").append(toIndentedString(saleDiscountPeriods)).append("\n");
        sb.append("    saleDiscountSeatPriceOverride: ").append(toIndentedString(saleDiscountSeatPriceOverride)).append("\n");
        sb.append("    shopperId: ").append(toIndentedString(shopperId)).append("\n");
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
