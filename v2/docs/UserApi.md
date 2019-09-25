# UserApi

All URIs are relative to *https://circleci.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentUser**](UserApi.md#getCurrentUser) | **GET** /me | User Information



## getCurrentUser

> User getCurrentUser()

User Information

Provides information about the user that is currently signed in.

### Example

```java
// Import classes:
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.auth.*;
import com.circleci.client.v2.models.*;
import com.circleci.client.v2.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://circleci.com/api/v2");
        
        // Configure API key authorization: api_key_header
        ApiKeyAuth api_key_header = (ApiKeyAuth) defaultClient.getAuthentication("api_key_header");
        api_key_header.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_header.setApiKeyPrefix("Token");

        // Configure API key authorization: api_key_query
        ApiKeyAuth api_key_query = (ApiKeyAuth) defaultClient.getAuthentication("api_key_query");
        api_key_query.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key_query.setApiKeyPrefix("Token");

        // Configure HTTP basic authorization: basic_auth
        HttpBasicAuth basic_auth = (HttpBasicAuth) defaultClient.getAuthentication("basic_auth");
        basic_auth.setUsername("YOUR USERNAME");
        basic_auth.setPassword("YOUR PASSWORD");

        UserApi apiInstance = new UserApi(defaultClient);
        try {
            User result = apiInstance.getCurrentUser();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getCurrentUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User login information. |  -  |

