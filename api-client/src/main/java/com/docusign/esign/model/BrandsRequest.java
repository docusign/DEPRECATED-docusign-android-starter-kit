package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BrandsRequest implements Serializable {

    @SerializedName("brands")
    private java.util.List<BrandRequest> brands = new java.util.ArrayList<BrandRequest>();


    /**
     * The list of brands.
     **/
    @ApiModelProperty(value = "The list of brands.")
    public java.util.List<BrandRequest> getBrands() {
        return brands;
    }

    public void setBrands(java.util.List<BrandRequest> brands) {
        this.brands = brands;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandsRequest brandsRequest = (BrandsRequest) o;
        return Objects.equals(brands, brandsRequest.brands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brands);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandsRequest {\n");

        sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
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
