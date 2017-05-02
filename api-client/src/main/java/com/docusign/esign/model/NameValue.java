package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class NameValue implements Serializable {

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
     * The name or key of a name/value pair.
     **/
    @ApiModelProperty(value = "The name or key of a name/value pair.")
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
     * The value field of a name/value pair.
     **/
    @ApiModelProperty(value = "The value field of a name/value pair.")
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
        NameValue nameValue = (NameValue) o;
        return Objects.equals(errorDetails, nameValue.errorDetails) &&
                Objects.equals(name, nameValue.name) &&
                Objects.equals(originalValue, nameValue.originalValue) &&
                Objects.equals(value, nameValue.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorDetails, name, originalValue, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NameValue {\n");

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
