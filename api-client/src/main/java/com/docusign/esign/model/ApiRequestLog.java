package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains API request log information.
 **/
@ApiModel(description = "Contains API request log information.")
public class ApiRequestLog implements Serializable {

    @SerializedName("createdDateTime")
    private String createdDateTime = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("requestLogId")
    private String requestLogId = null;

    @SerializedName("status")
    private String status = null;


    /**
     * Indicates the date and time the item was created.
     **/
    @ApiModelProperty(value = "Indicates the date and time the item was created.")
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getRequestLogId() {
        return requestLogId;
    }

    public void setRequestLogId(String requestLogId) {
        this.requestLogId = requestLogId;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiRequestLog apiRequestLog = (ApiRequestLog) o;
        return Objects.equals(createdDateTime, apiRequestLog.createdDateTime) &&
                Objects.equals(description, apiRequestLog.description) &&
                Objects.equals(requestLogId, apiRequestLog.requestLogId) &&
                Objects.equals(status, apiRequestLog.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdDateTime, description, requestLogId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiRequestLog {\n");

        sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    requestLogId: ").append(toIndentedString(requestLogId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
