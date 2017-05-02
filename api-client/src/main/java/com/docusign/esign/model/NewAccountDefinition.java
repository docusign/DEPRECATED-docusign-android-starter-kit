package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class NewAccountDefinition implements Serializable {

    @SerializedName("accountName")
    private String accountName = null;

    @SerializedName("accountSettings")
    private java.util.List<NameValue> accountSettings = new java.util.ArrayList<NameValue>();

    @SerializedName("addressInformation")
    private AccountAddress addressInformation = null;

    @SerializedName("creditCardInformation")
    private CreditCardInformation creditCardInformation = null;

    @SerializedName("distributorCode")
    private String distributorCode = null;

    @SerializedName("distributorPassword")
    private String distributorPassword = null;

    @SerializedName("initialUser")
    private UserInformation initialUser = null;

    @SerializedName("planInformation")
    private PlanInformation planInformation = null;

    @SerializedName("referralInformation")
    private ReferralInformation referralInformation = null;

    @SerializedName("socialAccountInformation")
    private SocialAccountInformation socialAccountInformation = null;


    /**
     * The account name for the new account.
     **/
    @ApiModelProperty(value = "The account name for the new account.")
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    /**
     * The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden.
     **/
    @ApiModelProperty(value = "The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden.")
    public java.util.List<NameValue> getAccountSettings() {
        return accountSettings;
    }

    public void setAccountSettings(java.util.List<NameValue> accountSettings) {
        this.accountSettings = accountSettings;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public AccountAddress getAddressInformation() {
        return addressInformation;
    }

    public void setAddressInformation(AccountAddress addressInformation) {
        this.addressInformation = addressInformation;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public CreditCardInformation getCreditCardInformation() {
        return creditCardInformation;
    }

    public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
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
     **/
    @ApiModelProperty(value = "")
    public UserInformation getInitialUser() {
        return initialUser;
    }

    public void setInitialUser(UserInformation initialUser) {
        this.initialUser = initialUser;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public PlanInformation getPlanInformation() {
        return planInformation;
    }

    public void setPlanInformation(PlanInformation planInformation) {
        this.planInformation = planInformation;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public ReferralInformation getReferralInformation() {
        return referralInformation;
    }

    public void setReferralInformation(ReferralInformation referralInformation) {
        this.referralInformation = referralInformation;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public SocialAccountInformation getSocialAccountInformation() {
        return socialAccountInformation;
    }

    public void setSocialAccountInformation(SocialAccountInformation socialAccountInformation) {
        this.socialAccountInformation = socialAccountInformation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NewAccountDefinition newAccountDefinition = (NewAccountDefinition) o;
        return Objects.equals(accountName, newAccountDefinition.accountName) &&
                Objects.equals(accountSettings, newAccountDefinition.accountSettings) &&
                Objects.equals(addressInformation, newAccountDefinition.addressInformation) &&
                Objects.equals(creditCardInformation, newAccountDefinition.creditCardInformation) &&
                Objects.equals(distributorCode, newAccountDefinition.distributorCode) &&
                Objects.equals(distributorPassword, newAccountDefinition.distributorPassword) &&
                Objects.equals(initialUser, newAccountDefinition.initialUser) &&
                Objects.equals(planInformation, newAccountDefinition.planInformation) &&
                Objects.equals(referralInformation, newAccountDefinition.referralInformation) &&
                Objects.equals(socialAccountInformation, newAccountDefinition.socialAccountInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, accountSettings, addressInformation, creditCardInformation, distributorCode, distributorPassword, initialUser, planInformation, referralInformation, socialAccountInformation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewAccountDefinition {\n");

        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    accountSettings: ").append(toIndentedString(accountSettings)).append("\n");
        sb.append("    addressInformation: ").append(toIndentedString(addressInformation)).append("\n");
        sb.append("    creditCardInformation: ").append(toIndentedString(creditCardInformation)).append("\n");
        sb.append("    distributorCode: ").append(toIndentedString(distributorCode)).append("\n");
        sb.append("    distributorPassword: ").append(toIndentedString(distributorPassword)).append("\n");
        sb.append("    initialUser: ").append(toIndentedString(initialUser)).append("\n");
        sb.append("    planInformation: ").append(toIndentedString(planInformation)).append("\n");
        sb.append("    referralInformation: ").append(toIndentedString(referralInformation)).append("\n");
        sb.append("    socialAccountInformation: ").append(toIndentedString(socialAccountInformation)).append("\n");
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
