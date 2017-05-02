package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class SamlAssertionAttribute implements Serializable {

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("originalValue")
    private String originalValue = null;

    @SerializedName("value")
    private String value = null;


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
     * The initial value of the tab when it was sent to the recipient.
     **/
    @ApiModelProperty(value = "The initial value of the tab when it was sent to the recipient. ")
    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }


    /**
     * The value associated with the named SAML assertion attribute
     **/
    @ApiModelProperty(value = "The value associated with the named SAML assertion attribute")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SamlAssertionAttribute samlAssertionAttribute = (SamlAssertionAttribute) o;
        return Objects.equals(errorDetails, samlAssertionAttribute.errorDetails) &&
                Objects.equals(name, samlAssertionAttribute.name) &&
                Objects.equals(originalValue, samlAssertionAttribute.originalValue) &&
                Objects.equals(value, samlAssertionAttribute.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorDetails, name, originalValue, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SamlAssertionAttribute {\n");

        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
