/*
 * Expense Reports
 * API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.SkillsCreateNewSkillRequest;
import com.konfigthis.client.model.SkillsCreateNewSkillRequestAssessmentModel;
import com.konfigthis.client.model.SkillsCreateNewSkillRequestSkillTypeModel;
import com.konfigthis.client.model.SkillsCreateNewSkillResponse;
import com.konfigthis.client.model.SkillsGetSkillsResponseInner;
import com.konfigthis.client.model.SkillsGetUserAssignedSkillsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SkillsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SkillsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public SkillsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createNewSkillCall(SkillsCreateNewSkillRequest skillsCreateNewSkillRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = skillsCreateNewSkillRequest;

        // create path and map variables
        String localVarPath = "/skill/add";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0", "sec1" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNewSkillValidateBeforeCall(SkillsCreateNewSkillRequest skillsCreateNewSkillRequest, final ApiCallback _callback) throws ApiException {
        return createNewSkillCall(skillsCreateNewSkillRequest, _callback);

    }


    private ApiResponse<SkillsCreateNewSkillResponse> createNewSkillWithHttpInfo(SkillsCreateNewSkillRequest skillsCreateNewSkillRequest) throws ApiException {
        okhttp3.Call localVarCall = createNewSkillValidateBeforeCall(skillsCreateNewSkillRequest, null);
        Type localVarReturnType = new TypeToken<SkillsCreateNewSkillResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNewSkillAsync(SkillsCreateNewSkillRequest skillsCreateNewSkillRequest, final ApiCallback<SkillsCreateNewSkillResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNewSkillValidateBeforeCall(skillsCreateNewSkillRequest, _callback);
        Type localVarReturnType = new TypeToken<SkillsCreateNewSkillResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateNewSkillRequestBuilder {
        private final String description;
        private final String skillCode;
        private SkillsCreateNewSkillRequestAssessmentModel assessmentModel;
        private SkillsCreateNewSkillRequestSkillTypeModel skillTypeModel;

        private CreateNewSkillRequestBuilder(String description, String skillCode) {
            this.description = description;
            this.skillCode = skillCode;
        }

        /**
         * Set assessmentModel
         * @param assessmentModel  (optional)
         * @return CreateNewSkillRequestBuilder
         */
        public CreateNewSkillRequestBuilder assessmentModel(SkillsCreateNewSkillRequestAssessmentModel assessmentModel) {
            this.assessmentModel = assessmentModel;
            return this;
        }
        
        /**
         * Set skillTypeModel
         * @param skillTypeModel  (optional)
         * @return CreateNewSkillRequestBuilder
         */
        public CreateNewSkillRequestBuilder skillTypeModel(SkillsCreateNewSkillRequestSkillTypeModel skillTypeModel) {
            this.skillTypeModel = skillTypeModel;
            return this;
        }
        
        /**
         * Build call for createNewSkill
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            SkillsCreateNewSkillRequest skillsCreateNewSkillRequest = buildBodyParams();
            return createNewSkillCall(skillsCreateNewSkillRequest, _callback);
        }

        private SkillsCreateNewSkillRequest buildBodyParams() {
            SkillsCreateNewSkillRequest skillsCreateNewSkillRequest = new SkillsCreateNewSkillRequest();
            skillsCreateNewSkillRequest.description(this.description);
            skillsCreateNewSkillRequest.skillCode(this.skillCode);
            skillsCreateNewSkillRequest.assessmentModel(this.assessmentModel);
            skillsCreateNewSkillRequest.skillTypeModel(this.skillTypeModel);
            return skillsCreateNewSkillRequest;
        }

        /**
         * Execute createNewSkill request
         * @return SkillsCreateNewSkillResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public SkillsCreateNewSkillResponse execute() throws ApiException {
            SkillsCreateNewSkillRequest skillsCreateNewSkillRequest = buildBodyParams();
            ApiResponse<SkillsCreateNewSkillResponse> localVarResp = createNewSkillWithHttpInfo(skillsCreateNewSkillRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createNewSkill request with HTTP info returned
         * @return ApiResponse&lt;SkillsCreateNewSkillResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SkillsCreateNewSkillResponse> executeWithHttpInfo() throws ApiException {
            SkillsCreateNewSkillRequest skillsCreateNewSkillRequest = buildBodyParams();
            return createNewSkillWithHttpInfo(skillsCreateNewSkillRequest);
        }

        /**
         * Execute createNewSkill request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SkillsCreateNewSkillResponse> _callback) throws ApiException {
            SkillsCreateNewSkillRequest skillsCreateNewSkillRequest = buildBodyParams();
            return createNewSkillAsync(skillsCreateNewSkillRequest, _callback);
        }
    }

    /**
     * Create a new skill
     * 
     * @return CreateNewSkillRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> 201 </td><td>  -  </td></tr>
     </table>
     */
    public CreateNewSkillRequestBuilder createNewSkill(String description, String skillCode) throws IllegalArgumentException {
        if (description == null) throw new IllegalArgumentException("\"description\" is required but got null");
            

        if (skillCode == null) throw new IllegalArgumentException("\"skillCode\" is required but got null");
            

        return new CreateNewSkillRequestBuilder(description, skillCode);
    }
    private okhttp3.Call getSkillsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/skills";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0", "sec1" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSkillsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getSkillsCall(_callback);

    }


    private ApiResponse<List<SkillsGetSkillsResponseInner>> getSkillsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSkillsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<SkillsGetSkillsResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSkillsAsync(final ApiCallback<List<SkillsGetSkillsResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSkillsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<SkillsGetSkillsResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSkillsRequestBuilder {

        private GetSkillsRequestBuilder() {
        }

        /**
         * Build call for getSkills
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSkillsCall(_callback);
        }


        /**
         * Execute getSkills request
         * @return List&lt;SkillsGetSkillsResponseInner&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public List<SkillsGetSkillsResponseInner> execute() throws ApiException {
            ApiResponse<List<SkillsGetSkillsResponseInner>> localVarResp = getSkillsWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSkills request with HTTP info returned
         * @return ApiResponse&lt;List&lt;SkillsGetSkillsResponseInner&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<SkillsGetSkillsResponseInner>> executeWithHttpInfo() throws ApiException {
            return getSkillsWithHttpInfo();
        }

        /**
         * Execute getSkills request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<SkillsGetSkillsResponseInner>> _callback) throws ApiException {
            return getSkillsAsync(_callback);
        }
    }

    /**
     * Retrieve skills
     * 
     * @return GetSkillsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GetSkillsRequestBuilder getSkills() throws IllegalArgumentException {
        return new GetSkillsRequestBuilder();
    }
    private okhttp3.Call getUserAssignedSkillsCall(Integer assignedUserID, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/userSkill";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (assignedUserID != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("assignedUserID", assignedUserID));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0", "sec1" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserAssignedSkillsValidateBeforeCall(Integer assignedUserID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'assignedUserID' is set
        if (assignedUserID == null) {
            throw new ApiException("Missing the required parameter 'assignedUserID' when calling getUserAssignedSkills(Async)");
        }

        return getUserAssignedSkillsCall(assignedUserID, _callback);

    }


    private ApiResponse<SkillsGetUserAssignedSkillsResponse> getUserAssignedSkillsWithHttpInfo(Integer assignedUserID) throws ApiException {
        okhttp3.Call localVarCall = getUserAssignedSkillsValidateBeforeCall(assignedUserID, null);
        Type localVarReturnType = new TypeToken<SkillsGetUserAssignedSkillsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getUserAssignedSkillsAsync(Integer assignedUserID, final ApiCallback<SkillsGetUserAssignedSkillsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserAssignedSkillsValidateBeforeCall(assignedUserID, _callback);
        Type localVarReturnType = new TypeToken<SkillsGetUserAssignedSkillsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetUserAssignedSkillsRequestBuilder {
        private final Integer assignedUserID;

        private GetUserAssignedSkillsRequestBuilder(Integer assignedUserID) {
            this.assignedUserID = assignedUserID;
        }

        /**
         * Build call for getUserAssignedSkills
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getUserAssignedSkillsCall(assignedUserID, _callback);
        }


        /**
         * Execute getUserAssignedSkills request
         * @return SkillsGetUserAssignedSkillsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public SkillsGetUserAssignedSkillsResponse execute() throws ApiException {
            ApiResponse<SkillsGetUserAssignedSkillsResponse> localVarResp = getUserAssignedSkillsWithHttpInfo(assignedUserID);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getUserAssignedSkills request with HTTP info returned
         * @return ApiResponse&lt;SkillsGetUserAssignedSkillsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SkillsGetUserAssignedSkillsResponse> executeWithHttpInfo() throws ApiException {
            return getUserAssignedSkillsWithHttpInfo(assignedUserID);
        }

        /**
         * Execute getUserAssignedSkills request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SkillsGetUserAssignedSkillsResponse> _callback) throws ApiException {
            return getUserAssignedSkillsAsync(assignedUserID, _callback);
        }
    }

    /**
     * Retrieve skills assigned to a user
     * 
     * @param assignedUserID The ID of the user whose skills should be retrieved. (required)
     * @return GetUserAssignedSkillsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GetUserAssignedSkillsRequestBuilder getUserAssignedSkills(Integer assignedUserID) throws IllegalArgumentException {
        if (assignedUserID == null) throw new IllegalArgumentException("\"assignedUserID\" is required but got null");
        return new GetUserAssignedSkillsRequestBuilder(assignedUserID);
    }
}