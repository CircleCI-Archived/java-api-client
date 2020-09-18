

# PipelineListResponseVcs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**providerName** | **String** | Name of the VCS provider (e.g. GitHub, Bitbucket). | 
**originRepositoryUrl** | **String** | URL for the repository where the trigger originated. For fork-PR pipelines, this is the URL to the fork. For other pipelines the &#x60;origin_&#x60; and &#x60;target_repository_url&#x60;s will be the same. | 
**targetRepositoryUrl** | **String** | URL for the repository the trigger targets (i.e. the repository where the PR will be merged). For fork-PR pipelines, this is the URL to the parent repo. For other pipelines, the &#x60;origin_&#x60; and &#x60;target_repository_url&#x60;s will be the same. | 
**revision** | **String** | The code revision the pipeline ran. | 
**branch** | **String** | The branch where the pipeline ran. The HEAD commit on this branch was used for the pipeline. Note that &#x60;branch&#x60; and &#x60;tag&#x60; are mutually exclusive. To trigger a pipeline for a PR by number use &#x60;pull/&lt;number&gt;/head&#x60; for the PR ref or &#x60;pull/&lt;number&gt;/merge&#x60; for the merge ref (GitHub only). |  [optional]
**tag** | **String** | The tag used by the pipeline. The commit that this tag points to was used for the pipeline. Note that &#x60;branch&#x60; and &#x60;tag&#x60; are mutually exclusive. |  [optional]
**commit** | [**PipelineListResponseVcsCommit**](PipelineListResponseVcsCommit.md) |  |  [optional]



