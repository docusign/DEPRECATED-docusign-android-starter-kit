package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ProvisioningInformation implements Serializable {

    @SerializedName("defaultConnectionId")
    private String defaultConnectionId = null;

    @SerializedName("defaultPlanId")
    private String defaultPlanId = null;

    @SerializedName("distributorCode")
    private String distributorCode = null;

    @SerializedName("distributorPassword")
    private String distributorPassword = null;

    @SerializedName("passwordRuleText")
    private String passwordRuleText = null;

    @SerializedName("planPromotionText")
    private String planPromotionText = null;

    @SerializedName("purchaseOrderOrPromAllowed")
    private String purchaseOrderOrPromAllowed = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDefaultConnectionId() {
        return defaultConnectionId;
    }

    public void setDefaultConnectionId(String defaultConnectionId) {
        this.defaultConnectionId = defaultConnectionId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDefaultPlanId() {
        return defaultPlanId;
    }

    public void setDefaultPlanId(String defaultPlanId) {
        this.defaultPlanId = defaultPlanId;
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
     * The password for the distributorCode.
     **/
    @ApiModelProperty(value = "The password for the distributorCode.")
    public String getDistributorPassword() {
        return distributorPassword;
    }

    public void setDistributorPassword(String distributorPassword) {
        this.distributorPassword = distributorPassword;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPasswordRuleText() {
        return passwordRuleText;
    }

    public void setPasswordRuleText(String passwordRuleText) {
        this.passwordRuleText = passwordRuleText;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPlanPromotionText() {
        return planPromotionText;
    }

    public void setPlanPromotionText(String planPromotionText) {
        this.planPromotionText = planPromotionText;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPurchaseOrderOrPromAllowed() {
        return purchaseOrderOrPromAllowed;
    }

    public void setPurchaseOrderOrPromAllowed(String purchaseOrderOrPromAllowed) {
        this.purchaseOrderOrPromAllowed = purchaseOrderOrPromAllowed;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProvisioningInformation provisioningInformation = (ProvisioningInformation) o;
        return Objects.equals(defaultConnectionId, provisioningInformation.defaultConnectionId) &&
                Objects.equals(defaultPlanId, provisioningInformation.defaultPlanId) &&
                Objects.equals(distributorCode, provisioningInformation.distributorCode) &&
                Objects.equals(distributorPassword, provisioningInformation.distributorPassword) &&
                Objects.equals(passwordRuleText, provisioningInformation.passwordRuleText) &&
                Objects.equals(planPromotionText, provisioningInformation.planPromotionText) &&
                Objects.equals(purchaseOrderOrPromAllowed, provisioningInformation.purchaseOrderOrPromAllowed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultConnectionId, defaultPlanId, distributorCode, distributorPassword, passwordRuleText, planPromotionText, purchaseOrderOrPromAllowed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvisioningInformation {\n");

        sb.append("    defaultConnectionId: ").append(toIndentedString(defaultConnectionId)).append("\n");
        sb.append("    defaultPlanId: ").append(toIndentedString(defaultPlanId)).append("\n");
        sb.append("    distributorCode: ").append(toIndentedString(distributorCode)).append("\n");
        sb.append("    distributorPassword: ").append(toIndentedString(distributorPassword)).append("\n");
        sb.append("    passwordRuleText: ").append(toIndentedString(passwordRuleText)).append("\n");
        sb.append("    planPromotionText: ").append(toIndentedString(planPromotionText)).append("\n");
        sb.append("    purchaseOrderOrPromAllowed: ").append(toIndentedString(purchaseOrderOrPromAllowed)).append("\n");
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
