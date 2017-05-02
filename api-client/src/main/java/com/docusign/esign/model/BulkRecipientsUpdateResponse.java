package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class BulkRecipientsUpdateResponse implements Serializable {

    @SerializedName("signer")
    private Signer signer = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public Signer getSigner() {
        return signer;
    }

    public void setSigner(Signer signer) {
        this.signer = signer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BulkRecipientsUpdateResponse bulkRecipientsUpdateResponse = (BulkRecipientsUpdateResponse) o;
        return Objects.equals(signer, bulkRecipientsUpdateResponse.signer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkRecipientsUpdateResponse {\n");

        sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
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
