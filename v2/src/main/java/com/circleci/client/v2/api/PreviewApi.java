package com.circleci.client.v2.api;

import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiResponse;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.Pair;

import javax.ws.rs.core.GenericType;

import com.circleci.client.v2.model.CheckoutKey;
import com.circleci.client.v2.model.CheckoutKeyInput;
import com.circleci.client.v2.model.EnvironmentVariablePair;
import com.circleci.client.v2.model.EnvironmentVariablePair1;
import com.circleci.client.v2.model.MessageResponse;
import com.circleci.client.v2.model.PipelineConfig;
import com.circleci.client.v2.model.PipelineLight;
import com.circleci.client.v2.model.PipelineListResponse;
import com.circleci.client.v2.model.PipelineWithWorkflows;
import com.circleci.client.v2.model.Project;
import com.circleci.client.v2.model.TriggerPipelineParameters;
import java.util.UUID;
import com.circleci.client.v2.model.User;
import com.circleci.client.v2.model.Workflow;
import com.circleci.client.v2.model.WorkflowJobListResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PreviewApi {
  private ApiClient apiClient;

  public PreviewApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PreviewApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Cancel job
   * Cancel job with a given job number.
   * @param jobNumber The number of the job. (required)
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return MessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public MessageResponse cancelJob(Object jobNumber, String projectSlug) throws ApiException {
    return cancelJobWithHttpInfo(jobNumber, projectSlug).getData();
      }

  /**
   * Cancel job
   * Cancel job with a given job number.
   * @param jobNumber The number of the job. (required)
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ApiResponse&lt;MessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MessageResponse> cancelJobWithHttpInfo(Object jobNumber, String projectSlug) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'jobNumber' is set
    if (jobNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'jobNumber' when calling cancelJob");
    }
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling cancelJob");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/job/{job-number}"
      .replaceAll("\\{" + "job-number" + "\\}", apiClient.escapeString(jobNumber.toString()))
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<MessageResponse> localVarReturnType = new GenericType<MessageResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new checkout key
   * Creates a new checkout key. This API request is only usable with a user API token.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param checkoutKeyInput  (optional)
   * @return CheckoutKey
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> The checkout key. </td><td>  -  </td></tr>
     </table>
   */
  public CheckoutKey createCheckoutKey(String projectSlug, CheckoutKeyInput checkoutKeyInput) throws ApiException {
    return createCheckoutKeyWithHttpInfo(projectSlug, checkoutKeyInput).getData();
      }

  /**
   * Create a new checkout key
   * Creates a new checkout key. This API request is only usable with a user API token.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param checkoutKeyInput  (optional)
   * @return ApiResponse&lt;CheckoutKey&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> The checkout key. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CheckoutKey> createCheckoutKeyWithHttpInfo(String projectSlug, CheckoutKeyInput checkoutKeyInput) throws ApiException {
    Object localVarPostBody = checkoutKeyInput;
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling createCheckoutKey");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/checkout-key"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<CheckoutKey> localVarReturnType = new GenericType<CheckoutKey>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create an environment variable
   * Creates a new environment variable.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param environmentVariablePair1  (optional)
   * @return EnvironmentVariablePair
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The environment variable. </td><td>  -  </td></tr>
     </table>
   */
  public EnvironmentVariablePair createEnvVar(String projectSlug, EnvironmentVariablePair1 environmentVariablePair1) throws ApiException {
    return createEnvVarWithHttpInfo(projectSlug, environmentVariablePair1).getData();
      }

  /**
   * Create an environment variable
   * Creates a new environment variable.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param environmentVariablePair1  (optional)
   * @return ApiResponse&lt;EnvironmentVariablePair&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The environment variable. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EnvironmentVariablePair> createEnvVarWithHttpInfo(String projectSlug, EnvironmentVariablePair1 environmentVariablePair1) throws ApiException {
    Object localVarPostBody = environmentVariablePair1;
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling createEnvVar");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/envvar"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<EnvironmentVariablePair> localVarReturnType = new GenericType<EnvironmentVariablePair>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a checkout key
   * Deletes the checkout key.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param fingerprint An SSH key fingerprint. (required)
   * @return MessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A confirmation message. </td><td>  -  </td></tr>
     </table>
   */
  public MessageResponse deleteCheckoutKey(String projectSlug, String fingerprint) throws ApiException {
    return deleteCheckoutKeyWithHttpInfo(projectSlug, fingerprint).getData();
      }

  /**
   * Delete a checkout key
   * Deletes the checkout key.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param fingerprint An SSH key fingerprint. (required)
   * @return ApiResponse&lt;MessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A confirmation message. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MessageResponse> deleteCheckoutKeyWithHttpInfo(String projectSlug, String fingerprint) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling deleteCheckoutKey");
    }
    
    // verify the required parameter 'fingerprint' is set
    if (fingerprint == null) {
      throw new ApiException(400, "Missing the required parameter 'fingerprint' when calling deleteCheckoutKey");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/checkout-key/{fingerprint}"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()))
      .replaceAll("\\{" + "fingerprint" + "\\}", apiClient.escapeString(fingerprint.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<MessageResponse> localVarReturnType = new GenericType<MessageResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an environment variable
   * Deletes the environment variable named :name.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param name The name of the environment variable. (required)
   * @return MessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A confirmation message. </td><td>  -  </td></tr>
     </table>
   */
  public MessageResponse deleteEnvVar(String projectSlug, String name) throws ApiException {
    return deleteEnvVarWithHttpInfo(projectSlug, name).getData();
      }

  /**
   * Delete an environment variable
   * Deletes the environment variable named :name.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param name The name of the environment variable. (required)
   * @return ApiResponse&lt;MessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A confirmation message. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MessageResponse> deleteEnvVarWithHttpInfo(String projectSlug, String name) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling deleteEnvVar");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling deleteEnvVar");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/envvar/{name}"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<MessageResponse> localVarReturnType = new GenericType<MessageResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a checkout key
   * Returns an individual checkout key.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param fingerprint An SSH key fingerprint. (required)
   * @return CheckoutKey
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The checkout key. </td><td>  -  </td></tr>
     </table>
   */
  public CheckoutKey getCheckoutKey(String projectSlug, String fingerprint) throws ApiException {
    return getCheckoutKeyWithHttpInfo(projectSlug, fingerprint).getData();
      }

  /**
   * Get a checkout key
   * Returns an individual checkout key.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param fingerprint An SSH key fingerprint. (required)
   * @return ApiResponse&lt;CheckoutKey&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The checkout key. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CheckoutKey> getCheckoutKeyWithHttpInfo(String projectSlug, String fingerprint) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling getCheckoutKey");
    }
    
    // verify the required parameter 'fingerprint' is set
    if (fingerprint == null) {
      throw new ApiException(400, "Missing the required parameter 'fingerprint' when calling getCheckoutKey");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/checkout-key/{fingerprint}"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()))
      .replaceAll("\\{" + "fingerprint" + "\\}", apiClient.escapeString(fingerprint.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<CheckoutKey> localVarReturnType = new GenericType<CheckoutKey>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * User Information
   * Provides information about the user that is currently signed in.
   * @return User
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User login information. </td><td>  -  </td></tr>
     </table>
   */
  public User getCurrentUser() throws ApiException {
    return getCurrentUserWithHttpInfo().getData();
      }

  /**
   * User Information
   * Provides information about the user that is currently signed in.
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User login information. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<User> getCurrentUserWithHttpInfo() throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/me";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get masked environment variables
   * Returns the masked value of environment variable :name.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param name The name of the environment variable. (required)
   * @return EnvironmentVariablePair
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The environment variable. </td><td>  -  </td></tr>
     </table>
   */
  public EnvironmentVariablePair getEnvVar(String projectSlug, String name) throws ApiException {
    return getEnvVarWithHttpInfo(projectSlug, name).getData();
      }

  /**
   * Get masked environment variables
   * Returns the masked value of environment variable :name.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param name The name of the environment variable. (required)
   * @return ApiResponse&lt;EnvironmentVariablePair&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The environment variable. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EnvironmentVariablePair> getEnvVarWithHttpInfo(String projectSlug, String name) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling getEnvVar");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getEnvVar");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/envvar/{name}"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<EnvironmentVariablePair> localVarReturnType = new GenericType<EnvironmentVariablePair>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a pipeline
   * Returns a pipeline by ID.
   * @param pipelineId The unique ID of the pipeline. (required)
   * @return PipelineWithWorkflows
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A pipeline object. </td><td>  -  </td></tr>
     </table>
   */
  public PipelineWithWorkflows getPipelineById(UUID pipelineId) throws ApiException {
    return getPipelineByIdWithHttpInfo(pipelineId).getData();
      }

  /**
   * Get a pipeline
   * Returns a pipeline by ID.
   * @param pipelineId The unique ID of the pipeline. (required)
   * @return ApiResponse&lt;PipelineWithWorkflows&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A pipeline object. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PipelineWithWorkflows> getPipelineByIdWithHttpInfo(UUID pipelineId) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(400, "Missing the required parameter 'pipelineId' when calling getPipelineById");
    }
    
    // create path and map variables
    String localVarPath = "/pipeline/{pipeline-id}"
      .replaceAll("\\{" + "pipeline-id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<PipelineWithWorkflows> localVarReturnType = new GenericType<PipelineWithWorkflows>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a pipeline&#39;s configuration
   * Returns a pipeline&#39;s configuration by ID.
   * @param pipelineId The unique ID of the pipeline. (required)
   * @return PipelineConfig
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The configuration strings for the pipeline. </td><td>  -  </td></tr>
     </table>
   */
  public PipelineConfig getPipelineConfigById(UUID pipelineId) throws ApiException {
    return getPipelineConfigByIdWithHttpInfo(pipelineId).getData();
      }

  /**
   * Get a pipeline&#39;s configuration
   * Returns a pipeline&#39;s configuration by ID.
   * @param pipelineId The unique ID of the pipeline. (required)
   * @return ApiResponse&lt;PipelineConfig&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The configuration strings for the pipeline. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PipelineConfig> getPipelineConfigByIdWithHttpInfo(UUID pipelineId) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(400, "Missing the required parameter 'pipelineId' when calling getPipelineConfigById");
    }
    
    // create path and map variables
    String localVarPath = "/pipeline/{pipeline-id}/config"
      .replaceAll("\\{" + "pipeline-id" + "\\}", apiClient.escapeString(pipelineId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<PipelineConfig> localVarReturnType = new GenericType<PipelineConfig>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a project
   * Retrieves a project by project slug.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return Project
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A project object </td><td>  -  </td></tr>
     </table>
   */
  public Project getProjectBySlug(String projectSlug) throws ApiException {
    return getProjectBySlugWithHttpInfo(projectSlug).getData();
      }

  /**
   * Get a project
   * Retrieves a project by project slug.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ApiResponse&lt;Project&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A project object </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Project> getProjectBySlugWithHttpInfo(String projectSlug) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling getProjectBySlug");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<Project> localVarReturnType = new GenericType<Project>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a workflow
   * Returns summary fields of a workflow by ID.
   * @param id The unique ID of the workflow. (required)
   * @return Workflow
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A workflow object. </td><td>  -  </td></tr>
     </table>
   */
  public Workflow getWorkflowById(UUID id) throws ApiException {
    return getWorkflowByIdWithHttpInfo(id).getData();
      }

  /**
   * Get a workflow
   * Returns summary fields of a workflow by ID.
   * @param id The unique ID of the workflow. (required)
   * @return ApiResponse&lt;Workflow&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A workflow object. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Workflow> getWorkflowByIdWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWorkflowById");
    }
    
    // create path and map variables
    String localVarPath = "/workflow/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<Workflow> localVarReturnType = new GenericType<Workflow>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all checkout keys
   * Returns a sequence of checkout keys for &#x60;:project&#x60;.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return List&lt;CheckoutKey&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of checkout keys. </td><td>  -  </td></tr>
     </table>
   */
  public List<CheckoutKey> listCheckoutKeys(String projectSlug) throws ApiException {
    return listCheckoutKeysWithHttpInfo(projectSlug).getData();
      }

  /**
   * Get all checkout keys
   * Returns a sequence of checkout keys for &#x60;:project&#x60;.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ApiResponse&lt;List&lt;CheckoutKey&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of checkout keys. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<CheckoutKey>> listCheckoutKeysWithHttpInfo(String projectSlug) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling listCheckoutKeys");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/checkout-key"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<List<CheckoutKey>> localVarReturnType = new GenericType<List<CheckoutKey>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get an environment variable
   * Returns four &#39;x&#39; characters, in addition to the last four ASCII characters of the value, consistent with the display of environment variable values on the CircleCI website.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return List&lt;EnvironmentVariablePair&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of environment variables. </td><td>  -  </td></tr>
     </table>
   */
  public List<EnvironmentVariablePair> listEnvVars(String projectSlug) throws ApiException {
    return listEnvVarsWithHttpInfo(projectSlug).getData();
      }

  /**
   * Get an environment variable
   * Returns four &#39;x&#39; characters, in addition to the last four ASCII characters of the value, consistent with the display of environment variable values on the CircleCI website.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ApiResponse&lt;List&lt;EnvironmentVariablePair&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of environment variables. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<EnvironmentVariablePair>> listEnvVarsWithHttpInfo(String projectSlug) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling listEnvVars");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/envvar"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<List<EnvironmentVariablePair>> localVarReturnType = new GenericType<List<EnvironmentVariablePair>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get your pipelines
   * Returns a sequence of all pipelines for this project triggered by the user.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @return PipelineListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of pipelines. </td><td>  -  </td></tr>
     </table>
   */
  public PipelineListResponse listMyPipelines(String projectSlug, String pageToken) throws ApiException {
    return listMyPipelinesWithHttpInfo(projectSlug, pageToken).getData();
      }

  /**
   * Get your pipelines
   * Returns a sequence of all pipelines for this project triggered by the user.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @return ApiResponse&lt;PipelineListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of pipelines. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PipelineListResponse> listMyPipelinesWithHttpInfo(String projectSlug, String pageToken) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling listMyPipelines");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/pipeline/mine"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page-token", pageToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<PipelineListResponse> localVarReturnType = new GenericType<PipelineListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all pipelines
   * Returns all pipelines for this project.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @return PipelineListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> A sequence of pipelines. </td><td>  -  </td></tr>
     </table>
   */
  public PipelineListResponse listPipelinesForProject(String projectSlug, String pageToken) throws ApiException {
    return listPipelinesForProjectWithHttpInfo(projectSlug, pageToken).getData();
      }

  /**
   * Get all pipelines
   * Returns all pipelines for this project.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @return ApiResponse&lt;PipelineListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> A sequence of pipelines. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PipelineListResponse> listPipelinesForProjectWithHttpInfo(String projectSlug, String pageToken) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling listPipelinesForProject");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/pipeline"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page-token", pageToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<PipelineListResponse> localVarReturnType = new GenericType<PipelineListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a workflow&#39;s jobs
   * Returns a sequence of jobs for a workflow.
   * @param id The unique ID of the workflow. (required)
   * @return WorkflowJobListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated sequence of jobs. </td><td>  -  </td></tr>
     </table>
   */
  public WorkflowJobListResponse listWorkflowJobs(UUID id) throws ApiException {
    return listWorkflowJobsWithHttpInfo(id).getData();
      }

  /**
   * Get a workflow&#39;s jobs
   * Returns a sequence of jobs for a workflow.
   * @param id The unique ID of the workflow. (required)
   * @return ApiResponse&lt;WorkflowJobListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated sequence of jobs. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkflowJobListResponse> listWorkflowJobsWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listWorkflowJobs");
    }
    
    // create path and map variables
    String localVarPath = "/workflow/{id}/jobs"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<WorkflowJobListResponse> localVarReturnType = new GenericType<WorkflowJobListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Trigger a new pipeline
   * Triggers a new pipeline on the project.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param triggerPipelineParameters  (optional)
   * @return PipelineLight
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> The created pipeline. </td><td>  -  </td></tr>
     </table>
   */
  public PipelineLight triggerPipeline(String projectSlug, TriggerPipelineParameters triggerPipelineParameters) throws ApiException {
    return triggerPipelineWithHttpInfo(projectSlug, triggerPipelineParameters).getData();
      }

  /**
   * Trigger a new pipeline
   * Triggers a new pipeline on the project.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param triggerPipelineParameters  (optional)
   * @return ApiResponse&lt;PipelineLight&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> The created pipeline. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PipelineLight> triggerPipelineWithHttpInfo(String projectSlug, TriggerPipelineParameters triggerPipelineParameters) throws ApiException {
    Object localVarPostBody = triggerPipelineParameters;
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling triggerPipeline");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/pipeline"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<PipelineLight> localVarReturnType = new GenericType<PipelineLight>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
