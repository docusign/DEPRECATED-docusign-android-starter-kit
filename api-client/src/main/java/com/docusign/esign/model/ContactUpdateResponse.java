package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ContactUpdateResponse implements Serializable {

    @SerializedName("contacts")
    private java.util.List<Contact> contacts = new java.util.ArrayList<Contact>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(java.util.List<Contact> contacts) {
        this.contacts = contacts;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContactUpdateResponse contactUpdateResponse = (ContactUpdateResponse) o;
        return Objects.equals(contacts, contactUpdateResponse.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contacts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContactUpdateResponse {\n");

        sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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
