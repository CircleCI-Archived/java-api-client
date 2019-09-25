# ProjectApi

All URIs are relative to *https://circleci.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCheckoutKey**](ProjectApi.md#createCheckoutKey) | **POST** /project/{project-slug}/checkout-key | Create a new checkout key
[**createEnvVar**](ProjectApi.md#createEnvVar) | **POST** /project/{project-slug}/envvar | Create an environment variable
[**deleteCheckoutKey**](ProjectApi.md#deleteCheckoutKey) | **DELETE** /project/{project-slug}/checkout-key/{fingerprint} | Delete a checkout key
[**deleteEnvVar**](ProjectApi.md#deleteEnvVar) | **DELETE** /project/{project-slug}/envvar/{name} | Delete an environment variable
[**getCheckoutKey**](ProjectApi.md#getCheckoutKey) | **GET** /project/{project-slug}/checkout-key/{fingerprint} | Get a checkout key
[**getEnvVar**](ProjectApi.md#getEnvVar) | **GET** /project/{project-slug}/envvar/{name} | Get masked environment variables
[**getProjectBySlug**](ProjectApi.md#getProjectBySlug) | **GET** /project/{project-slug} | Get a project
[**listCheckoutKeys**](ProjectApi.md#listCheckoutKeys) | **GET** /project/{project-slug}/checkout-key | Get all checkout keys
[**listEnvVars**](ProjectApi.md#listEnvVars) | **GET** /project/{project-slug}/envvar | Get an environment variable



## createCheckoutKey

> CheckoutKey createCheckoutKey(projectSlug, checkoutKeyInput)

Create a new checkout key

Creates a new checkout key. This API request is only usable with a user API token.

### Example

```java
// Import classes:
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.auth.*;
import com.circleci.client.v2.models.*;
import com.circleci.client.v2.api.ProjectApi;

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

        ProjectApi apiInstance = new ProjectApi(defaultClient);
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        CheckoutKeyInput checkoutKeyInput = new CheckoutKeyInput(); // CheckoutKeyInput | 
        try {
            CheckoutKey result = apiInstance.createCheckoutKey(projectSlug, checkoutKeyInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectApi#createCheckoutKey");
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
 **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. |
 **checkoutKeyInput** | [**CheckoutKeyInput**](CheckoutKeyInput.md)|  | [optional]

### Return type

[**CheckoutKey**](CheckoutKey.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The checkout key. |  -  |


## createEnvVar

> EnvironmentVariablePair createEnvVar(projectSlug, environmentVariablePair1)

Create an environment variable

Creates a new environment variable.

### Example

```java
// Import classes:
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.auth.*;
import com.circleci.client.v2.models.*;
import com.circleci.client.v2.api.ProjectApi;

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

        ProjectApi apiInstance = new ProjectApi(defaultClient);
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        EnvironmentVariablePair1 environmentVariablePair1 = new EnvironmentVariablePair1(); // EnvironmentVariablePair1 | 
        try {
            EnvironmentVariablePair result = apiInstance.createEnvVar(projectSlug, environmentVariablePair1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectApi#createEnvVar");
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
 **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. |
 **environmentVariablePair1** | [**EnvironmentVariablePair1**](EnvironmentVariablePair1.md)|  | [optional]

### Return type

[**EnvironmentVariablePair**](EnvironmentVariablePair.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The environment variable. |  -  |


## deleteCheckoutKey

> MessageResponse deleteCheckoutKey(projectSlug, fingerprint)

Delete a checkout key

Deletes the checkout key.

### Example

```java
// Import classes:
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.auth.*;
import com.circleci.client.v2.models.*;
import com.circleci.client.v2.api.ProjectApi;

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

        ProjectApi apiInstance = new ProjectApi(defaultClient);
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        String fingerprint = c9:0b:1c:4f:d5:65:56:b9:ad:88:f9:81:2b:37:74:2f; // String | An SSH key fingerprint.
        try {
            MessageResponse result = apiInstance.deleteCheckoutKey(projectSlug, fingerprint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectApi#deleteCheckoutKey");
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
 **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. |
 **fingerprint** | **String**| An SSH key fingerprint. |

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
| **200** | A confirmation message. |  -  |


## deleteEnvVar

> MessageResponse deleteEnvVar(projectSlug, name)

Delete an environment variable

Deletes the environment variable named :name.

### Example

```java
// Import classes:
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.auth.*;
import com.circleci.client.v2.models.*;
import com.circleci.client.v2.api.ProjectApi;

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

        ProjectApi apiInstance = new ProjectApi(defaultClient);
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        String name = foo; // String | The name of the environment variable.
        try {
            MessageResponse result = apiInstance.deleteEnvVar(projectSlug, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectApi#deleteEnvVar");
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
 **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. |
 **name** | **String**| The name of the environment variable. |

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
| **200** | A confirmation message. |  -  |


## getCheckoutKey

> CheckoutKey getCheckoutKey(projectSlug, fingerprint)

Get a checkout key

Returns an individual checkout key.

### Example

```java
// Import classes:
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.auth.*;
import com.circleci.client.v2.models.*;
import com.circleci.client.v2.api.ProjectApi;

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

        ProjectApi apiInstance = new ProjectApi(defaultClient);
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        String fingerprint = c9:0b:1c:4f:d5:65:56:b9:ad:88:f9:81:2b:37:74:2f; // String | An SSH key fingerprint.
        try {
            CheckoutKey result = apiInstance.getCheckoutKey(projectSlug, fingerprint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectApi#getCheckoutKey");
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
 **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. |
 **fingerprint** | **String**| An SSH key fingerprint. |

### Return type

[**CheckoutKey**](CheckoutKey.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The checkout key. |  -  |


## getEnvVar

> EnvironmentVariablePair getEnvVar(projectSlug, name)

Get masked environment variables

Returns the masked value of environment variable :name.

### Example

```java
// Import classes:
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.auth.*;
import com.circleci.client.v2.models.*;
import com.circleci.client.v2.api.ProjectApi;

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

        ProjectApi apiInstance = new ProjectApi(defaultClient);
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        String name = foo; // String | The name of the environment variable.
        try {
            EnvironmentVariablePair result = apiInstance.getEnvVar(projectSlug, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectApi#getEnvVar");
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
 **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. |
 **name** | **String**| The name of the environment variable. |

### Return type

[**EnvironmentVariablePair**](EnvironmentVariablePair.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The environment variable. |  -  |


## getProjectBySlug

> Project getProjectBySlug(projectSlug)

Get a project

Retrieves a project by project slug.

### Example

```java
// Import classes:
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.auth.*;
import com.circleci.client.v2.models.*;
import com.circleci.client.v2.api.ProjectApi;

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

        ProjectApi apiInstance = new ProjectApi(defaultClient);
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        try {
            Project result = apiInstance.getProjectBySlug(projectSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectApi#getProjectBySlug");
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
 **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. |

### Return type

[**Project**](Project.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A project object |  -  |


## listCheckoutKeys

> List&lt;CheckoutKey&gt; listCheckoutKeys(projectSlug)

Get all checkout keys

Returns a sequence of checkout keys for &#x60;:project&#x60;.

### Example

```java
// Import classes:
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.auth.*;
import com.circleci.client.v2.models.*;
import com.circleci.client.v2.api.ProjectApi;

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

        ProjectApi apiInstance = new ProjectApi(defaultClient);
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        try {
            List<CheckoutKey> result = apiInstance.listCheckoutKeys(projectSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectApi#listCheckoutKeys");
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
 **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. |

### Return type

[**List&lt;CheckoutKey&gt;**](CheckoutKey.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A sequence of checkout keys. |  -  |


## listEnvVars

> List&lt;EnvironmentVariablePair&gt; listEnvVars(projectSlug)

Get an environment variable

Returns four &#39;x&#39; characters, in addition to the last four ASCII characters of the value, consistent with the display of environment variable values on the CircleCI website.

### Example

```java
// Import classes:
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.auth.*;
import com.circleci.client.v2.models.*;
import com.circleci.client.v2.api.ProjectApi;

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

        ProjectApi apiInstance = new ProjectApi(defaultClient);
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        try {
            List<EnvironmentVariablePair> result = apiInstance.listEnvVars(projectSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectApi#listEnvVars");
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
 **projectSlug** | **String**| Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. |

### Return type

[**List&lt;EnvironmentVariablePair&gt;**](EnvironmentVariablePair.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A sequence of environment variables. |  -  |

