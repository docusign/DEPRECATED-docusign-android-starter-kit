package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PostTransactionsRequest implements Serializable {

    @SerializedName("documentData")
    private String documentData = null;

    @SerializedName("dptName")
    private String dptName = null;

    @SerializedName("transactionName")
    private String transactionName = null;

    @SerializedName("transactionTypeName")
    private String transactionTypeName = null;


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
    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getTransactionTypeName() {
        return transactionTypeName;
    }

    public void setTransactionTypeName(String transactionTypeName) {
        this.transactionTypeName = transactionTypeName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostTransactionsRequest postTransactionsRequest = (PostTransactionsRequest) o;
        return Objects.equals(documentData, postTransactionsRequest.documentData) &&
                Objects.equals(dptName, postTransactionsRequest.dptName) &&
                Objects.equals(transactionName, postTransactionsRequest.transactionName) &&
                Objects.equals(transactionTypeName, postTransactionsRequest.transactionTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentData, dptName, transactionName, transactionTypeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostTransactionsRequest {\n");

        sb.append("    documentData: ").append(toIndentedString(documentData)).append("\n");
        sb.append("    dptName: ").append(toIndentedString(dptName)).append("\n");
        sb.append("    transactionName: ").append(toIndentedString(transactionName)).append("\n");
        sb.append("    transactionTypeName: ").append(toIndentedString(transactionTypeName)).append("\n");
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
