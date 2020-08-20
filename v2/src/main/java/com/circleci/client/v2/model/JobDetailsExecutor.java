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
 * Information about executor used for a job.
 */
@ApiModel(description = "Information about executor used for a job.")

public class JobDetailsExecutor {
  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private String type;

  public static final String JSON_PROPERTY_RESOURCE_CLASS = "resource_class";
  @JsonProperty(JSON_PROPERTY_RESOURCE_CLASS)
  private String resourceClass;

  public JobDetailsExecutor type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Executor type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Executor type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public JobDetailsExecutor resourceClass(String resourceClass) {
    this.resourceClass = resourceClass;
    return this;
  }

   /**
   * Resource class name.
   * @return resourceClass
  **/
  @ApiModelProperty(required = true, value = "Resource class name.")
  public String getResourceClass() {
    return resourceClass;
  }

  public void setResourceClass(String resourceClass) {
    this.resourceClass = resourceClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDetailsExecutor jobDetailsExecutor = (JobDetailsExecutor) o;
    return Objects.equals(this.type, jobDetailsExecutor.type) &&
        Objects.equals(this.resourceClass, jobDetailsExecutor.resourceClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, resourceClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDetailsExecutor {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    resourceClass: ").append(toIndentedString(resourceClass)).append("\n");
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

