package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EventResult implements Serializable {

    @SerializedName("eventTimestamp")
    private String eventTimestamp = null;

    @SerializedName("failureDescription")
    private String failureDescription = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("vendorFailureStatusCode")
    private String vendorFailureStatusCode = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEventTimestamp() {
        return eventTimestamp;
    }

    public void setEventTimestamp(String eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getFailureDescription() {
        return failureDescription;
    }

    public void setFailureDescription(String failureDescription) {
        this.failureDescription = failureDescription;
    }


    /**
     * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
     **/
    @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getVendorFailureStatusCode() {
        return vendorFailureStatusCode;
    }

    public void setVendorFailureStatusCode(String vendorFailureStatusCode) {
        this.vendorFailureStatusCode = vendorFailureStatusCode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventResult eventResult = (EventResult) o;
        return Objects.equals(eventTimestamp, eventResult.eventTimestamp) &&
                Objects.equals(failureDescription, eventResult.failureDescription) &&
                Objects.equals(status, eventResult.status) &&
                Objects.equals(vendorFailureStatusCode, eventResult.vendorFailureStatusCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventTimestamp, failureDescription, status, vendorFailureStatusCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventResult {\n");

        sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
        sb.append("    failureDescription: ").append(toIndentedString(failureDescription)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vendorFailureStatusCode: ").append(toIndentedString(vendorFailureStatusCode)).append("\n");
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
