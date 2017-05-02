package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ConnectDebugLog implements Serializable {

    @SerializedName("connectConfig")
    private String connectConfig = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("eventDateTime")
    private String eventDateTime = null;

    @SerializedName("eventDescription")
    private String eventDescription = null;

    @SerializedName("payload")
    private String payload = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getConnectConfig() {
        return connectConfig;
    }

    public void setConnectConfig(String connectConfig) {
        this.connectConfig = connectConfig;
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
    public String getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectDebugLog connectDebugLog = (ConnectDebugLog) o;
        return Objects.equals(connectConfig, connectDebugLog.connectConfig) &&
                Objects.equals(errorDetails, connectDebugLog.errorDetails) &&
                Objects.equals(eventDateTime, connectDebugLog.eventDateTime) &&
                Objects.equals(eventDescription, connectDebugLog.eventDescription) &&
                Objects.equals(payload, connectDebugLog.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectConfig, errorDetails, eventDateTime, eventDescription, payload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectDebugLog {\n");

        sb.append("    connectConfig: ").append(toIndentedString(connectConfig)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
        sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
