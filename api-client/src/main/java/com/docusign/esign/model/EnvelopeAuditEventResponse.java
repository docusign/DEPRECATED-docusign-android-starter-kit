package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeAuditEventResponse implements Serializable {

    @SerializedName("auditEvents")
    private java.util.List<EnvelopeAuditEvent> auditEvents = new java.util.ArrayList<EnvelopeAuditEvent>();


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public java.util.List<EnvelopeAuditEvent> getAuditEvents() {
        return auditEvents;
    }

    public void setAuditEvents(java.util.List<EnvelopeAuditEvent> auditEvents) {
        this.auditEvents = auditEvents;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeAuditEventResponse envelopeAuditEventResponse = (EnvelopeAuditEventResponse) o;
        return Objects.equals(auditEvents, envelopeAuditEventResponse.auditEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeAuditEventResponse {\n");

        sb.append("    auditEvents: ").append(toIndentedString(auditEvents)).append("\n");
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
