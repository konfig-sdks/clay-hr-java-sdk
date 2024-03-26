# CandidatesApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**extractPdfResume**](CandidatesApi.md#extractPdfResume) | **POST** /resume | Create a candidate from pdf resume |
| [**get**](CandidatesApi.md#get) | **GET** / | Retrieve candidates |
| [**getBasicDetails**](CandidatesApi.md#getBasicDetails) | **GET** /list | Retrieve candidates with basic details |
| [**getCandidateDetailByRecruitid**](CandidatesApi.md#getCandidateDetailByRecruitid) | **GET** /detail/{recruitid} | Retrieve the candidate detail by recruitid |
| [**submitNewCandidate**](CandidatesApi.md#submitNewCandidate) | **POST** / | Create new candidate |


<a name="extractPdfResume"></a>
# **extractPdfResume**
> CandidatesExtractPdfResumeResponse extractPdfResume().candidatesExtractPdfResumeRequest(candidatesExtractPdfResumeRequest).execute();

Create a candidate from pdf resume



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CandidatesApi;
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
    File _file = new File("/path/to/file"); // The pdf resume of the candidate.
    try {
      CandidatesExtractPdfResumeResponse result = client
              .candidates
              .extractPdfResume(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#extractPdfResume");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CandidatesExtractPdfResumeResponse> response = client
              .candidates
              .extractPdfResume(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#extractPdfResume");
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
| **candidatesExtractPdfResumeRequest** | [**CandidatesExtractPdfResumeRequest**](CandidatesExtractPdfResumeRequest.md)|  | [optional] |

### Return type

[**CandidatesExtractPdfResumeResponse**](CandidatesExtractPdfResumeResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="get"></a>
# **get**
> CandidatesGetResponse get().execute();

Retrieve candidates



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CandidatesApi;
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
      CandidatesGetResponse result = client
              .candidates
              .get()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CandidatesGetResponse> response = client
              .candidates
              .get()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#get");
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

[**CandidatesGetResponse**](CandidatesGetResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getBasicDetails"></a>
# **getBasicDetails**
> CandidatesGetBasicDetailsResponse getBasicDetails().page(page).pageSize(pageSize).search(search).execute();

Retrieve candidates with basic details



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CandidatesApi;
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
    Integer page = 0; // Page number.
    Integer pageSize = 20; // Number of candidates per page.
    String search = "search_example";
    try {
      CandidatesGetBasicDetailsResponse result = client
              .candidates
              .getBasicDetails()
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getEditPermission());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#getBasicDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CandidatesGetBasicDetailsResponse> response = client
              .candidates
              .getBasicDetails()
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#getBasicDetails");
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
| **page** | **Integer**| Page number. | [optional] [default to 0] |
| **pageSize** | **Integer**| Number of candidates per page. | [optional] [default to 20] |
| **search** | **String**|  | [optional] |

### Return type

[**CandidatesGetBasicDetailsResponse**](CandidatesGetBasicDetailsResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getCandidateDetailByRecruitid"></a>
# **getCandidateDetailByRecruitid**
> CandidatesGetCandidateDetailByRecruitidResponse getCandidateDetailByRecruitid(recruitid).execute();

Retrieve the candidate detail by recruitid



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CandidatesApi;
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
    Integer recruitid = 56; // The ID of the recruiter.
    try {
      CandidatesGetCandidateDetailByRecruitidResponse result = client
              .candidates
              .getCandidateDetailByRecruitid(recruitid)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#getCandidateDetailByRecruitid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CandidatesGetCandidateDetailByRecruitidResponse> response = client
              .candidates
              .getCandidateDetailByRecruitid(recruitid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#getCandidateDetailByRecruitid");
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
| **recruitid** | **Integer**| The ID of the recruiter. | |

### Return type

[**CandidatesGetCandidateDetailByRecruitidResponse**](CandidatesGetCandidateDetailByRecruitidResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="submitNewCandidate"></a>
# **submitNewCandidate**
> CandidatesSubmitNewCandidateResponse submitNewCandidate().name(name).email(email).isNewCand(isNewCand).phone(phone).source(source).execute();

Create new candidate



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CandidatesApi;
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
    String name = "name_example"; // Name of the candidate.
    String email = "email_example"; // Email ID of the candidate.
    String isNewCand = "true"; // Is this new candidate?
    Integer phone = 56; // Phone number of the candidate.
    String source = "API"; // The source from which the candidate is being created.
    try {
      CandidatesSubmitNewCandidateResponse result = client
              .candidates
              .submitNewCandidate()
              .name(name)
              .email(email)
              .isNewCand(isNewCand)
              .phone(phone)
              .source(source)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#submitNewCandidate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CandidatesSubmitNewCandidateResponse> response = client
              .candidates
              .submitNewCandidate()
              .name(name)
              .email(email)
              .isNewCand(isNewCand)
              .phone(phone)
              .source(source)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CandidatesApi#submitNewCandidate");
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
| **name** | **String**| Name of the candidate. | [optional] |
| **email** | **String**| Email ID of the candidate. | [optional] |
| **isNewCand** | **String**| Is this new candidate? | [optional] [enum: true, false] |
| **phone** | **Integer**| Phone number of the candidate. | [optional] |
| **source** | **String**| The source from which the candidate is being created. | [optional] [default to API] |

### Return type

[**CandidatesSubmitNewCandidateResponse**](CandidatesSubmitNewCandidateResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

