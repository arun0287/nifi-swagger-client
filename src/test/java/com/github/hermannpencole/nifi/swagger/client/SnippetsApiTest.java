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
import com.github.hermannpencole.nifi.swagger.client.model.SnippetEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SnippetsApi
 */
@Ignore
public class SnippetsApiTest {

    private final SnippetsApi api = new SnippetsApi();

    
    /**
     * Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSnippetTest() throws ApiException {
        SnippetEntity body = null;
        SnippetEntity response = api.createSnippet(body);

        // TODO: test validations
    }
    
    /**
     * Deletes the components in a snippet and discards the snippet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSnippetTest() throws ApiException {
        String id = null;
        SnippetEntity response = api.deleteSnippet(id);

        // TODO: test validations
    }
    
    /**
     * Move&#39;s the components in this Snippet into a new Process Group and discards the snippet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSnippetTest() throws ApiException {
        String id = null;
        SnippetEntity body = null;
        SnippetEntity response = api.updateSnippet(id, body);

        // TODO: test validations
    }
    
}
