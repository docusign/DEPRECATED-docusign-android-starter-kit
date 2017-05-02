package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PurchasedEnvelopesInformation implements Serializable {

    @SerializedName("amount")
    private String amount = null;

    @SerializedName("appName")
    private String appName = null;

    @SerializedName("currencyCode")
    private String currencyCode = null;

    @SerializedName("platform")
    private String platform = null;

    @SerializedName("productId")
    private String productId = null;

    @SerializedName("quantity")
    private String quantity = null;

    @SerializedName("receiptData")
    private String receiptData = null;

    @SerializedName("storeName")
    private String storeName = null;

    @SerializedName("transactionId")
    private String transactionId = null;


    /**
     * The total amount of the purchase.
     **/
    @ApiModelProperty(value = "The total amount of the purchase.")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    /**
     * The AppName of the client application.
     **/
    @ApiModelProperty(value = "The AppName of the client application.")
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }


    /**
     * Specifies the ISO currency code of the purchase. This is based on the ISO 4217 currency code information.
     **/
    @ApiModelProperty(value = "Specifies the ISO currency code of the purchase. This is based on the ISO 4217 currency code information.")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * The Platform of the client application
     **/
    @ApiModelProperty(value = "The Platform of the client application")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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


    /**
     * The quantity of envelopes to add to the account.
     **/
    @ApiModelProperty(value = "The quantity of envelopes to add to the account.")
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }


    /**
     * The encrypted Base64 encoded receipt data.
     **/
    @ApiModelProperty(value = "The encrypted Base64 encoded receipt data.")
    public String getReceiptData() {
        return receiptData;
    }

    public void setReceiptData(String receiptData) {
        this.receiptData = receiptData;
    }


    /**
     * The name of the AppStore.
     **/
    @ApiModelProperty(value = "The name of the AppStore.")
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }


    /**
     * Specifies the Transaction ID from the AppStore.
     **/
    @ApiModelProperty(value = "Specifies the Transaction ID from the AppStore.")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PurchasedEnvelopesInformation purchasedEnvelopesInformation = (PurchasedEnvelopesInformation) o;
        return Objects.equals(amount, purchasedEnvelopesInformation.amount) &&
                Objects.equals(appName, purchasedEnvelopesInformation.appName) &&
                Objects.equals(currencyCode, purchasedEnvelopesInformation.currencyCode) &&
                Objects.equals(platform, purchasedEnvelopesInformation.platform) &&
                Objects.equals(productId, purchasedEnvelopesInformation.productId) &&
                Objects.equals(quantity, purchasedEnvelopesInformation.quantity) &&
                Objects.equals(receiptData, purchasedEnvelopesInformation.receiptData) &&
                Objects.equals(storeName, purchasedEnvelopesInformation.storeName) &&
                Objects.equals(transactionId, purchasedEnvelopesInformation.transactionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, appName, currencyCode, platform, productId, quantity, receiptData, storeName, transactionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PurchasedEnvelopesInformation {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    receiptData: ").append(toIndentedString(receiptData)).append("\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
