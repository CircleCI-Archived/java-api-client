

# PipelineLight

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The unique ID of the pipeline. | 
**state** | [**StateEnum**](#StateEnum) | The current state of the pipeline. | 
**number** | **Long** | The number of the pipeline. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the pipeline was created. | 



## Enum: StateEnum

Name | Value
---- | -----
CREATED | &quot;created&quot;
RUNNING | &quot;running&quot;
FAILED | &quot;failed&quot;
ERRORED | &quot;errored&quot;
SUCCESSFUL | &quot;successful&quot;
ON_HOLD | &quot;on_hold&quot;
BLOCKED | &quot;blocked&quot;
PENDING | &quot;pending&quot;
CANCELED | &quot;canceled&quot;



