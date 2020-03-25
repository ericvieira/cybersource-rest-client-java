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
import Model.InlineResponse4001;
import org.joda.time.LocalDate;
import Model.V1FileDetailsGet200Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecureFileShareApi
 */
@Ignore
public class SecureFileShareApiTest {

    private final SecureFileShareApi api = new SecureFileShareApi();

    
    /**
     * Download a File with File Identifier
     *
     * Download a file for the given file identifier
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileTest() throws ApiException {
        String fileId = null;
        String organizationId = null;
        api.getFile(fileId, organizationId);

        // TODO: test validations
    }
    
    /**
     * Get List of Files
     *
     * Get list of files and it&#39;s information of them available inside the report directory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileDetailTest() throws ApiException {
        LocalDate startDate = null;
        LocalDate endDate = null;
        String organizationId = null;
        String name = null;
        V1FileDetailsGet200Response response = api.getFileDetail(startDate, endDate, organizationId, name);

        // TODO: test validations
    }
    
}
