package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Description of a page of a document.
 **/
@ApiModel(description = "Description of a page of a document.")
public class Page implements Serializable {

    @SerializedName("dpi")
    private String dpi = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("height")
    private String height = null;

    @SerializedName("imageBytes")
    private String imageBytes = null;

    @SerializedName("mimeType")
    private String mimeType = null;

    @SerializedName("pageId")
    private String pageId = null;

    @SerializedName("sequence")
    private String sequence = null;

    @SerializedName("width")
    private String width = null;


    /**
     * The number of dots per inch used for the page image.
     **/
    @ApiModelProperty(value = "The number of dots per inch used for the page image.")
    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
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
     * Height of the tab in pixels.
     **/
    @ApiModelProperty(value = "Height of the tab in pixels.")
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getImageBytes() {
        return imageBytes;
    }

    public void setImageBytes(String imageBytes) {
        this.imageBytes = imageBytes;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }


    /**
     * Width of the tab in pixels.
     **/
    @ApiModelProperty(value = "Width of the tab in pixels.")
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Page page = (Page) o;
        return Objects.equals(dpi, page.dpi) &&
                Objects.equals(errorDetails, page.errorDetails) &&
                Objects.equals(height, page.height) &&
                Objects.equals(imageBytes, page.imageBytes) &&
                Objects.equals(mimeType, page.mimeType) &&
                Objects.equals(pageId, page.pageId) &&
                Objects.equals(sequence, page.sequence) &&
                Objects.equals(width, page.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dpi, errorDetails, height, imageBytes, mimeType, pageId, sequence, width);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Page {\n");

        sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    imageBytes: ").append(toIndentedString(imageBytes)).append("\n");
        sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
        sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
