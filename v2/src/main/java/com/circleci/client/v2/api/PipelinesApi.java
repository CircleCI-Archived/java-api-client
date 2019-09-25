package com.circleci.client.v2.api;

import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiResponse;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.Pair;

import javax.ws.rs.core.GenericType;

import com.circleci.client.v2.model.PipelineWithWorkflows;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PipelinesApi {
  private ApiClient apiClient;

  public PipelinesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PipelinesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
}
