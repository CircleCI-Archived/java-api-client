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
 * Collaboration
 */

public class Collaboration {
  public static final String JSON_PROPERTY_VCS_TYPE = "vcs-type";
  @JsonProperty(JSON_PROPERTY_VCS_TYPE)
  private String vcsType;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_AVATAR_URL = "avatar_url";
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  private String avatarUrl;

  public Collaboration vcsType(String vcsType) {
    this.vcsType = vcsType;
    return this;
  }

   /**
   * The VCS provider
   * @return vcsType
  **/
  @ApiModelProperty(required = true, value = "The VCS provider")
  public String getVcsType() {
    return vcsType;
  }

  public void setVcsType(String vcsType) {
    this.vcsType = vcsType;
  }

  public Collaboration name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the organization
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the organization")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Collaboration avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * URL to the user&#39;s avatar on the VCS
   * @return avatarUrl
  **/
  @ApiModelProperty(required = true, value = "URL to the user's avatar on the VCS")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Collaboration collaboration = (Collaboration) o;
    return Objects.equals(this.vcsType, collaboration.vcsType) &&
        Objects.equals(this.name, collaboration.name) &&
        Objects.equals(this.avatarUrl, collaboration.avatarUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vcsType, name, avatarUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collaboration {\n");
    sb.append("    vcsType: ").append(toIndentedString(vcsType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
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

