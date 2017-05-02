package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BrandsResponse implements Serializable {

    @SerializedName("brands")
    private java.util.List<Brand> brands = new java.util.ArrayList<Brand>();

    @SerializedName("recipientBrandIdDefault")
    private String recipientBrandIdDefault = null;

    @SerializedName("senderBrandIdDefault")
    private String senderBrandIdDefault = null;


    /**
     * The list of brands.
     **/
    @ApiModelProperty(value = "The list of brands.")
    public java.util.List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(java.util.List<Brand> brands) {
        this.brands = brands;
    }


    /**
     * The brand seen by envelope recipients when a brand is not explicitly set.
     **/
    @ApiModelProperty(value = "The brand seen by envelope recipients when a brand is not explicitly set.")
    public String getRecipientBrandIdDefault() {
        return recipientBrandIdDefault;
    }

    public void setRecipientBrandIdDefault(String recipientBrandIdDefault) {
        this.recipientBrandIdDefault = recipientBrandIdDefault;
    }


    /**
     * The brand seen by envelope senders when a brand is not explicitly set.
     **/
    @ApiModelProperty(value = "The brand seen by envelope senders when a brand is not explicitly set.")
    public String getSenderBrandIdDefault() {
        return senderBrandIdDefault;
    }

    public void setSenderBrandIdDefault(String senderBrandIdDefault) {
        this.senderBrandIdDefault = senderBrandIdDefault;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandsResponse brandsResponse = (BrandsResponse) o;
        return Objects.equals(brands, brandsResponse.brands) &&
                Objects.equals(recipientBrandIdDefault, brandsResponse.recipientBrandIdDefault) &&
                Objects.equals(senderBrandIdDefault, brandsResponse.senderBrandIdDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brands, recipientBrandIdDefault, senderBrandIdDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandsResponse {\n");

        sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
        sb.append("    recipientBrandIdDefault: ").append(toIndentedString(recipientBrandIdDefault)).append("\n");
        sb.append("    senderBrandIdDefault: ").append(toIndentedString(senderBrandIdDefault)).append("\n");
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
