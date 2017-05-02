package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class TemplateMatch implements Serializable {

    @SerializedName("documentEndPage")
    private String documentEndPage = null;

    @SerializedName("documentStartPage")
    private String documentStartPage = null;

    @SerializedName("matchPercentage")
    private String matchPercentage = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDocumentEndPage() {
        return documentEndPage;
    }

    public void setDocumentEndPage(String documentEndPage) {
        this.documentEndPage = documentEndPage;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDocumentStartPage() {
        return documentStartPage;
    }

    public void setDocumentStartPage(String documentStartPage) {
        this.documentStartPage = documentStartPage;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getMatchPercentage() {
        return matchPercentage;
    }

    public void setMatchPercentage(String matchPercentage) {
        this.matchPercentage = matchPercentage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateMatch templateMatch = (TemplateMatch) o;
        return Objects.equals(documentEndPage, templateMatch.documentEndPage) &&
                Objects.equals(documentStartPage, templateMatch.documentStartPage) &&
                Objects.equals(matchPercentage, templateMatch.matchPercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentEndPage, documentStartPage, matchPercentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateMatch {\n");

        sb.append("    documentEndPage: ").append(toIndentedString(documentEndPage)).append("\n");
        sb.append("    documentStartPage: ").append(toIndentedString(documentStartPage)).append("\n");
        sb.append("    matchPercentage: ").append(toIndentedString(matchPercentage)).append("\n");
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
