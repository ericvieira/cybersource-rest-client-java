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
import Model.PtsV2PaymentsPost502Response;
import Model.RiskV1AddressVerificationsPost201Response;
import Model.RiskV1DecisionsPost400Response;
import Model.RiskV1ExportComplianceInquiriesPost201Response;
import Model.ValidateExportComplianceRequest;
import Model.VerifyCustomerAddressRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VerificationApi
 */
@Ignore
public class VerificationApiTest {

    private final VerificationApi api = new VerificationApi();

    
    /**
     * Verify customer address
     *
     * This call verifies that the customer address submitted is valid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void riskV1AddressVerificationsPostTest() throws ApiException {
        VerifyCustomerAddressRequest verifyCustomerAddressRequest = null;
        RiskV1AddressVerificationsPost201Response response = api.riskV1AddressVerificationsPost(verifyCustomerAddressRequest);

        // TODO: test validations
    }
    
    /**
     * Validate export compliance
     *
     * This call checks customer data against specified watch lists to ensure export compliance. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void riskV1ExportComplianceInquiriesPostTest() throws ApiException {
        ValidateExportComplianceRequest validateExportComplianceRequest = null;
        RiskV1ExportComplianceInquiriesPost201Response response = api.riskV1ExportComplianceInquiriesPost(validateExportComplianceRequest);

        // TODO: test validations
    }
    
}
