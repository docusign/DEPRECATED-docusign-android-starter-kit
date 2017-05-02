package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class Contact implements Serializable {

    @SerializedName("contactId")
    private String contactId = null;

    @SerializedName("contactUri")
    private String contactUri = null;

    @SerializedName("emails")
    private java.util.List<String> emails = new java.util.ArrayList<String>();

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("organization")
    private String organization = null;

    @SerializedName("shared")
    private String shared = null;

    @SerializedName("signingGroup")
    private String signingGroup = null;

    @SerializedName("signingGroupName")
    private String signingGroupName = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getContactUri() {
        return contactUri;
    }

    public void setContactUri(String contactUri) {
        this.contactUri = contactUri;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<String> getEmails() {
        return emails;
    }

    public void setEmails(java.util.List<String> emails) {
        this.emails = emails;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
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
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }


    /**
     * When set to **true**, this custom tab is shared.
     **/
    @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
    public String getShared() {
        return shared;
    }

    public void setShared(String shared) {
        this.shared = shared;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSigningGroup() {
        return signingGroup;
    }

    public void setSigningGroup(String signingGroup) {
        this.signingGroup = signingGroup;
    }


    /**
     * The display name for the signing group. \n\nMaximum Length: 100 characters.
     **/
    @ApiModelProperty(value = "The display name for the signing group. \n\nMaximum Length: 100 characters. ")
    public String getSigningGroupName() {
        return signingGroupName;
    }

    public void setSigningGroupName(String signingGroupName) {
        this.signingGroupName = signingGroupName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contact contact = (Contact) o;
        return Objects.equals(contactId, contact.contactId) &&
                Objects.equals(contactUri, contact.contactUri) &&
                Objects.equals(emails, contact.emails) &&
                Objects.equals(errorDetails, contact.errorDetails) &&
                Objects.equals(name, contact.name) &&
                Objects.equals(organization, contact.organization) &&
                Objects.equals(shared, contact.shared) &&
                Objects.equals(signingGroup, contact.signingGroup) &&
                Objects.equals(signingGroupName, contact.signingGroupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactId, contactUri, emails, errorDetails, name, organization, shared, signingGroup, signingGroupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Contact {\n");

        sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
        sb.append("    contactUri: ").append(toIndentedString(contactUri)).append("\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    signingGroup: ").append(toIndentedString(signingGroup)).append("\n");
        sb.append("    signingGroupName: ").append(toIndentedString(signingGroupName)).append("\n");
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
