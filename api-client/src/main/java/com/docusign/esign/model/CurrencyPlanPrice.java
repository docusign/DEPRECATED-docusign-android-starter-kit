package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class CurrencyPlanPrice implements Serializable {

    @SerializedName("currencyCode")
    private String currencyCode = null;

    @SerializedName("currencySymbol")
    private String currencySymbol = null;

    @SerializedName("perSeatPrice")
    private String perSeatPrice = null;

    @SerializedName("supportedCardTypes")
    private CreditCardTypes supportedCardTypes = null;

    @SerializedName("supportIncidentFee")
    private String supportIncidentFee = null;

    @SerializedName("supportPlanFee")
    private String supportPlanFee = null;


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
     * Specifies the currency symbol for the account.
     **/
    @ApiModelProperty(value = "Specifies the currency symbol for the account.")
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPerSeatPrice() {
        return perSeatPrice;
    }

    public void setPerSeatPrice(String perSeatPrice) {
        this.perSeatPrice = perSeatPrice;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public CreditCardTypes getSupportedCardTypes() {
        return supportedCardTypes;
    }

    public void setSupportedCardTypes(CreditCardTypes supportedCardTypes) {
        this.supportedCardTypes = supportedCardTypes;
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
        CurrencyPlanPrice currencyPlanPrice = (CurrencyPlanPrice) o;
        return Objects.equals(currencyCode, currencyPlanPrice.currencyCode) &&
                Objects.equals(currencySymbol, currencyPlanPrice.currencySymbol) &&
                Objects.equals(perSeatPrice, currencyPlanPrice.perSeatPrice) &&
                Objects.equals(supportedCardTypes, currencyPlanPrice.supportedCardTypes) &&
                Objects.equals(supportIncidentFee, currencyPlanPrice.supportIncidentFee) &&
                Objects.equals(supportPlanFee, currencyPlanPrice.supportPlanFee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, currencySymbol, perSeatPrice, supportedCardTypes, supportIncidentFee, supportPlanFee);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrencyPlanPrice {\n");

        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
        sb.append("    perSeatPrice: ").append(toIndentedString(perSeatPrice)).append("\n");
        sb.append("    supportedCardTypes: ").append(toIndentedString(supportedCardTypes)).append("\n");
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
