# UserWorkflowApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignWorkflowToUser**](UserWorkflowApi.md#assignWorkflowToUser) | **POST** /api/v3/userworkflow/assign/{workflowId} | Assign Workflow to User |


<a name="assignWorkflowToUser"></a>
# **assignWorkflowToUser**
> UserWorkflowAssignWorkflowToUserResponse assignWorkflowToUser(workflowId, assigneeUserId, coordinatorUserId).comment(comment).execute();

Assign Workflow to User

This page will help you get started with Assign Workflow to User.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserWorkflowApi;
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
    Integer workflowId = 56; // The ID of the workflow.
    Integer assigneeUserId = 56; // The ID of Workflow Assignee.
    Integer coordinatorUserId = 56; // The ID of Workflow Coordinator.
    String comment = "comment_example"; // Comment of the workflow.
    try {
      UserWorkflowAssignWorkflowToUserResponse result = client
              .userWorkflow
              .assignWorkflowToUser(workflowId, assigneeUserId, coordinatorUserId)
              .comment(comment)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserWorkflowApi#assignWorkflowToUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserWorkflowAssignWorkflowToUserResponse> response = client
              .userWorkflow
              .assignWorkflowToUser(workflowId, assigneeUserId, coordinatorUserId)
              .comment(comment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserWorkflowApi#assignWorkflowToUser");
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
| **workflowId** | **Integer**| The ID of the workflow. | |
| **assigneeUserId** | **Integer**| The ID of Workflow Assignee. | |
| **coordinatorUserId** | **Integer**| The ID of Workflow Coordinator. | |
| **comment** | **String**| Comment of the workflow. | [optional] |

### Return type

[**UserWorkflowAssignWorkflowToUserResponse**](UserWorkflowAssignWorkflowToUserResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

