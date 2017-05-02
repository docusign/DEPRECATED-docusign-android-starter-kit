package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BrandEmailContent implements Serializable {

    @SerializedName("content")
    private String content = null;

    @SerializedName("emailContentType")
    private String emailContentType = null;

    @SerializedName("emailToLink")
    private String emailToLink = null;

    @SerializedName("linkText")
    private String linkText = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEmailContentType() {
        return emailContentType;
    }

    public void setEmailContentType(String emailContentType) {
        this.emailContentType = emailContentType;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getEmailToLink() {
        return emailToLink;
    }

    public void setEmailToLink(String emailToLink) {
        this.emailToLink = emailToLink;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getLinkText() {
        return linkText;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandEmailContent brandEmailContent = (BrandEmailContent) o;
        return Objects.equals(content, brandEmailContent.content) &&
                Objects.equals(emailContentType, brandEmailContent.emailContentType) &&
                Objects.equals(emailToLink, brandEmailContent.emailToLink) &&
                Objects.equals(linkText, brandEmailContent.linkText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, emailContentType, emailToLink, linkText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandEmailContent {\n");

        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    emailContentType: ").append(toIndentedString(emailContentType)).append("\n");
        sb.append("    emailToLink: ").append(toIndentedString(emailToLink)).append("\n");
        sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
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
