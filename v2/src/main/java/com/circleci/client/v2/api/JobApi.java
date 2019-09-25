package com.circleci.client.v2.api;

import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiResponse;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.Pair;

import javax.ws.rs.core.GenericType;

import com.circleci.client.v2.model.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class JobApi {
  private ApiClient apiClient;

  public JobApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JobApi(ApiClient apiClient) {
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
   * @return Message
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public Message cancelJob(Object jobNumber, String projectSlug) throws ApiException {
    return cancelJobWithHttpInfo(jobNumber, projectSlug).getData();
      }

  /**
   * Cancel job
   * Cancel job with a given job number.
   * @param jobNumber The number of the job. (required)
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ApiResponse&lt;Message&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td>  </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Message> cancelJobWithHttpInfo(Object jobNumber, String projectSlug) throws ApiException {
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
    String localVarPath = "/project/{project-slug}/{job-number}"
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

    GenericType<Message> localVarReturnType = new GenericType<Message>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
