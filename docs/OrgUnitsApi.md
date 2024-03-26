# OrgUnitsApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewOrgUnit**](OrgUnitsApi.md#createNewOrgUnit) | **POST** /api/orgunits/add | Create new org unit |
| [**getOrgUnits**](OrgUnitsApi.md#getOrgUnits) | **GET** /api/orgunits | Retrieve org units |


<a name="createNewOrgUnit"></a>
# **createNewOrgUnit**
> OrgUnitsCreateNewOrgUnitResponse createNewOrgUnit(name, description).deptHead(deptHead).deptHeadName(deptHeadName).departmentCode(departmentCode).departmentId(departmentId).departmentLabel(departmentLabel).noOfEmployees(noOfEmployees).parentDepartmentId(parentDepartmentId).parentDepartmentName(parentDepartmentName).execute();

Create new org unit



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgUnitsApi;
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
    String name = "name_example"; // Name of the org unit.
    String description = "description_example"; // Description of the org unit.
    Integer deptHead = 56; // The ID of the department head.
    String deptHeadName = "deptHeadName_example"; // Name of the department head.
    String departmentCode = "departmentCode_example"; // The code of the department.
    Integer departmentId = 56; // The ID of the department.
    String departmentLabel = "departmentLabel_example"; // Label for the department.
    Integer noOfEmployees = 56; // Number of employees.
    Integer parentDepartmentId = 56; // The ID of the parent department.
    String parentDepartmentName = "parentDepartmentName_example"; // Name of the parent department.
    try {
      OrgUnitsCreateNewOrgUnitResponse result = client
              .orgUnits
              .createNewOrgUnit(name, description)
              .deptHead(deptHead)
              .deptHeadName(deptHeadName)
              .departmentCode(departmentCode)
              .departmentId(departmentId)
              .departmentLabel(departmentLabel)
              .noOfEmployees(noOfEmployees)
              .parentDepartmentId(parentDepartmentId)
              .parentDepartmentName(parentDepartmentName)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgUnitsApi#createNewOrgUnit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrgUnitsCreateNewOrgUnitResponse> response = client
              .orgUnits
              .createNewOrgUnit(name, description)
              .deptHead(deptHead)
              .deptHeadName(deptHeadName)
              .departmentCode(departmentCode)
              .departmentId(departmentId)
              .departmentLabel(departmentLabel)
              .noOfEmployees(noOfEmployees)
              .parentDepartmentId(parentDepartmentId)
              .parentDepartmentName(parentDepartmentName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgUnitsApi#createNewOrgUnit");
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
| **name** | **String**| Name of the org unit. | |
| **description** | **String**| Description of the org unit. | |
| **deptHead** | **Integer**| The ID of the department head. | [optional] |
| **deptHeadName** | **String**| Name of the department head. | [optional] |
| **departmentCode** | **String**| The code of the department. | [optional] |
| **departmentId** | **Integer**| The ID of the department. | [optional] |
| **departmentLabel** | **String**| Label for the department. | [optional] |
| **noOfEmployees** | **Integer**| Number of employees. | [optional] |
| **parentDepartmentId** | **Integer**| The ID of the parent department. | [optional] |
| **parentDepartmentName** | **String**| Name of the parent department. | [optional] |

### Return type

[**OrgUnitsCreateNewOrgUnitResponse**](OrgUnitsCreateNewOrgUnitResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getOrgUnits"></a>
# **getOrgUnits**
> String getOrgUnits().execute();

Retrieve org units



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrgUnitsApi;
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
              .orgUnits
              .getOrgUnits()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgUnitsApi#getOrgUnits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .orgUnits
              .getOrgUnits()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrgUnitsApi#getOrgUnits");
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
| **200** | 200 |  -  |

