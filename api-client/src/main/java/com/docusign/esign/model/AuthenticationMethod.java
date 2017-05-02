package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information about the method used for authentication.
 **/
@ApiModel(description = "Contains information about the method used for authentication.")
public class AuthenticationMethod implements Serializable {

    @SerializedName("authenticationType")
    private String authenticationType = null;

    @SerializedName("lastProvider")
    private String lastProvider = null;

    @SerializedName("lastTimestamp")
    private String lastTimestamp = null;

    @SerializedName("totalCount")
    private Integer totalCount = null;


    /**
     * Indicates the type of authentication. Valid values are: PhoneAuth, STAN, ISCheck, OFAC, AccessCode, AgeVerify, or SSOAuth.
     **/
    @ApiModelProperty(value = "Indicates the type of authentication. Valid values are: PhoneAuth, STAN, ISCheck, OFAC, AccessCode, AgeVerify, or SSOAuth. ")
    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }


    /**
     * The last provider that authenticated the user.
     **/
    @ApiModelProperty(value = "The last provider that authenticated the user. ")
    public String getLastProvider() {
        return lastProvider;
    }

    public void setLastProvider(String lastProvider) {
        this.lastProvider = lastProvider;
    }


    /**
     * The data and time the user last used the authentication method.
     **/
    @ApiModelProperty(value = " The data and time the user last used the authentication method. ")
    public String getLastTimestamp() {
        return lastTimestamp;
    }

    public void setLastTimestamp(String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
    }


    /**
     * The number of times the authentication method was used.
     **/
    @ApiModelProperty(value = "The number of times the authentication method was used. ")
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthenticationMethod authenticationMethod = (AuthenticationMethod) o;
        return Objects.equals(authenticationType, authenticationMethod.authenticationType) &&
                Objects.equals(lastProvider, authenticationMethod.lastProvider) &&
                Objects.equals(lastTimestamp, authenticationMethod.lastTimestamp) &&
                Objects.equals(totalCount, authenticationMethod.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationType, lastProvider, lastTimestamp, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthenticationMethod {\n");

        sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
        sb.append("    lastProvider: ").append(toIndentedString(lastProvider)).append("\n");
        sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
