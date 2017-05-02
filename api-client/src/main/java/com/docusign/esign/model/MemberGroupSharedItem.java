package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class MemberGroupSharedItem implements Serializable {

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("group")
    private Group group = null;

    @SerializedName("shared")
    private String shared = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }


    /**
     * When set to **true**, this custom tab is shared.
     **/
    @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
    public String getShared() {
        return shared;
    }

    public void setShared(String shared) {
        this.shared = shared;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberGroupSharedItem memberGroupSharedItem = (MemberGroupSharedItem) o;
        return Objects.equals(errorDetails, memberGroupSharedItem.errorDetails) &&
                Objects.equals(group, memberGroupSharedItem.group) &&
                Objects.equals(shared, memberGroupSharedItem.shared);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorDetails, group, shared);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberGroupSharedItem {\n");

        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
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
