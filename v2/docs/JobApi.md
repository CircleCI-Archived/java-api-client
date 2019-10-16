# JobApi

All URIs are relative to *https://circleci.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelJob**](JobApi.md#cancelJob) | **POST** /project/{project-slug}/job/{job-number}/cancel | Cancel job



## cancelJob

> MessageResponse cancelJob(jobNumber, projectSlug)

Cancel job

Cancel job with a given job number.

### Example

```java
// Import classes:
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.auth.*;
import com.circleci.client.v2.models.*;
import com.circleci.client.v2.api.JobApi;

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

        JobApi apiInstance = new JobApi(defaultClient);
        Object jobNumber = 123; // Object | The number of the job.
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        try {
            MessageResponse result = apiInstance.cancelJob(jobNumber, projectSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobApi#cancelJob");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobNumber** | [**Object**](.md)| The number of the job. | [default to null]
 **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. |

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** |  |  -  |

