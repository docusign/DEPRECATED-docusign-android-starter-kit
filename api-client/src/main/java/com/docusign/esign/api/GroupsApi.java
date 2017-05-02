package com.docusign.esign.api;

import com.docusign.esign.model.BrandsRequest;
import com.docusign.esign.model.BrandsResponse;
import com.docusign.esign.model.GroupInformation;
import com.docusign.esign.model.UserInfoList;
import com.docusign.esign.model.UsersResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GroupsApi {

    /**
     * Creates one or more groups for the account.
     * Creates one or more groups for the account.\n\nGroups can be used to help manage users by associating users with a group. You can associate a group with a Permission Profile, which sets the user permissions for users in that group without having to set the `userSettings` property for each user. You are not required to set Permission Profiles for a group, but it makes it easier to manage user permissions for a large number of users. You can also use groups with template sharing to limit user access to templates.
     *
     * @param accountId        The external account number (int) or account ID Guid. (required)
     * @param groupInformation (optional)
     * @return Call<GroupInformation>
     */

    @POST("v2/accounts/{accountId}/groups")
    Call<GroupInformation> createGroups(
            @Path("accountId") String accountId, @Body GroupInformation groupInformation
    );


    /**
     * Deletes brand information from the requested group.
     * Deletes brand information from the requested group.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param groupId       The ID of the group being accessed. (required)
     * @param brandsRequest (optional)
     * @return Call<BrandsResponse>
     */

    @DELETE("v2/accounts/{accountId}/groups/{groupId}/brands")
    Call<BrandsResponse> deleteBrands(
            @Path("accountId") String accountId, @Path("groupId") String groupId, @Body BrandsRequest brandsRequest
    );


    /**
     * Deletes one or more users from a gro
     * Deletes one or more users from a group.\n
     *
     * @param accountId    The external account number (int) or account ID Guid. (required)
     * @param groupId      The ID of the group being accessed. (required)
     * @param userInfoList (optional)
     * @return Call<UsersResponse>
     */

    @DELETE("v2/accounts/{accountId}/groups/{groupId}/users")
    Call<UsersResponse> deleteGroupUsers(
            @Path("accountId") String accountId, @Path("groupId") String groupId, @Body UserInfoList userInfoList
    );


    /**
     * Deletes an existing user group.
     * Deletes an existing user group.
     *
     * @param accountId        The external account number (int) or account ID Guid. (required)
     * @param groupInformation (optional)
     * @return Call<GroupInformation>
     */

    @DELETE("v2/accounts/{accountId}/groups")
    Call<GroupInformation> deleteGroups(
            @Path("accountId") String accountId, @Body GroupInformation groupInformation
    );


    /**
     * Gets group brand ID Information.\n
     * Retrieves information about the brands associated with the requested group.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param groupId   The ID of the group being accessed. (required)
     * @return Call<BrandsResponse>
     */

    @GET("v2/accounts/{accountId}/groups/{groupId}/brands")
    Call<BrandsResponse> getBrands(
            @Path("accountId") String accountId, @Path("groupId") String groupId
    );


    /**
     * Gets a list of users in a group.
     * Retrieves a list of users in a group.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param groupId       The ID of the group being accessed. (required)
     * @param count         Number of records to return. The number must be greater than 1 and less than or equal to 100.  (optional)
     * @param startPosition Starting value for the list. (optional)
     * @return Call<UsersResponse>
     */

    @GET("v2/accounts/{accountId}/groups/{groupId}/users")
    Call<UsersResponse> listGroupUsers(
            @Path("accountId") String accountId, @Path("groupId") String groupId, @Query("count") String count, @Query("start_position") String startPosition
    );


    /**
     * Gets information about groups associated with the account.
     * Retrieves information about groups associated with the account.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param count         Number of records to return. The number must be greater than 1 and less than or equal to 100. (optional)
     * @param groupName     Filters the groups returned by the group name or a sub-string of group name. (optional)
     * @param groupType     (optional)
     * @param searchText    (optional)
     * @param startPosition Starting value for the list. (optional)
     * @return Call<GroupInformation>
     */

    @GET("v2/accounts/{accountId}/groups")
    Call<GroupInformation> listGroups(
            @Path("accountId") String accountId, @Query("count") String count, @Query("group_name") String groupName, @Query("group_type") String groupType, @Query("search_text") String searchText, @Query("start_position") String startPosition
    );


    /**
     * Adds group brand ID information to a group.
     * Adds group brand ID information to a group.
     *
     * @param accountId     The external account number (int) or account ID Guid. (required)
     * @param groupId       The ID of the group being accessed. (required)
     * @param brandsRequest (optional)
     * @return Call<BrandsResponse>
     */

    @PUT("v2/accounts/{accountId}/groups/{groupId}/brands")
    Call<BrandsResponse> updateBrands(
            @Path("accountId") String accountId, @Path("groupId") String groupId, @Body BrandsRequest brandsRequest
    );


    /**
     * Adds one or more users to an existing group.
     * Adds one or more users to an existing group.
     *
     * @param accountId    The external account number (int) or account ID Guid. (required)
     * @param groupId      The ID of the group being accessed. (required)
     * @param userInfoList (optional)
     * @return Call<UsersResponse>
     */

    @PUT("v2/accounts/{accountId}/groups/{groupId}/users")
    Call<UsersResponse> updateGroupUsers(
            @Path("accountId") String accountId, @Path("groupId") String groupId, @Body UserInfoList userInfoList
    );


    /**
     * Updates the group information for a group.
     * Updates the group name and modifies, or sets, the permission profile for the group.
     *
     * @param accountId        The external account number (int) or account ID Guid. (required)
     * @param groupInformation (optional)
     * @return Call<GroupInformation>
     */

    @PUT("v2/accounts/{accountId}/groups")
    Call<GroupInformation> updateGroups(
            @Path("accountId") String accountId, @Body GroupInformation groupInformation
    );


}
