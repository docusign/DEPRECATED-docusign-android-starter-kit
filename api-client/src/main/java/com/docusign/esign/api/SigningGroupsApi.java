package com.docusign.esign.api;

import com.docusign.esign.model.SigningGroup;
import com.docusign.esign.model.SigningGroupInformation;
import com.docusign.esign.model.SigningGroupUsers;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SigningGroupsApi {

    /**
     * Creates a signing group.
     * Creates one or more signing groups. \n\nMultiple signing groups can be created in one call. Only users with account administrator privileges can create signing groups. \n\nAn account can have a maximum of 50 signing groups. Each signing group can have a maximum of 50 group members.\n \nSigning groups can be used by any account user.
     *
     * @param accountId               The external account number (int) or account ID Guid. (required)
     * @param signingGroupInformation (optional)
     * @return Call<SigningGroupInformation>
     */

    @POST("v2/accounts/{accountId}/signing_groups")
    Call<SigningGroupInformation> createList(
            @Path("accountId") String accountId, @Body SigningGroupInformation signingGroupInformation
    );


    /**
     * Deletes one or more signing groups.
     * Deletes one or more signing groups in the specified account.
     *
     * @param accountId               The external account number (int) or account ID Guid. (required)
     * @param signingGroupInformation (optional)
     * @return Call<SigningGroupInformation>
     */

    @DELETE("v2/accounts/{accountId}/signing_groups")
    Call<SigningGroupInformation> deleteList(
            @Path("accountId") String accountId, @Body SigningGroupInformation signingGroupInformation
    );


    /**
     * Deletes  one or more members from a signing group.
     * Deletes  one or more members from the specified signing group.
     *
     * @param accountId         The external account number (int) or account ID Guid. (required)
     * @param signingGroupId    (required)
     * @param signingGroupUsers (optional)
     * @return Call<SigningGroupUsers>
     */

    @DELETE("v2/accounts/{accountId}/signing_groups/{signingGroupId}/users")
    Call<SigningGroupUsers> deleteUsers(
            @Path("accountId") String accountId, @Path("signingGroupId") String signingGroupId, @Body SigningGroupUsers signingGroupUsers
    );


    /**
     * Gets information about a signing group.
     * Retrieves information, including group member information, for the specified signing group.
     *
     * @param accountId      The external account number (int) or account ID Guid. (required)
     * @param signingGroupId (required)
     * @return Call<SigningGroup>
     */

    @GET("v2/accounts/{accountId}/signing_groups/{signingGroupId}")
    Call<SigningGroup> get(
            @Path("accountId") String accountId, @Path("signingGroupId") String signingGroupId
    );


    /**
     * Gets a list of the Signing Groups in an account.
     * Retrieves a list of all signing groups in the specified account.
     *
     * @param accountId    The external account number (int) or account ID Guid. (required)
     * @param groupType    (optional)
     * @param includeUsers When set to **true**, the response includes the signing group members.  (optional)
     * @return Call<SigningGroupInformation>
     */

    @GET("v2/accounts/{accountId}/signing_groups")
    Call<SigningGroupInformation> list(
            @Path("accountId") String accountId, @Query("group_type") String groupType, @Query("include_users") String includeUsers
    );


    /**
     * Gets a list of members in a Signing Group.
     * Retrieves the list of members in the specified Signing Group.
     *
     * @param accountId      The external account number (int) or account ID Guid. (required)
     * @param signingGroupId (required)
     * @return Call<SigningGroupUsers>
     */

    @GET("v2/accounts/{accountId}/signing_groups/{signingGroupId}/users")
    Call<SigningGroupUsers> listUsers(
            @Path("accountId") String accountId, @Path("signingGroupId") String signingGroupId
    );


    /**
     * Updates a signing group.
     * Updates signing group name and member information. You can also add new members to the signing group. A signing group can have a maximum of 50 members.
     *
     * @param accountId      The external account number (int) or account ID Guid. (required)
     * @param signingGroupId (required)
     * @param signingGroup   (optional)
     * @return Call<SigningGroup>
     */

    @PUT("v2/accounts/{accountId}/signing_groups/{signingGroupId}")
    Call<SigningGroup> update(
            @Path("accountId") String accountId, @Path("signingGroupId") String signingGroupId, @Body SigningGroup signingGroup
    );


    /**
     * Updates signing group names.
     * Updates the name of one or more existing signing groups.
     *
     * @param accountId               The external account number (int) or account ID Guid. (required)
     * @param signingGroupInformation (optional)
     * @return Call<SigningGroupInformation>
     */

    @PUT("v2/accounts/{accountId}/signing_groups")
    Call<SigningGroupInformation> updateList(
            @Path("accountId") String accountId, @Body SigningGroupInformation signingGroupInformation
    );


    /**
     * Adds members to a signing group.
     * Adds one or more new members to a signing group. A signing group can have a maximum of 50 members.
     *
     * @param accountId         The external account number (int) or account ID Guid. (required)
     * @param signingGroupId    (required)
     * @param signingGroupUsers (optional)
     * @return Call<SigningGroupUsers>
     */

    @PUT("v2/accounts/{accountId}/signing_groups/{signingGroupId}/users")
    Call<SigningGroupUsers> updateUsers(
            @Path("accountId") String accountId, @Path("signingGroupId") String signingGroupId, @Body SigningGroupUsers signingGroupUsers
    );


}
