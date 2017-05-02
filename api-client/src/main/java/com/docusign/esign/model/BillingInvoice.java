package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information about a billing invoice.
 **/
@ApiModel(description = "Contains information about a billing invoice.")
public class BillingInvoice implements Serializable {

    @SerializedName("amount")
    private String amount = null;

    @SerializedName("balance")
    private String balance = null;

    @SerializedName("dueDate")
    private String dueDate = null;

    @SerializedName("invoiceId")
    private String invoiceId = null;

    @SerializedName("invoiceItems")
    private java.util.List<BillingInvoiceItem> invoiceItems = new java.util.ArrayList<BillingInvoiceItem>();

    @SerializedName("invoiceNumber")
    private String invoiceNumber = null;

    @SerializedName("invoiceUri")
    private String invoiceUri = null;

    @SerializedName("nonTaxableAmount")
    private String nonTaxableAmount = null;

    @SerializedName("pdfAvailable")
    private String pdfAvailable = null;

    @SerializedName("taxableAmount")
    private String taxableAmount = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public java.util.List<BillingInvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(java.util.List<BillingInvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Contains a URI for an endpoint that you can use to retrieve invoice information.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve invoice information.")
    public String getInvoiceUri() {
        return invoiceUri;
    }

    public void setInvoiceUri(String invoiceUri) {
        this.invoiceUri = invoiceUri;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getNonTaxableAmount() {
        return nonTaxableAmount;
    }

    public void setNonTaxableAmount(String nonTaxableAmount) {
        this.nonTaxableAmount = nonTaxableAmount;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPdfAvailable() {
        return pdfAvailable;
    }

    public void setPdfAvailable(String pdfAvailable) {
        this.pdfAvailable = pdfAvailable;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTaxableAmount() {
        return taxableAmount;
    }

    public void setTaxableAmount(String taxableAmount) {
        this.taxableAmount = taxableAmount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingInvoice billingInvoice = (BillingInvoice) o;
        return Objects.equals(amount, billingInvoice.amount) &&
                Objects.equals(balance, billingInvoice.balance) &&
                Objects.equals(dueDate, billingInvoice.dueDate) &&
                Objects.equals(invoiceId, billingInvoice.invoiceId) &&
                Objects.equals(invoiceItems, billingInvoice.invoiceItems) &&
                Objects.equals(invoiceNumber, billingInvoice.invoiceNumber) &&
                Objects.equals(invoiceUri, billingInvoice.invoiceUri) &&
                Objects.equals(nonTaxableAmount, billingInvoice.nonTaxableAmount) &&
                Objects.equals(pdfAvailable, billingInvoice.pdfAvailable) &&
                Objects.equals(taxableAmount, billingInvoice.taxableAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, balance, dueDate, invoiceId, invoiceItems, invoiceNumber, invoiceUri, nonTaxableAmount, pdfAvailable, taxableAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingInvoice {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
        sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
        sb.append("    invoiceItems: ").append(toIndentedString(invoiceItems)).append("\n");
        sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
        sb.append("    invoiceUri: ").append(toIndentedString(invoiceUri)).append("\n");
        sb.append("    nonTaxableAmount: ").append(toIndentedString(nonTaxableAmount)).append("\n");
        sb.append("    pdfAvailable: ").append(toIndentedString(pdfAvailable)).append("\n");
        sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
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
