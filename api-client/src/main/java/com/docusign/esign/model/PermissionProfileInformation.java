package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PermissionProfileInformation implements Serializable {

    @SerializedName("permissionProfiles")
    private java.util.List<PermissionProfile> permissionProfiles = new java.util.ArrayList<PermissionProfile>();


    /**
     * A complex type containing a collection of permission profiles.
     **/
    @ApiModelProperty(value = "A complex type containing a collection of permission profiles.")
    public java.util.List<PermissionProfile> getPermissionProfiles() {
        return permissionProfiles;
    }

    public void setPermissionProfiles(java.util.List<PermissionProfile> permissionProfiles) {
        this.permissionProfiles = permissionProfiles;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PermissionProfileInformation permissionProfileInformation = (PermissionProfileInformation) o;
        return Objects.equals(permissionProfiles, permissionProfileInformation.permissionProfiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionProfiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionProfileInformation {\n");

        sb.append("    permissionProfiles: ").append(toIndentedString(permissionProfiles)).append("\n");
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
