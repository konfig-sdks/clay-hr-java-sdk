

# PeopleAndPermissionsCreateOrUpdateUserDetailsRequestAddressListInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressLine1** | **String** |  |  [optional] |
|**addressLine2** | **String** |  |  [optional] |
|**addressType** | [**AddressTypeEnum**](#AddressTypeEnum) |  |  [optional] |
|**zipCode** | **String** |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**countryId** | **String** | Country Identifier (should be a number id). |  [optional] |
|**extAppUID** | **String** |  |  [optional] |
|**countryCode** | **String** | Country ISO2 code. |  [optional] |



## Enum: AddressTypeEnum

| Name | Value |
|---- | -----|
| BILLING | &quot;Billing&quot; |
| HOME | &quot;Home&quot; |
| MAILING | &quot;Mailing&quot; |
| PERMANENT | &quot;Permanent&quot; |
| PHYSICAL | &quot;Physical&quot; |
| WORK | &quot;Work&quot; |
| OTHER | &quot;Other&quot; |



