# AnnouncementApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewAnnouncement**](AnnouncementApi.md#createNewAnnouncement) | **POST** /api/announcement/create | Create Announcement |
| [**getAttachmentsById**](AnnouncementApi.md#getAttachmentsById) | **GET** /api/attachment/list/{annId} | Retrieve Announcement Attachments |
| [**getById**](AnnouncementApi.md#getById) | **GET** /api/announcement/{annId} | Retrieve Announcement |
| [**updateAnnouncement**](AnnouncementApi.md#updateAnnouncement) | **PUT** /api/announcement/edit | Update Announcement |


<a name="createNewAnnouncement"></a>
# **createNewAnnouncement**
> String createNewAnnouncement(title, description).url(url).status(status).execute();

Create Announcement

 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnnouncementApi;
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
    String title = "Travel Policies"; // Title of the announcement.
    String description = "There are some amendments done in policy leave."; // Description of the announcement.
    String url = "https://www.google.com"; // Any link associated/brief of the announcement.
    String status = "A"; // Status of Announcement. Choose between [\"A\", \"D\", \"I\"]. Defaults to \"A\".   A - Active, D - In Draft, I - Archive
    try {
      String result = client
              .announcement
              .createNewAnnouncement(title, description)
              .url(url)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementApi#createNewAnnouncement");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .announcement
              .createNewAnnouncement(title, description)
              .url(url)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementApi#createNewAnnouncement");
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
| **title** | **String**| Title of the announcement. | |
| **description** | **String**| Description of the announcement. | |
| **url** | **String**| Any link associated/brief of the announcement. | [optional] |
| **status** | **String**| Status of Announcement. Choose between [\&quot;A\&quot;, \&quot;D\&quot;, \&quot;I\&quot;]. Defaults to \&quot;A\&quot;.   A - Active, D - In Draft, I - Archive | [optional] [enum: A, D, I] |

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

<a name="getAttachmentsById"></a>
# **getAttachmentsById**
> String getAttachmentsById(annId).execute();

Retrieve Announcement Attachments



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnnouncementApi;
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
    Integer annId = 56; // The ID of the announcement.
    try {
      String result = client
              .announcement
              .getAttachmentsById(annId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementApi#getAttachmentsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .announcement
              .getAttachmentsById(annId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementApi#getAttachmentsById");
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
| **annId** | **Integer**| The ID of the announcement. | |

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

<a name="getById"></a>
# **getById**
> String getById(annId).execute();

Retrieve Announcement



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnnouncementApi;
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
    Integer annId = 56; // The ID of the announcement.
    try {
      String result = client
              .announcement
              .getById(annId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .announcement
              .getById(annId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementApi#getById");
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
| **annId** | **Integer**| The ID of the announcement. | |

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

<a name="updateAnnouncement"></a>
# **updateAnnouncement**
> String updateAnnouncement(annId, title, desciption, status).url(url).execute();

Update Announcement



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnnouncementApi;
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
    Integer annId = 56; // The ID of the announcement.
    String title = "title_example"; // Title of the announcement.
    String desciption = ""; // Description of the announcement.
    String status = "A"; // Status of Announcement. Choose between [\"A\", \"D\", \"I\"]. Defaults to \"A\".   A - Active, D - In Draft, I - Archive
    String url = ""; // Link associated with the announcement.
    try {
      String result = client
              .announcement
              .updateAnnouncement(annId, title, desciption, status)
              .url(url)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementApi#updateAnnouncement");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .announcement
              .updateAnnouncement(annId, title, desciption, status)
              .url(url)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnouncementApi#updateAnnouncement");
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
| **annId** | **Integer**| The ID of the announcement. | |
| **title** | **String**| Title of the announcement. | |
| **desciption** | **String**| Description of the announcement. | |
| **status** | **String**| Status of Announcement. Choose between [\&quot;A\&quot;, \&quot;D\&quot;, \&quot;I\&quot;]. Defaults to \&quot;A\&quot;.   A - Active, D - In Draft, I - Archive | [enum: A, D, I] |
| **url** | **String**| Link associated with the announcement. | [optional] |

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

