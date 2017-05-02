package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BrandLogos implements Serializable {

    @SerializedName("email")
    private String email = null;

    @SerializedName("primary")
    private String primary = null;

    @SerializedName("secondary")
    private String secondary = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSecondary() {
        return secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandLogos brandLogos = (BrandLogos) o;
        return Objects.equals(email, brandLogos.email) &&
                Objects.equals(primary, brandLogos.primary) &&
                Objects.equals(secondary, brandLogos.secondary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, primary, secondary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandLogos {\n");

        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
        sb.append("    secondary: ").append(toIndentedString(secondary)).append("\n");
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
