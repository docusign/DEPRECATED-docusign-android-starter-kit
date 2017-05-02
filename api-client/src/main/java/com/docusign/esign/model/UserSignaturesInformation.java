package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class UserSignaturesInformation implements Serializable {

    @SerializedName("userSignatures")
    private java.util.List<UserSignature> userSignatures = new java.util.ArrayList<UserSignature>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<UserSignature> getUserSignatures() {
        return userSignatures;
    }

    public void setUserSignatures(java.util.List<UserSignature> userSignatures) {
        this.userSignatures = userSignatures;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserSignaturesInformation userSignaturesInformation = (UserSignaturesInformation) o;
        return Objects.equals(userSignatures, userSignaturesInformation.userSignatures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userSignatures);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserSignaturesInformation {\n");

        sb.append("    userSignatures: ").append(toIndentedString(userSignatures)).append("\n");
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
