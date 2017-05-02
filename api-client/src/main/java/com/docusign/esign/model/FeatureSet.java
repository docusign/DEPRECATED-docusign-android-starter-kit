package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class FeatureSet implements Serializable {

    @SerializedName("currencyFeatureSetPrices")
    private java.util.List<CurrencyFeatureSetPrice> currencyFeatureSetPrices = new java.util.ArrayList<CurrencyFeatureSetPrice>();

    @SerializedName("envelopeFee")
    private String envelopeFee = null;

    @SerializedName("featureSetId")
    private String featureSetId = null;

    @SerializedName("fixedFee")
    private String fixedFee = null;

    @SerializedName("is21CFRPart11")
    private String is21CFRPart11 = null;

    @SerializedName("isActive")
    private String isActive = null;

    @SerializedName("isEnabled")
    private String isEnabled = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("seatFee")
    private String seatFee = null;


    /**
     * A complex type that contains alternate currency values that are configured for this plan feature set.
     **/
    @ApiModelProperty(value = "A complex type that contains alternate currency values that are configured for this plan feature set.")
    public java.util.List<CurrencyFeatureSetPrice> getCurrencyFeatureSetPrices() {
        return currencyFeatureSetPrices;
    }

    public void setCurrencyFeatureSetPrices(java.util.List<CurrencyFeatureSetPrice> currencyFeatureSetPrices) {
        this.currencyFeatureSetPrices = currencyFeatureSetPrices;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEnvelopeFee() {
        return envelopeFee;
    }

    public void setEnvelopeFee(String envelopeFee) {
        this.envelopeFee = envelopeFee;
    }


    /**
     * A unique ID for the feature set.
     **/
    @ApiModelProperty(value = "A unique ID for the feature set.")
    public String getFeatureSetId() {
        return featureSetId;
    }

    public void setFeatureSetId(String featureSetId) {
        this.featureSetId = featureSetId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(String fixedFee) {
        this.fixedFee = fixedFee;
    }


    /**
     * When set to **true**, indicates that this module is enabled on the account.
     **/
    @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
    public String getIs21CFRPart11() {
        return is21CFRPart11;
    }

    public void setIs21CFRPart11(String is21CFRPart11) {
        this.is21CFRPart11 = is21CFRPart11;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }


    /**
     * Specifies whether the feature set is actively enabled as part of the plan.
     **/
    @ApiModelProperty(value = "Specifies whether the feature set is actively enabled as part of the plan.")
    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * An incremental seat cost for seat-based plans. Only valid when isEnabled for the feature set is set to true.
     **/
    @ApiModelProperty(value = "An incremental seat cost for seat-based plans. Only valid when isEnabled for the feature set is set to true.")
    public String getSeatFee() {
        return seatFee;
    }

    public void setSeatFee(String seatFee) {
        this.seatFee = seatFee;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeatureSet featureSet = (FeatureSet) o;
        return Objects.equals(currencyFeatureSetPrices, featureSet.currencyFeatureSetPrices) &&
                Objects.equals(envelopeFee, featureSet.envelopeFee) &&
                Objects.equals(featureSetId, featureSet.featureSetId) &&
                Objects.equals(fixedFee, featureSet.fixedFee) &&
                Objects.equals(is21CFRPart11, featureSet.is21CFRPart11) &&
                Objects.equals(isActive, featureSet.isActive) &&
                Objects.equals(isEnabled, featureSet.isEnabled) &&
                Objects.equals(name, featureSet.name) &&
                Objects.equals(seatFee, featureSet.seatFee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyFeatureSetPrices, envelopeFee, featureSetId, fixedFee, is21CFRPart11, isActive, isEnabled, name, seatFee);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeatureSet {\n");

        sb.append("    currencyFeatureSetPrices: ").append(toIndentedString(currencyFeatureSetPrices)).append("\n");
        sb.append("    envelopeFee: ").append(toIndentedString(envelopeFee)).append("\n");
        sb.append("    featureSetId: ").append(toIndentedString(featureSetId)).append("\n");
        sb.append("    fixedFee: ").append(toIndentedString(fixedFee)).append("\n");
        sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
        sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
        sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    seatFee: ").append(toIndentedString(seatFee)).append("\n");
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
