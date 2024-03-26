<div align="center">

[![Visit Clayhr](./header.png)](https://clayhr.com)

# [Clayhr](https://clayhr.com)

API Documentation

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=ClayHR&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>clay-hr-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:clay-hr-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/clay-hr-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://acmecompany.bizmerlin.net/rm/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnnouncementApi* | [**createNewAnnouncement**](docs/AnnouncementApi.md#createNewAnnouncement) | **POST** /api/announcement/create | Create Announcement
*AnnouncementApi* | [**getAttachmentsById**](docs/AnnouncementApi.md#getAttachmentsById) | **GET** /api/attachment/list/{annId} | Retrieve Announcement Attachments
*AnnouncementApi* | [**getById**](docs/AnnouncementApi.md#getById) | **GET** /api/announcement/{annId} | Retrieve Announcement
*AnnouncementApi* | [**updateAnnouncement**](docs/AnnouncementApi.md#updateAnnouncement) | **PUT** /api/announcement/edit | Update Announcement
*AuthenticationApi* | [**getAccessToken**](docs/AuthenticationApi.md#getAccessToken) | **GET** /api/token | Get Access Token for Authentication
*CandidatesApi* | [**extractPdfResume**](docs/CandidatesApi.md#extractPdfResume) | **POST** /resume | Create a candidate from pdf resume
*CandidatesApi* | [**get**](docs/CandidatesApi.md#get) | **GET** / | Retrieve candidates
*CandidatesApi* | [**getBasicDetails**](docs/CandidatesApi.md#getBasicDetails) | **GET** /list | Retrieve candidates with basic details
*CandidatesApi* | [**getCandidateDetailByRecruitid**](docs/CandidatesApi.md#getCandidateDetailByRecruitid) | **GET** /detail/{recruitid} | Retrieve the candidate detail by recruitid
*CandidatesApi* | [**submitNewCandidate**](docs/CandidatesApi.md#submitNewCandidate) | **POST** / | Create new candidate
*CustomFieldsApi* | [**getById**](docs/CustomFieldsApi.md#getById) | **GET** /customfield | Retrieve Custom Field by ID
*CustomFieldsApi* | [**getCustomFields**](docs/CustomFieldsApi.md#getCustomFields) | **GET** /customfields | Retrieve Custom Fields
*CustomFieldsApi* | [**getCustomLists**](docs/CustomFieldsApi.md#getCustomLists) | **GET** /customlist | Retrieve Custom Lists
*CustomFieldsApi* | [**getValue**](docs/CustomFieldsApi.md#getValue) | **GET** /customfieldvalues | Retrieve Custom Field Value
*CustomFieldsApi* | [**updateValue**](docs/CustomFieldsApi.md#updateValue) | **POST** /customfieldvalues | Update Custom Field Value
*DependentsApi* | [**deleteByContactId**](docs/DependentsApi.md#deleteByContactId) | **POST** /delete | Delete dependent by contactId
*DocumentLibraryApi* | [**getAttachments**](docs/DocumentLibraryApi.md#getAttachments) | **GET** /documentLibrary | Retrieve attachments within document library
*DocumentLibraryApi* | [**getDocumentAsByteArray**](docs/DocumentLibraryApi.md#getDocumentAsByteArray) | **GET** /attachment/download | Retrieve document as byte array
*ExpenseReportsApi* | [**createNew**](docs/ExpenseReportsApi.md#createNew) | **POST** /expensereport | Create expense report
*ExpenseReportsApi* | [**createNewExpenseItem**](docs/ExpenseReportsApi.md#createNewExpenseItem) | **POST** /expenseitem | Create expense item
*ExpenseReportsApi* | [**deleteExpenseReport**](docs/ExpenseReportsApi.md#deleteExpenseReport) | **POST** /expensereport/delete | Delete expense report
*ExpenseReportsApi* | [**getByUserId**](docs/ExpenseReportsApi.md#getByUserId) | **GET** /expensereports | Retrieve expense reports by User ID
*ExpenseReportsApi* | [**getCurrencies**](docs/ExpenseReportsApi.md#getCurrencies) | **GET** /currencylist | Retrieve currencies
*ExpenseReportsApi* | [**getExpenseTypes**](docs/ExpenseReportsApi.md#getExpenseTypes) | **GET** /expensetypes | Retrieve expense types
*ExpenseReportsApi* | [**getReportDetails**](docs/ExpenseReportsApi.md#getReportDetails) | **GET** /expensereport | Retrieve the details of expense report
*ExpenseReportsApi* | [**submitExpenseReport**](docs/ExpenseReportsApi.md#submitExpenseReport) | **POST** /expensereport/submit/{expenseReportId} | Submit expense report
*FeedbackApi* | [**listFeedback**](docs/FeedbackApi.md#listFeedback) | **GET** /rm/api/feedback | Retrieve feedback
*FormsApi* | [**getAssignedForms**](docs/FormsApi.md#getAssignedForms) | **GET** /api/my | Retrieve completed forms assigned to me  
*FormsApi* | [**getDetails**](docs/FormsApi.md#getDetails) | **GET** /api/view | Retrieve form details
*FormsApi* | [**getDynaForm**](docs/FormsApi.md#getDynaForm) | **GET** /api/getdynaforms | Retrieve forms
*FormsApi* | [**getFormResponse**](docs/FormsApi.md#getFormResponse) | **GET** /api/response/{dynamicFormId} | Retrieve form response 
*FormsApi* | [**getFormResponses**](docs/FormsApi.md#getFormResponses) | **GET** /api/responselist | Retrieve form responses
*FormsApi* | [**saveFormResponse**](docs/FormsApi.md#saveFormResponse) | **POST** /api/saveFormResponse | Save form repsonse 
*FormsApi* | [**submitItemResponse**](docs/FormsApi.md#submitItemResponse) | **POST** /api/saveItemResponse | Save item response
*GoalsApi* | [**createNewGoal**](docs/GoalsApi.md#createNewGoal) | **POST** /goal | Create new goal
*GoalsApi* | [**deleteGoal**](docs/GoalsApi.md#deleteGoal) | **DELETE** /deletegoal | Delete Goal
*GoalsApi* | [**getAllGoals**](docs/GoalsApi.md#getAllGoals) | **GET** /goal | Retrieve all goals
*GoalsApi* | [**getGoal**](docs/GoalsApi.md#getGoal) | **GET** /getgoal | Retrieve Goal
*GoalsApi* | [**getUserGoals**](docs/GoalsApi.md#getUserGoals) | **GET** /goal/list | Retrieve goals of user
*InvoiceApi* | [**getByProjectId**](docs/InvoiceApi.md#getByProjectId) | **GET** /invoice | Retrieve invoices by Project Id
*JobProfilesApi* | [**getJobProfiles**](docs/JobProfilesApi.md#getJobProfiles) | **GET** /api/jobprofiles | Retrieve job profiles
*LeavesApi* | [**addPtoBalance**](docs/LeavesApi.md#addPtoBalance) | **POST** /api/userpto/balance/add | Add PTO balance.
*LeavesApi* | [**createNewLeave**](docs/LeavesApi.md#createNewLeave) | **POST** /api/leaverequest | Create a new leave.
*LeavesApi* | [**getLeaveRequestsWithinDateRange**](docs/LeavesApi.md#getLeaveRequestsWithinDateRange) | **GET** /api/leaverequests | Retrieve leave requests within a date range
*LeavesApi* | [**getLeavesBasedOnRole**](docs/LeavesApi.md#getLeavesBasedOnRole) | **GET** /api/manage/leaves | Retrieve leaves for approval/rejection by filtering on basis of Role
*LeavesApi* | [**getRemainingHoursCredit**](docs/LeavesApi.md#getRemainingHoursCredit) | **GET** /api/leave/hours/credit | Retrieve remaining hours credit for leave policy
*LeavesApi* | [**processLeaveById**](docs/LeavesApi.md#processLeaveById) | **GET** /api/process/leave | Process the leave of a user by leave Id
*ObjectiveApi* | [**getByUserIdOrSpecificObjectiveById**](docs/ObjectiveApi.md#getByUserIdOrSpecificObjectiveById) | **GET** /objective | Retrieve objectives
*OrgUnitsApi* | [**createNewOrgUnit**](docs/OrgUnitsApi.md#createNewOrgUnit) | **POST** /api/orgunits/add | Create new org unit
*OrgUnitsApi* | [**getOrgUnits**](docs/OrgUnitsApi.md#getOrgUnits) | **GET** /api/orgunits | Retrieve org units
*OrgRelationApi* | [**getAllActive**](docs/OrgRelationApi.md#getAllActive) | **GET** /api/orgrelation/allactive | Retrieve all active OrgRelations
*OrgRelationApi* | [**getOrgRelationsByUser**](docs/OrgRelationApi.md#getOrgRelationsByUser) | **GET** /api/orgrelation/orgRelationsByUser | Retrieve all the OrgRelations for the given user.
*OrgRelationApi* | [**saveUser**](docs/OrgRelationApi.md#saveUser) | **GET** /api/orgrelation/save | Saves the OrgRelation for the User
*PayStubsApi* | [**getDetails**](docs/PayStubsApi.md#getDetails) | **GET** /paystub | Retrieve my pay stubs
*PeopleAndPermissionsApi* | [**addReportsTo**](docs/PeopleAndPermissionsApi.md#addReportsTo) | **POST** /api/user/orgrelation/add | Add reports to
*PeopleAndPermissionsApi* | [**createOrUpdateUserDetails**](docs/PeopleAndPermissionsApi.md#createOrUpdateUserDetails) | **POST** /api/user/completeUserDetails | Create or Update user
*PeopleAndPermissionsApi* | [**createUser**](docs/PeopleAndPermissionsApi.md#createUser) | **POST** /api/user/add | Create user
*PeopleAndPermissionsApi* | [**createUserCompensation**](docs/PeopleAndPermissionsApi.md#createUserCompensation) | **POST** /api/user/compensation/add | Create compensation for user
*PeopleAndPermissionsApi* | [**deleteUserAddress**](docs/PeopleAndPermissionsApi.md#deleteUserAddress) | **POST** /api/user/address/delete | Delete User Address
*PeopleAndPermissionsApi* | [**deleteUserEducation**](docs/PeopleAndPermissionsApi.md#deleteUserEducation) | **POST** /user/education/delete | Delete User Education
*PeopleAndPermissionsApi* | [**deleteUserEmployment**](docs/PeopleAndPermissionsApi.md#deleteUserEmployment) | **POST** /api/user/employment/delete | Deletes User Employment
*PeopleAndPermissionsApi* | [**getAllUsersDetails**](docs/PeopleAndPermissionsApi.md#getAllUsersDetails) | **GET** /api/users | Retrieve all users details
*PeopleAndPermissionsApi* | [**getBasicUserDetails**](docs/PeopleAndPermissionsApi.md#getBasicUserDetails) | **GET** /api/users/basic | Retrieve basic user details
*PeopleAndPermissionsApi* | [**getFinancialRecord**](docs/PeopleAndPermissionsApi.md#getFinancialRecord) | **GET** /api/user/compensation | Retrieve user financial record
*PeopleAndPermissionsApi* | [**getFinancialStatus**](docs/PeopleAndPermissionsApi.md#getFinancialStatus) | **GET** /api/user/update/status | Retrieve user financial status
*PeopleAndPermissionsApi* | [**getUserBasicInformation**](docs/PeopleAndPermissionsApi.md#getUserBasicInformation) | **GET** /api/user/basic | Retrieve user basic information
*PeopleAndPermissionsApi* | [**getUserDetails**](docs/PeopleAndPermissionsApi.md#getUserDetails) | **GET** /api/user | Retrieve user details
*PeopleAndPermissionsApi* | [**getUserList**](docs/PeopleAndPermissionsApi.md#getUserList) | **GET** /api/user/list | Retrieve a user or list of users
*PeopleAndPermissionsApi* | [**getUserPermissionsAndMenuConfigurations**](docs/PeopleAndPermissionsApi.md#getUserPermissionsAndMenuConfigurations) | **GET** /api/user/permissions | Retrieve user permissions and menu configurations
*PeopleAndPermissionsApi* | [**getUsers**](docs/PeopleAndPermissionsApi.md#getUsers) | **GET** /resource | Retrieve users
*PeopleAndPermissionsApi* | [**saveCustomFieldValues**](docs/PeopleAndPermissionsApi.md#saveCustomFieldValues) | **POST** /api/user/saveCustomFieldValues | Save Custom Field values
*PeopleAndPermissionsApi* | [**saveUserAddress**](docs/PeopleAndPermissionsApi.md#saveUserAddress) | **POST** /api/address/save | Save User Address
*PeopleAndPermissionsApi* | [**saveUserEducation**](docs/PeopleAndPermissionsApi.md#saveUserEducation) | **POST** /api/education/save | Save User Education
*PeopleAndPermissionsApi* | [**saveUserEmployment**](docs/PeopleAndPermissionsApi.md#saveUserEmployment) | **POST** /api/employment/save | Save User Employment
*PeopleAndPermissionsApi* | [**updateFinancialRecord**](docs/PeopleAndPermissionsApi.md#updateFinancialRecord) | **POST** /api/user/compensation/update | Update financial record of User
*PeopleAndPermissionsApi* | [**updateUser**](docs/PeopleAndPermissionsApi.md#updateUser) | **POST** /api/user/update | Update user
*PeopleAndPermissionsApi* | [**uploadUserProfilePicture**](docs/PeopleAndPermissionsApi.md#uploadUserProfilePicture) | **POST** /api/user/uploadpicture | Upload user profile
*PerformanceReviewApi* | [**createPerformanceReview**](docs/PerformanceReviewApi.md#createPerformanceReview) | **POST** /appraisal/add | Create Performance Review
*PerformanceReviewApi* | [**getCompletedReviewsBasedOnUserId**](docs/PerformanceReviewApi.md#getCompletedReviewsBasedOnUserId) | **GET** /appraisal/getCompletedReviews | Retrieve Completed Performance Reviews
*PerformanceReviewApi* | [**getPerformanceReviews**](docs/PerformanceReviewApi.md#getPerformanceReviews) | **GET** /appraisal/user | Retrieve Performance Reviews
*PerformanceReviewApi* | [**getTemplates**](docs/PerformanceReviewApi.md#getTemplates) | **GET** /appraisal/template/list | Retrieve Performance Review Templates
*PerformanceReviewApi* | [**launchPerformanceReviewsInBulk**](docs/PerformanceReviewApi.md#launchPerformanceReviewsInBulk) | **POST** /appraisal/bulkLaunch | Launch Performance Reviews In Bulk
*PerformanceReviewAssignmentApi* | [**getAssignments**](docs/PerformanceReviewAssignmentApi.md#getAssignments) | **GET** /appraisal/assignment | Retrieve Performance Review Assignments
*PositionsApi* | [**createPosition**](docs/PositionsApi.md#createPosition) | **POST** /position/save | Save Position
*PositionsApi* | [**getPosition**](docs/PositionsApi.md#getPosition) | **GET** /position/view | Retrieve position
*PositionsApi* | [**getPositionsList**](docs/PositionsApi.md#getPositionsList) | **GET** /position/list | Retrieve positions
*ProjectApi* | [**assignUserAllocation**](docs/ProjectApi.md#assignUserAllocation) | **POST** /api/projects/allocation | Assign Project Allocation
*ProjectApi* | [**createNew**](docs/ProjectApi.md#createNew) | **POST** /api/projects | Create Project
*ProjectApi* | [**detailsById**](docs/ProjectApi.md#detailsById) | **GET** /api/projects/{projectId} | Retrieve Project
*ProjectApi* | [**listAllocations**](docs/ProjectApi.md#listAllocations) | **GET** /api/projects/allocation/{projectId} | List Allocations
*ProjectApi* | [**listProjects**](docs/ProjectApi.md#listProjects) | **GET** /api/projects | List Projects
*ReportsApi* | [**getContentByAnalyticId**](docs/ReportsApi.md#getContentByAnalyticId) | **GET** /api/report/content | Get content for report by analytic Id
*ReportsApi* | [**getContentForReport**](docs/ReportsApi.md#getContentForReport) | **GET** /report/content | Retrieve report content
*ReportsApi* | [**getReportDetails**](docs/ReportsApi.md#getReportDetails) | **GET** /api/report | Get report
*ShiftsApi* | [**listShiftsUsingGET**](docs/ShiftsApi.md#listShiftsUsingGET) | **GET** /api/shifts | Get Shifts
*ShiftsApi* | [**saveShift**](docs/ShiftsApi.md#saveShift) | **POST** /api/shifts/save | Save Shift
*SkillsApi* | [**createNewSkill**](docs/SkillsApi.md#createNewSkill) | **POST** /skill/add | Create a new skill
*SkillsApi* | [**getSkills**](docs/SkillsApi.md#getSkills) | **GET** /skills | Retrieve skills
*SkillsApi* | [**getUserAssignedSkills**](docs/SkillsApi.md#getUserAssignedSkills) | **GET** /userSkill | Retrieve skills assigned to a user
*SurveyApi* | [**createItemResponse**](docs/SurveyApi.md#createItemResponse) | **POST** /api/survey/item/save | Create the item&#39;s response for a survey
*SurveyApi* | [**createResponseByAssignmentId**](docs/SurveyApi.md#createResponseByAssignmentId) | **POST** /api/survey/save | Create a survey response by assignment id
*SurveyApi* | [**detailsByFormId**](docs/SurveyApi.md#detailsByFormId) | **GET** /api/survey/view | Get the details of a survey form by form id
*SurveyApi* | [**getAllSurveyResponses**](docs/SurveyApi.md#getAllSurveyResponses) | **GET** /api/survey/allresponses | Retrieve all the Responses of the Survey
*SurveyApi* | [**getList**](docs/SurveyApi.md#getList) | **GET** /api/survey/list | Get a list of surveys
*TestApi* | [**getTest**](docs/TestApi.md#getTest) | **GET** /api/test | Retrieve test
*TimecardsApi* | [**clockOut**](docs/TimecardsApi.md#clockOut) | **GET** /timecard/clock/out | Clock Out
*TimecardsApi* | [**createPastTimecard**](docs/TimecardsApi.md#createPastTimecard) | **POST** /timecard/clockin | Create a past timecard.
*TimecardsApi* | [**createTimecard**](docs/TimecardsApi.md#createTimecard) | **POST** /timecard/addtimecard | Create a new timecard.
*TimecardsApi* | [**getByUserId**](docs/TimecardsApi.md#getByUserId) | **GET** /api/user/timecard | Retrieve timecard details by User ID.
*TimecardsApi* | [**getByUserId_0**](docs/TimecardsApi.md#getByUserId_0) | **GET** /api/user/timecards | Retrieve timecard basic details by User ID.
*TimecardsApi* | [**getDetailsByTimecardId**](docs/TimecardsApi.md#getDetailsByTimecardId) | **GET** /api/timecards/details/{timecardId} | Retrieve timecard details based on timecard ID.
*TimecardsApi* | [**getTVCForClockinWithQRCodeUsingCid**](docs/TimecardsApi.md#getTVCForClockinWithQRCodeUsingCid) | **GET** /verify/tvc | TVC code for clockin with QR Code using cid.
*TimecardsApi* | [**getUserById**](docs/TimecardsApi.md#getUserById) | **GET** /timecard | Get timecards by user id.
*TimecardsApi* | [**registerDeviceForClockInWithAssetModel**](docs/TimecardsApi.md#registerDeviceForClockInWithAssetModel) | **POST** /register | Register device for ClockIn with AssetModel.
*TimecardsApi* | [**verifyDeviceWithDeviceUUID**](docs/TimecardsApi.md#verifyDeviceWithDeviceUUID) | **GET** /verify/device | Device verification with DeviceUUID.
*TimecardsApi* | [**verifyUserWithUserid**](docs/TimecardsApi.md#verifyUserWithUserid) | **GET** /verify/user | User verification with userid.
*TimesheetsApi* | [**clockIn**](docs/TimesheetsApi.md#clockIn) | **POST** /api/timesheet/clockin | Clock in.
*TimesheetsApi* | [**clockOut**](docs/TimesheetsApi.md#clockOut) | **POST** /api/timesheet/clockout | Clock out.
*TimesheetsApi* | [**createOrUpdateTimesheet**](docs/TimesheetsApi.md#createOrUpdateTimesheet) | **POST** /api/timesheet/save | Create/Update a timesheet.
*TimesheetsApi* | [**deleteByTimesheetId**](docs/TimesheetsApi.md#deleteByTimesheetId) | **POST** /api/timesheet/delete | Delete a timesheet.
*TimesheetsApi* | [**getActiveAllocations**](docs/TimesheetsApi.md#getActiveAllocations) | **GET** /api/timesheet/allocations/list | Retrieve my active allocations.
*TimesheetsApi* | [**getApprovalList**](docs/TimesheetsApi.md#getApprovalList) | **GET** /api/timesheet/approvals/list | Retrieve timesheet approvals.
*TimesheetsApi* | [**getByTimesheetId**](docs/TimesheetsApi.md#getByTimesheetId) | **GET** /api/timesheet | Retrieve a timesheet by timesheet ID.
*TimesheetsApi* | [**getByUserId**](docs/TimesheetsApi.md#getByUserId) | **GET** /api/timesheets | Retrieve timesheets by User ID.
*TimesheetsApi* | [**getDetailsByTimesheetId**](docs/TimesheetsApi.md#getDetailsByTimesheetId) | **GET** /api/timesheets/details/{timeSheetId} | Retrieve timesheet details by Timesheet ID.
*TimesheetsApi* | [**getPreferencesByCid**](docs/TimesheetsApi.md#getPreferencesByCid) | **GET** /api/timesheet/preferences/list | Retrieve my timesheet preferences.
*TimesheetsApi* | [**getTimecardsByTimesheetId**](docs/TimesheetsApi.md#getTimecardsByTimesheetId) | **GET** /api/timecards | Retrieve timecards by Timesheet ID.
*TimesheetsApi* | [**listActivityTypesByCid**](docs/TimesheetsApi.md#listActivityTypesByCid) | **GET** /api/timesheet/activitytype/list | Retrieve list of activity types based on cid.
*TimesheetsApi* | [**updateStatusByTimesheetId**](docs/TimesheetsApi.md#updateStatusByTimesheetId) | **POST** /api/timesheet/update | Update timesheet status by Timesheet ID.
*TrainingsApi* | [**getByUserId**](docs/TrainingsApi.md#getByUserId) | **GET** /api/trainings | Retrieve trainings by user ID
*TrainingsApi* | [**getTrainingContentByTrainingId**](docs/TrainingsApi.md#getTrainingContentByTrainingId) | **GET** /api/training/content | Retrieve training content by training ID
*TrainingsApi* | [**synchronizeWithTalentLMS**](docs/TrainingsApi.md#synchronizeWithTalentLMS) | **GET** /api/training/talentlms/sync | Sync with talent LMS
*TrainingsApi* | [**updateUserStatus**](docs/TrainingsApi.md#updateUserStatus) | **POST** /api/training/status/update | Update training status for user
*UserPtoPoliciesApi* | [**getPolicies**](docs/UserPtoPoliciesApi.md#getPolicies) | **GET** /v3/user/pto | Retrieve your PTO Policies
*UserPtoPoliciesApi* | [**listPtoPolicies**](docs/UserPtoPoliciesApi.md#listPtoPolicies) | **GET** /ptopolicies | Retrieve list of PTO policies
*UserWorkflowApi* | [**assignWorkflowToUser**](docs/UserWorkflowApi.md#assignWorkflowToUser) | **POST** /api/v3/userworkflow/assign/{workflowId} | Assign Workflow to User
*WorkflowsApi* | [**createNewTask**](docs/WorkflowsApi.md#createNewTask) | **POST** /api/v3/task/add | Create a new task.
*WorkflowsApi* | [**getTaskDetailsByTaskId**](docs/WorkflowsApi.md#getTaskDetailsByTaskId) | **GET** /api/v3/task/{taskid} | Get the details of a workflow task by task id.
*WorkflowsApi* | [**getTasksByUserId**](docs/WorkflowsApi.md#getTasksByUserId) | **GET** /api/v3/tasks | Get tasks by user id.
*WorkflowsApi* | [**getUserWorkflows**](docs/WorkflowsApi.md#getUserWorkflows) | **GET** /api/v3/userworkflows | Get workflows by user id.
*WorkflowsApi* | [**getWorkflows**](docs/WorkflowsApi.md#getWorkflows) | **GET** /api/workflows | Get workflows.
*WorkflowsApi* | [**listTasksByUserworkflowId**](docs/WorkflowsApi.md#listTasksByUserworkflowId) | **GET** /api/v3/userworkflows/{userworkflowid} | Get tasks by userworkflowid.
*WorkflowsApi* | [**updateStatusTask**](docs/WorkflowsApi.md#updateStatusTask) | **POST** /api/v3/task/update/status | Update status workflow task.


## Documentation for Models

 - [AccountModel](docs/AccountModel.md)
 - [AddressModel](docs/AddressModel.md)
 - [AppraisalModel](docs/AppraisalModel.md)
 - [AssessmentModel](docs/AssessmentModel.md)
 - [AssessmentRangeModel](docs/AssessmentRangeModel.md)
 - [AttachmentFolderModel](docs/AttachmentFolderModel.md)
 - [AttachmentModel](docs/AttachmentModel.md)
 - [AuthenticationGetAccessTokenResponse](docs/AuthenticationGetAccessTokenResponse.md)
 - [AwardModel](docs/AwardModel.md)
 - [AwardTypeModel](docs/AwardTypeModel.md)
 - [BankAccountModel](docs/BankAccountModel.md)
 - [CandidateApplicationsModel](docs/CandidateApplicationsModel.md)
 - [CandidateModel](docs/CandidateModel.md)
 - [CandidateStatusModel](docs/CandidateStatusModel.md)
 - [CandidatesExtractPdfResumeRequest](docs/CandidatesExtractPdfResumeRequest.md)
 - [CandidatesExtractPdfResumeResponse](docs/CandidatesExtractPdfResumeResponse.md)
 - [CandidatesGetBasicDetailsResponse](docs/CandidatesGetBasicDetailsResponse.md)
 - [CandidatesGetBasicDetailsResponseDataInner](docs/CandidatesGetBasicDetailsResponseDataInner.md)
 - [CandidatesGetCandidateDetailByRecruitidResponse](docs/CandidatesGetCandidateDetailByRecruitidResponse.md)
 - [CandidatesGetCandidateDetailByRecruitidResponseData](docs/CandidatesGetCandidateDetailByRecruitidResponseData.md)
 - [CandidatesGetResponse](docs/CandidatesGetResponse.md)
 - [CandidatesGetResponseDataInner](docs/CandidatesGetResponseDataInner.md)
 - [CandidatesGetResponseDataInnerCandidatePositionsModelListInner](docs/CandidatesGetResponseDataInnerCandidatePositionsModelListInner.md)
 - [CandidatesSubmitNewCandidateResponse](docs/CandidatesSubmitNewCandidateResponse.md)
 - [CertificationModel](docs/CertificationModel.md)
 - [ContactModel](docs/ContactModel.md)
 - [CountryModel](docs/CountryModel.md)
 - [CurrencyModel](docs/CurrencyModel.md)
 - [CustomFieldGroupModel](docs/CustomFieldGroupModel.md)
 - [CustomFieldModel](docs/CustomFieldModel.md)
 - [CustomFieldStyleModel](docs/CustomFieldStyleModel.md)
 - [CustomFieldValueModel](docs/CustomFieldValueModel.md)
 - [CustomFields](docs/CustomFields.md)
 - [CustomFieldsGetByIdResponse](docs/CustomFieldsGetByIdResponse.md)
 - [CustomFieldsGetByIdResponseData](docs/CustomFieldsGetByIdResponseData.md)
 - [CustomFieldsGetByIdResponseDataCustomFieldGroupModel](docs/CustomFieldsGetByIdResponseDataCustomFieldGroupModel.md)
 - [CustomFieldsGetByIdResponseDataCustomFieldValueModelListInner](docs/CustomFieldsGetByIdResponseDataCustomFieldValueModelListInner.md)
 - [CustomFieldsGetCustomFieldsResponse](docs/CustomFieldsGetCustomFieldsResponse.md)
 - [CustomFieldsGetCustomFieldsResponseDataInner](docs/CustomFieldsGetCustomFieldsResponseDataInner.md)
 - [CustomFieldsGetCustomFieldsResponseDataInnerCustomFieldGroupModel](docs/CustomFieldsGetCustomFieldsResponseDataInnerCustomFieldGroupModel.md)
 - [CustomFieldsGetCustomFieldsResponseDataInnerCustomFieldValueModelListInner](docs/CustomFieldsGetCustomFieldsResponseDataInnerCustomFieldValueModelListInner.md)
 - [CustomFieldsGetCustomListsResponseInner](docs/CustomFieldsGetCustomListsResponseInner.md)
 - [CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner](docs/CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner.md)
 - [CustomFieldsGetValueResponse](docs/CustomFieldsGetValueResponse.md)
 - [CustomFieldsUpdateValueResponse](docs/CustomFieldsUpdateValueResponse.md)
 - [CustomListEntryModel](docs/CustomListEntryModel.md)
 - [CustomListModel](docs/CustomListModel.md)
 - [CustomTableColumnModel](docs/CustomTableColumnModel.md)
 - [CustomTableColumnValueModel](docs/CustomTableColumnValueModel.md)
 - [CustomTableModel](docs/CustomTableModel.md)
 - [CustomTableValueModel](docs/CustomTableValueModel.md)
 - [DepartmentModel](docs/DepartmentModel.md)
 - [DependentsDeleteByContactIdResponse](docs/DependentsDeleteByContactIdResponse.md)
 - [DocumentLibraryGetDocumentAsByteArrayResponse](docs/DocumentLibraryGetDocumentAsByteArrayResponse.md)
 - [DynaFormItemOptionModel](docs/DynaFormItemOptionModel.md)
 - [DynaFormSectionAssignmentModel](docs/DynaFormSectionAssignmentModel.md)
 - [DynaFormSlimModel](docs/DynaFormSlimModel.md)
 - [DynamicFormAssignmentModel](docs/DynamicFormAssignmentModel.md)
 - [DynamicFormItemModel](docs/DynamicFormItemModel.md)
 - [DynamicFormSectionModel](docs/DynamicFormSectionModel.md)
 - [EducationModel](docs/EducationModel.md)
 - [EmploymentModel](docs/EmploymentModel.md)
 - [ExpenseReportsCreateNewExpenseItemResponse](docs/ExpenseReportsCreateNewExpenseItemResponse.md)
 - [ExpenseReportsCreateNewResponse](docs/ExpenseReportsCreateNewResponse.md)
 - [ExpenseReportsDeleteExpenseReportResponse](docs/ExpenseReportsDeleteExpenseReportResponse.md)
 - [ExpenseReportsGetCurrenciesResponse](docs/ExpenseReportsGetCurrenciesResponse.md)
 - [ExpenseReportsGetCurrenciesResponseDataInner](docs/ExpenseReportsGetCurrenciesResponseDataInner.md)
 - [ExpenseReportsSubmitExpenseReportResponse](docs/ExpenseReportsSubmitExpenseReportResponse.md)
 - [FeedbackListFeedbackResponse](docs/FeedbackListFeedbackResponse.md)
 - [FeedbackListFeedbackResponseFeedbackListInner](docs/FeedbackListFeedbackResponseFeedbackListInner.md)
 - [FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModel](docs/FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModel.md)
 - [FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelDepartmentModel](docs/FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelDepartmentModel.md)
 - [FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelDepartmentModelUserModel](docs/FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelDepartmentModelUserModel.md)
 - [FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelLocationModel](docs/FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelLocationModel.md)
 - [FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelLocationModelAddressModelListInner](docs/FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelLocationModelAddressModelListInner.md)
 - [FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelLocationModelAddressModelListInnerCountryModel](docs/FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelLocationModelAddressModelListInnerCountryModel.md)
 - [FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel](docs/FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.md)
 - [FinancialModel](docs/FinancialModel.md)
 - [GoalsDeleteGoalResponse](docs/GoalsDeleteGoalResponse.md)
 - [GoalsGetGoalResponse](docs/GoalsGetGoalResponse.md)
 - [GoalsGetGoalResponseAssignedUserModel](docs/GoalsGetGoalResponseAssignedUserModel.md)
 - [GoalsGetGoalResponseAssignedUserModelDepartmentModel](docs/GoalsGetGoalResponseAssignedUserModelDepartmentModel.md)
 - [GoalsGetGoalResponseAssignedUserModelDepartmentModelUserModel](docs/GoalsGetGoalResponseAssignedUserModelDepartmentModelUserModel.md)
 - [GoalsGetGoalResponseAssignedUserModelLocationModel](docs/GoalsGetGoalResponseAssignedUserModelLocationModel.md)
 - [GoalsGetGoalResponseAssignedUserModelLocationModelAddressModelListInner](docs/GoalsGetGoalResponseAssignedUserModelLocationModelAddressModelListInner.md)
 - [GoalsGetGoalResponseAssignedUserModelLocationModelAddressModelListInnerCountryModel](docs/GoalsGetGoalResponseAssignedUserModelLocationModelAddressModelListInnerCountryModel.md)
 - [GoalsGetGoalResponseAssignedUserModelUserProfileModel](docs/GoalsGetGoalResponseAssignedUserModelUserProfileModel.md)
 - [GoalsGetGoalResponseGoalCollaborationModelInner](docs/GoalsGetGoalResponseGoalCollaborationModelInner.md)
 - [GoalsGetGoalResponseGoalCollaborationModelInnerUserModel](docs/GoalsGetGoalResponseGoalCollaborationModelInnerUserModel.md)
 - [GoalsGetGoalResponseGoalCollaborationModelInnerUserModelUserProfileModel](docs/GoalsGetGoalResponseGoalCollaborationModelInnerUserModelUserProfileModel.md)
 - [GoalsGetGoalResponseGoalTypeModel](docs/GoalsGetGoalResponseGoalTypeModel.md)
 - [GoalsGetGoalResponseGoalTypeModelAssessmentModel](docs/GoalsGetGoalResponseGoalTypeModelAssessmentModel.md)
 - [GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner](docs/GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.md)
 - [GoalsGetGoalResponseProjectModel](docs/GoalsGetGoalResponseProjectModel.md)
 - [GoalsGetGoalResponseProjectModelUserModel](docs/GoalsGetGoalResponseProjectModelUserModel.md)
 - [GoalsGetGoalResponseReviewerUserModel](docs/GoalsGetGoalResponseReviewerUserModel.md)
 - [GoalsGetGoalResponseReviewerUserModelDepartmentModel](docs/GoalsGetGoalResponseReviewerUserModelDepartmentModel.md)
 - [GoalsGetGoalResponseReviewerUserModelDepartmentModelUserModel](docs/GoalsGetGoalResponseReviewerUserModelDepartmentModelUserModel.md)
 - [GoalsGetGoalResponseReviewerUserModelLocationModel](docs/GoalsGetGoalResponseReviewerUserModelLocationModel.md)
 - [GoalsGetGoalResponseReviewerUserModelLocationModelAddressModelListInner](docs/GoalsGetGoalResponseReviewerUserModelLocationModelAddressModelListInner.md)
 - [GoalsGetGoalResponseReviewerUserModelLocationModelAddressModelListInnerCountryModel](docs/GoalsGetGoalResponseReviewerUserModelLocationModelAddressModelListInnerCountryModel.md)
 - [GoalsGetUserGoalsResponse](docs/GoalsGetUserGoalsResponse.md)
 - [HRCalendarModel](docs/HRCalendarModel.md)
 - [InvoiceGetByProjectIdResponse](docs/InvoiceGetByProjectIdResponse.md)
 - [JobProfilesGetJobProfilesResponseInner](docs/JobProfilesGetJobProfilesResponseInner.md)
 - [LeaveModel](docs/LeaveModel.md)
 - [LeavesAddPtoBalanceRequest](docs/LeavesAddPtoBalanceRequest.md)
 - [LocationModel](docs/LocationModel.md)
 - [MailTemplateModel](docs/MailTemplateModel.md)
 - [ObjectAccessModel](docs/ObjectAccessModel.md)
 - [OrgRelationSaveUserResponse](docs/OrgRelationSaveUserResponse.md)
 - [OrgUnitsCreateNewOrgUnitResponse](docs/OrgUnitsCreateNewOrgUnitResponse.md)
 - [PeopleAndPermissionsAddReportsToRequest](docs/PeopleAndPermissionsAddReportsToRequest.md)
 - [PeopleAndPermissionsAddReportsToRequestAddObjectsInner](docs/PeopleAndPermissionsAddReportsToRequestAddObjectsInner.md)
 - [PeopleAndPermissionsAddReportsToResponse](docs/PeopleAndPermissionsAddReportsToResponse.md)
 - [PeopleAndPermissionsCreateOrUpdateUserDetails201Response](docs/PeopleAndPermissionsCreateOrUpdateUserDetails201Response.md)
 - [PeopleAndPermissionsCreateOrUpdateUserDetailsRequest](docs/PeopleAndPermissionsCreateOrUpdateUserDetailsRequest.md)
 - [PeopleAndPermissionsCreateOrUpdateUserDetailsRequestAddressListInner](docs/PeopleAndPermissionsCreateOrUpdateUserDetailsRequestAddressListInner.md)
 - [PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner](docs/PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.md)
 - [PeopleAndPermissionsCreateOrUpdateUserDetailsRequestEducationListInner](docs/PeopleAndPermissionsCreateOrUpdateUserDetailsRequestEducationListInner.md)
 - [PeopleAndPermissionsCreateOrUpdateUserDetailsRequestFinancialListInner](docs/PeopleAndPermissionsCreateOrUpdateUserDetailsRequestFinancialListInner.md)
 - [PeopleAndPermissionsDeleteUserAddressResponse](docs/PeopleAndPermissionsDeleteUserAddressResponse.md)
 - [PeopleAndPermissionsDeleteUserEmploymentResponse](docs/PeopleAndPermissionsDeleteUserEmploymentResponse.md)
 - [PeopleAndPermissionsGetAllUsersDetailsResponseInner](docs/PeopleAndPermissionsGetAllUsersDetailsResponseInner.md)
 - [PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner](docs/PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.md)
 - [PeopleAndPermissionsGetBasicUserDetailsResponseInner](docs/PeopleAndPermissionsGetBasicUserDetailsResponseInner.md)
 - [PeopleAndPermissionsGetUsersResponse](docs/PeopleAndPermissionsGetUsersResponse.md)
 - [PeopleAndPermissionsGetUsersResponseDataInner](docs/PeopleAndPermissionsGetUsersResponseDataInner.md)
 - [PeopleAndPermissionsGetUsersResponseDataInnerUserReporterList](docs/PeopleAndPermissionsGetUsersResponseDataInnerUserReporterList.md)
 - [PeopleAndPermissionsSaveCustomFieldValuesResponse](docs/PeopleAndPermissionsSaveCustomFieldValuesResponse.md)
 - [PeopleAndPermissionsSaveUserAddressRequest](docs/PeopleAndPermissionsSaveUserAddressRequest.md)
 - [PeopleAndPermissionsSaveUserAddressRequestRAWBODYInner](docs/PeopleAndPermissionsSaveUserAddressRequestRAWBODYInner.md)
 - [PeopleAndPermissionsSaveUserAddressResponse](docs/PeopleAndPermissionsSaveUserAddressResponse.md)
 - [PeopleAndPermissionsSaveUserEducationRequest](docs/PeopleAndPermissionsSaveUserEducationRequest.md)
 - [PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner](docs/PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner.md)
 - [PeopleAndPermissionsSaveUserEmploymentRequest](docs/PeopleAndPermissionsSaveUserEmploymentRequest.md)
 - [PeopleAndPermissionsSaveUserEmploymentRequestRAWBODYInner](docs/PeopleAndPermissionsSaveUserEmploymentRequestRAWBODYInner.md)
 - [PeopleAndPermissionsUploadUserProfilePictureRequest](docs/PeopleAndPermissionsUploadUserProfilePictureRequest.md)
 - [PeopleAndPermissionsUploadUserProfilePictureResponse](docs/PeopleAndPermissionsUploadUserProfilePictureResponse.md)
 - [PerformanceReviewCreatePerformanceReviewResponse](docs/PerformanceReviewCreatePerformanceReviewResponse.md)
 - [PositionApprovalLevelModel](docs/PositionApprovalLevelModel.md)
 - [PositionModel](docs/PositionModel.md)
 - [PositionStatusModel](docs/PositionStatusModel.md)
 - [PositionsCreatePositionResponse](docs/PositionsCreatePositionResponse.md)
 - [ProjectAssignUserAllocationRequest](docs/ProjectAssignUserAllocationRequest.md)
 - [ProjectCreateNewRequest](docs/ProjectCreateNewRequest.md)
 - [ProjectGroupModel](docs/ProjectGroupModel.md)
 - [ProjectModel](docs/ProjectModel.md)
 - [PtoPolicyApprovalFlowModel](docs/PtoPolicyApprovalFlowModel.md)
 - [PtoPolicyApprovalModel](docs/PtoPolicyApprovalModel.md)
 - [PtoPolicyChainModel](docs/PtoPolicyChainModel.md)
 - [PtoPolicyModel](docs/PtoPolicyModel.md)
 - [ReportsGetContentForReportResponse](docs/ReportsGetContentForReportResponse.md)
 - [ReportsGetContentForReportResponseDataInner](docs/ReportsGetContentForReportResponseDataInner.md)
 - [ReportsGetContentForReportResponseDataInnerEntityListInner](docs/ReportsGetContentForReportResponseDataInnerEntityListInner.md)
 - [SkillModel](docs/SkillModel.md)
 - [SkillTypeModel](docs/SkillTypeModel.md)
 - [SkillUserModel](docs/SkillUserModel.md)
 - [SkillViewModel](docs/SkillViewModel.md)
 - [SkillsCreateNewSkillRequest](docs/SkillsCreateNewSkillRequest.md)
 - [SkillsCreateNewSkillRequestAssessmentModel](docs/SkillsCreateNewSkillRequestAssessmentModel.md)
 - [SkillsCreateNewSkillRequestAssessmentModelRangeModelListInner](docs/SkillsCreateNewSkillRequestAssessmentModelRangeModelListInner.md)
 - [SkillsCreateNewSkillRequestSkillTypeModel](docs/SkillsCreateNewSkillRequestSkillTypeModel.md)
 - [SkillsCreateNewSkillResponse](docs/SkillsCreateNewSkillResponse.md)
 - [SkillsCreateNewSkillResponseAssessmentModel](docs/SkillsCreateNewSkillResponseAssessmentModel.md)
 - [SkillsCreateNewSkillResponseSkillTypeModel](docs/SkillsCreateNewSkillResponseSkillTypeModel.md)
 - [SkillsGetSkillsResponseInner](docs/SkillsGetSkillsResponseInner.md)
 - [SkillsGetUserAssignedSkillsResponse](docs/SkillsGetUserAssignedSkillsResponse.md)
 - [SkillsGetUserAssignedSkillsResponseDataInner](docs/SkillsGetUserAssignedSkillsResponseDataInner.md)
 - [SkillsGetUserAssignedSkillsResponseDataInnerSkillModel](docs/SkillsGetUserAssignedSkillsResponseDataInnerSkillModel.md)
 - [SkillsGetUserAssignedSkillsResponseDataInnerSkillModelAssessmentModel](docs/SkillsGetUserAssignedSkillsResponseDataInnerSkillModelAssessmentModel.md)
 - [SkillsGetUserAssignedSkillsResponseDataInnerSkillModelAssessmentModelRangeModelListInner](docs/SkillsGetUserAssignedSkillsResponseDataInnerSkillModelAssessmentModelRangeModelListInner.md)
 - [StateCountryModel](docs/StateCountryModel.md)
 - [TaskModel](docs/TaskModel.md)
 - [TimecardsGetByUserId200Response](docs/TimecardsGetByUserId200Response.md)
 - [TimesheetsClockInResponse](docs/TimesheetsClockInResponse.md)
 - [TimesheetsClockOutResponse](docs/TimesheetsClockOutResponse.md)
 - [TimesheetsCreateOrUpdateTimesheetResponse](docs/TimesheetsCreateOrUpdateTimesheetResponse.md)
 - [TimesheetsDeleteByTimesheetIdResponse](docs/TimesheetsDeleteByTimesheetIdResponse.md)
 - [TimesheetsGetActiveAllocationsResponse](docs/TimesheetsGetActiveAllocationsResponse.md)
 - [TimesheetsGetActiveAllocationsResponseDataInner](docs/TimesheetsGetActiveAllocationsResponseDataInner.md)
 - [TimesheetsGetApprovalListResponse](docs/TimesheetsGetApprovalListResponse.md)
 - [TimesheetsGetApprovalListResponseDataInner](docs/TimesheetsGetApprovalListResponseDataInner.md)
 - [TimesheetsGetPreferencesByCidResponse](docs/TimesheetsGetPreferencesByCidResponse.md)
 - [TimesheetsListActivityTypesByCidResponse](docs/TimesheetsListActivityTypesByCidResponse.md)
 - [TimesheetsListActivityTypesByCidResponseDataInner](docs/TimesheetsListActivityTypesByCidResponseDataInner.md)
 - [TimesheetsUpdateStatusByTimesheetIdResponse](docs/TimesheetsUpdateStatusByTimesheetIdResponse.md)
 - [Timestamp](docs/Timestamp.md)
 - [TrainingModel](docs/TrainingModel.md)
 - [UserGroupModel](docs/UserGroupModel.md)
 - [UserModel](docs/UserModel.md)
 - [UserPositionApprovalModel](docs/UserPositionApprovalModel.md)
 - [UserProfileModel](docs/UserProfileModel.md)
 - [UserPtoPoliciesGetPoliciesResponse](docs/UserPtoPoliciesGetPoliciesResponse.md)
 - [UserPtoPoliciesListPtoPoliciesResponse](docs/UserPtoPoliciesListPtoPoliciesResponse.md)
 - [UserThinModel](docs/UserThinModel.md)
 - [UserTrainingModel](docs/UserTrainingModel.md)
 - [UserViewModel](docs/UserViewModel.md)
 - [UserWorkflowAssignWorkflowToUserResponse](docs/UserWorkflowAssignWorkflowToUserResponse.md)
 - [UserWorkflowModel](docs/UserWorkflowModel.md)
 - [WorkerTypeModel](docs/WorkerTypeModel.md)
 - [WorkflowModel](docs/WorkflowModel.md)
 - [WorkflowParameterAssignmentModel](docs/WorkflowParameterAssignmentModel.md)
 - [WorkflowParameterModel](docs/WorkflowParameterModel.md)
 - [WorkflowStepModel](docs/WorkflowStepModel.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
