# DocuSign Android Starter Kit [BETA]

![Alt text](/android_sample_app.png?raw=true "Android Sample App")

This DocuSign Android Client [BETA] can be used to quickly integrate the eSignature REST API into your Android apps. Included with the kit is a sample app that demonstrates the `Request Signature` and `Embedded Signing` API workflows. Get started by signing up for a free [developer sandbox](https://www.docusign.com/developer-center).

Requirements
============

* Java 1.7 or later.  
* Android Studio

Installation
============

1. Clone or download this repository.
2. Open Android Studio and select 'Open an existing Android Studio project'
3. Point to the local repo you copied to your machine. 
4. If build errors occur click error links to download missing project dependencies.
5. Run

### Adding JAR 

Or you can manually download and add the following JAR to your project:

* The [docusign-esign-android-0.0.1](/api-client/target/docusign-esign-android-0.0.1.jar) JAR.

#### Dependencies

This client has the following external dependencies:

* io.swagger:swagger-annotations:jar:1.5.8
* com.squareup.retrofit2:retrofit:2.0.2
* com.squareup.retrofit2:converter-scalars:2.0.2
* com.squareup.retrofit2:converter-gson:2.0.2
* compile "org.apache.oltu.oauth2:org.apache.oltu.oauth2.client:1.0.1
* joda-time:joda-time:2.9.3

#### In case of build errors 

If you encounter build errors due to duplicate definitions, include the following in your build.gradle module:

```
android {
   packagingOptions {
      pickFirst 'META-INF/NOTICE'
      pickFirst 'META-INF/NOTICE.txt'
      pickFirst 'META-INF/LICENSE'
      pickFirst 'META-INF/LICENSE.txt'
      pickFirst 'META-INF/DEPENDENCIES'
   }
}
```

### Package Managers

This client is not available through package managers yet. Please use this folder until then.


#### Let me build it myself!
./api-client/gradlew build

API Client documentation
========================
Open the [Javadoc](/api-client/target/apidocs) in your browser.

Usage
=====

##Run the sample app
Using gradle, run the embedded-signing-with-google sample. Don't forget to change the DocuSign client ID and client secret in ./samples/embedded-signing-with-google/.../utils/Config.java

##Basic Usage

To send a signature request from a Template:

```java
import com.docusign.esign.api.*;
import com.docusign.esign.client.*;
import com.docusign.esign.model.*;

import java.util.List;

public class DocuSignExample {
  public static void main(String[] args) {
    // create JSON formatted auth. header
    String creds = "{\"Username\":\"" + email + "\",\"Password\":\"" + password + "\",\"IntegratorKey\":\"" + integratorKey + "\"}";
    // list of user account(s)
    List<LoginAccount> loginAccounts = null;
    
    ApiKeyAuth apiKeyAuth = new ApiKeyAuth("header", "X-DocuSign-Authentication");
    apiKeyAuth.setApiKey(creds);

    // This order is very important!
    ApiClient apiClient = new ApiClient();
    apiClient.setBaseUrl(BaseUrl);
    apiClient.createDefaultAdapter();
    apiClient.addAuthorization("apiKeyAuth", apiKeyAuth);

    try {
        // login call available off the AuthenticationApi
          AuthenticationApi authApi = apiClient.createService(AuthenticationApi.class);
          AuthenticationApi authApi = mApiClient.createService(AuthenticationApi.class);
          // make the API call to get the account(s) information
          Response<LoginInformation> response = authApi.login("true", "true", "true", "all").execute();
          LoginInformation loginInfo = response.body();// note that a given user may be a member of multiple accounts
          if (loginInfo != null) loginAccounts = loginInfo.getLoginAccounts();
    } catch (Exception ex) {
        Log.e("DSHelper", "Exception: " + ex.getMessage());
    }
      /////////////////////////////////////////////////////////////////////////////////////////////////////////
      // *** STEP 2: CREATE ENVELOPE FROM TEMPLATE       
      /////////////////////////////////////////////////////////////////////////////////////////////////////////
      // TODO
    }
    catch (com.docusign.esign.client.ApiException ex)
    {
      System.out.println("Exception: " + ex);
    }
  }
} 
```

See [Samples folder](/samples) for more examples.

# Authentication

## Service Integrations that use Legacy Header Authentication

([Legacy Header Authentication](https://docs.docusign.com/esign/guide/authentication/legacy_auth.html) uses the X-DocuSign-Authentication header.)

1. Use the [Authentication: login method](https://docs.docusign.com/esign/restapi/Authentication/Authentication/login/) to retrieve the account number **and the baseUrl** for the account.
The url for the login method is www.docusign.net for production and demo.docusign.net for the developer sandbox.
The `baseUrl` field is part of the `loginAccount` object. See the [docs and the loginAccount object](https://docs.docusign.com/esign/restapi/Authentication/Authentication/login/#/definitions/loginAccount)
2. The baseUrl for the selected account, in production, will start with na1, na2, na3, eu1, or something else. Use the baseUrl that is returned to create the *basePath* (see the next step.) Use the basePath for all of your subsequent API calls.
3. As returned by login method, the baseUrl includes the API version and account id. Split the string to obtain the *basePath*, just the server name and api name. Eg, you will receive `https://na1.docusign.net/restapi/v2/accounts/123123123`. You want just `https://na1.docusign.net/restapi` 
4. Instantiate the SDK using the basePath. Eg `ApiClient apiClient = new ApiClient(basePath);`
5. Set the authentication header as shown in the examples by using `Configuration.Default.AddDefaultHeader`

## User Applications that use OAuth Authentication
1. After obtaining a Bearer token, call the [OAuth: Userinfo method](https://docs.docusign.com/esign/guide/authentication/userinfo.html). Obtain the selected account's `base_uri` (server name) field.
The url for the Userinfo method is account-d.docusign.com for the demo/developer environment, and account.docusign.com for the production environment.
1. Combine the base_uri with "/restapi" to create the basePath. The base_uri will start with na1, na2, na3, eu1, or something else. Use the basePath for your subsequent API calls.
4. Instantiate the SDK using the basePath. Eg `ApiClient apiClient = new ApiClient(basePath);`
5. Create the `authentication_value` by combining the `token_type` and `access_token` fields you receive from either an [Authorization Code Grant](https://docs.docusign.com/esign/guide/authentication/oa2_auth_code.html) or [Implicit Grant](https://docs.docusign.com/esign/guide/authentication/oa2_implicit.html) OAuth flow. 
5. Set the authentication header by using `Configuration.Default.AddDefaultHeader('Authorization', authentication_value)`


Testing
=======

Coming soon...

Support
=======

Feel free to log issues against this client through GitHub.  We also have an active developer community on Stack Overflow, search the [DocuSignAPI](http://stackoverflow.com/questions/tagged/docusignapi) tag.

License
=======

The DocuSign Android Starter Kit [BETA] is licensed under the following [License](LICENSE).
