package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class CustomFieldV2 implements Serializable {

    @SerializedName("configurationType")
    private String configurationType = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("fieldId")
    private String fieldId = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("required")
    private String required = null;

    @SerializedName("show")
    private String show = null;

    @SerializedName("value")
    private String value = null;


    /**
     * If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.
     **/
    @ApiModelProperty(value = "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
    public String getConfigurationType() {
        return configurationType;
    }

    public void setConfigurationType(String configurationType) {
        this.configurationType = configurationType;
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
    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
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
     * When set to **true**, the signer is required to fill out this tab
     **/
    @ApiModelProperty(value = "When set to **true**, the signer is required to fill out this tab")
    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }


    /**
     * The value of the custom field.
     **/
    @ApiModelProperty(value = "The value of the custom field.")
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
        CustomFieldV2 customFieldV2 = (CustomFieldV2) o;
        return Objects.equals(configurationType, customFieldV2.configurationType) &&
                Objects.equals(errorDetails, customFieldV2.errorDetails) &&
                Objects.equals(fieldId, customFieldV2.fieldId) &&
                Objects.equals(name, customFieldV2.name) &&
                Objects.equals(required, customFieldV2.required) &&
                Objects.equals(show, customFieldV2.show) &&
                Objects.equals(value, customFieldV2.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurationType, errorDetails, fieldId, name, required, show, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomFieldV2 {\n");

        sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    show: ").append(toIndentedString(show)).append("\n");
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
