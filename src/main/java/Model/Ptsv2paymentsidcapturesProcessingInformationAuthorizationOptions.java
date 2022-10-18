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


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-17T14:26:30.480+05:30")
public class Ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions {
  @SerializedName("authType")
  private String authType = null;

  @SerializedName("verbalAuthCode")
  private String verbalAuthCode = null;

  @SerializedName("verbalAuthTransactionId")
  private String verbalAuthTransactionId = null;

  public Ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions authType(String authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Authorization type. Possible values:   - &#x60;AUTOCAPTURE&#x60;: automatic capture.  - &#x60;STANDARDCAPTURE&#x60;: standard capture.  - &#x60;VERBAL&#x60;: forced capture. Include it in the payment request for a forced capture. Include it in the capture request for a verbal payment.  #### Asia, Middle East, and Africa Gateway; Cielo; Comercio Latino; and CyberSource Latin American Processing Set this field to &#x60;AUTOCAPTURE&#x60; and include it in a bundled request to indicate that you are requesting an automatic capture. If your account is configured to enable automatic captures, set this field to &#x60;STANDARDCAPTURE&#x60; and include it in a standard authorization or bundled request to indicate that you are overriding an automatic capture. For more information, see the &#x60;auth_type&#x60; field description in [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Forced Capture Set this field to &#x60;VERBAL&#x60; and include it in the authorization request to indicate that you are performing a forced capture; therefore, you receive the authorization code outside the CyberSource system.  #### Verbal Authorization Set this field to &#x60;VERBAL&#x60; and include it in the capture request to indicate that the request is for a verbal authorization. For more information, see \&quot;Verbal Authorizations\&quot; in [Credit Card Services Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html). 
   * @return authType
  **/
  @ApiModelProperty(value = "Authorization type. Possible values:   - `AUTOCAPTURE`: automatic capture.  - `STANDARDCAPTURE`: standard capture.  - `VERBAL`: forced capture. Include it in the payment request for a forced capture. Include it in the capture request for a verbal payment.  #### Asia, Middle East, and Africa Gateway; Cielo; Comercio Latino; and CyberSource Latin American Processing Set this field to `AUTOCAPTURE` and include it in a bundled request to indicate that you are requesting an automatic capture. If your account is configured to enable automatic captures, set this field to `STANDARDCAPTURE` and include it in a standard authorization or bundled request to indicate that you are overriding an automatic capture. For more information, see the `auth_type` field description in [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Forced Capture Set this field to `VERBAL` and include it in the authorization request to indicate that you are performing a forced capture; therefore, you receive the authorization code outside the CyberSource system.  #### Verbal Authorization Set this field to `VERBAL` and include it in the capture request to indicate that the request is for a verbal authorization. For more information, see \"Verbal Authorizations\" in [Credit Card Services Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html). ")
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(String authType) {
    this.authType = authType;
  }

  public Ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions verbalAuthCode(String verbalAuthCode) {
    this.verbalAuthCode = verbalAuthCode;
    return this;
  }

   /**
   * Authorization code.  #### Forced Capture Use this field to send the authorization code you received from a payment that you authorized outside the CyberSource system.  #### PIN debit Authorization code that is returned by the processor.  Returned by PIN debit purchase.  #### Verbal Authorization Use this field in CAPTURE API to send the verbally received authorization code.  For processor-specific information, see the &#x60;auth_code&#x60; field description in [Credit Card Services Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html). 
   * @return verbalAuthCode
  **/
  @ApiModelProperty(value = "Authorization code.  #### Forced Capture Use this field to send the authorization code you received from a payment that you authorized outside the CyberSource system.  #### PIN debit Authorization code that is returned by the processor.  Returned by PIN debit purchase.  #### Verbal Authorization Use this field in CAPTURE API to send the verbally received authorization code.  For processor-specific information, see the `auth_code` field description in [Credit Card Services Using the SCMP API](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html). ")
  public String getVerbalAuthCode() {
    return verbalAuthCode;
  }

  public void setVerbalAuthCode(String verbalAuthCode) {
    this.verbalAuthCode = verbalAuthCode;
  }

  public Ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions verbalAuthTransactionId(String verbalAuthTransactionId) {
    this.verbalAuthTransactionId = verbalAuthTransactionId;
    return this;
  }

   /**
   * Transaction ID (TID).  #### FDMS South This field is required for verbal authorizations and forced captures with the American Express card type to comply with the CAPN requirements: - Forced capture: Obtain the value for this field from the authorization response. - Verbal authorization: You cannot obtain a value for this field so CyberSource uses the default value of &#x60;000000000000000&#x60; (15 zeros). 
   * @return verbalAuthTransactionId
  **/
  @ApiModelProperty(value = "Transaction ID (TID).  #### FDMS South This field is required for verbal authorizations and forced captures with the American Express card type to comply with the CAPN requirements: - Forced capture: Obtain the value for this field from the authorization response. - Verbal authorization: You cannot obtain a value for this field so CyberSource uses the default value of `000000000000000` (15 zeros). ")
  public String getVerbalAuthTransactionId() {
    return verbalAuthTransactionId;
  }

  public void setVerbalAuthTransactionId(String verbalAuthTransactionId) {
    this.verbalAuthTransactionId = verbalAuthTransactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions = (Ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions) o;
    return Objects.equals(this.authType, ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions.authType) &&
        Objects.equals(this.verbalAuthCode, ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions.verbalAuthCode) &&
        Objects.equals(this.verbalAuthTransactionId, ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions.verbalAuthTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, verbalAuthCode, verbalAuthTransactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidcapturesProcessingInformationAuthorizationOptions {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    verbalAuthCode: ").append(toIndentedString(verbalAuthCode)).append("\n");
    sb.append("    verbalAuthTransactionId: ").append(toIndentedString(verbalAuthTransactionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

