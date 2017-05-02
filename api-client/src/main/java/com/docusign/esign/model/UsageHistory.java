package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * A complex element consisting of: \n\n* lastSentDateTime \u2013 the date and time the user last sent an envelope. \n* lastSignedDateTime \u2013 the date and time the user last signed an envelope.\n* sentCount \u2013 the number of envelopes the user has sent.\n* signedCount \u2013 the number of envelopes the user has signed.
 **/
@ApiModel(description = "A complex element consisting of: \n\n* lastSentDateTime \u2013 the date and time the user last sent an envelope. \n* lastSignedDateTime \u2013 the date and time the user last signed an envelope.\n* sentCount \u2013 the number of envelopes the user has sent.\n* signedCount \u2013 the number of envelopes the user has signed.")
public class UsageHistory implements Serializable {

    @SerializedName("lastSentDateTime")
    private String lastSentDateTime = null;

    @SerializedName("lastSignedDateTime")
    private String lastSignedDateTime = null;

    @SerializedName("sentCount")
    private Integer sentCount = null;

    @SerializedName("signedCount")
    private Integer signedCount = null;


    /**
     * The date and time the user last sent an envelope.
     **/
    @ApiModelProperty(value = "The date and time the user last sent an envelope. ")
    public String getLastSentDateTime() {
        return lastSentDateTime;
    }

    public void setLastSentDateTime(String lastSentDateTime) {
        this.lastSentDateTime = lastSentDateTime;
    }


    /**
     * The date and time the user last signed an envelope.
     **/
    @ApiModelProperty(value = "The date and time the user last signed an envelope.")
    public String getLastSignedDateTime() {
        return lastSignedDateTime;
    }

    public void setLastSignedDateTime(String lastSignedDateTime) {
        this.lastSignedDateTime = lastSignedDateTime;
    }


    /**
     * The number of envelopes the user has sent.
     **/
    @ApiModelProperty(value = "The number of envelopes the user has sent. ")
    public Integer getSentCount() {
        return sentCount;
    }

    public void setSentCount(Integer sentCount) {
        this.sentCount = sentCount;
    }


    /**
     * The number of envelopes the user has signed.
     **/
    @ApiModelProperty(value = "The number of envelopes the user has signed. ")
    public Integer getSignedCount() {
        return signedCount;
    }

    public void setSignedCount(Integer signedCount) {
        this.signedCount = signedCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsageHistory usageHistory = (UsageHistory) o;
        return Objects.equals(lastSentDateTime, usageHistory.lastSentDateTime) &&
                Objects.equals(lastSignedDateTime, usageHistory.lastSignedDateTime) &&
                Objects.equals(sentCount, usageHistory.sentCount) &&
                Objects.equals(signedCount, usageHistory.signedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastSentDateTime, lastSignedDateTime, sentCount, signedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageHistory {\n");

        sb.append("    lastSentDateTime: ").append(toIndentedString(lastSentDateTime)).append("\n");
        sb.append("    lastSignedDateTime: ").append(toIndentedString(lastSignedDateTime)).append("\n");
        sb.append("    sentCount: ").append(toIndentedString(sentCount)).append("\n");
        sb.append("    signedCount: ").append(toIndentedString(signedCount)).append("\n");
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
