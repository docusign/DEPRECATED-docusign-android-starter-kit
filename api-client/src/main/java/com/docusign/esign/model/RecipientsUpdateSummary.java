package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class RecipientsUpdateSummary implements Serializable {

    @SerializedName("recipientUpdateResults")
    private java.util.List<RecipientUpdateResponse> recipientUpdateResults = new java.util.ArrayList<RecipientUpdateResponse>();


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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecipientsUpdateSummary recipientsUpdateSummary = (RecipientsUpdateSummary) o;
        return Objects.equals(recipientUpdateResults, recipientsUpdateSummary.recipientUpdateResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipientUpdateResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecipientsUpdateSummary {\n");

        sb.append("    recipientUpdateResults: ").append(toIndentedString(recipientUpdateResults)).append("\n");
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
