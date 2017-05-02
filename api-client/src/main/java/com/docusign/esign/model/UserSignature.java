package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class UserSignature implements Serializable {

    @SerializedName("adoptedDateTime")
    private String adoptedDateTime = null;

    @SerializedName("createdDateTime")
    private String createdDateTime = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("initials150ImageId")
    private String initials150ImageId = null;

    @SerializedName("initialsImageUri")
    private String initialsImageUri = null;

    @SerializedName("isDefault")
    private String isDefault = null;

    @SerializedName("signature150ImageId")
    private String signature150ImageId = null;

    @SerializedName("signatureFont")
    private String signatureFont = null;

    @SerializedName("signatureId")
    private String signatureId = null;

    @SerializedName("signatureImageUri")
    private String signatureImageUri = null;

    @SerializedName("signatureInitials")
    private String signatureInitials = null;

    @SerializedName("signatureName")
    private String signatureName = null;

    @SerializedName("signatureType")
    private String signatureType = null;


    /**
     * The date and time the user adopted their signature.
     **/
    @ApiModelProperty(value = "The date and time the user adopted their signature.")
    public String getAdoptedDateTime() {
        return adoptedDateTime;
    }

    public void setAdoptedDateTime(String adoptedDateTime) {
        this.adoptedDateTime = adoptedDateTime;
    }


    /**
     * Indicates the date and time the item was created.
     **/
    @ApiModelProperty(value = "Indicates the date and time the item was created.")
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
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
    public String getInitials150ImageId() {
        return initials150ImageId;
    }

    public void setInitials150ImageId(String initials150ImageId) {
        this.initials150ImageId = initials150ImageId;
    }


    /**
     * Contains the URI for an endpoint that you can use to retrieve the initials image.
     **/
    @ApiModelProperty(value = "Contains the URI for an endpoint that you can use to retrieve the initials image.")
    public String getInitialsImageUri() {
        return initialsImageUri;
    }

    public void setInitialsImageUri(String initialsImageUri) {
        this.initialsImageUri = initialsImageUri;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSignature150ImageId() {
        return signature150ImageId;
    }

    public void setSignature150ImageId(String signature150ImageId) {
        this.signature150ImageId = signature150ImageId;
    }


    /**
     * The font type for the signature, if the signature is not drawn. The supported font types are:\n\n\"7_DocuSign\", \"1_DocuSign\", \"6_DocuSign\", \"8_DocuSign\", \"3_DocuSign\", \"Mistral\", \"4_DocuSign\", \"2_DocuSign\", \"5_DocuSign\", \"Rage Italic\"\n
     **/
    @ApiModelProperty(value = "The font type for the signature, if the signature is not drawn. The supported font types are:\n\n\"7_DocuSign\", \"1_DocuSign\", \"6_DocuSign\", \"8_DocuSign\", \"3_DocuSign\", \"Mistral\", \"4_DocuSign\", \"2_DocuSign\", \"5_DocuSign\", \"Rage Italic\"\n")
    public String getSignatureFont() {
        return signatureFont;
    }

    public void setSignatureFont(String signatureFont) {
        this.signatureFont = signatureFont;
    }


    /**
     * Specifies the signature ID associated with the signature name. You can use the signature ID in the URI in place of the signature name, and the value stored in the `signatureName` property in the body is used. This allows the use of special characters (such as \"&\", \"<\", \">\") in a the signature name. Note that with each update to signatures, the returned signature ID might change, so the caller will need to trigger off the signature name to get the new signature ID.
     **/
    @ApiModelProperty(value = "Specifies the signature ID associated with the signature name. You can use the signature ID in the URI in place of the signature name, and the value stored in the `signatureName` property in the body is used. This allows the use of special characters (such as \"&\", \"<\", \">\") in a the signature name. Note that with each update to signatures, the returned signature ID might change, so the caller will need to trigger off the signature name to get the new signature ID.")
    public String getSignatureId() {
        return signatureId;
    }

    public void setSignatureId(String signatureId) {
        this.signatureId = signatureId;
    }


    /**
     * Contains the URI for an endpoint that you can use to retrieve the signature image.
     **/
    @ApiModelProperty(value = "Contains the URI for an endpoint that you can use to retrieve the signature image.")
    public String getSignatureImageUri() {
        return signatureImageUri;
    }

    public void setSignatureImageUri(String signatureImageUri) {
        this.signatureImageUri = signatureImageUri;
    }


    /**
     * The initials associated with the signature.
     **/
    @ApiModelProperty(value = " The initials associated with the signature.")
    public String getSignatureInitials() {
        return signatureInitials;
    }

    public void setSignatureInitials(String signatureInitials) {
        this.signatureInitials = signatureInitials;
    }


    /**
     * Specifies the user signature name.
     **/
    @ApiModelProperty(value = "Specifies the user signature name.")
    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserSignature userSignature = (UserSignature) o;
        return Objects.equals(adoptedDateTime, userSignature.adoptedDateTime) &&
                Objects.equals(createdDateTime, userSignature.createdDateTime) &&
                Objects.equals(errorDetails, userSignature.errorDetails) &&
                Objects.equals(initials150ImageId, userSignature.initials150ImageId) &&
                Objects.equals(initialsImageUri, userSignature.initialsImageUri) &&
                Objects.equals(isDefault, userSignature.isDefault) &&
                Objects.equals(signature150ImageId, userSignature.signature150ImageId) &&
                Objects.equals(signatureFont, userSignature.signatureFont) &&
                Objects.equals(signatureId, userSignature.signatureId) &&
                Objects.equals(signatureImageUri, userSignature.signatureImageUri) &&
                Objects.equals(signatureInitials, userSignature.signatureInitials) &&
                Objects.equals(signatureName, userSignature.signatureName) &&
                Objects.equals(signatureType, userSignature.signatureType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adoptedDateTime, createdDateTime, errorDetails, initials150ImageId, initialsImageUri, isDefault, signature150ImageId, signatureFont, signatureId, signatureImageUri, signatureInitials, signatureName, signatureType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserSignature {\n");

        sb.append("    adoptedDateTime: ").append(toIndentedString(adoptedDateTime)).append("\n");
        sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    initials150ImageId: ").append(toIndentedString(initials150ImageId)).append("\n");
        sb.append("    initialsImageUri: ").append(toIndentedString(initialsImageUri)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    signature150ImageId: ").append(toIndentedString(signature150ImageId)).append("\n");
        sb.append("    signatureFont: ").append(toIndentedString(signatureFont)).append("\n");
        sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
        sb.append("    signatureImageUri: ").append(toIndentedString(signatureImageUri)).append("\n");
        sb.append("    signatureInitials: ").append(toIndentedString(signatureInitials)).append("\n");
        sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
        sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
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
