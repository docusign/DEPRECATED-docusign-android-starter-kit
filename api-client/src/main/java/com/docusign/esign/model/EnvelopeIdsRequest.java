package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeIdsRequest implements Serializable {

    @SerializedName("envelopeIds")
    private java.util.List<String> envelopeIds = new java.util.ArrayList<String>();

    @SerializedName("transactionIds")
    private java.util.List<String> transactionIds = new java.util.ArrayList<String>();


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
     * A list of transaction Id's used to determining the status of envelopes sent asynchronously. See **transactionId** property on envelopes.
     **/
    @ApiModelProperty(value = " A list of transaction Id's used to determining the status of envelopes sent asynchronously. See **transactionId** property on envelopes.")
    public java.util.List<String> getTransactionIds() {
        return transactionIds;
    }

    public void setTransactionIds(java.util.List<String> transactionIds) {
        this.transactionIds = transactionIds;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeIdsRequest envelopeIdsRequest = (EnvelopeIdsRequest) o;
        return Objects.equals(envelopeIds, envelopeIdsRequest.envelopeIds) &&
                Objects.equals(transactionIds, envelopeIdsRequest.transactionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envelopeIds, transactionIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeIdsRequest {\n");

        sb.append("    envelopeIds: ").append(toIndentedString(envelopeIds)).append("\n");
        sb.append("    transactionIds: ").append(toIndentedString(transactionIds)).append("\n");
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
