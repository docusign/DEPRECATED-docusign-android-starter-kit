package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ENoteConfiguration implements Serializable {

    @SerializedName("connectConfigured")
    private String connectConfigured = null;

    @SerializedName("eNoteConfigured")
    private String eNoteConfigured = null;

    @SerializedName("organization")
    private String organization = null;

    @SerializedName("password")
    private String password = null;

    @SerializedName("userName")
    private String userName = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getConnectConfigured() {
        return connectConfigured;
    }

    public void setConnectConfigured(String connectConfigured) {
        this.connectConfigured = connectConfigured;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getENoteConfigured() {
        return eNoteConfigured;
    }

    public void setENoteConfigured(String eNoteConfigured) {
        this.eNoteConfigured = eNoteConfigured;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
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
        ENoteConfiguration eNoteConfiguration = (ENoteConfiguration) o;
        return Objects.equals(connectConfigured, eNoteConfiguration.connectConfigured) &&
                Objects.equals(eNoteConfigured, eNoteConfiguration.eNoteConfigured) &&
                Objects.equals(organization, eNoteConfiguration.organization) &&
                Objects.equals(password, eNoteConfiguration.password) &&
                Objects.equals(userName, eNoteConfiguration.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectConfigured, eNoteConfigured, organization, password, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ENoteConfiguration {\n");

        sb.append("    connectConfigured: ").append(toIndentedString(connectConfigured)).append("\n");
        sb.append("    eNoteConfigured: ").append(toIndentedString(eNoteConfigured)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
