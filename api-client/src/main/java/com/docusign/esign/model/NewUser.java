package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class NewUser implements Serializable {

    @SerializedName("apiPassword")
    private String apiPassword = null;

    @SerializedName("createdDateTime")
    private String createdDateTime = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("permissionProfileId")
    private String permissionProfileId = null;

    @SerializedName("permissionProfileName")
    private String permissionProfileName = null;

    @SerializedName("uri")
    private String uri = null;

    @SerializedName("userId")
    private String userId = null;

    @SerializedName("userName")
    private String userName = null;

    @SerializedName("userStatus")
    private String userStatus = null;


    /**
     * Contains a token that can be used for authentication in API calls instead of using the user name and password.
     **/
    @ApiModelProperty(value = "Contains a token that can be used for authentication in API calls instead of using the user name and password.")
    public String getApiPassword() {
        return apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
    }


    /**
     * Indicates the date and time the item was created.
     **/
    @ApiModelProperty(value = "Indicates the date and time the item was created.")
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
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
    public String getPermissionProfileId() {
        return permissionProfileId;
    }

    public void setPermissionProfileId(String permissionProfileId) {
        this.permissionProfileId = permissionProfileId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPermissionProfileName() {
        return permissionProfileName;
    }

    public void setPermissionProfileName(String permissionProfileName) {
        this.permissionProfileName = permissionProfileName;
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
     * Specifies the user ID for the new user.
     **/
    @ApiModelProperty(value = "Specifies the user ID for the new user.")
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NewUser newUser = (NewUser) o;
        return Objects.equals(apiPassword, newUser.apiPassword) &&
                Objects.equals(createdDateTime, newUser.createdDateTime) &&
                Objects.equals(email, newUser.email) &&
                Objects.equals(errorDetails, newUser.errorDetails) &&
                Objects.equals(permissionProfileId, newUser.permissionProfileId) &&
                Objects.equals(permissionProfileName, newUser.permissionProfileName) &&
                Objects.equals(uri, newUser.uri) &&
                Objects.equals(userId, newUser.userId) &&
                Objects.equals(userName, newUser.userName) &&
                Objects.equals(userStatus, newUser.userStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiPassword, createdDateTime, email, errorDetails, permissionProfileId, permissionProfileName, uri, userId, userName, userStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewUser {\n");

        sb.append("    apiPassword: ").append(toIndentedString(apiPassword)).append("\n");
        sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
        sb.append("    permissionProfileName: ").append(toIndentedString(permissionProfileName)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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
