# WorkflowsApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewTask**](WorkflowsApi.md#createNewTask) | **POST** /api/v3/task/add | Create a new task. |
| [**getTaskDetailsByTaskId**](WorkflowsApi.md#getTaskDetailsByTaskId) | **GET** /api/v3/task/{taskid} | Get the details of a workflow task by task id. |
| [**getTasksByUserId**](WorkflowsApi.md#getTasksByUserId) | **GET** /api/v3/tasks | Get tasks by user id. |
| [**getUserWorkflows**](WorkflowsApi.md#getUserWorkflows) | **GET** /api/v3/userworkflows | Get workflows by user id. |
| [**getWorkflows**](WorkflowsApi.md#getWorkflows) | **GET** /api/workflows | Get workflows. |
| [**listTasksByUserworkflowId**](WorkflowsApi.md#listTasksByUserworkflowId) | **GET** /api/v3/userworkflows/{userworkflowid} | Get tasks by userworkflowid. |
| [**updateStatusTask**](WorkflowsApi.md#updateStatusTask) | **POST** /api/v3/task/update/status | Update status workflow task. |


<a name="createNewTask"></a>
# **createNewTask**
> Object createNewTask(taskModel).execute();

Create a new task.



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowsApi;
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
              .workflows
              .createNewTask()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createNewTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .workflows
              .createNewTask()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createNewTask");
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
| **taskModel** | [**List&lt;TaskModel&gt;**](TaskModel.md)| task object to create a new task | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **400** | 400 |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getTaskDetailsByTaskId"></a>
# **getTaskDetailsByTaskId**
> Object getTaskDetailsByTaskId(taskid).authorization(authorization).execute();

Get the details of a workflow task by task id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowsApi;
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
    Integer taskid = 56; // taskid
    String authorization = "authorization_example"; // Authorization
    try {
      Object result = client
              .workflows
              .getTaskDetailsByTaskId(taskid)
              .authorization(authorization)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getTaskDetailsByTaskId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .workflows
              .getTaskDetailsByTaskId(taskid)
              .authorization(authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getTaskDetailsByTaskId");
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
| **taskid** | **Integer**| taskid | |
| **authorization** | **String**| Authorization | [optional] |

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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getTasksByUserId"></a>
# **getTasksByUserId**
> Object getTasksByUserId().execute();

Get tasks by user id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowsApi;
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
              .workflows
              .getTasksByUserId()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getTasksByUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .workflows
              .getTasksByUserId()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getTasksByUserId");
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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getUserWorkflows"></a>
# **getUserWorkflows**
> Object getUserWorkflows().authorization(authorization).execute();

Get workflows by user id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowsApi;
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
      Object result = client
              .workflows
              .getUserWorkflows()
              .authorization(authorization)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getUserWorkflows");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .workflows
              .getUserWorkflows()
              .authorization(authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getUserWorkflows");
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

**Object**

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

<a name="getWorkflows"></a>
# **getWorkflows**
> Object getWorkflows().status(status).execute();

Get workflows.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowsApi;
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
    String status = "A"; // status
    try {
      Object result = client
              .workflows
              .getWorkflows()
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getWorkflows");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .workflows
              .getWorkflows()
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getWorkflows");
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
| **status** | **String**| status | [optional] [default to A] |

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

<a name="listTasksByUserworkflowId"></a>
# **listTasksByUserworkflowId**
> Object listTasksByUserworkflowId(userworkflowid).authorization(authorization).execute();

Get tasks by userworkflowid.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowsApi;
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
    Integer userworkflowid = 56; // userworkflowid
    String authorization = "authorization_example"; // Authorization
    try {
      Object result = client
              .workflows
              .listTasksByUserworkflowId(userworkflowid)
              .authorization(authorization)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#listTasksByUserworkflowId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .workflows
              .listTasksByUserworkflowId(userworkflowid)
              .authorization(authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#listTasksByUserworkflowId");
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
| **userworkflowid** | **Integer**| userworkflowid | |
| **authorization** | **String**| Authorization | [optional] |

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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="updateStatusTask"></a>
# **updateStatusTask**
> Object updateStatusTask().authorization(authorization).appraisalId(appraisalId).assignedUserId(assignedUserId).ci(ci).cid(cid).createUserId(createUserId).createts(createts).description(description).dueDate(dueDate).lastEdit(lastEdit).launchtsDate(launchtsDate).launchtsDay(launchtsDay).launchtsHours(launchtsHours).launchtsMinutes(launchtsMinutes).launchtsMonth(launchtsMonth).launchtsNanos(launchtsNanos).launchtsSeconds(launchtsSeconds).launchtsTime(launchtsTime).launchtsTimezoneOffset(launchtsTimezoneOffset).launchtsYear(launchtsYear).phasename(phasename).projectId(projectId).recruitId(recruitId).statusCode(statusCode).systemTask(systemTask).taskId(taskId).taskUID(taskUID).title(title).transitionName(transitionName).type(type).execute();

Update status workflow task.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://acmecompany.bizmerlin.net/rm/api";
    
    configuration.sec0  = "YOUR API KEY";
    ClayHr client = new ClayHr(configuration);
    String authorization = "authorization_example"; // Authorization
    Integer appraisalId = 56;
    Integer assignedUserId = 56;
    Boolean ci = true;
    Integer cid = 56;
    Integer createUserId = 56;
    LocalDate createts = LocalDate.now();
    String description = "description_example";
    LocalDate dueDate = LocalDate.now();
    String lastEdit = "lastEdit_example";
    Integer launchtsDate = 56;
    Integer launchtsDay = 56;
    Integer launchtsHours = 56;
    Integer launchtsMinutes = 56;
    Integer launchtsMonth = 56;
    Integer launchtsNanos = 56;
    Integer launchtsSeconds = 56;
    Long launchtsTime = 56L;
    Integer launchtsTimezoneOffset = 56;
    Integer launchtsYear = 56;
    String phasename = "phasename_example";
    Integer projectId = 56;
    Integer recruitId = 56;
    String statusCode = "statusCode_example";
    Integer systemTask = 56;
    Integer taskId = 56;
    Integer taskUID = 56;
    String title = "title_example";
    String transitionName = "transitionName_example";
    String type = "type_example";
    try {
      Object result = client
              .workflows
              .updateStatusTask()
              .authorization(authorization)
              .appraisalId(appraisalId)
              .assignedUserId(assignedUserId)
              .ci(ci)
              .cid(cid)
              .createUserId(createUserId)
              .createts(createts)
              .description(description)
              .dueDate(dueDate)
              .lastEdit(lastEdit)
              .launchtsDate(launchtsDate)
              .launchtsDay(launchtsDay)
              .launchtsHours(launchtsHours)
              .launchtsMinutes(launchtsMinutes)
              .launchtsMonth(launchtsMonth)
              .launchtsNanos(launchtsNanos)
              .launchtsSeconds(launchtsSeconds)
              .launchtsTime(launchtsTime)
              .launchtsTimezoneOffset(launchtsTimezoneOffset)
              .launchtsYear(launchtsYear)
              .phasename(phasename)
              .projectId(projectId)
              .recruitId(recruitId)
              .statusCode(statusCode)
              .systemTask(systemTask)
              .taskId(taskId)
              .taskUID(taskUID)
              .title(title)
              .transitionName(transitionName)
              .type(type)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#updateStatusTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .workflows
              .updateStatusTask()
              .authorization(authorization)
              .appraisalId(appraisalId)
              .assignedUserId(assignedUserId)
              .ci(ci)
              .cid(cid)
              .createUserId(createUserId)
              .createts(createts)
              .description(description)
              .dueDate(dueDate)
              .lastEdit(lastEdit)
              .launchtsDate(launchtsDate)
              .launchtsDay(launchtsDay)
              .launchtsHours(launchtsHours)
              .launchtsMinutes(launchtsMinutes)
              .launchtsMonth(launchtsMonth)
              .launchtsNanos(launchtsNanos)
              .launchtsSeconds(launchtsSeconds)
              .launchtsTime(launchtsTime)
              .launchtsTimezoneOffset(launchtsTimezoneOffset)
              .launchtsYear(launchtsYear)
              .phasename(phasename)
              .projectId(projectId)
              .recruitId(recruitId)
              .statusCode(statusCode)
              .systemTask(systemTask)
              .taskId(taskId)
              .taskUID(taskUID)
              .title(title)
              .transitionName(transitionName)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#updateStatusTask");
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
| **appraisalId** | **Integer**|  | [optional] |
| **assignedUserId** | **Integer**|  | [optional] |
| **ci** | **Boolean**|  | [optional] |
| **cid** | **Integer**|  | [optional] |
| **createUserId** | **Integer**|  | [optional] |
| **createts** | **LocalDate**|  | [optional] |
| **description** | **String**|  | [optional] |
| **dueDate** | **LocalDate**|  | [optional] |
| **lastEdit** | **String**|  | [optional] |
| **launchtsDate** | **Integer**|  | [optional] |
| **launchtsDay** | **Integer**|  | [optional] |
| **launchtsHours** | **Integer**|  | [optional] |
| **launchtsMinutes** | **Integer**|  | [optional] |
| **launchtsMonth** | **Integer**|  | [optional] |
| **launchtsNanos** | **Integer**|  | [optional] |
| **launchtsSeconds** | **Integer**|  | [optional] |
| **launchtsTime** | **Long**|  | [optional] |
| **launchtsTimezoneOffset** | **Integer**|  | [optional] |
| **launchtsYear** | **Integer**|  | [optional] |
| **phasename** | **String**|  | [optional] |
| **projectId** | **Integer**|  | [optional] |
| **recruitId** | **Integer**|  | [optional] |
| **statusCode** | **String**|  | [optional] |
| **systemTask** | **Integer**|  | [optional] |
| **taskId** | **Integer**|  | [optional] |
| **taskUID** | **Integer**|  | [optional] |
| **title** | **String**|  | [optional] |
| **transitionName** | **String**|  | [optional] |
| **type** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

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

