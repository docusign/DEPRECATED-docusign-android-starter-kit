package com.docusign.esign.api;

import com.docusign.esign.model.PageImages;
import com.docusign.esign.model.Workspace;
import com.docusign.esign.model.WorkspaceFolderContents;
import com.docusign.esign.model.WorkspaceItem;
import com.docusign.esign.model.WorkspaceItemList;
import com.docusign.esign.model.WorkspaceList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WorkspacesApi {

    /**
     * Create a Workspace
     * Creates a new workspace.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param workspace (optional)
     * @return Call<Workspace>
     */

    @POST("v2/accounts/{accountId}/workspaces")
    Call<Workspace> createWorkspace(
            @Path("accountId") String accountId, @Body Workspace workspace
    );


    /**
     * Creates a workspace file.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param folderId    The ID of the folder being accessed. (required)
     * @param workspaceId Specifies the workspace ID GUID. (required)
     * @return Call<WorkspaceItem>
     */

    @POST("v2/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}/files")
    Call<WorkspaceItem> createWorkspaceFile(
            @Path("accountId") String accountId, @Path("folderId") String folderId, @Path("workspaceId") String workspaceId
    );


    /**
     * Delete Workspace
     * Deletes an existing workspace (logically).
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param workspaceId Specifies the workspace ID GUID. (required)
     * @return Call<Workspace>
     */

    @DELETE("v2/accounts/{accountId}/workspaces/{workspaceId}")
    Call<Workspace> deleteWorkspace(
            @Path("accountId") String accountId, @Path("workspaceId") String workspaceId
    );


    /**
     * Deletes workspace one or more specific files/folders from the given folder or root.
     *
     * @param accountId         The external account number (int) or account ID Guid. (required)
     * @param folderId          The ID of the folder being accessed. (required)
     * @param workspaceId       Specifies the workspace ID GUID. (required)
     * @param workspaceItemList (optional)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}")
    Call<Void> deleteWorkspaceFolderItems(
            @Path("accountId") String accountId, @Path("folderId") String folderId, @Path("workspaceId") String workspaceId, @Body WorkspaceItemList workspaceItemList
    );


    /**
     * Get Workspace
     * Retrives properties about a workspace given a unique workspaceId.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param workspaceId Specifies the workspace ID GUID. (required)
     * @return Call<Workspace>
     */

    @GET("v2/accounts/{accountId}/workspaces/{workspaceId}")
    Call<Workspace> getWorkspace(
            @Path("accountId") String accountId, @Path("workspaceId") String workspaceId
    );


    /**
     * Get Workspace File
     * Retrieves a workspace file (the binary).
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param fileId      Specifies the room file ID GUID. (required)
     * @param folderId    The ID of the folder being accessed. (required)
     * @param workspaceId Specifies the workspace ID GUID. (required)
     * @param isDownload  When set to **true**, the Content-Disposition header is set in the response. The value of the header provides the filename of the file. Default is **false**. (optional)
     * @param pdfVersion  When set to **true** the file returned as a PDF. (optional)
     * @return Call<Void>
     */

    @GET("v2/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}/files/{fileId}")
    Call<Void> getWorkspaceFile(
            @Path("accountId") String accountId, @Path("fileId") String fileId, @Path("folderId") String folderId, @Path("workspaceId") String workspaceId, @Query("is_download") String isDownload, @Query("pdf_version") String pdfVersion
    );


    /**
     * List File Pages
     * Retrieves a workspace file as rasterized pages.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param fileId        Specifies the room file ID GUID. (required)
     * @param folderId      The ID of the folder being accessed. (required)
     * @param workspaceId   Specifies the workspace ID GUID. (required)
     * @param count         The maximum number of results to be returned by this request. (optional)
     * @param dpi           Number of dots per inch for the resulting image. The default if not used is 94. The range is 1-310. (optional)
     * @param maxHeight     Sets the maximum height (in pixels) of the returned image. (optional)
     * @param maxWidth      Sets the maximum width (in pixels) of the returned image. (optional)
     * @param startPosition The position within the total result set from which to start returning values. The value **thumbnail** may be used to return the page image. (optional)
     * @return Call<PageImages>
     */

    @GET("v2/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}/files/{fileId}/pages")
    Call<PageImages> listWorkspaceFilePages(
            @Path("accountId") String accountId, @Path("fileId") String fileId, @Path("folderId") String folderId, @Path("workspaceId") String workspaceId, @Query("count") String count, @Query("dpi") String dpi, @Query("max_height") String maxHeight, @Query("max_width") String maxWidth, @Query("start_position") String startPosition
    );


    /**
     * List Workspace Folder Contents
     * Retrieves workspace folder contents, which can include sub folders and files.
     *
     * @param accountId         The external account number (int) or account ID Guid. (required)
     * @param folderId          The ID of the folder being accessed. (required)
     * @param workspaceId       Specifies the workspace ID GUID. (required)
     * @param count             The maximum number of results to be returned by this request. (optional)
     * @param includeFiles      When set to **true**, file information is returned in the response along with folder information. The default is **false**. (optional)
     * @param includeSubFolders When set to **true**, information about the sub-folders of the current folder is returned. The default is **false**. (optional)
     * @param includeThumbnails When set to **true**, thumbnails are returned as part of the response.  The default is **false**. (optional)
     * @param includeUserDetail Set to **true** to return extended details about the user. The default is **false**. (optional)
     * @param startPosition     The position within the total result set from which to start returning values. (optional)
     * @param workspaceUserId   If set, then the results are filtered to those associated with the specified userId. (optional)
     * @return Call<WorkspaceFolderContents>
     */

    @GET("v2/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}")
    Call<WorkspaceFolderContents> listWorkspaceFolderItems(
            @Path("accountId") String accountId, @Path("folderId") String folderId, @Path("workspaceId") String workspaceId, @Query("count") String count, @Query("include_files") String includeFiles, @Query("include_sub_folders") String includeSubFolders, @Query("include_thumbnails") String includeThumbnails, @Query("include_user_detail") String includeUserDetail, @Query("start_position") String startPosition, @Query("workspace_user_id") String workspaceUserId
    );


    /**
     * List Workspaces
     * Gets information about the Workspaces that have been created.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @return Call<WorkspaceList>
     */

    @GET("v2/accounts/{accountId}/workspaces")
    Call<WorkspaceList> listWorkspaces(
            @Path("accountId") String accountId
    );


    /**
     * Update Workspace
     * Updates information about a specific workspace.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param workspaceId Specifies the workspace ID GUID. (required)
     * @param workspace   (optional)
     * @return Call<Workspace>
     */

    @PUT("v2/accounts/{accountId}/workspaces/{workspaceId}")
    Call<Workspace> updateWorkspace(
            @Path("accountId") String accountId, @Path("workspaceId") String workspaceId, @Body Workspace workspace
    );


    /**
     * Update Workspace File Metadata
     * Updates workspace item metadata for one or more specific files/folders.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param fileId      Specifies the room file ID GUID. (required)
     * @param folderId    The ID of the folder being accessed. (required)
     * @param workspaceId Specifies the workspace ID GUID. (required)
     * @return Call<WorkspaceItem>
     */

    @PUT("v2/accounts/{accountId}/workspaces/{workspaceId}/folders/{folderId}/files/{fileId}")
    Call<WorkspaceItem> updateWorkspaceFile(
            @Path("accountId") String accountId, @Path("fileId") String fileId, @Path("folderId") String folderId, @Path("workspaceId") String workspaceId
    );


}
