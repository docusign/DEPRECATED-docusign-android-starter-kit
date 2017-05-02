package com.docusign.esign.api;

import com.docusign.esign.model.PowerForm;
import com.docusign.esign.model.PowerFormSendersResponse;
import com.docusign.esign.model.PowerFormsFormDataResponse;
import com.docusign.esign.model.PowerFormsRequest;
import com.docusign.esign.model.PowerFormsResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PowerFormsApi {

    /**
     * Creates a new PowerForm.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param powerForm (optional)
     * @return Call<PowerForm>
     */

    @POST("v2/accounts/{accountId}/powerforms")
    Call<PowerForm> createPowerForm(
            @Path("accountId") String accountId, @Body PowerForm powerForm
    );


    /**
     * Delete a PowerForm.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param powerFormId (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/powerforms/{powerFormId}")
    Call<Void> deletePowerForm(
            @Path("accountId") String accountId, @Path("powerFormId") String powerFormId
    );


    /**
     * Deletes one or more PowerForms
     *
     * @param accountId         The external account number (int) or account ID Guid. (required)
     * @param powerFormsRequest (optional)
     * @return Call<PowerFormsResponse>
     */

    @DELETE("v2/accounts/{accountId}/powerforms")
    Call<PowerFormsResponse> deletePowerForms(
            @Path("accountId") String accountId, @Body PowerFormsRequest powerFormsRequest
    );


    /**
     * Returns a single PowerForm.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param powerFormId (required)
     * @return Call<PowerForm>
     */

    @GET("v2/accounts/{accountId}/powerforms/{powerFormId}")
    Call<PowerForm> getPowerForm(
            @Path("accountId") String accountId, @Path("powerFormId") String powerFormId
    );


    /**
     * Returns the form data associated with the usage of a PowerForm.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param powerFormId (required)
     * @param fromDate    (optional)
     * @param toDate      (optional)
     * @return Call<PowerFormsFormDataResponse>
     */

    @GET("v2/accounts/{accountId}/powerforms/{powerFormId}/form_data")
    Call<PowerFormsFormDataResponse> getPowerFormData(
            @Path("accountId") String accountId, @Path("powerFormId") String powerFormId, @Query("from_date") String fromDate, @Query("to_date") String toDate
    );


    /**
     * Returns the list of PowerForms available to the user.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param startPosition (optional)
     * @return Call<PowerFormSendersResponse>
     */

    @GET("v2/accounts/{accountId}/powerforms/senders")
    Call<PowerFormSendersResponse> listPowerFormSenders(
            @Path("accountId") String accountId, @Query("start_position") String startPosition
    );


    /**
     * Returns the list of PowerForms available to the user.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param fromDate  (optional)
     * @param order     (optional)
     * @param orderBy   (optional)
     * @param toDate    (optional)
     * @return Call<PowerFormsResponse>
     */

    @GET("v2/accounts/{accountId}/powerforms")
    Call<PowerFormsResponse> listPowerForms(
            @Path("accountId") String accountId, @Query("from_date") String fromDate, @Query("order") String order, @Query("order_by") String orderBy, @Query("to_date") String toDate
    );


    /**
     * Creates a new PowerForm.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param powerFormId (required)
     * @param powerForm   (optional)
     * @return Call<PowerForm>
     */

    @PUT("v2/accounts/{accountId}/powerforms/{powerFormId}")
    Call<PowerForm> updatePowerForm(
            @Path("accountId") String accountId, @Path("powerFormId") String powerFormId, @Body PowerForm powerForm
    );


}
