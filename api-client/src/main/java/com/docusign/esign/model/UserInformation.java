package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class UserInformation implements Serializable {

    @SerializedName("accountManagementGranular")
    private UserAccountManagementGranularInformation accountManagementGranular = null;

    @SerializedName("activationAccessCode")
    private String activationAccessCode = null;

    @SerializedName("createdDateTime")
    private String createdDateTime = null;

    @SerializedName("customSettings")
    private java.util.List<NameValue> customSettings = new java.util.ArrayList<NameValue>();

    @SerializedName("email")
    private String email = null;

    @SerializedName("enableConnectForUser")
    private String enableConnectForUser = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("firstName")
    private String firstName = null;

    @SerializedName("forgottenPasswordInfo")
    private ForgottenPasswordInformation forgottenPasswordInfo = null;

    @SerializedName("groupList")
    private java.util.List<Group> groupList = new java.util.ArrayList<Group>();

    @SerializedName("homeAddress")
    private AddressInformationV2 homeAddress = null;

    @SerializedName("initialsImageUri")
    private String initialsImageUri = null;

    @SerializedName("isAdmin")
    private String isAdmin = null;

    @SerializedName("lastLogin")
    private String lastLogin = null;

    @SerializedName("lastName")
    private String lastName = null;

    @SerializedName("loginStatus")
    private String loginStatus = null;

    @SerializedName("middleName")
    private String middleName = null;

    @SerializedName("password")
    private String password = null;

    @SerializedName("passwordExpiration")
    private String passwordExpiration = null;

    @SerializedName("permissionProfileId")
    private String permissionProfileId = null;

    @SerializedName("permissionProfileName")
    private String permissionProfileName = null;

    @SerializedName("profileImageUri")
    private String profileImageUri = null;

    @SerializedName("sendActivationOnInvalidLogin")
    private String sendActivationOnInvalidLogin = null;

    @SerializedName("signatureImageUri")
    private String signatureImageUri = null;

    @SerializedName("suffixName")
    private String suffixName = null;

    @SerializedName("title")
    private String title = null;

    @SerializedName("uri")
    private String uri = null;

    @SerializedName("userId")
    private String userId = null;

    @SerializedName("userName")
    private String userName = null;

    @SerializedName("userProfileLastModifiedDate")
    private String userProfileLastModifiedDate = null;

    @SerializedName("userSettings")
    private java.util.List<NameValue> userSettings = new java.util.ArrayList<NameValue>();

    @SerializedName("userStatus")
    private String userStatus = null;

    @SerializedName("userType")
    private String userType = null;

    @SerializedName("workAddress")
    private AddressInformationV2 workAddress = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public UserAccountManagementGranularInformation getAccountManagementGranular() {
        return accountManagementGranular;
    }

    public void setAccountManagementGranular(UserAccountManagementGranularInformation accountManagementGranular) {
        this.accountManagementGranular = accountManagementGranular;
    }


    /**
     * The activation code the new user must enter when activating their account.
     **/
    @ApiModelProperty(value = "The activation code the new user must enter when activating their account.")
    public String getActivationAccessCode() {
        return activationAccessCode;
    }

    public void setActivationAccessCode(String activationAccessCode) {
        this.activationAccessCode = activationAccessCode;
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
     * The name/value pair information for the user custom setting.
     **/
    @ApiModelProperty(value = "The name/value pair information for the user custom setting.")
    public java.util.List<NameValue> getCustomSettings() {
        return customSettings;
    }

    public void setCustomSettings(java.util.List<NameValue> customSettings) {
        this.customSettings = customSettings;
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
     * Specifies whether the user is enabled for updates from DocuSign Connect. Valid values: true or false.
     **/
    @ApiModelProperty(value = "Specifies whether the user is enabled for updates from DocuSign Connect. Valid values: true or false.")
    public String getEnableConnectForUser() {
        return enableConnectForUser;
    }

    public void setEnableConnectForUser(String enableConnectForUser) {
        this.enableConnectForUser = enableConnectForUser;
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
     * The user\u2019s first name. \nMaximum Length: 50 characters.
     **/
    @ApiModelProperty(value = "The user\u2019s first name. \nMaximum Length: 50 characters.")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
     * A list of the group information for groups to add the user to. Group information can be found by calling [ML:GET group information]. The only required parameter is groupId. \n\nThe parameters are:\n\n* groupId \u2013 The DocuSign group ID for the group.\n* groupName \u2013 The name of the group\n* permissionProfileId \u2013 The ID of the permission profile associated with the group.\n* groupType \u2013 The group type.\n
     **/
    @ApiModelProperty(value = "A list of the group information for groups to add the user to. Group information can be found by calling [ML:GET group information]. The only required parameter is groupId. \n\nThe parameters are:\n\n* groupId \u2013 The DocuSign group ID for the group.\n* groupName \u2013 The name of the group\n* permissionProfileId \u2013 The ID of the permission profile associated with the group.\n* groupType \u2013 The group type.\n")
    public java.util.List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(java.util.List<Group> groupList) {
        this.groupList = groupList;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public AddressInformationV2 getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(AddressInformationV2 homeAddress) {
        this.homeAddress = homeAddress;
    }


    /**
     * Contains the URI for an endpoint that you can use to retrieve the initials image.
     **/
    @ApiModelProperty(value = "Contains the URI for an endpoint that you can use to retrieve the initials image.")
    public String getInitialsImageUri() {
        return initialsImageUri;
    }

    public void setInitialsImageUri(String initialsImageUri) {
        this.initialsImageUri = initialsImageUri;
    }


    /**
     * Determines if the feature set is actively set as part of the plan.
     **/
    @ApiModelProperty(value = "Determines if the feature set is actively set as part of the plan.")
    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }


    /**
     * Shows the date-time when the user last logged on to the system.
     **/
    @ApiModelProperty(value = "Shows the date-time when the user last logged on to the system.")
    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }


    /**
     * The user\u2019s last name. \nMaximum Length: 50 characters.
     **/
    @ApiModelProperty(value = "The user\u2019s last name. \nMaximum Length: 50 characters.")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Shows the current status of the user\u2019s password. Possible values are: \n\n* password_reset\n* password_active\n* password_expired\n* password_locked\n* password_reset_failed \n
     **/
    @ApiModelProperty(value = "Shows the current status of the user\u2019s password. Possible values are: \n\n* password_reset\n* password_active\n* password_expired\n* password_locked\n* password_reset_failed \n")
    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }


    /**
     * The user\u2019s middle name. \nMaximum Length: 50 characters.
     **/
    @ApiModelProperty(value = "The user\u2019s middle name. \nMaximum Length: 50 characters.")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getPasswordExpiration() {
        return passwordExpiration;
    }

    public void setPasswordExpiration(String passwordExpiration) {
        this.passwordExpiration = passwordExpiration;
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
    public String getProfileImageUri() {
        return profileImageUri;
    }

    public void setProfileImageUri(String profileImageUri) {
        this.profileImageUri = profileImageUri;
    }


    /**
     * When set to **true**, specifies that an additional activation email is sent to the user if they fail a log on before activating their account.
     **/
    @ApiModelProperty(value = "When set to **true**, specifies that an additional activation email is sent to the user if they fail a log on before activating their account. ")
    public String getSendActivationOnInvalidLogin() {
        return sendActivationOnInvalidLogin;
    }

    public void setSendActivationOnInvalidLogin(String sendActivationOnInvalidLogin) {
        this.sendActivationOnInvalidLogin = sendActivationOnInvalidLogin;
    }


    /**
     * Contains the URI for an endpoint that you can use to retrieve the signature image.
     **/
    @ApiModelProperty(value = "Contains the URI for an endpoint that you can use to retrieve the signature image.")
    public String getSignatureImageUri() {
        return signatureImageUri;
    }

    public void setSignatureImageUri(String signatureImageUri) {
        this.signatureImageUri = signatureImageUri;
    }


    /**
     * The suffix for the user's name. \n\nMaximum Length: 50 characters.
     **/
    @ApiModelProperty(value = "The suffix for the user's name. \n\nMaximum Length: 50 characters. ")
    public String getSuffixName() {
        return suffixName;
    }

    public void setSuffixName(String suffixName) {
        this.suffixName = suffixName;
    }


    /**
     * The title of the user.
     **/
    @ApiModelProperty(value = "The title of the user.")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    public String getUserProfileLastModifiedDate() {
        return userProfileLastModifiedDate;
    }

    public void setUserProfileLastModifiedDate(String userProfileLastModifiedDate) {
        this.userProfileLastModifiedDate = userProfileLastModifiedDate;
    }


    /**
     * The name/value pair information for user settings. These determine the actions that a user can take in the account. The `[ML:userSettings]` are listed and described below.
     **/
    @ApiModelProperty(value = " The name/value pair information for user settings. These determine the actions that a user can take in the account. The `[ML:userSettings]` are listed and described below.")
    public java.util.List<NameValue> getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(java.util.List<NameValue> userSettings) {
        this.userSettings = userSettings;
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


    /**
     **/
    @ApiModelProperty(value = "")
    public AddressInformationV2 getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(AddressInformationV2 workAddress) {
        this.workAddress = workAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserInformation userInformation = (UserInformation) o;
        return Objects.equals(accountManagementGranular, userInformation.accountManagementGranular) &&
                Objects.equals(activationAccessCode, userInformation.activationAccessCode) &&
                Objects.equals(createdDateTime, userInformation.createdDateTime) &&
                Objects.equals(customSettings, userInformation.customSettings) &&
                Objects.equals(email, userInformation.email) &&
                Objects.equals(enableConnectForUser, userInformation.enableConnectForUser) &&
                Objects.equals(errorDetails, userInformation.errorDetails) &&
                Objects.equals(firstName, userInformation.firstName) &&
                Objects.equals(forgottenPasswordInfo, userInformation.forgottenPasswordInfo) &&
                Objects.equals(groupList, userInformation.groupList) &&
                Objects.equals(homeAddress, userInformation.homeAddress) &&
                Objects.equals(initialsImageUri, userInformation.initialsImageUri) &&
                Objects.equals(isAdmin, userInformation.isAdmin) &&
                Objects.equals(lastLogin, userInformation.lastLogin) &&
                Objects.equals(lastName, userInformation.lastName) &&
                Objects.equals(loginStatus, userInformation.loginStatus) &&
                Objects.equals(middleName, userInformation.middleName) &&
                Objects.equals(password, userInformation.password) &&
                Objects.equals(passwordExpiration, userInformation.passwordExpiration) &&
                Objects.equals(permissionProfileId, userInformation.permissionProfileId) &&
                Objects.equals(permissionProfileName, userInformation.permissionProfileName) &&
                Objects.equals(profileImageUri, userInformation.profileImageUri) &&
                Objects.equals(sendActivationOnInvalidLogin, userInformation.sendActivationOnInvalidLogin) &&
                Objects.equals(signatureImageUri, userInformation.signatureImageUri) &&
                Objects.equals(suffixName, userInformation.suffixName) &&
                Objects.equals(title, userInformation.title) &&
                Objects.equals(uri, userInformation.uri) &&
                Objects.equals(userId, userInformation.userId) &&
                Objects.equals(userName, userInformation.userName) &&
                Objects.equals(userProfileLastModifiedDate, userInformation.userProfileLastModifiedDate) &&
                Objects.equals(userSettings, userInformation.userSettings) &&
                Objects.equals(userStatus, userInformation.userStatus) &&
                Objects.equals(userType, userInformation.userType) &&
                Objects.equals(workAddress, userInformation.workAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountManagementGranular, activationAccessCode, createdDateTime, customSettings, email, enableConnectForUser, errorDetails, firstName, forgottenPasswordInfo, groupList, homeAddress, initialsImageUri, isAdmin, lastLogin, lastName, loginStatus, middleName, password, passwordExpiration, permissionProfileId, permissionProfileName, profileImageUri, sendActivationOnInvalidLogin, signatureImageUri, suffixName, title, uri, userId, userName, userProfileLastModifiedDate, userSettings, userStatus, userType, workAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserInformation {\n");

        sb.append("    accountManagementGranular: ").append(toIndentedString(accountManagementGranular)).append("\n");
        sb.append("    activationAccessCode: ").append(toIndentedString(activationAccessCode)).append("\n");
        sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
        sb.append("    customSettings: ").append(toIndentedString(customSettings)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    enableConnectForUser: ").append(toIndentedString(enableConnectForUser)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    forgottenPasswordInfo: ").append(toIndentedString(forgottenPasswordInfo)).append("\n");
        sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
        sb.append("    homeAddress: ").append(toIndentedString(homeAddress)).append("\n");
        sb.append("    initialsImageUri: ").append(toIndentedString(initialsImageUri)).append("\n");
        sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
        sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    loginStatus: ").append(toIndentedString(loginStatus)).append("\n");
        sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    passwordExpiration: ").append(toIndentedString(passwordExpiration)).append("\n");
        sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
        sb.append("    permissionProfileName: ").append(toIndentedString(permissionProfileName)).append("\n");
        sb.append("    profileImageUri: ").append(toIndentedString(profileImageUri)).append("\n");
        sb.append("    sendActivationOnInvalidLogin: ").append(toIndentedString(sendActivationOnInvalidLogin)).append("\n");
        sb.append("    signatureImageUri: ").append(toIndentedString(signatureImageUri)).append("\n");
        sb.append("    suffixName: ").append(toIndentedString(suffixName)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userProfileLastModifiedDate: ").append(toIndentedString(userProfileLastModifiedDate)).append("\n");
        sb.append("    userSettings: ").append(toIndentedString(userSettings)).append("\n");
        sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    workAddress: ").append(toIndentedString(workAddress)).append("\n");
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
