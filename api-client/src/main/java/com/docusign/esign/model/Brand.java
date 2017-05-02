package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class Brand implements Serializable {

    @SerializedName("brandCompany")
    private String brandCompany = null;

    @SerializedName("brandId")
    private String brandId = null;

    @SerializedName("brandName")
    private String brandName = null;

    @SerializedName("colors")
    private java.util.List<NameValue> colors = new java.util.ArrayList<NameValue>();

    @SerializedName("emailContent")
    private java.util.List<BrandEmailContent> emailContent = new java.util.ArrayList<BrandEmailContent>();

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("isOverridingCompanyName")
    private String isOverridingCompanyName = null;

    @SerializedName("isSendingDefault")
    private String isSendingDefault = null;

    @SerializedName("isSigningDefault")
    private String isSigningDefault = null;

    @SerializedName("landingPages")
    private java.util.List<NameValue> landingPages = new java.util.ArrayList<NameValue>();

    @SerializedName("links")
    private java.util.List<BrandLink> links = new java.util.ArrayList<BrandLink>();

    @SerializedName("logos")
    private BrandLogos logos = null;

    @SerializedName("resources")
    private BrandResourceUrls resources = null;


    /**
     * The name of the company associated with this brand.
     **/
    @ApiModelProperty(value = "The name of the company associated with this brand.")
    public String getBrandCompany() {
        return brandCompany;
    }

    public void setBrandCompany(String brandCompany) {
        this.brandCompany = brandCompany;
    }


    /**
     * The ID used to identify a specific brand in API calls.
     **/
    @ApiModelProperty(value = "The ID used to identify a specific brand in API calls.")
    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }


    /**
     * The name of the brand.
     **/
    @ApiModelProperty(value = "The name of the brand.")
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<NameValue> getColors() {
        return colors;
    }

    public void setColors(java.util.List<NameValue> colors) {
        this.colors = colors;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<BrandEmailContent> getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(java.util.List<BrandEmailContent> emailContent) {
        this.emailContent = emailContent;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsOverridingCompanyName() {
        return isOverridingCompanyName;
    }

    public void setIsOverridingCompanyName(String isOverridingCompanyName) {
        this.isOverridingCompanyName = isOverridingCompanyName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsSendingDefault() {
        return isSendingDefault;
    }

    public void setIsSendingDefault(String isSendingDefault) {
        this.isSendingDefault = isSendingDefault;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsSigningDefault() {
        return isSigningDefault;
    }

    public void setIsSigningDefault(String isSigningDefault) {
        this.isSigningDefault = isSigningDefault;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<NameValue> getLandingPages() {
        return landingPages;
    }

    public void setLandingPages(java.util.List<NameValue> landingPages) {
        this.landingPages = landingPages;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<BrandLink> getLinks() {
        return links;
    }

    public void setLinks(java.util.List<BrandLink> links) {
        this.links = links;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public BrandLogos getLogos() {
        return logos;
    }

    public void setLogos(BrandLogos logos) {
        this.logos = logos;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public BrandResourceUrls getResources() {
        return resources;
    }

    public void setResources(BrandResourceUrls resources) {
        this.resources = resources;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Brand brand = (Brand) o;
        return Objects.equals(brandCompany, brand.brandCompany) &&
                Objects.equals(brandId, brand.brandId) &&
                Objects.equals(brandName, brand.brandName) &&
                Objects.equals(colors, brand.colors) &&
                Objects.equals(emailContent, brand.emailContent) &&
                Objects.equals(errorDetails, brand.errorDetails) &&
                Objects.equals(isOverridingCompanyName, brand.isOverridingCompanyName) &&
                Objects.equals(isSendingDefault, brand.isSendingDefault) &&
                Objects.equals(isSigningDefault, brand.isSigningDefault) &&
                Objects.equals(landingPages, brand.landingPages) &&
                Objects.equals(links, brand.links) &&
                Objects.equals(logos, brand.logos) &&
                Objects.equals(resources, brand.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandCompany, brandId, brandName, colors, emailContent, errorDetails, isOverridingCompanyName, isSendingDefault, isSigningDefault, landingPages, links, logos, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Brand {\n");

        sb.append("    brandCompany: ").append(toIndentedString(brandCompany)).append("\n");
        sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
        sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
        sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
        sb.append("    emailContent: ").append(toIndentedString(emailContent)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    isOverridingCompanyName: ").append(toIndentedString(isOverridingCompanyName)).append("\n");
        sb.append("    isSendingDefault: ").append(toIndentedString(isSendingDefault)).append("\n");
        sb.append("    isSigningDefault: ").append(toIndentedString(isSigningDefault)).append("\n");
        sb.append("    landingPages: ").append(toIndentedString(landingPages)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    logos: ").append(toIndentedString(logos)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
