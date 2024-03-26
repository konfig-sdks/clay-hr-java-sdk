# SurveyApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createItemResponse**](SurveyApi.md#createItemResponse) | **POST** /api/survey/item/save | Create the item&#39;s response for a survey |
| [**createResponseByAssignmentId**](SurveyApi.md#createResponseByAssignmentId) | **POST** /api/survey/save | Create a survey response by assignment id |
| [**detailsByFormId**](SurveyApi.md#detailsByFormId) | **GET** /api/survey/view | Get the details of a survey form by form id |
| [**getAllSurveyResponses**](SurveyApi.md#getAllSurveyResponses) | **GET** /api/survey/allresponses | Retrieve all the Responses of the Survey |
| [**getList**](SurveyApi.md#getList) | **GET** /api/survey/list | Get a list of surveys |


<a name="createItemResponse"></a>
# **createItemResponse**
> Map&lt;String, Object&gt; createItemResponse(assignmentId, itemId, responseValue).authorization(authorization).execute();

Create the item&#39;s response for a survey

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SurveyApi;
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
    Integer assignmentId = 56; // assignmentId
    Integer itemId = 56; // itemId
    String responseValue = "responseValue_example"; // responseValue
    String authorization = "authorization_example"; // Authorization
    try {
      Map<String, Object> result = client
              .survey
              .createItemResponse(assignmentId, itemId, responseValue)
              .authorization(authorization)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveyApi#createItemResponse");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, Object>> response = client
              .survey
              .createItemResponse(assignmentId, itemId, responseValue)
              .authorization(authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveyApi#createItemResponse");
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
| **assignmentId** | **Integer**| assignmentId | |
| **itemId** | **Integer**| itemId | |
| **responseValue** | **String**| responseValue | |
| **authorization** | **String**| Authorization | [optional] |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="createResponseByAssignmentId"></a>
# **createResponseByAssignmentId**
> Map&lt;String, Object&gt; createResponseByAssignmentId(assignmentId).authorization(authorization).execute();

Create a survey response by assignment id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SurveyApi;
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
    Integer assignmentId = 56; // assignmentId
    String authorization = "authorization_example"; // Authorization
    try {
      Map<String, Object> result = client
              .survey
              .createResponseByAssignmentId(assignmentId)
              .authorization(authorization)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveyApi#createResponseByAssignmentId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, Object>> response = client
              .survey
              .createResponseByAssignmentId(assignmentId)
              .authorization(authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveyApi#createResponseByAssignmentId");
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
| **assignmentId** | **Integer**| assignmentId | |
| **authorization** | **String**| Authorization | [optional] |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="detailsByFormId"></a>
# **detailsByFormId**
> Map&lt;String, Object&gt; detailsByFormId().authorization(authorization).dynamicFormId(dynamicFormId).execute();

Get the details of a survey form by form id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SurveyApi;
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
    String authorization = "authorization_example"; // Authorization
    Integer dynamicFormId = 0; // dynamicFormId
    try {
      Map<String, Object> result = client
              .survey
              .detailsByFormId()
              .authorization(authorization)
              .dynamicFormId(dynamicFormId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveyApi#detailsByFormId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, Object>> response = client
              .survey
              .detailsByFormId()
              .authorization(authorization)
              .dynamicFormId(dynamicFormId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveyApi#detailsByFormId");
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
| **authorization** | **String**| Authorization | [optional] |
| **dynamicFormId** | **Integer**| dynamicFormId | [optional] [default to 0] |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getAllSurveyResponses"></a>
# **getAllSurveyResponses**
> String getAllSurveyResponses().surveyId(surveyId).execute();

Retrieve all the Responses of the Survey

This page will help you get started with Surveys.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SurveyApi;
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
    Integer surveyId = 56; // The ID of the survey.
    try {
      String result = client
              .survey
              .getAllSurveyResponses()
              .surveyId(surveyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveyApi#getAllSurveyResponses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .survey
              .getAllSurveyResponses()
              .surveyId(surveyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveyApi#getAllSurveyResponses");
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
| **surveyId** | **Integer**| The ID of the survey. | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getList"></a>
# **getList**
> Map&lt;String, Object&gt; getList().authorization(authorization).execute();

Get a list of surveys

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SurveyApi;
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
    String authorization = "authorization_example"; // Authorization
    try {
      Map<String, Object> result = client
              .survey
              .getList()
              .authorization(authorization)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveyApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Map<String, Object>> response = client
              .survey
              .getList()
              .authorization(authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveyApi#getList");
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
| **authorization** | **String**| Authorization | [optional] |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

