package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class CreditCardTypes implements Serializable {

    @SerializedName("cardTypes")
    private java.util.List<String> cardTypes = new java.util.ArrayList<String>();


    /**
     * An array containing supported credit card types.
     **/
    @ApiModelProperty(value = "An array containing supported credit card types.")
    public java.util.List<String> getCardTypes() {
        return cardTypes;
    }

    public void setCardTypes(java.util.List<String> cardTypes) {
        this.cardTypes = cardTypes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreditCardTypes creditCardTypes = (CreditCardTypes) o;
        return Objects.equals(cardTypes, creditCardTypes.cardTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreditCardTypes {\n");

        sb.append("    cardTypes: ").append(toIndentedString(cardTypes)).append("\n");
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
