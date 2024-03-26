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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.TimesheetsClockInResponse;
import com.konfigthis.client.model.TimesheetsClockOutResponse;
import com.konfigthis.client.model.TimesheetsCreateOrUpdateTimesheetResponse;
import com.konfigthis.client.model.TimesheetsDeleteByTimesheetIdResponse;
import com.konfigthis.client.model.TimesheetsGetActiveAllocationsResponse;
import com.konfigthis.client.model.TimesheetsGetApprovalListResponse;
import com.konfigthis.client.model.TimesheetsGetPreferencesByCidResponse;
import com.konfigthis.client.model.TimesheetsListActivityTypesByCidResponse;
import com.konfigthis.client.model.TimesheetsUpdateStatusByTimesheetIdResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimesheetsApi
 */
@Disabled
public class TimesheetsApiTest {

    private static TimesheetsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TimesheetsApi(apiClient);
    }

    /**
     * Clock in.
     *
     * Allows to clock in.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clockInTest() throws ApiException {
        Integer proceedOutsideGeoFence = null;
        String description = null;
        Integer projectId = null;
        String projectManager = null;
        String categoryCode = null;
        String notes = null;
        String billable = null;
        String activity = null;
        String approvalRejectionReason = null;
        Double clockInLongitude = null;
        Double clockInLatitude = null;
        Double clockOutLongitude = null;
        Double clockOutLatitude = null;
        Integer projectAreaId = null;
        TimesheetsClockInResponse response = api.clockIn()
                .proceedOutsideGeoFence(proceedOutsideGeoFence)
                .description(description)
                .projectId(projectId)
                .projectManager(projectManager)
                .categoryCode(categoryCode)
                .notes(notes)
                .billable(billable)
                .activity(activity)
                .approvalRejectionReason(approvalRejectionReason)
                .clockInLongitude(clockInLongitude)
                .clockInLatitude(clockInLatitude)
                .clockOutLongitude(clockOutLongitude)
                .clockOutLatitude(clockOutLatitude)
                .projectAreaId(projectAreaId)
                .execute();
        // TODO: test validations
    }

    /**
     * Clock out.
     *
     * Allows user to clock out.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clockOutTest() throws ApiException {
        Integer proceedOutsideGeoFence = null;
        String description = null;
        Integer projectId = null;
        String projectManager = null;
        String categoryCode = null;
        String notes = null;
        String billable = null;
        String activity = null;
        String approvalRejectionReason = null;
        Double clockInLongitude = null;
        Double clockInLatitude = null;
        Double clockOutLongitude = null;
        Double clockOutLatitude = null;
        Integer projectAreaId = null;
        TimesheetsClockOutResponse response = api.clockOut()
                .proceedOutsideGeoFence(proceedOutsideGeoFence)
                .description(description)
                .projectId(projectId)
                .projectManager(projectManager)
                .categoryCode(categoryCode)
                .notes(notes)
                .billable(billable)
                .activity(activity)
                .approvalRejectionReason(approvalRejectionReason)
                .clockInLongitude(clockInLongitude)
                .clockInLatitude(clockInLatitude)
                .clockOutLongitude(clockOutLongitude)
                .clockOutLatitude(clockOutLatitude)
                .projectAreaId(projectAreaId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create/Update a timesheet.
     *
     * Creates a new timesheet and update existing timesheet.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOrUpdateTimesheetTest() throws ApiException {
        LocalDate date = null;
        Integer projectId = null;
        OffsetDateTime elapsedTime = null;
        Integer cardId = null;
        String description = null;
        Integer clockedOutsideGeofence = null;
        String projectManager = null;
        String categoryCode = null;
        String notes = null;
        String billable = null;
        String activity = null;
        String approvalRejectionReason = null;
        Double clockInLongitude = null;
        Double clockInLatitude = null;
        Double clockOutLongitude = null;
        Double clockOutLatitude = null;
        Integer projectAreaId = null;
        TimesheetsCreateOrUpdateTimesheetResponse response = api.createOrUpdateTimesheet(date, projectId, elapsedTime)
                .cardId(cardId)
                .description(description)
                .clockedOutsideGeofence(clockedOutsideGeofence)
                .projectManager(projectManager)
                .categoryCode(categoryCode)
                .notes(notes)
                .billable(billable)
                .activity(activity)
                .approvalRejectionReason(approvalRejectionReason)
                .clockInLongitude(clockInLongitude)
                .clockInLatitude(clockInLatitude)
                .clockOutLongitude(clockOutLongitude)
                .clockOutLatitude(clockOutLatitude)
                .projectAreaId(projectAreaId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a timesheet.
     *
     * Deletes a timesheet by Timesheet ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteByTimesheetIdTest() throws ApiException {
        Integer timesheetId = null;
        TimesheetsDeleteByTimesheetIdResponse response = api.deleteByTimesheetId(timesheetId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve my active allocations.
     *
     * Retrieve list of active allocations of user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getActiveAllocationsTest() throws ApiException {
        TimesheetsGetActiveAllocationsResponse response = api.getActiveAllocations()
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve timesheet approvals.
     *
     * Retrieve list of timesheet approvals on the basis of permission.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getApprovalListTest() throws ApiException {
        String startDate = null;
        String endDate = null;
        TimesheetsGetApprovalListResponse response = api.getApprovalList(startDate, endDate)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a timesheet by timesheet ID.
     *
     * Retrieve a timesheet by timesheet ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByTimesheetIdTest() throws ApiException {
        Integer timesheetId = null;
        String response = api.getByTimesheetId(timesheetId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve timesheets by User ID.
     *
     * Retrieve a list of timesheets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByUserIdTest() throws ApiException {
        String startDate = null;
        String endDate = null;
        String response = api.getByUserId()
                .startDate(startDate)
                .endDate(endDate)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve timesheet details by Timesheet ID.
     *
     * Retrieve timesheet details by Timesheet ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsByTimesheetIdTest() throws ApiException {
        Integer timeSheetId = null;
        Boolean flatcustomfields = null;
        String response = api.getDetailsByTimesheetId(timeSheetId)
                .flatcustomfields(flatcustomfields)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve my timesheet preferences.
     *
     * Retrieve list of timesheet preferences based in cid.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPreferencesByCidTest() throws ApiException {
        TimesheetsGetPreferencesByCidResponse response = api.getPreferencesByCid()
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve timecards by Timesheet ID.
     *
     * Retrieve a list of timecards.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTimecardsByTimesheetIdTest() throws ApiException {
        LocalDate startDate = null;
        LocalDate endDate = null;
        String response = api.getTimecardsByTimesheetId(startDate, endDate)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve list of activity types based on cid.
     *
     * Retrieve list of activity types based on cid.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listActivityTypesByCidTest() throws ApiException {
        TimesheetsListActivityTypesByCidResponse response = api.listActivityTypesByCid()
                .execute();
        // TODO: test validations
    }

    /**
     * Update timesheet status by Timesheet ID.
     *
     * Update the timesheet status (submit, approve, reject) corresponding to supplied Timesheet ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateStatusByTimesheetIdTest() throws ApiException {
        Integer timesheetId = null;
        String status = null;
        String comments = null;
        TimesheetsUpdateStatusByTimesheetIdResponse response = api.updateStatusByTimesheetId(timesheetId, status)
                .comments(comments)
                .execute();
        // TODO: test validations
    }

}
