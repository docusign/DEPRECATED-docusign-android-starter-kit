package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Reserved for DocuSign use.
 **/
@ApiModel(description = "Reserved for DocuSign use.")
public class OfflineAttributes implements Serializable {

    @SerializedName("accountEsignId")
    private String accountEsignId = null;

    @SerializedName("deviceModel")
    private String deviceModel = null;

    @SerializedName("deviceName")
    private String deviceName = null;

    @SerializedName("gpsLatitude")
    private String gpsLatitude = null;

    @SerializedName("gpsLongitude")
    private String gpsLongitude = null;

    @SerializedName("offlineSigningHash")
    private String offlineSigningHash = null;


    /**
     * A GUID identifying the account associated with the consumer disclosure
     **/
    @ApiModelProperty(value = "A GUID identifying the account associated with the consumer disclosure")
    public String getAccountEsignId() {
        return accountEsignId;
    }

    public void setAccountEsignId(String accountEsignId) {
        this.accountEsignId = accountEsignId;
    }


    /**
     * A string containing information about the model of the device used for offline signing.
     **/
    @ApiModelProperty(value = "A string containing information about the model of the device used for offline signing.")
    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }


    /**
     * A string containing information about the type of device used for offline signing.
     **/
    @ApiModelProperty(value = "A string containing information about the type of device used for offline signing.")
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * A string containing the latitude of the device location at the time of signing.
     **/
    @ApiModelProperty(value = "A string containing the latitude of the device location at the time of signing.")
    public String getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsLatitude(String gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }


    /**
     * A string containing the longitude of the device location at the time of signing.
     **/
    @ApiModelProperty(value = "A string containing the longitude of the device location at the time of signing.")
    public String getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(String gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getOfflineSigningHash() {
        return offlineSigningHash;
    }

    public void setOfflineSigningHash(String offlineSigningHash) {
        this.offlineSigningHash = offlineSigningHash;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OfflineAttributes offlineAttributes = (OfflineAttributes) o;
        return Objects.equals(accountEsignId, offlineAttributes.accountEsignId) &&
                Objects.equals(deviceModel, offlineAttributes.deviceModel) &&
                Objects.equals(deviceName, offlineAttributes.deviceName) &&
                Objects.equals(gpsLatitude, offlineAttributes.gpsLatitude) &&
                Objects.equals(gpsLongitude, offlineAttributes.gpsLongitude) &&
                Objects.equals(offlineSigningHash, offlineAttributes.offlineSigningHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountEsignId, deviceModel, deviceName, gpsLatitude, gpsLongitude, offlineSigningHash);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfflineAttributes {\n");

        sb.append("    accountEsignId: ").append(toIndentedString(accountEsignId)).append("\n");
        sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    gpsLatitude: ").append(toIndentedString(gpsLatitude)).append("\n");
        sb.append("    gpsLongitude: ").append(toIndentedString(gpsLongitude)).append("\n");
        sb.append("    offlineSigningHash: ").append(toIndentedString(offlineSigningHash)).append("\n");
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
