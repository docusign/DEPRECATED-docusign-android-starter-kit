package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ServiceInformation implements Serializable {

    @SerializedName("buildBranch")
    private String buildBranch = null;

    @SerializedName("buildBranchDeployedDateTime")
    private String buildBranchDeployedDateTime = null;

    @SerializedName("buildSHA")
    private String buildSHA = null;

    @SerializedName("buildVersion")
    private String buildVersion = null;

    @SerializedName("linkedSites")
    private java.util.List<String> linkedSites = new java.util.ArrayList<String>();

    @SerializedName("serviceVersions")
    private java.util.List<ServiceVersion> serviceVersions = new java.util.ArrayList<ServiceVersion>();


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBuildBranch() {
        return buildBranch;
    }

    public void setBuildBranch(String buildBranch) {
        this.buildBranch = buildBranch;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBuildBranchDeployedDateTime() {
        return buildBranchDeployedDateTime;
    }

    public void setBuildBranchDeployedDateTime(String buildBranchDeployedDateTime) {
        this.buildBranchDeployedDateTime = buildBranchDeployedDateTime;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBuildSHA() {
        return buildSHA;
    }

    public void setBuildSHA(String buildSHA) {
        this.buildSHA = buildSHA;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBuildVersion() {
        return buildVersion;
    }

    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<String> getLinkedSites() {
        return linkedSites;
    }

    public void setLinkedSites(java.util.List<String> linkedSites) {
        this.linkedSites = linkedSites;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<ServiceVersion> getServiceVersions() {
        return serviceVersions;
    }

    public void setServiceVersions(java.util.List<ServiceVersion> serviceVersions) {
        this.serviceVersions = serviceVersions;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceInformation serviceInformation = (ServiceInformation) o;
        return Objects.equals(buildBranch, serviceInformation.buildBranch) &&
                Objects.equals(buildBranchDeployedDateTime, serviceInformation.buildBranchDeployedDateTime) &&
                Objects.equals(buildSHA, serviceInformation.buildSHA) &&
                Objects.equals(buildVersion, serviceInformation.buildVersion) &&
                Objects.equals(linkedSites, serviceInformation.linkedSites) &&
                Objects.equals(serviceVersions, serviceInformation.serviceVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildBranch, buildBranchDeployedDateTime, buildSHA, buildVersion, linkedSites, serviceVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceInformation {\n");

        sb.append("    buildBranch: ").append(toIndentedString(buildBranch)).append("\n");
        sb.append("    buildBranchDeployedDateTime: ").append(toIndentedString(buildBranchDeployedDateTime)).append("\n");
        sb.append("    buildSHA: ").append(toIndentedString(buildSHA)).append("\n");
        sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
        sb.append("    linkedSites: ").append(toIndentedString(linkedSites)).append("\n");
        sb.append("    serviceVersions: ").append(toIndentedString(serviceVersions)).append("\n");
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
