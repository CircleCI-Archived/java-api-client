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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * The information you can supply when rerunning a workflow.
 */
@ApiModel(description = "The information you can supply when rerunning a workflow.")

public class RerunWorkflowParameters {
  public static final String JSON_PROPERTY_JOBS = "jobs";
  @JsonProperty(JSON_PROPERTY_JOBS)
  private List<UUID> jobs = new ArrayList<>();

  public static final String JSON_PROPERTY_FROM_FAILED = "from_failed";
  @JsonProperty(JSON_PROPERTY_FROM_FAILED)
  private Boolean fromFailed;

  public RerunWorkflowParameters jobs(List<UUID> jobs) {
    this.jobs = jobs;
    return this;
  }

  public RerunWorkflowParameters addJobsItem(UUID jobsItem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<>();
    }
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * A list of job IDs to rerun.
   * @return jobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"c65b68ef-e73b-4bf2-be9a-7a322a9df150\",\"5e957edd-5e8c-4985-9178-5d0d69561822\"]", value = "A list of job IDs to rerun.")
  public List<UUID> getJobs() {
    return jobs;
  }

  public void setJobs(List<UUID> jobs) {
    this.jobs = jobs;
  }

  public RerunWorkflowParameters fromFailed(Boolean fromFailed) {
    this.fromFailed = fromFailed;
    return this;
  }

   /**
   * Whether to rerun the workflow from the failed job. Mutually exclusive with the jobs parameter.
   * @return fromFailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether to rerun the workflow from the failed job. Mutually exclusive with the jobs parameter.")
  public Boolean getFromFailed() {
    return fromFailed;
  }

  public void setFromFailed(Boolean fromFailed) {
    this.fromFailed = fromFailed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RerunWorkflowParameters rerunWorkflowParameters = (RerunWorkflowParameters) o;
    return Objects.equals(this.jobs, rerunWorkflowParameters.jobs) &&
        Objects.equals(this.fromFailed, rerunWorkflowParameters.fromFailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs, fromFailed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RerunWorkflowParameters {\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    fromFailed: ").append(toIndentedString(fromFailed)).append("\n");
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

