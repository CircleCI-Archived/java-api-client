# DefaultApi

All URIs are relative to *https://circleci.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCollaborations**](DefaultApi.md#getCollaborations) | **GET** /me/collaborations | The set of organziations for which a user is a member or a collaborator.



## getCollaborations

> List&lt;Collaboration&gt; getCollaborations()

The set of organziations for which a user is a member or a collaborator.

Provides all collaborations which are organizations including 1) orgs that the current user belongs to (BB &amp; GH), 2) orgs that they do not belong to but they collaborate on repos (BB &amp; GH), and 3) current user&#39;s account

### Example

```java
// Import classes:
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.auth.*;
import com.circleci.client.v2.models.*;
import com.circleci.client.v2.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<Collaboration> result = apiInstance.getCollaborations();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getCollaborations");
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

[**List&lt;Collaboration&gt;**](Collaboration.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Collaborations |  -  |

