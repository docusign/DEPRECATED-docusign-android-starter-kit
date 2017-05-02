package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains account Information.
 **/
@ApiModel(description = "Contains account Information.")
public class AccountInformation implements Serializable {

    @SerializedName("accountIdGuid")
    private String accountIdGuid = null;

    @SerializedName("accountName")
    private String accountName = null;

    @SerializedName("allowTransactionRooms")
    private String allowTransactionRooms = null;

    @SerializedName("billingPeriodDaysRemaining")
    private String billingPeriodDaysRemaining = null;

    @SerializedName("billingPeriodEndDate")
    private String billingPeriodEndDate = null;

    @SerializedName("billingPeriodEnvelopesAllowed")
    private String billingPeriodEnvelopesAllowed = null;

    @SerializedName("billingPeriodEnvelopesSent")
    private String billingPeriodEnvelopesSent = null;

    @SerializedName("billingPeriodStartDate")
    private String billingPeriodStartDate = null;

    @SerializedName("billingProfile")
    private String billingProfile = null;

    @SerializedName("canCancelRenewal")
    private String canCancelRenewal = null;

    @SerializedName("canUpgrade")
    private String canUpgrade = null;

    @SerializedName("connectPermission")
    private String connectPermission = null;

    @SerializedName("createdDate")
    private String createdDate = null;

    @SerializedName("currencyCode")
    private String currencyCode = null;

    @SerializedName("currentPlanId")
    private String currentPlanId = null;

    @SerializedName("distributorCode")
    private String distributorCode = null;

    @SerializedName("docuSignLandingUrl")
    private String docuSignLandingUrl = null;

    @SerializedName("envelopeSendingBlocked")
    private String envelopeSendingBlocked = null;

    @SerializedName("envelopeUnitPrice")
    private String envelopeUnitPrice = null;

    @SerializedName("forgottenPasswordQuestionsCount")
    private String forgottenPasswordQuestionsCount = null;

    @SerializedName("isDowngrade")
    private String isDowngrade = null;

    @SerializedName("paymentMethod")
    private String paymentMethod = null;

    @SerializedName("planClassification")
    private String planClassification = null;

    @SerializedName("planEndDate")
    private String planEndDate = null;

    @SerializedName("planName")
    private String planName = null;

    @SerializedName("planStartDate")
    private String planStartDate = null;

    @SerializedName("seatsAllowed")
    private String seatsAllowed = null;

    @SerializedName("seatsInUse")
    private String seatsInUse = null;

    @SerializedName("status21CFRPart11")
    private String status21CFRPart11 = null;

    @SerializedName("suspensionDate")
    private String suspensionDate = null;

    @SerializedName("suspensionStatus")
    private String suspensionStatus = null;


    /**
     * The GUID associated with the account ID.
     **/
    @ApiModelProperty(value = "The GUID associated with the account ID.")
    public String getAccountIdGuid() {
        return accountIdGuid;
    }

    public void setAccountIdGuid(String accountIdGuid) {
        this.accountIdGuid = accountIdGuid;
    }


    /**
     * The name of the current account.
     **/
    @ApiModelProperty(value = "The name of the current account.")
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    /**
     * When set to **true**, the transaction rooms feature exposed through the Workspaces API is enabled.
     **/
    @ApiModelProperty(value = "When set to **true**, the transaction rooms feature exposed through the Workspaces API is enabled.")
    public String getAllowTransactionRooms() {
        return allowTransactionRooms;
    }

    public void setAllowTransactionRooms(String allowTransactionRooms) {
        this.allowTransactionRooms = allowTransactionRooms;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBillingPeriodDaysRemaining() {
        return billingPeriodDaysRemaining;
    }

    public void setBillingPeriodDaysRemaining(String billingPeriodDaysRemaining) {
        this.billingPeriodDaysRemaining = billingPeriodDaysRemaining;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBillingPeriodEndDate() {
        return billingPeriodEndDate;
    }

    public void setBillingPeriodEndDate(String billingPeriodEndDate) {
        this.billingPeriodEndDate = billingPeriodEndDate;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBillingPeriodEnvelopesAllowed() {
        return billingPeriodEnvelopesAllowed;
    }

    public void setBillingPeriodEnvelopesAllowed(String billingPeriodEnvelopesAllowed) {
        this.billingPeriodEnvelopesAllowed = billingPeriodEnvelopesAllowed;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBillingPeriodEnvelopesSent() {
        return billingPeriodEnvelopesSent;
    }

    public void setBillingPeriodEnvelopesSent(String billingPeriodEnvelopesSent) {
        this.billingPeriodEnvelopesSent = billingPeriodEnvelopesSent;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBillingPeriodStartDate() {
        return billingPeriodStartDate;
    }

    public void setBillingPeriodStartDate(String billingPeriodStartDate) {
        this.billingPeriodStartDate = billingPeriodStartDate;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBillingProfile() {
        return billingProfile;
    }

    public void setBillingProfile(String billingProfile) {
        this.billingProfile = billingProfile;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getCanCancelRenewal() {
        return canCancelRenewal;
    }

    public void setCanCancelRenewal(String canCancelRenewal) {
        this.canCancelRenewal = canCancelRenewal;
    }


    /**
     * When set to **true**, specifies that you can upgrade the account through the API.
     **/
    @ApiModelProperty(value = "When set to **true**, specifies that you can upgrade the account through the API.")
    public String getCanUpgrade() {
        return canUpgrade;
    }

    public void setCanUpgrade(String canUpgrade) {
        this.canUpgrade = canUpgrade;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getConnectPermission() {
        return connectPermission;
    }

    public void setConnectPermission(String connectPermission) {
        this.connectPermission = connectPermission;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }


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
     * Identifies the plan that was used create this account.
     **/
    @ApiModelProperty(value = "Identifies the plan that was used create this account.")
    public String getCurrentPlanId() {
        return currentPlanId;
    }

    public void setCurrentPlanId(String currentPlanId) {
        this.currentPlanId = currentPlanId;
    }


    /**
     * The code that identifies the billing plan groups and plans for the new account.
     **/
    @ApiModelProperty(value = "The code that identifies the billing plan groups and plans for the new account.")
    public String getDistributorCode() {
        return distributorCode;
    }

    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDocuSignLandingUrl() {
        return docuSignLandingUrl;
    }

    public void setDocuSignLandingUrl(String docuSignLandingUrl) {
        this.docuSignLandingUrl = docuSignLandingUrl;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEnvelopeSendingBlocked() {
        return envelopeSendingBlocked;
    }

    public void setEnvelopeSendingBlocked(String envelopeSendingBlocked) {
        this.envelopeSendingBlocked = envelopeSendingBlocked;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEnvelopeUnitPrice() {
        return envelopeUnitPrice;
    }

    public void setEnvelopeUnitPrice(String envelopeUnitPrice) {
        this.envelopeUnitPrice = envelopeUnitPrice;
    }


    /**
     * A complex element that contains up to four Question/Answer pairs for forgotten password information for a user.
     **/
    @ApiModelProperty(value = " A complex element that contains up to four Question/Answer pairs for forgotten password information for a user.")
    public String getForgottenPasswordQuestionsCount() {
        return forgottenPasswordQuestionsCount;
    }

    public void setForgottenPasswordQuestionsCount(String forgottenPasswordQuestionsCount) {
        this.forgottenPasswordQuestionsCount = forgottenPasswordQuestionsCount;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsDowngrade() {
        return isDowngrade;
    }

    public void setIsDowngrade(String isDowngrade) {
        this.isDowngrade = isDowngrade;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.
     **/
    @ApiModelProperty(value = "Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.")
    public String getPlanClassification() {
        return planClassification;
    }

    public void setPlanClassification(String planClassification) {
        this.planClassification = planClassification;
    }


    /**
     * The date that the current plan will end.
     **/
    @ApiModelProperty(value = "The date that the current plan will end.")
    public String getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
    }


    /**
     * The name of the Billing Plan.
     **/
    @ApiModelProperty(value = "The name of the Billing Plan.")
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }


    /**
     * The date that the Account started using the current plan.
     **/
    @ApiModelProperty(value = "The date that the Account started using the current plan.")
    public String getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSeatsAllowed() {
        return seatsAllowed;
    }

    public void setSeatsAllowed(String seatsAllowed) {
        this.seatsAllowed = seatsAllowed;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSeatsInUse() {
        return seatsInUse;
    }

    public void setSeatsInUse(String seatsInUse) {
        this.seatsInUse = seatsInUse;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getStatus21CFRPart11() {
        return status21CFRPart11;
    }

    public void setStatus21CFRPart11(String status21CFRPart11) {
        this.status21CFRPart11 = status21CFRPart11;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSuspensionDate() {
        return suspensionDate;
    }

    public void setSuspensionDate(String suspensionDate) {
        this.suspensionDate = suspensionDate;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSuspensionStatus() {
        return suspensionStatus;
    }

    public void setSuspensionStatus(String suspensionStatus) {
        this.suspensionStatus = suspensionStatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountInformation accountInformation = (AccountInformation) o;
        return Objects.equals(accountIdGuid, accountInformation.accountIdGuid) &&
                Objects.equals(accountName, accountInformation.accountName) &&
                Objects.equals(allowTransactionRooms, accountInformation.allowTransactionRooms) &&
                Objects.equals(billingPeriodDaysRemaining, accountInformation.billingPeriodDaysRemaining) &&
                Objects.equals(billingPeriodEndDate, accountInformation.billingPeriodEndDate) &&
                Objects.equals(billingPeriodEnvelopesAllowed, accountInformation.billingPeriodEnvelopesAllowed) &&
                Objects.equals(billingPeriodEnvelopesSent, accountInformation.billingPeriodEnvelopesSent) &&
                Objects.equals(billingPeriodStartDate, accountInformation.billingPeriodStartDate) &&
                Objects.equals(billingProfile, accountInformation.billingProfile) &&
                Objects.equals(canCancelRenewal, accountInformation.canCancelRenewal) &&
                Objects.equals(canUpgrade, accountInformation.canUpgrade) &&
                Objects.equals(connectPermission, accountInformation.connectPermission) &&
                Objects.equals(createdDate, accountInformation.createdDate) &&
                Objects.equals(currencyCode, accountInformation.currencyCode) &&
                Objects.equals(currentPlanId, accountInformation.currentPlanId) &&
                Objects.equals(distributorCode, accountInformation.distributorCode) &&
                Objects.equals(docuSignLandingUrl, accountInformation.docuSignLandingUrl) &&
                Objects.equals(envelopeSendingBlocked, accountInformation.envelopeSendingBlocked) &&
                Objects.equals(envelopeUnitPrice, accountInformation.envelopeUnitPrice) &&
                Objects.equals(forgottenPasswordQuestionsCount, accountInformation.forgottenPasswordQuestionsCount) &&
                Objects.equals(isDowngrade, accountInformation.isDowngrade) &&
                Objects.equals(paymentMethod, accountInformation.paymentMethod) &&
                Objects.equals(planClassification, accountInformation.planClassification) &&
                Objects.equals(planEndDate, accountInformation.planEndDate) &&
                Objects.equals(planName, accountInformation.planName) &&
                Objects.equals(planStartDate, accountInformation.planStartDate) &&
                Objects.equals(seatsAllowed, accountInformation.seatsAllowed) &&
                Objects.equals(seatsInUse, accountInformation.seatsInUse) &&
                Objects.equals(status21CFRPart11, accountInformation.status21CFRPart11) &&
                Objects.equals(suspensionDate, accountInformation.suspensionDate) &&
                Objects.equals(suspensionStatus, accountInformation.suspensionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountIdGuid, accountName, allowTransactionRooms, billingPeriodDaysRemaining, billingPeriodEndDate, billingPeriodEnvelopesAllowed, billingPeriodEnvelopesSent, billingPeriodStartDate, billingProfile, canCancelRenewal, canUpgrade, connectPermission, createdDate, currencyCode, currentPlanId, distributorCode, docuSignLandingUrl, envelopeSendingBlocked, envelopeUnitPrice, forgottenPasswordQuestionsCount, isDowngrade, paymentMethod, planClassification, planEndDate, planName, planStartDate, seatsAllowed, seatsInUse, status21CFRPart11, suspensionDate, suspensionStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountInformation {\n");

        sb.append("    accountIdGuid: ").append(toIndentedString(accountIdGuid)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    allowTransactionRooms: ").append(toIndentedString(allowTransactionRooms)).append("\n");
        sb.append("    billingPeriodDaysRemaining: ").append(toIndentedString(billingPeriodDaysRemaining)).append("\n");
        sb.append("    billingPeriodEndDate: ").append(toIndentedString(billingPeriodEndDate)).append("\n");
        sb.append("    billingPeriodEnvelopesAllowed: ").append(toIndentedString(billingPeriodEnvelopesAllowed)).append("\n");
        sb.append("    billingPeriodEnvelopesSent: ").append(toIndentedString(billingPeriodEnvelopesSent)).append("\n");
        sb.append("    billingPeriodStartDate: ").append(toIndentedString(billingPeriodStartDate)).append("\n");
        sb.append("    billingProfile: ").append(toIndentedString(billingProfile)).append("\n");
        sb.append("    canCancelRenewal: ").append(toIndentedString(canCancelRenewal)).append("\n");
        sb.append("    canUpgrade: ").append(toIndentedString(canUpgrade)).append("\n");
        sb.append("    connectPermission: ").append(toIndentedString(connectPermission)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    currentPlanId: ").append(toIndentedString(currentPlanId)).append("\n");
        sb.append("    distributorCode: ").append(toIndentedString(distributorCode)).append("\n");
        sb.append("    docuSignLandingUrl: ").append(toIndentedString(docuSignLandingUrl)).append("\n");
        sb.append("    envelopeSendingBlocked: ").append(toIndentedString(envelopeSendingBlocked)).append("\n");
        sb.append("    envelopeUnitPrice: ").append(toIndentedString(envelopeUnitPrice)).append("\n");
        sb.append("    forgottenPasswordQuestionsCount: ").append(toIndentedString(forgottenPasswordQuestionsCount)).append("\n");
        sb.append("    isDowngrade: ").append(toIndentedString(isDowngrade)).append("\n");
        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
        sb.append("    planClassification: ").append(toIndentedString(planClassification)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
        sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
        sb.append("    seatsAllowed: ").append(toIndentedString(seatsAllowed)).append("\n");
        sb.append("    seatsInUse: ").append(toIndentedString(seatsInUse)).append("\n");
        sb.append("    status21CFRPart11: ").append(toIndentedString(status21CFRPart11)).append("\n");
        sb.append("    suspensionDate: ").append(toIndentedString(suspensionDate)).append("\n");
        sb.append("    suspensionStatus: ").append(toIndentedString(suspensionStatus)).append("\n");
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
