package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class NewUsersDefinition implements Serializable {

    @SerializedName("newUsers")
    private java.util.List<UserInformation> newUsers = new java.util.ArrayList<UserInformation>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<UserInformation> getNewUsers() {
        return newUsers;
    }

    public void setNewUsers(java.util.List<UserInformation> newUsers) {
        this.newUsers = newUsers;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NewUsersDefinition newUsersDefinition = (NewUsersDefinition) o;
        return Objects.equals(newUsers, newUsersDefinition.newUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewUsersDefinition {\n");

        sb.append("    newUsers: ").append(toIndentedString(newUsers)).append("\n");
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
