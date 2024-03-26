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


import com.konfigthis.client.model.PositionsCreatePositionResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PositionsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PositionsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public PositionsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createPositionCall(String name, Integer count, String status, String accessLevel, String dateOpen, String dateClose, String positionUID, Integer funnelId, String description, String requirements, String responsibilities, Integer projectid, Integer approvalFlowId, Integer locationid, String departmentId, Integer profileid, Integer recruiterId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/position/save";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (description != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("description", description));
        }

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (accessLevel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("accessLevel", accessLevel));
        }

        if (requirements != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("requirements", requirements));
        }

        if (responsibilities != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("responsibilities", responsibilities));
        }

        if (dateOpen != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dateOpen", dateOpen));
        }

        if (dateClose != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dateClose", dateClose));
        }

        if (positionUID != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("positionUID", positionUID));
        }

        if (projectid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("projectid", projectid));
        }

        if (funnelId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("funnelId", funnelId));
        }

        if (approvalFlowId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("approvalFlowId", approvalFlowId));
        }

        if (locationid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("locationid", locationid));
        }

        if (departmentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("departmentId", departmentId));
        }

        if (profileid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("profileid", profileid));
        }

        if (recruiterId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recruiterId", recruiterId));
        }

        final String[] localVarAccepts = {
            "application/json",
            "text"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createPositionValidateBeforeCall(String name, Integer count, String status, String accessLevel, String dateOpen, String dateClose, String positionUID, Integer funnelId, String description, String requirements, String responsibilities, Integer projectid, Integer approvalFlowId, Integer locationid, String departmentId, Integer profileid, Integer recruiterId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling createPosition(Async)");
        }

        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling createPosition(Async)");
        }

        // verify the required parameter 'status' is set
        if (status == null) {
            throw new ApiException("Missing the required parameter 'status' when calling createPosition(Async)");
        }

        // verify the required parameter 'accessLevel' is set
        if (accessLevel == null) {
            throw new ApiException("Missing the required parameter 'accessLevel' when calling createPosition(Async)");
        }

        // verify the required parameter 'dateOpen' is set
        if (dateOpen == null) {
            throw new ApiException("Missing the required parameter 'dateOpen' when calling createPosition(Async)");
        }

        // verify the required parameter 'dateClose' is set
        if (dateClose == null) {
            throw new ApiException("Missing the required parameter 'dateClose' when calling createPosition(Async)");
        }

        // verify the required parameter 'positionUID' is set
        if (positionUID == null) {
            throw new ApiException("Missing the required parameter 'positionUID' when calling createPosition(Async)");
        }

        // verify the required parameter 'funnelId' is set
        if (funnelId == null) {
            throw new ApiException("Missing the required parameter 'funnelId' when calling createPosition(Async)");
        }

        return createPositionCall(name, count, status, accessLevel, dateOpen, dateClose, positionUID, funnelId, description, requirements, responsibilities, projectid, approvalFlowId, locationid, departmentId, profileid, recruiterId, _callback);

    }


    private ApiResponse<PositionsCreatePositionResponse> createPositionWithHttpInfo(String name, Integer count, String status, String accessLevel, String dateOpen, String dateClose, String positionUID, Integer funnelId, String description, String requirements, String responsibilities, Integer projectid, Integer approvalFlowId, Integer locationid, String departmentId, Integer profileid, Integer recruiterId) throws ApiException {
        okhttp3.Call localVarCall = createPositionValidateBeforeCall(name, count, status, accessLevel, dateOpen, dateClose, positionUID, funnelId, description, requirements, responsibilities, projectid, approvalFlowId, locationid, departmentId, profileid, recruiterId, null);
        Type localVarReturnType = new TypeToken<PositionsCreatePositionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createPositionAsync(String name, Integer count, String status, String accessLevel, String dateOpen, String dateClose, String positionUID, Integer funnelId, String description, String requirements, String responsibilities, Integer projectid, Integer approvalFlowId, Integer locationid, String departmentId, Integer profileid, Integer recruiterId, final ApiCallback<PositionsCreatePositionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPositionValidateBeforeCall(name, count, status, accessLevel, dateOpen, dateClose, positionUID, funnelId, description, requirements, responsibilities, projectid, approvalFlowId, locationid, departmentId, profileid, recruiterId, _callback);
        Type localVarReturnType = new TypeToken<PositionsCreatePositionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreatePositionRequestBuilder {
        private final String name;
        private final Integer count;
        private final String status;
        private final String accessLevel;
        private final String dateOpen;
        private final String dateClose;
        private final String positionUID;
        private final Integer funnelId;
        private String description;
        private String requirements;
        private String responsibilities;
        private Integer projectid;
        private Integer approvalFlowId;
        private Integer locationid;
        private String departmentId;
        private Integer profileid;
        private Integer recruiterId;

        private CreatePositionRequestBuilder(String name, Integer count, String status, String accessLevel, String dateOpen, String dateClose, String positionUID, Integer funnelId) {
            this.name = name;
            this.count = count;
            this.status = status;
            this.accessLevel = accessLevel;
            this.dateOpen = dateOpen;
            this.dateClose = dateClose;
            this.positionUID = positionUID;
            this.funnelId = funnelId;
        }

        /**
         * Set description
         * @param description Description of Position (optional)
         * @return CreatePositionRequestBuilder
         */
        public CreatePositionRequestBuilder description(String description) {
            this.description = description;
            return this;
        }
        
        /**
         * Set requirements
         * @param requirements Requirements of Position (optional)
         * @return CreatePositionRequestBuilder
         */
        public CreatePositionRequestBuilder requirements(String requirements) {
            this.requirements = requirements;
            return this;
        }
        
        /**
         * Set responsibilities
         * @param responsibilities Responsibilities of Position (optional)
         * @return CreatePositionRequestBuilder
         */
        public CreatePositionRequestBuilder responsibilities(String responsibilities) {
            this.responsibilities = responsibilities;
            return this;
        }
        
        /**
         * Set projectid
         * @param projectid Project ID of Position (optional)
         * @return CreatePositionRequestBuilder
         */
        public CreatePositionRequestBuilder projectid(Integer projectid) {
            this.projectid = projectid;
            return this;
        }
        
        /**
         * Set approvalFlowId
         * @param approvalFlowId Position Approval Flow ID of Position (optional)
         * @return CreatePositionRequestBuilder
         */
        public CreatePositionRequestBuilder approvalFlowId(Integer approvalFlowId) {
            this.approvalFlowId = approvalFlowId;
            return this;
        }
        
        /**
         * Set locationid
         * @param locationid Location ID of Position (optional)
         * @return CreatePositionRequestBuilder
         */
        public CreatePositionRequestBuilder locationid(Integer locationid) {
            this.locationid = locationid;
            return this;
        }
        
        /**
         * Set departmentId
         * @param departmentId Department ID of Position (optional)
         * @return CreatePositionRequestBuilder
         */
        public CreatePositionRequestBuilder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        
        /**
         * Set profileid
         * @param profileid Profile ID of Position (optional)
         * @return CreatePositionRequestBuilder
         */
        public CreatePositionRequestBuilder profileid(Integer profileid) {
            this.profileid = profileid;
            return this;
        }
        
        /**
         * Set recruiterId
         * @param recruiterId ID of Recruiter (optional)
         * @return CreatePositionRequestBuilder
         */
        public CreatePositionRequestBuilder recruiterId(Integer recruiterId) {
            this.recruiterId = recruiterId;
            return this;
        }
        
        /**
         * Build call for createPosition
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
            return createPositionCall(name, count, status, accessLevel, dateOpen, dateClose, positionUID, funnelId, description, requirements, responsibilities, projectid, approvalFlowId, locationid, departmentId, profileid, recruiterId, _callback);
        }


        /**
         * Execute createPosition request
         * @return PositionsCreatePositionResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public PositionsCreatePositionResponse execute() throws ApiException {
            ApiResponse<PositionsCreatePositionResponse> localVarResp = createPositionWithHttpInfo(name, count, status, accessLevel, dateOpen, dateClose, positionUID, funnelId, description, requirements, responsibilities, projectid, approvalFlowId, locationid, departmentId, profileid, recruiterId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createPosition request with HTTP info returned
         * @return ApiResponse&lt;PositionsCreatePositionResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PositionsCreatePositionResponse> executeWithHttpInfo() throws ApiException {
            return createPositionWithHttpInfo(name, count, status, accessLevel, dateOpen, dateClose, positionUID, funnelId, description, requirements, responsibilities, projectid, approvalFlowId, locationid, departmentId, profileid, recruiterId);
        }

        /**
         * Execute createPosition request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PositionsCreatePositionResponse> _callback) throws ApiException {
            return createPositionAsync(name, count, status, accessLevel, dateOpen, dateClose, positionUID, funnelId, description, requirements, responsibilities, projectid, approvalFlowId, locationid, departmentId, profileid, recruiterId, _callback);
        }
    }

    /**
     * Save Position
     * 
     * @param name Name of Position (required)
     * @param count Number of openings (required)
     * @param status Status of Position (required)
     * @param accessLevel Access level of Position   &#39;pvt&#39; - Private, &#39;ijp&#39; - Publish Internally, &#39;pub&#39; - Public (required)
     * @param dateOpen Date of Opening (required)
     * @param dateClose Date of Closing (required)
     * @param positionUID Unique Identity of Position (required)
     * @param funnelId Candidate Funnel ID of Position (required)
     * @return CreatePositionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public CreatePositionRequestBuilder createPosition(String name, Integer count, String status, String accessLevel, String dateOpen, String dateClose, String positionUID, Integer funnelId) throws IllegalArgumentException {
        if (name == null) throw new IllegalArgumentException("\"name\" is required but got null");
            

        if (count == null) throw new IllegalArgumentException("\"count\" is required but got null");
        if (status == null) throw new IllegalArgumentException("\"status\" is required but got null");
            

        if (accessLevel == null) throw new IllegalArgumentException("\"accessLevel\" is required but got null");
            

        if (dateOpen == null) throw new IllegalArgumentException("\"dateOpen\" is required but got null");
            

        if (dateClose == null) throw new IllegalArgumentException("\"dateClose\" is required but got null");
            

        if (positionUID == null) throw new IllegalArgumentException("\"positionUID\" is required but got null");
            

        if (funnelId == null) throw new IllegalArgumentException("\"funnelId\" is required but got null");
        return new CreatePositionRequestBuilder(name, count, status, accessLevel, dateOpen, dateClose, positionUID, funnelId);
    }
    private okhttp3.Call getPositionCall(Integer positionid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/position/view";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (positionid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("positionid", positionid));
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
    private okhttp3.Call getPositionValidateBeforeCall(Integer positionid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'positionid' is set
        if (positionid == null) {
            throw new ApiException("Missing the required parameter 'positionid' when calling getPosition(Async)");
        }

        return getPositionCall(positionid, _callback);

    }


    private ApiResponse<Object> getPositionWithHttpInfo(Integer positionid) throws ApiException {
        okhttp3.Call localVarCall = getPositionValidateBeforeCall(positionid, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getPositionAsync(Integer positionid, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPositionValidateBeforeCall(positionid, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetPositionRequestBuilder {
        private final Integer positionid;

        private GetPositionRequestBuilder(Integer positionid) {
            this.positionid = positionid;
        }

        /**
         * Build call for getPosition
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
            return getPositionCall(positionid, _callback);
        }


        /**
         * Execute getPosition request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getPositionWithHttpInfo(positionid);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getPosition request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getPositionWithHttpInfo(positionid);
        }

        /**
         * Execute getPosition request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getPositionAsync(positionid, _callback);
        }
    }

    /**
     * Retrieve position
     * 
     * @param positionid  (required)
     * @return GetPositionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GetPositionRequestBuilder getPosition(Integer positionid) throws IllegalArgumentException {
        if (positionid == null) throw new IllegalArgumentException("\"positionid\" is required but got null");
        return new GetPositionRequestBuilder(positionid);
    }
    private okhttp3.Call getPositionsListCall(String search, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/position/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        final String[] localVarAccepts = {
            "application/json",
            "text"
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
    private okhttp3.Call getPositionsListValidateBeforeCall(String search, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        return getPositionsListCall(search, page, pageSize, _callback);

    }


    private ApiResponse<String> getPositionsListWithHttpInfo(String search, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getPositionsListValidateBeforeCall(search, page, pageSize, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getPositionsListAsync(String search, Integer page, Integer pageSize, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPositionsListValidateBeforeCall(search, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetPositionsListRequestBuilder {
        private String search;
        private Integer page;
        private Integer pageSize;

        private GetPositionsListRequestBuilder() {
        }

        /**
         * Set search
         * @param search  (optional)
         * @return GetPositionsListRequestBuilder
         */
        public GetPositionsListRequestBuilder search(String search) {
            this.search = search;
            return this;
        }
        
        /**
         * Set page
         * @param page Page number (optional)
         * @return GetPositionsListRequestBuilder
         */
        public GetPositionsListRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set pageSize
         * @param pageSize Number of users per page (optional)
         * @return GetPositionsListRequestBuilder
         */
        public GetPositionsListRequestBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        
        /**
         * Build call for getPositionsList
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
            return getPositionsListCall(search, page, pageSize, _callback);
        }


        /**
         * Execute getPositionsList request
         * @return String
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public String execute() throws ApiException {
            ApiResponse<String> localVarResp = getPositionsListWithHttpInfo(search, page, pageSize);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getPositionsList request with HTTP info returned
         * @return ApiResponse&lt;String&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<String> executeWithHttpInfo() throws ApiException {
            return getPositionsListWithHttpInfo(search, page, pageSize);
        }

        /**
         * Execute getPositionsList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<String> _callback) throws ApiException {
            return getPositionsListAsync(search, page, pageSize, _callback);
        }
    }

    /**
     * Retrieve positions
     * 
     * @return GetPositionsListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GetPositionsListRequestBuilder getPositionsList() throws IllegalArgumentException {
        return new GetPositionsListRequestBuilder();
    }
}
