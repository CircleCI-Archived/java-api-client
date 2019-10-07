

# Job

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencies** | [**List&lt;UUID&gt;**](UUID.md) | A sequence of the unique job IDs for the jobs that this job depends upon in the workflow. | 
**jobNumber** | **Long** | The number of the job. | 
**id** | [**UUID**](UUID.md) | The unique ID of the job. | 
**startedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the job started. | 
**name** | **String** | The name of the job. | 
**projectSlug** | **String** | The project-slug for the job. | 
**status** | **Object** | The current status of the job. | 
**stopTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time when the job stopped. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of job. | 
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the job started. | 
**stoppedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time when the job stopped. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
BUILD | &quot;build&quot;
APPROVAL | &quot;approval&quot;



