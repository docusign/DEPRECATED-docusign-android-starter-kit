package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class RecipientDomain implements Serializable {

    @SerializedName("active")
    private String active = null;

    @SerializedName("domainCode")
    private String domainCode = null;

    @SerializedName("domainName")
    private String domainName = null;

    @SerializedName("recipientDomainId")
    private String recipientDomainId = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDomainCode() {
        return domainCode;
    }

    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getRecipientDomainId() {
        return recipientDomainId;
    }

    public void setRecipientDomainId(String recipientDomainId) {
        this.recipientDomainId = recipientDomainId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecipientDomain recipientDomain = (RecipientDomain) o;
        return Objects.equals(active, recipientDomain.active) &&
                Objects.equals(domainCode, recipientDomain.domainCode) &&
                Objects.equals(domainName, recipientDomain.domainName) &&
                Objects.equals(recipientDomainId, recipientDomain.recipientDomainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, domainCode, domainName, recipientDomainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecipientDomain {\n");

        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    domainCode: ").append(toIndentedString(domainCode)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    recipientDomainId: ").append(toIndentedString(recipientDomainId)).append("\n");
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
