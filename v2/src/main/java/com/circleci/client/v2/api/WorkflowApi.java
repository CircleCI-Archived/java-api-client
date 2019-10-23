package com.circleci.client.v2.api;

import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiResponse;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.Pair;

import javax.ws.rs.core.GenericType;

import com.circleci.client.v2.model.MessageResponse;
import java.util.UUID;
import com.circleci.client.v2.model.Workflow;
import com.circleci.client.v2.model.WorkflowJobListResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WorkflowApi {
  private ApiClient apiClient;

  public WorkflowApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkflowApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
}
