# GoalsApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewGoal**](GoalsApi.md#createNewGoal) | **POST** /goal | Create new goal |
| [**deleteGoal**](GoalsApi.md#deleteGoal) | **DELETE** /deletegoal | Delete Goal |
| [**getAllGoals**](GoalsApi.md#getAllGoals) | **GET** /goal | Retrieve all goals |
| [**getGoal**](GoalsApi.md#getGoal) | **GET** /getgoal | Retrieve Goal |
| [**getUserGoals**](GoalsApi.md#getUserGoals) | **GET** /goal/list | Retrieve goals of user |


<a name="createNewGoal"></a>
# **createNewGoal**
> Object createNewGoal().additive(additive).begindate(begindate).cid(cid).commentCrediteatets(commentCrediteatets).commentDescription(commentDescription).companyGoal(companyGoal).completionRatio(completionRatio).createUserId(createUserId).createtsDate(createtsDate).createtsDay(createtsDay).createtsHours(createtsHours).createtsMinutes(createtsMinutes).createtsMonth(createtsMonth).createtsNanos(createtsNanos).createtsSeconds(createtsSeconds).createtsTime(createtsTime).createtsTimezoneOffset(createtsTimezoneOffset).createtsYear(createtsYear).crediteatets(crediteatets).currentValue(currentValue).description(description).disposition(disposition).elapsedTimeRatio(elapsedTimeRatio).goalId(goalId).goalValue(goalValue).goalWeightage(goalWeightage).hasGoalApprovalPermission(hasGoalApprovalPermission).id(id).initialvalue(initialvalue).isForward(isForward).lastUpdateUserId(lastUpdateUserId).objectiveId(objectiveId).parentGoalId(parentGoalId).progressRatio(progressRatio).projectid(projectid).reviewUserId(reviewUserId).state(state).status(status).summary(summary).targetDate(targetDate).typecode(typecode).uname(uname).units(units).visibleToDirectReports(visibleToDirectReports).execute();

Create new goal

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    Integer additive = 56;
    LocalDate begindate = LocalDate.now();
    Integer cid = 56;
    String commentCrediteatets = "commentCrediteatets_example";
    String commentDescription = "commentDescription_example";
    Integer companyGoal = 56;
    Float completionRatio = 3.4F;
    Integer createUserId = 56;
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
    OffsetDateTime crediteatets = OffsetDateTime.now();
    Float currentValue = 3.4F;
    String description = "description_example";
    String disposition = "disposition_example";
    Float elapsedTimeRatio = 3.4F;
    Integer goalId = 56;
    Float goalValue = 3.4F;
    Float goalWeightage = 3.4F;
    Boolean hasGoalApprovalPermission = true;
    Integer id = 56;
    Float initialvalue = 3.4F;
    Boolean isForward = true;
    Integer lastUpdateUserId = 56;
    Integer objectiveId = 56;
    Integer parentGoalId = 56;
    Float progressRatio = 3.4F;
    Integer projectid = 56;
    Integer reviewUserId = 0; // reviewUserId
    String state = "state_example";
    String status = "status_example";
    String summary = "summary_example";
    LocalDate targetDate = LocalDate.now();
    String typecode = "typecode_example";
    String uname = "uname_example";
    String units = "units_example";
    Integer visibleToDirectReports = 56;
    try {
      Object result = client
              .goals
              .createNewGoal()
              .additive(additive)
              .begindate(begindate)
              .cid(cid)
              .commentCrediteatets(commentCrediteatets)
              .commentDescription(commentDescription)
              .companyGoal(companyGoal)
              .completionRatio(completionRatio)
              .createUserId(createUserId)
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
              .crediteatets(crediteatets)
              .currentValue(currentValue)
              .description(description)
              .disposition(disposition)
              .elapsedTimeRatio(elapsedTimeRatio)
              .goalId(goalId)
              .goalValue(goalValue)
              .goalWeightage(goalWeightage)
              .hasGoalApprovalPermission(hasGoalApprovalPermission)
              .id(id)
              .initialvalue(initialvalue)
              .isForward(isForward)
              .lastUpdateUserId(lastUpdateUserId)
              .objectiveId(objectiveId)
              .parentGoalId(parentGoalId)
              .progressRatio(progressRatio)
              .projectid(projectid)
              .reviewUserId(reviewUserId)
              .state(state)
              .status(status)
              .summary(summary)
              .targetDate(targetDate)
              .typecode(typecode)
              .uname(uname)
              .units(units)
              .visibleToDirectReports(visibleToDirectReports)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#createNewGoal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .goals
              .createNewGoal()
              .additive(additive)
              .begindate(begindate)
              .cid(cid)
              .commentCrediteatets(commentCrediteatets)
              .commentDescription(commentDescription)
              .companyGoal(companyGoal)
              .completionRatio(completionRatio)
              .createUserId(createUserId)
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
              .crediteatets(crediteatets)
              .currentValue(currentValue)
              .description(description)
              .disposition(disposition)
              .elapsedTimeRatio(elapsedTimeRatio)
              .goalId(goalId)
              .goalValue(goalValue)
              .goalWeightage(goalWeightage)
              .hasGoalApprovalPermission(hasGoalApprovalPermission)
              .id(id)
              .initialvalue(initialvalue)
              .isForward(isForward)
              .lastUpdateUserId(lastUpdateUserId)
              .objectiveId(objectiveId)
              .parentGoalId(parentGoalId)
              .progressRatio(progressRatio)
              .projectid(projectid)
              .reviewUserId(reviewUserId)
              .state(state)
              .status(status)
              .summary(summary)
              .targetDate(targetDate)
              .typecode(typecode)
              .uname(uname)
              .units(units)
              .visibleToDirectReports(visibleToDirectReports)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#createNewGoal");
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
| **additive** | **Integer**|  | [optional] |
| **begindate** | **LocalDate**|  | [optional] |
| **cid** | **Integer**|  | [optional] |
| **commentCrediteatets** | **String**|  | [optional] |
| **commentDescription** | **String**|  | [optional] |
| **companyGoal** | **Integer**|  | [optional] |
| **completionRatio** | **Float**|  | [optional] |
| **createUserId** | **Integer**|  | [optional] |
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
| **crediteatets** | **OffsetDateTime**|  | [optional] |
| **currentValue** | **Float**|  | [optional] |
| **description** | **String**|  | [optional] |
| **disposition** | **String**|  | [optional] |
| **elapsedTimeRatio** | **Float**|  | [optional] |
| **goalId** | **Integer**|  | [optional] |
| **goalValue** | **Float**|  | [optional] |
| **goalWeightage** | **Float**|  | [optional] |
| **hasGoalApprovalPermission** | **Boolean**|  | [optional] |
| **id** | **Integer**|  | [optional] |
| **initialvalue** | **Float**|  | [optional] |
| **isForward** | **Boolean**|  | [optional] |
| **lastUpdateUserId** | **Integer**|  | [optional] |
| **objectiveId** | **Integer**|  | [optional] |
| **parentGoalId** | **Integer**|  | [optional] |
| **progressRatio** | **Float**|  | [optional] |
| **projectid** | **Integer**|  | [optional] |
| **reviewUserId** | **Integer**| reviewUserId | [optional] [default to 0] |
| **state** | **String**|  | [optional] |
| **status** | **String**|  | [optional] |
| **summary** | **String**|  | [optional] |
| **targetDate** | **LocalDate**|  | [optional] |
| **typecode** | **String**|  | [optional] |
| **uname** | **String**|  | [optional] |
| **units** | **String**|  | [optional] |
| **visibleToDirectReports** | **Integer**|  | [optional] |

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
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="deleteGoal"></a>
# **deleteGoal**
> GoalsDeleteGoalResponse deleteGoal(goalId).execute();

Delete Goal



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    Integer goalId = 56; // GoalId to delete a goal
    try {
      GoalsDeleteGoalResponse result = client
              .goals
              .deleteGoal(goalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#deleteGoal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsDeleteGoalResponse> response = client
              .goals
              .deleteGoal(goalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#deleteGoal");
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
| **goalId** | **Integer**| GoalId to delete a goal | |

### Return type

[**GoalsDeleteGoalResponse**](GoalsDeleteGoalResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getAllGoals"></a>
# **getAllGoals**
> Object getAllGoals().execute();

Retrieve all goals

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
              .goals
              .getAllGoals()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getAllGoals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .goals
              .getAllGoals()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getAllGoals");
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

<a name="getGoal"></a>
# **getGoal**
> GoalsGetGoalResponse getGoal(goalid).reviewUserId(reviewUserId).execute();

Retrieve Goal



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    Integer goalid = 56; // ID to get a goal.
    Integer reviewUserId = 56; // The ID of the user who is reviewee.
    try {
      GoalsGetGoalResponse result = client
              .goals
              .getGoal(goalid)
              .reviewUserId(reviewUserId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSummary());
      System.out.println(result.getDescription());
      System.out.println(result.getGoalId());
      System.out.println(result.getAdditive());
      System.out.println(result.getVisibleToDirectReports());
      System.out.println(result.getFreezeGoal());
      System.out.println(result.getIsForward());
      System.out.println(result.getCompanyGoal());
      System.out.println(result.getElapsedTimeRatio());
      System.out.println(result.getCompletionRatio());
      System.out.println(result.getProgressRatio());
      System.out.println(result.getTypecode());
      System.out.println(result.getStatus());
      System.out.println(result.getState());
      System.out.println(result.getPredictiveIndex());
      System.out.println(result.getObjectiveId());
      System.out.println(result.getCid());
      System.out.println(result.getDisposition());
      System.out.println(result.getUnits());
      System.out.println(result.getAssignedUserModel());
      System.out.println(result.getReviewerUserModel());
      System.out.println(result.getGoalCollaborationModel());
      System.out.println(result.getCrediteatets());
      System.out.println(result.getCommentCrediteatets());
      System.out.println(result.getCommentDescription());
      System.out.println(result.getUname());
      System.out.println(result.getHasGoalApprovalPermission());
      System.out.println(result.getBegindate());
      System.out.println(result.getGoalWeightage());
      System.out.println(result.getCreateuserid());
      System.out.println(result.getCreatets());
      System.out.println(result.getProjectModel());
      System.out.println(result.getGoalTypeModel());
      System.out.println(result.getParentGoalId());
      System.out.println(result.getId());
      System.out.println(result.getCreateUserId());
      System.out.println(result.getLastUpdateUserId());
      System.out.println(result.getProjectid());
      System.out.println(result.getTargetdate());
      System.out.println(result.getInitialvalue());
      System.out.println(result.getCurrentvalue());
      System.out.println(result.getGoalvalue());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getGoal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsGetGoalResponse> response = client
              .goals
              .getGoal(goalid)
              .reviewUserId(reviewUserId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getGoal");
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
| **goalid** | **Integer**| ID to get a goal. | |
| **reviewUserId** | **Integer**| The ID of the user who is reviewee. | [optional] |

### Return type

[**GoalsGetGoalResponse**](GoalsGetGoalResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getUserGoals"></a>
# **getUserGoals**
> GoalsGetUserGoalsResponse getUserGoals().execute();

Retrieve goals of user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
      GoalsGetUserGoalsResponse result = client
              .goals
              .getUserGoals()
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getUserGoals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsGetUserGoalsResponse> response = client
              .goals
              .getUserGoals()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getUserGoals");
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

[**GoalsGetUserGoalsResponse**](GoalsGetUserGoalsResponse.md)

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

