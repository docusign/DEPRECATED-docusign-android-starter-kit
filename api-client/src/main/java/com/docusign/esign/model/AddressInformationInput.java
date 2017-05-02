package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains address input information.
 **/
@ApiModel(description = "Contains address input information.")
public class AddressInformationInput implements Serializable {

    @SerializedName("addressInformation")
    private AddressInformation addressInformation = null;

    @SerializedName("displayLevelCode")
    private String displayLevelCode = null;

    @SerializedName("receiveInResponse")
    private String receiveInResponse = null;


    /**
     **/
    @ApiModelProperty(value = "")
    public AddressInformation getAddressInformation() {
        return addressInformation;
    }

    public void setAddressInformation(AddressInformation addressInformation) {
        this.addressInformation = addressInformation;
    }


    /**
     * Specifies the display level for the recipient. \nValid values are: \n\n* ReadOnly\n* Editable\n* DoNotDisplay
     **/
    @ApiModelProperty(value = "Specifies the display level for the recipient. \nValid values are: \n\n* ReadOnly\n* Editable\n* DoNotDisplay")
    public String getDisplayLevelCode() {
        return displayLevelCode;
    }

    public void setDisplayLevelCode(String displayLevelCode) {
        this.displayLevelCode = displayLevelCode;
    }


    /**
     * When set to **true**, the information needs to be returned in the response.
     **/
    @ApiModelProperty(value = "When set to **true**, the information needs to be returned in the response.")
    public String getReceiveInResponse() {
        return receiveInResponse;
    }

    public void setReceiveInResponse(String receiveInResponse) {
        this.receiveInResponse = receiveInResponse;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddressInformationInput addressInformationInput = (AddressInformationInput) o;
        return Objects.equals(addressInformation, addressInformationInput.addressInformation) &&
                Objects.equals(displayLevelCode, addressInformationInput.displayLevelCode) &&
                Objects.equals(receiveInResponse, addressInformationInput.receiveInResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressInformation, displayLevelCode, receiveInResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressInformationInput {\n");

        sb.append("    addressInformation: ").append(toIndentedString(addressInformation)).append("\n");
        sb.append("    displayLevelCode: ").append(toIndentedString(displayLevelCode)).append("\n");
        sb.append("    receiveInResponse: ").append(toIndentedString(receiveInResponse)).append("\n");
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
