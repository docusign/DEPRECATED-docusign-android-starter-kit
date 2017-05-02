package com.docusign.esign.api;

import com.docusign.esign.model.AccountBillingPlanResponse;
import com.docusign.esign.model.BillingInvoice;
import com.docusign.esign.model.BillingInvoicesResponse;
import com.docusign.esign.model.BillingInvoicesSummary;
import com.docusign.esign.model.BillingPaymentItem;
import com.docusign.esign.model.BillingPaymentRequest;
import com.docusign.esign.model.BillingPaymentResponse;
import com.docusign.esign.model.BillingPaymentsResponse;
import com.docusign.esign.model.BillingPlanInformation;
import com.docusign.esign.model.BillingPlanResponse;
import com.docusign.esign.model.BillingPlanUpdateResponse;
import com.docusign.esign.model.BillingPlansResponse;
import com.docusign.esign.model.PurchasedEnvelopesInformation;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BillingApi {

    /**
     * Get the billing plan details.
     * Retrieves the billing plan details for the specified billing plan ID.
     *
     * @param billingPlanId The ID of the billing plan being accessed. (required)
     * @return Call<BillingPlanResponse>
     */

    @GET("v2/billing_plans/{billingPlanId}")
    Call<BillingPlanResponse> getBillingPlan(
            @Path("billingPlanId") String billingPlanId
    );


    /**
     * Retrieves a billing invoice.
     * Retrieves the specified invoice. \n\n###### Note: If the `pdfAvailable` property in the response is set to *true*, you can download a PDF version of the invoice. To download the PDF, make the call again and change the value of the `Accept` property in the header to `Accept: application/pdf`.\n\nPrivileges required: account administrator\n\nThe response returns a list of charges and information about the charges. Quantities are usually shown as \u2018unlimited\u2019 or an integer. Amounts are shown in the currency set for the account.\n\n**Response**\nThe following table provides a description of the different `chargeName` property values. The information will grow as more chargeable items are added to the system.\n\n| chargeName | Description |\n| --- | --- |\n| id_check | ID\u00A0Check Charge |\n| in_person_signing | In Person Signing charge |\n| envelopes Included | Sent Envelopes for the account |\n| age_verify | Age verification check |\n| ofac | OFAC Check |\n| id_confirm | ID confirmation check |\n| student_authentication | STAN PIN authentication check |\n| wet_sign_fax | Pages for returning signed documents by fax |\n| attachment_fax | Pages for returning attachments by fax |\n| phone_authentication | Phone authentication charge |\n| powerforms | PowerForm envelopes sent |\n| signer_payments | Payment processing charge |\n| outbound_fax | Send by fax charge |\n| bulk_recipient_envelopes | Bulk Recipient Envelopes sent |\n| sms_authentications | SMS authentication charge |\n| saml_authentications | SAML authentication charge |\n| express_signer_certificate | DocuSign Express Certificate charge |\n| personal_signer_certificate | Personal Signer Certificate charge |\n| safe_certificate | SAFE BioPharma Signer Certificate charge |\n| seats | Included active seats charge |\n| open_trust_certificate | OpenTrust Signer Certificate charge |
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param invoiceId (required)
     * @return Call<BillingInvoice>
     */

    @GET("v2/accounts/{accountId}/billing_invoices/{invoiceId}")
    Call<BillingInvoice> getInvoice(
            @Path("accountId") String accountId, @Path("invoiceId") String invoiceId
    );


    /**
     * Gets billing payment information for a specific payment.
     * Retrieves the information for a specified payment. \n\nPrivileges required: account administrator
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param paymentId (required)
     * @return Call<BillingPaymentItem>
     */

    @GET("v2/accounts/{accountId}/billing_payments/{paymentId}")
    Call<BillingPaymentItem> getPayment(
            @Path("accountId") String accountId, @Path("paymentId") String paymentId
    );


    /**
     * Get Account Billing Plan
     * Retrieves the billing plan information for the specified account, including the current billing plan, successor plans, billing address, and billing credit card.\n\nBy default the successor plan and credit card information is included in the response. This information can be excluded from the response by adding the appropriate optional query string with the `setting` set to **false**. \n\nResponse\n\nThe response returns the billing plan information, including the currency code, for the plan. The `billingPlan` and `succesorPlans` property values are the same as those shown in the [ML:Get Billing Plan Details] reference. the `billingAddress` and `creditCardInformation` property values are the same as those shown in the [ML:Update Billing Plan] reference.\n\n###### Note: When credit card number information is shown, a mask is applied to the response so that only the last 4 digits of the card number are visible.
     *
     * @param accountId                    The external account number (int) or account ID Guid. (required)
     * @param includeCreditCardInformation When set to **true**, excludes credit card information from the response. (optional)
     * @param includeMetadata              When set to **true**, the `canUpgrade` and `renewalStatus` properities are included the response and an array of `supportedCountries` property is added to the `billingAddress` information.  (optional)
     * @param includeSuccessorPlans        When set to **true**, excludes successor information from the response. (optional)
     * @return Call<AccountBillingPlanResponse>
     */

    @GET("v2/accounts/{accountId}/billing_plan")
    Call<AccountBillingPlanResponse> getPlan(
            @Path("accountId") String accountId, @Query("include_credit_card_information") String includeCreditCardInformation, @Query("include_metadata") String includeMetadata, @Query("include_successor_plans") String includeSuccessorPlans
    );


    /**
     * Gets the list of available billing plans.
     * Retrieves a list of the billing plans associated with a distributor.
     *
     * @return Call<BillingPlansResponse>
     */

    @GET("v2/billing_plans")
    Call<BillingPlansResponse> listBillingPlans();


    /**
     * Get a List of Billing Invoices
     * Retrieves a list of invoices for the account. If the from date or to date queries are not specified, the response returns invoices for the last 365 days.\n\nPrivileges required: account administrator
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param fromDate  Specifies the date/time of the earliest invoice in the account to retrieve. (optional)
     * @param toDate    Specifies the date/time of the latest invoice in the account to retrieve. (optional)
     * @return Call<BillingInvoicesResponse>
     */

    @GET("v2/accounts/{accountId}/billing_invoices")
    Call<BillingInvoicesResponse> listInvoices(
            @Path("accountId") String accountId, @Query("from_date") String fromDate, @Query("to_date") String toDate
    );


    /**
     * Get a list of past due invoices.
     * Returns a list past due invoices for the account and notes if payment can be made through the REST API. \n\nPrivileges Required: account administrator
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @return Call<BillingInvoicesSummary>
     */

    @GET("v2/accounts/{accountId}/billing_invoices_past_due")
    Call<BillingInvoicesSummary> listInvoicesPastDue(
            @Path("accountId") String accountId
    );


    /**
     * Gets payment information for one or more payments.
     * Retrieves a list containing information about one or more payments. If the from date or to date queries are not used, the response returns payment information for the last 365 days. \n\nPrivileges required: account administrator
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param fromDate  Specifies the date/time of the earliest payment in the account to retrieve. (optional)
     * @param toDate    Specifies the date/time of the latest payment in the account to retrieve. (optional)
     * @return Call<BillingPaymentsResponse>
     */

    @GET("v2/accounts/{accountId}/billing_payments")
    Call<BillingPaymentsResponse> listPayments(
            @Path("accountId") String accountId, @Query("from_date") String fromDate, @Query("to_date") String toDate
    );


    /**
     * Posts a payment to a past due invoice.
     * Posts a payment to a past due invoice. \n\n###### Note: This can only be used if the `paymentAllowed` value for a past due invoice is true. This can be determined calling [ML:GetBillingInvoicesPastDue].\n\nThe response returns information for a single payment, if a payment ID was used in the endpoint, or a list of payments. If the from date or to date queries or payment ID are not used, the response returns payment information for the last 365 days. If the request was for a single payment ID, the `nextUri` and `previousUri` properties are not returned.\n\nPrivileges required: account administrator
     *
     * @param accountId             The external account number (int) or account ID Guid. (required)
     * @param billingPaymentRequest (optional)
     * @return Call<BillingPaymentResponse>
     */

    @POST("v2/accounts/{accountId}/billing_payments")
    Call<BillingPaymentResponse> makePayment(
            @Path("accountId") String accountId, @Body BillingPaymentRequest billingPaymentRequest
    );


    /**
     * Reserverd: Purchase additional envelopes.
     * Reserved: At this time, this endpoint is limited to DocuSign internal use only. Completes the purchase of envelopes for your account. The actual purchase is done as part of an internal workflow interaction with an envelope vendor.
     *
     * @param accountId                     The external account number (int) or account ID Guid. (required)
     * @param purchasedEnvelopesInformation (optional)
     * @return Call<Void>
     */

    @PUT("v2/accounts/{accountId}/billing_plan/purchased_envelopes")
    Call<Void> purchaseEnvelopes(
            @Path("accountId") String accountId, @Body PurchasedEnvelopesInformation purchasedEnvelopesInformation
    );


    /**
     * Updates the account billing plan.
     * Updates the billing plan information, billing address, and credit card information for the specified account.
     *
     * @param accountId              The external account number (int) or account ID Guid. (required)
     * @param previewBillingPlan     When set to **true**, updates the account using a preview billing plan. (optional)
     * @param billingPlanInformation (optional)
     * @return Call<BillingPlanUpdateResponse>
     */

    @PUT("v2/accounts/{accountId}/billing_plan")
    Call<BillingPlanUpdateResponse> updatePlan(
            @Path("accountId") String accountId, @Query("preview_billing_plan") String previewBillingPlan, @Body BillingPlanInformation billingPlanInformation
    );


}
