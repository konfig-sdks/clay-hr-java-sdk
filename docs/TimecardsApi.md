# TimecardsApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clockOut**](TimecardsApi.md#clockOut) | **GET** /timecard/clock/out | Clock Out |
| [**createPastTimecard**](TimecardsApi.md#createPastTimecard) | **POST** /timecard/clockin | Create a past timecard. |
| [**createTimecard**](TimecardsApi.md#createTimecard) | **POST** /timecard/addtimecard | Create a new timecard. |
| [**getByUserId**](TimecardsApi.md#getByUserId) | **GET** /api/user/timecard | Retrieve timecard details by User ID. |
| [**getByUserId_0**](TimecardsApi.md#getByUserId_0) | **GET** /api/user/timecards | Retrieve timecard basic details by User ID. |
| [**getDetailsByTimecardId**](TimecardsApi.md#getDetailsByTimecardId) | **GET** /api/timecards/details/{timecardId} | Retrieve timecard details based on timecard ID. |
| [**getTVCForClockinWithQRCodeUsingCid**](TimecardsApi.md#getTVCForClockinWithQRCodeUsingCid) | **GET** /verify/tvc | TVC code for clockin with QR Code using cid. |
| [**getUserById**](TimecardsApi.md#getUserById) | **GET** /timecard | Get timecards by user id. |
| [**registerDeviceForClockInWithAssetModel**](TimecardsApi.md#registerDeviceForClockInWithAssetModel) | **POST** /register | Register device for ClockIn with AssetModel. |
| [**verifyDeviceWithDeviceUUID**](TimecardsApi.md#verifyDeviceWithDeviceUUID) | **GET** /verify/device | Device verification with DeviceUUID. |
| [**verifyUserWithUserid**](TimecardsApi.md#verifyUserWithUserid) | **GET** /verify/user | User verification with userid. |


<a name="clockOut"></a>
# **clockOut**
> Object clockOut(authorization).execute();

Clock Out

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimecardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://acmecompany.bizmerlin.net/rm/api";
    ClayHr client = new ClayHr(configuration);
    String authorization = "authorization_example"; // Authorization
    try {
      Object result = client
              .timecards
              .clockOut(authorization)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#clockOut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timecards
              .clockOut(authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#clockOut");
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
| **authorization** | **String**| Authorization | |

### Return type

**Object**

### Authorization

No authorization required

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

<a name="createPastTimecard"></a>
# **createPastTimecard**
> Object createPastTimecard(authorization).activity(activity).amount(amount).approvalRejectionReason(approvalRejectionReason).billable(billable).cardId(cardId).caseNum(caseNum).caseURL(caseURL).categoryCode(categoryCode).chargeType(chargeType).cid(cid).createUserID(createUserID).createtsDate(createtsDate).createtsDay(createtsDay).createtsHours(createtsHours).createtsMinutes(createtsMinutes).createtsMonth(createtsMonth).createtsNanos(createtsNanos).createtsSeconds(createtsSeconds).createtsTime(createtsTime).createtsTimezoneOffset(createtsTimezoneOffset).createtsYear(createtsYear).customHours(customHours).date(date).description(description).elapsedTimeDate(elapsedTimeDate).elapsedTimeDay(elapsedTimeDay).elapsedTimeHours(elapsedTimeHours).elapsedTimeMinutes(elapsedTimeMinutes).elapsedTimeMonth(elapsedTimeMonth).elapsedTimeSeconds(elapsedTimeSeconds).elapsedTimeTime(elapsedTimeTime).elapsedTimeTimezoneOffset(elapsedTimeTimezoneOffset).elapsedTimeYear(elapsedTimeYear).endDateTimeDate(endDateTimeDate).endDateTimeDay(endDateTimeDay).endDateTimeHours(endDateTimeHours).endDateTimeMinutes(endDateTimeMinutes).endDateTimeMonth(endDateTimeMonth).endDateTimeNanos(endDateTimeNanos).endDateTimeSeconds(endDateTimeSeconds).endDateTimeTime(endDateTimeTime).endDateTimeTimezoneOffset(endDateTimeTimezoneOffset).endDateTimeYear(endDateTimeYear).endDateTimeStr(endDateTimeStr).id(id).invoiceId(invoiceId).notes(notes).numberOfDays(numberOfDays).paymentDate(paymentDate).projectId(projectId).projectManager(projectManager).projectModelAccount(projectModelAccount).ptoComputed(ptoComputed).source(source).startDateTimeDate(startDateTimeDate).startDateTimeDay(startDateTimeDay).startDateTimeHours(startDateTimeHours).startDateTimeMinutes(startDateTimeMinutes).startDateTimeMonth(startDateTimeMonth).startDateTimeNanos(startDateTimeNanos).startDateTimeSeconds(startDateTimeSeconds).startDateTimeTime(startDateTimeTime).startDateTimeTimezoneOffset(startDateTimeTimezoneOffset).startDateTimeYear(startDateTimeYear).startDateTimeStr(startDateTimeStr).status(status).sumOfElapsedTime(sumOfElapsedTime).timesheetId(timesheetId).timezone(timezone).usedTime(usedTime).execute();

Create a past timecard.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimecardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://acmecompany.bizmerlin.net/rm/api";
    ClayHr client = new ClayHr(configuration);
    String authorization = "authorization_example"; // Authorization
    String activity = "activity_example";
    Double amount = 3.4D;
    String approvalRejectionReason = "approvalRejectionReason_example";
    String billable = "billable_example";
    Integer cardId = 56;
    String caseNum = "caseNum_example";
    String caseURL = "caseURL_example";
    String categoryCode = "categoryCode_example";
    String chargeType = "chargeType_example";
    Integer cid = 56;
    Integer createUserID = 56;
    Integer createtsDate = 56;
    Integer createtsDay = 56;
    Integer createtsHours = 56;
    Integer createtsMinutes = 56;
    Integer createtsMonth = 56;
    Integer createtsNanos = 56;
    Integer createtsSeconds = 56;
    Long createtsTime = 56L;
    Integer createtsTimezoneOffset = 56;
    Integer createtsYear = 56;
    String customHours = "customHours_example";
    LocalDate date = LocalDate.now();
    String description = "description_example";
    Integer elapsedTimeDate = 56;
    Integer elapsedTimeDay = 56;
    Integer elapsedTimeHours = 56;
    Integer elapsedTimeMinutes = 56;
    Integer elapsedTimeMonth = 56;
    Integer elapsedTimeSeconds = 56;
    Long elapsedTimeTime = 56L;
    Integer elapsedTimeTimezoneOffset = 56;
    Integer elapsedTimeYear = 56;
    Integer endDateTimeDate = 56;
    Integer endDateTimeDay = 56;
    Integer endDateTimeHours = 56;
    Integer endDateTimeMinutes = 56;
    Integer endDateTimeMonth = 56;
    Integer endDateTimeNanos = 56;
    Integer endDateTimeSeconds = 56;
    Long endDateTimeTime = 56L;
    Integer endDateTimeTimezoneOffset = 56;
    Integer endDateTimeYear = 56;
    String endDateTimeStr = "endDateTimeStr_example";
    Integer id = 56;
    Integer invoiceId = 56;
    String notes = "notes_example";
    Integer numberOfDays = 56;
    LocalDate paymentDate = LocalDate.now();
    Integer projectId = 56;
    String projectManager = "projectManager_example";
    Integer projectModelAccount = 56;
    String ptoComputed = "ptoComputed_example";
    String source = "source_example";
    Integer startDateTimeDate = 56;
    Integer startDateTimeDay = 56;
    Integer startDateTimeHours = 56;
    Integer startDateTimeMinutes = 56;
    Integer startDateTimeMonth = 56;
    Integer startDateTimeNanos = 56;
    Integer startDateTimeSeconds = 56;
    Long startDateTimeTime = 56L;
    Integer startDateTimeTimezoneOffset = 56;
    Integer startDateTimeYear = 56;
    String startDateTimeStr = "startDateTimeStr_example";
    String status = "status_example";
    String sumOfElapsedTime = "sumOfElapsedTime_example";
    Integer timesheetId = 56;
    String timezone = "timezone_example";
    Long usedTime = 56L;
    try {
      Object result = client
              .timecards
              .createPastTimecard(authorization)
              .activity(activity)
              .amount(amount)
              .approvalRejectionReason(approvalRejectionReason)
              .billable(billable)
              .cardId(cardId)
              .caseNum(caseNum)
              .caseURL(caseURL)
              .categoryCode(categoryCode)
              .chargeType(chargeType)
              .cid(cid)
              .createUserID(createUserID)
              .createtsDate(createtsDate)
              .createtsDay(createtsDay)
              .createtsHours(createtsHours)
              .createtsMinutes(createtsMinutes)
              .createtsMonth(createtsMonth)
              .createtsNanos(createtsNanos)
              .createtsSeconds(createtsSeconds)
              .createtsTime(createtsTime)
              .createtsTimezoneOffset(createtsTimezoneOffset)
              .createtsYear(createtsYear)
              .customHours(customHours)
              .date(date)
              .description(description)
              .elapsedTimeDate(elapsedTimeDate)
              .elapsedTimeDay(elapsedTimeDay)
              .elapsedTimeHours(elapsedTimeHours)
              .elapsedTimeMinutes(elapsedTimeMinutes)
              .elapsedTimeMonth(elapsedTimeMonth)
              .elapsedTimeSeconds(elapsedTimeSeconds)
              .elapsedTimeTime(elapsedTimeTime)
              .elapsedTimeTimezoneOffset(elapsedTimeTimezoneOffset)
              .elapsedTimeYear(elapsedTimeYear)
              .endDateTimeDate(endDateTimeDate)
              .endDateTimeDay(endDateTimeDay)
              .endDateTimeHours(endDateTimeHours)
              .endDateTimeMinutes(endDateTimeMinutes)
              .endDateTimeMonth(endDateTimeMonth)
              .endDateTimeNanos(endDateTimeNanos)
              .endDateTimeSeconds(endDateTimeSeconds)
              .endDateTimeTime(endDateTimeTime)
              .endDateTimeTimezoneOffset(endDateTimeTimezoneOffset)
              .endDateTimeYear(endDateTimeYear)
              .endDateTimeStr(endDateTimeStr)
              .id(id)
              .invoiceId(invoiceId)
              .notes(notes)
              .numberOfDays(numberOfDays)
              .paymentDate(paymentDate)
              .projectId(projectId)
              .projectManager(projectManager)
              .projectModelAccount(projectModelAccount)
              .ptoComputed(ptoComputed)
              .source(source)
              .startDateTimeDate(startDateTimeDate)
              .startDateTimeDay(startDateTimeDay)
              .startDateTimeHours(startDateTimeHours)
              .startDateTimeMinutes(startDateTimeMinutes)
              .startDateTimeMonth(startDateTimeMonth)
              .startDateTimeNanos(startDateTimeNanos)
              .startDateTimeSeconds(startDateTimeSeconds)
              .startDateTimeTime(startDateTimeTime)
              .startDateTimeTimezoneOffset(startDateTimeTimezoneOffset)
              .startDateTimeYear(startDateTimeYear)
              .startDateTimeStr(startDateTimeStr)
              .status(status)
              .sumOfElapsedTime(sumOfElapsedTime)
              .timesheetId(timesheetId)
              .timezone(timezone)
              .usedTime(usedTime)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#createPastTimecard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timecards
              .createPastTimecard(authorization)
              .activity(activity)
              .amount(amount)
              .approvalRejectionReason(approvalRejectionReason)
              .billable(billable)
              .cardId(cardId)
              .caseNum(caseNum)
              .caseURL(caseURL)
              .categoryCode(categoryCode)
              .chargeType(chargeType)
              .cid(cid)
              .createUserID(createUserID)
              .createtsDate(createtsDate)
              .createtsDay(createtsDay)
              .createtsHours(createtsHours)
              .createtsMinutes(createtsMinutes)
              .createtsMonth(createtsMonth)
              .createtsNanos(createtsNanos)
              .createtsSeconds(createtsSeconds)
              .createtsTime(createtsTime)
              .createtsTimezoneOffset(createtsTimezoneOffset)
              .createtsYear(createtsYear)
              .customHours(customHours)
              .date(date)
              .description(description)
              .elapsedTimeDate(elapsedTimeDate)
              .elapsedTimeDay(elapsedTimeDay)
              .elapsedTimeHours(elapsedTimeHours)
              .elapsedTimeMinutes(elapsedTimeMinutes)
              .elapsedTimeMonth(elapsedTimeMonth)
              .elapsedTimeSeconds(elapsedTimeSeconds)
              .elapsedTimeTime(elapsedTimeTime)
              .elapsedTimeTimezoneOffset(elapsedTimeTimezoneOffset)
              .elapsedTimeYear(elapsedTimeYear)
              .endDateTimeDate(endDateTimeDate)
              .endDateTimeDay(endDateTimeDay)
              .endDateTimeHours(endDateTimeHours)
              .endDateTimeMinutes(endDateTimeMinutes)
              .endDateTimeMonth(endDateTimeMonth)
              .endDateTimeNanos(endDateTimeNanos)
              .endDateTimeSeconds(endDateTimeSeconds)
              .endDateTimeTime(endDateTimeTime)
              .endDateTimeTimezoneOffset(endDateTimeTimezoneOffset)
              .endDateTimeYear(endDateTimeYear)
              .endDateTimeStr(endDateTimeStr)
              .id(id)
              .invoiceId(invoiceId)
              .notes(notes)
              .numberOfDays(numberOfDays)
              .paymentDate(paymentDate)
              .projectId(projectId)
              .projectManager(projectManager)
              .projectModelAccount(projectModelAccount)
              .ptoComputed(ptoComputed)
              .source(source)
              .startDateTimeDate(startDateTimeDate)
              .startDateTimeDay(startDateTimeDay)
              .startDateTimeHours(startDateTimeHours)
              .startDateTimeMinutes(startDateTimeMinutes)
              .startDateTimeMonth(startDateTimeMonth)
              .startDateTimeNanos(startDateTimeNanos)
              .startDateTimeSeconds(startDateTimeSeconds)
              .startDateTimeTime(startDateTimeTime)
              .startDateTimeTimezoneOffset(startDateTimeTimezoneOffset)
              .startDateTimeYear(startDateTimeYear)
              .startDateTimeStr(startDateTimeStr)
              .status(status)
              .sumOfElapsedTime(sumOfElapsedTime)
              .timesheetId(timesheetId)
              .timezone(timezone)
              .usedTime(usedTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#createPastTimecard");
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
| **authorization** | **String**| Authorization | |
| **activity** | **String**|  | [optional] |
| **amount** | **Double**|  | [optional] |
| **approvalRejectionReason** | **String**|  | [optional] |
| **billable** | **String**|  | [optional] |
| **cardId** | **Integer**|  | [optional] |
| **caseNum** | **String**|  | [optional] |
| **caseURL** | **String**|  | [optional] |
| **categoryCode** | **String**|  | [optional] |
| **chargeType** | **String**|  | [optional] |
| **cid** | **Integer**|  | [optional] |
| **createUserID** | **Integer**|  | [optional] |
| **createtsDate** | **Integer**|  | [optional] |
| **createtsDay** | **Integer**|  | [optional] |
| **createtsHours** | **Integer**|  | [optional] |
| **createtsMinutes** | **Integer**|  | [optional] |
| **createtsMonth** | **Integer**|  | [optional] |
| **createtsNanos** | **Integer**|  | [optional] |
| **createtsSeconds** | **Integer**|  | [optional] |
| **createtsTime** | **Long**|  | [optional] |
| **createtsTimezoneOffset** | **Integer**|  | [optional] |
| **createtsYear** | **Integer**|  | [optional] |
| **customHours** | **String**|  | [optional] |
| **date** | **LocalDate**|  | [optional] |
| **description** | **String**|  | [optional] |
| **elapsedTimeDate** | **Integer**|  | [optional] |
| **elapsedTimeDay** | **Integer**|  | [optional] |
| **elapsedTimeHours** | **Integer**|  | [optional] |
| **elapsedTimeMinutes** | **Integer**|  | [optional] |
| **elapsedTimeMonth** | **Integer**|  | [optional] |
| **elapsedTimeSeconds** | **Integer**|  | [optional] |
| **elapsedTimeTime** | **Long**|  | [optional] |
| **elapsedTimeTimezoneOffset** | **Integer**|  | [optional] |
| **elapsedTimeYear** | **Integer**|  | [optional] |
| **endDateTimeDate** | **Integer**|  | [optional] |
| **endDateTimeDay** | **Integer**|  | [optional] |
| **endDateTimeHours** | **Integer**|  | [optional] |
| **endDateTimeMinutes** | **Integer**|  | [optional] |
| **endDateTimeMonth** | **Integer**|  | [optional] |
| **endDateTimeNanos** | **Integer**|  | [optional] |
| **endDateTimeSeconds** | **Integer**|  | [optional] |
| **endDateTimeTime** | **Long**|  | [optional] |
| **endDateTimeTimezoneOffset** | **Integer**|  | [optional] |
| **endDateTimeYear** | **Integer**|  | [optional] |
| **endDateTimeStr** | **String**|  | [optional] |
| **id** | **Integer**|  | [optional] |
| **invoiceId** | **Integer**|  | [optional] |
| **notes** | **String**|  | [optional] |
| **numberOfDays** | **Integer**|  | [optional] |
| **paymentDate** | **LocalDate**|  | [optional] |
| **projectId** | **Integer**|  | [optional] |
| **projectManager** | **String**|  | [optional] |
| **projectModelAccount** | **Integer**|  | [optional] |
| **ptoComputed** | **String**|  | [optional] |
| **source** | **String**|  | [optional] |
| **startDateTimeDate** | **Integer**|  | [optional] |
| **startDateTimeDay** | **Integer**|  | [optional] |
| **startDateTimeHours** | **Integer**|  | [optional] |
| **startDateTimeMinutes** | **Integer**|  | [optional] |
| **startDateTimeMonth** | **Integer**|  | [optional] |
| **startDateTimeNanos** | **Integer**|  | [optional] |
| **startDateTimeSeconds** | **Integer**|  | [optional] |
| **startDateTimeTime** | **Long**|  | [optional] |
| **startDateTimeTimezoneOffset** | **Integer**|  | [optional] |
| **startDateTimeYear** | **Integer**|  | [optional] |
| **startDateTimeStr** | **String**|  | [optional] |
| **status** | **String**|  | [optional] |
| **sumOfElapsedTime** | **String**|  | [optional] |
| **timesheetId** | **Integer**|  | [optional] |
| **timezone** | **String**|  | [optional] |
| **usedTime** | **Long**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

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

<a name="createTimecard"></a>
# **createTimecard**
> Object createTimecard().createtsDate(createtsDate).createtsDay(createtsDay).createtsHours(createtsHours).createtsMinutes(createtsMinutes).createtsMonth(createtsMonth).createtsNanos(createtsNanos).createtsSeconds(createtsSeconds).createtsTime(createtsTime).createtsTimezoneOffset(createtsTimezoneOffset).createtsYear(createtsYear).customHours(customHours).date(date).description(description).elapsedTimeDate(elapsedTimeDate).elapsedTimeDay(elapsedTimeDay).elapsedTimeHours(elapsedTimeHours).elapsedTimeMinutes(elapsedTimeMinutes).elapsedTimeMonth(elapsedTimeMonth).elapsedTimeSeconds(elapsedTimeSeconds).elapsedTimeTime(elapsedTimeTime).elapsedTimeTimezoneOffset(elapsedTimeTimezoneOffset).elapsedTimeYear(elapsedTimeYear).endDateTimeDate(endDateTimeDate).endDateTimeDay(endDateTimeDay).endDateTimeHours(endDateTimeHours).endDateTimeMinutes(endDateTimeMinutes).endDateTimeMonth(endDateTimeMonth).endDateTimeNanos(endDateTimeNanos).endDateTimeSeconds(endDateTimeSeconds).endDateTimeTime(endDateTimeTime).endDateTimeTimezoneOffset(endDateTimeTimezoneOffset).endDateTimeYear(endDateTimeYear).endDateTimeStr(endDateTimeStr).id(id).invoiceId(invoiceId).notes(notes).numberOfDays(numberOfDays).paymentDate(paymentDate).projectId(projectId).projectManager(projectManager).projectModelAccount(projectModelAccount).timesheetId(timesheetId).timezone(timezone).usedTime(usedTime).execute();

Create a new timecard.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimecardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://acmecompany.bizmerlin.net/rm/api";
    ClayHr client = new ClayHr(configuration);
    Integer createtsDate = 56;
    Integer createtsDay = 56;
    Integer createtsHours = 56;
    Integer createtsMinutes = 56;
    Integer createtsMonth = 56;
    Integer createtsNanos = 56;
    Integer createtsSeconds = 56;
    Long createtsTime = 56L;
    Integer createtsTimezoneOffset = 56;
    Integer createtsYear = 56;
    String customHours = "customHours_example";
    LocalDate date = LocalDate.now();
    String description = "description_example";
    Integer elapsedTimeDate = 56;
    Integer elapsedTimeDay = 56;
    Integer elapsedTimeHours = 56;
    Integer elapsedTimeMinutes = 56;
    Integer elapsedTimeMonth = 56;
    Integer elapsedTimeSeconds = 56;
    Long elapsedTimeTime = 56L;
    Integer elapsedTimeTimezoneOffset = 56;
    Integer elapsedTimeYear = 56;
    Integer endDateTimeDate = 56;
    Integer endDateTimeDay = 56;
    Integer endDateTimeHours = 56;
    Integer endDateTimeMinutes = 56;
    Integer endDateTimeMonth = 56;
    Integer endDateTimeNanos = 56;
    Integer endDateTimeSeconds = 56;
    Long endDateTimeTime = 56L;
    Integer endDateTimeTimezoneOffset = 56;
    Integer endDateTimeYear = 56;
    String endDateTimeStr = "endDateTimeStr_example";
    Integer id = 56;
    Integer invoiceId = 56;
    String notes = "notes_example";
    Integer numberOfDays = 56;
    LocalDate paymentDate = LocalDate.now();
    Integer projectId = 56;
    String projectManager = "projectManager_example";
    Integer projectModelAccount = 56;
    Integer timesheetId = 56;
    String timezone = "timezone_example";
    Long usedTime = 56L;
    try {
      Object result = client
              .timecards
              .createTimecard()
              .createtsDate(createtsDate)
              .createtsDay(createtsDay)
              .createtsHours(createtsHours)
              .createtsMinutes(createtsMinutes)
              .createtsMonth(createtsMonth)
              .createtsNanos(createtsNanos)
              .createtsSeconds(createtsSeconds)
              .createtsTime(createtsTime)
              .createtsTimezoneOffset(createtsTimezoneOffset)
              .createtsYear(createtsYear)
              .customHours(customHours)
              .date(date)
              .description(description)
              .elapsedTimeDate(elapsedTimeDate)
              .elapsedTimeDay(elapsedTimeDay)
              .elapsedTimeHours(elapsedTimeHours)
              .elapsedTimeMinutes(elapsedTimeMinutes)
              .elapsedTimeMonth(elapsedTimeMonth)
              .elapsedTimeSeconds(elapsedTimeSeconds)
              .elapsedTimeTime(elapsedTimeTime)
              .elapsedTimeTimezoneOffset(elapsedTimeTimezoneOffset)
              .elapsedTimeYear(elapsedTimeYear)
              .endDateTimeDate(endDateTimeDate)
              .endDateTimeDay(endDateTimeDay)
              .endDateTimeHours(endDateTimeHours)
              .endDateTimeMinutes(endDateTimeMinutes)
              .endDateTimeMonth(endDateTimeMonth)
              .endDateTimeNanos(endDateTimeNanos)
              .endDateTimeSeconds(endDateTimeSeconds)
              .endDateTimeTime(endDateTimeTime)
              .endDateTimeTimezoneOffset(endDateTimeTimezoneOffset)
              .endDateTimeYear(endDateTimeYear)
              .endDateTimeStr(endDateTimeStr)
              .id(id)
              .invoiceId(invoiceId)
              .notes(notes)
              .numberOfDays(numberOfDays)
              .paymentDate(paymentDate)
              .projectId(projectId)
              .projectManager(projectManager)
              .projectModelAccount(projectModelAccount)
              .timesheetId(timesheetId)
              .timezone(timezone)
              .usedTime(usedTime)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#createTimecard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timecards
              .createTimecard()
              .createtsDate(createtsDate)
              .createtsDay(createtsDay)
              .createtsHours(createtsHours)
              .createtsMinutes(createtsMinutes)
              .createtsMonth(createtsMonth)
              .createtsNanos(createtsNanos)
              .createtsSeconds(createtsSeconds)
              .createtsTime(createtsTime)
              .createtsTimezoneOffset(createtsTimezoneOffset)
              .createtsYear(createtsYear)
              .customHours(customHours)
              .date(date)
              .description(description)
              .elapsedTimeDate(elapsedTimeDate)
              .elapsedTimeDay(elapsedTimeDay)
              .elapsedTimeHours(elapsedTimeHours)
              .elapsedTimeMinutes(elapsedTimeMinutes)
              .elapsedTimeMonth(elapsedTimeMonth)
              .elapsedTimeSeconds(elapsedTimeSeconds)
              .elapsedTimeTime(elapsedTimeTime)
              .elapsedTimeTimezoneOffset(elapsedTimeTimezoneOffset)
              .elapsedTimeYear(elapsedTimeYear)
              .endDateTimeDate(endDateTimeDate)
              .endDateTimeDay(endDateTimeDay)
              .endDateTimeHours(endDateTimeHours)
              .endDateTimeMinutes(endDateTimeMinutes)
              .endDateTimeMonth(endDateTimeMonth)
              .endDateTimeNanos(endDateTimeNanos)
              .endDateTimeSeconds(endDateTimeSeconds)
              .endDateTimeTime(endDateTimeTime)
              .endDateTimeTimezoneOffset(endDateTimeTimezoneOffset)
              .endDateTimeYear(endDateTimeYear)
              .endDateTimeStr(endDateTimeStr)
              .id(id)
              .invoiceId(invoiceId)
              .notes(notes)
              .numberOfDays(numberOfDays)
              .paymentDate(paymentDate)
              .projectId(projectId)
              .projectManager(projectManager)
              .projectModelAccount(projectModelAccount)
              .timesheetId(timesheetId)
              .timezone(timezone)
              .usedTime(usedTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#createTimecard");
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
| **createtsDate** | **Integer**|  | [optional] |
| **createtsDay** | **Integer**|  | [optional] |
| **createtsHours** | **Integer**|  | [optional] |
| **createtsMinutes** | **Integer**|  | [optional] |
| **createtsMonth** | **Integer**|  | [optional] |
| **createtsNanos** | **Integer**|  | [optional] |
| **createtsSeconds** | **Integer**|  | [optional] |
| **createtsTime** | **Long**|  | [optional] |
| **createtsTimezoneOffset** | **Integer**|  | [optional] |
| **createtsYear** | **Integer**|  | [optional] |
| **customHours** | **String**|  | [optional] |
| **date** | **LocalDate**|  | [optional] |
| **description** | **String**|  | [optional] |
| **elapsedTimeDate** | **Integer**|  | [optional] |
| **elapsedTimeDay** | **Integer**|  | [optional] |
| **elapsedTimeHours** | **Integer**|  | [optional] |
| **elapsedTimeMinutes** | **Integer**|  | [optional] |
| **elapsedTimeMonth** | **Integer**|  | [optional] |
| **elapsedTimeSeconds** | **Integer**|  | [optional] |
| **elapsedTimeTime** | **Long**|  | [optional] |
| **elapsedTimeTimezoneOffset** | **Integer**|  | [optional] |
| **elapsedTimeYear** | **Integer**|  | [optional] |
| **endDateTimeDate** | **Integer**|  | [optional] |
| **endDateTimeDay** | **Integer**|  | [optional] |
| **endDateTimeHours** | **Integer**|  | [optional] |
| **endDateTimeMinutes** | **Integer**|  | [optional] |
| **endDateTimeMonth** | **Integer**|  | [optional] |
| **endDateTimeNanos** | **Integer**|  | [optional] |
| **endDateTimeSeconds** | **Integer**|  | [optional] |
| **endDateTimeTime** | **Long**|  | [optional] |
| **endDateTimeTimezoneOffset** | **Integer**|  | [optional] |
| **endDateTimeYear** | **Integer**|  | [optional] |
| **endDateTimeStr** | **String**|  | [optional] |
| **id** | **Integer**|  | [optional] |
| **invoiceId** | **Integer**|  | [optional] |
| **notes** | **String**|  | [optional] |
| **numberOfDays** | **Integer**|  | [optional] |
| **paymentDate** | **LocalDate**|  | [optional] |
| **projectId** | **Integer**|  | [optional] |
| **projectManager** | **String**|  | [optional] |
| **projectModelAccount** | **Integer**|  | [optional] |
| **timesheetId** | **Integer**|  | [optional] |
| **timezone** | **String**|  | [optional] |
| **usedTime** | **Long**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

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

<a name="getByUserId"></a>
# **getByUserId**
> String getByUserId().email(email).guid(guid).execute();

Retrieve timecard details by User ID.

Retrieve timecard details based on User ID with Add Time Cards For Other permission.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimecardsApi;
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
    String email = "email_example"; // email of the user.
    String guid = "guid_example"; // Graphical user ID.
    try {
      String result = client
              .timecards
              .getByUserId()
              .email(email)
              .guid(guid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#getByUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .timecards
              .getByUserId()
              .email(email)
              .guid(guid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#getByUserId");
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
| **email** | **String**| email of the user. | [optional] |
| **guid** | **String**| Graphical user ID. | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getByUserId_0"></a>
# **getByUserId_0**
> TimecardsGetByUserId200Response getByUserId_0().email(email).guid(guid).execute();

Retrieve timecard basic details by User ID.

Retrieve timecard basic details based on User ID with Add Time Cards For Other permission.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimecardsApi;
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
    String email = "email_example"; // email of the user.
    String guid = "guid_example"; // Graphical user ID.
    try {
      TimecardsGetByUserId200Response result = client
              .timecards
              .getByUserId_0()
              .email(email)
              .guid(guid)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getCreateUserID());
      System.out.println(result.getStartDateTime());
      System.out.println(result.getCardId());
      System.out.println(result.getCreatets());
      System.out.println(result.getId());
      System.out.println(result.getEndDateTime());
      System.out.println(result.getProjectId());
      System.out.println(result.getElapsedTime());
      System.out.println(result.getCid());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#getByUserId_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimecardsGetByUserId200Response> response = client
              .timecards
              .getByUserId_0()
              .email(email)
              .guid(guid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#getByUserId_0");
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
| **email** | **String**| email of the user. | [optional] |
| **guid** | **String**| Graphical user ID. | [optional] |

### Return type

[**TimecardsGetByUserId200Response**](TimecardsGetByUserId200Response.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getDetailsByTimecardId"></a>
# **getDetailsByTimecardId**
> String getDetailsByTimecardId(timecardId).flatcustomfields(flatcustomfields).execute();

Retrieve timecard details based on timecard ID.

Retrieve timecard details based on timecard ID with Add Time Cards For Other permission.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimecardsApi;
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
    Integer timecardId = 56; // Timecard ID of the timecard.
    Boolean flatcustomfields = false;
    try {
      String result = client
              .timecards
              .getDetailsByTimecardId(timecardId)
              .flatcustomfields(flatcustomfields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#getDetailsByTimecardId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .timecards
              .getDetailsByTimecardId(timecardId)
              .flatcustomfields(flatcustomfields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#getDetailsByTimecardId");
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
| **timecardId** | **Integer**| Timecard ID of the timecard. | |
| **flatcustomfields** | **Boolean**|  | [optional] [default to false] |

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

<a name="getTVCForClockinWithQRCodeUsingCid"></a>
# **getTVCForClockinWithQRCodeUsingCid**
> Object getTVCForClockinWithQRCodeUsingCid(cid).execute();

TVC code for clockin with QR Code using cid.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimecardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://acmecompany.bizmerlin.net/rm/api";
    ClayHr client = new ClayHr(configuration);
    Integer cid = 56; // cid
    try {
      Object result = client
              .timecards
              .getTVCForClockinWithQRCodeUsingCid(cid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#getTVCForClockinWithQRCodeUsingCid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timecards
              .getTVCForClockinWithQRCodeUsingCid(cid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#getTVCForClockinWithQRCodeUsingCid");
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
| **cid** | **Integer**| cid | |

### Return type

**Object**

### Authorization

No authorization required

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

<a name="getUserById"></a>
# **getUserById**
> Object getUserById(authorization).type(type).execute();

Get timecards by user id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimecardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://acmecompany.bizmerlin.net/rm/api";
    ClayHr client = new ClayHr(configuration);
    String authorization = "authorization_example"; // Authorization
    String type = "leave"; // type
    try {
      Object result = client
              .timecards
              .getUserById(authorization)
              .type(type)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#getUserById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timecards
              .getUserById(authorization)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#getUserById");
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
| **authorization** | **String**| Authorization | |
| **type** | **String**| type | [optional] [default to leave] |

### Return type

**Object**

### Authorization

No authorization required

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

<a name="registerDeviceForClockInWithAssetModel"></a>
# **registerDeviceForClockInWithAssetModel**
> Object registerDeviceForClockInWithAssetModel().accessories(accessories).acknowledge(acknowledge).assetID(assetID).assetno(assetno).assetstatus(assetstatus).assettype(assettype).purchaseDate(purchaseDate).selfAssign(selfAssign).serialno(serialno).service(service).source(source).specs(specs).supplier(supplier).useStatusCode(useStatusCode).userDomain(userDomain).userMail(userMail).userPassword(userPassword).uuid(uuid).execute();

Register device for ClockIn with AssetModel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimecardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://acmecompany.bizmerlin.net/rm/api";
    
    configuration.sec1  = "YOUR API KEY";
    ClayHr client = new ClayHr(configuration);
    String accessories = "accessories_example";
    Integer acknowledge = 56;
    Integer assetID = 56;
    String assetno = "assetno_example";
    String assetstatus = "assetstatus_example";
    String assettype = "assettype_example";
    LocalDate purchaseDate = LocalDate.now();
    Integer selfAssign = 56;
    String serialno = "serialno_example";
    String service = "service_example";
    String source = "source_example";
    String specs = "specs_example";
    String supplier = "supplier_example";
    String useStatusCode = "useStatusCode_example";
    String userDomain = "userDomain_example";
    String userMail = "userMail_example";
    String userPassword = "userPassword_example";
    String uuid = "uuid_example";
    try {
      Object result = client
              .timecards
              .registerDeviceForClockInWithAssetModel()
              .accessories(accessories)
              .acknowledge(acknowledge)
              .assetID(assetID)
              .assetno(assetno)
              .assetstatus(assetstatus)
              .assettype(assettype)
              .purchaseDate(purchaseDate)
              .selfAssign(selfAssign)
              .serialno(serialno)
              .service(service)
              .source(source)
              .specs(specs)
              .supplier(supplier)
              .useStatusCode(useStatusCode)
              .userDomain(userDomain)
              .userMail(userMail)
              .userPassword(userPassword)
              .uuid(uuid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#registerDeviceForClockInWithAssetModel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timecards
              .registerDeviceForClockInWithAssetModel()
              .accessories(accessories)
              .acknowledge(acknowledge)
              .assetID(assetID)
              .assetno(assetno)
              .assetstatus(assetstatus)
              .assettype(assettype)
              .purchaseDate(purchaseDate)
              .selfAssign(selfAssign)
              .serialno(serialno)
              .service(service)
              .source(source)
              .specs(specs)
              .supplier(supplier)
              .useStatusCode(useStatusCode)
              .userDomain(userDomain)
              .userMail(userMail)
              .userPassword(userPassword)
              .uuid(uuid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#registerDeviceForClockInWithAssetModel");
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
| **accessories** | **String**|  | [optional] |
| **acknowledge** | **Integer**|  | [optional] |
| **assetID** | **Integer**|  | [optional] |
| **assetno** | **String**|  | [optional] |
| **assetstatus** | **String**|  | [optional] |
| **assettype** | **String**|  | [optional] |
| **purchaseDate** | **LocalDate**|  | [optional] |
| **selfAssign** | **Integer**|  | [optional] |
| **serialno** | **String**|  | [optional] |
| **service** | **String**|  | [optional] |
| **source** | **String**|  | [optional] |
| **specs** | **String**|  | [optional] |
| **supplier** | **String**|  | [optional] |
| **useStatusCode** | **String**|  | [optional] |
| **userDomain** | **String**|  | [optional] |
| **userMail** | **String**|  | [optional] |
| **userPassword** | **String**|  | [optional] |
| **uuid** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[sec1](../README.md#sec1)

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

<a name="verifyDeviceWithDeviceUUID"></a>
# **verifyDeviceWithDeviceUUID**
> Object verifyDeviceWithDeviceUUID(deviceUUID).execute();

Device verification with DeviceUUID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimecardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://acmecompany.bizmerlin.net/rm/api";
    ClayHr client = new ClayHr(configuration);
    String deviceUUID = "deviceUUID_example"; // deviceUUID
    try {
      Object result = client
              .timecards
              .verifyDeviceWithDeviceUUID(deviceUUID)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#verifyDeviceWithDeviceUUID");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timecards
              .verifyDeviceWithDeviceUUID(deviceUUID)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#verifyDeviceWithDeviceUUID");
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
| **deviceUUID** | **String**| deviceUUID | |

### Return type

**Object**

### Authorization

No authorization required

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

<a name="verifyUserWithUserid"></a>
# **verifyUserWithUserid**
> Object verifyUserWithUserid().adpAssociateOID(adpAssociateOID).allocation(allocation).appleUserIdentifier(appleUserIdentifier).assignments(assignments).authToken(authToken).calWeekPref(calWeekPref).calendarId(calendarId).candidateId(candidateId).careerPathwayId(careerPathwayId).cellPhone(cellPhone).cid(cid).countryId(countryId).createtsDate(createtsDate).createtsDay(createtsDay).createtsHours(createtsHours).createtsMinutes(createtsMinutes).createtsMonth(createtsMonth).createtsNanos(createtsNanos).createtsSeconds(createtsSeconds).createtsTime(createtsTime).createtsTimezoneOffset(createtsTimezoneOffset).createtsYear(createtsYear).createuserid(createuserid).thumbnail(thumbnail).timecardPeriodPref(timecardPeriodPref).timezone(timezone).tosVersion(tosVersion).userCountry(userCountry).userDateFormat(userDateFormat).userDateOfBirth(userDateOfBirth).userDisplayName(userDisplayName).userEndDate(userEndDate).userName(userName).userNameFormat(userNameFormat).userType(userType).view(view).workerType(workerType).workingDays(workingDays).execute();

User verification with userid.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimecardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://acmecompany.bizmerlin.net/rm/api";
    
    configuration.sec1  = "YOUR API KEY";
    ClayHr client = new ClayHr(configuration);
    String adpAssociateOID = "adpAssociateOID_example";
    Double allocation = 3.4D;
    String appleUserIdentifier = "appleUserIdentifier_example";
    String assignments = "assignments_example";
    String authToken = "authToken_example";
    String calWeekPref = "calWeekPref_example";
    Integer calendarId = 56;
    Integer candidateId = 56;
    Integer careerPathwayId = 56;
    String cellPhone = "cellPhone_example";
    Integer cid = 56;
    Integer countryId = 56;
    Integer createtsDate = 56;
    Integer createtsDay = 56;
    Integer createtsHours = 56;
    Integer createtsMinutes = 56;
    Integer createtsMonth = 56;
    Integer createtsNanos = 56;
    Integer createtsSeconds = 56;
    Long createtsTime = 56L;
    Integer createtsTimezoneOffset = 56;
    Integer createtsYear = 56;
    Integer createuserid = 56;
    String thumbnail = "thumbnail_example";
    String timecardPeriodPref = "timecardPeriodPref_example";
    String timezone = "timezone_example";
    String tosVersion = "tosVersion_example";
    String userCountry = "userCountry_example";
    String userDateFormat = "userDateFormat_example";
    LocalDate userDateOfBirth = LocalDate.now();
    String userDisplayName = "userDisplayName_example";
    LocalDate userEndDate = LocalDate.now();
    String userName = "userName_example";
    String userNameFormat = "userNameFormat_example";
    String userType = "userType_example";
    Boolean view = true;
    String workerType = "workerType_example";
    String workingDays = "workingDays_example";
    try {
      Object result = client
              .timecards
              .verifyUserWithUserid()
              .adpAssociateOID(adpAssociateOID)
              .allocation(allocation)
              .appleUserIdentifier(appleUserIdentifier)
              .assignments(assignments)
              .authToken(authToken)
              .calWeekPref(calWeekPref)
              .calendarId(calendarId)
              .candidateId(candidateId)
              .careerPathwayId(careerPathwayId)
              .cellPhone(cellPhone)
              .cid(cid)
              .countryId(countryId)
              .createtsDate(createtsDate)
              .createtsDay(createtsDay)
              .createtsHours(createtsHours)
              .createtsMinutes(createtsMinutes)
              .createtsMonth(createtsMonth)
              .createtsNanos(createtsNanos)
              .createtsSeconds(createtsSeconds)
              .createtsTime(createtsTime)
              .createtsTimezoneOffset(createtsTimezoneOffset)
              .createtsYear(createtsYear)
              .createuserid(createuserid)
              .thumbnail(thumbnail)
              .timecardPeriodPref(timecardPeriodPref)
              .timezone(timezone)
              .tosVersion(tosVersion)
              .userCountry(userCountry)
              .userDateFormat(userDateFormat)
              .userDateOfBirth(userDateOfBirth)
              .userDisplayName(userDisplayName)
              .userEndDate(userEndDate)
              .userName(userName)
              .userNameFormat(userNameFormat)
              .userType(userType)
              .view(view)
              .workerType(workerType)
              .workingDays(workingDays)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#verifyUserWithUserid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .timecards
              .verifyUserWithUserid()
              .adpAssociateOID(adpAssociateOID)
              .allocation(allocation)
              .appleUserIdentifier(appleUserIdentifier)
              .assignments(assignments)
              .authToken(authToken)
              .calWeekPref(calWeekPref)
              .calendarId(calendarId)
              .candidateId(candidateId)
              .careerPathwayId(careerPathwayId)
              .cellPhone(cellPhone)
              .cid(cid)
              .countryId(countryId)
              .createtsDate(createtsDate)
              .createtsDay(createtsDay)
              .createtsHours(createtsHours)
              .createtsMinutes(createtsMinutes)
              .createtsMonth(createtsMonth)
              .createtsNanos(createtsNanos)
              .createtsSeconds(createtsSeconds)
              .createtsTime(createtsTime)
              .createtsTimezoneOffset(createtsTimezoneOffset)
              .createtsYear(createtsYear)
              .createuserid(createuserid)
              .thumbnail(thumbnail)
              .timecardPeriodPref(timecardPeriodPref)
              .timezone(timezone)
              .tosVersion(tosVersion)
              .userCountry(userCountry)
              .userDateFormat(userDateFormat)
              .userDateOfBirth(userDateOfBirth)
              .userDisplayName(userDisplayName)
              .userEndDate(userEndDate)
              .userName(userName)
              .userNameFormat(userNameFormat)
              .userType(userType)
              .view(view)
              .workerType(workerType)
              .workingDays(workingDays)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimecardsApi#verifyUserWithUserid");
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
| **adpAssociateOID** | **String**|  | [optional] |
| **allocation** | **Double**|  | [optional] |
| **appleUserIdentifier** | **String**|  | [optional] |
| **assignments** | **String**|  | [optional] |
| **authToken** | **String**|  | [optional] |
| **calWeekPref** | **String**|  | [optional] |
| **calendarId** | **Integer**|  | [optional] |
| **candidateId** | **Integer**|  | [optional] |
| **careerPathwayId** | **Integer**|  | [optional] |
| **cellPhone** | **String**|  | [optional] |
| **cid** | **Integer**|  | [optional] |
| **countryId** | **Integer**|  | [optional] |
| **createtsDate** | **Integer**|  | [optional] |
| **createtsDay** | **Integer**|  | [optional] |
| **createtsHours** | **Integer**|  | [optional] |
| **createtsMinutes** | **Integer**|  | [optional] |
| **createtsMonth** | **Integer**|  | [optional] |
| **createtsNanos** | **Integer**|  | [optional] |
| **createtsSeconds** | **Integer**|  | [optional] |
| **createtsTime** | **Long**|  | [optional] |
| **createtsTimezoneOffset** | **Integer**|  | [optional] |
| **createtsYear** | **Integer**|  | [optional] |
| **createuserid** | **Integer**|  | [optional] |
| **thumbnail** | **String**|  | [optional] |
| **timecardPeriodPref** | **String**|  | [optional] |
| **timezone** | **String**|  | [optional] |
| **tosVersion** | **String**|  | [optional] |
| **userCountry** | **String**|  | [optional] |
| **userDateFormat** | **String**|  | [optional] |
| **userDateOfBirth** | **LocalDate**|  | [optional] |
| **userDisplayName** | **String**|  | [optional] |
| **userEndDate** | **LocalDate**|  | [optional] |
| **userName** | **String**|  | [optional] |
| **userNameFormat** | **String**|  | [optional] |
| **userType** | **String**|  | [optional] |
| **view** | **Boolean**|  | [optional] |
| **workerType** | **String**|  | [optional] |
| **workingDays** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[sec1](../README.md#sec1)

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

