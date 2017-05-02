package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information about a billing charge.
 **/
@ApiModel(description = "Contains information about a billing charge.")
public class BillingCharge implements Serializable {

    @SerializedName("allowedQuantity")
    private String allowedQuantity = null;

    @SerializedName("blocked")
    private String blocked = null;

    @SerializedName("chargeName")
    private String chargeName = null;

    @SerializedName("chargeType")
    private String chargeType = null;

    @SerializedName("chargeUnitOfMeasure")
    private String chargeUnitOfMeasure = null;

    @SerializedName("discounts")
    private java.util.List<BillingDiscount> discounts = new java.util.ArrayList<BillingDiscount>();

    @SerializedName("firstEffectiveDate")
    private String firstEffectiveDate = null;

    @SerializedName("includedQuantity")
    private String includedQuantity = null;

    @SerializedName("incrementalQuantity")
    private String incrementalQuantity = null;

    @SerializedName("lastEffectiveDate")
    private String lastEffectiveDate = null;

    @SerializedName("prices")
    private java.util.List<BillingPrice> prices = new java.util.ArrayList<BillingPrice>();

    @SerializedName("unitPrice")
    private String unitPrice = null;

    @SerializedName("usedQuantity")
    private String usedQuantity = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getAllowedQuantity() {
        return allowedQuantity;
    }

    public void setAllowedQuantity(String allowedQuantity) {
        this.allowedQuantity = allowedQuantity;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }


    /**
     * Provides information on what services the charge item is for.\n\nThe following table provides a description of the different chargeName values available at this time.\n\n| chargeName | Description |\n| --- | --- |\n| id_check | ID\u00A0Check Charge |\n| in_person_signing | In Person Signing charge |\n| envelopes Included | Sent Envelopes for the account |\n| age_verify | Age verification check |\n| ofac | OFAC Check |\n| id_confirm | ID confirmation check |\n| student_authentication | STAN PIN authentication check |\n| wet_sign_fax | Pages for returning signed documents by fax |\n| attachment_fax | Pages for returning attachments by fax |\n| phone_authentication | Phone authentication charge |\n| powerforms | PowerForm envelopes sent |\n| signer_payments | Payment processing charge |\n| outbound_fax | Send by fax charge |\n| bulk_recipient_envelopes | Bulk Recipient Envelopes sent |\n| sms_authentications | SMS authentication charge |\n| saml_authentications | SAML authentication charge |\n| express_signer_certificate | DocuSign Express Certificate charge |\n| personal_signer_certificate | Personal Signer Certificate charge |\n| safe_certificate | SAFE BioPharma Signer Certificate charge |\n| seats | Included active seats charge |\n| open_trust_certificate | OpenTrust Signer Certificate charge |
     **/
    @ApiModelProperty(value = "Provides information on what services the charge item is for.\n\nThe following table provides a description of the different chargeName values available at this time.\n\n| chargeName | Description |\n| --- | --- |\n| id_check | ID\u00A0Check Charge |\n| in_person_signing | In Person Signing charge |\n| envelopes Included | Sent Envelopes for the account |\n| age_verify | Age verification check |\n| ofac | OFAC Check |\n| id_confirm | ID confirmation check |\n| student_authentication | STAN PIN authentication check |\n| wet_sign_fax | Pages for returning signed documents by fax |\n| attachment_fax | Pages for returning attachments by fax |\n| phone_authentication | Phone authentication charge |\n| powerforms | PowerForm envelopes sent |\n| signer_payments | Payment processing charge |\n| outbound_fax | Send by fax charge |\n| bulk_recipient_envelopes | Bulk Recipient Envelopes sent |\n| sms_authentications | SMS authentication charge |\n| saml_authentications | SAML authentication charge |\n| express_signer_certificate | DocuSign Express Certificate charge |\n| personal_signer_certificate | Personal Signer Certificate charge |\n| safe_certificate | SAFE BioPharma Signer Certificate charge |\n| seats | Included active seats charge |\n| open_trust_certificate | OpenTrust Signer Certificate charge |")
    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getChargeUnitOfMeasure() {
        return chargeUnitOfMeasure;
    }

    public void setChargeUnitOfMeasure(String chargeUnitOfMeasure) {
        this.chargeUnitOfMeasure = chargeUnitOfMeasure;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<BillingDiscount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(java.util.List<BillingDiscount> discounts) {
        this.discounts = discounts;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getFirstEffectiveDate() {
        return firstEffectiveDate;
    }

    public void setFirstEffectiveDate(String firstEffectiveDate) {
        this.firstEffectiveDate = firstEffectiveDate;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIncludedQuantity() {
        return includedQuantity;
    }

    public void setIncludedQuantity(String includedQuantity) {
        this.includedQuantity = includedQuantity;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getIncrementalQuantity() {
        return incrementalQuantity;
    }

    public void setIncrementalQuantity(String incrementalQuantity) {
        this.incrementalQuantity = incrementalQuantity;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getLastEffectiveDate() {
        return lastEffectiveDate;
    }

    public void setLastEffectiveDate(String lastEffectiveDate) {
        this.lastEffectiveDate = lastEffectiveDate;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<BillingPrice> getPrices() {
        return prices;
    }

    public void setPrices(java.util.List<BillingPrice> prices) {
        this.prices = prices;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUsedQuantity() {
        return usedQuantity;
    }

    public void setUsedQuantity(String usedQuantity) {
        this.usedQuantity = usedQuantity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingCharge billingCharge = (BillingCharge) o;
        return Objects.equals(allowedQuantity, billingCharge.allowedQuantity) &&
                Objects.equals(blocked, billingCharge.blocked) &&
                Objects.equals(chargeName, billingCharge.chargeName) &&
                Objects.equals(chargeType, billingCharge.chargeType) &&
                Objects.equals(chargeUnitOfMeasure, billingCharge.chargeUnitOfMeasure) &&
                Objects.equals(discounts, billingCharge.discounts) &&
                Objects.equals(firstEffectiveDate, billingCharge.firstEffectiveDate) &&
                Objects.equals(includedQuantity, billingCharge.includedQuantity) &&
                Objects.equals(incrementalQuantity, billingCharge.incrementalQuantity) &&
                Objects.equals(lastEffectiveDate, billingCharge.lastEffectiveDate) &&
                Objects.equals(prices, billingCharge.prices) &&
                Objects.equals(unitPrice, billingCharge.unitPrice) &&
                Objects.equals(usedQuantity, billingCharge.usedQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedQuantity, blocked, chargeName, chargeType, chargeUnitOfMeasure, discounts, firstEffectiveDate, includedQuantity, incrementalQuantity, lastEffectiveDate, prices, unitPrice, usedQuantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingCharge {\n");

        sb.append("    allowedQuantity: ").append(toIndentedString(allowedQuantity)).append("\n");
        sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
        sb.append("    chargeName: ").append(toIndentedString(chargeName)).append("\n");
        sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
        sb.append("    chargeUnitOfMeasure: ").append(toIndentedString(chargeUnitOfMeasure)).append("\n");
        sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
        sb.append("    firstEffectiveDate: ").append(toIndentedString(firstEffectiveDate)).append("\n");
        sb.append("    includedQuantity: ").append(toIndentedString(includedQuantity)).append("\n");
        sb.append("    incrementalQuantity: ").append(toIndentedString(incrementalQuantity)).append("\n");
        sb.append("    lastEffectiveDate: ").append(toIndentedString(lastEffectiveDate)).append("\n");
        sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
        sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
        sb.append("    usedQuantity: ").append(toIndentedString(usedQuantity)).append("\n");
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
