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
import com.github.hermannpencole.nifi.swagger.client.model.FlowConfigurationDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FlowConfigurationEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-15T23:51:49.699+02:00")
public class FlowConfigurationEntity {
  @SerializedName("flowConfiguration")
  private FlowConfigurationDTO flowConfiguration = null;

  public FlowConfigurationEntity flowConfiguration(FlowConfigurationDTO flowConfiguration) {
    this.flowConfiguration = flowConfiguration;
    return this;
  }

   /**
   * The controller configuration.
   * @return flowConfiguration
  **/
  @ApiModelProperty(example = "null", value = "The controller configuration.")
  public FlowConfigurationDTO getFlowConfiguration() {
    return flowConfiguration;
  }

  public void setFlowConfiguration(FlowConfigurationDTO flowConfiguration) {
    this.flowConfiguration = flowConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowConfigurationEntity flowConfigurationEntity = (FlowConfigurationEntity) o;
    return Objects.equals(this.flowConfiguration, flowConfigurationEntity.flowConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowConfigurationEntity {\n");
    
    sb.append("    flowConfiguration: ").append(toIndentedString(flowConfiguration)).append("\n");
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

