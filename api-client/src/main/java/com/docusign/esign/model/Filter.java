package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class Filter implements Serializable {

    @SerializedName("actionRequired")
    private String actionRequired = null;

    @SerializedName("expires")
    private String expires = null;

    @SerializedName("folderIds")
    private String folderIds = null;

    @SerializedName("fromDateTime")
    private String fromDateTime = null;

    @SerializedName("isTemplate")
    private String isTemplate = null;

    @SerializedName("order")
    private String order = null;

    @SerializedName("orderBy")
    private String orderBy = null;

    @SerializedName("searchTarget")
    private String searchTarget = null;

    @SerializedName("searchText")
    private String searchText = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("toDateTime")
    private String toDateTime = null;


    /**
     * Access token information.
     **/
    @ApiModelProperty(value = "Access token information.")
    public String getActionRequired() {
        return actionRequired;
    }

    public void setActionRequired(String actionRequired) {
        this.actionRequired = actionRequired;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getFolderIds() {
        return folderIds;
    }

    public void setFolderIds(String folderIds) {
        this.folderIds = folderIds;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getFromDateTime() {
        return fromDateTime;
    }

    public void setFromDateTime(String fromDateTime) {
        this.fromDateTime = fromDateTime;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(String isTemplate) {
        this.isTemplate = isTemplate;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSearchTarget() {
        return searchTarget;
    }

    public void setSearchTarget(String searchTarget) {
        this.searchTarget = searchTarget;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }


    /**
     * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
     **/
    @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * Must be set to \"bearer\".
     **/
    @ApiModelProperty(value = "Must be set to \"bearer\".")
    public String getToDateTime() {
        return toDateTime;
    }

    public void setToDateTime(String toDateTime) {
        this.toDateTime = toDateTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Filter filter = (Filter) o;
        return Objects.equals(actionRequired, filter.actionRequired) &&
                Objects.equals(expires, filter.expires) &&
                Objects.equals(folderIds, filter.folderIds) &&
                Objects.equals(fromDateTime, filter.fromDateTime) &&
                Objects.equals(isTemplate, filter.isTemplate) &&
                Objects.equals(order, filter.order) &&
                Objects.equals(orderBy, filter.orderBy) &&
                Objects.equals(searchTarget, filter.searchTarget) &&
                Objects.equals(searchText, filter.searchText) &&
                Objects.equals(status, filter.status) &&
                Objects.equals(toDateTime, filter.toDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionRequired, expires, folderIds, fromDateTime, isTemplate, order, orderBy, searchTarget, searchText, status, toDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Filter {\n");

        sb.append("    actionRequired: ").append(toIndentedString(actionRequired)).append("\n");
        sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
        sb.append("    folderIds: ").append(toIndentedString(folderIds)).append("\n");
        sb.append("    fromDateTime: ").append(toIndentedString(fromDateTime)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    searchTarget: ").append(toIndentedString(searchTarget)).append("\n");
        sb.append("    searchText: ").append(toIndentedString(searchText)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    toDateTime: ").append(toIndentedString(toDateTime)).append("\n");
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
