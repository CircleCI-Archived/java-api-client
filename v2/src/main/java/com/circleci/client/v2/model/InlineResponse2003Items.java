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
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * InlineResponse2003Items
 */

public class InlineResponse2003Items {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private UUID id;

  public static final String JSON_PROPERTY_DURATION = "duration";
  @JsonProperty(JSON_PROPERTY_DURATION)
  private Long duration;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_STOPPED_AT = "stopped_at";
  @JsonProperty(JSON_PROPERTY_STOPPED_AT)
  private OffsetDateTime stoppedAt;

  public static final String JSON_PROPERTY_CREDITS_USED = "credits_used";
  @JsonProperty(JSON_PROPERTY_CREDITS_USED)
  private Long creditsUsed;

  /**
   * Workflow status.
   */
  public enum StatusEnum {
    SUCCESS("success"),
    
    FAILED("failed"),
    
    ERROR("error"),
    
    CANCELED("canceled"),
    
    UNAUTHORIZED("unauthorized");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private StatusEnum status;

  public InlineResponse2003Items id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the workflow.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the workflow.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public InlineResponse2003Items duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration in seconds of a run.
   * minimum: 0
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "The duration in seconds of a run.")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public InlineResponse2003Items createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time the workflow was created.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The date and time the workflow was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public InlineResponse2003Items stoppedAt(OffsetDateTime stoppedAt) {
    this.stoppedAt = stoppedAt;
    return this;
  }

   /**
   * The date and time the workflow stopped.
   * @return stoppedAt
  **/
  @ApiModelProperty(required = true, value = "The date and time the workflow stopped.")
  public OffsetDateTime getStoppedAt() {
    return stoppedAt;
  }

  public void setStoppedAt(OffsetDateTime stoppedAt) {
    this.stoppedAt = stoppedAt;
  }

  public InlineResponse2003Items creditsUsed(Long creditsUsed) {
    this.creditsUsed = creditsUsed;
    return this;
  }

   /**
   * The number of credits used during execution
   * minimum: 0
   * @return creditsUsed
  **/
  @ApiModelProperty(required = true, value = "The number of credits used during execution")
  public Long getCreditsUsed() {
    return creditsUsed;
  }

  public void setCreditsUsed(Long creditsUsed) {
    this.creditsUsed = creditsUsed;
  }

  public InlineResponse2003Items status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Workflow status.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Workflow status.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003Items inlineResponse2003Items = (InlineResponse2003Items) o;
    return Objects.equals(this.id, inlineResponse2003Items.id) &&
        Objects.equals(this.duration, inlineResponse2003Items.duration) &&
        Objects.equals(this.createdAt, inlineResponse2003Items.createdAt) &&
        Objects.equals(this.stoppedAt, inlineResponse2003Items.stoppedAt) &&
        Objects.equals(this.creditsUsed, inlineResponse2003Items.creditsUsed) &&
        Objects.equals(this.status, inlineResponse2003Items.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, duration, createdAt, stoppedAt, creditsUsed, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003Items {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    stoppedAt: ").append(toIndentedString(stoppedAt)).append("\n");
    sb.append("    creditsUsed: ").append(toIndentedString(creditsUsed)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

