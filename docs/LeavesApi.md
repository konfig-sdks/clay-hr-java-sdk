# LeavesApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPtoBalance**](LeavesApi.md#addPtoBalance) | **POST** /api/userpto/balance/add | Add PTO balance. |
| [**createNewLeave**](LeavesApi.md#createNewLeave) | **POST** /api/leaverequest | Create a new leave. |
| [**getLeaveRequestsWithinDateRange**](LeavesApi.md#getLeaveRequestsWithinDateRange) | **GET** /api/leaverequests | Retrieve leave requests within a date range |
| [**getLeavesBasedOnRole**](LeavesApi.md#getLeavesBasedOnRole) | **GET** /api/manage/leaves | Retrieve leaves for approval/rejection by filtering on basis of Role |
| [**getRemainingHoursCredit**](LeavesApi.md#getRemainingHoursCredit) | **GET** /api/leave/hours/credit | Retrieve remaining hours credit for leave policy |
| [**processLeaveById**](LeavesApi.md#processLeaveById) | **GET** /api/process/leave | Process the leave of a user by leave Id |


<a name="addPtoBalance"></a>
# **addPtoBalance**
> String addPtoBalance(leavesAddPtoBalanceRequest).execute();

Add PTO balance.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeavesApi;
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
    String ptobalances = "ptobalances_example"; // PTO Balance of user.
    try {
      String result = client
              .leaves
              .addPtoBalance(ptobalances)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#addPtoBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .leaves
              .addPtoBalance(ptobalances)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#addPtoBalance");
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
| **leavesAddPtoBalanceRequest** | [**LeavesAddPtoBalanceRequest**](LeavesAddPtoBalanceRequest.md)| ptoBalances | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="createNewLeave"></a>
# **createNewLeave**
> String createNewLeave(leaveModel).execute();

Create a new leave.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeavesApi;
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
    LocalDate date = LocalDate.now(); // Date of the leave.
    String description = "description_example"; // Description for the leave.
    UserViewModel createUserViewModel = new UserViewModel();
    String endDateMeridiem = "endDateMeridiem_example";
    String meridiem = "meridiem_example";
    Integer numberOfDays = 56; // Number of days for which leave is requested.
    PtoPolicyModel ptoPolicyModel = new PtoPolicyModel();
    Double totalLeaveDays = 3.4D; // Total days of leave.
    Double totalLeaveHours = 3.4D; // Total hours of leave.
    UserModel userModel = new UserModel();
    try {
      String result = client
              .leaves
              .createNewLeave(date)
              .description(description)
              .createUserViewModel(createUserViewModel)
              .endDateMeridiem(endDateMeridiem)
              .meridiem(meridiem)
              .numberOfDays(numberOfDays)
              .ptoPolicyModel(ptoPolicyModel)
              .totalLeaveDays(totalLeaveDays)
              .totalLeaveHours(totalLeaveHours)
              .userModel(userModel)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#createNewLeave");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .leaves
              .createNewLeave(date)
              .description(description)
              .createUserViewModel(createUserViewModel)
              .endDateMeridiem(endDateMeridiem)
              .meridiem(meridiem)
              .numberOfDays(numberOfDays)
              .ptoPolicyModel(ptoPolicyModel)
              .totalLeaveDays(totalLeaveDays)
              .totalLeaveHours(totalLeaveHours)
              .userModel(userModel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#createNewLeave");
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
| **leaveModel** | [**LeaveModel**](LeaveModel.md)| leaveModel | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="getLeaveRequestsWithinDateRange"></a>
# **getLeaveRequestsWithinDateRange**
> String getLeaveRequestsWithinDateRange(endDate, startDate).leaveUserid(leaveUserid).status(status).execute();

Retrieve leave requests within a date range

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeavesApi;
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
    LocalDate endDate = LocalDate.now(); // End date of the leave.
    LocalDate startDate = LocalDate.now(); // Start date of the leave.
    Integer leaveUserid = 0; // The userId for that leave.
    String status = "AP"; // The status of leave.   AP: Leave approved   WA: Leave is waiting for approval   RJ: Leave has been rejected   PAP: Leave is in a muti layer approval flow and has been partially approved   RCAL:  Leave was approved, taken, computed and then recalled 
    try {
      String result = client
              .leaves
              .getLeaveRequestsWithinDateRange(endDate, startDate)
              .leaveUserid(leaveUserid)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#getLeaveRequestsWithinDateRange");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .leaves
              .getLeaveRequestsWithinDateRange(endDate, startDate)
              .leaveUserid(leaveUserid)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#getLeaveRequestsWithinDateRange");
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
| **endDate** | **LocalDate**| End date of the leave. | |
| **startDate** | **LocalDate**| Start date of the leave. | |
| **leaveUserid** | **Integer**| The userId for that leave. | [optional] [default to 0] |
| **status** | **String**| The status of leave.   AP: Leave approved   WA: Leave is waiting for approval   RJ: Leave has been rejected   PAP: Leave is in a muti layer approval flow and has been partially approved   RCAL:  Leave was approved, taken, computed and then recalled  | [optional] [default to AP] [enum: AP, WA, RJ, PAP, RCAL] |

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

<a name="getLeavesBasedOnRole"></a>
# **getLeavesBasedOnRole**
> String getLeavesBasedOnRole().execute();

Retrieve leaves for approval/rejection by filtering on basis of Role

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeavesApi;
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
              .leaves
              .getLeavesBasedOnRole()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#getLeavesBasedOnRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .leaves
              .getLeavesBasedOnRole()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#getLeavesBasedOnRole");
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

<a name="getRemainingHoursCredit"></a>
# **getRemainingHoursCredit**
> String getRemainingHoursCredit(leaveDate, leaveId, leaveUserId, ptoPolicyId).execute();

Retrieve remaining hours credit for leave policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeavesApi;
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
    LocalDate leaveDate = LocalDate.now(); // The date of the leave.
    Integer leaveId = 56; // The Id of the leave.
    Integer leaveUserId = 56; // The userId for that leave.
    Integer ptoPolicyId = 56; // The Id of the ptoPolicy
    try {
      String result = client
              .leaves
              .getRemainingHoursCredit(leaveDate, leaveId, leaveUserId, ptoPolicyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#getRemainingHoursCredit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .leaves
              .getRemainingHoursCredit(leaveDate, leaveId, leaveUserId, ptoPolicyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#getRemainingHoursCredit");
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
| **leaveDate** | **LocalDate**| The date of the leave. | |
| **leaveId** | **Integer**| The Id of the leave. | |
| **leaveUserId** | **Integer**| The userId for that leave. | |
| **ptoPolicyId** | **Integer**| The Id of the ptoPolicy | |

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

<a name="processLeaveById"></a>
# **processLeaveById**
> String processLeaveById(leaveId, status).execute();

Process the leave of a user by leave Id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeavesApi;
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
    Integer leaveId = 56; // The Id for the leave.
    String status = "AP"; // The status of leave.   AP: Leave approved   WA: Leave is waiting for approval   RJ: Leave has been rejected   PAP: Leave is in a muti layer approval flow and has been partially approved   RCAL:  Leave was approved, taken, computed and then recalled 
    try {
      String result = client
              .leaves
              .processLeaveById(leaveId, status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#processLeaveById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .leaves
              .processLeaveById(leaveId, status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeavesApi#processLeaveById");
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
| **leaveId** | **Integer**| The Id for the leave. | |
| **status** | **String**| The status of leave.   AP: Leave approved   WA: Leave is waiting for approval   RJ: Leave has been rejected   PAP: Leave is in a muti layer approval flow and has been partially approved   RCAL:  Leave was approved, taken, computed and then recalled  | [default to AP] [enum: AP, WA, RJ, PAP, RCAL] |

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

