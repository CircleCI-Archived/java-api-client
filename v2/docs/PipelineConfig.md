

# PipelineConfig

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | **String** | The source configuration for the pipeline, before any config compilation has been performed. If there is no config, then this field will be empty. | 
**compiled** | **String** | The compiled configuration for the pipeline, after all orb expansion has been performed. If there were errors processing the pipeline&#39;s configuration, then this field may be empty. | 
**setupConfig** | **String** | The setup configuration for the pipeline used for Setup Workflows. If there were errors processing the pipeline&#39;s configuration or if setup workflows are not enabled, then this field should not exist |  [optional]
**compiledSetupConfig** | **String** | The compiled setup configuration for the pipeline, after all orb expansion has been performed. If there were errors processing the pipeline&#39;s setup workflows, then this field may be empty. |  [optional]



