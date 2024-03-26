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
import com.konfigthis.client.model.FeedbackListFeedbackResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeedbackApi
 */
@Disabled
public class FeedbackApiTest {

    private static FeedbackApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new FeedbackApi(apiClient);
    }

    /**
     * Retrieve feedback
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFeedbackTest() throws ApiException {
        String type = null;
        FeedbackListFeedbackResponse response = api.listFeedback(type)
                .execute();
        // TODO: test validations
    }

}
