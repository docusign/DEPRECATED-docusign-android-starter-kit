package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PowerFormRecipient implements Serializable {

    @SerializedName("accessCode")
    private String accessCode = null;

    @SerializedName("accessCodeLocked")
    private String accessCodeLocked = null;

    @SerializedName("accessCodeRequired")
    private String accessCodeRequired = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("emailLocked")
    private String emailLocked = null;

    @SerializedName("idCheckConfigurationName")
    private String idCheckConfigurationName = null;

    @SerializedName("idCheckRequired")
    private String idCheckRequired = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("recipientType")
    private String recipientType = null;

    @SerializedName("roleName")
    private String roleName = null;

    @SerializedName("routingOrder")
    private String routingOrder = null;

    @SerializedName("templateRequiresIdLookup")
    private String templateRequiresIdLookup = null;

    @SerializedName("userNameLocked")
    private String userNameLocked = null;


    /**
     * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and it must conform to the account\u2019s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then the access code is not required.
     **/
    @ApiModelProperty(value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and it must conform to the account\u2019s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then the access code is not required.")
    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAccessCodeLocked() {
        return accessCodeLocked;
    }

    public void setAccessCodeLocked(String accessCodeLocked) {
        this.accessCodeLocked = accessCodeLocked;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAccessCodeRequired() {
        return accessCodeRequired;
    }

    public void setAccessCodeRequired(String accessCodeRequired) {
        this.accessCodeRequired = accessCodeRequired;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEmailLocked() {
        return emailLocked;
    }

    public void setEmailLocked(String emailLocked) {
        this.emailLocked = emailLocked;
    }


    /**
     * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.\n\n*Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.
     **/
    @ApiModelProperty(value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.\n\n*Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
    public String getIdCheckConfigurationName() {
        return idCheckConfigurationName;
    }

    public void setIdCheckConfigurationName(String idCheckConfigurationName) {
        this.idCheckConfigurationName = idCheckConfigurationName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIdCheckRequired() {
        return idCheckRequired;
    }

    public void setIdCheckRequired(String idCheckRequired) {
        this.idCheckRequired = idCheckRequired;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getRecipientType() {
        return recipientType;
    }

    public void setRecipientType(String recipientType) {
        this.recipientType = recipientType;
    }


    /**
     * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
     **/
    @ApiModelProperty(value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    /**
     * Specifies the routing order of the recipient in the envelope.
     **/
    @ApiModelProperty(value = "Specifies the routing order of the recipient in the envelope. ")
    public String getRoutingOrder() {
        return routingOrder;
    }

    public void setRoutingOrder(String routingOrder) {
        this.routingOrder = routingOrder;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTemplateRequiresIdLookup() {
        return templateRequiresIdLookup;
    }

    public void setTemplateRequiresIdLookup(String templateRequiresIdLookup) {
        this.templateRequiresIdLookup = templateRequiresIdLookup;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUserNameLocked() {
        return userNameLocked;
    }

    public void setUserNameLocked(String userNameLocked) {
        this.userNameLocked = userNameLocked;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PowerFormRecipient powerFormRecipient = (PowerFormRecipient) o;
        return Objects.equals(accessCode, powerFormRecipient.accessCode) &&
                Objects.equals(accessCodeLocked, powerFormRecipient.accessCodeLocked) &&
                Objects.equals(accessCodeRequired, powerFormRecipient.accessCodeRequired) &&
                Objects.equals(email, powerFormRecipient.email) &&
                Objects.equals(emailLocked, powerFormRecipient.emailLocked) &&
                Objects.equals(idCheckConfigurationName, powerFormRecipient.idCheckConfigurationName) &&
                Objects.equals(idCheckRequired, powerFormRecipient.idCheckRequired) &&
                Objects.equals(name, powerFormRecipient.name) &&
                Objects.equals(recipientType, powerFormRecipient.recipientType) &&
                Objects.equals(roleName, powerFormRecipient.roleName) &&
                Objects.equals(routingOrder, powerFormRecipient.routingOrder) &&
                Objects.equals(templateRequiresIdLookup, powerFormRecipient.templateRequiresIdLookup) &&
                Objects.equals(userNameLocked, powerFormRecipient.userNameLocked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessCode, accessCodeLocked, accessCodeRequired, email, emailLocked, idCheckConfigurationName, idCheckRequired, name, recipientType, roleName, routingOrder, templateRequiresIdLookup, userNameLocked);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PowerFormRecipient {\n");

        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
        sb.append("    accessCodeLocked: ").append(toIndentedString(accessCodeLocked)).append("\n");
        sb.append("    accessCodeRequired: ").append(toIndentedString(accessCodeRequired)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    emailLocked: ").append(toIndentedString(emailLocked)).append("\n");
        sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
        sb.append("    idCheckRequired: ").append(toIndentedString(idCheckRequired)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
        sb.append("    templateRequiresIdLookup: ").append(toIndentedString(templateRequiresIdLookup)).append("\n");
        sb.append("    userNameLocked: ").append(toIndentedString(userNameLocked)).append("\n");
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
