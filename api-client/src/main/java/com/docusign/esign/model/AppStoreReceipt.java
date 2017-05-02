package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information about an APP store receipt.
 **/
@ApiModel(description = "Contains information about an APP store receipt.")
public class AppStoreReceipt implements Serializable {

    @SerializedName("productId")
    private String productId = null;

    @SerializedName("receiptData")
    private String receiptData = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getReceiptData() {
        return receiptData;
    }

    public void setReceiptData(String receiptData) {
        this.receiptData = receiptData;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppStoreReceipt appStoreReceipt = (AppStoreReceipt) o;
        return Objects.equals(productId, appStoreReceipt.productId) &&
                Objects.equals(receiptData, appStoreReceipt.receiptData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, receiptData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppStoreReceipt {\n");

        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    receiptData: ").append(toIndentedString(receiptData)).append("\n");
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
