

# PeopleAndPermissionsCreateOrUpdateUserDetailsRequestFinancialListInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **Float** |  |  [optional] |
|**period** | [**PeriodEnum**](#PeriodEnum) | Time period for compensation. HRLY - Hourly, DLY - Daily, WKLY - Weekly, BWKLY - Bi-Weekly, MTHLY - Monthly, BMTH - Bi-Monthly, QTRLY - Quarterly, BYRLY - Bi-Yearly, YRLY - Yearly, ONEF - OneOff |  [optional] |
|**financialType** | [**FinancialTypeEnum**](#FinancialTypeEnum) |  |  [optional] |
|**currencyCode** | **String** |  |  [optional] |
|**effectivedate** | **String** |  |  [optional] |
|**compensationType** | [**CompensationTypeEnum**](#CompensationTypeEnum) | Type of compensation. sal - Salary, pay - Compensation, INCTV - Incentive, SVCR - Severance |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of compensation. ACTV - Active, ARCHV - Archive, PVNL - Provisional |  [optional] |
|**changeTypeId** | **Integer** |  |  [optional] |
|**changeTypeCode** | **String** |  |  [optional] |
|**extAppUID** | **String** |  |  [optional] |



## Enum: PeriodEnum

| Name | Value |
|---- | -----|
| HRLY | &quot;HRLY&quot; |
| DLY | &quot;DLY&quot; |
| WKLY | &quot;WKLY&quot; |
| BWKLY | &quot;BWKLY&quot; |
| BMTH | &quot;BMTH&quot; |
| MTHLY | &quot;MTHLY&quot; |
| QTRLY | &quot;QTRLY&quot; |
| BYRLY | &quot;BYRLY&quot; |
| YRLY | &quot;YRLY&quot; |
| ONEF | &quot;ONEF&quot; |



## Enum: FinancialTypeEnum

| Name | Value |
|---- | -----|
| COMP | &quot;COMP&quot; |



## Enum: CompensationTypeEnum

| Name | Value |
|---- | -----|
| SAL | &quot;sal&quot; |
| PAY | &quot;pay&quot; |
| BONUS | &quot;bonus&quot; |
| INCTV | &quot;INCTV&quot; |
| SVRC | &quot;SVRC&quot; |
| OTHER | &quot;other&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTV | &quot;ACTV&quot; |
| ARCHV | &quot;ARCHV&quot; |
| PVNL | &quot;PVNL&quot; |



