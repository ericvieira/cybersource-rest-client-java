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
import Model.InlineResponse2002;
import Model.InlineResponse2011;
import Model.InlineResponse4007;
import Model.InlineResponse4041;
import Model.InlineResponse4221;
import Model.InlineResponse5003;
import Model.PostRegistrationBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantBoardingApi
 */
@Ignore
public class MerchantBoardingApiTest {

    private final MerchantBoardingApi api = new MerchantBoardingApi();

    
    /**
     * Gets all the information on a boarding registration
     *
     * This end point will get all information of a boarding registration 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRegistrationTest() throws ApiException {
        String registrationId = null;
        InlineResponse2002 response = api.getRegistration(registrationId);

        // TODO: test validations
    }
    
    /**
     * Create a boarding registration
     *
     * Create a registration to board merchant  If you have  Card Processing product enabled in your boarding request, select payment processor from Configuration -&gt; Sample Request. You may unselect attributes from the Request Builder tree which you do not need in the request. For VPC, CUP and EFTPOS processors, replace the processor name from VPC or CUP or EFTPOS to the actual processor name in the sample request. e.g. replace VPC with &amp;lt;your vpc processor&amp;gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postRegistrationTest() throws ApiException {
        PostRegistrationBody postRegistrationBody = null;
        String vCIdempotencyId = null;
        InlineResponse2011 response = api.postRegistration(postRegistrationBody, vCIdempotencyId);

        // TODO: test validations
    }
    
}
