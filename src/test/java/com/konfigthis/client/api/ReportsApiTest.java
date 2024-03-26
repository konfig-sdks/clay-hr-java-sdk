/*
 * Expense Reports
 * API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ReportsGetContentForReportResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportsApi
 */
@Disabled
public class ReportsApiTest {

    private static ReportsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ReportsApi(apiClient);
    }

    /**
     * Get content for report by analytic Id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getContentByAnalyticIdTest() throws ApiException {
        String analyticId = null;
        String authorization = null;
        Object response = api.getContentByAnalyticId(analyticId)
                .authorization(authorization)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve report content
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getContentForReportTest() throws ApiException {
        Integer analyticId = null;
        ReportsGetContentForReportResponse response = api.getContentForReport(analyticId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get report
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReportDetailsTest() throws ApiException {
        String analyticId = null;
        String authorization = null;
        Object response = api.getReportDetails(analyticId)
                .authorization(authorization)
                .execute();
        // TODO: test validations
    }

}
