

# JobDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**webUrl** | **String** | URL of the job in CircleCI Web UI. | 
**project** | [**JobDetailsProject**](JobDetailsProject.md) |  | 
**parallelRuns** | [**List&lt;JobDetailsParallelRuns&gt;**](JobDetailsParallelRuns.md) | Info about parallels runs and their status. | 
**startedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the job started. | 
**latestWorkflow** | [**JobDetailsLatestWorkflow**](JobDetailsLatestWorkflow.md) |  | 
**name** | **String** | The name of the job. | 
**executor** | [**JobDetailsExecutor**](JobDetailsExecutor.md) |  | 
**parallelism** | **Long** | A number of parallel runs the job has. | 
**status** | **Object** | The current status of the job. | 
**number** | **Long** | The number of the job. | 
**pipeline** | [**JobDetailsPipeline**](JobDetailsPipeline.md) |  | 
**duration** | **Long** | Duration of a job in milliseconds. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time when the job was created. | 
**messages** | [**List&lt;JobDetailsMessages&gt;**](JobDetailsMessages.md) | Messages from CircleCI execution platform. | 
**contexts** | [**List&lt;JobDetailsContexts&gt;**](JobDetailsContexts.md) | List of contexts used by the job. | 
**organization** | [**JobDetailsOrganization**](JobDetailsOrganization.md) |  | 
**queuedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time when the job was placed in a queue. | 
**stoppedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time when the job stopped. |  [optional]



