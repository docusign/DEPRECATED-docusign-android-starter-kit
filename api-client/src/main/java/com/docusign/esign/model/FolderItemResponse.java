package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class FolderItemResponse implements Serializable {

    @SerializedName("endPosition")
    private String endPosition = null;

    @SerializedName("folderItems")
    private java.util.List<FolderItemV2> folderItems = new java.util.ArrayList<FolderItemV2>();

    @SerializedName("nextUri")
    private String nextUri = null;

    @SerializedName("previousUri")
    private String previousUri = null;

    @SerializedName("resultSetSize")
    private String resultSetSize = null;

    @SerializedName("startPosition")
    private String startPosition = null;

    @SerializedName("totalRows")
    private String totalRows = null;


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
     * A list of the envelopes in the specified folder or folders.
     **/
    @ApiModelProperty(value = "A list of the envelopes in the specified folder or folders. ")
    public java.util.List<FolderItemV2> getFolderItems() {
        return folderItems;
    }

    public void setFolderItems(java.util.List<FolderItemV2> folderItems) {
        this.folderItems = folderItems;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(String totalRows) {
        this.totalRows = totalRows;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FolderItemResponse folderItemResponse = (FolderItemResponse) o;
        return Objects.equals(endPosition, folderItemResponse.endPosition) &&
                Objects.equals(folderItems, folderItemResponse.folderItems) &&
                Objects.equals(nextUri, folderItemResponse.nextUri) &&
                Objects.equals(previousUri, folderItemResponse.previousUri) &&
                Objects.equals(resultSetSize, folderItemResponse.resultSetSize) &&
                Objects.equals(startPosition, folderItemResponse.startPosition) &&
                Objects.equals(totalRows, folderItemResponse.totalRows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endPosition, folderItems, nextUri, previousUri, resultSetSize, startPosition, totalRows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FolderItemResponse {\n");

        sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
        sb.append("    folderItems: ").append(toIndentedString(folderItems)).append("\n");
        sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
        sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
        sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
        sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
        sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
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
