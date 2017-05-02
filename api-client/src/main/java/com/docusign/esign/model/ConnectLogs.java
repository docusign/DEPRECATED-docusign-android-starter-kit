package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ConnectLogs implements Serializable {

    @SerializedName("failures")
    private java.util.List<ConnectLog> failures = new java.util.ArrayList<ConnectLog>();

    @SerializedName("logs")
    private java.util.List<ConnectLog> logs = new java.util.ArrayList<ConnectLog>();

    @SerializedName("totalRecords")
    private String totalRecords = null;

    @SerializedName("type")
    private String type = null;


    /**
     * An array of containing failure information from the Connect failure log.
     **/
    @ApiModelProperty(value = "An array of containing failure information from the Connect failure log.")
    public java.util.List<ConnectLog> getFailures() {
        return failures;
    }

    public void setFailures(java.util.List<ConnectLog> failures) {
        this.failures = failures;
    }


    /**
     * A complex type containing Connect log information. It is divided into two sections, one for regular logs and one for Connect failures.
     **/
    @ApiModelProperty(value = "A complex type containing Connect log information. It is divided into two sections, one for regular logs and one for Connect failures. ")
    public java.util.List<ConnectLog> getLogs() {
        return logs;
    }

    public void setLogs(java.util.List<ConnectLog> logs) {
        this.logs = logs;
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


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectLogs connectLogs = (ConnectLogs) o;
        return Objects.equals(failures, connectLogs.failures) &&
                Objects.equals(logs, connectLogs.logs) &&
                Objects.equals(totalRecords, connectLogs.totalRecords) &&
                Objects.equals(type, connectLogs.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failures, logs, totalRecords, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectLogs {\n");

        sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
