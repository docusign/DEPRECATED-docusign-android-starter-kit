package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class RecipientNamesResponse implements Serializable {

    @SerializedName("multipleUsers")
    private String multipleUsers = null;

    @SerializedName("recipientNames")
    private java.util.List<String> recipientNames = new java.util.ArrayList<String>();

    @SerializedName("reservedRecipientEmail")
    private String reservedRecipientEmail = null;


    /**
     * Indicates whether email address is used by more than one user.
     **/
    @ApiModelProperty(value = "Indicates whether email address is used by more than one user.")
    public String getMultipleUsers() {
        return multipleUsers;
    }

    public void setMultipleUsers(String multipleUsers) {
        this.multipleUsers = multipleUsers;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<String> getRecipientNames() {
        return recipientNames;
    }

    public void setRecipientNames(java.util.List<String> recipientNames) {
        this.recipientNames = recipientNames;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getReservedRecipientEmail() {
        return reservedRecipientEmail;
    }

    public void setReservedRecipientEmail(String reservedRecipientEmail) {
        this.reservedRecipientEmail = reservedRecipientEmail;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecipientNamesResponse recipientNamesResponse = (RecipientNamesResponse) o;
        return Objects.equals(multipleUsers, recipientNamesResponse.multipleUsers) &&
                Objects.equals(recipientNames, recipientNamesResponse.recipientNames) &&
                Objects.equals(reservedRecipientEmail, recipientNamesResponse.reservedRecipientEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multipleUsers, recipientNames, reservedRecipientEmail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecipientNamesResponse {\n");

        sb.append("    multipleUsers: ").append(toIndentedString(multipleUsers)).append("\n");
        sb.append("    recipientNames: ").append(toIndentedString(recipientNames)).append("\n");
        sb.append("    reservedRecipientEmail: ").append(toIndentedString(reservedRecipientEmail)).append("\n");
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
