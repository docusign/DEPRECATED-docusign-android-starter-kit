package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ServiceVersion implements Serializable {

    @SerializedName("version")
    private String version = null;

    @SerializedName("versionUrl")
    private String versionUrl = null;


    /**
     * The version of the rest API.
     **/
    @ApiModelProperty(value = "The version of the rest API.")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getVersionUrl() {
        return versionUrl;
    }

    public void setVersionUrl(String versionUrl) {
        this.versionUrl = versionUrl;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceVersion serviceVersion = (ServiceVersion) o;
        return Objects.equals(version, serviceVersion.version) &&
                Objects.equals(versionUrl, serviceVersion.versionUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, versionUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceVersion {\n");

        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionUrl: ").append(toIndentedString(versionUrl)).append("\n");
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
