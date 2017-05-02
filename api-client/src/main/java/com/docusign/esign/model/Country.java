package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class Country implements Serializable {

    @SerializedName("isoCode")
    private String isoCode = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("provinces")
    private java.util.List<Province> provinces = new java.util.ArrayList<Province>();

    @SerializedName("provinceValidated")
    private String provinceValidated = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
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
    public java.util.List<Province> getProvinces() {
        return provinces;
    }

    public void setProvinces(java.util.List<Province> provinces) {
        this.provinces = provinces;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getProvinceValidated() {
        return provinceValidated;
    }

    public void setProvinceValidated(String provinceValidated) {
        this.provinceValidated = provinceValidated;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Country country = (Country) o;
        return Objects.equals(isoCode, country.isoCode) &&
                Objects.equals(name, country.name) &&
                Objects.equals(provinces, country.provinces) &&
                Objects.equals(provinceValidated, country.provinceValidated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isoCode, name, provinces, provinceValidated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Country {\n");

        sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provinces: ").append(toIndentedString(provinces)).append("\n");
        sb.append("    provinceValidated: ").append(toIndentedString(provinceValidated)).append("\n");
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
