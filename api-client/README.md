# DocuSign Android Client - Beta
A basic android-retrofit2-okhttp3 client for DocuSign eSignature API

## using this lib in your Android app
- In your Android project add the jar as a local dependency (since it's not published in Maven/JCenter yet):
  - Copy the lib into your project:
  ```bash
  cp ./build/libs/docusign-esign-android-0.0.1.jar <myProjectRootFolder>/app/libs
  ```
  - In the **app** build.gradle add:
  ```gradle
  android {
    packagingOptions {
      pickFirst 'META-INF/NOTICE'
      pickFirst 'META-INF/NOTICE.txt'
      pickFirst 'META-INF/LICENSE'
      pickFirst 'META-INF/LICENSE.txt'
      pickFirst 'META-INF/DEPENDENCIES'
    }
  }
  dependencies {
    testCompile 'junit:junit:4.12'
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile "com.squareup.retrofit2:retrofit:2.0.2"
    compile "com.squareup.retrofit2:converter-scalars:2.0.2"
    compile "com.squareup.retrofit2:converter-gson:2.0.2"
    compile "io.swagger:swagger-annotations:1.5.8"
    compile "org.apache.oltu.oauth2:org.apache.oltu.oauth2.client:1.0.1"
    compile "joda-time:joda-time:2.9.3"
  }
  ```
  
 - Here is an example of using the lib to do the login call:
 ```java
 public List<LoginAccount> login(String email, String password, String integratorKey) {
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
            Log.d("DSHelper", "before login");
            LoginInformation loginInfo = authApi.login("true", "true", "true", "all").execute().body();
            // note that a given user may be a member of multiple accounts
            Log.d("DSHelper", "after login: " + (loginInfo == null ? "No accounts found" : loginInfo.getLoginAccounts().get(0).getUserName()));
            if (loginInfo != null) loginAccounts = loginInfo.getLoginAccounts();
      } catch (Exception ex) {
          Log.e("DSHelper", "Exception: " + ex.getMessage());
      }
      return loginAccounts;
  }
  ```

## Let me build it myself!
./gradlew build
