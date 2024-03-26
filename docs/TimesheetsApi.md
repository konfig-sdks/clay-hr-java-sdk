# TimesheetsApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clockIn**](TimesheetsApi.md#clockIn) | **POST** /api/timesheet/clockin | Clock in. |
| [**clockOut**](TimesheetsApi.md#clockOut) | **POST** /api/timesheet/clockout | Clock out. |
| [**createOrUpdateTimesheet**](TimesheetsApi.md#createOrUpdateTimesheet) | **POST** /api/timesheet/save | Create/Update a timesheet. |
| [**deleteByTimesheetId**](TimesheetsApi.md#deleteByTimesheetId) | **POST** /api/timesheet/delete | Delete a timesheet. |
| [**getActiveAllocations**](TimesheetsApi.md#getActiveAllocations) | **GET** /api/timesheet/allocations/list | Retrieve my active allocations. |
| [**getApprovalList**](TimesheetsApi.md#getApprovalList) | **GET** /api/timesheet/approvals/list | Retrieve timesheet approvals. |
| [**getByTimesheetId**](TimesheetsApi.md#getByTimesheetId) | **GET** /api/timesheet | Retrieve a timesheet by timesheet ID. |
| [**getByUserId**](TimesheetsApi.md#getByUserId) | **GET** /api/timesheets | Retrieve timesheets by User ID. |
| [**getDetailsByTimesheetId**](TimesheetsApi.md#getDetailsByTimesheetId) | **GET** /api/timesheets/details/{timeSheetId} | Retrieve timesheet details by Timesheet ID. |
| [**getPreferencesByCid**](TimesheetsApi.md#getPreferencesByCid) | **GET** /api/timesheet/preferences/list | Retrieve my timesheet preferences. |
| [**getTimecardsByTimesheetId**](TimesheetsApi.md#getTimecardsByTimesheetId) | **GET** /api/timecards | Retrieve timecards by Timesheet ID. |
| [**listActivityTypesByCid**](TimesheetsApi.md#listActivityTypesByCid) | **GET** /api/timesheet/activitytype/list | Retrieve list of activity types based on cid. |
| [**updateStatusByTimesheetId**](TimesheetsApi.md#updateStatusByTimesheetId) | **POST** /api/timesheet/update | Update timesheet status by Timesheet ID. |


<a name="clockIn"></a>
# **clockIn**
> TimesheetsClockInResponse clockIn().proceedOutsideGeoFence(proceedOutsideGeoFence).description(description).projectId(projectId).projectManager(projectManager).categoryCode(categoryCode).notes(notes).billable(billable).activity(activity).approvalRejectionReason(approvalRejectionReason).clockInLongitude(clockInLongitude).clockInLatitude(clockInLatitude).clockOutLongitude(clockOutLongitude).clockOutLatitude(clockOutLatitude).projectAreaId(projectAreaId).execute();

Clock in.

Allows to clock in.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    Integer proceedOutsideGeoFence = 0; // To clockin outside geofence
    String description = "description_example"; // Description of timecard.
    Integer projectId = 56; // Project ID of project.
    String projectManager = "projectManager_example"; // Project Manager corresponding user.
    String categoryCode = "RG"; // Category of timecard. Choose between [\"Regular\", \"Overtime\"].
    String notes = "notes_example"; // Notes.
    String billable = "Y"; // Billable or non- billable timecard. Select 'Y' for billable and 'N' for non-billable
    String activity = "activity_example"; // Activity type of timecard.
    String approvalRejectionReason = "approvalRejectionReason_example"; // Reason for approval rejection.
    Double clockInLongitude = 3.4D; // Longitude value while clocking in.
    Double clockInLatitude = 3.4D; // Latitude value while clocking in.
    Double clockOutLongitude = 3.4D; // Longitude value while clocking out.
    Double clockOutLatitude = 3.4D; // Latitude value while clocking out.
    Integer projectAreaId = 56; // Project area ID of project area.
    try {
      TimesheetsClockInResponse result = client
              .timesheets
              .clockIn()
              .proceedOutsideGeoFence(proceedOutsideGeoFence)
              .description(description)
              .projectId(projectId)
              .projectManager(projectManager)
              .categoryCode(categoryCode)
              .notes(notes)
              .billable(billable)
              .activity(activity)
              .approvalRejectionReason(approvalRejectionReason)
              .clockInLongitude(clockInLongitude)
              .clockInLatitude(clockInLatitude)
              .clockOutLongitude(clockOutLongitude)
              .clockOutLatitude(clockOutLatitude)
              .projectAreaId(projectAreaId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTimesheetId());
      System.out.println(result.getTimecardId());
      System.out.println(result.getStartTime());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#clockIn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetsClockInResponse> response = client
              .timesheets
              .clockIn()
              .proceedOutsideGeoFence(proceedOutsideGeoFence)
              .description(description)
              .projectId(projectId)
              .projectManager(projectManager)
              .categoryCode(categoryCode)
              .notes(notes)
              .billable(billable)
              .activity(activity)
              .approvalRejectionReason(approvalRejectionReason)
              .clockInLongitude(clockInLongitude)
              .clockInLatitude(clockInLatitude)
              .clockOutLongitude(clockOutLongitude)
              .clockOutLatitude(clockOutLatitude)
              .projectAreaId(projectAreaId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#clockIn");
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
| **proceedOutsideGeoFence** | **Integer**| To clockin outside geofence | [optional] [default to 0] |
| **description** | **String**| Description of timecard. | [optional] |
| **projectId** | **Integer**| Project ID of project. | [optional] |
| **projectManager** | **String**| Project Manager corresponding user. | [optional] |
| **categoryCode** | **String**| Category of timecard. Choose between [\&quot;Regular\&quot;, \&quot;Overtime\&quot;]. | [optional] [enum: RG, OT] |
| **notes** | **String**| Notes. | [optional] |
| **billable** | **String**| Billable or non- billable timecard. Select &#39;Y&#39; for billable and &#39;N&#39; for non-billable | [optional] [enum: Y, N] |
| **activity** | **String**| Activity type of timecard. | [optional] |
| **approvalRejectionReason** | **String**| Reason for approval rejection. | [optional] |
| **clockInLongitude** | **Double**| Longitude value while clocking in. | [optional] |
| **clockInLatitude** | **Double**| Latitude value while clocking in. | [optional] |
| **clockOutLongitude** | **Double**| Longitude value while clocking out. | [optional] |
| **clockOutLatitude** | **Double**| Latitude value while clocking out. | [optional] |
| **projectAreaId** | **Integer**| Project area ID of project area. | [optional] |

### Return type

[**TimesheetsClockInResponse**](TimesheetsClockInResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="clockOut"></a>
# **clockOut**
> TimesheetsClockOutResponse clockOut().proceedOutsideGeoFence(proceedOutsideGeoFence).description(description).projectId(projectId).projectManager(projectManager).categoryCode(categoryCode).notes(notes).billable(billable).activity(activity).approvalRejectionReason(approvalRejectionReason).clockInLongitude(clockInLongitude).clockInLatitude(clockInLatitude).clockOutLongitude(clockOutLongitude).clockOutLatitude(clockOutLatitude).projectAreaId(projectAreaId).execute();

Clock out.

Allows user to clock out.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    Integer proceedOutsideGeoFence = 0; // clock out outside geofence
    String description = "description_example"; // Description of timecard.
    Integer projectId = 56; // Project ID of project.
    String projectManager = "projectManager_example"; // Project Manager corresponding user.
    String categoryCode = "RG"; // Category of timecard. Choose between [\"Regular\", \"Overtime\"].
    String notes = "notes_example"; // Notes.
    String billable = "Y"; // Billable or non- billable timecard. Select 'Y' for billable and 'N' for non-billable
    String activity = "activity_example"; // Activity type of timecard.
    String approvalRejectionReason = "approvalRejectionReason_example"; // Reason for approval rejection.
    Double clockInLongitude = 3.4D; // Longitude value while clocking in.
    Double clockInLatitude = 3.4D; // Latitude value while clocking in.
    Double clockOutLongitude = 3.4D; // Longitude value while clocking out.
    Double clockOutLatitude = 3.4D; // Latitude value while clocking out.
    Integer projectAreaId = 56; // Project area ID of project area.
    try {
      TimesheetsClockOutResponse result = client
              .timesheets
              .clockOut()
              .proceedOutsideGeoFence(proceedOutsideGeoFence)
              .description(description)
              .projectId(projectId)
              .projectManager(projectManager)
              .categoryCode(categoryCode)
              .notes(notes)
              .billable(billable)
              .activity(activity)
              .approvalRejectionReason(approvalRejectionReason)
              .clockInLongitude(clockInLongitude)
              .clockInLatitude(clockInLatitude)
              .clockOutLongitude(clockOutLongitude)
              .clockOutLatitude(clockOutLatitude)
              .projectAreaId(projectAreaId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStartTime());
      System.out.println(result.getEndTime());
      System.out.println(result.getMessage());
      System.out.println(result.getElapsedTime());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#clockOut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetsClockOutResponse> response = client
              .timesheets
              .clockOut()
              .proceedOutsideGeoFence(proceedOutsideGeoFence)
              .description(description)
              .projectId(projectId)
              .projectManager(projectManager)
              .categoryCode(categoryCode)
              .notes(notes)
              .billable(billable)
              .activity(activity)
              .approvalRejectionReason(approvalRejectionReason)
              .clockInLongitude(clockInLongitude)
              .clockInLatitude(clockInLatitude)
              .clockOutLongitude(clockOutLongitude)
              .clockOutLatitude(clockOutLatitude)
              .projectAreaId(projectAreaId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#clockOut");
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
| **proceedOutsideGeoFence** | **Integer**| clock out outside geofence | [optional] [default to 0] |
| **description** | **String**| Description of timecard. | [optional] |
| **projectId** | **Integer**| Project ID of project. | [optional] |
| **projectManager** | **String**| Project Manager corresponding user. | [optional] |
| **categoryCode** | **String**| Category of timecard. Choose between [\&quot;Regular\&quot;, \&quot;Overtime\&quot;]. | [optional] [enum: RG, OT] |
| **notes** | **String**| Notes. | [optional] |
| **billable** | **String**| Billable or non- billable timecard. Select &#39;Y&#39; for billable and &#39;N&#39; for non-billable | [optional] [enum: Y, N] |
| **activity** | **String**| Activity type of timecard. | [optional] |
| **approvalRejectionReason** | **String**| Reason for approval rejection. | [optional] |
| **clockInLongitude** | **Double**| Longitude value while clocking in. | [optional] |
| **clockInLatitude** | **Double**| Latitude value while clocking in. | [optional] |
| **clockOutLongitude** | **Double**| Longitude value while clocking out. | [optional] |
| **clockOutLatitude** | **Double**| Latitude value while clocking out. | [optional] |
| **projectAreaId** | **Integer**| Project area ID of project area. | [optional] |

### Return type

[**TimesheetsClockOutResponse**](TimesheetsClockOutResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createOrUpdateTimesheet"></a>
# **createOrUpdateTimesheet**
> TimesheetsCreateOrUpdateTimesheetResponse createOrUpdateTimesheet(date, projectId, elapsedTime).cardId(cardId).description(description).clockedOutsideGeofence(clockedOutsideGeofence).projectManager(projectManager).categoryCode(categoryCode).notes(notes).billable(billable).activity(activity).approvalRejectionReason(approvalRejectionReason).clockInLongitude(clockInLongitude).clockInLatitude(clockInLatitude).clockOutLongitude(clockOutLongitude).clockOutLatitude(clockOutLatitude).projectAreaId(projectAreaId).execute();

Create/Update a timesheet.

Creates a new timesheet and update existing timesheet.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    LocalDate date = LocalDate.now(); // Timesheet date.
    Integer projectId = 56; // Project ID of project.
    OffsetDateTime elapsedTime = OffsetDateTime.now(); // Elapsed Time of timecard.
    Integer cardId = 56; // Timecard Id of timecard.
    String description = "description_example"; // Description of timecard.
    Integer clockedOutsideGeofence = 56; // Clocked in or clocked out outside geofence.
    String projectManager = "projectManager_example"; // Project Manager corresponding user.
    String categoryCode = "RG"; // Category of timecard. Choose between [\"Regular\", \"Overtime\"].
    String notes = "notes_example"; // Notes.
    String billable = "Y"; // Billable or non- billable timecard. Select 'Y' for billable and 'N' for non-billable
    String activity = "activity_example"; // Activity type of timecard.
    String approvalRejectionReason = "approvalRejectionReason_example"; // Reason for approval rejection.
    Double clockInLongitude = 3.4D; // Longitude value while clocking in.
    Double clockInLatitude = 3.4D; // Latitude value while clocking in.
    Double clockOutLongitude = 3.4D; // Longitude value while clocking out.
    Double clockOutLatitude = 3.4D; // Latitude value while clocking out.
    Integer projectAreaId = 56; // Project area ID of project area.
    try {
      TimesheetsCreateOrUpdateTimesheetResponse result = client
              .timesheets
              .createOrUpdateTimesheet(date, projectId, elapsedTime)
              .cardId(cardId)
              .description(description)
              .clockedOutsideGeofence(clockedOutsideGeofence)
              .projectManager(projectManager)
              .categoryCode(categoryCode)
              .notes(notes)
              .billable(billable)
              .activity(activity)
              .approvalRejectionReason(approvalRejectionReason)
              .clockInLongitude(clockInLongitude)
              .clockInLatitude(clockInLatitude)
              .clockOutLongitude(clockOutLongitude)
              .clockOutLatitude(clockOutLatitude)
              .projectAreaId(projectAreaId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTimesheetId());
      System.out.println(result.getTimecardId());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#createOrUpdateTimesheet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetsCreateOrUpdateTimesheetResponse> response = client
              .timesheets
              .createOrUpdateTimesheet(date, projectId, elapsedTime)
              .cardId(cardId)
              .description(description)
              .clockedOutsideGeofence(clockedOutsideGeofence)
              .projectManager(projectManager)
              .categoryCode(categoryCode)
              .notes(notes)
              .billable(billable)
              .activity(activity)
              .approvalRejectionReason(approvalRejectionReason)
              .clockInLongitude(clockInLongitude)
              .clockInLatitude(clockInLatitude)
              .clockOutLongitude(clockOutLongitude)
              .clockOutLatitude(clockOutLatitude)
              .projectAreaId(projectAreaId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#createOrUpdateTimesheet");
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
| **date** | **LocalDate**| Timesheet date. | |
| **projectId** | **Integer**| Project ID of project. | |
| **elapsedTime** | **OffsetDateTime**| Elapsed Time of timecard. | |
| **cardId** | **Integer**| Timecard Id of timecard. | [optional] |
| **description** | **String**| Description of timecard. | [optional] |
| **clockedOutsideGeofence** | **Integer**| Clocked in or clocked out outside geofence. | [optional] |
| **projectManager** | **String**| Project Manager corresponding user. | [optional] |
| **categoryCode** | **String**| Category of timecard. Choose between [\&quot;Regular\&quot;, \&quot;Overtime\&quot;]. | [optional] [enum: RG, OT] |
| **notes** | **String**| Notes. | [optional] |
| **billable** | **String**| Billable or non- billable timecard. Select &#39;Y&#39; for billable and &#39;N&#39; for non-billable | [optional] [enum: Y, N] |
| **activity** | **String**| Activity type of timecard. | [optional] |
| **approvalRejectionReason** | **String**| Reason for approval rejection. | [optional] |
| **clockInLongitude** | **Double**| Longitude value while clocking in. | [optional] |
| **clockInLatitude** | **Double**| Latitude value while clocking in. | [optional] |
| **clockOutLongitude** | **Double**| Longitude value while clocking out. | [optional] |
| **clockOutLatitude** | **Double**| Latitude value while clocking out. | [optional] |
| **projectAreaId** | **Integer**| Project area ID of project area. | [optional] |

### Return type

[**TimesheetsCreateOrUpdateTimesheetResponse**](TimesheetsCreateOrUpdateTimesheetResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="deleteByTimesheetId"></a>
# **deleteByTimesheetId**
> TimesheetsDeleteByTimesheetIdResponse deleteByTimesheetId(timesheetId).execute();

Delete a timesheet.

Deletes a timesheet by Timesheet ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    Integer timesheetId = 56; // Timesheet ID of timesheet.
    try {
      TimesheetsDeleteByTimesheetIdResponse result = client
              .timesheets
              .deleteByTimesheetId(timesheetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#deleteByTimesheetId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetsDeleteByTimesheetIdResponse> response = client
              .timesheets
              .deleteByTimesheetId(timesheetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#deleteByTimesheetId");
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
| **timesheetId** | **Integer**| Timesheet ID of timesheet. | |

### Return type

[**TimesheetsDeleteByTimesheetIdResponse**](TimesheetsDeleteByTimesheetIdResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getActiveAllocations"></a>
# **getActiveAllocations**
> TimesheetsGetActiveAllocationsResponse getActiveAllocations().execute();

Retrieve my active allocations.

Retrieve list of active allocations of user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
      TimesheetsGetActiveAllocationsResponse result = client
              .timesheets
              .getActiveAllocations()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getActiveAllocations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetsGetActiveAllocationsResponse> response = client
              .timesheets
              .getActiveAllocations()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getActiveAllocations");
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

[**TimesheetsGetActiveAllocationsResponse**](TimesheetsGetActiveAllocationsResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getApprovalList"></a>
# **getApprovalList**
> TimesheetsGetApprovalListResponse getApprovalList(startDate, endDate).execute();

Retrieve timesheet approvals.

Retrieve list of timesheet approvals on the basis of permission.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    String startDate = "startDate_example"; // Start date of the timesheet.
    String endDate = "endDate_example"; // End date of the timesheet.
    try {
      TimesheetsGetApprovalListResponse result = client
              .timesheets
              .getApprovalList(startDate, endDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getApprovalList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetsGetApprovalListResponse> response = client
              .timesheets
              .getApprovalList(startDate, endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getApprovalList");
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
| **startDate** | **String**| Start date of the timesheet. | |
| **endDate** | **String**| End date of the timesheet. | |

### Return type

[**TimesheetsGetApprovalListResponse**](TimesheetsGetApprovalListResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getByTimesheetId"></a>
# **getByTimesheetId**
> String getByTimesheetId(timesheetId).execute();

Retrieve a timesheet by timesheet ID.

Retrieve a timesheet by timesheet ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    Integer timesheetId = 56; // Tmesheet ID of timesheet.
    try {
      String result = client
              .timesheets
              .getByTimesheetId(timesheetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getByTimesheetId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .timesheets
              .getByTimesheetId(timesheetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getByTimesheetId");
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
| **timesheetId** | **Integer**| Tmesheet ID of timesheet. | |

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

<a name="getByUserId"></a>
# **getByUserId**
> String getByUserId().startDate(startDate).endDate(endDate).execute();

Retrieve timesheets by User ID.

Retrieve a list of timesheets.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    String startDate = "startDate_example"; // Start date of the timesheet.
    String endDate = "endDate_example"; // End date of the timesheet.
    try {
      String result = client
              .timesheets
              .getByUserId()
              .startDate(startDate)
              .endDate(endDate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getByUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .timesheets
              .getByUserId()
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getByUserId");
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
| **startDate** | **String**| Start date of the timesheet. | [optional] |
| **endDate** | **String**| End date of the timesheet. | [optional] |

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

<a name="getDetailsByTimesheetId"></a>
# **getDetailsByTimesheetId**
> String getDetailsByTimesheetId(timeSheetId).flatcustomfields(flatcustomfields).execute();

Retrieve timesheet details by Timesheet ID.

Retrieve timesheet details by Timesheet ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    Integer timeSheetId = 56; // Timesheet ID of timesheet.
    Boolean flatcustomfields = false;
    try {
      String result = client
              .timesheets
              .getDetailsByTimesheetId(timeSheetId)
              .flatcustomfields(flatcustomfields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getDetailsByTimesheetId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .timesheets
              .getDetailsByTimesheetId(timeSheetId)
              .flatcustomfields(flatcustomfields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getDetailsByTimesheetId");
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
| **timeSheetId** | **Integer**| Timesheet ID of timesheet. | |
| **flatcustomfields** | **Boolean**|  | [optional] |

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

<a name="getPreferencesByCid"></a>
# **getPreferencesByCid**
> TimesheetsGetPreferencesByCidResponse getPreferencesByCid().execute();

Retrieve my timesheet preferences.

Retrieve list of timesheet preferences based in cid.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
      TimesheetsGetPreferencesByCidResponse result = client
              .timesheets
              .getPreferencesByCid()
              .execute();
      System.out.println(result);
      System.out.println(result.getTimesheetStartDay());
      System.out.println(result.getBillablePrefValue());
      System.out.println(result.getFutureTcPrefValue());
      System.out.println(result.getEndDate());
      System.out.println(result.getProjectAreaPrefValue());
      System.out.println(result.getComplianceMsg());
      System.out.println(result.getActivityTypePrefValue());
      System.out.println(result.getMobileAppClockInPrefValue());
      System.out.println(result.getAllocatedProjectPrefValue());
      System.out.println(result.getAddEditTcPrefValue());
      System.out.println(result.getBackdatedTcReasonPrefValue());
      System.out.println(result.getTimesheetPeriod());
      System.out.println(result.getCategoryPrefValue());
      System.out.println(result.getStartTimeEndTimeRequired());
      System.out.println(result.getWorkingHrsPerDay());
      System.out.println(result.getKioskAppClockInPrefValue());
      System.out.println(result.getQrCodeClockInPrefValue());
      System.out.println(result.getTcApprovalReasonPrefValue());
      System.out.println(result.getClockInOutsideGeofencePreferenceValue());
      System.out.println(result.getStartDate());
      System.out.println(result.getTcRejectionReasonPrefValue());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getPreferencesByCid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetsGetPreferencesByCidResponse> response = client
              .timesheets
              .getPreferencesByCid()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getPreferencesByCid");
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

[**TimesheetsGetPreferencesByCidResponse**](TimesheetsGetPreferencesByCidResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTimecardsByTimesheetId"></a>
# **getTimecardsByTimesheetId**
> String getTimecardsByTimesheetId(startDate, endDate).execute();

Retrieve timecards by Timesheet ID.

Retrieve a list of timecards.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    LocalDate startDate = LocalDate.now(); // Start date of the timesheet.
    LocalDate endDate = LocalDate.now(); // End date of the timesheet.
    try {
      String result = client
              .timesheets
              .getTimecardsByTimesheetId(startDate, endDate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getTimecardsByTimesheetId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .timesheets
              .getTimecardsByTimesheetId(startDate, endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#getTimecardsByTimesheetId");
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
| **startDate** | **LocalDate**| Start date of the timesheet. | |
| **endDate** | **LocalDate**| End date of the timesheet. | |

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

<a name="listActivityTypesByCid"></a>
# **listActivityTypesByCid**
> TimesheetsListActivityTypesByCidResponse listActivityTypesByCid().execute();

Retrieve list of activity types based on cid.

Retrieve list of activity types based on cid.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
      TimesheetsListActivityTypesByCidResponse result = client
              .timesheets
              .listActivityTypesByCid()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#listActivityTypesByCid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetsListActivityTypesByCidResponse> response = client
              .timesheets
              .listActivityTypesByCid()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#listActivityTypesByCid");
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

[**TimesheetsListActivityTypesByCidResponse**](TimesheetsListActivityTypesByCidResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateStatusByTimesheetId"></a>
# **updateStatusByTimesheetId**
> TimesheetsUpdateStatusByTimesheetIdResponse updateStatusByTimesheetId(timesheetId, status).comments(comments).execute();

Update timesheet status by Timesheet ID.

Update the timesheet status (submit, approve, reject) corresponding to supplied Timesheet ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
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
    Integer timesheetId = 56; // Timesheet ID of the timesheet.
    String status = "PD"; // Status of timecard. Choose between [\"PD-Pending for Approval\", \"PAP-Partially Approved\", \"AP-Fully Approved\",\"NEW-New Timesheet\",\"RJ-Rejected\"].
    String comments = "comments_example"; // Comments
    try {
      TimesheetsUpdateStatusByTimesheetIdResponse result = client
              .timesheets
              .updateStatusByTimesheetId(timesheetId, status)
              .comments(comments)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#updateStatusByTimesheetId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetsUpdateStatusByTimesheetIdResponse> response = client
              .timesheets
              .updateStatusByTimesheetId(timesheetId, status)
              .comments(comments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#updateStatusByTimesheetId");
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
| **timesheetId** | **Integer**| Timesheet ID of the timesheet. | |
| **status** | **String**| Status of timecard. Choose between [\&quot;PD-Pending for Approval\&quot;, \&quot;PAP-Partially Approved\&quot;, \&quot;AP-Fully Approved\&quot;,\&quot;NEW-New Timesheet\&quot;,\&quot;RJ-Rejected\&quot;]. | [enum: PD, PAP, AP, NEW, RJ] |
| **comments** | **String**| Comments | [optional] |

### Return type

[**TimesheetsUpdateStatusByTimesheetIdResponse**](TimesheetsUpdateStatusByTimesheetIdResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

