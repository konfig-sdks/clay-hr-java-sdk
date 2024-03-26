

# PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**relationToUser** | [**RelationToUserEnum**](#RelationToUserEnum) |  |  [optional] |
|**contactType** | [**ContactTypeEnum**](#ContactTypeEnum) |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**taxNumber** | **String** |  |  [optional] |
|**dateOfBirth** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**extAppUID** | **String** |  |  [optional] |



## Enum: RelationToUserEnum

| Name | Value |
|---- | -----|
| SPOUSE | &quot;Spouse&quot; |
| PARENT | &quot;Parent&quot; |
| CHILD | &quot;Child&quot; |
| OTHER | &quot;Other&quot; |



## Enum: ContactTypeEnum

| Name | Value |
|---- | -----|
| DEP | &quot;DEP&quot; |
| ECON | &quot;ECON&quot; |
| ACCT | &quot;ACCT&quot; |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| M | &quot;M&quot; |
| F | &quot;F&quot; |
| H | &quot;H&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AP | &quot;AP&quot; |
| WA | &quot;WA&quot; |



