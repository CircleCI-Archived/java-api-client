/*
 * CircleCI API
 * This describes the resources that make up the CircleCI API v2. API v2 is currently in Preview. Additional documentation for this API can be found in the [API Preview Docs](https://github.com/CircleCI-Public/api-preview-docs/tree/master/docs). Breaking changes to the API will be announced in the [Breaking Changes log](https://github.com/CircleCI-Public/api-preview-docs/blob/master/docs/breaking.md).
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Job
 */
@ApiModel(description = "Job")

public class Job {
  public static final String JSON_PROPERTY_CANCELED_BY = "canceled_by";
  @JsonProperty(JSON_PROPERTY_CANCELED_BY)
  private UUID canceledBy;

  public static final String JSON_PROPERTY_DEPENDENCIES = "dependencies";
  @JsonProperty(JSON_PROPERTY_DEPENDENCIES)
  private List<UUID> dependencies = new ArrayList<>();

  public static final String JSON_PROPERTY_JOB_NUMBER = "job_number";
  @JsonProperty(JSON_PROPERTY_JOB_NUMBER)
  private Long jobNumber;

  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private UUID id;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_APPROVED_BY = "approved_by";
  @JsonProperty(JSON_PROPERTY_APPROVED_BY)
  private UUID approvedBy;

  public static final String JSON_PROPERTY_PROJECT_SLUG = "project_slug";
  @JsonProperty(JSON_PROPERTY_PROJECT_SLUG)
  private String projectSlug;

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private Object status = null;

  /**
   * The type of job.
   */
  public enum TypeEnum {
    BUILD("build"),
    
    APPROVAL("approval");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private TypeEnum type;

  public static final String JSON_PROPERTY_STOPPED_AT = "stopped_at";
  @JsonProperty(JSON_PROPERTY_STOPPED_AT)
  private OffsetDateTime stoppedAt;

  public Job canceledBy(UUID canceledBy) {
    this.canceledBy = canceledBy;
    return this;
  }

   /**
   * The unique ID of the user.
   * @return canceledBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the user.")
  public UUID getCanceledBy() {
    return canceledBy;
  }

  public void setCanceledBy(UUID canceledBy) {
    this.canceledBy = canceledBy;
  }

  public Job dependencies(List<UUID> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public Job addDependenciesItem(UUID dependenciesItem) {
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * A sequence of the unique job IDs for the jobs that this job depends upon in the workflow.
   * @return dependencies
  **/
  @ApiModelProperty(required = true, value = "A sequence of the unique job IDs for the jobs that this job depends upon in the workflow.")
  public List<UUID> getDependencies() {
    return dependencies;
  }

  public void setDependencies(List<UUID> dependencies) {
    this.dependencies = dependencies;
  }

  public Job jobNumber(Long jobNumber) {
    this.jobNumber = jobNumber;
    return this;
  }

   /**
   * The number of the job.
   * @return jobNumber
  **/
  @ApiModelProperty(required = true, value = "The number of the job.")
  public Long getJobNumber() {
    return jobNumber;
  }

  public void setJobNumber(Long jobNumber) {
    this.jobNumber = jobNumber;
  }

  public Job id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the job.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the job.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Job startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * The date and time the job started.
   * @return startedAt
  **/
  @ApiModelProperty(required = true, value = "The date and time the job started.")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public Job name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the job.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the job.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Job approvedBy(UUID approvedBy) {
    this.approvedBy = approvedBy;
    return this;
  }

   /**
   * The unique ID of the user.
   * @return approvedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the user.")
  public UUID getApprovedBy() {
    return approvedBy;
  }

  public void setApprovedBy(UUID approvedBy) {
    this.approvedBy = approvedBy;
  }

  public Job projectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
    return this;
  }

   /**
   * The project-slug for the job.
   * @return projectSlug
  **/
  @ApiModelProperty(example = "gh/CircleCI-Public/api-preview-docs", required = true, value = "The project-slug for the job.")
  public String getProjectSlug() {
    return projectSlug;
  }

  public void setProjectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
  }

  public Job status(Object status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the job.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The current status of the job.")
  public Object getStatus() {
    return status;
  }

  public void setStatus(Object status) {
    this.status = status;
  }

  public Job type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of job.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of job.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Job stoppedAt(OffsetDateTime stoppedAt) {
    this.stoppedAt = stoppedAt;
    return this;
  }

   /**
   * The time when the job stopped.
   * @return stoppedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when the job stopped.")
  public OffsetDateTime getStoppedAt() {
    return stoppedAt;
  }

  public void setStoppedAt(OffsetDateTime stoppedAt) {
    this.stoppedAt = stoppedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.canceledBy, job.canceledBy) &&
        Objects.equals(this.dependencies, job.dependencies) &&
        Objects.equals(this.jobNumber, job.jobNumber) &&
        Objects.equals(this.id, job.id) &&
        Objects.equals(this.startedAt, job.startedAt) &&
        Objects.equals(this.name, job.name) &&
        Objects.equals(this.approvedBy, job.approvedBy) &&
        Objects.equals(this.projectSlug, job.projectSlug) &&
        Objects.equals(this.status, job.status) &&
        Objects.equals(this.type, job.type) &&
        Objects.equals(this.stoppedAt, job.stoppedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canceledBy, dependencies, jobNumber, id, startedAt, name, approvedBy, projectSlug, status, type, stoppedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    sb.append("    canceledBy: ").append(toIndentedString(canceledBy)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    jobNumber: ").append(toIndentedString(jobNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    approvedBy: ").append(toIndentedString(approvedBy)).append("\n");
    sb.append("    projectSlug: ").append(toIndentedString(projectSlug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    stoppedAt: ").append(toIndentedString(stoppedAt)).append("\n");
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

