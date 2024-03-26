# TrainingsApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByUserId**](TrainingsApi.md#getByUserId) | **GET** /api/trainings | Retrieve trainings by user ID |
| [**getTrainingContentByTrainingId**](TrainingsApi.md#getTrainingContentByTrainingId) | **GET** /api/training/content | Retrieve training content by training ID |
| [**synchronizeWithTalentLMS**](TrainingsApi.md#synchronizeWithTalentLMS) | **GET** /api/training/talentlms/sync | Sync with talent LMS |
| [**updateUserStatus**](TrainingsApi.md#updateUserStatus) | **POST** /api/training/status/update | Update training status for user |


<a name="getByUserId"></a>
# **getByUserId**
> Object getByUserId().execute();

Retrieve trainings by user ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingsApi;
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
    try {
      Object result = client
              .trainings
              .getByUserId()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#getByUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .trainings
              .getByUserId()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#getByUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getTrainingContentByTrainingId"></a>
# **getTrainingContentByTrainingId**
> Object getTrainingContentByTrainingId(trainingId).execute();

Retrieve training content by training ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingsApi;
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
    Integer trainingId = 56; // trainingId
    try {
      Object result = client
              .trainings
              .getTrainingContentByTrainingId(trainingId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#getTrainingContentByTrainingId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .trainings
              .getTrainingContentByTrainingId(trainingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#getTrainingContentByTrainingId");
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
| **trainingId** | **Integer**| trainingId | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="synchronizeWithTalentLMS"></a>
# **synchronizeWithTalentLMS**
> String synchronizeWithTalentLMS(redirectUrl).execute();

Sync with talent LMS

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingsApi;
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
    String redirectUrl = "redirectUrl_example"; // redirectUrl
    try {
      String result = client
              .trainings
              .synchronizeWithTalentLMS(redirectUrl)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#synchronizeWithTalentLMS");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .trainings
              .synchronizeWithTalentLMS(redirectUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#synchronizeWithTalentLMS");
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
| **redirectUrl** | **String**| redirectUrl | |

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
| **200** | OK |  -  |

<a name="updateUserStatus"></a>
# **updateUserStatus**
> String updateUserStatus(status, userTrainingId).execute();

Update training status for user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingsApi;
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
    String status = "status_example"; // Status of the user training.
    Integer userTrainingId = 56; // The ID of the user training.
    try {
      String result = client
              .trainings
              .updateUserStatus(status, userTrainingId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#updateUserStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .trainings
              .updateUserStatus(status, userTrainingId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#updateUserStatus");
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
| **status** | **String**| Status of the user training. | |
| **userTrainingId** | **Integer**| The ID of the user training. | |

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
| **200** | OK |  -  |

