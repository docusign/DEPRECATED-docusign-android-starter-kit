package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * A complex element that specifies the expiration settings for the envelope.
 **/
@ApiModel(description = "A complex element that specifies the expiration settings for the envelope.")
public class Expirations implements Serializable {

    @SerializedName("expireAfter")
    private String expireAfter = null;

    @SerializedName("expireEnabled")
    private String expireEnabled = null;

    @SerializedName("expireWarn")
    private String expireWarn = null;


    /**
     * An integer that sets the number of days the envelope is active.
     **/
    @ApiModelProperty(value = "An integer that sets the number of days the envelope is active.")
    public String getExpireAfter() {
        return expireAfter;
    }

    public void setExpireAfter(String expireAfter) {
        this.expireAfter = expireAfter;
    }


    /**
     * When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.
     **/
    @ApiModelProperty(value = "When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.")
    public String getExpireEnabled() {
        return expireEnabled;
    }

    public void setExpireEnabled(String expireEnabled) {
        this.expireEnabled = expireEnabled;
    }


    /**
     * An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent.
     **/
    @ApiModelProperty(value = "An integer that sets the number of days before envelope expiration that an expiration warning email is sent to the recipient. If set to 0 (zero), no warning email is sent.")
    public String getExpireWarn() {
        return expireWarn;
    }

    public void setExpireWarn(String expireWarn) {
        this.expireWarn = expireWarn;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Expirations expirations = (Expirations) o;
        return Objects.equals(expireAfter, expirations.expireAfter) &&
                Objects.equals(expireEnabled, expirations.expireEnabled) &&
                Objects.equals(expireWarn, expirations.expireWarn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expireAfter, expireEnabled, expireWarn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Expirations {\n");

        sb.append("    expireAfter: ").append(toIndentedString(expireAfter)).append("\n");
        sb.append("    expireEnabled: ").append(toIndentedString(expireEnabled)).append("\n");
        sb.append("    expireWarn: ").append(toIndentedString(expireWarn)).append("\n");
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
