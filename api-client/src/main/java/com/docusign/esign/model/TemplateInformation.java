package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class TemplateInformation implements Serializable {

    @SerializedName("templates")
    private java.util.List<TemplateSummary> templates = new java.util.ArrayList<TemplateSummary>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<TemplateSummary> getTemplates() {
        return templates;
    }

    public void setTemplates(java.util.List<TemplateSummary> templates) {
        this.templates = templates;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateInformation templateInformation = (TemplateInformation) o;
        return Objects.equals(templates, templateInformation.templates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateInformation {\n");

        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
