

# Pipeline

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The unique ID of the pipeline. | 
**errors** | [**List&lt;PipelineListResponseErrors&gt;**](PipelineListResponseErrors.md) | A sequence of errors that have occurred within the pipeline. | 
**projectSlug** | **String** | The project-slug for the pipeline. | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the pipeline was last updated. |  [optional]
**number** | **Long** | The number of the pipeline. | 
**state** | [**StateEnum**](#StateEnum) | The current state of the pipeline. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the pipeline was created. | 
**trigger** | [**PipelineListResponseTrigger**](PipelineListResponseTrigger.md) |  | 
**vcs** | [**PipelineListResponseVcs**](PipelineListResponseVcs.md) |  |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
CREATED | &quot;created&quot;
ERRORED | &quot;errored&quot;
SETUP_PENDING | &quot;setup-pending&quot;
SETUP | &quot;setup&quot;
PENDING | &quot;pending&quot;



