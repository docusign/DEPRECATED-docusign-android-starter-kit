package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains address information.
 **/
@ApiModel(description = "Contains address information.")
public class AddressInformation implements Serializable {

    @SerializedName("city")
    private String city = null;

    @SerializedName("country")
    private String country = null;

    @SerializedName("fax")
    private String fax = null;

    @SerializedName("phone")
    private String phone = null;

    @SerializedName("state")
    private String state = null;

    @SerializedName("street1")
    private String street1 = null;

    @SerializedName("street2")
    private String street2 = null;

    @SerializedName("zip")
    private String zip = null;


    /**
     * The city associated with the address.
     **/
    @ApiModelProperty(value = "The city associated with the address.")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Specifies the country associated with the address.
     **/
    @ApiModelProperty(value = "Specifies the country associated with the address.")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * A Fax number associated with the address if one is available.
     **/
    @ApiModelProperty(value = "A Fax number associated with the address if one is available.")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }


    /**
     * A phone number associated with the address.
     **/
    @ApiModelProperty(value = "A phone number associated with the address.")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * The state or province associated with the address.
     **/
    @ApiModelProperty(value = "The state or province associated with the address.")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    /**
     * The first line of the address.
     **/
    @ApiModelProperty(value = "The first line of the address.")
    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }


    /**
     * The second line of the address (optional).
     **/
    @ApiModelProperty(value = "The second line of the address (optional).")
    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }


    /**
     * The zip or postal code associated with the address.
     **/
    @ApiModelProperty(value = "The zip or postal code associated with the address.")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddressInformation addressInformation = (AddressInformation) o;
        return Objects.equals(city, addressInformation.city) &&
                Objects.equals(country, addressInformation.country) &&
                Objects.equals(fax, addressInformation.fax) &&
                Objects.equals(phone, addressInformation.phone) &&
                Objects.equals(state, addressInformation.state) &&
                Objects.equals(street1, addressInformation.street1) &&
                Objects.equals(street2, addressInformation.street2) &&
                Objects.equals(zip, addressInformation.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, fax, phone, state, street1, street2, zip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressInformation {\n");

        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
        sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
        sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
