# OrgRelationApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllActive**](OrgRelationApi.md#getAllActive) | **GET** /api/orgrelation/allactive | Retrieve all active OrgRelations |
| [**getOrgRelationsByUser**](OrgRelationApi.md#getOrgRelationsByUser) | **GET** /api/orgrelation/orgRelationsByUser | Retrieve all the OrgRelations for the given user. |
| [**saveUser**](OrgRelationApi.md#saveUser) | **GET** /api/orgrelation/save | Saves the OrgRelation for the User |


<a name="getAllActive"></a>
# **getAllActive**
> String getAllActive().execute();

Retrieve all active OrgRelations

Retrieve all active OrgRelations for entire organization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgRelationApi;
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
      String result = client
              .orgRelation
              .getAllActive()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgRelationApi#getAllActive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .orgRelation
              .getAllActive()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgRelationApi#getAllActive");
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

<a name="getOrgRelationsByUser"></a>
# **getOrgRelationsByUser**
> String getOrgRelationsByUser(email).employeeUserId(employeeUserId).empId(empId).execute();

Retrieve all the OrgRelations for the given user.

Retrieve all the OrgRelations for the given user including Active, Archive and Future OrgRelations.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgRelationApi;
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
    String email = "email_example"; // Email for which org relation will be fetched.
    Integer employeeUserId = 56; // User Id for which org relation will be fetched.
    String empId = "empId_example"; // Employee Id for which org relation will be fetched.
    try {
      String result = client
              .orgRelation
              .getOrgRelationsByUser(email)
              .employeeUserId(employeeUserId)
              .empId(empId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgRelationApi#getOrgRelationsByUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .orgRelation
              .getOrgRelationsByUser(email)
              .employeeUserId(employeeUserId)
              .empId(empId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgRelationApi#getOrgRelationsByUser");
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
| **email** | **String**| Email for which org relation will be fetched. | |
| **employeeUserId** | **Integer**| User Id for which org relation will be fetched. | [optional] |
| **empId** | **String**| Employee Id for which org relation will be fetched. | [optional] |

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

<a name="saveUser"></a>
# **saveUser**
> OrgRelationSaveUserResponse saveUser(orgRelationId, managerUserId, managerEmail).userEmail(userEmail).otherUserId(otherUserId).relationType(relationType).startDate(startDate).enddate(enddate).cid(cid).status(status).execute();

Saves the OrgRelation for the User

Saves the OrgRelation for the User.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgRelationApi;
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
    Integer orgRelationId = 56; // ID of OrgRelation for which data will be saved.
    Integer managerUserId = 56; // User Id of the manager.
    String managerEmail = "managerEmail_example"; // Email of manager.
    String userEmail = "userEmail_example"; // User's email.
    Integer otherUserId = 56; // User Id of the reporter.
    String relationType = "relationType_example"; // Type of relation w.r.t manager.
    LocalDate startDate = LocalDate.now(); // Date of start in that org unit.
    LocalDate enddate = LocalDate.now(); // Ending date in that org unit.
    Integer cid = 56; // Company ID.
    String status = "status_example"; // User is active or not active.
    try {
      OrgRelationSaveUserResponse result = client
              .orgRelation
              .saveUser(orgRelationId, managerUserId, managerEmail)
              .userEmail(userEmail)
              .otherUserId(otherUserId)
              .relationType(relationType)
              .startDate(startDate)
              .enddate(enddate)
              .cid(cid)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgRelationApi#saveUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgRelationSaveUserResponse> response = client
              .orgRelation
              .saveUser(orgRelationId, managerUserId, managerEmail)
              .userEmail(userEmail)
              .otherUserId(otherUserId)
              .relationType(relationType)
              .startDate(startDate)
              .enddate(enddate)
              .cid(cid)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgRelationApi#saveUser");
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
| **orgRelationId** | **Integer**| ID of OrgRelation for which data will be saved. | |
| **managerUserId** | **Integer**| User Id of the manager. | |
| **managerEmail** | **String**| Email of manager. | |
| **userEmail** | **String**| User&#39;s email. | [optional] |
| **otherUserId** | **Integer**| User Id of the reporter. | [optional] |
| **relationType** | **String**| Type of relation w.r.t manager. | [optional] |
| **startDate** | **LocalDate**| Date of start in that org unit. | [optional] |
| **enddate** | **LocalDate**| Ending date in that org unit. | [optional] |
| **cid** | **Integer**| Company ID. | [optional] |
| **status** | **String**| User is active or not active. | [optional] |

### Return type

[**OrgRelationSaveUserResponse**](OrgRelationSaveUserResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

