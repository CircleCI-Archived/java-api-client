

# InlineResponse2006

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**averageTestCount** | **Long** | The average number of tests executed per run | 
**mostFailedTests** | [**List&lt;InlineResponse2006MostFailedTests&gt;**](InlineResponse2006MostFailedTests.md) | Metrics for the most frequently failing tests | 
**mostFailedTestsExtra** | **Long** | The number of tests with the same success rate being omitted from most_failed_tests | 
**slowestTests** | [**List&lt;InlineResponse2006MostFailedTests&gt;**](InlineResponse2006MostFailedTests.md) | Metrics for the slowest running tests | 
**slowestTestsExtra** | **Long** | The number of tests with the same duration rate being omitted from slowest_tests | 
**totalTestRuns** | **Long** | The total number of test runs | 
**testRuns** | [**List&lt;InlineResponse2006TestRuns&gt;**](InlineResponse2006TestRuns.md) | Test counts grouped by pipeline number and workflow id | 



