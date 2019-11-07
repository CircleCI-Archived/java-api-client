# DefaultApi

All URIs are relative to *https://circleci.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelJob**](DefaultApi.md#cancelJob) | **POST** /project/{project-slug}/job/{job-number}/cancel | Cancel job
[**cancelWorkflow**](DefaultApi.md#cancelWorkflow) | **POST** /workflow/{id}/cancel | Cancel a workflow
[**createCheckoutKey**](DefaultApi.md#createCheckoutKey) | **POST** /project/{project-slug}/checkout-key | Create a new checkout key
[**createEnvVar**](DefaultApi.md#createEnvVar) | **POST** /project/{project-slug}/envvar | Create an environment variable
[**deleteCheckoutKey**](DefaultApi.md#deleteCheckoutKey) | **DELETE** /project/{project-slug}/checkout-key/{fingerprint} | Delete a checkout key
[**deleteEnvVar**](DefaultApi.md#deleteEnvVar) | **DELETE** /project/{project-slug}/envvar/{name} | Delete an environment variable
[**getCheckoutKey**](DefaultApi.md#getCheckoutKey) | **GET** /project/{project-slug}/checkout-key/{fingerprint} | Get a checkout key
[**getCollaborations**](DefaultApi.md#getCollaborations) | **GET** /me/collaborations | Collaborations
[**getCurrentUser**](DefaultApi.md#getCurrentUser) | **GET** /me | User Information
[**getEnvVar**](DefaultApi.md#getEnvVar) | **GET** /project/{project-slug}/envvar/{name} | Get masked environment variables
[**getJobArtifacts**](DefaultApi.md#getJobArtifacts) | **GET** /project/{project-slug}/{job-number}/artifacts | Get a job&#39;s artifacts
[**getJobDetails**](DefaultApi.md#getJobDetails) | **GET** /project/{project-slug}/job/{job-number} | Get job details
[**getPipelineById**](DefaultApi.md#getPipelineById) | **GET** /pipeline/{pipeline-id} | Get a pipeline
[**getPipelineConfigById**](DefaultApi.md#getPipelineConfigById) | **GET** /pipeline/{pipeline-id}/config | Get a pipeline&#39;s configuration
[**getProjectBySlug**](DefaultApi.md#getProjectBySlug) | **GET** /project/{project-slug} | Get a project
[**getTests**](DefaultApi.md#getTests) | **GET** /project/{project-slug}/{job-number}/tests | Get test metadata
[**getWorkflowById**](DefaultApi.md#getWorkflowById) | **GET** /workflow/{id} | Get a workflow
[**listCheckoutKeys**](DefaultApi.md#listCheckoutKeys) | **GET** /project/{project-slug}/checkout-key | Get all checkout keys
[**listEnvVars**](DefaultApi.md#listEnvVars) | **GET** /project/{project-slug}/envvar | Get an environment variable
[**listMyPipelines**](DefaultApi.md#listMyPipelines) | **GET** /project/{project-slug}/pipeline/mine | Get your pipelines
[**listPipelinesForProject**](DefaultApi.md#listPipelinesForProject) | **GET** /project/{project-slug}/pipeline | Get all pipelines
[**listWorkflowJobs**](DefaultApi.md#listWorkflowJobs) | **GET** /workflow/{id}/jobs | Get a workflow&#39;s jobs
[**triggerPipeline**](DefaultApi.md#triggerPipeline) | **POST** /project/{project-slug}/pipeline | Trigger a new pipeline



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
        Object jobNumber = 123; // Object | The number of the job.
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        try {
            MessageResponse result = apiInstance.cancelJob(jobNumber, projectSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#cancelJob");
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


## cancelWorkflow

> MessageResponse cancelWorkflow(id)

Cancel a workflow

Cancels a running workflow.

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
        UUID id = new UUID(); // UUID | The unique ID of the workflow.
        try {
            MessageResponse result = apiInstance.cancelWorkflow(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#cancelWorkflow");
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
 **id** | [**UUID**](.md)| The unique ID of the workflow. |

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
| **202** | A confirmation message. |  -  |


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
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        CheckoutKeyInput checkoutKeyInput = new CheckoutKeyInput(); // CheckoutKeyInput | 
        try {
            CheckoutKey result = apiInstance.createCheckoutKey(projectSlug, checkoutKeyInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createCheckoutKey");
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
| **201** | The checkout key. |  -  |


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
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        EnvironmentVariablePair1 environmentVariablePair1 = new EnvironmentVariablePair1(); // EnvironmentVariablePair1 | 
        try {
            EnvironmentVariablePair result = apiInstance.createEnvVar(projectSlug, environmentVariablePair1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createEnvVar");
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
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        String fingerprint = c9:0b:1c:4f:d5:65:56:b9:ad:88:f9:81:2b:37:74:2f; // String | An SSH key fingerprint.
        try {
            MessageResponse result = apiInstance.deleteCheckoutKey(projectSlug, fingerprint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteCheckoutKey");
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
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        String name = foo; // String | The name of the environment variable.
        try {
            MessageResponse result = apiInstance.deleteEnvVar(projectSlug, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteEnvVar");
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
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        String fingerprint = c9:0b:1c:4f:d5:65:56:b9:ad:88:f9:81:2b:37:74:2f; // String | An SSH key fingerprint.
        try {
            CheckoutKey result = apiInstance.getCheckoutKey(projectSlug, fingerprint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getCheckoutKey");
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


## getCollaborations

> List&lt;Collaboration&gt; getCollaborations()

Collaborations

Provides the set of organizations of which a user is a member or a collaborator.  The set of organizations that a user can collaborate on is composed of:  * Organizations that the current user belongs to across VCS types (e.g. BitBucket, GitHub) * The parent organization of repository that the user can collaborate on, but is not necessarily a member of * The organization of the current user&#39;s account

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
            User result = apiInstance.getCurrentUser();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getCurrentUser");
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
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        String name = foo; // String | The name of the environment variable.
        try {
            EnvironmentVariablePair result = apiInstance.getEnvVar(projectSlug, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getEnvVar");
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


## getJobArtifacts

> ArtifactListResponse getJobArtifacts(jobNumber, projectSlug)

Get a job&#39;s artifacts

Returns a job&#39;s artifacts.

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
        Object jobNumber = 123; // Object | The number of the job.
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        try {
            ArtifactListResponse result = apiInstance.getJobArtifacts(jobNumber, projectSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getJobArtifacts");
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

[**ArtifactListResponse**](ArtifactListResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of the job&#39;s artifacts. |  -  |


## getJobDetails

> JobDetails getJobDetails(jobNumber, projectSlug)

Get job details

Returns job details.

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
        Object jobNumber = 123; // Object | The number of the job.
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        try {
            JobDetails result = apiInstance.getJobDetails(jobNumber, projectSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getJobDetails");
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

[**JobDetails**](JobDetails.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Job details. |  -  |


## getPipelineById

> PipelineWithWorkflows getPipelineById(pipelineId)

Get a pipeline

Returns a pipeline by ID.

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
        UUID pipelineId = new UUID(); // UUID | The unique ID of the pipeline.
        try {
            PipelineWithWorkflows result = apiInstance.getPipelineById(pipelineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getPipelineById");
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
 **pipelineId** | [**UUID**](.md)| The unique ID of the pipeline. |

### Return type

[**PipelineWithWorkflows**](PipelineWithWorkflows.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A pipeline object. |  -  |


## getPipelineConfigById

> PipelineConfig getPipelineConfigById(pipelineId)

Get a pipeline&#39;s configuration

Returns a pipeline&#39;s configuration by ID.

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
        UUID pipelineId = new UUID(); // UUID | The unique ID of the pipeline.
        try {
            PipelineConfig result = apiInstance.getPipelineConfigById(pipelineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getPipelineConfigById");
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
 **pipelineId** | [**UUID**](.md)| The unique ID of the pipeline. |

### Return type

[**PipelineConfig**](PipelineConfig.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The configuration strings for the pipeline. |  -  |


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
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        try {
            Project result = apiInstance.getProjectBySlug(projectSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getProjectBySlug");
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


## getTests

> TestsResponse getTests(jobNumber, projectSlug)

Get test metadata

Get test metadata for a build.

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
        Object jobNumber = 123; // Object | The number of the job.
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        try {
            TestsResponse result = apiInstance.getTests(jobNumber, projectSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getTests");
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

[**TestsResponse**](TestsResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of test results. |  -  |


## getWorkflowById

> Workflow getWorkflowById(id)

Get a workflow

Returns summary fields of a workflow by ID.

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
        UUID id = new UUID(); // UUID | The unique ID of the workflow.
        try {
            Workflow result = apiInstance.getWorkflowById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getWorkflowById");
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
 **id** | [**UUID**](.md)| The unique ID of the workflow. |

### Return type

[**Workflow**](Workflow.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A workflow object. |  -  |


## listCheckoutKeys

> CheckoutKeyListResponse listCheckoutKeys(projectSlug)

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
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        try {
            CheckoutKeyListResponse result = apiInstance.listCheckoutKeys(projectSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listCheckoutKeys");
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

[**CheckoutKeyListResponse**](CheckoutKeyListResponse.md)

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

> EnvironmentVariableListResponse listEnvVars(projectSlug)

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
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        try {
            EnvironmentVariableListResponse result = apiInstance.listEnvVars(projectSlug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listEnvVars");
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

[**EnvironmentVariableListResponse**](EnvironmentVariableListResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A sequence of environment variables. |  -  |


## listMyPipelines

> PipelineListResponse listMyPipelines(projectSlug, pageToken)

Get your pipelines

Returns a sequence of all pipelines for this project triggered by the user.

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
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        String pageToken = "pageToken_example"; // String | A token to retrieve the next page of results.
        try {
            PipelineListResponse result = apiInstance.listMyPipelines(projectSlug, pageToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listMyPipelines");
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
 **pageToken** | **String**| A token to retrieve the next page of results. | [optional]

### Return type

[**PipelineListResponse**](PipelineListResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A sequence of pipelines. |  -  |


## listPipelinesForProject

> PipelineListResponse listPipelinesForProject(projectSlug, branch, pageToken)

Get all pipelines

Returns all pipelines for this project.

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
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        String branch = "branch_example"; // String | The name of a vcs branch.
        String pageToken = "pageToken_example"; // String | A token to retrieve the next page of results.
        try {
            PipelineListResponse result = apiInstance.listPipelinesForProject(projectSlug, branch, pageToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listPipelinesForProject");
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
 **branch** | **String**| The name of a vcs branch. | [optional]
 **pageToken** | **String**| A token to retrieve the next page of results. | [optional]

### Return type

[**PipelineListResponse**](PipelineListResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A sequence of pipelines. |  -  |


## listWorkflowJobs

> WorkflowJobListResponse listWorkflowJobs(id)

Get a workflow&#39;s jobs

Returns a sequence of jobs for a workflow.

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
        UUID id = new UUID(); // UUID | The unique ID of the workflow.
        try {
            WorkflowJobListResponse result = apiInstance.listWorkflowJobs(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listWorkflowJobs");
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
 **id** | [**UUID**](.md)| The unique ID of the workflow. |

### Return type

[**WorkflowJobListResponse**](WorkflowJobListResponse.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated sequence of jobs. |  -  |


## triggerPipeline

> PipelineLight triggerPipeline(projectSlug, triggerPipelineParameters)

Trigger a new pipeline

Triggers a new pipeline on the project.

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
        String projectSlug = gh/CircleCI-Public/api-preview-docs; // String | Project slug in the form `vcs-slug/org-name/repo-name`. The `/` characters may be URL-escaped.
        TriggerPipelineParameters triggerPipelineParameters = new TriggerPipelineParameters(); // TriggerPipelineParameters | 
        try {
            PipelineLight result = apiInstance.triggerPipeline(projectSlug, triggerPipelineParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#triggerPipeline");
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
 **triggerPipelineParameters** | [**TriggerPipelineParameters**](TriggerPipelineParameters.md)|  | [optional]

### Return type

[**PipelineLight**](PipelineLight.md)

### Authorization

[api_key_header](../README.md#api_key_header), [api_key_query](../README.md#api_key_query), [basic_auth](../README.md#basic_auth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created pipeline. |  -  |

