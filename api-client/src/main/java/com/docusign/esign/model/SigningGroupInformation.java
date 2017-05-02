package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class SigningGroupInformation implements Serializable {

    @SerializedName("groups")
    private java.util.List<SigningGroup> groups = new java.util.ArrayList<SigningGroup>();


    /**
     * A collection group objects containing information about the groups returned.
     **/
    @ApiModelProperty(value = "A collection group objects containing information about the groups returned.")
    public java.util.List<SigningGroup> getGroups() {
        return groups;
    }

    public void setGroups(java.util.List<SigningGroup> groups) {
        this.groups = groups;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SigningGroupInformation signingGroupInformation = (SigningGroupInformation) o;
        return Objects.equals(groups, signingGroupInformation.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SigningGroupInformation {\n");

        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
