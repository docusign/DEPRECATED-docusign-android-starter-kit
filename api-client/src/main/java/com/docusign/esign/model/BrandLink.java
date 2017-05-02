package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BrandLink implements Serializable {

    @SerializedName("linkText")
    private String linkText = null;

    @SerializedName("linkType")
    private String linkType = null;

    @SerializedName("showLink")
    private String showLink = null;

    @SerializedName("urlOrMailTo")
    private String urlOrMailTo = null;


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


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getShowLink() {
        return showLink;
    }

    public void setShowLink(String showLink) {
        this.showLink = showLink;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUrlOrMailTo() {
        return urlOrMailTo;
    }

    public void setUrlOrMailTo(String urlOrMailTo) {
        this.urlOrMailTo = urlOrMailTo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandLink brandLink = (BrandLink) o;
        return Objects.equals(linkText, brandLink.linkText) &&
                Objects.equals(linkType, brandLink.linkType) &&
                Objects.equals(showLink, brandLink.showLink) &&
                Objects.equals(urlOrMailTo, brandLink.urlOrMailTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linkText, linkType, showLink, urlOrMailTo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandLink {\n");

        sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
        sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
        sb.append("    showLink: ").append(toIndentedString(showLink)).append("\n");
        sb.append("    urlOrMailTo: ").append(toIndentedString(urlOrMailTo)).append("\n");
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
