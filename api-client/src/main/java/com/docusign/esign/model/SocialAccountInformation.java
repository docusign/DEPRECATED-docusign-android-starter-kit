package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class SocialAccountInformation implements Serializable {

    @SerializedName("email")
    private String email = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("provider")
    private String provider = null;

    @SerializedName("socialId")
    private String socialId = null;

    @SerializedName("userName")
    private String userName = null;


    /**
     * The users email address.
     **/
    @ApiModelProperty(value = "The users email address.")
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
     * The social account provider (Facebook, Yahoo, etc.)
     **/
    @ApiModelProperty(value = "The social account provider (Facebook, Yahoo, etc.)")
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }


    /**
     * The ID provided by the Socal Account.
     **/
    @ApiModelProperty(value = "The ID provided by the Socal Account.")
    public String getSocialId() {
        return socialId;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }


    /**
     * The full user name for the account.
     **/
    @ApiModelProperty(value = "The full user name for the account.")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SocialAccountInformation socialAccountInformation = (SocialAccountInformation) o;
        return Objects.equals(email, socialAccountInformation.email) &&
                Objects.equals(errorDetails, socialAccountInformation.errorDetails) &&
                Objects.equals(provider, socialAccountInformation.provider) &&
                Objects.equals(socialId, socialAccountInformation.socialId) &&
                Objects.equals(userName, socialAccountInformation.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, errorDetails, provider, socialId, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SocialAccountInformation {\n");

        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    socialId: ").append(toIndentedString(socialId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
