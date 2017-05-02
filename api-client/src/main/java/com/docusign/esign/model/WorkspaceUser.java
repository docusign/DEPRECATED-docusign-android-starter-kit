package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * A workspaceUser representing the user. This property is only returned in response to user specific GET call.
 **/
@ApiModel(description = "A workspaceUser representing the user. This property is only returned in response to user specific GET call. ")
public class WorkspaceUser implements Serializable {

    @SerializedName("accountId")
    private String accountId = null;

    @SerializedName("accountName")
    private String accountName = null;

    @SerializedName("activeSince")
    private String activeSince = null;

    @SerializedName("created")
    private String created = null;

    @SerializedName("createdById")
    private String createdById = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("errorDetails")
    private ErrorDetails errorDetails = null;

    @SerializedName("lastModified")
    private String lastModified = null;

    @SerializedName("lastModifiedById")
    private String lastModifiedById = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("userId")
    private String userId = null;

    @SerializedName("userName")
    private String userName = null;

    @SerializedName("workspaceId")
    private String workspaceId = null;

    @SerializedName("workspaceUserBaseUrl")
    private String workspaceUserBaseUrl = null;

    @SerializedName("workspaceUserId")
    private String workspaceUserId = null;


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
     * The name of the account that the workspace user belongs to.
     **/
    @ApiModelProperty(value = "The name of the account that the workspace user belongs to.")
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getActiveSince() {
        return activeSince;
    }

    public void setActiveSince(String activeSince) {
        this.activeSince = activeSince;
    }


    /**
     * The UTC DateTime when the workspace user was created.
     **/
    @ApiModelProperty(value = "The UTC DateTime when the workspace user was created.")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
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
     **/
    @ApiModelProperty(value = "")
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }


    /**
     * Utc date and time the comment was last updated (can only be done by creator.)
     **/
    @ApiModelProperty(value = "Utc date and time the comment was last updated (can only be done by creator.)")
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
     **/
    @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * Type of the user. Valid values: type_owner, type_participant.
     **/
    @ApiModelProperty(value = "Type of the user. Valid values: type_owner, type_participant.")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }


    /**
     * The relative URI that may be used to access a workspace user.
     **/
    @ApiModelProperty(value = "The relative URI that may be used to access a workspace user.")
    public String getWorkspaceUserBaseUrl() {
        return workspaceUserBaseUrl;
    }

    public void setWorkspaceUserBaseUrl(String workspaceUserBaseUrl) {
        this.workspaceUserBaseUrl = workspaceUserBaseUrl;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getWorkspaceUserId() {
        return workspaceUserId;
    }

    public void setWorkspaceUserId(String workspaceUserId) {
        this.workspaceUserId = workspaceUserId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkspaceUser workspaceUser = (WorkspaceUser) o;
        return Objects.equals(accountId, workspaceUser.accountId) &&
                Objects.equals(accountName, workspaceUser.accountName) &&
                Objects.equals(activeSince, workspaceUser.activeSince) &&
                Objects.equals(created, workspaceUser.created) &&
                Objects.equals(createdById, workspaceUser.createdById) &&
                Objects.equals(email, workspaceUser.email) &&
                Objects.equals(errorDetails, workspaceUser.errorDetails) &&
                Objects.equals(lastModified, workspaceUser.lastModified) &&
                Objects.equals(lastModifiedById, workspaceUser.lastModifiedById) &&
                Objects.equals(status, workspaceUser.status) &&
                Objects.equals(type, workspaceUser.type) &&
                Objects.equals(userId, workspaceUser.userId) &&
                Objects.equals(userName, workspaceUser.userName) &&
                Objects.equals(workspaceId, workspaceUser.workspaceId) &&
                Objects.equals(workspaceUserBaseUrl, workspaceUser.workspaceUserBaseUrl) &&
                Objects.equals(workspaceUserId, workspaceUser.workspaceUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountName, activeSince, created, createdById, email, errorDetails, lastModified, lastModifiedById, status, type, userId, userName, workspaceId, workspaceUserBaseUrl, workspaceUserId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkspaceUser {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    activeSince: ").append(toIndentedString(activeSince)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    lastModifiedById: ").append(toIndentedString(lastModifiedById)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    workspaceUserBaseUrl: ").append(toIndentedString(workspaceUserBaseUrl)).append("\n");
        sb.append("    workspaceUserId: ").append(toIndentedString(workspaceUserId)).append("\n");
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
