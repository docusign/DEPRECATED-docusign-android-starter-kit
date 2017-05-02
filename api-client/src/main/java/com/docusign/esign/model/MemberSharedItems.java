package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class MemberSharedItems implements Serializable {

    @SerializedName("envelopes")
    private java.util.List<SharedItem> envelopes = new java.util.ArrayList<SharedItem>();

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("templates")
    private java.util.List<TemplateSharedItem> templates = new java.util.ArrayList<TemplateSharedItem>();

    @SerializedName("user")
    private UserInfo user = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<SharedItem> getEnvelopes() {
        return envelopes;
    }

    public void setEnvelopes(java.util.List<SharedItem> envelopes) {
        this.envelopes = envelopes;
    }


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
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<TemplateSharedItem> getTemplates() {
        return templates;
    }

    public void setTemplates(java.util.List<TemplateSharedItem> templates) {
        this.templates = templates;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberSharedItems memberSharedItems = (MemberSharedItems) o;
        return Objects.equals(envelopes, memberSharedItems.envelopes) &&
                Objects.equals(errorDetails, memberSharedItems.errorDetails) &&
                Objects.equals(templates, memberSharedItems.templates) &&
                Objects.equals(user, memberSharedItems.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envelopes, errorDetails, templates, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberSharedItems {\n");

        sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
