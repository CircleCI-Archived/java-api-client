

# Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The unique ID of the workflow. | 
**name** | **String** | The name of the workflow. | 
**status** | [**StatusEnum**](#StatusEnum) | The current status of the workflow. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the workflow was created. | 
**stoppedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the workflow stopped. | 
**pipelineId** | [**UUID**](UUID.md) | The ID of the pipeline this workflow belongs to. | 
**pipelineNumber** | **Long** | The number of the pipeline this workflow belongs to. | 
**projectSlug** | **String** | The project-slug for the pipeline this workflow belongs to. | 



## Enum: StatusEnum

Name | Value
---- | -----
SUCCESS | &quot;success&quot;
RUNNING | &quot;running&quot;
NOT_RUN | &quot;not_run&quot;
FAILED | &quot;failed&quot;
ERROR | &quot;error&quot;
FAILING | &quot;failing&quot;
ON_HOLD | &quot;on_hold&quot;
CANCELED | &quot;canceled&quot;
UNAUTHORIZED | &quot;unauthorized&quot;



