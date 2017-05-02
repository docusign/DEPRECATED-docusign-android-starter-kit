package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ConnectFailureFilter implements Serializable {

    @SerializedName("envelopeIds")
    private java.util.List<String> envelopeIds = new java.util.ArrayList<String>();

    @SerializedName("synchronous")
    private String synchronous = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<String> getEnvelopeIds() {
        return envelopeIds;
    }

    public void setEnvelopeIds(java.util.List<String> envelopeIds) {
        this.envelopeIds = envelopeIds;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSynchronous() {
        return synchronous;
    }

    public void setSynchronous(String synchronous) {
        this.synchronous = synchronous;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectFailureFilter connectFailureFilter = (ConnectFailureFilter) o;
        return Objects.equals(envelopeIds, connectFailureFilter.envelopeIds) &&
                Objects.equals(synchronous, connectFailureFilter.synchronous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envelopeIds, synchronous);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectFailureFilter {\n");

        sb.append("    envelopeIds: ").append(toIndentedString(envelopeIds)).append("\n");
        sb.append("    synchronous: ").append(toIndentedString(synchronous)).append("\n");
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
