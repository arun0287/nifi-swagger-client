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
 * ControllerConfigurationDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-15T23:51:49.699+02:00")
public class ControllerConfigurationDTO {
  @SerializedName("maxTimerDrivenThreadCount")
  private Integer maxTimerDrivenThreadCount = null;

  @SerializedName("maxEventDrivenThreadCount")
  private Integer maxEventDrivenThreadCount = null;

  public ControllerConfigurationDTO maxTimerDrivenThreadCount(Integer maxTimerDrivenThreadCount) {
    this.maxTimerDrivenThreadCount = maxTimerDrivenThreadCount;
    return this;
  }

   /**
   * The maximum number of timer driven threads the NiFi has available.
   * @return maxTimerDrivenThreadCount
  **/
  @ApiModelProperty(example = "null", value = "The maximum number of timer driven threads the NiFi has available.")
  public Integer getMaxTimerDrivenThreadCount() {
    return maxTimerDrivenThreadCount;
  }

  public void setMaxTimerDrivenThreadCount(Integer maxTimerDrivenThreadCount) {
    this.maxTimerDrivenThreadCount = maxTimerDrivenThreadCount;
  }

  public ControllerConfigurationDTO maxEventDrivenThreadCount(Integer maxEventDrivenThreadCount) {
    this.maxEventDrivenThreadCount = maxEventDrivenThreadCount;
    return this;
  }

   /**
   * The maximum number of event driven threads the NiFi has available.
   * @return maxEventDrivenThreadCount
  **/
  @ApiModelProperty(example = "null", value = "The maximum number of event driven threads the NiFi has available.")
  public Integer getMaxEventDrivenThreadCount() {
    return maxEventDrivenThreadCount;
  }

  public void setMaxEventDrivenThreadCount(Integer maxEventDrivenThreadCount) {
    this.maxEventDrivenThreadCount = maxEventDrivenThreadCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerConfigurationDTO controllerConfigurationDTO = (ControllerConfigurationDTO) o;
    return Objects.equals(this.maxTimerDrivenThreadCount, controllerConfigurationDTO.maxTimerDrivenThreadCount) &&
        Objects.equals(this.maxEventDrivenThreadCount, controllerConfigurationDTO.maxEventDrivenThreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxTimerDrivenThreadCount, maxEventDrivenThreadCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerConfigurationDTO {\n");
    
    sb.append("    maxTimerDrivenThreadCount: ").append(toIndentedString(maxTimerDrivenThreadCount)).append("\n");
    sb.append("    maxEventDrivenThreadCount: ").append(toIndentedString(maxEventDrivenThreadCount)).append("\n");
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

