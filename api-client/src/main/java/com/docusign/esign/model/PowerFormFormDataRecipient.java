package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PowerFormFormDataRecipient implements Serializable {

    @SerializedName("email")
    private String email = null;

    @SerializedName("formData")
    private java.util.List<NameValue> formData = new java.util.ArrayList<NameValue>();

    @SerializedName("name")
    private String name = null;

    @SerializedName("recipientId")
    private String recipientId = null;


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
    public java.util.List<NameValue> getFormData() {
        return formData;
    }

    public void setFormData(java.util.List<NameValue> formData) {
        this.formData = formData;
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
     * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
     **/
    @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PowerFormFormDataRecipient powerFormFormDataRecipient = (PowerFormFormDataRecipient) o;
        return Objects.equals(email, powerFormFormDataRecipient.email) &&
                Objects.equals(formData, powerFormFormDataRecipient.formData) &&
                Objects.equals(name, powerFormFormDataRecipient.name) &&
                Objects.equals(recipientId, powerFormFormDataRecipient.recipientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, formData, name, recipientId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PowerFormFormDataRecipient {\n");

        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
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
