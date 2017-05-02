package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeTemplateResults implements Serializable {

    @SerializedName("endPosition")
    private String endPosition = null;

    @SerializedName("envelopeTemplates")
    private java.util.List<EnvelopeTemplateResult> envelopeTemplates = new java.util.ArrayList<EnvelopeTemplateResult>();

    @SerializedName("folders")
    private java.util.List<Folder> folders = new java.util.ArrayList<Folder>();

    @SerializedName("nextUri")
    private String nextUri = null;

    @SerializedName("previousUri")
    private String previousUri = null;

    @SerializedName("resultSetSize")
    private String resultSetSize = null;

    @SerializedName("startPosition")
    private String startPosition = null;

    @SerializedName("totalSetSize")
    private String totalSetSize = null;


    /**
     * The last position in the result set.
     **/
    @ApiModelProperty(value = "The last position in the result set. ")
    public String getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(String endPosition) {
        this.endPosition = endPosition;
    }


    /**
     * The list of requested templates.
     **/
    @ApiModelProperty(value = "The list of requested templates.")
    public java.util.List<EnvelopeTemplateResult> getEnvelopeTemplates() {
        return envelopeTemplates;
    }

    public void setEnvelopeTemplates(java.util.List<EnvelopeTemplateResult> envelopeTemplates) {
        this.envelopeTemplates = envelopeTemplates;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(java.util.List<Folder> folders) {
        this.folders = folders;
    }


    /**
     * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null.
     **/
    @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
    public String getNextUri() {
        return nextUri;
    }

    public void setNextUri(String nextUri) {
        this.nextUri = nextUri;
    }


    /**
     * The postal code for the billing address.
     **/
    @ApiModelProperty(value = "The postal code for the billing address.")
    public String getPreviousUri() {
        return previousUri;
    }

    public void setPreviousUri(String previousUri) {
        this.previousUri = previousUri;
    }


    /**
     * The number of results returned in this response.
     **/
    @ApiModelProperty(value = "The number of results returned in this response. ")
    public String getResultSetSize() {
        return resultSetSize;
    }

    public void setResultSetSize(String resultSetSize) {
        this.resultSetSize = resultSetSize;
    }


    /**
     * Starting position of the current result set.
     **/
    @ApiModelProperty(value = "Starting position of the current result set.")
    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }


    /**
     * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
     **/
    @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
    public String getTotalSetSize() {
        return totalSetSize;
    }

    public void setTotalSetSize(String totalSetSize) {
        this.totalSetSize = totalSetSize;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeTemplateResults envelopeTemplateResults = (EnvelopeTemplateResults) o;
        return Objects.equals(endPosition, envelopeTemplateResults.endPosition) &&
                Objects.equals(envelopeTemplates, envelopeTemplateResults.envelopeTemplates) &&
                Objects.equals(folders, envelopeTemplateResults.folders) &&
                Objects.equals(nextUri, envelopeTemplateResults.nextUri) &&
                Objects.equals(previousUri, envelopeTemplateResults.previousUri) &&
                Objects.equals(resultSetSize, envelopeTemplateResults.resultSetSize) &&
                Objects.equals(startPosition, envelopeTemplateResults.startPosition) &&
                Objects.equals(totalSetSize, envelopeTemplateResults.totalSetSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endPosition, envelopeTemplates, folders, nextUri, previousUri, resultSetSize, startPosition, totalSetSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeTemplateResults {\n");

        sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
        sb.append("    envelopeTemplates: ").append(toIndentedString(envelopeTemplates)).append("\n");
        sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
        sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
        sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
        sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
        sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
        sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
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
