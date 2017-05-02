package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BrandResources implements Serializable {

    @SerializedName("createdByUserInfo")
    private UserInfo createdByUserInfo = null;

    @SerializedName("createdDate")
    private String createdDate = null;

    @SerializedName("modifiedByUserInfo")
    private UserInfo modifiedByUserInfo = null;

    @SerializedName("modifiedDate")
    private String modifiedDate = null;

    @SerializedName("modifiedTemplates")
    private java.util.List<String> modifiedTemplates = new java.util.ArrayList<String>();

    @SerializedName("resourcesContentType")
    private String resourcesContentType = null;

    @SerializedName("resourcesContentUri")
    private String resourcesContentUri = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public UserInfo getCreatedByUserInfo() {
        return createdByUserInfo;
    }

    public void setCreatedByUserInfo(UserInfo createdByUserInfo) {
        this.createdByUserInfo = createdByUserInfo;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public UserInfo getModifiedByUserInfo() {
        return modifiedByUserInfo;
    }

    public void setModifiedByUserInfo(UserInfo modifiedByUserInfo) {
        this.modifiedByUserInfo = modifiedByUserInfo;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<String> getModifiedTemplates() {
        return modifiedTemplates;
    }

    public void setModifiedTemplates(java.util.List<String> modifiedTemplates) {
        this.modifiedTemplates = modifiedTemplates;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getResourcesContentType() {
        return resourcesContentType;
    }

    public void setResourcesContentType(String resourcesContentType) {
        this.resourcesContentType = resourcesContentType;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getResourcesContentUri() {
        return resourcesContentUri;
    }

    public void setResourcesContentUri(String resourcesContentUri) {
        this.resourcesContentUri = resourcesContentUri;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandResources brandResources = (BrandResources) o;
        return Objects.equals(createdByUserInfo, brandResources.createdByUserInfo) &&
                Objects.equals(createdDate, brandResources.createdDate) &&
                Objects.equals(modifiedByUserInfo, brandResources.modifiedByUserInfo) &&
                Objects.equals(modifiedDate, brandResources.modifiedDate) &&
                Objects.equals(modifiedTemplates, brandResources.modifiedTemplates) &&
                Objects.equals(resourcesContentType, brandResources.resourcesContentType) &&
                Objects.equals(resourcesContentUri, brandResources.resourcesContentUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdByUserInfo, createdDate, modifiedByUserInfo, modifiedDate, modifiedTemplates, resourcesContentType, resourcesContentUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandResources {\n");

        sb.append("    createdByUserInfo: ").append(toIndentedString(createdByUserInfo)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    modifiedByUserInfo: ").append(toIndentedString(modifiedByUserInfo)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    modifiedTemplates: ").append(toIndentedString(modifiedTemplates)).append("\n");
        sb.append("    resourcesContentType: ").append(toIndentedString(resourcesContentType)).append("\n");
        sb.append("    resourcesContentUri: ").append(toIndentedString(resourcesContentUri)).append("\n");
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
