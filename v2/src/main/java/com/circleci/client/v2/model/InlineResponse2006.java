/*
 * CircleCI API
 * This describes the resources that make up the CircleCI API v2.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.circleci.client.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.circleci.client.v2.model.InlineResponse2006MostFailedTests;
import com.circleci.client.v2.model.InlineResponse2006TestRuns;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Project level test metrics response
 */
@ApiModel(description = "Project level test metrics response")

public class InlineResponse2006 {
  public static final String JSON_PROPERTY_AVERAGE_TEST_COUNT = "average_test_count";
  @JsonProperty(JSON_PROPERTY_AVERAGE_TEST_COUNT)
  private Long averageTestCount;

  public static final String JSON_PROPERTY_MOST_FAILED_TESTS = "most_failed_tests";
  @JsonProperty(JSON_PROPERTY_MOST_FAILED_TESTS)
  private List<InlineResponse2006MostFailedTests> mostFailedTests = new ArrayList<>();

  public static final String JSON_PROPERTY_MOST_FAILED_TESTS_EXTRA = "most_failed_tests_extra";
  @JsonProperty(JSON_PROPERTY_MOST_FAILED_TESTS_EXTRA)
  private Long mostFailedTestsExtra;

  public static final String JSON_PROPERTY_SLOWEST_TESTS = "slowest_tests";
  @JsonProperty(JSON_PROPERTY_SLOWEST_TESTS)
  private List<InlineResponse2006MostFailedTests> slowestTests = new ArrayList<>();

  public static final String JSON_PROPERTY_SLOWEST_TESTS_EXTRA = "slowest_tests_extra";
  @JsonProperty(JSON_PROPERTY_SLOWEST_TESTS_EXTRA)
  private Long slowestTestsExtra;

  public static final String JSON_PROPERTY_TOTAL_TEST_RUNS = "total_test_runs";
  @JsonProperty(JSON_PROPERTY_TOTAL_TEST_RUNS)
  private Long totalTestRuns;

  public static final String JSON_PROPERTY_TEST_RUNS = "test_runs";
  @JsonProperty(JSON_PROPERTY_TEST_RUNS)
  private List<InlineResponse2006TestRuns> testRuns = new ArrayList<>();

  public InlineResponse2006 averageTestCount(Long averageTestCount) {
    this.averageTestCount = averageTestCount;
    return this;
  }

   /**
   * The average number of tests executed per run
   * minimum: 0
   * @return averageTestCount
  **/
  @ApiModelProperty(required = true, value = "The average number of tests executed per run")
  public Long getAverageTestCount() {
    return averageTestCount;
  }

  public void setAverageTestCount(Long averageTestCount) {
    this.averageTestCount = averageTestCount;
  }

  public InlineResponse2006 mostFailedTests(List<InlineResponse2006MostFailedTests> mostFailedTests) {
    this.mostFailedTests = mostFailedTests;
    return this;
  }

  public InlineResponse2006 addMostFailedTestsItem(InlineResponse2006MostFailedTests mostFailedTestsItem) {
    this.mostFailedTests.add(mostFailedTestsItem);
    return this;
  }

   /**
   * Metrics for the most frequently failing tests
   * @return mostFailedTests
  **/
  @ApiModelProperty(required = true, value = "Metrics for the most frequently failing tests")
  public List<InlineResponse2006MostFailedTests> getMostFailedTests() {
    return mostFailedTests;
  }

  public void setMostFailedTests(List<InlineResponse2006MostFailedTests> mostFailedTests) {
    this.mostFailedTests = mostFailedTests;
  }

  public InlineResponse2006 mostFailedTestsExtra(Long mostFailedTestsExtra) {
    this.mostFailedTestsExtra = mostFailedTestsExtra;
    return this;
  }

   /**
   * The number of tests with the same success rate being omitted from most_failed_tests
   * minimum: 0
   * @return mostFailedTestsExtra
  **/
  @ApiModelProperty(required = true, value = "The number of tests with the same success rate being omitted from most_failed_tests")
  public Long getMostFailedTestsExtra() {
    return mostFailedTestsExtra;
  }

  public void setMostFailedTestsExtra(Long mostFailedTestsExtra) {
    this.mostFailedTestsExtra = mostFailedTestsExtra;
  }

  public InlineResponse2006 slowestTests(List<InlineResponse2006MostFailedTests> slowestTests) {
    this.slowestTests = slowestTests;
    return this;
  }

  public InlineResponse2006 addSlowestTestsItem(InlineResponse2006MostFailedTests slowestTestsItem) {
    this.slowestTests.add(slowestTestsItem);
    return this;
  }

   /**
   * Metrics for the slowest running tests
   * @return slowestTests
  **/
  @ApiModelProperty(required = true, value = "Metrics for the slowest running tests")
  public List<InlineResponse2006MostFailedTests> getSlowestTests() {
    return slowestTests;
  }

  public void setSlowestTests(List<InlineResponse2006MostFailedTests> slowestTests) {
    this.slowestTests = slowestTests;
  }

  public InlineResponse2006 slowestTestsExtra(Long slowestTestsExtra) {
    this.slowestTestsExtra = slowestTestsExtra;
    return this;
  }

   /**
   * The number of tests with the same duration rate being omitted from slowest_tests
   * minimum: 0
   * @return slowestTestsExtra
  **/
  @ApiModelProperty(required = true, value = "The number of tests with the same duration rate being omitted from slowest_tests")
  public Long getSlowestTestsExtra() {
    return slowestTestsExtra;
  }

  public void setSlowestTestsExtra(Long slowestTestsExtra) {
    this.slowestTestsExtra = slowestTestsExtra;
  }

  public InlineResponse2006 totalTestRuns(Long totalTestRuns) {
    this.totalTestRuns = totalTestRuns;
    return this;
  }

   /**
   * The total number of test runs
   * minimum: 0
   * @return totalTestRuns
  **/
  @ApiModelProperty(required = true, value = "The total number of test runs")
  public Long getTotalTestRuns() {
    return totalTestRuns;
  }

  public void setTotalTestRuns(Long totalTestRuns) {
    this.totalTestRuns = totalTestRuns;
  }

  public InlineResponse2006 testRuns(List<InlineResponse2006TestRuns> testRuns) {
    this.testRuns = testRuns;
    return this;
  }

  public InlineResponse2006 addTestRunsItem(InlineResponse2006TestRuns testRunsItem) {
    this.testRuns.add(testRunsItem);
    return this;
  }

   /**
   * Test counts grouped by pipeline number and workflow id
   * @return testRuns
  **/
  @ApiModelProperty(required = true, value = "Test counts grouped by pipeline number and workflow id")
  public List<InlineResponse2006TestRuns> getTestRuns() {
    return testRuns;
  }

  public void setTestRuns(List<InlineResponse2006TestRuns> testRuns) {
    this.testRuns = testRuns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(this.averageTestCount, inlineResponse2006.averageTestCount) &&
        Objects.equals(this.mostFailedTests, inlineResponse2006.mostFailedTests) &&
        Objects.equals(this.mostFailedTestsExtra, inlineResponse2006.mostFailedTestsExtra) &&
        Objects.equals(this.slowestTests, inlineResponse2006.slowestTests) &&
        Objects.equals(this.slowestTestsExtra, inlineResponse2006.slowestTestsExtra) &&
        Objects.equals(this.totalTestRuns, inlineResponse2006.totalTestRuns) &&
        Objects.equals(this.testRuns, inlineResponse2006.testRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageTestCount, mostFailedTests, mostFailedTestsExtra, slowestTests, slowestTestsExtra, totalTestRuns, testRuns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    sb.append("    averageTestCount: ").append(toIndentedString(averageTestCount)).append("\n");
    sb.append("    mostFailedTests: ").append(toIndentedString(mostFailedTests)).append("\n");
    sb.append("    mostFailedTestsExtra: ").append(toIndentedString(mostFailedTestsExtra)).append("\n");
    sb.append("    slowestTests: ").append(toIndentedString(slowestTests)).append("\n");
    sb.append("    slowestTestsExtra: ").append(toIndentedString(slowestTestsExtra)).append("\n");
    sb.append("    totalTestRuns: ").append(toIndentedString(totalTestRuns)).append("\n");
    sb.append("    testRuns: ").append(toIndentedString(testRuns)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

