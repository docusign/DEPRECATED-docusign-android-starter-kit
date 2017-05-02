package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PostTransactionsResponse implements Serializable {

    @SerializedName("documentData")
    private String documentData = null;

    @SerializedName("transactionSid")
    private String transactionSid = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDocumentData() {
        return documentData;
    }

    public void setDocumentData(String documentData) {
        this.documentData = documentData;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTransactionSid() {
        return transactionSid;
    }

    public void setTransactionSid(String transactionSid) {
        this.transactionSid = transactionSid;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostTransactionsResponse postTransactionsResponse = (PostTransactionsResponse) o;
        return Objects.equals(documentData, postTransactionsResponse.documentData) &&
                Objects.equals(transactionSid, postTransactionsResponse.transactionSid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentData, transactionSid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostTransactionsResponse {\n");

        sb.append("    documentData: ").append(toIndentedString(documentData)).append("\n");
        sb.append("    transactionSid: ").append(toIndentedString(transactionSid)).append("\n");
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
