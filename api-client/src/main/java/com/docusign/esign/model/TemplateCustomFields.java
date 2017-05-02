package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class TemplateCustomFields implements Serializable {

    @SerializedName("listCustomFields")
    private java.util.List<ListCustomField> listCustomFields = new java.util.ArrayList<ListCustomField>();

    @SerializedName("textCustomFields")
    private java.util.List<TextCustomField> textCustomFields = new java.util.ArrayList<TextCustomField>();


    /**
     * An array of list custom fields.
     **/
    @ApiModelProperty(value = "An array of list custom fields.")
    public java.util.List<ListCustomField> getListCustomFields() {
        return listCustomFields;
    }

    public void setListCustomFields(java.util.List<ListCustomField> listCustomFields) {
        this.listCustomFields = listCustomFields;
    }


    /**
     * An array of text custom fields.
     **/
    @ApiModelProperty(value = "An array of text custom fields.")
    public java.util.List<TextCustomField> getTextCustomFields() {
        return textCustomFields;
    }

    public void setTextCustomFields(java.util.List<TextCustomField> textCustomFields) {
        this.textCustomFields = textCustomFields;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateCustomFields templateCustomFields = (TemplateCustomFields) o;
        return Objects.equals(listCustomFields, templateCustomFields.listCustomFields) &&
                Objects.equals(textCustomFields, templateCustomFields.textCustomFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listCustomFields, textCustomFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateCustomFields {\n");

        sb.append("    listCustomFields: ").append(toIndentedString(listCustomFields)).append("\n");
        sb.append("    textCustomFields: ").append(toIndentedString(textCustomFields)).append("\n");
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
