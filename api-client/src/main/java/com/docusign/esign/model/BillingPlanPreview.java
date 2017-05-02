package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information about a preview billing plan.
 **/
@ApiModel(description = "Contains information about a preview billing plan.")
public class BillingPlanPreview implements Serializable {

    @SerializedName("currencyCode")
    private String currencyCode = null;

    @SerializedName("invoice")
    private BillingInvoice invoice = null;

    @SerializedName("isProrated")
    private String isProrated = null;

    @SerializedName("subtotalAmount")
    private String subtotalAmount = null;

    @SerializedName("taxAmount")
    private String taxAmount = null;

    @SerializedName("totalAmount")
    private String totalAmount = null;


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
     **/
    @ApiModelProperty(value = "")
    public BillingInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(BillingInvoice invoice) {
        this.invoice = invoice;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsProrated() {
        return isProrated;
    }

    public void setIsProrated(String isProrated) {
        this.isProrated = isProrated;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    public void setSubtotalAmount(String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingPlanPreview billingPlanPreview = (BillingPlanPreview) o;
        return Objects.equals(currencyCode, billingPlanPreview.currencyCode) &&
                Objects.equals(invoice, billingPlanPreview.invoice) &&
                Objects.equals(isProrated, billingPlanPreview.isProrated) &&
                Objects.equals(subtotalAmount, billingPlanPreview.subtotalAmount) &&
                Objects.equals(taxAmount, billingPlanPreview.taxAmount) &&
                Objects.equals(totalAmount, billingPlanPreview.totalAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, invoice, isProrated, subtotalAmount, taxAmount, totalAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPlanPreview {\n");

        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
        sb.append("    isProrated: ").append(toIndentedString(isProrated)).append("\n");
        sb.append("    subtotalAmount: ").append(toIndentedString(subtotalAmount)).append("\n");
        sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
        sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
