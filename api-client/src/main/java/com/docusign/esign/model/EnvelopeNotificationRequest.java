package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeNotificationRequest implements Serializable {

    @SerializedName("expirations")
    private Expirations expirations = null;

    @SerializedName("reminders")
    private Reminders reminders = null;

    @SerializedName("useAccountDefaults")
    private String useAccountDefaults = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public Expirations getExpirations() {
        return expirations;
    }

    public void setExpirations(Expirations expirations) {
        this.expirations = expirations;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Reminders getReminders() {
        return reminders;
    }

    public void setReminders(Reminders reminders) {
        this.reminders = reminders;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUseAccountDefaults() {
        return useAccountDefaults;
    }

    public void setUseAccountDefaults(String useAccountDefaults) {
        this.useAccountDefaults = useAccountDefaults;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeNotificationRequest envelopeNotificationRequest = (EnvelopeNotificationRequest) o;
        return Objects.equals(expirations, envelopeNotificationRequest.expirations) &&
                Objects.equals(reminders, envelopeNotificationRequest.reminders) &&
                Objects.equals(useAccountDefaults, envelopeNotificationRequest.useAccountDefaults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expirations, reminders, useAccountDefaults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeNotificationRequest {\n");

        sb.append("    expirations: ").append(toIndentedString(expirations)).append("\n");
        sb.append("    reminders: ").append(toIndentedString(reminders)).append("\n");
        sb.append("    useAccountDefaults: ").append(toIndentedString(useAccountDefaults)).append("\n");
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
