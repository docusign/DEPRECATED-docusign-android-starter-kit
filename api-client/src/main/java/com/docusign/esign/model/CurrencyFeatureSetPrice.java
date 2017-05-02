package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class CurrencyFeatureSetPrice implements Serializable {

    @SerializedName("currencyCode")
    private String currencyCode = null;

    @SerializedName("currencySymbol")
    private String currencySymbol = null;

    @SerializedName("envelopeFee")
    private String envelopeFee = null;

    @SerializedName("fixedFee")
    private String fixedFee = null;

    @SerializedName("seatFee")
    private String seatFee = null;


    /**
     * Specifies the alternate ISO currency code for the account.
     **/
    @ApiModelProperty(value = "Specifies the alternate ISO currency code for the account. ")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Specifies the alternate currency symbol for the account.
     **/
    @ApiModelProperty(value = "Specifies the alternate currency symbol for the account.")
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }


    /**
     * An incremental envelope cost for plans with envelope overages (when `isEnabled` is set to **true**.)
     **/
    @ApiModelProperty(value = "An incremental envelope cost for plans with envelope overages (when `isEnabled` is set to **true**.)")
    public String getEnvelopeFee() {
        return envelopeFee;
    }

    public void setEnvelopeFee(String envelopeFee) {
        this.envelopeFee = envelopeFee;
    }


    /**
     * Specifies a one-time fee associated with the plan (when `isEnabled` is set to **true**.)
     **/
    @ApiModelProperty(value = "Specifies a one-time fee associated with the plan (when `isEnabled` is set to **true**.)")
    public String getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(String fixedFee) {
        this.fixedFee = fixedFee;
    }


    /**
     * Specifies an incremental seat cost for seat-based plans (when `isEnabled` is set to **true**.)
     **/
    @ApiModelProperty(value = "Specifies an incremental seat cost for seat-based plans (when `isEnabled` is set to **true**.)")
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
        CurrencyFeatureSetPrice currencyFeatureSetPrice = (CurrencyFeatureSetPrice) o;
        return Objects.equals(currencyCode, currencyFeatureSetPrice.currencyCode) &&
                Objects.equals(currencySymbol, currencyFeatureSetPrice.currencySymbol) &&
                Objects.equals(envelopeFee, currencyFeatureSetPrice.envelopeFee) &&
                Objects.equals(fixedFee, currencyFeatureSetPrice.fixedFee) &&
                Objects.equals(seatFee, currencyFeatureSetPrice.seatFee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, currencySymbol, envelopeFee, fixedFee, seatFee);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrencyFeatureSetPrice {\n");

        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
        sb.append("    envelopeFee: ").append(toIndentedString(envelopeFee)).append("\n");
        sb.append("    fixedFee: ").append(toIndentedString(fixedFee)).append("\n");
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
