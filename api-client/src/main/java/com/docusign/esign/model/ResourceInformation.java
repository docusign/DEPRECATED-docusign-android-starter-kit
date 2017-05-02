package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ResourceInformation implements Serializable {

    @SerializedName("resources")
    private java.util.List<NameValue> resources = new java.util.ArrayList<NameValue>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<NameValue> getResources() {
        return resources;
    }

    public void setResources(java.util.List<NameValue> resources) {
        this.resources = resources;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceInformation resourceInformation = (ResourceInformation) o;
        return Objects.equals(resources, resourceInformation.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceInformation {\n");

        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
