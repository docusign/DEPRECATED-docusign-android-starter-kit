package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class UserSignatureDefinition implements Serializable {

    @SerializedName("signatureFont")
    private String signatureFont = null;

    @SerializedName("signatureId")
    private String signatureId = null;

    @SerializedName("signatureInitials")
    private String signatureInitials = null;

    @SerializedName("signatureName")
    private String signatureName = null;


    /**
     *
     **/
    @ApiModelProperty(value = "")
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
        UserSignatureDefinition userSignatureDefinition = (UserSignatureDefinition) o;
        return Objects.equals(signatureFont, userSignatureDefinition.signatureFont) &&
                Objects.equals(signatureId, userSignatureDefinition.signatureId) &&
                Objects.equals(signatureInitials, userSignatureDefinition.signatureInitials) &&
                Objects.equals(signatureName, userSignatureDefinition.signatureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signatureFont, signatureId, signatureInitials, signatureName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserSignatureDefinition {\n");

        sb.append("    signatureFont: ").append(toIndentedString(signatureFont)).append("\n");
        sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
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
