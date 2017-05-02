package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class SigningGroupUsers implements Serializable {

    @SerializedName("users")
    private java.util.List<SigningGroupUser> users = new java.util.ArrayList<SigningGroupUser>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<SigningGroupUser> getUsers() {
        return users;
    }

    public void setUsers(java.util.List<SigningGroupUser> users) {
        this.users = users;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SigningGroupUsers signingGroupUsers = (SigningGroupUsers) o;
        return Objects.equals(users, signingGroupUsers.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SigningGroupUsers {\n");

        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
