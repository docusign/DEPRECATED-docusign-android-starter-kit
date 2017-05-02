package com.docusign.esign.api;

import com.docusign.esign.model.FolderItemResponse;
import com.docusign.esign.model.FolderItemsResponse;
import com.docusign.esign.model.FoldersRequest;
import com.docusign.esign.model.FoldersResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FoldersApi {

    /**
     * Gets a list of the folders for the account.
     * Retrieves a list of the folders for the account, including the folder hierarchy. You can specify whether to return just the template folder or template folder and normal folders by setting the `template` query string parameter.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param include       (optional)
     * @param includeItems  (optional)
     * @param startPosition (optional)
     * @param template      Specifies the items that are returned. Valid values are: \n\n* include - The folder list will return normal folders plus template folders. \n* only - Only the list of template folders are returned. (optional)
     * @param userFilter    (optional)
     * @return Call<FoldersResponse>
     */

    @GET("v2/accounts/{accountId}/folders")
    Call<FoldersResponse> list(
            @Path("accountId") String accountId, @Query("include") String include, @Query("include_items") String includeItems, @Query("start_position") String startPosition, @Query("template") String template, @Query("user_filter") String userFilter
    );


    /**
     * Gets a list of the envelopes in the specified folder.
     * Retrieves a list of the envelopes in the specified folder. You can narrow the query by specifying search criteria in the query string parameters.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param folderId      The ID of the folder being accessed. (required)
     * @param fromDate      Only return items on or after this date. If no value is provided, the default search is the previous 30 days.  (optional)
     * @param includeItems  (optional)
     * @param ownerEmail    The email of the folder owner.  (optional)
     * @param ownerName     The name of the folder owner.  (optional)
     * @param searchText    The search text used to search the items of the envelope. The search looks at recipient names and emails, envelope custom fields, sender name, and subject.  (optional)
     * @param startPosition The position of the folder items to return. This is used for repeated calls, when the number of envelopes returned is too much for one return (calls return 100 envelopes at a time). The default value is 0. (optional)
     * @param status        The current status of the envelope. If no value is provided, the default search is all/any status. (optional)
     * @param toDate        Only return items up to this date. If no value is provided, the default search is to the current date. (optional)
     * @return Call<FolderItemsResponse>
     */

    @GET("v2/accounts/{accountId}/folders/{folderId}")
    Call<FolderItemsResponse> listItems(
            @Path("accountId") String accountId, @Path("folderId") String folderId, @Query("from_date") String fromDate, @Query("include_items") String includeItems, @Query("owner_email") String ownerEmail, @Query("owner_name") String ownerName, @Query("search_text") String searchText, @Query("start_position") String startPosition, @Query("status") String status, @Query("to_date") String toDate
    );


    /**
     * Moves an envelope from its current folder to the specified folder.
     * Moves envelopes to the specified folder.
     *
     * @param accountId      The external account number (int) or account ID Guid. (required)
     * @param folderId       The ID of the folder being accessed. (required)
     * @param foldersRequest (optional)
     * @return Call<FoldersResponse>
     */

    @PUT("v2/accounts/{accountId}/folders/{folderId}")
    Call<FoldersResponse> moveEnvelopes(
            @Path("accountId") String accountId, @Path("folderId") String folderId, @Body FoldersRequest foldersRequest
    );


    /**
     * Gets a list of envelopes in folders matching the specified criteria.
     * Retrieves a list of envelopes that match the criteria specified in the query.\n\nIf the user ID of the user making the call is the same as the user ID for any returned recipient, then the userId property is added to the returned information for those recipients.
     *
     * @param accountId         The external account number (int) or account ID Guid. (required)
     * @param searchFolderId    Specifies the envelope group that is searched by the request. These are logical groupings, not actual folder names. Valid values are: drafts, awaiting_my_signature, completed, out_for_signature. (required)
     * @param all               Specifies that all envelopes that match the criteria are returned. (optional)
     * @param count             Specifies the number of records returned in the cache. The number must be greater than 0 and less than or equal to 100. (optional)
     * @param fromDate          Specifies the start of the date range to return. If no value is provided, the default search is the previous 30 days. (optional)
     * @param includeRecipients When set to **true**, the recipient information is returned in the response. (optional)
     * @param order             Specifies the order in which the list is returned. Valid values are: `asc` for ascending order, and `desc` for descending order. (optional)
     * @param orderBy           Specifies the property used to sort the list. Valid values are: `action_required`, `created`, `completed`, `sent`, `signer_list`, `status`, or `subject`. (optional)
     * @param startPosition     Specifies the the starting location in the result set of the items that are returned. (optional)
     * @param toDate            Specifies the end of the date range to return. (optional)
     * @return Call<FolderItemResponse>
     */

    @GET("v2/accounts/{accountId}/search_folders/{searchFolderId}")
    Call<FolderItemResponse> search(
            @Path("accountId") String accountId, @Path("searchFolderId") String searchFolderId, @Query("all") String all, @Query("count") String count, @Query("from_date") String fromDate, @Query("include_recipients") String includeRecipients, @Query("order") String order, @Query("order_by") String orderBy, @Query("start_position") String startPosition, @Query("to_date") String toDate
    );


}
