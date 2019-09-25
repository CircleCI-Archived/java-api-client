package com.circleci.client.v2.api;

import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiResponse;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.Pair;

import javax.ws.rs.core.GenericType;

import com.circleci.client.v2.model.PipelineConfig;
import com.circleci.client.v2.model.PipelineLight;
import com.circleci.client.v2.model.PipelineListResponse;
import com.circleci.client.v2.model.TriggerPipelineParameters;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PipelineApi {
  private ApiClient apiClient;

  public PipelineApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PipelineApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
