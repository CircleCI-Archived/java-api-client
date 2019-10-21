

# Pipeline

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The unique ID of the pipeline. | 
**errors** | [**List&lt;PipelineWithWorkflowsErrors&gt;**](PipelineWithWorkflowsErrors.md) | A sequence of errors that have occurred within the pipeline. | 
**projectSlug** | **String** | The project-slug for the pipeline. | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the pipeline was last updated. |  [optional]
**number** | **Long** | The number of the pipeline. | 
**state** | [**StateEnum**](#StateEnum) | The current state of the pipeline. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the pipeline was created. | 
**trigger** | [**PipelineWithWorkflowsTrigger**](PipelineWithWorkflowsTrigger.md) |  | 
**vcs** | [**PipelineWithWorkflowsVcs**](PipelineWithWorkflowsVcs.md) |  |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
CREATED | &quot;created&quot;
ERRORED | &quot;errored&quot;
PENDING | &quot;pending&quot;



