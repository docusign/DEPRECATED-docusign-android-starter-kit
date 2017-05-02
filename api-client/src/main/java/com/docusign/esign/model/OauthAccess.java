package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class OauthAccess implements Serializable {

    @SerializedName("access_token")
    private String accessToken = null;

    @SerializedName("data")
    private java.util.List<NameValue> data = new java.util.ArrayList<NameValue>();

    @SerializedName("expires_in")
    private String expiresIn = null;

    @SerializedName("refresh_token")
    private String refreshToken = null;

    @SerializedName("scope")
    private String scope = null;

    @SerializedName("token_type")
    private String tokenType = null;


    /**
     * Access token information.
     **/
    @ApiModelProperty(value = "Access token information.")
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<NameValue> getData() {
        return data;
    }

    public void setData(java.util.List<NameValue> data) {
        this.data = data;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }


    /**
     * Must be set to \"api\".
     **/
    @ApiModelProperty(value = "Must be set to \"api\".")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OauthAccess oauthAccess = (OauthAccess) o;
        return Objects.equals(accessToken, oauthAccess.accessToken) &&
                Objects.equals(data, oauthAccess.data) &&
                Objects.equals(expiresIn, oauthAccess.expiresIn) &&
                Objects.equals(refreshToken, oauthAccess.refreshToken) &&
                Objects.equals(scope, oauthAccess.scope) &&
                Objects.equals(tokenType, oauthAccess.tokenType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, data, expiresIn, refreshToken, scope, tokenType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OauthAccess {\n");

        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
        sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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
