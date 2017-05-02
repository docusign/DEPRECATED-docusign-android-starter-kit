package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class SignatureType implements Serializable {

    @SerializedName("isDefault")
    private String isDefault = null;

    @SerializedName("type")
    private String type = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SignatureType signatureType = (SignatureType) o;
        return Objects.equals(isDefault, signatureType.isDefault) &&
                Objects.equals(type, signatureType.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDefault, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignatureType {\n");

        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
