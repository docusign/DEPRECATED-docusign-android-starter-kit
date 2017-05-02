package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Allows the sender to pre-specify the signature name, signature initials and signature font used in the signature stamp for the recipient.\n\nUsed only with recipient types In Person Signers and Signers.
 **/
@ApiModel(description = "Allows the sender to pre-specify the signature name, signature initials and signature font used in the signature stamp for the recipient.\n\nUsed only with recipient types In Person Signers and Signers.")
public class RecipientSignatureInformation implements Serializable {

    @SerializedName("fontStyle")
    private String fontStyle = null;

    @SerializedName("signatureInitials")
    private String signatureInitials = null;

    @SerializedName("signatureName")
    private String signatureName = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecipientSignatureInformation recipientSignatureInformation = (RecipientSignatureInformation) o;
        return Objects.equals(fontStyle, recipientSignatureInformation.fontStyle) &&
                Objects.equals(signatureInitials, recipientSignatureInformation.signatureInitials) &&
                Objects.equals(signatureName, recipientSignatureInformation.signatureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fontStyle, signatureInitials, signatureName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecipientSignatureInformation {\n");

        sb.append("    fontStyle: ").append(toIndentedString(fontStyle)).append("\n");
        sb.append("    signatureInitials: ").append(toIndentedString(signatureInitials)).append("\n");
        sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
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
