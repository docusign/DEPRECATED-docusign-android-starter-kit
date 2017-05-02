package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PowerFormsFormDataResponse implements Serializable {

    @SerializedName("envelopes")
    private java.util.List<PowerFormFormDataEnvelope> envelopes = new java.util.ArrayList<PowerFormFormDataEnvelope>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<PowerFormFormDataEnvelope> getEnvelopes() {
        return envelopes;
    }

    public void setEnvelopes(java.util.List<PowerFormFormDataEnvelope> envelopes) {
        this.envelopes = envelopes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PowerFormsFormDataResponse powerFormsFormDataResponse = (PowerFormsFormDataResponse) o;
        return Objects.equals(envelopes, powerFormsFormDataResponse.envelopes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envelopes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PowerFormsFormDataResponse {\n");

        sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
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
