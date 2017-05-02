package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ExternalFile implements Serializable {

    @SerializedName("date")
    private String date = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("img")
    private String img = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("size")
    private String size = null;

    @SerializedName("supported")
    private String supported = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("uri")
    private String uri = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSupported() {
        return supported;
    }

    public void setSupported(String supported) {
        this.supported = supported;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalFile externalFile = (ExternalFile) o;
        return Objects.equals(date, externalFile.date) &&
                Objects.equals(id, externalFile.id) &&
                Objects.equals(img, externalFile.img) &&
                Objects.equals(name, externalFile.name) &&
                Objects.equals(size, externalFile.size) &&
                Objects.equals(supported, externalFile.supported) &&
                Objects.equals(type, externalFile.type) &&
                Objects.equals(uri, externalFile.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, id, img, name, size, supported, type, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalFile {\n");

        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    img: ").append(toIndentedString(img)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
