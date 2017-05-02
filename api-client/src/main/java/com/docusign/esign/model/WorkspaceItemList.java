package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Provides properties that describe the items contained in a workspace.
 **/
@ApiModel(description = "Provides properties that describe the items contained in a workspace.")
public class WorkspaceItemList implements Serializable {

    @SerializedName("items")
    private java.util.List<WorkspaceItem> items = new java.util.ArrayList<WorkspaceItem>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<WorkspaceItem> getItems() {
        return items;
    }

    public void setItems(java.util.List<WorkspaceItem> items) {
        this.items = items;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkspaceItemList workspaceItemList = (WorkspaceItemList) o;
        return Objects.equals(items, workspaceItemList.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkspaceItemList {\n");

        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
