# SkillsApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewSkill**](SkillsApi.md#createNewSkill) | **POST** /skill/add | Create a new skill |
| [**getSkills**](SkillsApi.md#getSkills) | **GET** /skills | Retrieve skills |
| [**getUserAssignedSkills**](SkillsApi.md#getUserAssignedSkills) | **GET** /userSkill | Retrieve skills assigned to a user |


<a name="createNewSkill"></a>
# **createNewSkill**
> SkillsCreateNewSkillResponse createNewSkill().skillsCreateNewSkillRequest(skillsCreateNewSkillRequest).execute();

Create a new skill



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SkillsApi;
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
    String description = "description_example"; // Description of the skill.
    String skillCode = "skillCode_example"; // The title of the skill.
    SkillsCreateNewSkillRequestAssessmentModel assessmentModel = new SkillsCreateNewSkillRequestAssessmentModel();
    SkillsCreateNewSkillRequestSkillTypeModel skillTypeModel = new SkillsCreateNewSkillRequestSkillTypeModel();
    try {
      SkillsCreateNewSkillResponse result = client
              .skills
              .createNewSkill(description, skillCode)
              .assessmentModel(assessmentModel)
              .skillTypeModel(skillTypeModel)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getDescription());
      System.out.println(result.getSkillCode());
      System.out.println(result.getSkillTypeModel());
      System.out.println(result.getAssessmentModel());
      System.out.println(result.getSkillId());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#createNewSkill");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SkillsCreateNewSkillResponse> response = client
              .skills
              .createNewSkill(description, skillCode)
              .assessmentModel(assessmentModel)
              .skillTypeModel(skillTypeModel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#createNewSkill");
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
| **skillsCreateNewSkillRequest** | [**SkillsCreateNewSkillRequest**](SkillsCreateNewSkillRequest.md)|  | [optional] |

### Return type

[**SkillsCreateNewSkillResponse**](SkillsCreateNewSkillResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="getSkills"></a>
# **getSkills**
> List&lt;SkillsGetSkillsResponseInner&gt; getSkills().execute();

Retrieve skills



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SkillsApi;
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
      List<SkillsGetSkillsResponseInner> result = client
              .skills
              .getSkills()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#getSkills");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<SkillsGetSkillsResponseInner>> response = client
              .skills
              .getSkills()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#getSkills");
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

[**List&lt;SkillsGetSkillsResponseInner&gt;**](SkillsGetSkillsResponseInner.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getUserAssignedSkills"></a>
# **getUserAssignedSkills**
> SkillsGetUserAssignedSkillsResponse getUserAssignedSkills(assignedUserID).execute();

Retrieve skills assigned to a user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SkillsApi;
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
    Integer assignedUserID = 56; // The ID of the user whose skills should be retrieved.
    try {
      SkillsGetUserAssignedSkillsResponse result = client
              .skills
              .getUserAssignedSkills(assignedUserID)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#getUserAssignedSkills");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SkillsGetUserAssignedSkillsResponse> response = client
              .skills
              .getUserAssignedSkills(assignedUserID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SkillsApi#getUserAssignedSkills");
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
| **assignedUserID** | **Integer**| The ID of the user whose skills should be retrieved. | |

### Return type

[**SkillsGetUserAssignedSkillsResponse**](SkillsGetUserAssignedSkillsResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

