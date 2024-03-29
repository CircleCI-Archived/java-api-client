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
import com.circleci.client.v2.model.InlineResponse2002MetricsDurationMetrics;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Metrics relating to a workflow&#39;s runs.
 */
@ApiModel(description = "Metrics relating to a workflow's runs.")

public class InlineResponse2002Metrics {
  public static final String JSON_PROPERTY_TOTAL_RUNS = "total_runs";
  @JsonProperty(JSON_PROPERTY_TOTAL_RUNS)
  private Long totalRuns;

  public static final String JSON_PROPERTY_SUCCESSFUL_RUNS = "successful_runs";
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_RUNS)
  private Long successfulRuns;

  public static final String JSON_PROPERTY_MTTR = "mttr";
  @JsonProperty(JSON_PROPERTY_MTTR)
  private Long mttr;

  public static final String JSON_PROPERTY_TOTAL_CREDITS_USED = "total_credits_used";
  @JsonProperty(JSON_PROPERTY_TOTAL_CREDITS_USED)
  private Long totalCreditsUsed;

  public static final String JSON_PROPERTY_FAILED_RUNS = "failed_runs";
  @JsonProperty(JSON_PROPERTY_FAILED_RUNS)
  private Long failedRuns;

  public static final String JSON_PROPERTY_SUCCESS_RATE = "success_rate";
  @JsonProperty(JSON_PROPERTY_SUCCESS_RATE)
  private Float successRate;

  public static final String JSON_PROPERTY_DURATION_METRICS = "duration_metrics";
  @JsonProperty(JSON_PROPERTY_DURATION_METRICS)
  private InlineResponse2002MetricsDurationMetrics durationMetrics = null;

  public static final String JSON_PROPERTY_TOTAL_RECOVERIES = "total_recoveries";
  @JsonProperty(JSON_PROPERTY_TOTAL_RECOVERIES)
  private Long totalRecoveries;

  public static final String JSON_PROPERTY_THROUGHPUT = "throughput";
  @JsonProperty(JSON_PROPERTY_THROUGHPUT)
  private Float throughput;

  public InlineResponse2002Metrics totalRuns(Long totalRuns) {
    this.totalRuns = totalRuns;
    return this;
  }

   /**
   * The total number of runs.
   * minimum: 0
   * @return totalRuns
  **/
  @ApiModelProperty(required = true, value = "The total number of runs.")
  public Long getTotalRuns() {
    return totalRuns;
  }

  public void setTotalRuns(Long totalRuns) {
    this.totalRuns = totalRuns;
  }

  public InlineResponse2002Metrics successfulRuns(Long successfulRuns) {
    this.successfulRuns = successfulRuns;
    return this;
  }

   /**
   * The number of successful runs.
   * minimum: 0
   * @return successfulRuns
  **/
  @ApiModelProperty(required = true, value = "The number of successful runs.")
  public Long getSuccessfulRuns() {
    return successfulRuns;
  }

  public void setSuccessfulRuns(Long successfulRuns) {
    this.successfulRuns = successfulRuns;
  }

  public InlineResponse2002Metrics mttr(Long mttr) {
    this.mttr = mttr;
    return this;
  }

   /**
   * The mean time to recovery (mean time between failures and their next success) in seconds.
   * minimum: 0
   * @return mttr
  **/
  @ApiModelProperty(required = true, value = "The mean time to recovery (mean time between failures and their next success) in seconds.")
  public Long getMttr() {
    return mttr;
  }

  public void setMttr(Long mttr) {
    this.mttr = mttr;
  }

  public InlineResponse2002Metrics totalCreditsUsed(Long totalCreditsUsed) {
    this.totalCreditsUsed = totalCreditsUsed;
    return this;
  }

   /**
   * The total credits consumed by the workflow in the aggregation window. Note that Insights is not a real time financial reporting tool and should not be used for credit reporting.
   * minimum: 0
   * @return totalCreditsUsed
  **/
  @ApiModelProperty(required = true, value = "The total credits consumed by the workflow in the aggregation window. Note that Insights is not a real time financial reporting tool and should not be used for credit reporting.")
  public Long getTotalCreditsUsed() {
    return totalCreditsUsed;
  }

  public void setTotalCreditsUsed(Long totalCreditsUsed) {
    this.totalCreditsUsed = totalCreditsUsed;
  }

  public InlineResponse2002Metrics failedRuns(Long failedRuns) {
    this.failedRuns = failedRuns;
    return this;
  }

   /**
   * The number of failed runs.
   * minimum: 0
   * @return failedRuns
  **/
  @ApiModelProperty(required = true, value = "The number of failed runs.")
  public Long getFailedRuns() {
    return failedRuns;
  }

  public void setFailedRuns(Long failedRuns) {
    this.failedRuns = failedRuns;
  }

  public InlineResponse2002Metrics successRate(Float successRate) {
    this.successRate = successRate;
    return this;
  }

   /**
   * Get successRate
   * @return successRate
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getSuccessRate() {
    return successRate;
  }

  public void setSuccessRate(Float successRate) {
    this.successRate = successRate;
  }

  public InlineResponse2002Metrics durationMetrics(InlineResponse2002MetricsDurationMetrics durationMetrics) {
    this.durationMetrics = durationMetrics;
    return this;
  }

   /**
   * Get durationMetrics
   * @return durationMetrics
  **/
  @ApiModelProperty(required = true, value = "")
  public InlineResponse2002MetricsDurationMetrics getDurationMetrics() {
    return durationMetrics;
  }

  public void setDurationMetrics(InlineResponse2002MetricsDurationMetrics durationMetrics) {
    this.durationMetrics = durationMetrics;
  }

  public InlineResponse2002Metrics totalRecoveries(Long totalRecoveries) {
    this.totalRecoveries = totalRecoveries;
    return this;
  }

   /**
   * The number of recovered workflow executions per day.
   * minimum: 0
   * @return totalRecoveries
  **/
  @ApiModelProperty(required = true, value = "The number of recovered workflow executions per day.")
  public Long getTotalRecoveries() {
    return totalRecoveries;
  }

  public void setTotalRecoveries(Long totalRecoveries) {
    this.totalRecoveries = totalRecoveries;
  }

  public InlineResponse2002Metrics throughput(Float throughput) {
    this.throughput = throughput;
    return this;
  }

   /**
   * The average number of runs per day.
   * @return throughput
  **/
  @ApiModelProperty(required = true, value = "The average number of runs per day.")
  public Float getThroughput() {
    return throughput;
  }

  public void setThroughput(Float throughput) {
    this.throughput = throughput;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002Metrics inlineResponse2002Metrics = (InlineResponse2002Metrics) o;
    return Objects.equals(this.totalRuns, inlineResponse2002Metrics.totalRuns) &&
        Objects.equals(this.successfulRuns, inlineResponse2002Metrics.successfulRuns) &&
        Objects.equals(this.mttr, inlineResponse2002Metrics.mttr) &&
        Objects.equals(this.totalCreditsUsed, inlineResponse2002Metrics.totalCreditsUsed) &&
        Objects.equals(this.failedRuns, inlineResponse2002Metrics.failedRuns) &&
        Objects.equals(this.successRate, inlineResponse2002Metrics.successRate) &&
        Objects.equals(this.durationMetrics, inlineResponse2002Metrics.durationMetrics) &&
        Objects.equals(this.totalRecoveries, inlineResponse2002Metrics.totalRecoveries) &&
        Objects.equals(this.throughput, inlineResponse2002Metrics.throughput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRuns, successfulRuns, mttr, totalCreditsUsed, failedRuns, successRate, durationMetrics, totalRecoveries, throughput);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Metrics {\n");
    sb.append("    totalRuns: ").append(toIndentedString(totalRuns)).append("\n");
    sb.append("    successfulRuns: ").append(toIndentedString(successfulRuns)).append("\n");
    sb.append("    mttr: ").append(toIndentedString(mttr)).append("\n");
    sb.append("    totalCreditsUsed: ").append(toIndentedString(totalCreditsUsed)).append("\n");
    sb.append("    failedRuns: ").append(toIndentedString(failedRuns)).append("\n");
    sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
    sb.append("    durationMetrics: ").append(toIndentedString(durationMetrics)).append("\n");
    sb.append("    totalRecoveries: ").append(toIndentedString(totalRecoveries)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
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

