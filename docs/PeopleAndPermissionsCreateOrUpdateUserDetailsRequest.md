

# PeopleAndPermissionsCreateOrUpdateUserDetailsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | First name of user. |  [optional] |
|**email** | **String** | Mail ID of user. |  [optional] |
|**lastName** | **String** | Last name of user. |  [optional] |
|**empId** | **String** | Employee ID of the user. |  [optional] |
|**gender** | **String** | Gender of the user. |  [optional] |
|**guid** | **String** | The unique system generated ID of the user. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the user. A - Active, I - Inactive, F - Future Joiner |  [optional] |
|**displayFullName** | **String** | Display name of the user. |  [optional] |
|**middleName** | **String** | Middle name of user. |  [optional] |
|**secondLastName** | **String** | Second Last name of user. |  [optional] |
|**shortName** | **String** | Short name of user. |  [optional] |
|**namePronunciation** | **String** | Name Pronunciation |  [optional] |
|**familySuffix** | **String** | Family Suffix |  [optional] |
|**workerType** | **String** | Worker type of the user. |  [optional] |
|**userDateOfBirth** | **String** | Birth date of user. |  [optional] |
|**phone** | **String** | Phone number of the user. |  [optional] |
|**cellPhone** | **String** | Cell phone of the user. |  [optional] |
|**position** | **Integer** | Profile ID of the user. |  [optional] |
|**departmentID** | **Integer** | Org Unit ID of the user. |  [optional] |
|**locationId** | **Integer** | Location ID of the user. |  [optional] |
|**locationName** | **String** | Location of user. |  [optional] |
|**userStartDate** | **String** | Start Date of user. |  [optional] |
|**reportsToEmail** | **List&lt;String&gt;** | Managers detail of user. |  [optional] |
|**addressList** | [**List&lt;PeopleAndPermissionsCreateOrUpdateUserDetailsRequestAddressListInner&gt;**](PeopleAndPermissionsCreateOrUpdateUserDetailsRequestAddressListInner.md) | Address detail of user. |  [optional] |
|**educationList** | [**List&lt;PeopleAndPermissionsCreateOrUpdateUserDetailsRequestEducationListInner&gt;**](PeopleAndPermissionsCreateOrUpdateUserDetailsRequestEducationListInner.md) | Education detail of user. |  [optional] |
|**contactList** | [**List&lt;PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner&gt;**](PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.md) | Contact detail of user |  [optional] |
|**financialList** | [**List&lt;PeopleAndPermissionsCreateOrUpdateUserDetailsRequestFinancialListInner&gt;**](PeopleAndPermissionsCreateOrUpdateUserDetailsRequestFinancialListInner.md) | Financial detail of user. |  [optional] |
|**customFieldValues** | **String** | key - cfcode , value - cfvalue |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| I | &quot;I&quot; |
| F | &quot;F&quot; |



