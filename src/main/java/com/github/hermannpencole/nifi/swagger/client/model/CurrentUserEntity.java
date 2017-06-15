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
import com.github.hermannpencole.nifi.swagger.client.model.PermissionsDTO;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CurrentUserEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-15T23:51:49.699+02:00")
public class CurrentUserEntity {
  @SerializedName("identity")
  private String identity = null;

  @SerializedName("anonymous")
  private Boolean anonymous = false;

  @SerializedName("provenancePermissions")
  private PermissionsDTO provenancePermissions = null;

  @SerializedName("countersPermissions")
  private PermissionsDTO countersPermissions = null;

  @SerializedName("tenantsPermissions")
  private PermissionsDTO tenantsPermissions = null;

  @SerializedName("controllerPermissions")
  private PermissionsDTO controllerPermissions = null;

  @SerializedName("policiesPermissions")
  private PermissionsDTO policiesPermissions = null;

  @SerializedName("systemPermissions")
  private PermissionsDTO systemPermissions = null;

  @SerializedName("restrictedComponentsPermissions")
  private PermissionsDTO restrictedComponentsPermissions = null;

  public CurrentUserEntity identity(String identity) {
    this.identity = identity;
    return this;
  }

   /**
   * The user identity being serialized.
   * @return identity
  **/
  @ApiModelProperty(example = "null", value = "The user identity being serialized.")
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public CurrentUserEntity anonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

   /**
   * Whether the current user is anonymous.
   * @return anonymous
  **/
  @ApiModelProperty(example = "null", value = "Whether the current user is anonymous.")
  public Boolean getAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  public CurrentUserEntity provenancePermissions(PermissionsDTO provenancePermissions) {
    this.provenancePermissions = provenancePermissions;
    return this;
  }

   /**
   * Permissions for querying provenance.
   * @return provenancePermissions
  **/
  @ApiModelProperty(example = "null", value = "Permissions for querying provenance.")
  public PermissionsDTO getProvenancePermissions() {
    return provenancePermissions;
  }

  public void setProvenancePermissions(PermissionsDTO provenancePermissions) {
    this.provenancePermissions = provenancePermissions;
  }

  public CurrentUserEntity countersPermissions(PermissionsDTO countersPermissions) {
    this.countersPermissions = countersPermissions;
    return this;
  }

   /**
   * Permissions for accessing counters.
   * @return countersPermissions
  **/
  @ApiModelProperty(example = "null", value = "Permissions for accessing counters.")
  public PermissionsDTO getCountersPermissions() {
    return countersPermissions;
  }

  public void setCountersPermissions(PermissionsDTO countersPermissions) {
    this.countersPermissions = countersPermissions;
  }

  public CurrentUserEntity tenantsPermissions(PermissionsDTO tenantsPermissions) {
    this.tenantsPermissions = tenantsPermissions;
    return this;
  }

   /**
   * Permissions for accessing tenants.
   * @return tenantsPermissions
  **/
  @ApiModelProperty(example = "null", value = "Permissions for accessing tenants.")
  public PermissionsDTO getTenantsPermissions() {
    return tenantsPermissions;
  }

  public void setTenantsPermissions(PermissionsDTO tenantsPermissions) {
    this.tenantsPermissions = tenantsPermissions;
  }

  public CurrentUserEntity controllerPermissions(PermissionsDTO controllerPermissions) {
    this.controllerPermissions = controllerPermissions;
    return this;
  }

   /**
   * Permissions for accessing the controller.
   * @return controllerPermissions
  **/
  @ApiModelProperty(example = "null", value = "Permissions for accessing the controller.")
  public PermissionsDTO getControllerPermissions() {
    return controllerPermissions;
  }

  public void setControllerPermissions(PermissionsDTO controllerPermissions) {
    this.controllerPermissions = controllerPermissions;
  }

  public CurrentUserEntity policiesPermissions(PermissionsDTO policiesPermissions) {
    this.policiesPermissions = policiesPermissions;
    return this;
  }

   /**
   * Permissions for accessing the policies.
   * @return policiesPermissions
  **/
  @ApiModelProperty(example = "null", value = "Permissions for accessing the policies.")
  public PermissionsDTO getPoliciesPermissions() {
    return policiesPermissions;
  }

  public void setPoliciesPermissions(PermissionsDTO policiesPermissions) {
    this.policiesPermissions = policiesPermissions;
  }

  public CurrentUserEntity systemPermissions(PermissionsDTO systemPermissions) {
    this.systemPermissions = systemPermissions;
    return this;
  }

   /**
   * Permissions for accessing system.
   * @return systemPermissions
  **/
  @ApiModelProperty(example = "null", value = "Permissions for accessing system.")
  public PermissionsDTO getSystemPermissions() {
    return systemPermissions;
  }

  public void setSystemPermissions(PermissionsDTO systemPermissions) {
    this.systemPermissions = systemPermissions;
  }

  public CurrentUserEntity restrictedComponentsPermissions(PermissionsDTO restrictedComponentsPermissions) {
    this.restrictedComponentsPermissions = restrictedComponentsPermissions;
    return this;
  }

   /**
   * Permissions for accessing restricted components. Note: the read permission are not used and will always be false.
   * @return restrictedComponentsPermissions
  **/
  @ApiModelProperty(example = "null", value = "Permissions for accessing restricted components. Note: the read permission are not used and will always be false.")
  public PermissionsDTO getRestrictedComponentsPermissions() {
    return restrictedComponentsPermissions;
  }

  public void setRestrictedComponentsPermissions(PermissionsDTO restrictedComponentsPermissions) {
    this.restrictedComponentsPermissions = restrictedComponentsPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserEntity currentUserEntity = (CurrentUserEntity) o;
    return Objects.equals(this.identity, currentUserEntity.identity) &&
        Objects.equals(this.anonymous, currentUserEntity.anonymous) &&
        Objects.equals(this.provenancePermissions, currentUserEntity.provenancePermissions) &&
        Objects.equals(this.countersPermissions, currentUserEntity.countersPermissions) &&
        Objects.equals(this.tenantsPermissions, currentUserEntity.tenantsPermissions) &&
        Objects.equals(this.controllerPermissions, currentUserEntity.controllerPermissions) &&
        Objects.equals(this.policiesPermissions, currentUserEntity.policiesPermissions) &&
        Objects.equals(this.systemPermissions, currentUserEntity.systemPermissions) &&
        Objects.equals(this.restrictedComponentsPermissions, currentUserEntity.restrictedComponentsPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity, anonymous, provenancePermissions, countersPermissions, tenantsPermissions, controllerPermissions, policiesPermissions, systemPermissions, restrictedComponentsPermissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserEntity {\n");
    
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    provenancePermissions: ").append(toIndentedString(provenancePermissions)).append("\n");
    sb.append("    countersPermissions: ").append(toIndentedString(countersPermissions)).append("\n");
    sb.append("    tenantsPermissions: ").append(toIndentedString(tenantsPermissions)).append("\n");
    sb.append("    controllerPermissions: ").append(toIndentedString(controllerPermissions)).append("\n");
    sb.append("    policiesPermissions: ").append(toIndentedString(policiesPermissions)).append("\n");
    sb.append("    systemPermissions: ").append(toIndentedString(systemPermissions)).append("\n");
    sb.append("    restrictedComponentsPermissions: ").append(toIndentedString(restrictedComponentsPermissions)).append("\n");
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

