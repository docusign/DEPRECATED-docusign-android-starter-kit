package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ConnectFailureResults implements Serializable {

    @SerializedName("retryQueue")
    private java.util.List<ConnectFailureResult> retryQueue = new java.util.ArrayList<ConnectFailureResult>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<ConnectFailureResult> getRetryQueue() {
        return retryQueue;
    }

    public void setRetryQueue(java.util.List<ConnectFailureResult> retryQueue) {
        this.retryQueue = retryQueue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectFailureResults connectFailureResults = (ConnectFailureResults) o;
        return Objects.equals(retryQueue, connectFailureResults.retryQueue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retryQueue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectFailureResults {\n");

        sb.append("    retryQueue: ").append(toIndentedString(retryQueue)).append("\n");
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
