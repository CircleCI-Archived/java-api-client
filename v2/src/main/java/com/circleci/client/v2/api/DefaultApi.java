package com.circleci.client.v2.api;

import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.ApiClient;
import com.circleci.client.v2.ApiResponse;
import com.circleci.client.v2.Configuration;
import com.circleci.client.v2.Pair;

import javax.ws.rs.core.GenericType;

import com.circleci.client.v2.model.Collaboration;

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
   * The set of organziations for which a user is a member or a collaborator.
   * Provides all collaborations which are organizations including 1) orgs that the current user belongs to (BB &amp; GH), 2) orgs that they do not belong to but they collaborate on repos (BB &amp; GH), and 3) current user&#39;s account
   * @return List&lt;Collaboration&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Collaborations </td><td>  -  </td></tr>
     </table>
   */
  public List<Collaboration> getCollaborations() throws ApiException {
    return getCollaborationsWithHttpInfo().getData();
      }

  /**
   * The set of organziations for which a user is a member or a collaborator.
   * Provides all collaborations which are organizations including 1) orgs that the current user belongs to (BB &amp; GH), 2) orgs that they do not belong to but they collaborate on repos (BB &amp; GH), and 3) current user&#39;s account
   * @return ApiResponse&lt;List&lt;Collaboration&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Collaborations </td><td>  -  </td></tr>
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
}
