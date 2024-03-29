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
 * Test counts for a given pipeline number
 */
@ApiModel(description = "Test counts for a given pipeline number")

public class InlineResponse2006TestCounts {
  public static final String JSON_PROPERTY_ERROR = "error";
  @JsonProperty(JSON_PROPERTY_ERROR)
  private Long error;

  public static final String JSON_PROPERTY_FAILURE = "failure";
  @JsonProperty(JSON_PROPERTY_FAILURE)
  private Long failure;

  public static final String JSON_PROPERTY_SKIPPED = "skipped";
  @JsonProperty(JSON_PROPERTY_SKIPPED)
  private Long skipped;

  public static final String JSON_PROPERTY_SUCCESS = "success";
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  private Long success;

  public static final String JSON_PROPERTY_TOTAL = "total";
  @JsonProperty(JSON_PROPERTY_TOTAL)
  private Long total;

  public InlineResponse2006TestCounts error(Long error) {
    this.error = error;
    return this;
  }

   /**
   * The number of tests with the error status
   * minimum: 0
   * @return error
  **/
  @ApiModelProperty(required = true, value = "The number of tests with the error status")
  public Long getError() {
    return error;
  }

  public void setError(Long error) {
    this.error = error;
  }

  public InlineResponse2006TestCounts failure(Long failure) {
    this.failure = failure;
    return this;
  }

   /**
   * The number of tests with the failure status
   * minimum: 0
   * @return failure
  **/
  @ApiModelProperty(required = true, value = "The number of tests with the failure status")
  public Long getFailure() {
    return failure;
  }

  public void setFailure(Long failure) {
    this.failure = failure;
  }

  public InlineResponse2006TestCounts skipped(Long skipped) {
    this.skipped = skipped;
    return this;
  }

   /**
   * The number of tests with the skipped status
   * minimum: 0
   * @return skipped
  **/
  @ApiModelProperty(required = true, value = "The number of tests with the skipped status")
  public Long getSkipped() {
    return skipped;
  }

  public void setSkipped(Long skipped) {
    this.skipped = skipped;
  }

  public InlineResponse2006TestCounts success(Long success) {
    this.success = success;
    return this;
  }

   /**
   * The number of tests with the success status
   * minimum: 0
   * @return success
  **/
  @ApiModelProperty(required = true, value = "The number of tests with the success status")
  public Long getSuccess() {
    return success;
  }

  public void setSuccess(Long success) {
    this.success = success;
  }

  public InlineResponse2006TestCounts total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of tests
   * minimum: 0
   * @return total
  **/
  @ApiModelProperty(required = true, value = "The total number of tests")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006TestCounts inlineResponse2006TestCounts = (InlineResponse2006TestCounts) o;
    return Objects.equals(this.error, inlineResponse2006TestCounts.error) &&
        Objects.equals(this.failure, inlineResponse2006TestCounts.failure) &&
        Objects.equals(this.skipped, inlineResponse2006TestCounts.skipped) &&
        Objects.equals(this.success, inlineResponse2006TestCounts.success) &&
        Objects.equals(this.total, inlineResponse2006TestCounts.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, failure, skipped, success, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006TestCounts {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

