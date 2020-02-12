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


import Model.PtsV2PaymentsRefundPost400Response;
import Model.UmsV1UsersGet200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManagementApi {
    private ApiClient apiClient;

    public UserManagementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getUsers
     * @param organizationId This is the orgId of the organization which the user belongs to. (optional)
     * @param userName User ID of the user you want to get details on. (optional)
     * @param permissionId permission that you are trying to search user on. (optional)
     * @param roleId role of the user you are trying to search on. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getUsersCall(String organizationId, String userName, String permissionId, String roleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ums/v1/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organizationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));
        if (userName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
        if (permissionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "permissionId", permissionId));
        if (roleId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "roleId", roleId));

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
    private okhttp3.Call getUsersValidateBeforeCall(String organizationId, String userName, String permissionId, String roleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        okhttp3.Call call = getUsersCall(organizationId, userName, permissionId, roleId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get User Information
     * This endpoint is to get all the user information depending on the filter criteria passed in the query.
     * @param organizationId This is the orgId of the organization which the user belongs to. (optional)
     * @param userName User ID of the user you want to get details on. (optional)
     * @param permissionId permission that you are trying to search user on. (optional)
     * @param roleId role of the user you are trying to search on. (optional)
     * @return UmsV1UsersGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UmsV1UsersGet200Response getUsers(String organizationId, String userName, String permissionId, String roleId) throws ApiException {
        ApiResponse<UmsV1UsersGet200Response> resp = getUsersWithHttpInfo(organizationId, userName, permissionId, roleId);
        return resp.getData();
    }

    /**
     * Get User Information
     * This endpoint is to get all the user information depending on the filter criteria passed in the query.
     * @param organizationId This is the orgId of the organization which the user belongs to. (optional)
     * @param userName User ID of the user you want to get details on. (optional)
     * @param permissionId permission that you are trying to search user on. (optional)
     * @param roleId role of the user you are trying to search on. (optional)
     * @return ApiResponse&lt;UmsV1UsersGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UmsV1UsersGet200Response> getUsersWithHttpInfo(String organizationId, String userName, String permissionId, String roleId) throws ApiException {
        okhttp3.Call call = getUsersValidateBeforeCall(organizationId, userName, permissionId, roleId, null, null);
        Type localVarReturnType = new TypeToken<UmsV1UsersGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get User Information (asynchronously)
     * This endpoint is to get all the user information depending on the filter criteria passed in the query.
     * @param organizationId This is the orgId of the organization which the user belongs to. (optional)
     * @param userName User ID of the user you want to get details on. (optional)
     * @param permissionId permission that you are trying to search user on. (optional)
     * @param roleId role of the user you are trying to search on. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getUsersAsync(String organizationId, String userName, String permissionId, String roleId, final ApiCallback<UmsV1UsersGet200Response> callback) throws ApiException {

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

        okhttp3.Call call = getUsersValidateBeforeCall(organizationId, userName, permissionId, roleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UmsV1UsersGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
