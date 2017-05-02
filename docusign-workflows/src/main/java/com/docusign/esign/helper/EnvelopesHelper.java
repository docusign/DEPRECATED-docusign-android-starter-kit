package com.docusign.esign.helper;

import android.util.Base64;
import android.util.Log;

import com.docusign.esign.api.EnvelopesApi;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.model.Document;
import com.docusign.esign.model.EnvelopeDefinition;
import com.docusign.esign.model.EnvelopeSummary;
import com.docusign.esign.model.RecipientViewRequest;
import com.docusign.esign.model.Recipients;
import com.docusign.esign.model.SignHere;
import com.docusign.esign.model.Signer;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.ViewUrl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Response;

public class EnvelopesHelper {
    // for production environment update to "https://(www|na2|na3|eu|eu1).docusign.net/restapi"
    private static final String BaseUrl = "https://demo.docusign.net/restapi/";
    private ApiClient mApiClient;

    public EnvelopesHelper(ApiClient apiClient) {
        mApiClient = apiClient;
    }

    /**
     * Creates and sends a DocuSign envelope that contains one document, passed a File argument. The
     * signer is identified by the email address. The email subject is required.
     * @param accountId The ID of the DocuSign account that is responsible for sending the envelope
     * @param file a file handle to the document to be signed
     * @param emailSubject the email subject string
     * @param signerEmail a valid recipient email address. Used as an authentication method
     * @return an envelope summary that contains the envelope ID and status
     * @throws Exception API Error message or any other error or exception that can occur while
     * sending the envelope
     * @see EnvelopesApi
     * @see EnvelopeDefinition
     * @see EnvelopeSummary
     */
    public EnvelopeSummary requestSignatureFromDocument(final String accountId, File file, String emailSubject, String signerEmail) throws Exception {
        EnvelopeSummary result = null;
        String errorMessage = null;
        byte[] fileBytes = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[8192];
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    baos.write(buffer, 0, bytesRead);
                }
                fileBytes = baos.toByteArray();
                if (fileBytes == null) {
                    throw new Exception("Invalid file argument.");
                }
            } finally {
                baos.close();
                fis.close();
            }
        } catch (Exception e) {
            throw new Exception("Error while calling EnvelopesHelper requestSignatureFromDocument: " + e.getMessage());
        }

        // create an envelope that will hold all the document(s), field(s), and
        // recipient(s)
        EnvelopeDefinition envDef = new EnvelopeDefinition();
        envDef.setEmailSubject(emailSubject);

        // add a document to the envelope
        Document doc = new Document();
        // the document is passed to DocuSign API as a Base64 string. Multipart is also supported.
        String base64Doc = Base64.encodeToString(fileBytes, Base64.NO_WRAP);
        doc.setDocumentBase64(base64Doc);
        // you can give whatever name you want. It doesn't have to be the same
        // as the document filename
        doc.setName("Document to sign");
        // a good practice is to give the document an ID and refer to it in other API calls.
        doc.setDocumentId("1");

        // DocuSign envelopes could hold several documents
        List<Document> docs = new ArrayList<>();
        docs.add(doc);
        envDef.setDocuments(docs);

        // add a recipient to sign the document, identified by name and email we
        // used above
        Signer signer = new Signer();
        signer.setEmail(signerEmail);
        // You can set the signer name here. It doesn't have to be an email
        signer.setName(signerEmail);
        // a good practice is to assign an ID to each recipients and refer to it in other API calls
        signer.setRecipientId("1");

        // create a signHere tab somewhere on the document for the signer to
        // sign. Default unit of measurement for X and Y is pixels, can be mms, cms, inches also
        SignHere signHere = new SignHere();
        signHere.setDocumentId("1");
        signHere.setPageNumber("1");
        signHere.setRecipientId("1");
        signHere.setXPosition("150");
        signHere.setYPosition("10");

        // can have multiple tabs, so need to add to envelope as a single element list
        List<SignHere> signHereTabs = new ArrayList<>();
        signHereTabs.add(signHere);
        Tabs tabs = new Tabs();
        tabs.setSignHereTabs(signHereTabs);
        // tabs are always assigned to one signer
        signer.setTabs(tabs);

        // add recipients (in this case a single signer) to the envelope
        List<Signer> signers = new ArrayList<>();
        signers.add(signer);
        Recipients recipients = new Recipients();
        recipients.setSigners(signers);
        envDef.setRecipients(recipients);

        // email the envelope by setting status to "sent". To save as a draft set to "created"
        envDef.setStatus("sent");

        try {
            // instantiate a new EnvelopesApi object
            EnvelopesApi envelopesApi = mApiClient.createService(EnvelopesApi.class);
            // this makes an API call to DocuSign API to create and send the envelope, based on its definition
            Response<EnvelopeSummary> response = envelopesApi.createEnvelope(accountId, null, null, null, envDef).execute();
            EnvelopeSummary envelopeSummary = response.body();
            if (response.errorBody() != null)
                errorMessage = response.errorBody().string();
            if (envelopeSummary != null) result = envelopeSummary;
            if (errorMessage != null) {
                throw new Exception("Error while calling DocuSign API: " + errorMessage);
            }
            return result;
        } catch (Exception ex) {
            throw new Exception("Error while calling EnvelopesHelper requestSignatureFromDocument: " + ex.getMessage());
        }
    }

    /**
     *
     * Creates and displays a DocuSign envelope that contains one document, passed a File argument. The
     * signer is identified by the email address. After done signing, the webview loads the return URL that is passed as an argument.
     * @param accountId The ID of the DocuSign account that is responsible for sending the envelope
     * @param file a file handle to the document to be signed
     * @param returnUrl the URL that the web view should load after done signing
     * @param signerEmail The recipient email address. Used as an authentication method
     * @return A data structure that has 1) the URL that webview should load in order to display
     * the DocuSign experience. 2) the completed envelope's ID
     * @throws Exception API Error message or any other error or exception that can occur while
     * sending the envelope
     * @see EnvelopesApi
     * @see EnvelopeDefinition
     * @see RecipientViewRequest
     * @see ViewUrl
     */
    public EmbeddedEnvelopeSummary requestEmbeddedSignatureFromDocument(final String accountId, File file, String returnUrl, String signerEmail) throws Exception {
        String errorMessage = null;
        byte[] fileBytes = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[8192];
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    baos.write(buffer, 0, bytesRead);
                }
                fileBytes = baos.toByteArray();
                if (fileBytes == null) {
                    throw new Exception("Invalid file argument.");
                }
            } finally {
                baos.close();
                fis.close();
            }
        } catch (Exception ex) {
            throw new Exception("Error while calling EnvelopesHelper requestEmbeddedSignatureFromDocument: " + ex.getMessage());
        }

        // create an envelope that will hold all the document(s), field(s), and
        // recipient(s)
        EnvelopeDefinition envDef = new EnvelopeDefinition();

        // add a document to the envelope
        Document doc = new Document();
        // the document is passed to DocuSign API as a Base64 string. Multipart is also supported.
        String base64Doc = Base64.encodeToString(fileBytes, Base64.NO_WRAP);
        doc.setDocumentBase64(base64Doc);
        // you can give whatever name you want. It doesn't have to be the same
        // as the document filename
        doc.setName("Document to sign");
        // a good practice is to give the document an ID and refer to it in other API calls.
        doc.setDocumentId("1");

        // DocuSign envelopes could hold several documents
        List<Document> docs = new ArrayList<>();
        docs.add(doc);
        envDef.setDocuments(docs);

        Signer signer = new Signer();
        signer.setEmail(signerEmail);
        // you can set the signer name here. It doesn't have to be an email
        signer.setName(signerEmail);
        signer.setRecipientId("1");
        // for embedded-signing it's required to set the client userId
        signer.setClientUserId("1001");

        // create a signHere tab somewhere on the document for the signer to
        // sign. Default unit of measurement is pixels, can be mms, cms, inches also
        SignHere signHere = new SignHere();
        signHere.setDocumentId("1");
        signHere.setPageNumber("1");
        signHere.setRecipientId("1");
        signHere.setXPosition("150");
        signHere.setYPosition("10");

        // can have multiple tabs, so need to add to envelope as a single element list
        List<SignHere> signHereTabs = new ArrayList<>();
        signHereTabs.add(signHere);
        Tabs tabs = new Tabs();
        tabs.setSignHereTabs(signHereTabs);
        // tabs are always assigned to one signer
        signer.setTabs(tabs);

        // add recipients (in this case a single signer) to the envelope
        List<Signer> signers = new ArrayList<>();
        signers.add(signer);
        Recipients recipients = new Recipients();
        recipients.setSigners(signers);
        envDef.setRecipients(recipients);

        // set the envelope status and email subject
        envDef.setEmailSubject("Please Sign my Android Sample Envelope");
        envDef.setStatus("sent");

        try {
            // instantiate a new EnvelopesApi object
            EnvelopesApi envelopesApi = mApiClient.createService(EnvelopesApi.class);
            // this makes an API call to DocuSign API to create and send the envelope, based on its definition
            Response<EnvelopeSummary> response = envelopesApi.createEnvelope(accountId, null, null, null, envDef).execute();
            EnvelopeSummary envelopeSummary = response.body();
            if (response.errorBody() != null)
                errorMessage = response.errorBody().string();
            if (errorMessage != null) {
                throw new Exception("Error while calling DocuSign API: " + errorMessage);
            }

            // get the envelope ID in order to use it for embedded signing
            String envelopeId = envelopeSummary.getEnvelopeId();

            // set the url where you want the recipient to go once they are done signing
            RecipientViewRequest recipientViewRequest = new RecipientViewRequest();
            recipientViewRequest.setReturnUrl(returnUrl);
            recipientViewRequest.setAuthenticationMethod("email");
            // signer info has to be the same as the one passed to the previous API call to createEnvelope!
            recipientViewRequest.setEmail(signerEmail);
            recipientViewRequest.setUserName(signerEmail);
            recipientViewRequest.setRecipientId("1");
            // this has to match with the client userId mentioned in the envelope signer definition
            recipientViewRequest.setClientUserId("1001");
            // call the CreateRecipientView API
            Response<ViewUrl> response2 = envelopesApi.createRecipientView(accountId, envelopeId, recipientViewRequest).execute();
            ViewUrl recipientView = response2.body();
            if (response.errorBody() != null)
                errorMessage = response.errorBody().string();
            if (errorMessage != null) {
                throw new Exception("Error while calling DocuSign API: " + errorMessage);
            }

            return new EmbeddedEnvelopeSummary(envelopeId, recipientView.getUrl());
        } catch (Exception ex) {
            throw new Exception("Error while calling EnvelopesHelper requestEmbeddedSignatureFromDocument: " + ex.getMessage());
        }
    }

    /**
     * Downloads the document identified by documentId from DocuSign cloud.
     * @param accountId the ID of the account under which the requested document was transacted
     * @param envelopeId the ID of the envelope that contains the document to be downloaded
     * @param documentId the ID of the document to be downloaded
     * @return a byte array representing the downloaded document
     * @throws Exception API Error message or any other error or exception that can occur while
     * downloading the document from DocuSign cloud
     */
    public byte[] getEnvelopeDocument(String accountId, String envelopeId, String documentId) throws Exception {
        String errorMessage = null;
        byte[] documentFile;
        try {
            // instantiate the OKHttp client with the right data converter
            //ProtoConverterFactory protoConverterFactory = ProtoConverterFactory.create();
            //Retrofit.Builder adapterBuilder = new retrofit2.Retrofit.Builder().baseUrl(BaseUrl).addConverterFactory(protoConverterFactory);
            //adapterBuilder.build();
            //mApiClient.setAdapterBuilder(adapterBuilder);

            // instantiate a new EnvelopesApi object
            EnvelopesApi envelopesApi = mApiClient.createService(EnvelopesApi.class);

            // call the getDocument API
            Response<ResponseBody> response = envelopesApi.getDocument(accountId, documentId, envelopeId, null, null, null, null, null, null, null).execute();
            documentFile = response.body().bytes();
            if (response.errorBody() != null)
                errorMessage = response.errorBody().string();
            if (errorMessage != null) {
                throw new Exception("Error while calling DocuSign API: " + errorMessage);
            }

        } catch (Exception ex) {
            throw new Exception("Error while calling EnvelopesHelper getEnvelopeDocument: " + ex.getMessage());
        }
        return documentFile;
    }

    /*
    public String getEnvelopeInformation(String accountId, String envelopeId, String documentId) throws Exception {
        String errorMessage = null;
        String result;
        try {
            // call the createEnvelope() API
            // instantiate a new EnvelopesApi object
            EnvelopesApi envelopesApi = mApiClient.createService(EnvelopesApi.class);

            // call the getEnvelope() API
            //Envelope env = envelopesApi.getEnvelope(null, null, accountId, envelopeId).execute().body();
            //Log.i("DSHelper", "Envelope: " + env);

            // call the listRecipients() API
            //Recipients recips = envelopesApi.listRecipients(null, null, null, null, accountId, envelopeId).execute().body();
            //Log.i("DSHelper", "Recipients: " + recips);

            // call the listStatusChanges() API
            //EnvelopesApi.ListStatusChangesOptions options = envelopesApi.new ListStatusChangesOptions();
            //options.setFromDate("2000/01/01");
            Response<EnvelopesInformation> response = envelopesApi.listStatusChanges(accountId, null, null, null, null, null, null, null, null, null, "2000/01/01", null, null, null, null, null, null, null, null, null, null, null, null, null, null).execute();
            EnvelopesInformation envelopes = response.body();
            if (response.errorBody() != null)
                errorMessage = response.errorBody().string();
            if (errorMessage != null) {
                throw new Exception("Error while calling DocuSign API: " + errorMessage);
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
            result = "<html><body><table border=\"solid\" style=\"width:100%\">" +
                    "  <tr><th>Status</th>\n" +
                    "      <th>ID</th>\n" +
                    "      <th>Date</th></tr>";
            for (Envelope envelope :
                    envelopes.getEnvelopes()) {
                java.util.Date date = sdf.parse(envelope.getStatusChangedDateTime());
                result += "</tr><td>" + envelope.getStatus() + "</td><td>" + "<a href=\"" + this.mApiClient.getBaseUrl() + "/v2/accounts/" + accountId + envelope.getEnvelopeUri() + "\">" + envelope.getEnvelopeId() + "</a>" + "</td><td>" + sdf.format(date) + "</td></tr>";
            }
            result += "</table></body></html>";
            // call the getDocument() API
            //byte[] document = envelopesApi.getDocument(accountId, envelopeId, documentId).execute().body();
            // Log.i("Document " + documentId + " from envelope " +
            // envelopeId + " has been downloaded to "
            // + new String(document));

        } catch (Exception ex) {
            throw new Exception("Error while calling EnvelopesHelper getEnvelopeInformation: " + ex.getMessage());
        }
        return result;
    }*/

    public class EmbeddedEnvelopeSummary {
        public String envelopeId;
        public String url;

        public EmbeddedEnvelopeSummary(String envelopeId, String url) {
            this.envelopeId = envelopeId;
            this.url = url;
        }
    }
}