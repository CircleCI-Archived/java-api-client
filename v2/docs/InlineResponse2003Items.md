

# InlineResponse2003Items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The unique ID of the workflow. | 
**duration** | **Long** | The duration in seconds of a run. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the workflow was created. | 
**stoppedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the workflow stopped. | 
**creditsUsed** | **Long** | The number of credits used during execution | 
**status** | [**StatusEnum**](#StatusEnum) | Workflow status. | 



## Enum: StatusEnum

Name | Value
---- | -----
SUCCESS | &quot;success&quot;
FAILED | &quot;failed&quot;
ERROR | &quot;error&quot;
CANCELED | &quot;canceled&quot;
UNAUTHORIZED | &quot;unauthorized&quot;



