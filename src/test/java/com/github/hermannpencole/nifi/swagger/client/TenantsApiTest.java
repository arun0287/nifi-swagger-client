/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.1.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client;

import com.github.hermannpencole.nifi.swagger.ApiException;
import com.github.hermannpencole.nifi.swagger.client.model.TenantsEntity;
import com.github.hermannpencole.nifi.swagger.client.model.UserEntity;
import com.github.hermannpencole.nifi.swagger.client.model.UserGroupEntity;
import com.github.hermannpencole.nifi.swagger.client.model.UserGroupsEntity;
import com.github.hermannpencole.nifi.swagger.client.model.UsersEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TenantsApi
 */
@Ignore
public class TenantsApiTest {

    private final TenantsApi api = new TenantsApi();

    
    /**
     * Creates a user
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        UserEntity body = null;
        UserEntity response = api.createUser(body);

        // TODO: test validations
    }
    
    /**
     * Creates a user group
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserGroupTest() throws ApiException {
        UserGroupEntity body = null;
        UserGroupEntity response = api.createUserGroup(body);

        // TODO: test validations
    }
    
    /**
     * Gets a user
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String id = null;
        UserEntity response = api.getUser(id);

        // TODO: test validations
    }
    
    /**
     * Gets a user group
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserGroupTest() throws ApiException {
        String id = null;
        UserGroupEntity response = api.getUserGroup(id);

        // TODO: test validations
    }
    
    /**
     * Gets all user groups
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserGroupsTest() throws ApiException {
        UserGroupsEntity response = api.getUserGroups();

        // TODO: test validations
    }
    
    /**
     * Gets all users
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        UsersEntity response = api.getUsers();

        // TODO: test validations
    }
    
    /**
     * Deletes a user
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeUserTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        UserEntity response = api.removeUser(id, version, clientId);

        // TODO: test validations
    }
    
    /**
     * Deletes a user group
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeUserGroupTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        UserGroupEntity response = api.removeUserGroup(id, version, clientId);

        // TODO: test validations
    }
    
    /**
     * Searches for a tenant with the specified identity
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchClusterTest() throws ApiException {
        String q = null;
        TenantsEntity response = api.searchCluster(q);

        // TODO: test validations
    }
    
    /**
     * Updates a user
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String id = null;
        UserEntity body = null;
        UserEntity response = api.updateUser(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates a user group
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserGroupTest() throws ApiException {
        String id = null;
        UserGroupEntity body = null;
        UserGroupEntity response = api.updateUserGroup(id, body);

        // TODO: test validations
    }
    
}