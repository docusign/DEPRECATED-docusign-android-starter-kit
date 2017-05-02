package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * A complex type that Contains the elements:\n\n* recipMayProvideNumber - Boolean. When set to **true**, the recipient can use whatever phone number they choose.\n* senderProvidedNumbers - ArrayOfString.  A list of phone numbers the recipient can use.\n* recordVoicePrint - Reserved.\n* validateRecipProvidedNumber - Reserved.
 **/
@ApiModel(description = "A complex type that Contains the elements:\n\n* recipMayProvideNumber - Boolean. When set to **true**, the recipient can use whatever phone number they choose.\n* senderProvidedNumbers - ArrayOfString.  A list of phone numbers the recipient can use.\n* recordVoicePrint - Reserved.\n* validateRecipProvidedNumber - Reserved.")
public class RecipientPhoneAuthentication implements Serializable {

    @SerializedName("recipMayProvideNumber")
    private String recipMayProvideNumber = null;

    @SerializedName("recordVoicePrint")
    private String recordVoicePrint = null;

    @SerializedName("senderProvidedNumbers")
    private java.util.List<String> senderProvidedNumbers = new java.util.ArrayList<String>();

    @SerializedName("validateRecipProvidedNumber")
    private String validateRecipProvidedNumber = null;


    /**
     * Boolean. When set to **true**, the recipient can supply a phone number their choice.
     **/
    @ApiModelProperty(value = "Boolean. When set to **true**, the recipient can supply a phone number their choice.")
    public String getRecipMayProvideNumber() {
        return recipMayProvideNumber;
    }

    public void setRecipMayProvideNumber(String recipMayProvideNumber) {
        this.recipMayProvideNumber = recipMayProvideNumber;
    }


    /**
     * Reserved.
     **/
    @ApiModelProperty(value = "Reserved.")
    public String getRecordVoicePrint() {
        return recordVoicePrint;
    }

    public void setRecordVoicePrint(String recordVoicePrint) {
        this.recordVoicePrint = recordVoicePrint;
    }


    /**
     * An Array containing a list of phone numbers the recipient may use for SMS text authentication.
     **/
    @ApiModelProperty(value = "An Array containing a list of phone numbers the recipient may use for SMS text authentication. ")
    public java.util.List<String> getSenderProvidedNumbers() {
        return senderProvidedNumbers;
    }

    public void setSenderProvidedNumbers(java.util.List<String> senderProvidedNumbers) {
        this.senderProvidedNumbers = senderProvidedNumbers;
    }


    /**
     * Reserved.
     **/
    @ApiModelProperty(value = " Reserved.")
    public String getValidateRecipProvidedNumber() {
        return validateRecipProvidedNumber;
    }

    public void setValidateRecipProvidedNumber(String validateRecipProvidedNumber) {
        this.validateRecipProvidedNumber = validateRecipProvidedNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecipientPhoneAuthentication recipientPhoneAuthentication = (RecipientPhoneAuthentication) o;
        return Objects.equals(recipMayProvideNumber, recipientPhoneAuthentication.recipMayProvideNumber) &&
                Objects.equals(recordVoicePrint, recipientPhoneAuthentication.recordVoicePrint) &&
                Objects.equals(senderProvidedNumbers, recipientPhoneAuthentication.senderProvidedNumbers) &&
                Objects.equals(validateRecipProvidedNumber, recipientPhoneAuthentication.validateRecipProvidedNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipMayProvideNumber, recordVoicePrint, senderProvidedNumbers, validateRecipProvidedNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecipientPhoneAuthentication {\n");

        sb.append("    recipMayProvideNumber: ").append(toIndentedString(recipMayProvideNumber)).append("\n");
        sb.append("    recordVoicePrint: ").append(toIndentedString(recordVoicePrint)).append("\n");
        sb.append("    senderProvidedNumbers: ").append(toIndentedString(senderProvidedNumbers)).append("\n");
        sb.append("    validateRecipProvidedNumber: ").append(toIndentedString(validateRecipProvidedNumber)).append("\n");
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
