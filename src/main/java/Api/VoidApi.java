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


import Model.PtsV2PaymentsPost502Response;
import Model.PtsV2PaymentsVoidsPost201Response;
import Model.PtsV2PaymentsVoidsPost400Response;
import Model.VoidCaptureRequest;
import Model.VoidCreditRequest;
import Model.VoidPaymentRequest;
import Model.VoidRefundRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoidApi {
    private ApiClient apiClient;

    public VoidApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VoidApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for voidCapture
     * @param voidCaptureRequest  (required)
     * @param id The capture ID returned from a previous capture request. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call voidCaptureCall(VoidCaptureRequest voidCaptureRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = voidCaptureRequest;
        
        // create path and map variables
        String localVarPath = "/pts/v2/captures/{id}/voids"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call voidCaptureValidateBeforeCall(VoidCaptureRequest voidCaptureRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'voidCaptureRequest' is set
        if (voidCaptureRequest == null) {
            throw new ApiException("Missing the required parameter 'voidCaptureRequest' when calling voidCapture(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling voidCapture(Async)");
        }
        
        
        com.squareup.okhttp.Call call = voidCaptureCall(voidCaptureRequest, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Void a Capture
     * Include the capture ID in the POST request to cancel the capture.
     * @param voidCaptureRequest  (required)
     * @param id The capture ID returned from a previous capture request. (required)
     * @return PtsV2PaymentsVoidsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2PaymentsVoidsPost201Response voidCapture(VoidCaptureRequest voidCaptureRequest, String id) throws ApiException {
        ApiResponse<PtsV2PaymentsVoidsPost201Response> resp = voidCaptureWithHttpInfo(voidCaptureRequest, id);
        return resp.getData();
    }

    /**
     * Void a Capture
     * Include the capture ID in the POST request to cancel the capture.
     * @param voidCaptureRequest  (required)
     * @param id The capture ID returned from a previous capture request. (required)
     * @return ApiResponse&lt;PtsV2PaymentsVoidsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2PaymentsVoidsPost201Response> voidCaptureWithHttpInfo(VoidCaptureRequest voidCaptureRequest, String id) throws ApiException {
	    com.squareup.okhttp.Call call = voidCaptureValidateBeforeCall(voidCaptureRequest, id, null, null);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsVoidsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Void a Capture (asynchronously)
     * Include the capture ID in the POST request to cancel the capture.
     * @param voidCaptureRequest  (required)
     * @param id The capture ID returned from a previous capture request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call voidCaptureAsync(VoidCaptureRequest voidCaptureRequest, String id, final ApiCallback<PtsV2PaymentsVoidsPost201Response> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = voidCaptureValidateBeforeCall(voidCaptureRequest, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsVoidsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for voidCredit
     * @param voidCreditRequest  (required)
     * @param id The credit ID returned from a previous credit request. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call voidCreditCall(VoidCreditRequest voidCreditRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = voidCreditRequest;
        
        // create path and map variables
        String localVarPath = "/pts/v2/credits/{id}/voids"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call voidCreditValidateBeforeCall(VoidCreditRequest voidCreditRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'voidCreditRequest' is set
        if (voidCreditRequest == null) {
            throw new ApiException("Missing the required parameter 'voidCreditRequest' when calling voidCredit(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling voidCredit(Async)");
        }
        
        
        com.squareup.okhttp.Call call = voidCreditCall(voidCreditRequest, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Void a Credit
     * Include the credit ID in the POST request to cancel the credit.
     * @param voidCreditRequest  (required)
     * @param id The credit ID returned from a previous credit request. (required)
     * @return PtsV2PaymentsVoidsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2PaymentsVoidsPost201Response voidCredit(VoidCreditRequest voidCreditRequest, String id) throws ApiException {
        ApiResponse<PtsV2PaymentsVoidsPost201Response> resp = voidCreditWithHttpInfo(voidCreditRequest, id);
        return resp.getData();
    }

    /**
     * Void a Credit
     * Include the credit ID in the POST request to cancel the credit.
     * @param voidCreditRequest  (required)
     * @param id The credit ID returned from a previous credit request. (required)
     * @return ApiResponse&lt;PtsV2PaymentsVoidsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2PaymentsVoidsPost201Response> voidCreditWithHttpInfo(VoidCreditRequest voidCreditRequest, String id) throws ApiException {
	    com.squareup.okhttp.Call call = voidCreditValidateBeforeCall(voidCreditRequest, id, null, null);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsVoidsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Void a Credit (asynchronously)
     * Include the credit ID in the POST request to cancel the credit.
     * @param voidCreditRequest  (required)
     * @param id The credit ID returned from a previous credit request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call voidCreditAsync(VoidCreditRequest voidCreditRequest, String id, final ApiCallback<PtsV2PaymentsVoidsPost201Response> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = voidCreditValidateBeforeCall(voidCreditRequest, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsVoidsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for voidPayment
     * @param voidPaymentRequest  (required)
     * @param id The payment ID returned from a previous payment request. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call voidPaymentCall(VoidPaymentRequest voidPaymentRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = voidPaymentRequest;
        
        // create path and map variables
        String localVarPath = "/pts/v2/payments/{id}/voids"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call voidPaymentValidateBeforeCall(VoidPaymentRequest voidPaymentRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'voidPaymentRequest' is set
        if (voidPaymentRequest == null) {
            throw new ApiException("Missing the required parameter 'voidPaymentRequest' when calling voidPayment(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling voidPayment(Async)");
        }
        
        
        com.squareup.okhttp.Call call = voidPaymentCall(voidPaymentRequest, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Void a Payment
     * Include the payment ID in the POST request to cancel the payment.
     * @param voidPaymentRequest  (required)
     * @param id The payment ID returned from a previous payment request. (required)
     * @return PtsV2PaymentsVoidsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2PaymentsVoidsPost201Response voidPayment(VoidPaymentRequest voidPaymentRequest, String id) throws ApiException {
        ApiResponse<PtsV2PaymentsVoidsPost201Response> resp = voidPaymentWithHttpInfo(voidPaymentRequest, id);
        return resp.getData();
    }

    /**
     * Void a Payment
     * Include the payment ID in the POST request to cancel the payment.
     * @param voidPaymentRequest  (required)
     * @param id The payment ID returned from a previous payment request. (required)
     * @return ApiResponse&lt;PtsV2PaymentsVoidsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2PaymentsVoidsPost201Response> voidPaymentWithHttpInfo(VoidPaymentRequest voidPaymentRequest, String id) throws ApiException {
	    com.squareup.okhttp.Call call = voidPaymentValidateBeforeCall(voidPaymentRequest, id, null, null);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsVoidsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Void a Payment (asynchronously)
     * Include the payment ID in the POST request to cancel the payment.
     * @param voidPaymentRequest  (required)
     * @param id The payment ID returned from a previous payment request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call voidPaymentAsync(VoidPaymentRequest voidPaymentRequest, String id, final ApiCallback<PtsV2PaymentsVoidsPost201Response> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = voidPaymentValidateBeforeCall(voidPaymentRequest, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsVoidsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for voidRefund
     * @param voidRefundRequest  (required)
     * @param id The refund ID returned from a previous refund request. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call voidRefundCall(VoidRefundRequest voidRefundRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = voidRefundRequest;
        
        // create path and map variables
        String localVarPath = "/pts/v2/refunds/{id}/voids"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call voidRefundValidateBeforeCall(VoidRefundRequest voidRefundRequest, String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'voidRefundRequest' is set
        if (voidRefundRequest == null) {
            throw new ApiException("Missing the required parameter 'voidRefundRequest' when calling voidRefund(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling voidRefund(Async)");
        }
        
        
        com.squareup.okhttp.Call call = voidRefundCall(voidRefundRequest, id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Void a Refund
     * Include the refund ID in the POST request to cancel the refund.
     * @param voidRefundRequest  (required)
     * @param id The refund ID returned from a previous refund request. (required)
     * @return PtsV2PaymentsVoidsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2PaymentsVoidsPost201Response voidRefund(VoidRefundRequest voidRefundRequest, String id) throws ApiException {
        ApiResponse<PtsV2PaymentsVoidsPost201Response> resp = voidRefundWithHttpInfo(voidRefundRequest, id);
        return resp.getData();
    }

    /**
     * Void a Refund
     * Include the refund ID in the POST request to cancel the refund.
     * @param voidRefundRequest  (required)
     * @param id The refund ID returned from a previous refund request. (required)
     * @return ApiResponse&lt;PtsV2PaymentsVoidsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2PaymentsVoidsPost201Response> voidRefundWithHttpInfo(VoidRefundRequest voidRefundRequest, String id) throws ApiException {
	    com.squareup.okhttp.Call call = voidRefundValidateBeforeCall(voidRefundRequest, id, null, null);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsVoidsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Void a Refund (asynchronously)
     * Include the refund ID in the POST request to cancel the refund.
     * @param voidRefundRequest  (required)
     * @param id The refund ID returned from a previous refund request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call voidRefundAsync(VoidRefundRequest voidRefundRequest, String id, final ApiCallback<PtsV2PaymentsVoidsPost201Response> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = voidRefundValidateBeforeCall(voidRefundRequest, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsVoidsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
