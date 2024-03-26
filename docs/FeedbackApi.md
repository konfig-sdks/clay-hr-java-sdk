# FeedbackApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listFeedback**](FeedbackApi.md#listFeedback) | **GET** /rm/api/feedback | Retrieve feedback |


<a name="listFeedback"></a>
# **listFeedback**
> FeedbackListFeedbackResponse listFeedback(type).execute();

Retrieve feedback



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FeedbackApi;
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
    String type = "all"; // Type of feedback to retrieve.  Choose between [\"all\", \"my\", \"team\"]. all - All Feedback, my - My Feedback, team - Team's feedback
    try {
      FeedbackListFeedbackResponse result = client
              .feedback
              .listFeedback(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getFeedbackList());
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedbackApi#listFeedback");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FeedbackListFeedbackResponse> response = client
              .feedback
              .listFeedback(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedbackApi#listFeedback");
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
| **type** | **String**| Type of feedback to retrieve.  Choose between [\&quot;all\&quot;, \&quot;my\&quot;, \&quot;team\&quot;]. all - All Feedback, my - My Feedback, team - Team&#39;s feedback | [default to all] [enum: all, my, team] |

### Return type

[**FeedbackListFeedbackResponse**](FeedbackListFeedbackResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

