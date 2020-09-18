

# TriggerPipelineParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **String** | The branch where the pipeline ran. The HEAD commit on this branch was used for the pipeline. Note that &#x60;branch&#x60; and &#x60;tag&#x60; are mutually exclusive. To trigger a pipeline for a PR by number use &#x60;pull/&lt;number&gt;/head&#x60; for the PR ref or &#x60;pull/&lt;number&gt;/merge&#x60; for the merge ref (GitHub only). |  [optional]
**tag** | **String** | The tag used by the pipeline. The commit that this tag points to was used for the pipeline. Note that &#x60;branch&#x60; and &#x60;tag&#x60; are mutually exclusive. |  [optional]
**parameters** | [**Map&lt;String, AnyOfintegerstringboolean&gt;**](AnyOfintegerstringboolean.md) | An object containing pipeline parameters and their values. |  [optional]



