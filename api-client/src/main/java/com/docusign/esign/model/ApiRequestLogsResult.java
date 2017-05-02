package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information about mutiple API request logs.
 **/
@ApiModel(description = "Contains information about mutiple API request logs.")
public class ApiRequestLogsResult implements Serializable {

    @SerializedName("apiRequestLogs")
    private java.util.List<ApiRequestLog> apiRequestLogs = new java.util.ArrayList<ApiRequestLog>();


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public java.util.List<ApiRequestLog> getApiRequestLogs() {
        return apiRequestLogs;
    }

    public void setApiRequestLogs(java.util.List<ApiRequestLog> apiRequestLogs) {
        this.apiRequestLogs = apiRequestLogs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiRequestLogsResult apiRequestLogsResult = (ApiRequestLogsResult) o;
        return Objects.equals(apiRequestLogs, apiRequestLogsResult.apiRequestLogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiRequestLogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiRequestLogsResult {\n");

        sb.append("    apiRequestLogs: ").append(toIndentedString(apiRequestLogs)).append("\n");
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
