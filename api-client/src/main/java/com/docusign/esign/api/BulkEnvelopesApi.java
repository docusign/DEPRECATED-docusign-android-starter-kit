package com.docusign.esign.api;

import com.docusign.esign.model.BulkEnvelopeStatus;
import com.docusign.esign.model.BulkEnvelopesResponse;
import com.docusign.esign.model.BulkRecipientsRequest;
import com.docusign.esign.model.BulkRecipientsResponse;
import com.docusign.esign.model.BulkRecipientsSummaryResponse;
import com.docusign.esign.model.BulkRecipientsUpdateResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BulkEnvelopesApi {

    /**
     * Deletes the bulk recipient file from an envelope.
     * Deletes the bulk recipient file from an envelope. This cannot be used if the envelope has been sent.\n\nAfter using this, the `bulkRecipientsUri` property is not returned in subsequent GET calls for the envelope, but the recipient will remain as a bulk recipient.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param envelopeId  The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId The ID of the recipient being accessed. (required)
     * @return Call<BulkRecipientsUpdateResponse>
     */

    @DELETE("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/bulk_recipients")
    Call<BulkRecipientsUpdateResponse> deleteRecipients(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId
    );


    /**
     * Gets the status of a specified bulk send operation.
     * Retrieves the status information of a single bulk recipient batch. A bulk recipient batch is the set of envelopes sent from a single bulk recipient file.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param batchId       (required)
     * @param count         Specifies the number of entries to return. (optional)
     * @param include       Specifies which entries are included in the response. Multiple entries can be included by using commas in the query string (example: ?include=\u201Dfailed,queued\u201D) \n\nValid values are: \n\n* all - Returns all entries. If present, overrides all other query settings. This is the default if no query string is provided.\n* failed - This only returns entries with a failed status.\n* queued - This only returns entries with a queued status.\n* sent \u2013 This only returns entries with a sent status. \n (optional)
     * @param startPosition Specifies the location in the list of envelopes from which to start. (optional)
     * @return Call<BulkEnvelopeStatus>
     */

    @GET("v2/accounts/{accountId}/bulk_envelopes/{batchId}")
    Call<BulkEnvelopeStatus> get(
            @Path("accountId") String accountId, @Path("batchId") String batchId, @Query("count") String count, @Query("include") String include, @Query("start_position") String startPosition
    );


    /**
     * Gets the bulk recipient file from an envelope.
     * Retrieves the bulk recipient file information from an envelope that has a bulk recipient.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param envelopeId    The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId   The ID of the recipient being accessed. (required)
     * @param includeTabs   (optional)
     * @param startPosition (optional)
     * @return Call<BulkRecipientsResponse>
     */

    @GET("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/bulk_recipients")
    Call<BulkRecipientsResponse> getRecipients(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId, @Query("include_tabs") String includeTabs, @Query("start_position") String startPosition
    );


    /**
     * Gets status information about bulk recipient batches.
     * Retrieves status information about all the bulk recipient batches. A bulk recipient batch is the set of envelopes sent from a single bulk recipient file. The response includes general information about each bulk recipient batch. \n\nThe response returns information about the envelopes sent with bulk recipient batches, including the `batchId` property, which can be used to retrieve a more detailed status of individual bulk recipient batches.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param count         The number of results to return. This can be 1 to 20. (optional)
     * @param include       (optional)
     * @param startPosition The position of the bulk envelope items in the response. This is used for repeated calls, when the number of bulk envelopes returned is too large for one return. The default value is 0. (optional)
     * @return Call<BulkEnvelopesResponse>
     */

    @GET("v2/accounts/{accountId}/bulk_envelopes")
    Call<BulkEnvelopesResponse> list(
            @Path("accountId") String accountId, @Query("count") String count, @Query("include") String include, @Query("start_position") String startPosition
    );


    /**
     * Adds or replaces envelope bulk recipients.
     * Updates the bulk recipients in a draft envelope using a file upload. The Content-Type supported for uploading a bulk recipient file is CSV (text/csv).\n\nThe REST API does not support modifying individual rows or values in the bulk recipients file. It only allows the entire file to be added or replaced with a new file.
     *
     * @param accountId             The external account number (int) or account ID Guid. (required)
     * @param envelopeId            The envelopeId Guid of the envelope being accessed. (required)
     * @param recipientId           The ID of the recipient being accessed. (required)
     * @param bulkRecipientsRequest (optional)
     * @return Call<BulkRecipientsSummaryResponse>
     */

    @PUT("v2/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/bulk_recipients")
    Call<BulkRecipientsSummaryResponse> updateRecipients(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId, @Path("recipientId") String recipientId, @Body BulkRecipientsRequest bulkRecipientsRequest
    );


}
