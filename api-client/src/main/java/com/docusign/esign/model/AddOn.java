package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information about add ons.
 **/
@ApiModel(description = "Contains information about add ons.")
public class AddOn implements Serializable {

    @SerializedName("active")
    private String active = null;

    @SerializedName("addOnId")
    private String addOnId = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("name")
    private String name = null;


    /**
     * Reserved:
     **/
    @ApiModelProperty(value = "Reserved:")
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }


    /**
     * Reserved:
     **/
    @ApiModelProperty(value = "Reserved:")
    public String getAddOnId() {
        return addOnId;
    }

    public void setAddOnId(String addOnId) {
        this.addOnId = addOnId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    /**
     * Reserved:
     **/
    @ApiModelProperty(value = "Reserved:")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddOn addOn = (AddOn) o;
        return Objects.equals(active, addOn.active) &&
                Objects.equals(addOnId, addOn.addOnId) &&
                Objects.equals(id, addOn.id) &&
                Objects.equals(name, addOn.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, addOnId, id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOn {\n");

        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    addOnId: ").append(toIndentedString(addOnId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
