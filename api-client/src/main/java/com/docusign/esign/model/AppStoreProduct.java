package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information about an APP store product.
 **/
@ApiModel(description = "Contains information about an APP store product.")
public class AppStoreProduct implements Serializable {

    @SerializedName("marketPlace")
    private String marketPlace = null;

    @SerializedName("productId")
    private String productId = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getMarketPlace() {
        return marketPlace;
    }

    public void setMarketPlace(String marketPlace) {
        this.marketPlace = marketPlace;
    }


    /**
     * The Product ID from the AppStore.
     **/
    @ApiModelProperty(value = "The Product ID from the AppStore.")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppStoreProduct appStoreProduct = (AppStoreProduct) o;
        return Objects.equals(marketPlace, appStoreProduct.marketPlace) &&
                Objects.equals(productId, appStoreProduct.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketPlace, productId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppStoreProduct {\n");

        sb.append("    marketPlace: ").append(toIndentedString(marketPlace)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
