# PositionsApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPosition**](PositionsApi.md#createPosition) | **POST** /position/save | Save Position |
| [**getPosition**](PositionsApi.md#getPosition) | **GET** /position/view | Retrieve position |
| [**getPositionsList**](PositionsApi.md#getPositionsList) | **GET** /position/list | Retrieve positions |


<a name="createPosition"></a>
# **createPosition**
> PositionsCreatePositionResponse createPosition(name, count, status, accessLevel, dateOpen, dateClose, positionUID, funnelId).description(description).requirements(requirements).responsibilities(responsibilities).projectid(projectid).approvalFlowId(approvalFlowId).locationid(locationid).departmentId(departmentId).profileid(profileid).recruiterId(recruiterId).execute();

Save Position



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://acmecompany.bizmerlin.net/rm/api";
    
    configuration.sec0  = "YOUR API KEY";
    
    configuration.sec1  = "YOUR API KEY";
    ClayHr client = new ClayHr(configuration);
    String name = "name_example"; // Name of Position
    Integer count = 1; // Number of openings
    String status = "OPEN"; // Status of Position
    String accessLevel = "pvt"; // Access level of Position   'pvt' - Private, 'ijp' - Publish Internally, 'pub' - Public
    String dateOpen = "dateOpen_example"; // Date of Opening
    String dateClose = "dateClose_example"; // Date of Closing
    String positionUID = "positionUID_example"; // Unique Identity of Position
    Integer funnelId = 56; // Candidate Funnel ID of Position
    String description = "description_example"; // Description of Position
    String requirements = "requirements_example"; // Requirements of Position
    String responsibilities = "responsibilities_example"; // Responsibilities of Position
    Integer projectid = 56; // Project ID of Position
    Integer approvalFlowId = 56; // Position Approval Flow ID of Position
    Integer locationid = 56; // Location ID of Position
    String departmentId = "departmentId_example"; // Department ID of Position
    Integer profileid = 56; // Profile ID of Position
    Integer recruiterId = 56; // ID of Recruiter
    try {
      PositionsCreatePositionResponse result = client
              .positions
              .createPosition(name, count, status, accessLevel, dateOpen, dateClose, positionUID, funnelId)
              .description(description)
              .requirements(requirements)
              .responsibilities(responsibilities)
              .projectid(projectid)
              .approvalFlowId(approvalFlowId)
              .locationid(locationid)
              .departmentId(departmentId)
              .profileid(profileid)
              .recruiterId(recruiterId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#createPosition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PositionsCreatePositionResponse> response = client
              .positions
              .createPosition(name, count, status, accessLevel, dateOpen, dateClose, positionUID, funnelId)
              .description(description)
              .requirements(requirements)
              .responsibilities(responsibilities)
              .projectid(projectid)
              .approvalFlowId(approvalFlowId)
              .locationid(locationid)
              .departmentId(departmentId)
              .profileid(profileid)
              .recruiterId(recruiterId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#createPosition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Name of Position | |
| **count** | **Integer**| Number of openings | |
| **status** | **String**| Status of Position | [default to OPEN] [enum: OPEN, HOLD] |
| **accessLevel** | **String**| Access level of Position   &#39;pvt&#39; - Private, &#39;ijp&#39; - Publish Internally, &#39;pub&#39; - Public | [default to pvt] [enum: pvt, ijp, pub] |
| **dateOpen** | **String**| Date of Opening | |
| **dateClose** | **String**| Date of Closing | |
| **positionUID** | **String**| Unique Identity of Position | |
| **funnelId** | **Integer**| Candidate Funnel ID of Position | |
| **description** | **String**| Description of Position | [optional] |
| **requirements** | **String**| Requirements of Position | [optional] |
| **responsibilities** | **String**| Responsibilities of Position | [optional] |
| **projectid** | **Integer**| Project ID of Position | [optional] |
| **approvalFlowId** | **Integer**| Position Approval Flow ID of Position | [optional] |
| **locationid** | **Integer**| Location ID of Position | [optional] |
| **departmentId** | **String**| Department ID of Position | [optional] |
| **profileid** | **Integer**| Profile ID of Position | [optional] |
| **recruiterId** | **Integer**| ID of Recruiter | [optional] |

### Return type

[**PositionsCreatePositionResponse**](PositionsCreatePositionResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getPosition"></a>
# **getPosition**
> Object getPosition(positionid).execute();

Retrieve position



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://acmecompany.bizmerlin.net/rm/api";
    
    configuration.sec0  = "YOUR API KEY";
    
    configuration.sec1  = "YOUR API KEY";
    ClayHr client = new ClayHr(configuration);
    Integer positionid = 56;
    try {
      Object result = client
              .positions
              .getPosition(positionid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#getPosition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .positions
              .getPosition(positionid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#getPosition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **positionid** | **Integer**|  | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getPositionsList"></a>
# **getPositionsList**
> String getPositionsList().search(search).page(page).pageSize(pageSize).execute();

Retrieve positions



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PositionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://acmecompany.bizmerlin.net/rm/api";
    
    configuration.sec0  = "YOUR API KEY";
    
    configuration.sec1  = "YOUR API KEY";
    ClayHr client = new ClayHr(configuration);
    String search = "search_example"; // 
    Integer page = 56; // Page number
    Integer pageSize = 56; // Number of users per page
    try {
      String result = client
              .positions
              .getPositionsList()
              .search(search)
              .page(page)
              .pageSize(pageSize)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#getPositionsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .positions
              .getPositionsList()
              .search(search)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PositionsApi#getPositionsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | **String**|  | [optional] |
| **page** | **Integer**| Page number | [optional] |
| **pageSize** | **Integer**| Number of users per page | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

