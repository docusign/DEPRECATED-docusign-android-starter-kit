package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class UserSocialIdResult implements Serializable {

    @SerializedName("socialAccountInformation")
    private java.util.List<SocialAccountInformation> socialAccountInformation = new java.util.ArrayList<SocialAccountInformation>();

    @SerializedName("userId")
    private String userId = null;


    /**
     * Contains properties that map a DocuSign user to a social account (Facebook, Yahoo, etc.)
     **/
    @ApiModelProperty(value = "Contains properties that map a DocuSign user to a social account (Facebook, Yahoo, etc.)")
    public java.util.List<SocialAccountInformation> getSocialAccountInformation() {
        return socialAccountInformation;
    }

    public void setSocialAccountInformation(java.util.List<SocialAccountInformation> socialAccountInformation) {
        this.socialAccountInformation = socialAccountInformation;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserSocialIdResult userSocialIdResult = (UserSocialIdResult) o;
        return Objects.equals(socialAccountInformation, userSocialIdResult.socialAccountInformation) &&
                Objects.equals(userId, userSocialIdResult.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socialAccountInformation, userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserSocialIdResult {\n");

        sb.append("    socialAccountInformation: ").append(toIndentedString(socialAccountInformation)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
