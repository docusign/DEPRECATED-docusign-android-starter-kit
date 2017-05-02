package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeAuditEvent implements Serializable {

    @SerializedName("eventFields")
    private java.util.List<NameValue> eventFields = new java.util.ArrayList<NameValue>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<NameValue> getEventFields() {
        return eventFields;
    }

    public void setEventFields(java.util.List<NameValue> eventFields) {
        this.eventFields = eventFields;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeAuditEvent envelopeAuditEvent = (EnvelopeAuditEvent) o;
        return Objects.equals(eventFields, envelopeAuditEvent.eventFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeAuditEvent {\n");

        sb.append("    eventFields: ").append(toIndentedString(eventFields)).append("\n");
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
