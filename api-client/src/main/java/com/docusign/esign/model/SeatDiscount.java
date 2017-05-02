package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class SeatDiscount implements Serializable {

    @SerializedName("beginSeatCount")
    private String beginSeatCount = null;

    @SerializedName("discountPercent")
    private String discountPercent = null;

    @SerializedName("endSeatCount")
    private String endSeatCount = null;


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getBeginSeatCount() {
        return beginSeatCount;
    }

    public void setBeginSeatCount(String beginSeatCount) {
        this.beginSeatCount = beginSeatCount;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(String discountPercent) {
        this.discountPercent = discountPercent;
    }


    /**
     * Reserved: TBD
     **/
    @ApiModelProperty(value = "Reserved: TBD")
    public String getEndSeatCount() {
        return endSeatCount;
    }

    public void setEndSeatCount(String endSeatCount) {
        this.endSeatCount = endSeatCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SeatDiscount seatDiscount = (SeatDiscount) o;
        return Objects.equals(beginSeatCount, seatDiscount.beginSeatCount) &&
                Objects.equals(discountPercent, seatDiscount.discountPercent) &&
                Objects.equals(endSeatCount, seatDiscount.endSeatCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginSeatCount, discountPercent, endSeatCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SeatDiscount {\n");

        sb.append("    beginSeatCount: ").append(toIndentedString(beginSeatCount)).append("\n");
        sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
        sb.append("    endSeatCount: ").append(toIndentedString(endSeatCount)).append("\n");
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
