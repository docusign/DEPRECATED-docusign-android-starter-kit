package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class LockRequest implements Serializable {

    @SerializedName("lockDurationInSeconds")
    private String lockDurationInSeconds = null;

    @SerializedName("lockedByApp")
    private String lockedByApp = null;

    @SerializedName("lockType")
    private String lockType = null;

    @SerializedName("templatePassword")
    private String templatePassword = null;

    @SerializedName("useScratchPad")
    private String useScratchPad = null;


    /**
     * The number of seconds to lock the envelope for editing.  Must be greater than 0 seconds.
     **/
    @ApiModelProperty(value = "The number of seconds to lock the envelope for editing.  Must be greater than 0 seconds.")
    public String getLockDurationInSeconds() {
        return lockDurationInSeconds;
    }

    public void setLockDurationInSeconds(String lockDurationInSeconds) {
        this.lockDurationInSeconds = lockDurationInSeconds;
    }


    /**
     * A friendly name of the application used to lock the envelope.  Will be used in error messages to the user when lock conflicts occur.
     **/
    @ApiModelProperty(value = "A friendly name of the application used to lock the envelope.  Will be used in error messages to the user when lock conflicts occur.")
    public String getLockedByApp() {
        return lockedByApp;
    }

    public void setLockedByApp(String lockedByApp) {
        this.lockedByApp = lockedByApp;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getTemplatePassword() {
        return templatePassword;
    }

    public void setTemplatePassword(String templatePassword) {
        this.templatePassword = templatePassword;
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
        LockRequest lockRequest = (LockRequest) o;
        return Objects.equals(lockDurationInSeconds, lockRequest.lockDurationInSeconds) &&
                Objects.equals(lockedByApp, lockRequest.lockedByApp) &&
                Objects.equals(lockType, lockRequest.lockType) &&
                Objects.equals(templatePassword, lockRequest.templatePassword) &&
                Objects.equals(useScratchPad, lockRequest.useScratchPad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockDurationInSeconds, lockedByApp, lockType, templatePassword, useScratchPad);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LockRequest {\n");

        sb.append("    lockDurationInSeconds: ").append(toIndentedString(lockDurationInSeconds)).append("\n");
        sb.append("    lockedByApp: ").append(toIndentedString(lockedByApp)).append("\n");
        sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
        sb.append("    templatePassword: ").append(toIndentedString(templatePassword)).append("\n");
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
