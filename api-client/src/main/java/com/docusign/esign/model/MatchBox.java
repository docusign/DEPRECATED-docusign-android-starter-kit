package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class MatchBox implements Serializable {

    @SerializedName("height")
    private Integer height = null;

    @SerializedName("pageNumber")
    private Integer pageNumber = null;

    @SerializedName("width")
    private Integer width = null;

    @SerializedName("xPosition")
    private Integer xPosition = null;

    @SerializedName("yPosition")
    private Integer yPosition = null;


    /**
     * Height of the tab in pixels.
     **/
    @ApiModelProperty(value = "Height of the tab in pixels.")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }


    /**
     * Specifies the page number on which the tab is located.
     **/
    @ApiModelProperty(value = "Specifies the page number on which the tab is located.")
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Width of the tab in pixels.
     **/
    @ApiModelProperty(value = "Width of the tab in pixels.")
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }


    /**
     * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.
     **/
    @ApiModelProperty(value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
    public Integer getXPosition() {
        return xPosition;
    }

    public void setXPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }


    /**
     * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
     **/
    @ApiModelProperty(value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
    public Integer getYPosition() {
        return yPosition;
    }

    public void setYPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MatchBox matchBox = (MatchBox) o;
        return Objects.equals(height, matchBox.height) &&
                Objects.equals(pageNumber, matchBox.pageNumber) &&
                Objects.equals(width, matchBox.width) &&
                Objects.equals(xPosition, matchBox.xPosition) &&
                Objects.equals(yPosition, matchBox.yPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, pageNumber, width, xPosition, yPosition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MatchBox {\n");

        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
        sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
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
