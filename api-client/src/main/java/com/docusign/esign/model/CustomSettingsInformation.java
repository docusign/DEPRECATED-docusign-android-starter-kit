package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class CustomSettingsInformation implements Serializable {

    @SerializedName("customSettings")
    private java.util.List<NameValue> customSettings = new java.util.ArrayList<NameValue>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<NameValue> getCustomSettings() {
        return customSettings;
    }

    public void setCustomSettings(java.util.List<NameValue> customSettings) {
        this.customSettings = customSettings;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomSettingsInformation customSettingsInformation = (CustomSettingsInformation) o;
        return Objects.equals(customSettings, customSettingsInformation.customSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomSettingsInformation {\n");

        sb.append("    customSettings: ").append(toIndentedString(customSettings)).append("\n");
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
