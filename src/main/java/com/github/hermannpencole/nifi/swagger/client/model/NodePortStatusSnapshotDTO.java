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
import com.github.hermannpencole.nifi.swagger.client.model.PortStatusSnapshotDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NodePortStatusSnapshotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-15T23:51:49.699+02:00")
public class NodePortStatusSnapshotDTO {
  @SerializedName("nodeId")
  private String nodeId = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("apiPort")
  private Integer apiPort = null;

  @SerializedName("statusSnapshot")
  private PortStatusSnapshotDTO statusSnapshot = null;

  public NodePortStatusSnapshotDTO nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * The unique ID that identifies the node
   * @return nodeId
  **/
  @ApiModelProperty(example = "null", value = "The unique ID that identifies the node")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public NodePortStatusSnapshotDTO address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The API address of the node
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "The API address of the node")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public NodePortStatusSnapshotDTO apiPort(Integer apiPort) {
    this.apiPort = apiPort;
    return this;
  }

   /**
   * The API port used to communicate with the node
   * @return apiPort
  **/
  @ApiModelProperty(example = "null", value = "The API port used to communicate with the node")
  public Integer getApiPort() {
    return apiPort;
  }

  public void setApiPort(Integer apiPort) {
    this.apiPort = apiPort;
  }

  public NodePortStatusSnapshotDTO statusSnapshot(PortStatusSnapshotDTO statusSnapshot) {
    this.statusSnapshot = statusSnapshot;
    return this;
  }

   /**
   * The port status snapshot from the node.
   * @return statusSnapshot
  **/
  @ApiModelProperty(example = "null", value = "The port status snapshot from the node.")
  public PortStatusSnapshotDTO getStatusSnapshot() {
    return statusSnapshot;
  }

  public void setStatusSnapshot(PortStatusSnapshotDTO statusSnapshot) {
    this.statusSnapshot = statusSnapshot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodePortStatusSnapshotDTO nodePortStatusSnapshotDTO = (NodePortStatusSnapshotDTO) o;
    return Objects.equals(this.nodeId, nodePortStatusSnapshotDTO.nodeId) &&
        Objects.equals(this.address, nodePortStatusSnapshotDTO.address) &&
        Objects.equals(this.apiPort, nodePortStatusSnapshotDTO.apiPort) &&
        Objects.equals(this.statusSnapshot, nodePortStatusSnapshotDTO.statusSnapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, address, apiPort, statusSnapshot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodePortStatusSnapshotDTO {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    apiPort: ").append(toIndentedString(apiPort)).append("\n");
    sb.append("    statusSnapshot: ").append(toIndentedString(statusSnapshot)).append("\n");
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

