package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BrandResourcesList implements Serializable {

    @SerializedName("resourcesContentTypes")
    private java.util.List<BrandResources> resourcesContentTypes = new java.util.ArrayList<BrandResources>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<BrandResources> getResourcesContentTypes() {
        return resourcesContentTypes;
    }

    public void setResourcesContentTypes(java.util.List<BrandResources> resourcesContentTypes) {
        this.resourcesContentTypes = resourcesContentTypes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandResourcesList brandResourcesList = (BrandResourcesList) o;
        return Objects.equals(resourcesContentTypes, brandResourcesList.resourcesContentTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourcesContentTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandResourcesList {\n");

        sb.append("    resourcesContentTypes: ").append(toIndentedString(resourcesContentTypes)).append("\n");
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
