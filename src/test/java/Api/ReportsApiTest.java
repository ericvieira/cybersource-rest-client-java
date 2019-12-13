/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiException;
import Model.CreateAdhocReportRequest;
import Model.ReportingV3ReportsGet200Response;
import Model.ReportingV3ReportsIdGet200Response;
import org.joda.time.DateTime;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ReportsApi
 */
@Ignore
public class ReportsApiTest {

    private final ReportsApi api = new ReportsApi();

    
    /**
     * Create Adhoc Report
     *
     * Create a one-time report. You must specify the type of report in reportDefinitionName. For a list of values for reportDefinitionName, see the [Reporting Developer Guide](https://www.cybersource.com/developers/documentation/reporting_and_reconciliation) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReportTest() throws ApiException {
        CreateAdhocReportRequest createAdhocReportRequest = null;
        String organizationId = null;
        api.createReport(createAdhocReportRequest, organizationId);

        // TODO: test validations
    }
    
    /**
     * Get Report based on reportId
     *
     * Download a report using the reportId value. If you don’t already know this value, you can obtain it using the Retrieve available reports call. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportByReportIdTest() throws ApiException {
        String reportId = null;
        String organizationId = null;
        ReportingV3ReportsIdGet200Response response = api.getReportByReportId(reportId, organizationId);

        // TODO: test validations
    }
    
    /**
     * Retrieve available reports
     *
     * Retrieve a list of the available reports to which you are subscribed. This will also give you the reportId value, which you can also use to download a report. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchReportsTest() throws ApiException {
        DateTime startTime = null;
        DateTime endTime = null;
        String timeQueryType = null;
        String organizationId = null;
        String reportMimeType = null;
        String reportFrequency = null;
        String reportName = null;
        Integer reportDefinitionId = null;
        String reportStatus = null;
        ReportingV3ReportsGet200Response response = api.searchReports(startTime, endTime, timeQueryType, organizationId, reportMimeType, reportFrequency, reportName, reportDefinitionId, reportStatus);

        // TODO: test validations
    }
    
}
