package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class Radio implements Serializable {

    @SerializedName("anchorCaseSensitive")
    private String anchorCaseSensitive = null;

    @SerializedName("anchorHorizontalAlignment")
    private String anchorHorizontalAlignment = null;

    @SerializedName("anchorIgnoreIfNotPresent")
    private String anchorIgnoreIfNotPresent = null;

    @SerializedName("anchorMatchWholeWord")
    private String anchorMatchWholeWord = null;

    @SerializedName("anchorString")
    private String anchorString = null;

    @SerializedName("anchorUnits")
    private String anchorUnits = null;

    @SerializedName("anchorXOffset")
    private String anchorXOffset = null;

    @SerializedName("anchorYOffset")
    private String anchorYOffset = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("locked")
    private String locked = null;

    @SerializedName("pageNumber")
    private String pageNumber = null;

    @SerializedName("required")
    private String required = null;

    @SerializedName("selected")
    private String selected = null;

    @SerializedName("tabId")
    private String tabId = null;

    @SerializedName("tabOrder")
    private String tabOrder = null;

    @SerializedName("value")
    private String value = null;

    @SerializedName("xPosition")
    private String xPosition = null;

    @SerializedName("yPosition")
    private String yPosition = null;


    /**
     * When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.
     **/
    @ApiModelProperty(value = "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
    public String getAnchorCaseSensitive() {
        return anchorCaseSensitive;
    }

    public void setAnchorCaseSensitive(String anchorCaseSensitive) {
        this.anchorCaseSensitive = anchorCaseSensitive;
    }


    /**
     * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.
     **/
    @ApiModelProperty(value = "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
    public String getAnchorHorizontalAlignment() {
        return anchorHorizontalAlignment;
    }

    public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
        this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    }


    /**
     * When set to **true**, this tab is ignored if anchorString is not found in the document.
     **/
    @ApiModelProperty(value = "When set to **true**, this tab is ignored if anchorString is not found in the document.")
    public String getAnchorIgnoreIfNotPresent() {
        return anchorIgnoreIfNotPresent;
    }

    public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
        this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    }


    /**
     * When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.
     **/
    @ApiModelProperty(value = "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
    public String getAnchorMatchWholeWord() {
        return anchorMatchWholeWord;
    }

    public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
        this.anchorMatchWholeWord = anchorMatchWholeWord;
    }


    /**
     * Anchor text information for a radio button.
     **/
    @ApiModelProperty(value = "Anchor text information for a radio button.")
    public String getAnchorString() {
        return anchorString;
    }

    public void setAnchorString(String anchorString) {
        this.anchorString = anchorString;
    }


    /**
     * Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.
     **/
    @ApiModelProperty(value = "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
    public String getAnchorUnits() {
        return anchorUnits;
    }

    public void setAnchorUnits(String anchorUnits) {
        this.anchorUnits = anchorUnits;
    }


    /**
     * Specifies the X axis location of the tab, in achorUnits, relative to the anchorString.
     **/
    @ApiModelProperty(value = "Specifies the X axis location of the tab, in achorUnits, relative to the anchorString.")
    public String getAnchorXOffset() {
        return anchorXOffset;
    }

    public void setAnchorXOffset(String anchorXOffset) {
        this.anchorXOffset = anchorXOffset;
    }


    /**
     * Specifies the Y axis location of the tab, in achorUnits, relative to the anchorString.
     **/
    @ApiModelProperty(value = "Specifies the Y axis location of the tab, in achorUnits, relative to the anchorString.")
    public String getAnchorYOffset() {
        return anchorYOffset;
    }

    public void setAnchorYOffset(String anchorYOffset) {
        this.anchorYOffset = anchorYOffset;
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
     * When set to **true**, the signer cannot change the data of the custom tab.
     **/
    @ApiModelProperty(value = "When set to **true**, the signer cannot change the data of the custom tab.")
    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }


    /**
     * Specifies the page number on which the tab is located.
     **/
    @ApiModelProperty(value = "Specifies the page number on which the tab is located.")
    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * When set to **true**, the signer is required to fill out this tab
     **/
    @ApiModelProperty(value = "When set to **true**, the signer is required to fill out this tab")
    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }


    /**
     * When set to **true**, the radio button is selected.
     **/
    @ApiModelProperty(value = "When set to **true**, the radio button is selected.")
    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }


    /**
     * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call]. \n\n \n
     **/
    @ApiModelProperty(value = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call]. \n\n \n")
    public String getTabId() {
        return tabId;
    }

    public void setTabId(String tabId) {
        this.tabId = tabId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTabOrder() {
        return tabOrder;
    }

    public void setTabOrder(String tabOrder) {
        this.tabOrder = tabOrder;
    }


    /**
     * Specifies the value of the tab.
     **/
    @ApiModelProperty(value = "Specifies the value of the tab. ")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    /**
     * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.
     **/
    @ApiModelProperty(value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
    public String getXPosition() {
        return xPosition;
    }

    public void setXPosition(String xPosition) {
        this.xPosition = xPosition;
    }


    /**
     * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
     **/
    @ApiModelProperty(value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
    public String getYPosition() {
        return yPosition;
    }

    public void setYPosition(String yPosition) {
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
        Radio radio = (Radio) o;
        return Objects.equals(anchorCaseSensitive, radio.anchorCaseSensitive) &&
                Objects.equals(anchorHorizontalAlignment, radio.anchorHorizontalAlignment) &&
                Objects.equals(anchorIgnoreIfNotPresent, radio.anchorIgnoreIfNotPresent) &&
                Objects.equals(anchorMatchWholeWord, radio.anchorMatchWholeWord) &&
                Objects.equals(anchorString, radio.anchorString) &&
                Objects.equals(anchorUnits, radio.anchorUnits) &&
                Objects.equals(anchorXOffset, radio.anchorXOffset) &&
                Objects.equals(anchorYOffset, radio.anchorYOffset) &&
                Objects.equals(errorDetails, radio.errorDetails) &&
                Objects.equals(locked, radio.locked) &&
                Objects.equals(pageNumber, radio.pageNumber) &&
                Objects.equals(required, radio.required) &&
                Objects.equals(selected, radio.selected) &&
                Objects.equals(tabId, radio.tabId) &&
                Objects.equals(tabOrder, radio.tabOrder) &&
                Objects.equals(value, radio.value) &&
                Objects.equals(xPosition, radio.xPosition) &&
                Objects.equals(yPosition, radio.yPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anchorCaseSensitive, anchorHorizontalAlignment, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorString, anchorUnits, anchorXOffset, anchorYOffset, errorDetails, locked, pageNumber, required, selected, tabId, tabOrder, value, xPosition, yPosition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Radio {\n");

        sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
        sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
        sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
        sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
        sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
        sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
        sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
        sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
        sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
        sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
