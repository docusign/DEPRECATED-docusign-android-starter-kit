package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class ConnectLog implements Serializable {

    @SerializedName("accountId")
    private String accountId = null;

    @SerializedName("configUrl")
    private String configUrl = null;

    @SerializedName("connectDebugLog")
    private java.util.List<ConnectDebugLog> connectDebugLog = new java.util.ArrayList<ConnectDebugLog>();

    @SerializedName("connectId")
    private String connectId = null;

    @SerializedName("created")
    private String created = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("envelopeId")
    private String envelopeId = null;

    @SerializedName("error")
    private String error = null;

    @SerializedName("failureId")
    private String failureId = null;

    @SerializedName("failureUri")
    private String failureUri = null;

    @SerializedName("lastTry")
    private String lastTry = null;

    @SerializedName("logId")
    private String logId = null;

    @SerializedName("logUri")
    private String logUri = null;

    @SerializedName("retryCount")
    private String retryCount = null;

    @SerializedName("retryUri")
    private String retryUri = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("subject")
    private String subject = null;

    @SerializedName("userName")
    private String userName = null;


    /**
     * The account ID associated with the envelope.
     **/
    @ApiModelProperty(value = "The account ID associated with the envelope.")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    /**
     * The web address of the listener or Retrieving Service end point for Connect.
     **/
    @ApiModelProperty(value = "The web address of the listener or Retrieving Service end point for Connect.")
    public String getConfigUrl() {
        return configUrl;
    }

    public void setConfigUrl(String configUrl) {
        this.configUrl = configUrl;
    }


    /**
     * A complex element containing information about the Connect configuration, error details, date/time, description and payload.\n\nThis is only included in the response if the query additional_info=true is used.
     **/
    @ApiModelProperty(value = "A complex element containing information about the Connect configuration, error details, date/time, description and payload.\n\nThis is only included in the response if the query additional_info=true is used.")
    public java.util.List<ConnectDebugLog> getConnectDebugLog() {
        return connectDebugLog;
    }

    public void setConnectDebugLog(java.util.List<ConnectDebugLog> connectDebugLog) {
        this.connectDebugLog = connectDebugLog;
    }


    /**
     * The identifier for the Connect configuration that failed. If an account has multiple Connect configurations, this value is used to look up the Connect configuration for the failed post.
     **/
    @ApiModelProperty(value = "The identifier for the Connect configuration that failed. If an account has multiple Connect configurations, this value is used to look up the Connect configuration for the failed post.")
    public String getConnectId() {
        return connectId;
    }

    public void setConnectId(String connectId) {
        this.connectId = connectId;
    }


    /**
     * The date and time the entry was created.
     **/
    @ApiModelProperty(value = "The date and time the entry was created.")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }


    /**
     * The email that sent the envelope.
     **/
    @ApiModelProperty(value = "The email that sent the envelope.")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * The envelope ID of the envelope status that failed to post.
     **/
    @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }


    /**
     * The error that caused the Connect post to fail.
     **/
    @ApiModelProperty(value = "The error that caused the Connect post to fail.")
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }


    /**
     * The failure log ID for the failure.
     **/
    @ApiModelProperty(value = "The failure log ID for the failure.")
    public String getFailureId() {
        return failureId;
    }

    public void setFailureId(String failureId) {
        this.failureId = failureId;
    }


    /**
     * The URI for the failure.
     **/
    @ApiModelProperty(value = "The URI for the failure.")
    public String getFailureUri() {
        return failureUri;
    }

    public void setFailureUri(String failureUri) {
        this.failureUri = failureUri;
    }


    /**
     * The date and time the last attempt to post.
     **/
    @ApiModelProperty(value = "The date and time the last attempt to post.")
    public String getLastTry() {
        return lastTry;
    }

    public void setLastTry(String lastTry) {
        this.lastTry = lastTry;
    }


    /**
     * The Connect log ID for the entry.
     **/
    @ApiModelProperty(value = "The Connect log ID for the entry.")
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }


    /**
     * The URI for the log item.
     **/
    @ApiModelProperty(value = "The URI for the log item.")
    public String getLogUri() {
        return logUri;
    }

    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }


    /**
     * The number of times the Connect post has been retried.
     **/
    @ApiModelProperty(value = "The number of times the Connect post has been retried.")
    public String getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(String retryCount) {
        this.retryCount = retryCount;
    }


    /**
     * The UEI to retry to publish the Connect failure.
     **/
    @ApiModelProperty(value = "The UEI to retry to publish the Connect failure.")
    public String getRetryUri() {
        return retryUri;
    }

    public void setRetryUri(String retryUri) {
        this.retryUri = retryUri;
    }


    /**
     * The new envelope status for the failed Connect post. The possible values are: Any, Voided, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut, Template, or Processing.
     **/
    @ApiModelProperty(value = "The new envelope status for the failed Connect post. The possible values are: Any, Voided, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut, Template, or Processing.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * The envelope subject.
     **/
    @ApiModelProperty(value = "The envelope subject.")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    /**
     * The name of the envelope sender.
     **/
    @ApiModelProperty(value = "The name of the envelope sender.")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectLog connectLog = (ConnectLog) o;
        return Objects.equals(accountId, connectLog.accountId) &&
                Objects.equals(configUrl, connectLog.configUrl) &&
                Objects.equals(connectDebugLog, connectLog.connectDebugLog) &&
                Objects.equals(connectId, connectLog.connectId) &&
                Objects.equals(created, connectLog.created) &&
                Objects.equals(email, connectLog.email) &&
                Objects.equals(envelopeId, connectLog.envelopeId) &&
                Objects.equals(error, connectLog.error) &&
                Objects.equals(failureId, connectLog.failureId) &&
                Objects.equals(failureUri, connectLog.failureUri) &&
                Objects.equals(lastTry, connectLog.lastTry) &&
                Objects.equals(logId, connectLog.logId) &&
                Objects.equals(logUri, connectLog.logUri) &&
                Objects.equals(retryCount, connectLog.retryCount) &&
                Objects.equals(retryUri, connectLog.retryUri) &&
                Objects.equals(status, connectLog.status) &&
                Objects.equals(subject, connectLog.subject) &&
                Objects.equals(userName, connectLog.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, configUrl, connectDebugLog, connectId, created, email, envelopeId, error, failureId, failureUri, lastTry, logId, logUri, retryCount, retryUri, status, subject, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectLog {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    configUrl: ").append(toIndentedString(configUrl)).append("\n");
        sb.append("    connectDebugLog: ").append(toIndentedString(connectDebugLog)).append("\n");
        sb.append("    connectId: ").append(toIndentedString(connectId)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    failureId: ").append(toIndentedString(failureId)).append("\n");
        sb.append("    failureUri: ").append(toIndentedString(failureUri)).append("\n");
        sb.append("    lastTry: ").append(toIndentedString(lastTry)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
        sb.append("    logUri: ").append(toIndentedString(logUri)).append("\n");
        sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
        sb.append("    retryUri: ").append(toIndentedString(retryUri)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
