package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class UserInfo implements Serializable {

    @SerializedName("activationAccessCode")
    private String activationAccessCode = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("loginStatus")
    private String loginStatus = null;

    @SerializedName("sendActivationEmail")
    private String sendActivationEmail = null;

    @SerializedName("uri")
    private String uri = null;

    @SerializedName("userId")
    private String userId = null;

    @SerializedName("userName")
    private String userName = null;

    @SerializedName("userStatus")
    private String userStatus = null;

    @SerializedName("userType")
    private String userType = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getActivationAccessCode() {
        return activationAccessCode;
    }

    public void setActivationAccessCode(String activationAccessCode) {
        this.activationAccessCode = activationAccessCode;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


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
     *
     **/
    @ApiModelProperty(value = "")
    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSendActivationEmail() {
        return sendActivationEmail;
    }

    public void setSendActivationEmail(String sendActivationEmail) {
        this.sendActivationEmail = sendActivationEmail;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(activationAccessCode, userInfo.activationAccessCode) &&
                Objects.equals(email, userInfo.email) &&
                Objects.equals(errorDetails, userInfo.errorDetails) &&
                Objects.equals(loginStatus, userInfo.loginStatus) &&
                Objects.equals(sendActivationEmail, userInfo.sendActivationEmail) &&
                Objects.equals(uri, userInfo.uri) &&
                Objects.equals(userId, userInfo.userId) &&
                Objects.equals(userName, userInfo.userName) &&
                Objects.equals(userStatus, userInfo.userStatus) &&
                Objects.equals(userType, userInfo.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activationAccessCode, email, errorDetails, loginStatus, sendActivationEmail, uri, userId, userName, userStatus, userType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserInfo {\n");

        sb.append("    activationAccessCode: ").append(toIndentedString(activationAccessCode)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    loginStatus: ").append(toIndentedString(loginStatus)).append("\n");
        sb.append("    sendActivationEmail: ").append(toIndentedString(sendActivationEmail)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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
