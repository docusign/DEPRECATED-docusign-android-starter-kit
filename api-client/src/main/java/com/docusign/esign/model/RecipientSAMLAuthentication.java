package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains the name/value pair information for the SAML assertion attributes:\n\n* name - The name of the SAML assertion attribute.\n* value - The value associated with the named SAML assertion attribute. \n\nYour account must be set up to use SSO to use this.
 **/
@ApiModel(description = "Contains the name/value pair information for the SAML assertion attributes:\n\n* name - The name of the SAML assertion attribute.\n* value - The value associated with the named SAML assertion attribute. \n\nYour account must be set up to use SSO to use this.")
public class RecipientSAMLAuthentication implements Serializable {

    @SerializedName("samlAssertionAttributes")
    private java.util.List<SamlAssertionAttribute> samlAssertionAttributes = new java.util.ArrayList<SamlAssertionAttribute>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<SamlAssertionAttribute> getSamlAssertionAttributes() {
        return samlAssertionAttributes;
    }

    public void setSamlAssertionAttributes(java.util.List<SamlAssertionAttribute> samlAssertionAttributes) {
        this.samlAssertionAttributes = samlAssertionAttributes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecipientSAMLAuthentication recipientSAMLAuthentication = (RecipientSAMLAuthentication) o;
        return Objects.equals(samlAssertionAttributes, recipientSAMLAuthentication.samlAssertionAttributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(samlAssertionAttributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecipientSAMLAuthentication {\n");

        sb.append("    samlAssertionAttributes: ").append(toIndentedString(samlAssertionAttributes)).append("\n");
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
