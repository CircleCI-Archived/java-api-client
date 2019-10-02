package com.circleci.client.v2.api;

import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiResponse;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.Pair;

import javax.ws.rs.core.GenericType;

import com.circleci.client.v2.model.JobDetails;
import com.circleci.client.v2.model.TestsResponse;

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
   * Get job details.
   * Returns job details.
   * @param jobNumber The number of the job. (required)
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return JobDetails
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Job details. </td><td>  -  </td></tr>
     </table>
   */
  public JobDetails getJobDetails(Object jobNumber, String projectSlug) throws ApiException {
    return getJobDetailsWithHttpInfo(jobNumber, projectSlug).getData();
      }

  /**
   * Get job details.
   * Returns job details.
   * @param jobNumber The number of the job. (required)
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ApiResponse&lt;JobDetails&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Job details. </td><td>  -  </td></tr>
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
   * Get test metadata.
   * Get test metadata for a build.
   * @param jobNumber The number of the job. (required)
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return TestsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the test results, paginated. </td><td>  -  </td></tr>
     </table>
   */
  public TestsResponse getTests(Object jobNumber, String projectSlug) throws ApiException {
    return getTestsWithHttpInfo(jobNumber, projectSlug).getData();
      }

  /**
   * Get test metadata.
   * Get test metadata for a build.
   * @param jobNumber The number of the job. (required)
   * @param projectSlug Project slug in the form &#x60;vcs-slug/org-name/repo-name&#x60;. The &#x60;/&#x60; characters may be URL-escaped. (required)
   * @return ApiResponse&lt;TestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the test results, paginated. </td><td>  -  </td></tr>
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
}
