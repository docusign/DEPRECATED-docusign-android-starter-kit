package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Contains information about an account address.
 **/
@ApiModel(description = "Contains information about an account address.")
public class AccountAddress implements Serializable {

    @SerializedName("address1")
    private String address1 = null;

    @SerializedName("address2")
    private String address2 = null;

    @SerializedName("city")
    private String city = null;

    @SerializedName("country")
    private String country = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("fax")
    private String fax = null;

    @SerializedName("firstName")
    private String firstName = null;

    @SerializedName("lastName")
    private String lastName = null;

    @SerializedName("phone")
    private String phone = null;

    @SerializedName("postalCode")
    private String postalCode = null;

    @SerializedName("state")
    private String state = null;

    @SerializedName("supportedCountries")
    private java.util.List<Country> supportedCountries = new java.util.ArrayList<Country>();


    /**
     * First Line of the address.\nMaximum length: 100 characters.
     **/
    @ApiModelProperty(value = "First Line of the address.\nMaximum length: 100 characters.")
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }


    /**
     * Second Line of the address.\nMaximum length: 100 characters.
     **/
    @ApiModelProperty(value = "Second Line of the address.\nMaximum length: 100 characters.")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }


    /**
     * The city value of the address.
     **/
    @ApiModelProperty(value = "The city value of the address.")
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
     *
     **/
    @ApiModelProperty(value = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }


    /**
     * The user\u2019s first name. \nMaximum Length: 50 characters.
     **/
    @ApiModelProperty(value = "The user\u2019s first name. \nMaximum Length: 50 characters.")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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
     * Contains an array of countries supported by the billing plan.
     **/
    @ApiModelProperty(value = "Contains an array of countries supported by the billing plan.")
    public java.util.List<Country> getSupportedCountries() {
        return supportedCountries;
    }

    public void setSupportedCountries(java.util.List<Country> supportedCountries) {
        this.supportedCountries = supportedCountries;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountAddress accountAddress = (AccountAddress) o;
        return Objects.equals(address1, accountAddress.address1) &&
                Objects.equals(address2, accountAddress.address2) &&
                Objects.equals(city, accountAddress.city) &&
                Objects.equals(country, accountAddress.country) &&
                Objects.equals(email, accountAddress.email) &&
                Objects.equals(fax, accountAddress.fax) &&
                Objects.equals(firstName, accountAddress.firstName) &&
                Objects.equals(lastName, accountAddress.lastName) &&
                Objects.equals(phone, accountAddress.phone) &&
                Objects.equals(postalCode, accountAddress.postalCode) &&
                Objects.equals(state, accountAddress.state) &&
                Objects.equals(supportedCountries, accountAddress.supportedCountries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address1, address2, city, country, email, fax, firstName, lastName, phone, postalCode, state, supportedCountries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountAddress {\n");

        sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
        sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    supportedCountries: ").append(toIndentedString(supportedCountries)).append("\n");
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
