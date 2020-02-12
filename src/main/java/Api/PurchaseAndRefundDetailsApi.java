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

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;


import org.joda.time.DateTime;
import Model.ReportingV3PurchaseRefundDetailsGet200Response;
import Model.Reportingv3ReportDownloadsGet400Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PurchaseAndRefundDetailsApi {
    private ApiClient apiClient;

    public PurchaseAndRefundDetailsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PurchaseAndRefundDetailsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getPurchaseAndRefundDetails
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param paymentSubtype Payment Subtypes.   - **ALL**:  All Payment Subtypes   - **VI** :  Visa   - **MC** :  Master Card   - **AX** :  American Express   - **DI** :  Discover   - **DP** :  Pinless Debit  (optional, default to ALL)
     * @param viewBy View results by Request Date or Submission Date.   - **requestDate** : Request Date   - **submissionDate**: Submission Date  (optional, default to requestDate)
     * @param groupName Valid CyberSource Group Name.User can define groups using CBAPI and Group Management Module in EBC2. Groups are collection of organizationIds (optional)
     * @param offset Offset of the Purchase and Refund Results. (optional)
     * @param limit Results count per page. Range(1-2000) (optional, default to 2000)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getPurchaseAndRefundDetailsCall(DateTime startTime, DateTime endTime, String organizationId, String paymentSubtype, String viewBy, String groupName, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/reporting/v3/purchase-refund-details";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
        if (organizationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));
        if (paymentSubtype != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "paymentSubtype", paymentSubtype));
        if (viewBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "viewBy", viewBy));
        if (groupName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupName", groupName));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPurchaseAndRefundDetailsValidateBeforeCall(DateTime startTime, DateTime endTime, String organizationId, String paymentSubtype, String viewBy, String groupName, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling getPurchaseAndRefundDetails(Async)");
        }
        
        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling getPurchaseAndRefundDetails(Async)");
        }
        
        
        okhttp3.Call call = getPurchaseAndRefundDetailsCall(startTime, endTime, organizationId, paymentSubtype, viewBy, groupName, offset, limit, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Purchase and Refund Details
     * Download the Purchase and Refund Details report. This report report includes all purchases and refund transactions, as well as all activities related to transactions resulting in an adjustment to the net proceeds. 
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param paymentSubtype Payment Subtypes.   - **ALL**:  All Payment Subtypes   - **VI** :  Visa   - **MC** :  Master Card   - **AX** :  American Express   - **DI** :  Discover   - **DP** :  Pinless Debit  (optional, default to ALL)
     * @param viewBy View results by Request Date or Submission Date.   - **requestDate** : Request Date   - **submissionDate**: Submission Date  (optional, default to requestDate)
     * @param groupName Valid CyberSource Group Name.User can define groups using CBAPI and Group Management Module in EBC2. Groups are collection of organizationIds (optional)
     * @param offset Offset of the Purchase and Refund Results. (optional)
     * @param limit Results count per page. Range(1-2000) (optional, default to 2000)
     * @return ReportingV3PurchaseRefundDetailsGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReportingV3PurchaseRefundDetailsGet200Response getPurchaseAndRefundDetails(DateTime startTime, DateTime endTime, String organizationId, String paymentSubtype, String viewBy, String groupName, Integer offset, Integer limit) throws ApiException {
        ApiResponse<ReportingV3PurchaseRefundDetailsGet200Response> resp = getPurchaseAndRefundDetailsWithHttpInfo(startTime, endTime, organizationId, paymentSubtype, viewBy, groupName, offset, limit);
        return resp.getData();
    }

    /**
     * Get Purchase and Refund Details
     * Download the Purchase and Refund Details report. This report report includes all purchases and refund transactions, as well as all activities related to transactions resulting in an adjustment to the net proceeds. 
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param paymentSubtype Payment Subtypes.   - **ALL**:  All Payment Subtypes   - **VI** :  Visa   - **MC** :  Master Card   - **AX** :  American Express   - **DI** :  Discover   - **DP** :  Pinless Debit  (optional, default to ALL)
     * @param viewBy View results by Request Date or Submission Date.   - **requestDate** : Request Date   - **submissionDate**: Submission Date  (optional, default to requestDate)
     * @param groupName Valid CyberSource Group Name.User can define groups using CBAPI and Group Management Module in EBC2. Groups are collection of organizationIds (optional)
     * @param offset Offset of the Purchase and Refund Results. (optional)
     * @param limit Results count per page. Range(1-2000) (optional, default to 2000)
     * @return ApiResponse&lt;ReportingV3PurchaseRefundDetailsGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReportingV3PurchaseRefundDetailsGet200Response> getPurchaseAndRefundDetailsWithHttpInfo(DateTime startTime, DateTime endTime, String organizationId, String paymentSubtype, String viewBy, String groupName, Integer offset, Integer limit) throws ApiException {
        okhttp3.Call call = getPurchaseAndRefundDetailsValidateBeforeCall(startTime, endTime, organizationId, paymentSubtype, viewBy, groupName, offset, limit, null, null);
        Type localVarReturnType = new TypeToken<ReportingV3PurchaseRefundDetailsGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Purchase and Refund Details (asynchronously)
     * Download the Purchase and Refund Details report. This report report includes all purchases and refund transactions, as well as all activities related to transactions resulting in an adjustment to the net proceeds. 
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param paymentSubtype Payment Subtypes.   - **ALL**:  All Payment Subtypes   - **VI** :  Visa   - **MC** :  Master Card   - **AX** :  American Express   - **DI** :  Discover   - **DP** :  Pinless Debit  (optional, default to ALL)
     * @param viewBy View results by Request Date or Submission Date.   - **requestDate** : Request Date   - **submissionDate**: Submission Date  (optional, default to requestDate)
     * @param groupName Valid CyberSource Group Name.User can define groups using CBAPI and Group Management Module in EBC2. Groups are collection of organizationIds (optional)
     * @param offset Offset of the Purchase and Refund Results. (optional)
     * @param limit Results count per page. Range(1-2000) (optional, default to 2000)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getPurchaseAndRefundDetailsAsync(DateTime startTime, DateTime endTime, String organizationId, String paymentSubtype, String viewBy, String groupName, Integer offset, Integer limit, final ApiCallback<ReportingV3PurchaseRefundDetailsGet200Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = getPurchaseAndRefundDetailsValidateBeforeCall(startTime, endTime, organizationId, paymentSubtype, viewBy, groupName, offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReportingV3PurchaseRefundDetailsGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
