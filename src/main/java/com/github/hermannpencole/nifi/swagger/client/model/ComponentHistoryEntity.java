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
import com.github.hermannpencole.nifi.swagger.client.model.ComponentHistoryDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ComponentHistoryEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-15T23:51:49.699+02:00")
public class ComponentHistoryEntity {
  @SerializedName("componentHistory")
  private ComponentHistoryDTO componentHistory = null;

  public ComponentHistoryEntity componentHistory(ComponentHistoryDTO componentHistory) {
    this.componentHistory = componentHistory;
    return this;
  }

   /**
   * Get componentHistory
   * @return componentHistory
  **/
  @ApiModelProperty(example = "null", value = "")
  public ComponentHistoryDTO getComponentHistory() {
    return componentHistory;
  }

  public void setComponentHistory(ComponentHistoryDTO componentHistory) {
    this.componentHistory = componentHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentHistoryEntity componentHistoryEntity = (ComponentHistoryEntity) o;
    return Objects.equals(this.componentHistory, componentHistoryEntity.componentHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentHistory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentHistoryEntity {\n");
    
    sb.append("    componentHistory: ").append(toIndentedString(componentHistory)).append("\n");
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

