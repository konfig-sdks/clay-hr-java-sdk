# PerformanceReviewApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPerformanceReview**](PerformanceReviewApi.md#createPerformanceReview) | **POST** /appraisal/add | Create Performance Review |
| [**getCompletedReviewsBasedOnUserId**](PerformanceReviewApi.md#getCompletedReviewsBasedOnUserId) | **GET** /appraisal/getCompletedReviews | Retrieve Completed Performance Reviews |
| [**getPerformanceReviews**](PerformanceReviewApi.md#getPerformanceReviews) | **GET** /appraisal/user | Retrieve Performance Reviews |
| [**getTemplates**](PerformanceReviewApi.md#getTemplates) | **GET** /appraisal/template/list | Retrieve Performance Review Templates |
| [**launchPerformanceReviewsInBulk**](PerformanceReviewApi.md#launchPerformanceReviewsInBulk) | **POST** /appraisal/bulkLaunch | Launch Performance Reviews In Bulk |


<a name="createPerformanceReview"></a>
# **createPerformanceReview**
> PerformanceReviewCreatePerformanceReviewResponse createPerformanceReview(templateId).startDate(startDate).endDate(endDate).appraisalType(appraisalType).execute();

Create Performance Review



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PerformanceReviewApi;
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
    Integer templateId = 56; // The ID of the performance review template.
    LocalDate startDate = LocalDate.parse("Sat Oct 01 17:00:00 PDT 2022"); // Start Date of the performance review.
    LocalDate endDate = LocalDate.parse("Sat Oct 01 17:00:00 PDT 2022"); // End Date of the performance review.
    String appraisalType = "Annual"; // Review Period
    try {
      PerformanceReviewCreatePerformanceReviewResponse result = client
              .performanceReview
              .createPerformanceReview(templateId)
              .startDate(startDate)
              .endDate(endDate)
              .appraisalType(appraisalType)
              .execute();
      System.out.println(result);
      System.out.println(result.getAppraisalId());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PerformanceReviewApi#createPerformanceReview");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PerformanceReviewCreatePerformanceReviewResponse> response = client
              .performanceReview
              .createPerformanceReview(templateId)
              .startDate(startDate)
              .endDate(endDate)
              .appraisalType(appraisalType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PerformanceReviewApi#createPerformanceReview");
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
| **templateId** | **Integer**| The ID of the performance review template. | |
| **startDate** | **LocalDate**| Start Date of the performance review. | [optional] |
| **endDate** | **LocalDate**| End Date of the performance review. | [optional] |
| **appraisalType** | **String**| Review Period | [optional] [default to Annual] [enum: Annual, Mid-Year, Quarterly, Probation, Other] |

### Return type

[**PerformanceReviewCreatePerformanceReviewResponse**](PerformanceReviewCreatePerformanceReviewResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="getCompletedReviewsBasedOnUserId"></a>
# **getCompletedReviewsBasedOnUserId**
> String getCompletedReviewsBasedOnUserId(targetUserId).execute();

Retrieve Completed Performance Reviews



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PerformanceReviewApi;
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
    Integer targetUserId = 56; // The ID of the user.
    try {
      String result = client
              .performanceReview
              .getCompletedReviewsBasedOnUserId(targetUserId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PerformanceReviewApi#getCompletedReviewsBasedOnUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .performanceReview
              .getCompletedReviewsBasedOnUserId(targetUserId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PerformanceReviewApi#getCompletedReviewsBasedOnUserId");
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
| **targetUserId** | **Integer**| The ID of the user. | |

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

<a name="getPerformanceReviews"></a>
# **getPerformanceReviews**
> Object getPerformanceReviews().execute();

Retrieve Performance Reviews



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PerformanceReviewApi;
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
              .performanceReview
              .getPerformanceReviews()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PerformanceReviewApi#getPerformanceReviews");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .performanceReview
              .getPerformanceReviews()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PerformanceReviewApi#getPerformanceReviews");
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
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getTemplates"></a>
# **getTemplates**
> Object getTemplates().execute();

Retrieve Performance Review Templates



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PerformanceReviewApi;
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
              .performanceReview
              .getTemplates()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PerformanceReviewApi#getTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .performanceReview
              .getTemplates()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PerformanceReviewApi#getTemplates");
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
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="launchPerformanceReviewsInBulk"></a>
# **launchPerformanceReviewsInBulk**
> Object launchPerformanceReviewsInBulk().templateId(templateId).reviewType(reviewType).startDate(startDate).endDate(endDate).importGoals(importGoals).importJobProfileSkills(importJobProfileSkills).importSkills(importSkills).userIdList(userIdList).execute();

Launch Performance Reviews In Bulk



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PerformanceReviewApi;
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
    String templateId = "templateId_example";
    String reviewType = "reviewType_example";
    String startDate = "startDate_example";
    String endDate = "endDate_example";
    String importGoals = "importGoals_example";
    String importJobProfileSkills = "importJobProfileSkills_example";
    String importSkills = "importSkills_example";
    String userIdList = "userIdList_example";
    try {
      Object result = client
              .performanceReview
              .launchPerformanceReviewsInBulk()
              .templateId(templateId)
              .reviewType(reviewType)
              .startDate(startDate)
              .endDate(endDate)
              .importGoals(importGoals)
              .importJobProfileSkills(importJobProfileSkills)
              .importSkills(importSkills)
              .userIdList(userIdList)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PerformanceReviewApi#launchPerformanceReviewsInBulk");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .performanceReview
              .launchPerformanceReviewsInBulk()
              .templateId(templateId)
              .reviewType(reviewType)
              .startDate(startDate)
              .endDate(endDate)
              .importGoals(importGoals)
              .importJobProfileSkills(importJobProfileSkills)
              .importSkills(importSkills)
              .userIdList(userIdList)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PerformanceReviewApi#launchPerformanceReviewsInBulk");
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
| **templateId** | **String**|  | [optional] |
| **reviewType** | **String**|  | [optional] |
| **startDate** | **String**|  | [optional] |
| **endDate** | **String**|  | [optional] |
| **importGoals** | **String**|  | [optional] |
| **importJobProfileSkills** | **String**|  | [optional] |
| **importSkills** | **String**|  | [optional] |
| **userIdList** | **String**|  | [optional] |

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

