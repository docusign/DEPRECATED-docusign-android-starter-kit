package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class UserPasswordInformation implements Serializable {

    @SerializedName("currentPassword")
    private String currentPassword = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("forgottenPasswordInfo")
    private ForgottenPasswordInformation forgottenPasswordInfo = null;

    @SerializedName("newPassword")
    private String newPassword = null;


    /**
     * The user's current password to be changed.
     **/
    @ApiModelProperty(value = "The user's current password to be changed.")
    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }


    /**
     * The user's email address for the associated account.
     **/
    @ApiModelProperty(value = "The user's email address for the associated account.")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public ForgottenPasswordInformation getForgottenPasswordInfo() {
        return forgottenPasswordInfo;
    }

    public void setForgottenPasswordInfo(ForgottenPasswordInformation forgottenPasswordInfo) {
        this.forgottenPasswordInfo = forgottenPasswordInfo;
    }


    /**
     * The user's new password.
     **/
    @ApiModelProperty(value = "The user's new password.")
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserPasswordInformation userPasswordInformation = (UserPasswordInformation) o;
        return Objects.equals(currentPassword, userPasswordInformation.currentPassword) &&
                Objects.equals(email, userPasswordInformation.email) &&
                Objects.equals(forgottenPasswordInfo, userPasswordInformation.forgottenPasswordInfo) &&
                Objects.equals(newPassword, userPasswordInformation.newPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentPassword, email, forgottenPasswordInfo, newPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserPasswordInformation {\n");

        sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    forgottenPasswordInfo: ").append(toIndentedString(forgottenPasswordInfo)).append("\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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
