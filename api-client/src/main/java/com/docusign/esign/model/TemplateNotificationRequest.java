package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class TemplateNotificationRequest implements Serializable {

    @SerializedName("expirations")
    private Expirations expirations = null;

    @SerializedName("password")
    private String password = null;

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
     *
     **/
    @ApiModelProperty(value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
     * When set to **true**, the account default notification settings are used for the envelope.
     **/
    @ApiModelProperty(value = "When set to **true**, the account default notification settings are used for the envelope.")
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
        TemplateNotificationRequest templateNotificationRequest = (TemplateNotificationRequest) o;
        return Objects.equals(expirations, templateNotificationRequest.expirations) &&
                Objects.equals(password, templateNotificationRequest.password) &&
                Objects.equals(reminders, templateNotificationRequest.reminders) &&
                Objects.equals(useAccountDefaults, templateNotificationRequest.useAccountDefaults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expirations, password, reminders, useAccountDefaults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateNotificationRequest {\n");

        sb.append("    expirations: ").append(toIndentedString(expirations)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
