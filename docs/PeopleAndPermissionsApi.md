# PeopleAndPermissionsApi

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addReportsTo**](PeopleAndPermissionsApi.md#addReportsTo) | **POST** /api/user/orgrelation/add | Add reports to |
| [**createOrUpdateUserDetails**](PeopleAndPermissionsApi.md#createOrUpdateUserDetails) | **POST** /api/user/completeUserDetails | Create or Update user |
| [**createUser**](PeopleAndPermissionsApi.md#createUser) | **POST** /api/user/add | Create user |
| [**createUserCompensation**](PeopleAndPermissionsApi.md#createUserCompensation) | **POST** /api/user/compensation/add | Create compensation for user |
| [**deleteUserAddress**](PeopleAndPermissionsApi.md#deleteUserAddress) | **POST** /api/user/address/delete | Delete User Address |
| [**deleteUserEducation**](PeopleAndPermissionsApi.md#deleteUserEducation) | **POST** /user/education/delete | Delete User Education |
| [**deleteUserEmployment**](PeopleAndPermissionsApi.md#deleteUserEmployment) | **POST** /api/user/employment/delete | Deletes User Employment |
| [**getAllUsersDetails**](PeopleAndPermissionsApi.md#getAllUsersDetails) | **GET** /api/users | Retrieve all users details |
| [**getBasicUserDetails**](PeopleAndPermissionsApi.md#getBasicUserDetails) | **GET** /api/users/basic | Retrieve basic user details |
| [**getFinancialRecord**](PeopleAndPermissionsApi.md#getFinancialRecord) | **GET** /api/user/compensation | Retrieve user financial record |
| [**getFinancialStatus**](PeopleAndPermissionsApi.md#getFinancialStatus) | **GET** /api/user/update/status | Retrieve user financial status |
| [**getUserBasicInformation**](PeopleAndPermissionsApi.md#getUserBasicInformation) | **GET** /api/user/basic | Retrieve user basic information |
| [**getUserDetails**](PeopleAndPermissionsApi.md#getUserDetails) | **GET** /api/user | Retrieve user details |
| [**getUserList**](PeopleAndPermissionsApi.md#getUserList) | **GET** /api/user/list | Retrieve a user or list of users |
| [**getUserPermissionsAndMenuConfigurations**](PeopleAndPermissionsApi.md#getUserPermissionsAndMenuConfigurations) | **GET** /api/user/permissions | Retrieve user permissions and menu configurations |
| [**getUsers**](PeopleAndPermissionsApi.md#getUsers) | **GET** /resource | Retrieve users |
| [**saveCustomFieldValues**](PeopleAndPermissionsApi.md#saveCustomFieldValues) | **POST** /api/user/saveCustomFieldValues | Save Custom Field values |
| [**saveUserAddress**](PeopleAndPermissionsApi.md#saveUserAddress) | **POST** /api/address/save | Save User Address |
| [**saveUserEducation**](PeopleAndPermissionsApi.md#saveUserEducation) | **POST** /api/education/save | Save User Education |
| [**saveUserEmployment**](PeopleAndPermissionsApi.md#saveUserEmployment) | **POST** /api/employment/save | Save User Employment |
| [**updateFinancialRecord**](PeopleAndPermissionsApi.md#updateFinancialRecord) | **POST** /api/user/compensation/update | Update financial record of User |
| [**updateUser**](PeopleAndPermissionsApi.md#updateUser) | **POST** /api/user/update | Update user |
| [**uploadUserProfilePicture**](PeopleAndPermissionsApi.md#uploadUserProfilePicture) | **POST** /api/user/uploadpicture | Upload user profile |


<a name="addReportsTo"></a>
# **addReportsTo**
> PeopleAndPermissionsAddReportsToResponse addReportsTo().empId(empId).email(email).peopleAndPermissionsAddReportsToRequest(peopleAndPermissionsAddReportsToRequest).execute();

Add reports to



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    List<PeopleAndPermissionsAddReportsToRequestAddObjectsInner> addObjects = Arrays.asList();
    String empId = "empId_example"; // The unique identity of the employee. 
    String email = "email_example"; // Email address of the user.
    try {
      PeopleAndPermissionsAddReportsToResponse result = client
              .peopleAndPermissions
              .addReportsTo()
              .addObjects(addObjects)
              .empId(empId)
              .email(email)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#addReportsTo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleAndPermissionsAddReportsToResponse> response = client
              .peopleAndPermissions
              .addReportsTo()
              .addObjects(addObjects)
              .empId(empId)
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#addReportsTo");
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
| **empId** | **String**| The unique identity of the employee.  | [optional] |
| **email** | **String**| Email address of the user. | [optional] |
| **peopleAndPermissionsAddReportsToRequest** | [**PeopleAndPermissionsAddReportsToRequest**](PeopleAndPermissionsAddReportsToRequest.md)|  | [optional] |

### Return type

[**PeopleAndPermissionsAddReportsToResponse**](PeopleAndPermissionsAddReportsToResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="createOrUpdateUserDetails"></a>
# **createOrUpdateUserDetails**
> Object createOrUpdateUserDetails().peopleAndPermissionsCreateOrUpdateUserDetailsRequest(peopleAndPermissionsCreateOrUpdateUserDetailsRequest).execute();

Create or Update user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String firstName = "firstName_example"; // First name of user.
    String email = "email_example"; // Mail ID of user.
    String lastName = "lastName_example"; // Last name of user.
    String empId = "empId_example"; // Employee ID of the user.
    String gender = "gender_example"; // Gender of the user.
    String guid = "guid_example"; // The unique system generated ID of the user.
    String status = "A"; // Status of the user. A - Active, I - Inactive, F - Future Joiner
    String displayFullName = "displayFullName_example"; // Display name of the user.
    String middleName = "middleName_example"; // Middle name of user.
    String secondLastName = "secondLastName_example"; // Second Last name of user.
    String shortName = "shortName_example"; // Short name of user.
    String namePronunciation = "namePronunciation_example"; // Name Pronunciation
    String familySuffix = "familySuffix_example"; // Family Suffix
    String workerType = "workerType_example"; // Worker type of the user.
    String userDateOfBirth = "userDateOfBirth_example"; // Birth date of user.
    String phone = "phone_example"; // Phone number of the user.
    String cellPhone = "cellPhone_example"; // Cell phone of the user.
    Integer position = 56; // Profile ID of the user.
    Integer departmentID = 56; // Org Unit ID of the user.
    Integer locationId = 56; // Location ID of the user.
    String locationName = "locationName_example"; // Location of user.
    String userStartDate = "userStartDate_example"; // Start Date of user.
    List<String> reportsToEmail = Arrays.asList(); // Managers detail of user.
    List<PeopleAndPermissionsCreateOrUpdateUserDetailsRequestAddressListInner> addressList = Arrays.asList(); // Address detail of user.
    List<PeopleAndPermissionsCreateOrUpdateUserDetailsRequestEducationListInner> educationList = Arrays.asList(); // Education detail of user.
    List<PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner> contactList = Arrays.asList(); // Contact detail of user
    List<PeopleAndPermissionsCreateOrUpdateUserDetailsRequestFinancialListInner> financialList = Arrays.asList(); // Financial detail of user.
    String customFieldValues = "customFieldValues_example"; // key - cfcode , value - cfvalue
    try {
      Object result = client
              .peopleAndPermissions
              .createOrUpdateUserDetails()
              .firstName(firstName)
              .email(email)
              .lastName(lastName)
              .empId(empId)
              .gender(gender)
              .guid(guid)
              .status(status)
              .displayFullName(displayFullName)
              .middleName(middleName)
              .secondLastName(secondLastName)
              .shortName(shortName)
              .namePronunciation(namePronunciation)
              .familySuffix(familySuffix)
              .workerType(workerType)
              .userDateOfBirth(userDateOfBirth)
              .phone(phone)
              .cellPhone(cellPhone)
              .position(position)
              .departmentID(departmentID)
              .locationId(locationId)
              .locationName(locationName)
              .userStartDate(userStartDate)
              .reportsToEmail(reportsToEmail)
              .addressList(addressList)
              .educationList(educationList)
              .contactList(contactList)
              .financialList(financialList)
              .customFieldValues(customFieldValues)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#createOrUpdateUserDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .createOrUpdateUserDetails()
              .firstName(firstName)
              .email(email)
              .lastName(lastName)
              .empId(empId)
              .gender(gender)
              .guid(guid)
              .status(status)
              .displayFullName(displayFullName)
              .middleName(middleName)
              .secondLastName(secondLastName)
              .shortName(shortName)
              .namePronunciation(namePronunciation)
              .familySuffix(familySuffix)
              .workerType(workerType)
              .userDateOfBirth(userDateOfBirth)
              .phone(phone)
              .cellPhone(cellPhone)
              .position(position)
              .departmentID(departmentID)
              .locationId(locationId)
              .locationName(locationName)
              .userStartDate(userStartDate)
              .reportsToEmail(reportsToEmail)
              .addressList(addressList)
              .educationList(educationList)
              .contactList(contactList)
              .financialList(financialList)
              .customFieldValues(customFieldValues)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#createOrUpdateUserDetails");
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
| **peopleAndPermissionsCreateOrUpdateUserDetailsRequest** | [**PeopleAndPermissionsCreateOrUpdateUserDetailsRequest**](PeopleAndPermissionsCreateOrUpdateUserDetailsRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |
| **201** | 201 |  -  |

<a name="createUser"></a>
# **createUser**
> Object createUser(firstName, email).execute();

Create user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String firstName = "firstName_example"; // First name of user.
    String email = "email_example"; // Mail ID of user.
    try {
      Object result = client
              .peopleAndPermissions
              .createUser(firstName, email)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#createUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .createUser(firstName, email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#createUser");
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
| **firstName** | **String**| First name of user. | |
| **email** | **String**| Mail ID of user. | |

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
| **200** | 200 |  -  |

<a name="createUserCompensation"></a>
# **createUserCompensation**
> Object createUserCompensation(value, compensationType, currencyCode, period, effectivedate, status).enddate(enddate).notes(notes).execute();

Create compensation for user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String value = "value_example"; // Value of compensation
    String compensationType = "sal"; // Type of compensation.   sal - Salary, pay - , INCTV - Incentive, SVCR - Severance
    String currencyCode = "currencyCode_example";
    String period = "HRLY"; // Time period for compensation.   HRLY - Hourly, DLY - Daily, WKLY - Weekly,  BWKLY - Bi-Weekly, MTHLY - Monthly, BMTH - Bi-Monthly, QTRLY - Quarterly, BYRLY - Bi-Yearly, YRLY - Yearly,   ONEF - OneOff
    String effectivedate = "effectivedate_example";
    String status = "ACTV"; // Status of compensation.   ACTV - Active, ARCHV - Archive, PVNL - Provisional
    String enddate = "enddate_example";
    String notes = "notes_example";
    try {
      Object result = client
              .peopleAndPermissions
              .createUserCompensation(value, compensationType, currencyCode, period, effectivedate, status)
              .enddate(enddate)
              .notes(notes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#createUserCompensation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .createUserCompensation(value, compensationType, currencyCode, period, effectivedate, status)
              .enddate(enddate)
              .notes(notes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#createUserCompensation");
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
| **value** | **String**| Value of compensation | |
| **compensationType** | **String**| Type of compensation.   sal - Salary, pay - , INCTV - Incentive, SVCR - Severance | [enum: sal, pay, bonus, INCTV, SVRC, other] |
| **currencyCode** | **String**|  | |
| **period** | **String**| Time period for compensation.   HRLY - Hourly, DLY - Daily, WKLY - Weekly,  BWKLY - Bi-Weekly, MTHLY - Monthly, BMTH - Bi-Monthly, QTRLY - Quarterly, BYRLY - Bi-Yearly, YRLY - Yearly,   ONEF - OneOff | [enum: HRLY, DLY, WKLY, BWKLY, MTHLY, BMTH, QTRLY, BYRLY, YRLY, ONEF] |
| **effectivedate** | **String**|  | |
| **status** | **String**| Status of compensation.   ACTV - Active, ARCHV - Archive, PVNL - Provisional | [enum: ACTV, ARCHV, PVNL] |
| **enddate** | **String**|  | [optional] |
| **notes** | **String**|  | [optional] |

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
| **201** | 201 |  -  |

<a name="deleteUserAddress"></a>
# **deleteUserAddress**
> PeopleAndPermissionsDeleteUserAddressResponse deleteUserAddress(addressId).execute();

Delete User Address



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String addressId = "addressId_example"; // The unique ID of the address.
    try {
      PeopleAndPermissionsDeleteUserAddressResponse result = client
              .peopleAndPermissions
              .deleteUserAddress(addressId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#deleteUserAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleAndPermissionsDeleteUserAddressResponse> response = client
              .peopleAndPermissions
              .deleteUserAddress(addressId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#deleteUserAddress");
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
| **addressId** | **String**| The unique ID of the address. | |

### Return type

[**PeopleAndPermissionsDeleteUserAddressResponse**](PeopleAndPermissionsDeleteUserAddressResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="deleteUserEducation"></a>
# **deleteUserEducation**
> Object deleteUserEducation(educationId).execute();

Delete User Education



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String educationId = "educationId_example"; // Education ID the user
    try {
      Object result = client
              .peopleAndPermissions
              .deleteUserEducation(educationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#deleteUserEducation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .deleteUserEducation(educationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#deleteUserEducation");
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
| **educationId** | **String**| Education ID the user | |

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
| **201** | 201 |  -  |

<a name="deleteUserEmployment"></a>
# **deleteUserEmployment**
> PeopleAndPermissionsDeleteUserEmploymentResponse deleteUserEmployment(empid).execute();

Deletes User Employment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    Integer empid = 56; // The unique identity of the employee. 
    try {
      PeopleAndPermissionsDeleteUserEmploymentResponse result = client
              .peopleAndPermissions
              .deleteUserEmployment(empid)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#deleteUserEmployment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleAndPermissionsDeleteUserEmploymentResponse> response = client
              .peopleAndPermissions
              .deleteUserEmployment(empid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#deleteUserEmployment");
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
| **empid** | **Integer**| The unique identity of the employee.  | |

### Return type

[**PeopleAndPermissionsDeleteUserEmploymentResponse**](PeopleAndPermissionsDeleteUserEmploymentResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="getAllUsersDetails"></a>
# **getAllUsersDetails**
> List&lt;PeopleAndPermissionsGetAllUsersDetailsResponseInner&gt; getAllUsersDetails().name(name).page(page).pageSize(pageSize).search(search).startDateBefore(startDateBefore).startDateAfter(startDateAfter).endDateBefore(endDateBefore).endDateAfter(endDateAfter).status(status).execute();

Retrieve all users details



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String name = "name_example"; // Name of the user.
    Integer page = 1; // Page number.
    Integer pageSize = 20; // Number of users per page.
    String search = "search_example";
    LocalDate startDateBefore = LocalDate.now(); // The date before the assigned Start Date.
    LocalDate startDateAfter = LocalDate.now(); // The date after the assigned Start Date.
    LocalDate endDateBefore = LocalDate.now(); // The date before the assigned End Date.
    LocalDate endDateAfter = LocalDate.now(); // The date after the assigned End Date.
    String status = "A"; // Status of the user.    A- Active User   I- Inactive User   F- Future Joiner 
    try {
      List<PeopleAndPermissionsGetAllUsersDetailsResponseInner> result = client
              .peopleAndPermissions
              .getAllUsersDetails()
              .name(name)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .startDateBefore(startDateBefore)
              .startDateAfter(startDateAfter)
              .endDateBefore(endDateBefore)
              .endDateAfter(endDateAfter)
              .status(status)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getAllUsersDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PeopleAndPermissionsGetAllUsersDetailsResponseInner>> response = client
              .peopleAndPermissions
              .getAllUsersDetails()
              .name(name)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .startDateBefore(startDateBefore)
              .startDateAfter(startDateAfter)
              .endDateBefore(endDateBefore)
              .endDateAfter(endDateAfter)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getAllUsersDetails");
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
| **name** | **String**| Name of the user. | [optional] |
| **page** | **Integer**| Page number. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of users per page. | [optional] [default to 20] |
| **search** | **String**|  | [optional] |
| **startDateBefore** | **LocalDate**| The date before the assigned Start Date. | [optional] |
| **startDateAfter** | **LocalDate**| The date after the assigned Start Date. | [optional] |
| **endDateBefore** | **LocalDate**| The date before the assigned End Date. | [optional] |
| **endDateAfter** | **LocalDate**| The date after the assigned End Date. | [optional] |
| **status** | **String**| Status of the user.    A- Active User   I- Inactive User   F- Future Joiner  | [optional] [default to A] [enum: A, I, F] |

### Return type

[**List&lt;PeopleAndPermissionsGetAllUsersDetailsResponseInner&gt;**](PeopleAndPermissionsGetAllUsersDetailsResponseInner.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |
| **204** | 204 |  -  |

<a name="getBasicUserDetails"></a>
# **getBasicUserDetails**
> List&lt;PeopleAndPermissionsGetBasicUserDetailsResponseInner&gt; getBasicUserDetails().name(name).page(page).pageSize(pageSize).search(search).startDateBefore(startDateBefore).startDateAfter(startDateAfter).endDateBefore(endDateBefore).endDateAfter(endDateAfter).status(status).execute();

Retrieve basic user details



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String name = "name_example"; // Name of the user.
    Integer page = 1; // Page number.
    Integer pageSize = 20; // Number of users per page.
    String search = "search_example";
    LocalDate startDateBefore = LocalDate.now(); // The date before the assigned Start Date.
    LocalDate startDateAfter = LocalDate.now(); // The date after the assigned Start Date.
    LocalDate endDateBefore = LocalDate.now(); // The date before the assigned End Date.
    LocalDate endDateAfter = LocalDate.now(); // The date after the assigned End Date.
    String status = "A"; // Status of the user.    A- Active User   I- Inactive User   F- Future Joiner 
    try {
      List<PeopleAndPermissionsGetBasicUserDetailsResponseInner> result = client
              .peopleAndPermissions
              .getBasicUserDetails()
              .name(name)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .startDateBefore(startDateBefore)
              .startDateAfter(startDateAfter)
              .endDateBefore(endDateBefore)
              .endDateAfter(endDateAfter)
              .status(status)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getBasicUserDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PeopleAndPermissionsGetBasicUserDetailsResponseInner>> response = client
              .peopleAndPermissions
              .getBasicUserDetails()
              .name(name)
              .page(page)
              .pageSize(pageSize)
              .search(search)
              .startDateBefore(startDateBefore)
              .startDateAfter(startDateAfter)
              .endDateBefore(endDateBefore)
              .endDateAfter(endDateAfter)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getBasicUserDetails");
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
| **name** | **String**| Name of the user. | [optional] |
| **page** | **Integer**| Page number. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of users per page. | [optional] [default to 20] |
| **search** | **String**|  | [optional] |
| **startDateBefore** | **LocalDate**| The date before the assigned Start Date. | [optional] |
| **startDateAfter** | **LocalDate**| The date after the assigned Start Date. | [optional] |
| **endDateBefore** | **LocalDate**| The date before the assigned End Date. | [optional] |
| **endDateAfter** | **LocalDate**| The date after the assigned End Date. | [optional] |
| **status** | **String**| Status of the user.    A- Active User   I- Inactive User   F- Future Joiner  | [optional] [default to A] [enum: A, I, F] |

### Return type

[**List&lt;PeopleAndPermissionsGetBasicUserDetailsResponseInner&gt;**](PeopleAndPermissionsGetBasicUserDetailsResponseInner.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |
| **204** | 204 |  -  |

<a name="getFinancialRecord"></a>
# **getFinancialRecord**
> Object getFinancialRecord().email(email).execute();

Retrieve user financial record



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String email = "email_example"; // Email address of the user.
    try {
      Object result = client
              .peopleAndPermissions
              .getFinancialRecord()
              .email(email)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getFinancialRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .getFinancialRecord()
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getFinancialRecord");
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
| **email** | **String**| Email address of the user. | [optional] |

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
| **200** | 200 |  -  |

<a name="getFinancialStatus"></a>
# **getFinancialStatus**
> Object getFinancialStatus().execute();

Retrieve user financial status



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
              .peopleAndPermissions
              .getFinancialStatus()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getFinancialStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .getFinancialStatus()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getFinancialStatus");
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
| **200** | 200 |  -  |

<a name="getUserBasicInformation"></a>
# **getUserBasicInformation**
> Object getUserBasicInformation().email(email).execute();

Retrieve user basic information



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String email = "email_example"; // Email of user
    try {
      Object result = client
              .peopleAndPermissions
              .getUserBasicInformation()
              .email(email)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getUserBasicInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .getUserBasicInformation()
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getUserBasicInformation");
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
| **email** | **String**| Email of user | [optional] |

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
| **200** | 200 |  -  |

<a name="getUserDetails"></a>
# **getUserDetails**
> Object getUserDetails().execute();

Retrieve user details



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
              .peopleAndPermissions
              .getUserDetails()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getUserDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .getUserDetails()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getUserDetails");
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
| **200** | 200 |  -  |

<a name="getUserList"></a>
# **getUserList**
> Object getUserList().name(name).execute();

Retrieve a user or list of users



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String name = "name_example";
    try {
      Object result = client
              .peopleAndPermissions
              .getUserList()
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getUserList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .getUserList()
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getUserList");
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
| **name** | **String**|  | [optional] |

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
| **200** | 200 |  -  |

<a name="getUserPermissionsAndMenuConfigurations"></a>
# **getUserPermissionsAndMenuConfigurations**
> Object getUserPermissionsAndMenuConfigurations().execute();

Retrieve user permissions and menu configurations



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
              .peopleAndPermissions
              .getUserPermissionsAndMenuConfigurations()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getUserPermissionsAndMenuConfigurations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .getUserPermissionsAndMenuConfigurations()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getUserPermissionsAndMenuConfigurations");
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
| **200** | 200 |  -  |

<a name="getUsers"></a>
# **getUsers**
> PeopleAndPermissionsGetUsersResponse getUsers().name(name).page(page).pageSize(pageSize).sortBy(sortBy).sortOrder(sortOrder).status(status).execute();

Retrieve users



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String name = "name_example"; // Name of the user.
    Integer page = 1; // Page number.
    Integer pageSize = 20; // Number of users per page.
    String sortBy = "sortBy_example";
    String sortOrder = "asc"; // Order to sort the users.   asc- Ascending Order   desc- Descending Order 
    String status = "A"; // Status of the user.    A- Active User   I- Inactive User   F- Future Joiner 
    try {
      PeopleAndPermissionsGetUsersResponse result = client
              .peopleAndPermissions
              .getUsers()
              .name(name)
              .page(page)
              .pageSize(pageSize)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getCode());
      System.out.println(result.getData());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleAndPermissionsGetUsersResponse> response = client
              .peopleAndPermissions
              .getUsers()
              .name(name)
              .page(page)
              .pageSize(pageSize)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#getUsers");
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
| **name** | **String**| Name of the user. | [optional] |
| **page** | **Integer**| Page number. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of users per page. | [optional] [default to 20] |
| **sortBy** | **String**|  | [optional] |
| **sortOrder** | **String**| Order to sort the users.   asc- Ascending Order   desc- Descending Order  | [optional] [default to asc] [enum: asc, desc] |
| **status** | **String**| Status of the user.    A- Active User   I- Inactive User   F- Future Joiner  | [optional] [default to A] [enum: A, I, F] |

### Return type

[**PeopleAndPermissionsGetUsersResponse**](PeopleAndPermissionsGetUsersResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="saveCustomFieldValues"></a>
# **saveCustomFieldValues**
> PeopleAndPermissionsSaveCustomFieldValuesResponse saveCustomFieldValues().empId(empId).guid(guid).email(email).requestBody(requestBody).execute();

Save Custom Field values

Save Custom Field values

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String empId = "empId_example"; // The unique identity of the employee.
    String guid = "guid_example"; // The unique system generated ID of the user.
    String email = "email_example"; // Email address of the user.
    try {
      PeopleAndPermissionsSaveCustomFieldValuesResponse result = client
              .peopleAndPermissions
              .saveCustomFieldValues()
              .empId(empId)
              .guid(guid)
              .email(email)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#saveCustomFieldValues");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleAndPermissionsSaveCustomFieldValuesResponse> response = client
              .peopleAndPermissions
              .saveCustomFieldValues()
              .empId(empId)
              .guid(guid)
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#saveCustomFieldValues");
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
| **empId** | **String**| The unique identity of the employee. | [optional] |
| **guid** | **String**| The unique system generated ID of the user. | [optional] |
| **email** | **String**| Email address of the user. | [optional] |
| **requestBody** | [**List&lt;Object&gt;**](Object.md)| Custom fields | [optional] |

### Return type

[**PeopleAndPermissionsSaveCustomFieldValuesResponse**](PeopleAndPermissionsSaveCustomFieldValuesResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |
| **201** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="saveUserAddress"></a>
# **saveUserAddress**
> PeopleAndPermissionsSaveUserAddressResponse saveUserAddress().empId(empId).email(email).peopleAndPermissionsSaveUserAddressRequest(peopleAndPermissionsSaveUserAddressRequest).execute();

Save User Address



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    List<PeopleAndPermissionsSaveUserAddressRequestRAWBODYInner> RAW_BODY = Arrays.asList();
    String empId = "empId_example"; // The unique identity of the employee. 
    String email = "email_example"; // Email address of the user.
    try {
      PeopleAndPermissionsSaveUserAddressResponse result = client
              .peopleAndPermissions
              .saveUserAddress()
              .RAW_BODY(RAW_BODY)
              .empId(empId)
              .email(email)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#saveUserAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleAndPermissionsSaveUserAddressResponse> response = client
              .peopleAndPermissions
              .saveUserAddress()
              .RAW_BODY(RAW_BODY)
              .empId(empId)
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#saveUserAddress");
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
| **empId** | **String**| The unique identity of the employee.  | [optional] |
| **email** | **String**| Email address of the user. | [optional] |
| **peopleAndPermissionsSaveUserAddressRequest** | [**PeopleAndPermissionsSaveUserAddressRequest**](PeopleAndPermissionsSaveUserAddressRequest.md)|  | [optional] |

### Return type

[**PeopleAndPermissionsSaveUserAddressResponse**](PeopleAndPermissionsSaveUserAddressResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="saveUserEducation"></a>
# **saveUserEducation**
> Object saveUserEducation().empId(empId).email(email).peopleAndPermissionsSaveUserEducationRequest(peopleAndPermissionsSaveUserEducationRequest).execute();

Save User Education



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    List<PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner> RAW_BODY = Arrays.asList();
    String empId = "empId_example"; // The unique identity of the employee. 
    String email = "email_example"; // Email address of the user.
    try {
      Object result = client
              .peopleAndPermissions
              .saveUserEducation()
              .RAW_BODY(RAW_BODY)
              .empId(empId)
              .email(email)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#saveUserEducation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .saveUserEducation()
              .RAW_BODY(RAW_BODY)
              .empId(empId)
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#saveUserEducation");
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
| **empId** | **String**| The unique identity of the employee.  | [optional] |
| **email** | **String**| Email address of the user. | [optional] |
| **peopleAndPermissionsSaveUserEducationRequest** | [**PeopleAndPermissionsSaveUserEducationRequest**](PeopleAndPermissionsSaveUserEducationRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="saveUserEmployment"></a>
# **saveUserEmployment**
> Object saveUserEmployment().empId(empId).email(email).peopleAndPermissionsSaveUserEmploymentRequest(peopleAndPermissionsSaveUserEmploymentRequest).execute();

Save User Employment



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    List<PeopleAndPermissionsSaveUserEmploymentRequestRAWBODYInner> RAW_BODY = Arrays.asList();
    String empId = "empId_example"; // The unique identity of the employee. 
    String email = "email_example"; // Email address of the user.
    try {
      Object result = client
              .peopleAndPermissions
              .saveUserEmployment()
              .RAW_BODY(RAW_BODY)
              .empId(empId)
              .email(email)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#saveUserEmployment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .saveUserEmployment()
              .RAW_BODY(RAW_BODY)
              .empId(empId)
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#saveUserEmployment");
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
| **empId** | **String**| The unique identity of the employee.  | [optional] |
| **email** | **String**| Email address of the user. | [optional] |
| **peopleAndPermissionsSaveUserEmploymentRequest** | [**PeopleAndPermissionsSaveUserEmploymentRequest**](PeopleAndPermissionsSaveUserEmploymentRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

<a name="updateFinancialRecord"></a>
# **updateFinancialRecord**
> Object updateFinancialRecord(guid, value, compensationType, currencyCode, period, status).effectivedate(effectivedate).enddate(enddate).notes(notes).execute();

Update financial record of User



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String guid = "guid_example";
    String value = "value_example";
    String compensationType = "sal"; // Type of compensation.   sal - Salary, pay - , INCTV - Incentive, SVCR - Severance
    String currencyCode = "currencyCode_example";
    String period = "HRLY"; // Time period for compensation.   HRLY - Hourly, DLY - Daily, WKLY - Weekly,  BWKLY - Bi-Weekly, MTHLY - Monthly, BMTH - Bi-Monthly, QTRLY - Quarterly, BYRLY - Bi-Yearly, YRLY - Yearly,   ONEF - OneOff
    String status = "ACTV"; // Status of compensation.   ACTV - Active, ARCHV - Archive, PVNL - Provisional
    LocalDate effectivedate = LocalDate.now();
    LocalDate enddate = LocalDate.now();
    String notes = "notes_example";
    try {
      Object result = client
              .peopleAndPermissions
              .updateFinancialRecord(guid, value, compensationType, currencyCode, period, status)
              .effectivedate(effectivedate)
              .enddate(enddate)
              .notes(notes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#updateFinancialRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .updateFinancialRecord(guid, value, compensationType, currencyCode, period, status)
              .effectivedate(effectivedate)
              .enddate(enddate)
              .notes(notes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#updateFinancialRecord");
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
| **guid** | **String**|  | |
| **value** | **String**|  | |
| **compensationType** | **String**| Type of compensation.   sal - Salary, pay - , INCTV - Incentive, SVCR - Severance | [default to sal] [enum: sal, pay, bonus, INCTV, SVRC, other] |
| **currencyCode** | **String**|  | |
| **period** | **String**| Time period for compensation.   HRLY - Hourly, DLY - Daily, WKLY - Weekly,  BWKLY - Bi-Weekly, MTHLY - Monthly, BMTH - Bi-Monthly, QTRLY - Quarterly, BYRLY - Bi-Yearly, YRLY - Yearly,   ONEF - OneOff | [default to HRLY] [enum: HRLY, DLY, WKLY, BWKLY, MTHLY, BMTH, QTRLY, BYRLY, YRLY, ONEF] |
| **status** | **String**| Status of compensation.   ACTV - Active, ARCHV - Archive, PVNL - Provisional | [default to ACTV] [enum: ACTV, ARCHV, PVNL] |
| **effectivedate** | **LocalDate**|  | [optional] |
| **enddate** | **LocalDate**|  | [optional] |
| **notes** | **String**|  | [optional] |

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
| **201** | 201 |  -  |

<a name="updateUser"></a>
# **updateUser**
> Object updateUser().guid(guid).email(email).empId(empId).firstName(firstName).middleName(middleName).lastName(lastName).secondLastName(secondLastName).displayFullName(displayFullName).cellPhone(cellPhone).phone(phone).familySuffix(familySuffix).userDateOfBirth(userDateOfBirth).jobGrade(jobGrade).userStartDate(userStartDate).userEndDate(userEndDate).gender(gender).position(position).profileId(profileId).shortName(shortName).status(status).locationName(locationName).locationId(locationId).notes(notes).execute();

Update user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    String email = "email_example"; // Email address of the user.
    String empId = "empId_example"; // Employee ID of the user.   To update the employee ID, you need admin access.
    String firstName = "firstName_example"; // First name of the user.
    String middleName = "middleName_example"; // Last name of the user.
    String lastName = "lastName_example"; // Last name of the user.
    String secondLastName = "secondLastName_example"; // Second last name of the user.
    String displayFullName = "displayFullName_example"; // Display name of the user.
    String cellPhone = "cellPhone_example"; // Cell phone of the user.
    String phone = "phone_example"; // Phone number of the user.
    String familySuffix = "familySuffix_example"; // Family suffix of the user.
    LocalDate userDateOfBirth = LocalDate.now(); // Date of birth of the user.
    String jobGrade = "jobGrade_example"; // Job grade of the user.
    LocalDate userStartDate = LocalDate.now(); // Starting date of the user.
    LocalDate userEndDate = LocalDate.now(); // End date of the user.
    String gender = "gender_example"; // Gender of the user.
    String position = "position_example"; // Position of the user.
    String profileId = "profileId_example"; // Profile ID of the user.
    String shortName = "shortName_example"; // Short name of the user.
    String status = "A"; // Status of the user.
    String locationName = "locationName_example"; // Location of the user.
    String locationId = "locationId_example"; // Location ID of user location.
    String notes = "notes_example"; // 
    try {
      Object result = client
              .peopleAndPermissions
              .updateUser()
              .guid(guid)
              .email(email)
              .empId(empId)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .secondLastName(secondLastName)
              .displayFullName(displayFullName)
              .cellPhone(cellPhone)
              .phone(phone)
              .familySuffix(familySuffix)
              .userDateOfBirth(userDateOfBirth)
              .jobGrade(jobGrade)
              .userStartDate(userStartDate)
              .userEndDate(userEndDate)
              .gender(gender)
              .position(position)
              .profileId(profileId)
              .shortName(shortName)
              .status(status)
              .locationName(locationName)
              .locationId(locationId)
              .notes(notes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#updateUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .peopleAndPermissions
              .updateUser()
              .guid(guid)
              .email(email)
              .empId(empId)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .secondLastName(secondLastName)
              .displayFullName(displayFullName)
              .cellPhone(cellPhone)
              .phone(phone)
              .familySuffix(familySuffix)
              .userDateOfBirth(userDateOfBirth)
              .jobGrade(jobGrade)
              .userStartDate(userStartDate)
              .userEndDate(userEndDate)
              .gender(gender)
              .position(position)
              .profileId(profileId)
              .shortName(shortName)
              .status(status)
              .locationName(locationName)
              .locationId(locationId)
              .notes(notes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#updateUser");
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
| **email** | **String**| Email address of the user. | [optional] |
| **empId** | **String**| Employee ID of the user.   To update the employee ID, you need admin access. | [optional] |
| **firstName** | **String**| First name of the user. | [optional] |
| **middleName** | **String**| Last name of the user. | [optional] |
| **lastName** | **String**| Last name of the user. | [optional] |
| **secondLastName** | **String**| Second last name of the user. | [optional] |
| **displayFullName** | **String**| Display name of the user. | [optional] |
| **cellPhone** | **String**| Cell phone of the user. | [optional] |
| **phone** | **String**| Phone number of the user. | [optional] |
| **familySuffix** | **String**| Family suffix of the user. | [optional] |
| **userDateOfBirth** | **LocalDate**| Date of birth of the user. | [optional] |
| **jobGrade** | **String**| Job grade of the user. | [optional] |
| **userStartDate** | **LocalDate**| Starting date of the user. | [optional] |
| **userEndDate** | **LocalDate**| End date of the user. | [optional] |
| **gender** | **String**| Gender of the user. | [optional] |
| **position** | **String**| Position of the user. | [optional] |
| **profileId** | **String**| Profile ID of the user. | [optional] |
| **shortName** | **String**| Short name of the user. | [optional] |
| **status** | **String**| Status of the user. | [optional] [enum: A, I, F] |
| **locationName** | **String**| Location of the user. | [optional] |
| **locationId** | **String**| Location ID of user location. | [optional] |
| **notes** | **String**|  | [optional] |

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
| **200** | 200 |  -  |

<a name="uploadUserProfilePicture"></a>
# **uploadUserProfilePicture**
> PeopleAndPermissionsUploadUserProfilePictureResponse uploadUserProfilePicture(_file, userid).peopleAndPermissionsUploadUserProfilePictureRequest(peopleAndPermissionsUploadUserProfilePictureRequest).execute();

Upload user profile

 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ClayHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
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
    File _file = new File("/path/to/file"); // Upload the profile picture here.
    String userid = "userid_example"; // The ID of the user whose profile picture has to be updated.
    try {
      PeopleAndPermissionsUploadUserProfilePictureResponse result = client
              .peopleAndPermissions
              .uploadUserProfilePicture(_file, userid)
              .execute();
      System.out.println(result);
      System.out.println(result.getImageName());
      System.out.println(result.getData());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#uploadUserProfilePicture");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleAndPermissionsUploadUserProfilePictureResponse> response = client
              .peopleAndPermissions
              .uploadUserProfilePicture(_file, userid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleAndPermissionsApi#uploadUserProfilePicture");
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
| **_file** | **File**| Upload the profile picture here. | |
| **userid** | **String**| The ID of the user whose profile picture has to be updated. | |
| **peopleAndPermissionsUploadUserProfilePictureRequest** | [**PeopleAndPermissionsUploadUserProfilePictureRequest**](PeopleAndPermissionsUploadUserProfilePictureRequest.md)|  | [optional] |

### Return type

[**PeopleAndPermissionsUploadUserProfilePictureResponse**](PeopleAndPermissionsUploadUserProfilePictureResponse.md)

### Authorization

[sec0](../README.md#sec0), [sec1](../README.md#sec1)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 |  -  |

