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
import com.github.hermannpencole.nifi.swagger.client.model.NodeDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-15T23:51:49.699+02:00")
public class ClusterDTO {
  @SerializedName("nodes")
  private List<NodeDTO> nodes = new ArrayList<NodeDTO>();

  @SerializedName("generated")
  private String generated = null;

  public ClusterDTO nodes(List<NodeDTO> nodes) {
    this.nodes = nodes;
    return this;
  }

  public ClusterDTO addNodesItem(NodeDTO nodesItem) {
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * The collection of nodes that are part of the cluster.
   * @return nodes
  **/
  @ApiModelProperty(example = "null", value = "The collection of nodes that are part of the cluster.")
  public List<NodeDTO> getNodes() {
    return nodes;
  }

  public void setNodes(List<NodeDTO> nodes) {
    this.nodes = nodes;
  }

  public ClusterDTO generated(String generated) {
    this.generated = generated;
    return this;
  }

   /**
   * The timestamp the report was generated.
   * @return generated
  **/
  @ApiModelProperty(example = "null", value = "The timestamp the report was generated.")
  public String getGenerated() {
    return generated;
  }

  public void setGenerated(String generated) {
    this.generated = generated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterDTO clusterDTO = (ClusterDTO) o;
    return Objects.equals(this.nodes, clusterDTO.nodes) &&
        Objects.equals(this.generated, clusterDTO.generated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, generated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterDTO {\n");
    
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
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

