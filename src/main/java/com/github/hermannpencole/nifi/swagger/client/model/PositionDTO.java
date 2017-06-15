/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.3.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PositionDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-15T23:51:49.699+02:00")
public class PositionDTO {
  @SerializedName("x")
  private Double x = null;

  @SerializedName("y")
  private Double y = null;

  public PositionDTO x(Double x) {
    this.x = x;
    return this;
  }

   /**
   * The x coordinate.
   * @return x
  **/
  @ApiModelProperty(example = "null", value = "The x coordinate.")
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public PositionDTO y(Double y) {
    this.y = y;
    return this;
  }

   /**
   * The y coordinate.
   * @return y
  **/
  @ApiModelProperty(example = "null", value = "The y coordinate.")
  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionDTO positionDTO = (PositionDTO) o;
    return Objects.equals(this.x, positionDTO.x) &&
        Objects.equals(this.y, positionDTO.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionDTO {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

