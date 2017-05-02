package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class UserProfile implements Serializable {

    @SerializedName("address")
    private AddressInformationV2 address = null;

    @SerializedName("authenticationMethods")
    private java.util.List<AuthenticationMethod> authenticationMethods = new java.util.ArrayList<AuthenticationMethod>();

    @SerializedName("companyName")
    private String companyName = null;

    @SerializedName("displayOrganizationInfo")
    private String displayOrganizationInfo = null;

    @SerializedName("displayPersonalInfo")
    private String displayPersonalInfo = null;

    @SerializedName("displayProfile")
    private String displayProfile = null;

    @SerializedName("displayUsageHistory")
    private String displayUsageHistory = null;

    @SerializedName("profileImageUri")
    private String profileImageUri = null;

    @SerializedName("title")
    private String title = null;

    @SerializedName("usageHistory")
    private UsageHistory usageHistory = null;

    @SerializedName("userDetails")
    private UserInformation userDetails = null;

    @SerializedName("userProfileLastModifiedDate")
    private String userProfileLastModifiedDate = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public AddressInformationV2 getAddress() {
        return address;
    }

    public void setAddress(AddressInformationV2 address) {
        this.address = address;
    }


    /**
     * These properties cannot be modified in the PUT. \n\nIndicates the authentication methods used by the user.
     **/
    @ApiModelProperty(value = "These properties cannot be modified in the PUT. \n\nIndicates the authentication methods used by the user.")
    public java.util.List<AuthenticationMethod> getAuthenticationMethods() {
        return authenticationMethods;
    }

    public void setAuthenticationMethods(java.util.List<AuthenticationMethod> authenticationMethods) {
        this.authenticationMethods = authenticationMethods;
    }


    /**
     * The name of the user's Company.
     **/
    @ApiModelProperty(value = "The name of the user's Company.")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * When set to **true**, the user's company and title information are shown on the ID card.
     **/
    @ApiModelProperty(value = " When set to **true**, the user's company and title information are shown on the ID card. ")
    public String getDisplayOrganizationInfo() {
        return displayOrganizationInfo;
    }

    public void setDisplayOrganizationInfo(String displayOrganizationInfo) {
        this.displayOrganizationInfo = displayOrganizationInfo;
    }


    /**
     * When set to **true**, the user's Address and Phone number are shown on the ID card.
     **/
    @ApiModelProperty(value = "When set to **true**, the user's Address and Phone number are shown on the ID card.")
    public String getDisplayPersonalInfo() {
        return displayPersonalInfo;
    }

    public void setDisplayPersonalInfo(String displayPersonalInfo) {
        this.displayPersonalInfo = displayPersonalInfo;
    }


    /**
     * When set to **true**, the user's ID card can be viewed from signed documents and envelope history.
     **/
    @ApiModelProperty(value = "When set to **true**, the user's ID card can be viewed from signed documents and envelope history.")
    public String getDisplayProfile() {
        return displayProfile;
    }

    public void setDisplayProfile(String displayProfile) {
        this.displayProfile = displayProfile;
    }


    /**
     * When set to **true**, the user's usage information is shown on the ID card.
     **/
    @ApiModelProperty(value = "When set to **true**, the user's usage information is shown on the ID card.")
    public String getDisplayUsageHistory() {
        return displayUsageHistory;
    }

    public void setDisplayUsageHistory(String displayUsageHistory) {
        this.displayUsageHistory = displayUsageHistory;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public UsageHistory getUsageHistory() {
        return usageHistory;
    }

    public void setUsageHistory(UsageHistory usageHistory) {
        this.usageHistory = usageHistory;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public UserInformation getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserInformation userDetails) {
        this.userDetails = userDetails;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserProfile userProfile = (UserProfile) o;
        return Objects.equals(address, userProfile.address) &&
                Objects.equals(authenticationMethods, userProfile.authenticationMethods) &&
                Objects.equals(companyName, userProfile.companyName) &&
                Objects.equals(displayOrganizationInfo, userProfile.displayOrganizationInfo) &&
                Objects.equals(displayPersonalInfo, userProfile.displayPersonalInfo) &&
                Objects.equals(displayProfile, userProfile.displayProfile) &&
                Objects.equals(displayUsageHistory, userProfile.displayUsageHistory) &&
                Objects.equals(profileImageUri, userProfile.profileImageUri) &&
                Objects.equals(title, userProfile.title) &&
                Objects.equals(usageHistory, userProfile.usageHistory) &&
                Objects.equals(userDetails, userProfile.userDetails) &&
                Objects.equals(userProfileLastModifiedDate, userProfile.userProfileLastModifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, authenticationMethods, companyName, displayOrganizationInfo, displayPersonalInfo, displayProfile, displayUsageHistory, profileImageUri, title, usageHistory, userDetails, userProfileLastModifiedDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserProfile {\n");

        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    authenticationMethods: ").append(toIndentedString(authenticationMethods)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    displayOrganizationInfo: ").append(toIndentedString(displayOrganizationInfo)).append("\n");
        sb.append("    displayPersonalInfo: ").append(toIndentedString(displayPersonalInfo)).append("\n");
        sb.append("    displayProfile: ").append(toIndentedString(displayProfile)).append("\n");
        sb.append("    displayUsageHistory: ").append(toIndentedString(displayUsageHistory)).append("\n");
        sb.append("    profileImageUri: ").append(toIndentedString(profileImageUri)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    usageHistory: ").append(toIndentedString(usageHistory)).append("\n");
        sb.append("    userDetails: ").append(toIndentedString(userDetails)).append("\n");
        sb.append("    userProfileLastModifiedDate: ").append(toIndentedString(userProfileLastModifiedDate)).append("\n");
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
