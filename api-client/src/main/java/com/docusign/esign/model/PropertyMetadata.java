package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PropertyMetadata implements Serializable {

    @SerializedName("options")
    private java.util.List<String> options = new java.util.ArrayList<String>();

    @SerializedName("rights")
    private String rights = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<String> getOptions() {
        return options;
    }

    public void setOptions(java.util.List<String> options) {
        this.options = options;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertyMetadata propertyMetadata = (PropertyMetadata) o;
        return Objects.equals(options, propertyMetadata.options) &&
                Objects.equals(rights, propertyMetadata.rights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(options, rights);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyMetadata {\n");

        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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
