package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class TabMetadataList implements Serializable {

    @SerializedName("tabs")
    private java.util.List<TabMetadata> tabs = new java.util.ArrayList<TabMetadata>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<TabMetadata> getTabs() {
        return tabs;
    }

    public void setTabs(java.util.List<TabMetadata> tabs) {
        this.tabs = tabs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TabMetadataList tabMetadataList = (TabMetadataList) o;
        return Objects.equals(tabs, tabMetadataList.tabs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tabs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TabMetadataList {\n");

        sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
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
