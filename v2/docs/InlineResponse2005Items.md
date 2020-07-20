

# InlineResponse2005Items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The unique ID of the job. | 
**startedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the job started. | 
**stoppedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time when the job stopped. | 
**status** | [**StatusEnum**](#StatusEnum) | Job status. | 
**creditsUsed** | **Long** | The number of credits used during execution | 



## Enum: StatusEnum

Name | Value
---- | -----
SUCCESS | &quot;success&quot;
NOT_RUN | &quot;not_run&quot;
FAILED | &quot;failed&quot;
CANCELED | &quot;canceled&quot;
UNAUTHORIZED | &quot;unauthorized&quot;



