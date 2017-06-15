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


package com.github.hermannpencole.nifi.swagger.client;

import com.github.hermannpencole.nifi.swagger.ApiException;
import com.github.hermannpencole.nifi.swagger.client.model.ComponentStateDTO;
import com.github.hermannpencole.nifi.swagger.client.model.PropertyDescriptorEntity;
import com.github.hermannpencole.nifi.swagger.client.model.ReportingTaskEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingTasksApi
 */
@Ignore
public class ReportingTasksApiTest {

    private final ReportingTasksApi api = new ReportingTasksApi();

    
    /**
     * Clears the state for a reporting task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearStateTest() throws ApiException {
        String id = null;
        ComponentStateDTO response = api.clearState(id);

        // TODO: test validations
    }
    
    /**
     * Gets a reporting task property descriptor
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPropertyDescriptorTest() throws ApiException {
        String id = null;
        String propertyName = null;
        PropertyDescriptorEntity response = api.getPropertyDescriptor(id, propertyName);

        // TODO: test validations
    }
    
    /**
     * Gets a reporting task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportingTaskTest() throws ApiException {
        String id = null;
        ReportingTaskEntity response = api.getReportingTask(id);

        // TODO: test validations
    }
    
    /**
     * Gets the state for a reporting task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStateTest() throws ApiException {
        String id = null;
        ComponentStateDTO response = api.getState(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a reporting task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeReportingTaskTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        ReportingTaskEntity response = api.removeReportingTask(id, version, clientId);

        // TODO: test validations
    }
    
    /**
     * Updates a reporting task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateReportingTaskTest() throws ApiException {
        String id = null;
        ReportingTaskEntity body = null;
        ReportingTaskEntity response = api.updateReportingTask(id, body);

        // TODO: test validations
    }
    
}
