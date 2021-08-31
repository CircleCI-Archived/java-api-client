package com.circleci.client.v2.api;

import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiResponse;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.Pair;

import javax.ws.rs.core.GenericType;

import com.circleci.client.v2.model.AnyOfobjectobject;
import com.circleci.client.v2.model.ArtifactListResponse;
import com.circleci.client.v2.model.CheckoutKey;
import com.circleci.client.v2.model.CheckoutKeyInput;
import com.circleci.client.v2.model.CheckoutKeyListResponse;
import com.circleci.client.v2.model.Collaboration;
import com.circleci.client.v2.model.Context;
import com.circleci.client.v2.model.EnvironmentVariableListResponse;
import com.circleci.client.v2.model.EnvironmentVariablePair;
import com.circleci.client.v2.model.EnvironmentVariablePair1;
import com.circleci.client.v2.model.InlineObject;
import com.circleci.client.v2.model.InlineObject1;
import com.circleci.client.v2.model.InlineObject2;
import com.circleci.client.v2.model.InlineResponse200;
import com.circleci.client.v2.model.InlineResponse2001;
import com.circleci.client.v2.model.InlineResponse2002;
import com.circleci.client.v2.model.InlineResponse2003;
import com.circleci.client.v2.model.InlineResponse2004;
import com.circleci.client.v2.model.InlineResponse2005;
import com.circleci.client.v2.model.InlineResponse2006;
import com.circleci.client.v2.model.InlineResponseDefault;
import com.circleci.client.v2.model.JobDetails;
import com.circleci.client.v2.model.MessageResponse;
import java.time.OffsetDateTime;
import com.circleci.client.v2.model.Pipeline;
import com.circleci.client.v2.model.PipelineConfig;
import com.circleci.client.v2.model.PipelineCreation;
import com.circleci.client.v2.model.PipelineListResponse;
import com.circleci.client.v2.model.Project;
import com.circleci.client.v2.model.RerunWorkflowParameters;
import com.circleci.client.v2.model.TestsResponse;
import com.circleci.client.v2.model.TriggerPipelineParameters;
import java.util.UUID;
import com.circleci.client.v2.model.User;
import com.circleci.client.v2.model.Workflow;
import com.circleci.client.v2.model.WorkflowJobListResponse;
import com.circleci.client.v2.model.WorkflowListResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add or update an environment variable
   * Create or update an environment variable within a context. Returns information about the environment variable, not including its value.
   * @param contextId ID of the context (UUID) (required)
   * @param envVarName The name of the environment variable (required)
   * @param inlineObject1  (optional)
   * @return AnyOfobjectobject
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The new environment variable </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public AnyOfobjectobject addEnvironmentVariableToContext(UUID contextId, String envVarName, InlineObject1 inlineObject1) throws ApiException {
    return addEnvironmentVariableToContextWithHttpInfo(contextId, envVarName, inlineObject1).getData();
      }

  /**
   * Add or update an environment variable
   * Create or update an environment variable within a context. Returns information about the environment variable, not including its value.
   * @param contextId ID of the context (UUID) (required)
   * @param envVarName The name of the environment variable (required)
   * @param inlineObject1  (optional)
   * @return ApiResponse&lt;AnyOfobjectobject&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The new environment variable </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnyOfobjectobject> addEnvironmentVariableToContextWithHttpInfo(UUID contextId, String envVarName, InlineObject1 inlineObject1) throws ApiException {
    Object localVarPostBody = inlineObject1;
    
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling addEnvironmentVariableToContext");
    }
    
    // verify the required parameter 'envVarName' is set
    if (envVarName == null) {
      throw new ApiException(400, "Missing the required parameter 'envVarName' when calling addEnvironmentVariableToContext");
    }
    
    // create path and map variables
    String localVarPath = "/context/{context-id}/environment-variable/{env-var-name}"
      .replaceAll("\\{" + "context-id" + "\\}", apiClient.escapeString(contextId.toString()))
      .replaceAll("\\{" + "env-var-name" + "\\}", apiClient.escapeString(envVarName.toString()));

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

    GenericType<AnyOfobjectobject> localVarReturnType = new GenericType<AnyOfobjectobject>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Approve a job
   * Approves a pending approval job in a workflow.
   * @param approvalRequestId The ID of the job being approved. (required)
   * @param id The unique ID of the workflow. (required)
   * @return MessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> A confirmation message. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public MessageResponse approvePendingApprovalJobById(UUID approvalRequestId, UUID id) throws ApiException {
    return approvePendingApprovalJobByIdWithHttpInfo(approvalRequestId, id).getData();
      }

  /**
   * Approve a job
   * Approves a pending approval job in a workflow.
   * @param approvalRequestId The ID of the job being approved. (required)
   * @param id The unique ID of the workflow. (required)
   * @return ApiResponse&lt;MessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> A confirmation message. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MessageResponse> approvePendingApprovalJobByIdWithHttpInfo(UUID approvalRequestId, UUID id) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'approvalRequestId' is set
    if (approvalRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'approvalRequestId' when calling approvePendingApprovalJobById");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling approvePendingApprovalJobById");
    }
    
    // create path and map variables
    String localVarPath = "/workflow/{id}/approve/{approval_request_id}"
      .replaceAll("\\{" + "approval_request_id" + "\\}", apiClient.escapeString(approvalRequestId.toString()))
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

    GenericType<MessageResponse> localVarReturnType = new GenericType<MessageResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
    String localVarPath = "/project/{project-slug}/job/{job-number}/cancel"
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
   * Cancel a workflow
   * Cancels a running workflow.
   * @param id The unique ID of the workflow. (required)
   * @return MessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> A confirmation message. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public MessageResponse cancelWorkflow(UUID id) throws ApiException {
    return cancelWorkflowWithHttpInfo(id).getData();
      }

  /**
   * Cancel a workflow
   * Cancels a running workflow.
   * @param id The unique ID of the workflow. (required)
   * @return ApiResponse&lt;MessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> A confirmation message. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MessageResponse> cancelWorkflowWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cancelWorkflow");
    }
    
    // create path and map variables
    String localVarPath = "/workflow/{id}/cancel"
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

    GenericType<MessageResponse> localVarReturnType = new GenericType<MessageResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Continue a pipeline (Preview)
   * Continue a pipeline from the setup phase.
   * @param inlineObject2  (optional)
   * @return MessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A confirmation message. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public MessageResponse continuePipeline(InlineObject2 inlineObject2) throws ApiException {
    return continuePipelineWithHttpInfo(inlineObject2).getData();
      }

  /**
   * Continue a pipeline (Preview)
   * Continue a pipeline from the setup phase.
   * @param inlineObject2  (optional)
   * @return ApiResponse&lt;MessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A confirmation message. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MessageResponse> continuePipelineWithHttpInfo(InlineObject2 inlineObject2) throws ApiException {
    Object localVarPostBody = inlineObject2;
    
    // create path and map variables
    String localVarPath = "/pipeline/continue";

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
        <tr><td> 201 </td><td> The checkout key. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 201 </td><td> The checkout key. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
   * Create a new context
   * 
   * @param inlineObject  (optional)
   * @return Context
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The new context </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public Context createContext(InlineObject inlineObject) throws ApiException {
    return createContextWithHttpInfo(inlineObject).getData();
      }

  /**
   * Create a new context
   * 
   * @param inlineObject  (optional)
   * @return ApiResponse&lt;Context&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The new context </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Context> createContextWithHttpInfo(InlineObject inlineObject) throws ApiException {
    Object localVarPostBody = inlineObject;
    
    // create path and map variables
    String localVarPath = "/context";

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

    GenericType<Context> localVarReturnType = new GenericType<Context>() {};
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
   * Delete a context
   * 
   * @param contextId ID of the context (UUID) (required)
   * @return MessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A confirmation message </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public MessageResponse deleteContext(UUID contextId) throws ApiException {
    return deleteContextWithHttpInfo(contextId).getData();
      }

  /**
   * Delete a context
   * 
   * @param contextId ID of the context (UUID) (required)
   * @return ApiResponse&lt;MessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A confirmation message </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MessageResponse> deleteContextWithHttpInfo(UUID contextId) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling deleteContext");
    }
    
    // create path and map variables
    String localVarPath = "/context/{context-id}"
      .replaceAll("\\{" + "context-id" + "\\}", apiClient.escapeString(contextId.toString()));

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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
   * Remove an environment variable
   * Delete an environment variable from a context.
   * @param envVarName The name of the environment variable (required)
   * @param contextId ID of the context (UUID) (required)
   * @return MessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A confirmation message </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public MessageResponse deleteEnvironmentVariableFromContext(String envVarName, UUID contextId) throws ApiException {
    return deleteEnvironmentVariableFromContextWithHttpInfo(envVarName, contextId).getData();
      }

  /**
   * Remove an environment variable
   * Delete an environment variable from a context.
   * @param envVarName The name of the environment variable (required)
   * @param contextId ID of the context (UUID) (required)
   * @return ApiResponse&lt;MessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A confirmation message </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MessageResponse> deleteEnvironmentVariableFromContextWithHttpInfo(String envVarName, UUID contextId) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'envVarName' is set
    if (envVarName == null) {
      throw new ApiException(400, "Missing the required parameter 'envVarName' when calling deleteEnvironmentVariableFromContext");
    }
    
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling deleteEnvironmentVariableFromContext");
    }
    
    // create path and map variables
    String localVarPath = "/context/{context-id}/environment-variable/{env-var-name}"
      .replaceAll("\\{" + "env-var-name" + "\\}", apiClient.escapeString(envVarName.toString()))
      .replaceAll("\\{" + "context-id" + "\\}", apiClient.escapeString(contextId.toString()));

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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
   * Collaborations
   * Provides the set of organizations of which a user is a member or a collaborator.  The set of organizations that a user can collaborate on is composed of:  * Organizations that the current user belongs to across VCS types (e.g. BitBucket, GitHub) * The parent organization of repository that the user can collaborate on, but is not necessarily a member of * The organization of the current user&#39;s account
   * @return List&lt;Collaboration&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Collaborations </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public List<Collaboration> getCollaborations() throws ApiException {
    return getCollaborationsWithHttpInfo().getData();
      }

  /**
   * Collaborations
   * Provides the set of organizations of which a user is a member or a collaborator.  The set of organizations that a user can collaborate on is composed of:  * Organizations that the current user belongs to across VCS types (e.g. BitBucket, GitHub) * The parent organization of repository that the user can collaborate on, but is not necessarily a member of * The organization of the current user&#39;s account
   * @return ApiResponse&lt;List&lt;Collaboration&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Collaborations </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Collaboration>> getCollaborationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/me/collaborations";

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

    GenericType<List<Collaboration>> localVarReturnType = new GenericType<List<Collaboration>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a context
   * Returns basic information about a context.
   * @param contextId ID of the context (UUID) (required)
   * @return Context
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The context </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public Context getContext(UUID contextId) throws ApiException {
    return getContextWithHttpInfo(contextId).getData();
      }

  /**
   * Get a context
   * Returns basic information about a context.
   * @param contextId ID of the context (UUID) (required)
   * @return ApiResponse&lt;Context&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The context </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Context> getContextWithHttpInfo(UUID contextId) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling getContext");
    }
    
    // create path and map variables
    String localVarPath = "/context/{context-id}"
      .replaceAll("\\{" + "context-id" + "\\}", apiClient.escapeString(contextId.toString()));

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

    GenericType<Context> localVarReturnType = new GenericType<Context>() {};
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
   * Get a masked environment variable
   * Returns the masked value of environment variable :name.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param name The name of the environment variable. (required)
   * @return EnvironmentVariablePair
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The environment variable. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public EnvironmentVariablePair getEnvVar(String projectSlug, String name) throws ApiException {
    return getEnvVarWithHttpInfo(projectSlug, name).getData();
      }

  /**
   * Get a masked environment variable
   * Returns the masked value of environment variable :name.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param name The name of the environment variable. (required)
   * @return ApiResponse&lt;EnvironmentVariablePair&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The environment variable. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
   * Get a job&#39;s artifacts
   * Returns a job&#39;s artifacts.
   * @param jobNumber The number of the job. (required)
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ArtifactListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of the job&#39;s artifacts. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ArtifactListResponse getJobArtifacts(Object jobNumber, String projectSlug) throws ApiException {
    return getJobArtifactsWithHttpInfo(jobNumber, projectSlug).getData();
      }

  /**
   * Get a job&#39;s artifacts
   * Returns a job&#39;s artifacts.
   * @param jobNumber The number of the job. (required)
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ApiResponse&lt;ArtifactListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of the job&#39;s artifacts. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ArtifactListResponse> getJobArtifactsWithHttpInfo(Object jobNumber, String projectSlug) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'jobNumber' is set
    if (jobNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'jobNumber' when calling getJobArtifacts");
    }
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling getJobArtifacts");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/{job-number}/artifacts"
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

    GenericType<ArtifactListResponse> localVarReturnType = new GenericType<ArtifactListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get job details
   * Returns job details.
   * @param jobNumber The number of the job. (required)
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return JobDetails
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Job details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public JobDetails getJobDetails(Object jobNumber, String projectSlug) throws ApiException {
    return getJobDetailsWithHttpInfo(jobNumber, projectSlug).getData();
      }

  /**
   * Get job details
   * Returns job details.
   * @param jobNumber The number of the job. (required)
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ApiResponse&lt;JobDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Job details. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<JobDetails> getJobDetailsWithHttpInfo(Object jobNumber, String projectSlug) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'jobNumber' is set
    if (jobNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'jobNumber' when calling getJobDetails");
    }
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling getJobDetails");
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

    GenericType<JobDetails> localVarReturnType = new GenericType<JobDetails>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a pipeline
   * Returns a pipeline by ID.
   * @param pipelineId The unique ID of the pipeline. (required)
   * @return Pipeline
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A pipeline object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public Pipeline getPipelineById(UUID pipelineId) throws ApiException {
    return getPipelineByIdWithHttpInfo(pipelineId).getData();
      }

  /**
   * Get a pipeline
   * Returns a pipeline by ID.
   * @param pipelineId The unique ID of the pipeline. (required)
   * @return ApiResponse&lt;Pipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A pipeline object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Pipeline> getPipelineByIdWithHttpInfo(UUID pipelineId) throws ApiException {
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

    GenericType<Pipeline> localVarReturnType = new GenericType<Pipeline>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a pipeline
   * Returns a pipeline by number.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param pipelineNumber The number of the pipeline. (required)
   * @return Pipeline
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A pipeline object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public Pipeline getPipelineByNumber(String projectSlug, Object pipelineNumber) throws ApiException {
    return getPipelineByNumberWithHttpInfo(projectSlug, pipelineNumber).getData();
      }

  /**
   * Get a pipeline
   * Returns a pipeline by number.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param pipelineNumber The number of the pipeline. (required)
   * @return ApiResponse&lt;Pipeline&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A pipeline object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Pipeline> getPipelineByNumberWithHttpInfo(String projectSlug, Object pipelineNumber) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling getPipelineByNumber");
    }
    
    // verify the required parameter 'pipelineNumber' is set
    if (pipelineNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'pipelineNumber' when calling getPipelineByNumber");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/pipeline/{pipeline-number}"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()))
      .replaceAll("\\{" + "pipeline-number" + "\\}", apiClient.escapeString(pipelineNumber.toString()));

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

    GenericType<Pipeline> localVarReturnType = new GenericType<Pipeline>() {};
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
   * Get recent runs of a workflow job
   * Get recent runs of a job within a workflow. Runs going back at most 90 days are returned. Please note that Insights is not a real time financial reporting tool and should not be used for credit reporting. The most up to date credit information can be found in Plan Overview in the CircleCI UI.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param workflowName The name of the workflow. (required)
   * @param jobName The name of the job. (required)
   * @param branch The name of a vcs branch. If not passed we will scope the API call to the default branch.     Note - Querying all branches is not supported yet. (optional)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @param startDate Include only executions that started at or after this date. This must be specified if an end-date is provided. (optional)
   * @param endDate Include only executions that started before this date. This date can be at most 90 days after the start-date. (optional)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of recent job runs </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2005 getProjectJobRuns(String projectSlug, String workflowName, String jobName, String branch, String pageToken, OffsetDateTime startDate, OffsetDateTime endDate) throws ApiException {
    return getProjectJobRunsWithHttpInfo(projectSlug, workflowName, jobName, branch, pageToken, startDate, endDate).getData();
      }

  /**
   * Get recent runs of a workflow job
   * Get recent runs of a job within a workflow. Runs going back at most 90 days are returned. Please note that Insights is not a real time financial reporting tool and should not be used for credit reporting. The most up to date credit information can be found in Plan Overview in the CircleCI UI.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param workflowName The name of the workflow. (required)
   * @param jobName The name of the job. (required)
   * @param branch The name of a vcs branch. If not passed we will scope the API call to the default branch.     Note - Querying all branches is not supported yet. (optional)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @param startDate Include only executions that started at or after this date. This must be specified if an end-date is provided. (optional)
   * @param endDate Include only executions that started before this date. This date can be at most 90 days after the start-date. (optional)
   * @return ApiResponse&lt;InlineResponse2005&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of recent job runs </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2005> getProjectJobRunsWithHttpInfo(String projectSlug, String workflowName, String jobName, String branch, String pageToken, OffsetDateTime startDate, OffsetDateTime endDate) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling getProjectJobRuns");
    }
    
    // verify the required parameter 'workflowName' is set
    if (workflowName == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowName' when calling getProjectJobRuns");
    }
    
    // verify the required parameter 'jobName' is set
    if (jobName == null) {
      throw new ApiException(400, "Missing the required parameter 'jobName' when calling getProjectJobRuns");
    }
    
    // create path and map variables
    String localVarPath = "/insights/{project-slug}/workflows/{workflow-name}/jobs/{job-name}"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()))
      .replaceAll("\\{" + "workflow-name" + "\\}", apiClient.escapeString(workflowName.toString()))
      .replaceAll("\\{" + "job-name" + "\\}", apiClient.escapeString(jobName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "branch", branch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page-token", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start-date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end-date", endDate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<InlineResponse2005> localVarReturnType = new GenericType<InlineResponse2005>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get summary metrics for a project workflow&#39;s jobs.
   * Get summary metrics for a project workflow&#39;s jobs. Job runs going back at most 90 days are included in the aggregation window. Metrics are refreshed daily, and thus may not include executions from the last 24 hours. Please note that Insights is not a real time financial reporting tool and should not be used for credit reporting. The most up to date credit information can be found in Plan Overview in the CircleCI UI.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param workflowName The name of the workflow. (required)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @param allBranches Whether to retrieve data for all branches combined. (optional)
   * @param branch The name of a vcs branch. If not passed we will scope the API call to the default branch. (optional)
   * @param reportingWindow The time window used to calculate summary metrics. (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of summary metrics by workflow job. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2004 getProjectWorkflowJobMetrics(String projectSlug, String workflowName, String pageToken, Boolean allBranches, String branch, String reportingWindow) throws ApiException {
    return getProjectWorkflowJobMetricsWithHttpInfo(projectSlug, workflowName, pageToken, allBranches, branch, reportingWindow).getData();
      }

  /**
   * Get summary metrics for a project workflow&#39;s jobs.
   * Get summary metrics for a project workflow&#39;s jobs. Job runs going back at most 90 days are included in the aggregation window. Metrics are refreshed daily, and thus may not include executions from the last 24 hours. Please note that Insights is not a real time financial reporting tool and should not be used for credit reporting. The most up to date credit information can be found in Plan Overview in the CircleCI UI.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param workflowName The name of the workflow. (required)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @param allBranches Whether to retrieve data for all branches combined. (optional)
   * @param branch The name of a vcs branch. If not passed we will scope the API call to the default branch. (optional)
   * @param reportingWindow The time window used to calculate summary metrics. (optional)
   * @return ApiResponse&lt;InlineResponse2004&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of summary metrics by workflow job. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2004> getProjectWorkflowJobMetricsWithHttpInfo(String projectSlug, String workflowName, String pageToken, Boolean allBranches, String branch, String reportingWindow) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling getProjectWorkflowJobMetrics");
    }
    
    // verify the required parameter 'workflowName' is set
    if (workflowName == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowName' when calling getProjectWorkflowJobMetrics");
    }
    
    // create path and map variables
    String localVarPath = "/insights/{project-slug}/workflows/{workflow-name}/jobs"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()))
      .replaceAll("\\{" + "workflow-name" + "\\}", apiClient.escapeString(workflowName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page-token", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "all-branches", allBranches));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "branch", branch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reporting-window", reportingWindow));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<InlineResponse2004> localVarReturnType = new GenericType<InlineResponse2004>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get summary metrics for a project&#39;s workflows
   * Get summary metrics for a project&#39;s workflows. Workflow runs going back at most 90 days are included in the aggregation window. Metrics are refreshed daily, and thus may not include executions from the last 24 hours. Please note that Insights is not a real time financial reporting tool and should not be used for credit reporting. The most up to date credit information can be found in Plan Overview in the CircleCI UI.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @param allBranches Whether to retrieve data for all branches combined. (optional)
   * @param branch The name of a vcs branch. If not passed we will scope the API call to the default branch. (optional)
   * @param reportingWindow The time window used to calculate summary metrics. (optional)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of summary metrics by workflow </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2002 getProjectWorkflowMetrics(String projectSlug, String pageToken, Boolean allBranches, String branch, String reportingWindow) throws ApiException {
    return getProjectWorkflowMetricsWithHttpInfo(projectSlug, pageToken, allBranches, branch, reportingWindow).getData();
      }

  /**
   * Get summary metrics for a project&#39;s workflows
   * Get summary metrics for a project&#39;s workflows. Workflow runs going back at most 90 days are included in the aggregation window. Metrics are refreshed daily, and thus may not include executions from the last 24 hours. Please note that Insights is not a real time financial reporting tool and should not be used for credit reporting. The most up to date credit information can be found in Plan Overview in the CircleCI UI.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @param allBranches Whether to retrieve data for all branches combined. (optional)
   * @param branch The name of a vcs branch. If not passed we will scope the API call to the default branch. (optional)
   * @param reportingWindow The time window used to calculate summary metrics. (optional)
   * @return ApiResponse&lt;InlineResponse2002&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of summary metrics by workflow </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2002> getProjectWorkflowMetricsWithHttpInfo(String projectSlug, String pageToken, Boolean allBranches, String branch, String reportingWindow) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling getProjectWorkflowMetrics");
    }
    
    // create path and map variables
    String localVarPath = "/insights/{project-slug}/workflows"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page-token", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "all-branches", allBranches));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "branch", branch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reporting-window", reportingWindow));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<InlineResponse2002> localVarReturnType = new GenericType<InlineResponse2002>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get recent runs of a workflow
   * Get recent runs of a workflow. Runs going back at most 90 days are returned. Please note that Insights is not a real time financial reporting tool and should not be used for credit reporting. The most up to date credit information can be found in Plan Overview in the CircleCI UI.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param workflowName The name of the workflow. (required)
   * @param allBranches Whether to retrieve data for all branches combined. (optional)
   * @param branch The name of a vcs branch. If not passed we will scope the API call to the default branch. (optional)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @param startDate Include only executions that started at or after this date. This must be specified if an end-date is provided. (optional)
   * @param endDate Include only executions that started before this date. This date can be at most 90 days after the start-date. (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of recent workflow runs </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2003 getProjectWorkflowRuns(String projectSlug, String workflowName, Boolean allBranches, String branch, String pageToken, OffsetDateTime startDate, OffsetDateTime endDate) throws ApiException {
    return getProjectWorkflowRunsWithHttpInfo(projectSlug, workflowName, allBranches, branch, pageToken, startDate, endDate).getData();
      }

  /**
   * Get recent runs of a workflow
   * Get recent runs of a workflow. Runs going back at most 90 days are returned. Please note that Insights is not a real time financial reporting tool and should not be used for credit reporting. The most up to date credit information can be found in Plan Overview in the CircleCI UI.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param workflowName The name of the workflow. (required)
   * @param allBranches Whether to retrieve data for all branches combined. (optional)
   * @param branch The name of a vcs branch. If not passed we will scope the API call to the default branch. (optional)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @param startDate Include only executions that started at or after this date. This must be specified if an end-date is provided. (optional)
   * @param endDate Include only executions that started before this date. This date can be at most 90 days after the start-date. (optional)
   * @return ApiResponse&lt;InlineResponse2003&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of recent workflow runs </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2003> getProjectWorkflowRunsWithHttpInfo(String projectSlug, String workflowName, Boolean allBranches, String branch, String pageToken, OffsetDateTime startDate, OffsetDateTime endDate) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling getProjectWorkflowRuns");
    }
    
    // verify the required parameter 'workflowName' is set
    if (workflowName == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowName' when calling getProjectWorkflowRuns");
    }
    
    // create path and map variables
    String localVarPath = "/insights/{project-slug}/workflows/{workflow-name}"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()))
      .replaceAll("\\{" + "workflow-name" + "\\}", apiClient.escapeString(workflowName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "all-branches", allBranches));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "branch", branch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page-token", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start-date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end-date", endDate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<InlineResponse2003> localVarReturnType = new GenericType<InlineResponse2003>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get test metrics for a project&#39;s workflows
   * Get test metrics for a project&#39;s workflows. Currently tests metrics are calculated based on 10 most recent workflow runs.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param workflowName The name of the workflow. (required)
   * @param branch The name of a vcs branch. If not passed we will scope the API call to the default branch. (optional)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of test metrics by workflow </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2006 getProjectWorkflowTestMetrics(String projectSlug, String workflowName, String branch) throws ApiException {
    return getProjectWorkflowTestMetricsWithHttpInfo(projectSlug, workflowName, branch).getData();
      }

  /**
   * Get test metrics for a project&#39;s workflows
   * Get test metrics for a project&#39;s workflows. Currently tests metrics are calculated based on 10 most recent workflow runs.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param workflowName The name of the workflow. (required)
   * @param branch The name of a vcs branch. If not passed we will scope the API call to the default branch. (optional)
   * @return ApiResponse&lt;InlineResponse2006&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of test metrics by workflow </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2006> getProjectWorkflowTestMetricsWithHttpInfo(String projectSlug, String workflowName, String branch) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling getProjectWorkflowTestMetrics");
    }
    
    // verify the required parameter 'workflowName' is set
    if (workflowName == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowName' when calling getProjectWorkflowTestMetrics");
    }
    
    // create path and map variables
    String localVarPath = "/insights/{project-slug}/workflows/{workflow-name}/test-metrics"
      .replaceAll("\\{" + "project-slug" + "\\}", apiClient.escapeString(projectSlug.toString()))
      .replaceAll("\\{" + "workflow-name" + "\\}", apiClient.escapeString(workflowName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "branch", branch));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<InlineResponse2006> localVarReturnType = new GenericType<InlineResponse2006>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get test metadata
   * Get test metadata for a build.
   * @param jobNumber The number of the job. (required)
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return TestsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of test results. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public TestsResponse getTests(Object jobNumber, String projectSlug) throws ApiException {
    return getTestsWithHttpInfo(jobNumber, projectSlug).getData();
      }

  /**
   * Get test metadata
   * Get test metadata for a build.
   * @param jobNumber The number of the job. (required)
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ApiResponse&lt;TestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of test results. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TestsResponse> getTestsWithHttpInfo(Object jobNumber, String projectSlug) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'jobNumber' is set
    if (jobNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'jobNumber' when calling getTests");
    }
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling getTests");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/{job-number}/tests"
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

    GenericType<TestsResponse> localVarReturnType = new GenericType<TestsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * User Information
   * Provides information about the user with the given ID.
   * @param id The unique ID of the user. (required)
   * @return User
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User login information. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public User getUser(UUID id) throws ApiException {
    return getUserWithHttpInfo(id).getData();
      }

  /**
   * User Information
   * Provides information about the user with the given ID.
   * @param id The unique ID of the user. (required)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User login information. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<User> getUserWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUser");
    }
    
    // create path and map variables
    String localVarPath = "/user/{id}"
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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
   * @return CheckoutKeyListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of checkout keys. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public CheckoutKeyListResponse listCheckoutKeys(String projectSlug) throws ApiException {
    return listCheckoutKeysWithHttpInfo(projectSlug).getData();
      }

  /**
   * Get all checkout keys
   * Returns a sequence of checkout keys for &#x60;:project&#x60;.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ApiResponse&lt;CheckoutKeyListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of checkout keys. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CheckoutKeyListResponse> listCheckoutKeysWithHttpInfo(String projectSlug) throws ApiException {
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

    GenericType<CheckoutKeyListResponse> localVarReturnType = new GenericType<CheckoutKeyListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List contexts
   * List all contexts for an owner.
   * @param ownerId The unique ID of the owner of the context. Specify either this or owner-slug. (optional)
   * @param ownerSlug A string that represents an organization. Specify either this or owner-id. Cannot be used for accounts. (optional)
   * @param ownerType The type of the owner. Defaults to \&quot;organization\&quot;. Accounts are only used as context owners in server. (optional)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of contexts </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse200 listContexts(UUID ownerId, String ownerSlug, String ownerType, String pageToken) throws ApiException {
    return listContextsWithHttpInfo(ownerId, ownerSlug, ownerType, pageToken).getData();
      }

  /**
   * List contexts
   * List all contexts for an owner.
   * @param ownerId The unique ID of the owner of the context. Specify either this or owner-slug. (optional)
   * @param ownerSlug A string that represents an organization. Specify either this or owner-id. Cannot be used for accounts. (optional)
   * @param ownerType The type of the owner. Defaults to \&quot;organization\&quot;. Accounts are only used as context owners in server. (optional)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of contexts </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse200> listContextsWithHttpInfo(UUID ownerId, String ownerSlug, String ownerType, String pageToken) throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/context";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "owner-id", ownerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "owner-slug", ownerSlug));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "owner-type", ownerType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page-token", pageToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List all environment variables
   * Returns four &#39;x&#39; characters, in addition to the last four ASCII characters of the value, consistent with the display of environment variable values on the CircleCI website.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return EnvironmentVariableListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of environment variables. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public EnvironmentVariableListResponse listEnvVars(String projectSlug) throws ApiException {
    return listEnvVarsWithHttpInfo(projectSlug).getData();
      }

  /**
   * List all environment variables
   * Returns four &#39;x&#39; characters, in addition to the last four ASCII characters of the value, consistent with the display of environment variable values on the CircleCI website.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ApiResponse&lt;EnvironmentVariableListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of environment variables. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EnvironmentVariableListResponse> listEnvVarsWithHttpInfo(String projectSlug) throws ApiException {
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

    GenericType<EnvironmentVariableListResponse> localVarReturnType = new GenericType<EnvironmentVariableListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List environment variables
   * List information about environment variables in a context, not including their values.
   * @param contextId ID of the context (UUID) (required)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of environment variables </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 listEnvironmentVariablesFromContext(UUID contextId) throws ApiException {
    return listEnvironmentVariablesFromContextWithHttpInfo(contextId).getData();
      }

  /**
   * List environment variables
   * List information about environment variables in a context, not including their values.
   * @param contextId ID of the context (UUID) (required)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of environment variables </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> listEnvironmentVariablesFromContextWithHttpInfo(UUID contextId) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      throw new ApiException(400, "Missing the required parameter 'contextId' when calling listEnvironmentVariablesFromContext");
    }
    
    // create path and map variables
    String localVarPath = "/context/{context-id}/environment-variable"
      .replaceAll("\\{" + "context-id" + "\\}", apiClient.escapeString(contextId.toString()));

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

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
   * Get a list of pipelines
   * Returns all pipelines for the most recently built projects (max 250) you follow in an organization.
   * @param orgSlug Org slug in the form &#x60;vcs-slug/org-name&#x60; (optional)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @param mine Only include entries created by your user. (optional)
   * @return PipelineListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of pipelines. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public PipelineListResponse listPipelines(String orgSlug, String pageToken, Boolean mine) throws ApiException {
    return listPipelinesWithHttpInfo(orgSlug, pageToken, mine).getData();
      }

  /**
   * Get a list of pipelines
   * Returns all pipelines for the most recently built projects (max 250) you follow in an organization.
   * @param orgSlug Org slug in the form &#x60;vcs-slug/org-name&#x60; (optional)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @param mine Only include entries created by your user. (optional)
   * @return ApiResponse&lt;PipelineListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of pipelines. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PipelineListResponse> listPipelinesWithHttpInfo(String orgSlug, String pageToken, Boolean mine) throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/pipeline";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "org-slug", orgSlug));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page-token", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mine", mine));

    
    
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
   * @param branch The name of a vcs branch. (optional)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @return PipelineListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of pipelines. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public PipelineListResponse listPipelinesForProject(String projectSlug, String branch, String pageToken) throws ApiException {
    return listPipelinesForProjectWithHttpInfo(projectSlug, branch, pageToken).getData();
      }

  /**
   * Get all pipelines
   * Returns all pipelines for this project.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param branch The name of a vcs branch. (optional)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @return ApiResponse&lt;PipelineListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A sequence of pipelines. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PipelineListResponse> listPipelinesForProjectWithHttpInfo(String projectSlug, String branch, String pageToken) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "branch", branch));
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
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
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkflowJobListResponse> listWorkflowJobsWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listWorkflowJobs");
    }
    
    // create path and map variables
    String localVarPath = "/workflow/{id}/job"
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
   * Get a pipeline&#39;s workflows
   * Returns a paginated list of workflows by pipeline ID.
   * @param pipelineId The unique ID of the pipeline. (required)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @return WorkflowListResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of workflow objects. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public WorkflowListResponse listWorkflowsByPipelineId(UUID pipelineId, String pageToken) throws ApiException {
    return listWorkflowsByPipelineIdWithHttpInfo(pipelineId, pageToken).getData();
      }

  /**
   * Get a pipeline&#39;s workflows
   * Returns a paginated list of workflows by pipeline ID.
   * @param pipelineId The unique ID of the pipeline. (required)
   * @param pageToken A token to retrieve the next page of results. (optional)
   * @return ApiResponse&lt;WorkflowListResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A paginated list of workflow objects. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WorkflowListResponse> listWorkflowsByPipelineIdWithHttpInfo(UUID pipelineId, String pageToken) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'pipelineId' is set
    if (pipelineId == null) {
      throw new ApiException(400, "Missing the required parameter 'pipelineId' when calling listWorkflowsByPipelineId");
    }
    
    // create path and map variables
    String localVarPath = "/pipeline/{pipeline-id}/workflow"
      .replaceAll("\\{" + "pipeline-id" + "\\}", apiClient.escapeString(pipelineId.toString()));

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

    GenericType<WorkflowListResponse> localVarReturnType = new GenericType<WorkflowListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return InlineResponseDefault
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponseDefault projectProjectSlugSchedulePost(String projectSlug) throws ApiException {
    return projectProjectSlugSchedulePostWithHttpInfo(projectSlug).getData();
      }

  /**
   * 
   * 
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ApiResponse&lt;InlineResponseDefault&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponseDefault> projectProjectSlugSchedulePostWithHttpInfo(String projectSlug) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'projectSlug' is set
    if (projectSlug == null) {
      throw new ApiException(400, "Missing the required parameter 'projectSlug' when calling projectProjectSlugSchedulePost");
    }
    
    // create path and map variables
    String localVarPath = "/project/{project-slug}/schedule"
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

    GenericType<InlineResponseDefault> localVarReturnType = new GenericType<InlineResponseDefault>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Rerun a workflow
   * Reruns a workflow.
   * @param id The unique ID of the workflow. (required)
   * @param rerunWorkflowParameters  (optional)
   * @return MessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> A confirmation message. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public MessageResponse rerunWorkflow(UUID id, RerunWorkflowParameters rerunWorkflowParameters) throws ApiException {
    return rerunWorkflowWithHttpInfo(id, rerunWorkflowParameters).getData();
      }

  /**
   * Rerun a workflow
   * Reruns a workflow.
   * @param id The unique ID of the workflow. (required)
   * @param rerunWorkflowParameters  (optional)
   * @return ApiResponse&lt;MessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> A confirmation message. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MessageResponse> rerunWorkflowWithHttpInfo(UUID id, RerunWorkflowParameters rerunWorkflowParameters) throws ApiException {
    Object localVarPostBody = rerunWorkflowParameters;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling rerunWorkflow");
    }
    
    // create path and map variables
    String localVarPath = "/workflow/{id}/rerun"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<MessageResponse> localVarReturnType = new GenericType<MessageResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param scheduleId The unique ID of the schedule. (required)
   * @return InlineResponseDefault
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponseDefault scheduleScheduleIdGet(UUID scheduleId) throws ApiException {
    return scheduleScheduleIdGetWithHttpInfo(scheduleId).getData();
      }

  /**
   * 
   * 
   * @param scheduleId The unique ID of the schedule. (required)
   * @return ApiResponse&lt;InlineResponseDefault&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponseDefault> scheduleScheduleIdGetWithHttpInfo(UUID scheduleId) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduleId' when calling scheduleScheduleIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/schedule/{schedule-id}"
      .replaceAll("\\{" + "schedule-id" + "\\}", apiClient.escapeString(scheduleId.toString()));

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

    GenericType<InlineResponseDefault> localVarReturnType = new GenericType<InlineResponseDefault>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param scheduleId The unique ID of the schedule. (required)
   * @return InlineResponseDefault
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponseDefault scheduleScheduleIdPatch(UUID scheduleId) throws ApiException {
    return scheduleScheduleIdPatchWithHttpInfo(scheduleId).getData();
      }

  /**
   * 
   * 
   * @param scheduleId The unique ID of the schedule. (required)
   * @return ApiResponse&lt;InlineResponseDefault&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponseDefault> scheduleScheduleIdPatchWithHttpInfo(UUID scheduleId) throws ApiException {
    Object localVarPostBody = new Object();
    
    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new ApiException(400, "Missing the required parameter 'scheduleId' when calling scheduleScheduleIdPatch");
    }
    
    // create path and map variables
    String localVarPath = "/schedule/{schedule-id}"
      .replaceAll("\\{" + "schedule-id" + "\\}", apiClient.escapeString(scheduleId.toString()));

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

    GenericType<InlineResponseDefault> localVarReturnType = new GenericType<InlineResponseDefault>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Trigger a new pipeline
   * Triggers a new pipeline on the project.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param xAttributionLogin The login or user-readable identifier for the pipeline&#39;s triggerer. Internal use only. (optional)
   * @param xAttributionActorId The id the integration uses to identify the pipeline&#39;s triggerer. Internal use only. (optional)
   * @param triggerPipelineParameters  (optional)
   * @return PipelineCreation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created pipeline. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public PipelineCreation triggerPipeline(String projectSlug, String xAttributionLogin, String xAttributionActorId, TriggerPipelineParameters triggerPipelineParameters) throws ApiException {
    return triggerPipelineWithHttpInfo(projectSlug, xAttributionLogin, xAttributionActorId, triggerPipelineParameters).getData();
      }

  /**
   * Trigger a new pipeline
   * Triggers a new pipeline on the project.
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @param xAttributionLogin The login or user-readable identifier for the pipeline&#39;s triggerer. Internal use only. (optional)
   * @param xAttributionActorId The id the integration uses to identify the pipeline&#39;s triggerer. Internal use only. (optional)
   * @param triggerPipelineParameters  (optional)
   * @return ApiResponse&lt;PipelineCreation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created pipeline. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PipelineCreation> triggerPipelineWithHttpInfo(String projectSlug, String xAttributionLogin, String xAttributionActorId, TriggerPipelineParameters triggerPipelineParameters) throws ApiException {
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


    if (xAttributionLogin != null)
      localVarHeaderParams.put("x-attribution-login", apiClient.parameterToString(xAttributionLogin));
if (xAttributionActorId != null)
      localVarHeaderParams.put("x-attribution-actor-id", apiClient.parameterToString(xAttributionActorId));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key_header", "api_key_query", "basic_auth" };

    GenericType<PipelineCreation> localVarReturnType = new GenericType<PipelineCreation>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
