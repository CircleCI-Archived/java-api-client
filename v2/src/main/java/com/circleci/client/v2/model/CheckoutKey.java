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

/**
 * CheckoutKey
 */

public class CheckoutKey {
  public static final String JSON_PROPERTY_PUBLIC_KEY = "public-key";
  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  private String publicKey;

  /**
   * The type of checkout key. This may be either &#x60;deploy-key&#x60; or &#x60;github-user-key&#x60;.
   */
  public enum TypeEnum {
    DEPLOY_KEY("deploy-key"),
    
    GITHUB_USER_KEY("github-user-key");

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

  public static final String JSON_PROPERTY_FINGERPRINT = "fingerprint";
  @JsonProperty(JSON_PROPERTY_FINGERPRINT)
  private String fingerprint;

  public static final String JSON_PROPERTY_PREFERRED = "preferred";
  @JsonProperty(JSON_PROPERTY_PREFERRED)
  private Boolean preferred;

  public static final String JSON_PROPERTY_CREATED_AT = "created-at";
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  private OffsetDateTime createdAt;

  public CheckoutKey publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * A public SSH key.
   * @return publicKey
  **/
  @ApiModelProperty(example = "ssh-rsa ...", required = true, value = "A public SSH key.")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public CheckoutKey type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of checkout key. This may be either &#x60;deploy-key&#x60; or &#x60;github-user-key&#x60;.
   * @return type
  **/
  @ApiModelProperty(example = "deploy-key", required = true, value = "The type of checkout key. This may be either `deploy-key` or `github-user-key`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CheckoutKey fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * An SSH key fingerprint.
   * @return fingerprint
  **/
  @ApiModelProperty(example = "c9:0b:1c:4f:d5:65:56:b9:ad:88:f9:81:2b:37:74:2f", required = true, value = "An SSH key fingerprint.")
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public CheckoutKey preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

   /**
   * A boolean value that indicates if this key is preferred.
   * @return preferred
  **/
  @ApiModelProperty(example = "true", required = true, value = "A boolean value that indicates if this key is preferred.")
  public Boolean getPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }

  public CheckoutKey createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time the checkout key was created.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The date and time the checkout key was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutKey checkoutKey = (CheckoutKey) o;
    return Objects.equals(this.publicKey, checkoutKey.publicKey) &&
        Objects.equals(this.type, checkoutKey.type) &&
        Objects.equals(this.fingerprint, checkoutKey.fingerprint) &&
        Objects.equals(this.preferred, checkoutKey.preferred) &&
        Objects.equals(this.createdAt, checkoutKey.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicKey, type, fingerprint, preferred, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutKey {\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

