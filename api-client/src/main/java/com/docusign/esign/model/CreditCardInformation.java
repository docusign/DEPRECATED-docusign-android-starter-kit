package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class CreditCardInformation implements Serializable {

    @SerializedName("address")
    private AddressInformation address = null;

    @SerializedName("cardNumber")
    private String cardNumber = null;

    @SerializedName("cardType")
    private String cardType = null;

    @SerializedName("expirationMonth")
    private String expirationMonth = null;

    @SerializedName("expirationYear")
    private String expirationYear = null;

    @SerializedName("nameOnCard")
    private String nameOnCard = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public AddressInformation getAddress() {
        return address;
    }

    public void setAddress(AddressInformation address) {
        this.address = address;
    }


    /**
     * The number on the credit card.
     **/
    @ApiModelProperty(value = "The number on the credit card.")
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * The credit card type. Valid values are: visa, mastercard, or amex.
     **/
    @ApiModelProperty(value = "The credit card type. Valid values are: visa, mastercard, or amex.")
    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }


    /**
     * The month that the credit card expires (1-12).
     **/
    @ApiModelProperty(value = "The month that the credit card expires (1-12).")
    public String getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }


    /**
     * The year 4 digit year in which the credit card expires.
     **/
    @ApiModelProperty(value = "The year 4 digit year in which the credit card expires.")
    public String getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }


    /**
     * The exact name printed on the credit card.
     **/
    @ApiModelProperty(value = "The exact name printed on the credit card.")
    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreditCardInformation creditCardInformation = (CreditCardInformation) o;
        return Objects.equals(address, creditCardInformation.address) &&
                Objects.equals(cardNumber, creditCardInformation.cardNumber) &&
                Objects.equals(cardType, creditCardInformation.cardType) &&
                Objects.equals(expirationMonth, creditCardInformation.expirationMonth) &&
                Objects.equals(expirationYear, creditCardInformation.expirationYear) &&
                Objects.equals(nameOnCard, creditCardInformation.nameOnCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, cardNumber, cardType, expirationMonth, expirationYear, nameOnCard);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreditCardInformation {\n");

        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
        sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
        sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
        sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
        sb.append("    nameOnCard: ").append(toIndentedString(nameOnCard)).append("\n");
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
