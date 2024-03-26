package com.konfigthis.client;

import com.konfigthis.client.api.AnnouncementApi;
import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.CandidatesApi;
import com.konfigthis.client.api.CustomFieldsApi;
import com.konfigthis.client.api.DependentsApi;
import com.konfigthis.client.api.DocumentLibraryApi;
import com.konfigthis.client.api.ExpenseReportsApi;
import com.konfigthis.client.api.FeedbackApi;
import com.konfigthis.client.api.FormsApi;
import com.konfigthis.client.api.GoalsApi;
import com.konfigthis.client.api.InvoiceApi;
import com.konfigthis.client.api.JobProfilesApi;
import com.konfigthis.client.api.LeavesApi;
import com.konfigthis.client.api.ObjectiveApi;
import com.konfigthis.client.api.OrgUnitsApi;
import com.konfigthis.client.api.OrgRelationApi;
import com.konfigthis.client.api.PayStubsApi;
import com.konfigthis.client.api.PeopleAndPermissionsApi;
import com.konfigthis.client.api.PerformanceReviewApi;
import com.konfigthis.client.api.PerformanceReviewAssignmentApi;
import com.konfigthis.client.api.PositionsApi;
import com.konfigthis.client.api.ProjectApi;
import com.konfigthis.client.api.ReportsApi;
import com.konfigthis.client.api.ShiftsApi;
import com.konfigthis.client.api.SkillsApi;
import com.konfigthis.client.api.SurveyApi;
import com.konfigthis.client.api.TestApi;
import com.konfigthis.client.api.TimecardsApi;
import com.konfigthis.client.api.TimesheetsApi;
import com.konfigthis.client.api.TrainingsApi;
import com.konfigthis.client.api.UserPtoPoliciesApi;
import com.konfigthis.client.api.UserWorkflowApi;
import com.konfigthis.client.api.WorkflowsApi;

public class ClayHr {
    private ApiClient apiClient;
    public final AnnouncementApi announcement;
    public final AuthenticationApi authentication;
    public final CandidatesApi candidates;
    public final CustomFieldsApi customFields;
    public final DependentsApi dependents;
    public final DocumentLibraryApi documentLibrary;
    public final ExpenseReportsApi expenseReports;
    public final FeedbackApi feedback;
    public final FormsApi forms;
    public final GoalsApi goals;
    public final InvoiceApi invoice;
    public final JobProfilesApi jobProfiles;
    public final LeavesApi leaves;
    public final ObjectiveApi objective;
    public final OrgUnitsApi orgUnits;
    public final OrgRelationApi orgRelation;
    public final PayStubsApi payStubs;
    public final PeopleAndPermissionsApi peopleAndPermissions;
    public final PerformanceReviewApi performanceReview;
    public final PerformanceReviewAssignmentApi performanceReviewAssignment;
    public final PositionsApi positions;
    public final ProjectApi project;
    public final ReportsApi reports;
    public final ShiftsApi shifts;
    public final SkillsApi skills;
    public final SurveyApi survey;
    public final TestApi test;
    public final TimecardsApi timecards;
    public final TimesheetsApi timesheets;
    public final TrainingsApi trainings;
    public final UserPtoPoliciesApi userPtoPolicies;
    public final UserWorkflowApi userWorkflow;
    public final WorkflowsApi workflows;

    public ClayHr() {
        this(null);
    }

    public ClayHr(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.announcement = new AnnouncementApi(this.apiClient);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.candidates = new CandidatesApi(this.apiClient);
        this.customFields = new CustomFieldsApi(this.apiClient);
        this.dependents = new DependentsApi(this.apiClient);
        this.documentLibrary = new DocumentLibraryApi(this.apiClient);
        this.expenseReports = new ExpenseReportsApi(this.apiClient);
        this.feedback = new FeedbackApi(this.apiClient);
        this.forms = new FormsApi(this.apiClient);
        this.goals = new GoalsApi(this.apiClient);
        this.invoice = new InvoiceApi(this.apiClient);
        this.jobProfiles = new JobProfilesApi(this.apiClient);
        this.leaves = new LeavesApi(this.apiClient);
        this.objective = new ObjectiveApi(this.apiClient);
        this.orgUnits = new OrgUnitsApi(this.apiClient);
        this.orgRelation = new OrgRelationApi(this.apiClient);
        this.payStubs = new PayStubsApi(this.apiClient);
        this.peopleAndPermissions = new PeopleAndPermissionsApi(this.apiClient);
        this.performanceReview = new PerformanceReviewApi(this.apiClient);
        this.performanceReviewAssignment = new PerformanceReviewAssignmentApi(this.apiClient);
        this.positions = new PositionsApi(this.apiClient);
        this.project = new ProjectApi(this.apiClient);
        this.reports = new ReportsApi(this.apiClient);
        this.shifts = new ShiftsApi(this.apiClient);
        this.skills = new SkillsApi(this.apiClient);
        this.survey = new SurveyApi(this.apiClient);
        this.test = new TestApi(this.apiClient);
        this.timecards = new TimecardsApi(this.apiClient);
        this.timesheets = new TimesheetsApi(this.apiClient);
        this.trainings = new TrainingsApi(this.apiClient);
        this.userPtoPolicies = new UserPtoPoliciesApi(this.apiClient);
        this.userWorkflow = new UserWorkflowApi(this.apiClient);
        this.workflows = new WorkflowsApi(this.apiClient);
    }

}
