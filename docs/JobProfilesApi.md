# JobProfilesApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getJobProfiles**](JobProfilesApi.md#getJobProfiles) | **GET** /api/jobprofiles | Retrieve job profiles |


<a name="getJobProfiles"></a>
# **getJobProfiles**
> List&lt;JobProfilesGetJobProfilesResponseInner&gt; getJobProfiles(status).execute();

Retrieve job profiles



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobProfilesApi;
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
    String status = "OPEN"; // Status of the job profile A- Active, OPEN- Open, ARCHV- Archive
    try {
      List<JobProfilesGetJobProfilesResponseInner> result = client
              .jobProfiles
              .getJobProfiles(status)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobProfilesApi#getJobProfiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<JobProfilesGetJobProfilesResponseInner>> response = client
              .jobProfiles
              .getJobProfiles(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobProfilesApi#getJobProfiles");
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
| **status** | **String**| Status of the job profile A- Active, OPEN- Open, ARCHV- Archive | [default to A] [enum: OPEN, A, ARCHV] |

### Return type

[**List&lt;JobProfilesGetJobProfilesResponseInner&gt;**](JobProfilesGetJobProfilesResponseInner.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

