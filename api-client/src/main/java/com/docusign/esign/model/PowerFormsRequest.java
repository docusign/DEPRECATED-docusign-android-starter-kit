package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class PowerFormsRequest implements Serializable {

    @SerializedName("powerForms")
    private java.util.List<PowerForm> powerForms = new java.util.ArrayList<PowerForm>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<PowerForm> getPowerForms() {
        return powerForms;
    }

    public void setPowerForms(java.util.List<PowerForm> powerForms) {
        this.powerForms = powerForms;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PowerFormsRequest powerFormsRequest = (PowerFormsRequest) o;
        return Objects.equals(powerForms, powerFormsRequest.powerForms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerForms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PowerFormsRequest {\n");

        sb.append("    powerForms: ").append(toIndentedString(powerForms)).append("\n");
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
