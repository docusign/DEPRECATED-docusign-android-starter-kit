package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ConnectConfigResults implements Serializable {

    @SerializedName("configurations")
    private java.util.List<ConnectCustomConfiguration> configurations = new java.util.ArrayList<ConnectCustomConfiguration>();

    @SerializedName("totalRecords")
    private String totalRecords = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public java.util.List<ConnectCustomConfiguration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(java.util.List<ConnectCustomConfiguration> configurations) {
        this.configurations = configurations;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(String totalRecords) {
        this.totalRecords = totalRecords;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectConfigResults connectConfigResults = (ConnectConfigResults) o;
        return Objects.equals(configurations, connectConfigResults.configurations) &&
                Objects.equals(totalRecords, connectConfigResults.totalRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurations, totalRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectConfigResults {\n");

        sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
        sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
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
