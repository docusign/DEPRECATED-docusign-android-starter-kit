package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class LockInformation implements Serializable {

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("lockDurationInSeconds")
    private String lockDurationInSeconds = null;

    @SerializedName("lockedByApp")
    private String lockedByApp = null;

    @SerializedName("lockedByUser")
    private UserInfo lockedByUser = null;

    @SerializedName("lockedUntilDateTime")
    private String lockedUntilDateTime = null;

    @SerializedName("lockToken")
    private String lockToken = null;

    @SerializedName("lockType")
    private String lockType = null;

    @SerializedName("useScratchPad")
    private String useScratchPad = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }


    /**
     * Sets the time, in seconds, until the lock expires when there is no activity on the envelope.\n\nIf no value is entered, then the default value of 300 seconds is used. The maximum value is 1,800 seconds.\n\nThe lock duration can be extended.\n
     **/
    @ApiModelProperty(value = "Sets the time, in seconds, until the lock expires when there is no activity on the envelope.\n\nIf no value is entered, then the default value of 300 seconds is used. The maximum value is 1,800 seconds.\n\nThe lock duration can be extended.\n")
    public String getLockDurationInSeconds() {
        return lockDurationInSeconds;
    }

    public void setLockDurationInSeconds(String lockDurationInSeconds) {
        this.lockDurationInSeconds = lockDurationInSeconds;
    }


    /**
     * Specifies the friendly name of  the application that is locking the envelope.
     **/
    @ApiModelProperty(value = "Specifies the friendly name of  the application that is locking the envelope.")
    public String getLockedByApp() {
        return lockedByApp;
    }

    public void setLockedByApp(String lockedByApp) {
        this.lockedByApp = lockedByApp;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public UserInfo getLockedByUser() {
        return lockedByUser;
    }

    public void setLockedByUser(UserInfo lockedByUser) {
        this.lockedByUser = lockedByUser;
    }


    /**
     * The datetime until the envelope lock expires.
     **/
    @ApiModelProperty(value = "The datetime until the envelope lock expires.")
    public String getLockedUntilDateTime() {
        return lockedUntilDateTime;
    }

    public void setLockedUntilDateTime(String lockedUntilDateTime) {
        this.lockedUntilDateTime = lockedUntilDateTime;
    }


    /**
     * A unique identifier provided to the owner of the envelope lock.   Used to prove ownership of the lock.
     **/
    @ApiModelProperty(value = "A unique identifier provided to the owner of the envelope lock.   Used to prove ownership of the lock.")
    public String getLockToken() {
        return lockToken;
    }

    public void setLockToken(String lockToken) {
        this.lockToken = lockToken;
    }


    /**
     * The type of envelope lock.  Currently \"edit\" is the only supported type.
     **/
    @ApiModelProperty(value = "The type of envelope lock.  Currently \"edit\" is the only supported type.")
    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }


    /**
     * Reserved for future use.\n\nIndicates whether a scratchpad is used for editing information.\n
     **/
    @ApiModelProperty(value = "Reserved for future use.\n\nIndicates whether a scratchpad is used for editing information.\n ")
    public String getUseScratchPad() {
        return useScratchPad;
    }

    public void setUseScratchPad(String useScratchPad) {
        this.useScratchPad = useScratchPad;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LockInformation lockInformation = (LockInformation) o;
        return Objects.equals(errorDetails, lockInformation.errorDetails) &&
                Objects.equals(lockDurationInSeconds, lockInformation.lockDurationInSeconds) &&
                Objects.equals(lockedByApp, lockInformation.lockedByApp) &&
                Objects.equals(lockedByUser, lockInformation.lockedByUser) &&
                Objects.equals(lockedUntilDateTime, lockInformation.lockedUntilDateTime) &&
                Objects.equals(lockToken, lockInformation.lockToken) &&
                Objects.equals(lockType, lockInformation.lockType) &&
                Objects.equals(useScratchPad, lockInformation.useScratchPad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorDetails, lockDurationInSeconds, lockedByApp, lockedByUser, lockedUntilDateTime, lockToken, lockType, useScratchPad);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LockInformation {\n");

        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    lockDurationInSeconds: ").append(toIndentedString(lockDurationInSeconds)).append("\n");
        sb.append("    lockedByApp: ").append(toIndentedString(lockedByApp)).append("\n");
        sb.append("    lockedByUser: ").append(toIndentedString(lockedByUser)).append("\n");
        sb.append("    lockedUntilDateTime: ").append(toIndentedString(lockedUntilDateTime)).append("\n");
        sb.append("    lockToken: ").append(toIndentedString(lockToken)).append("\n");
        sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
        sb.append("    useScratchPad: ").append(toIndentedString(useScratchPad)).append("\n");
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
