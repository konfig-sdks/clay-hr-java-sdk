# ObjectiveApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByUserIdOrSpecificObjectiveById**](ObjectiveApi.md#getByUserIdOrSpecificObjectiveById) | **GET** /objective | Retrieve objectives |


<a name="getByUserIdOrSpecificObjectiveById"></a>
# **getByUserIdOrSpecificObjectiveById**
> String getByUserIdOrSpecificObjectiveById().objectiveId(objectiveId).execute();

Retrieve objectives

Retrieve objectives by user ID or specific objective by objective ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ObjectiveApi;
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
    String objectiveId = "objectiveId_example"; // ID of Objective
    try {
      String result = client
              .objective
              .getByUserIdOrSpecificObjectiveById()
              .objectiveId(objectiveId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectiveApi#getByUserIdOrSpecificObjectiveById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .objective
              .getByUserIdOrSpecificObjectiveById()
              .objectiveId(objectiveId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectiveApi#getByUserIdOrSpecificObjectiveById");
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
| **objectiveId** | **String**| ID of Objective | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

