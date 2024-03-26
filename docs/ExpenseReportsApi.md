# ExpenseReportsApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNew**](ExpenseReportsApi.md#createNew) | **POST** /expensereport | Create expense report |
| [**createNewExpenseItem**](ExpenseReportsApi.md#createNewExpenseItem) | **POST** /expenseitem | Create expense item |
| [**deleteExpenseReport**](ExpenseReportsApi.md#deleteExpenseReport) | **POST** /expensereport/delete | Delete expense report |
| [**getByUserId**](ExpenseReportsApi.md#getByUserId) | **GET** /expensereports | Retrieve expense reports by User ID |
| [**getCurrencies**](ExpenseReportsApi.md#getCurrencies) | **GET** /currencylist | Retrieve currencies |
| [**getExpenseTypes**](ExpenseReportsApi.md#getExpenseTypes) | **GET** /expensetypes | Retrieve expense types |
| [**getReportDetails**](ExpenseReportsApi.md#getReportDetails) | **GET** /expensereport | Retrieve the details of expense report |
| [**submitExpenseReport**](ExpenseReportsApi.md#submitExpenseReport) | **POST** /expensereport/submit/{expenseReportId} | Submit expense report |


<a name="createNew"></a>
# **createNew**
> ExpenseReportsCreateNewResponse createNew(name, amount).description(description).execute();

Create expense report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseReportsApi;
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
    String name = "Travel expense report."; // Name of the expense report.
    Double amount = 300D; // Amount to be added in expense report.
    String description = "This expene report is regarding the travelling."; // Description of the expense report.
    try {
      ExpenseReportsCreateNewResponse result = client
              .expenseReports
              .createNew(name, amount)
              .description(description)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getExpenseReportId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseReportsCreateNewResponse> response = client
              .expenseReports
              .createNew(name, amount)
              .description(description)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#createNew");
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
| **name** | **String**| Name of the expense report. | |
| **amount** | **Double**| Amount to be added in expense report. | |
| **description** | **String**| Description of the expense report. | [optional] |

### Return type

[**ExpenseReportsCreateNewResponse**](ExpenseReportsCreateNewResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createNewExpenseItem"></a>
# **createNewExpenseItem**
> ExpenseReportsCreateNewExpenseItemResponse createNewExpenseItem(amount, billable, cid, currencyCode, date, expenseItemId, expenseType, expenseTypeId, projectId, reimbursible, remarks).execute();

Create expense item



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseReportsApi;
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
    Float amount = 3.4F; // Amount of the expense item.
    String billable = "Y"; // Y for \"Yes\" and N for \"No\".
    Integer cid = 56; // The unique ID of the customer.
    String currencyCode = "$(USD)"; // Code of the currency.
    LocalDate date = LocalDate.now(); // Date of creating expense item.
    Integer expenseItemId = 56; // The ID of the expense item.
    String expenseType = "expenseType_example"; // The type of expense.
    Integer expenseTypeId = 56; // The ID of the expense type.
    Integer projectId = 56; // The ID of the project.
    String reimbursible = "Y"; // Y for \"Yes\" and N for \"No\".
    String remarks = "remarks_example";
    try {
      ExpenseReportsCreateNewExpenseItemResponse result = client
              .expenseReports
              .createNewExpenseItem(amount, billable, cid, currencyCode, date, expenseItemId, expenseType, expenseTypeId, projectId, reimbursible, remarks)
              .execute();
      System.out.println(result);
      System.out.println(result.getExpenseItemId());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#createNewExpenseItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseReportsCreateNewExpenseItemResponse> response = client
              .expenseReports
              .createNewExpenseItem(amount, billable, cid, currencyCode, date, expenseItemId, expenseType, expenseTypeId, projectId, reimbursible, remarks)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#createNewExpenseItem");
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
| **amount** | **Float**| Amount of the expense item. | |
| **billable** | **String**| Y for \&quot;Yes\&quot; and N for \&quot;No\&quot;. | [enum: Y, N] |
| **cid** | **Integer**| The unique ID of the customer. | |
| **currencyCode** | **String**| Code of the currency. | [enum: $(USD), $(CD), ₹(INR)] |
| **date** | **LocalDate**| Date of creating expense item. | |
| **expenseItemId** | **Integer**| The ID of the expense item. | |
| **expenseType** | **String**| The type of expense. | |
| **expenseTypeId** | **Integer**| The ID of the expense type. | |
| **projectId** | **Integer**| The ID of the project. | |
| **reimbursible** | **String**| Y for \&quot;Yes\&quot; and N for \&quot;No\&quot;. | [enum: Y, N] |
| **remarks** | **String**|  | |

### Return type

[**ExpenseReportsCreateNewExpenseItemResponse**](ExpenseReportsCreateNewExpenseItemResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="deleteExpenseReport"></a>
# **deleteExpenseReport**
> ExpenseReportsDeleteExpenseReportResponse deleteExpenseReport(expenseReportId).execute();

Delete expense report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseReportsApi;
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
    Integer expenseReportId = 56; // The ID of the expense report.
    try {
      ExpenseReportsDeleteExpenseReportResponse result = client
              .expenseReports
              .deleteExpenseReport(expenseReportId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#deleteExpenseReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseReportsDeleteExpenseReportResponse> response = client
              .expenseReports
              .deleteExpenseReport(expenseReportId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#deleteExpenseReport");
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
| **expenseReportId** | **Integer**| The ID of the expense report. | |

### Return type

[**ExpenseReportsDeleteExpenseReportResponse**](ExpenseReportsDeleteExpenseReportResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getByUserId"></a>
# **getByUserId**
> String getByUserId().guid(guid).email(email).execute();

Retrieve expense reports by User ID



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseReportsApi;
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
    String guid = "guid_example"; // The unique system generated ID of the user.
    String email = "email_example"; // Email of the user.
    try {
      String result = client
              .expenseReports
              .getByUserId()
              .guid(guid)
              .email(email)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#getByUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .expenseReports
              .getByUserId()
              .guid(guid)
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#getByUserId");
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
| **guid** | **String**| The unique system generated ID of the user. | [optional] |
| **email** | **String**| Email of the user. | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |
| **401** | 401 |  -  |

<a name="getCurrencies"></a>
# **getCurrencies**
> ExpenseReportsGetCurrenciesResponse getCurrencies().execute();

Retrieve currencies



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseReportsApi;
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
      ExpenseReportsGetCurrenciesResponse result = client
              .expenseReports
              .getCurrencies()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#getCurrencies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseReportsGetCurrenciesResponse> response = client
              .expenseReports
              .getCurrencies()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#getCurrencies");
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

[**ExpenseReportsGetCurrenciesResponse**](ExpenseReportsGetCurrenciesResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |
| **401** | 401 |  -  |

<a name="getExpenseTypes"></a>
# **getExpenseTypes**
> String getExpenseTypes().execute();

Retrieve expense types



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseReportsApi;
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
              .expenseReports
              .getExpenseTypes()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#getExpenseTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .expenseReports
              .getExpenseTypes()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#getExpenseTypes");
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
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |
| **401** | 401 |  -  |

<a name="getReportDetails"></a>
# **getReportDetails**
> String getReportDetails().expenseReportId(expenseReportId).guid(guid).execute();

Retrieve the details of expense report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseReportsApi;
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
    Integer expenseReportId = 56; // The ID of the expense report.
    String guid = "guid_example"; // The unique system generated ID of the user.
    try {
      String result = client
              .expenseReports
              .getReportDetails()
              .expenseReportId(expenseReportId)
              .guid(guid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#getReportDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .expenseReports
              .getReportDetails()
              .expenseReportId(expenseReportId)
              .guid(guid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#getReportDetails");
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
| **expenseReportId** | **Integer**| The ID of the expense report. | [optional] |
| **guid** | **String**| The unique system generated ID of the user. | [optional] |

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

<a name="submitExpenseReport"></a>
# **submitExpenseReport**
> ExpenseReportsSubmitExpenseReportResponse submitExpenseReport(expenseReportId, status).execute();

Submit expense report



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseReportsApi;
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
    Integer expenseReportId = 56; // The ID of the expense report.
    String status = "DRFT"; // Status of the expense report.
    try {
      ExpenseReportsSubmitExpenseReportResponse result = client
              .expenseReports
              .submitExpenseReport(expenseReportId, status)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getExpenseReportId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#submitExpenseReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseReportsSubmitExpenseReportResponse> response = client
              .expenseReports
              .submitExpenseReport(expenseReportId, status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseReportsApi#submitExpenseReport");
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
| **expenseReportId** | **Integer**| The ID of the expense report. | |
| **status** | **String**| Status of the expense report. | [enum: DRFT, SUB] |

### Return type

[**ExpenseReportsSubmitExpenseReportResponse**](ExpenseReportsSubmitExpenseReportResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

