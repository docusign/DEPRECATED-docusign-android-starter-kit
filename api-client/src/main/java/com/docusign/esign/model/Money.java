package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class Money implements Serializable {

    @SerializedName("amountInBaseUnit")
    private String amountInBaseUnit = null;

    @SerializedName("currency")
    private String currency = null;

    @SerializedName("displayAmount")
    private String displayAmount = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAmountInBaseUnit() {
        return amountInBaseUnit;
    }

    public void setAmountInBaseUnit(String amountInBaseUnit) {
        this.amountInBaseUnit = amountInBaseUnit;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDisplayAmount() {
        return displayAmount;
    }

    public void setDisplayAmount(String displayAmount) {
        this.displayAmount = displayAmount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Money money = (Money) o;
        return Objects.equals(amountInBaseUnit, money.amountInBaseUnit) &&
                Objects.equals(currency, money.currency) &&
                Objects.equals(displayAmount, money.displayAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountInBaseUnit, currency, displayAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Money {\n");

        sb.append("    amountInBaseUnit: ").append(toIndentedString(amountInBaseUnit)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    displayAmount: ").append(toIndentedString(displayAmount)).append("\n");
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
