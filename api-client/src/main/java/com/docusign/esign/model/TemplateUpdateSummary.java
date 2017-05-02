package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class TemplateUpdateSummary implements Serializable {

    @SerializedName("bulkEnvelopeStatus")
    private BulkEnvelopeStatus bulkEnvelopeStatus = null;

    @SerializedName("envelopeId")
    private String envelopeId = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("listCustomFieldUpdateResults")
    private java.util.List<ListCustomField> listCustomFieldUpdateResults = new java.util.ArrayList<ListCustomField>();

    @SerializedName("lockInformation")
    private LockInformation lockInformation = null;

    @SerializedName("recipientUpdateResults")
    private java.util.List<RecipientUpdateResponse> recipientUpdateResults = new java.util.ArrayList<RecipientUpdateResponse>();

    @SerializedName("tabUpdateResults")
    private Tabs tabUpdateResults = null;

    @SerializedName("textCustomFieldUpdateResults")
    private java.util.List<TextCustomField> textCustomFieldUpdateResults = new java.util.ArrayList<TextCustomField>();


    /**
     **/
    @ApiModelProperty(value = "")
    public BulkEnvelopeStatus getBulkEnvelopeStatus() {
        return bulkEnvelopeStatus;
    }

    public void setBulkEnvelopeStatus(BulkEnvelopeStatus bulkEnvelopeStatus) {
        this.bulkEnvelopeStatus = bulkEnvelopeStatus;
    }


    /**
     * The envelope ID of the envelope status that failed to post.
     **/
    @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
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
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<ListCustomField> getListCustomFieldUpdateResults() {
        return listCustomFieldUpdateResults;
    }

    public void setListCustomFieldUpdateResults(java.util.List<ListCustomField> listCustomFieldUpdateResults) {
        this.listCustomFieldUpdateResults = listCustomFieldUpdateResults;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public LockInformation getLockInformation() {
        return lockInformation;
    }

    public void setLockInformation(LockInformation lockInformation) {
        this.lockInformation = lockInformation;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<RecipientUpdateResponse> getRecipientUpdateResults() {
        return recipientUpdateResults;
    }

    public void setRecipientUpdateResults(java.util.List<RecipientUpdateResponse> recipientUpdateResults) {
        this.recipientUpdateResults = recipientUpdateResults;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Tabs getTabUpdateResults() {
        return tabUpdateResults;
    }

    public void setTabUpdateResults(Tabs tabUpdateResults) {
        this.tabUpdateResults = tabUpdateResults;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<TextCustomField> getTextCustomFieldUpdateResults() {
        return textCustomFieldUpdateResults;
    }

    public void setTextCustomFieldUpdateResults(java.util.List<TextCustomField> textCustomFieldUpdateResults) {
        this.textCustomFieldUpdateResults = textCustomFieldUpdateResults;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateUpdateSummary templateUpdateSummary = (TemplateUpdateSummary) o;
        return Objects.equals(bulkEnvelopeStatus, templateUpdateSummary.bulkEnvelopeStatus) &&
                Objects.equals(envelopeId, templateUpdateSummary.envelopeId) &&
                Objects.equals(errorDetails, templateUpdateSummary.errorDetails) &&
                Objects.equals(listCustomFieldUpdateResults, templateUpdateSummary.listCustomFieldUpdateResults) &&
                Objects.equals(lockInformation, templateUpdateSummary.lockInformation) &&
                Objects.equals(recipientUpdateResults, templateUpdateSummary.recipientUpdateResults) &&
                Objects.equals(tabUpdateResults, templateUpdateSummary.tabUpdateResults) &&
                Objects.equals(textCustomFieldUpdateResults, templateUpdateSummary.textCustomFieldUpdateResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkEnvelopeStatus, envelopeId, errorDetails, listCustomFieldUpdateResults, lockInformation, recipientUpdateResults, tabUpdateResults, textCustomFieldUpdateResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateUpdateSummary {\n");

        sb.append("    bulkEnvelopeStatus: ").append(toIndentedString(bulkEnvelopeStatus)).append("\n");
        sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    listCustomFieldUpdateResults: ").append(toIndentedString(listCustomFieldUpdateResults)).append("\n");
        sb.append("    lockInformation: ").append(toIndentedString(lockInformation)).append("\n");
        sb.append("    recipientUpdateResults: ").append(toIndentedString(recipientUpdateResults)).append("\n");
        sb.append("    tabUpdateResults: ").append(toIndentedString(tabUpdateResults)).append("\n");
        sb.append("    textCustomFieldUpdateResults: ").append(toIndentedString(textCustomFieldUpdateResults)).append("\n");
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
