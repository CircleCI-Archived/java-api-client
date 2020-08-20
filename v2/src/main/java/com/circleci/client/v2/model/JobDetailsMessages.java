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

/**
 * Message from CircleCI execution platform.
 */
@ApiModel(description = "Message from CircleCI execution platform.")

public class JobDetailsMessages {
  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private String type;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  private String message;

  public static final String JSON_PROPERTY_REASON = "reason";
  @JsonProperty(JSON_PROPERTY_REASON)
  private String reason;

  public JobDetailsMessages type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Message type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Message type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public JobDetailsMessages message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Information describing message.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Information describing message.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public JobDetailsMessages reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Value describing the reason for message to be added to the job.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value describing the reason for message to be added to the job.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDetailsMessages jobDetailsMessages = (JobDetailsMessages) o;
    return Objects.equals(this.type, jobDetailsMessages.type) &&
        Objects.equals(this.message, jobDetailsMessages.message) &&
        Objects.equals(this.reason, jobDetailsMessages.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, message, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDetailsMessages {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

