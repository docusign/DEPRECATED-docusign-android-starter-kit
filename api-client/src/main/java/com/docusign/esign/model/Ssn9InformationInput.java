package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class Ssn9InformationInput implements Serializable {

    @SerializedName("displayLevelCode")
    private String displayLevelCode = null;

    @SerializedName("ssn9")
    private String ssn9 = null;


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
     * The recipient's Social Security Number(SSN).
     **/
    @ApiModelProperty(value = " The recipient's Social Security Number(SSN).")
    public String getSsn9() {
        return ssn9;
    }

    public void setSsn9(String ssn9) {
        this.ssn9 = ssn9;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ssn9InformationInput ssn9InformationInput = (Ssn9InformationInput) o;
        return Objects.equals(displayLevelCode, ssn9InformationInput.displayLevelCode) &&
                Objects.equals(ssn9, ssn9InformationInput.ssn9);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayLevelCode, ssn9);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Ssn9InformationInput {\n");

        sb.append("    displayLevelCode: ").append(toIndentedString(displayLevelCode)).append("\n");
        sb.append("    ssn9: ").append(toIndentedString(ssn9)).append("\n");
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
