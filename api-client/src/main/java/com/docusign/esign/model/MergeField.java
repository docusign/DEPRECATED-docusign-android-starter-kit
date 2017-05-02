package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information for transfering values between Salesforce data fields and DocuSign Tabs.
 **/
@ApiModel(description = "Contains information for transfering values between Salesforce data fields and DocuSign Tabs.")
public class MergeField implements Serializable {

    @SerializedName("allowSenderToEdit")
    private String allowSenderToEdit = null;

    @SerializedName("configurationType")
    private String configurationType = null;

    @SerializedName("path")
    private String path = null;

    @SerializedName("row")
    private String row = null;

    @SerializedName("writeBack")
    private String writeBack = null;


    /**
     * When set to **true**, the sender can modify the value of the custom tab during the sending process.
     **/
    @ApiModelProperty(value = "When set to **true**, the sender can modify the value of the custom tab during the sending process.")
    public String getAllowSenderToEdit() {
        return allowSenderToEdit;
    }

    public void setAllowSenderToEdit(String allowSenderToEdit) {
        this.allowSenderToEdit = allowSenderToEdit;
    }


    /**
     * If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.
     **/
    @ApiModelProperty(value = "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
    public String getConfigurationType() {
        return configurationType;
    }

    public void setConfigurationType(String configurationType) {
        this.configurationType = configurationType;
    }


    /**
     * Sets the object associated with the custom tab. Currently this is the Salesforce Object.
     **/
    @ApiModelProperty(value = "Sets the object associated with the custom tab. Currently this is the Salesforce Object.")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    /**
     * Specifies the row number in a Salesforce table that the merge field value corresponds to.
     **/
    @ApiModelProperty(value = "Specifies the row number in a Salesforce table that the merge field value corresponds to.")
    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }


    /**
     * When wet to true, the information entered in the tab automatically updates the related Salesforce data when an envelope is completed.
     **/
    @ApiModelProperty(value = "When wet to true, the information entered in the tab automatically updates the related Salesforce data when an envelope is completed.")
    public String getWriteBack() {
        return writeBack;
    }

    public void setWriteBack(String writeBack) {
        this.writeBack = writeBack;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MergeField mergeField = (MergeField) o;
        return Objects.equals(allowSenderToEdit, mergeField.allowSenderToEdit) &&
                Objects.equals(configurationType, mergeField.configurationType) &&
                Objects.equals(path, mergeField.path) &&
                Objects.equals(row, mergeField.row) &&
                Objects.equals(writeBack, mergeField.writeBack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowSenderToEdit, configurationType, path, row, writeBack);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeField {\n");

        sb.append("    allowSenderToEdit: ").append(toIndentedString(allowSenderToEdit)).append("\n");
        sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    row: ").append(toIndentedString(row)).append("\n");
        sb.append("    writeBack: ").append(toIndentedString(writeBack)).append("\n");
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
