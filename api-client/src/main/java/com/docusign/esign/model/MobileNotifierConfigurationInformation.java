package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class MobileNotifierConfigurationInformation implements Serializable {

    @SerializedName("mobileNotifierConfigurations")
    private java.util.List<MobileNotifierConfiguration> mobileNotifierConfigurations = new java.util.ArrayList<MobileNotifierConfiguration>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<MobileNotifierConfiguration> getMobileNotifierConfigurations() {
        return mobileNotifierConfigurations;
    }

    public void setMobileNotifierConfigurations(java.util.List<MobileNotifierConfiguration> mobileNotifierConfigurations) {
        this.mobileNotifierConfigurations = mobileNotifierConfigurations;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MobileNotifierConfigurationInformation mobileNotifierConfigurationInformation = (MobileNotifierConfigurationInformation) o;
        return Objects.equals(mobileNotifierConfigurations, mobileNotifierConfigurationInformation.mobileNotifierConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobileNotifierConfigurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MobileNotifierConfigurationInformation {\n");

        sb.append("    mobileNotifierConfigurations: ").append(toIndentedString(mobileNotifierConfigurations)).append("\n");
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
