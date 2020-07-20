

# ContextOwner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The unique ID of the owner of the context. Specify either this or slug. |  [optional]
**slug** | **String** | A string that represents an organization. Specify either this or id. Cannot be used for accounts. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the owner. Defaults to \&quot;organization\&quot;. Accounts are only used as context owners in server. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
ACCOUNT | &quot;account&quot;
ORGANIZATION | &quot;organization&quot;



