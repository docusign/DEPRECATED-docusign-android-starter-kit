package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information about an attachment.
 **/
@ApiModel(description = "Contains information about an attachment.")
public class Attachment implements Serializable {

    @SerializedName("accessControl")
    private String accessControl = null;

    @SerializedName("attachmentId")
    private String attachmentId = null;

    @SerializedName("attachmentType")
    private String attachmentType = null;

    @SerializedName("data")
    private String data = null;

    @SerializedName("label")
    private String label = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("remoteUrl")
    private String remoteUrl = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(String accessControl) {
        this.accessControl = accessControl;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }


    /**
     * Specifies the type of the attachment for the recipient.
     **/
    @ApiModelProperty(value = "Specifies the type of the attachment for the recipient.")
    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getRemoteUrl() {
        return remoteUrl;
    }

    public void setRemoteUrl(String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Attachment attachment = (Attachment) o;
        return Objects.equals(accessControl, attachment.accessControl) &&
                Objects.equals(attachmentId, attachment.attachmentId) &&
                Objects.equals(attachmentType, attachment.attachmentType) &&
                Objects.equals(data, attachment.data) &&
                Objects.equals(label, attachment.label) &&
                Objects.equals(name, attachment.name) &&
                Objects.equals(remoteUrl, attachment.remoteUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessControl, attachmentId, attachmentType, data, label, name, remoteUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Attachment {\n");

        sb.append("    accessControl: ").append(toIndentedString(accessControl)).append("\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
        sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remoteUrl: ").append(toIndentedString(remoteUrl)).append("\n");
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
