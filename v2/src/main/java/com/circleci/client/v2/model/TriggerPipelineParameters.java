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
import com.circleci.client.v2.model.AnyOfintegerstringboolean;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The information you can supply when triggering a pipeline.
 */
@ApiModel(description = "The information you can supply when triggering a pipeline.")

public class TriggerPipelineParameters {
  public static final String JSON_PROPERTY_BRANCH = "branch";
  @JsonProperty(JSON_PROPERTY_BRANCH)
  private String branch;

  public static final String JSON_PROPERTY_TAG = "tag";
  @JsonProperty(JSON_PROPERTY_TAG)
  private String tag;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  private Map<String, AnyOfintegerstringboolean> parameters = new HashMap<>();

  public TriggerPipelineParameters branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * The branch where the pipeline ran. The HEAD commit on this branch was used for the pipeline. Note that &#x60;branch&#x60; and &#x60;tag&#x60; are mutually exclusive. To trigger a pipeline for a PR by number use &#x60;pull/&lt;number&gt;/head&#x60; for the PR ref or &#x60;pull/&lt;number&gt;/merge&#x60; for the merge ref (GitHub only).
   * @return branch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "feature/design-new-api", value = "The branch where the pipeline ran. The HEAD commit on this branch was used for the pipeline. Note that `branch` and `tag` are mutually exclusive. To trigger a pipeline for a PR by number use `pull/<number>/head` for the PR ref or `pull/<number>/merge` for the merge ref (GitHub only).")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public TriggerPipelineParameters tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * The tag used by the pipeline. The commit that this tag points to was used for the pipeline. Note that &#x60;branch&#x60; and &#x60;tag&#x60; are mutually exclusive.
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v3.1.4159", value = "The tag used by the pipeline. The commit that this tag points to was used for the pipeline. Note that `branch` and `tag` are mutually exclusive.")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public TriggerPipelineParameters parameters(Map<String, AnyOfintegerstringboolean> parameters) {
    this.parameters = parameters;
    return this;
  }

  public TriggerPipelineParameters putParametersItem(String key, AnyOfintegerstringboolean parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * An object containing pipeline parameters and their values.
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"deploy_prod\":true}", value = "An object containing pipeline parameters and their values.")
  public Map<String, AnyOfintegerstringboolean> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, AnyOfintegerstringboolean> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerPipelineParameters triggerPipelineParameters = (TriggerPipelineParameters) o;
    return Objects.equals(this.branch, triggerPipelineParameters.branch) &&
        Objects.equals(this.tag, triggerPipelineParameters.tag) &&
        Objects.equals(this.parameters, triggerPipelineParameters.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, tag, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerPipelineParameters {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

