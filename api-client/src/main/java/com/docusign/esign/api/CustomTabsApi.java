package com.docusign.esign.api;

import com.docusign.esign.model.TabMetadata;
import com.docusign.esign.model.TabMetadataList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CustomTabsApi {

    /**
     * Creates a custom tab.
     * Creates a tab with pre-defined properties, such as a text tab with a certain font type and validation pattern. Users can access the custom tabs when sending documents through the DocuSign web application.\n\nCustom tabs can be created for approve, checkbox, company, date, date signed, decline, email, email address, envelope ID, first name, formula, full name, initial here, last name, list, note, number, radio, sign here, signer attachment, SSN, text, title, and zip tabs.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param tabMetadata (optional)
     * @return Call<TabMetadata>
     */

    @POST("v2/accounts/{accountId}/tab_definitions")
    Call<TabMetadata> create(
            @Path("accountId") String accountId, @Body TabMetadata tabMetadata
    );


    /**
     * Deletes custom tab information.
     * Deletes the custom from the specified account.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param customTabId (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/tab_definitions/{customTabId}")
    Call<Void> delete(
            @Path("accountId") String accountId, @Path("customTabId") String customTabId
    );


    /**
     * Gets custom tab information.
     * Retrieves information about the requested custom tab on the specified account.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param customTabId (required)
     * @return Call<TabMetadata>
     */

    @GET("v2/accounts/{accountId}/tab_definitions/{customTabId}")
    Call<TabMetadata> get(
            @Path("accountId") String accountId, @Path("customTabId") String customTabId
    );


    /**
     * Gets a list of all account tabs.
     * Retrieves a list of all tabs associated with the account.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param customTabOnly When set to **true**, only custom tabs are returned in the response.  (optional)
     * @return Call<TabMetadataList>
     */

    @GET("v2/accounts/{accountId}/tab_definitions")
    Call<TabMetadataList> list(
            @Path("accountId") String accountId, @Query("custom_tab_only") String customTabOnly
    );


    /**
     * Updates custom tab information.\n\n
     * Updates the information in a custom tab for the specified account.
     *
     * @param accountId   The external account number (int) or account ID Guid. (required)
     * @param customTabId (required)
     * @param tabMetadata (optional)
     * @return Call<TabMetadata>
     */

    @PUT("v2/accounts/{accountId}/tab_definitions/{customTabId}")
    Call<TabMetadata> update(
            @Path("accountId") String accountId, @Path("customTabId") String customTabId, @Body TabMetadata tabMetadata
    );


}
