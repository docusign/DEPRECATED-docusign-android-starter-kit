package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class CloudStorageProviders implements Serializable {

    @SerializedName("storageProviders")
    private java.util.List<CloudStorageProvider> storageProviders = new java.util.ArrayList<CloudStorageProvider>();


    /**
     * An Array containing the storage providers associated with the user.
     **/
    @ApiModelProperty(value = "An Array containing the storage providers associated with the user.")
    public java.util.List<CloudStorageProvider> getStorageProviders() {
        return storageProviders;
    }

    public void setStorageProviders(java.util.List<CloudStorageProvider> storageProviders) {
        this.storageProviders = storageProviders;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloudStorageProviders cloudStorageProviders = (CloudStorageProviders) o;
        return Objects.equals(storageProviders, cloudStorageProviders.storageProviders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageProviders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudStorageProviders {\n");

        sb.append("    storageProviders: ").append(toIndentedString(storageProviders)).append("\n");
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
