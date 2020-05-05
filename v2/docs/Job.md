

# Job

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canceledBy** | [**UUID**](UUID.md) | The unique ID of the user. |  [optional]
**dependencies** | [**List&lt;UUID&gt;**](UUID.md) | A sequence of the unique job IDs for the jobs that this job depends upon in the workflow. | 
**jobNumber** | **Long** | The number of the job. |  [optional]
**id** | [**UUID**](UUID.md) | The unique ID of the job. | 
**startedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the job started. | 
**name** | **String** | The name of the job. | 
**approvedBy** | [**UUID**](UUID.md) | The unique ID of the user. |  [optional]
**projectSlug** | **String** | The project-slug for the job. | 
**status** | **Object** | The current status of the job. | 
**type** | [**TypeEnum**](#TypeEnum) | The type of job. | 
**stoppedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time when the job stopped. |  [optional]
**approvalRequestId** | [**UUID**](UUID.md) | The unique ID of the job. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
BUILD | &quot;build&quot;
APPROVAL | &quot;approval&quot;



