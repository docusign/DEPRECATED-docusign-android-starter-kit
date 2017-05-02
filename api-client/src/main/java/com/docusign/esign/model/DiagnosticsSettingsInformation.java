package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class DiagnosticsSettingsInformation implements Serializable {

    @SerializedName("apiRequestLogging")
    private String apiRequestLogging = null;

    @SerializedName("apiRequestLogMaxEntries")
    private String apiRequestLogMaxEntries = null;

    @SerializedName("apiRequestLogRemainingEntries")
    private String apiRequestLogRemainingEntries = null;


    /**
     * When set to **true**, enables API request logging for the user.
     **/
    @ApiModelProperty(value = " When set to **true**, enables API request logging for the user. ")
    public String getApiRequestLogging() {
        return apiRequestLogging;
    }

    public void setApiRequestLogging(String apiRequestLogging) {
        this.apiRequestLogging = apiRequestLogging;
    }


    /**
     * Specifies the maximum number of API requests to log.
     **/
    @ApiModelProperty(value = "Specifies the maximum number of API requests to log.")
    public String getApiRequestLogMaxEntries() {
        return apiRequestLogMaxEntries;
    }

    public void setApiRequestLogMaxEntries(String apiRequestLogMaxEntries) {
        this.apiRequestLogMaxEntries = apiRequestLogMaxEntries;
    }


    /**
     * Indicates the remaining number of API requests that can be logged.
     **/
    @ApiModelProperty(value = "Indicates the remaining number of API requests that can be logged.")
    public String getApiRequestLogRemainingEntries() {
        return apiRequestLogRemainingEntries;
    }

    public void setApiRequestLogRemainingEntries(String apiRequestLogRemainingEntries) {
        this.apiRequestLogRemainingEntries = apiRequestLogRemainingEntries;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiagnosticsSettingsInformation diagnosticsSettingsInformation = (DiagnosticsSettingsInformation) o;
        return Objects.equals(apiRequestLogging, diagnosticsSettingsInformation.apiRequestLogging) &&
                Objects.equals(apiRequestLogMaxEntries, diagnosticsSettingsInformation.apiRequestLogMaxEntries) &&
                Objects.equals(apiRequestLogRemainingEntries, diagnosticsSettingsInformation.apiRequestLogRemainingEntries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiRequestLogging, apiRequestLogMaxEntries, apiRequestLogRemainingEntries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosticsSettingsInformation {\n");

        sb.append("    apiRequestLogging: ").append(toIndentedString(apiRequestLogging)).append("\n");
        sb.append("    apiRequestLogMaxEntries: ").append(toIndentedString(apiRequestLogMaxEntries)).append("\n");
        sb.append("    apiRequestLogRemainingEntries: ").append(toIndentedString(apiRequestLogRemainingEntries)).append("\n");
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
