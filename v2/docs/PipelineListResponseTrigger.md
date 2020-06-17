

# PipelineListResponseTrigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of trigger. | 
**receivedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the trigger was received. | 
**actor** | [**PipelineListResponseTriggerActor**](PipelineListResponseTriggerActor.md) |  | 



## Enum: TypeEnum

Name | Value
---- | -----
EXPLICIT | &quot;explicit&quot;
API | &quot;api&quot;
WEBHOOK | &quot;webhook&quot;



