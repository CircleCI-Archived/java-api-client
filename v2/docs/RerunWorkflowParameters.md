

# RerunWorkflowParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobs** | [**List&lt;UUID&gt;**](UUID.md) | A list of job IDs to rerun. |  [optional]
**fromFailed** | **Boolean** | Whether to rerun the workflow from the failed job. Mutually exclusive with the jobs parameter. |  [optional]
**sparseTree** | **Boolean** | Completes rerun using sparse trees logic, an optimization for workflows that have disconnected subgraphs. Requires jobs parameter and so is mutually exclusive with the from_failed parameter. |  [optional]



