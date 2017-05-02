package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class NewUsersSummary implements Serializable {

    @SerializedName("newUsers")
    private java.util.List<NewUser> newUsers = new java.util.ArrayList<NewUser>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<NewUser> getNewUsers() {
        return newUsers;
    }

    public void setNewUsers(java.util.List<NewUser> newUsers) {
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
        NewUsersSummary newUsersSummary = (NewUsersSummary) o;
        return Objects.equals(newUsers, newUsersSummary.newUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewUsersSummary {\n");

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
