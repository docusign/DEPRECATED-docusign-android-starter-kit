package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PaymentLineItem implements Serializable {

    @SerializedName("amountReference")
    private String amountReference = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("itemCode")
    private String itemCode = null;

    @SerializedName("name")
    private String name = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAmountReference() {
        return amountReference;
    }

    public void setAmountReference(String amountReference) {
        this.amountReference = amountReference;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentLineItem paymentLineItem = (PaymentLineItem) o;
        return Objects.equals(amountReference, paymentLineItem.amountReference) &&
                Objects.equals(description, paymentLineItem.description) &&
                Objects.equals(itemCode, paymentLineItem.itemCode) &&
                Objects.equals(name, paymentLineItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountReference, description, itemCode, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentLineItem {\n");

        sb.append("    amountReference: ").append(toIndentedString(amountReference)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
