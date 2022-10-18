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
import Model.Ptsv2paymentsIssuerInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidreversalsProcessingInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-17T14:26:30.480+05:30")
public class Ptsv2paymentsidreversalsProcessingInformation {
  @SerializedName("paymentSolution")
  private String paymentSolution = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("linkId")
  private String linkId = null;

  @SerializedName("reportGroup")
  private String reportGroup = null;

  @SerializedName("visaCheckoutId")
  private String visaCheckoutId = null;

  @SerializedName("issuer")
  private Ptsv2paymentsIssuerInformation issuer = null;

  public Ptsv2paymentsidreversalsProcessingInformation paymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
    return this;
  }

   /**
   * Type of digital payment solution for the transaction. Possible Values:   - &#x60;visacheckout&#x60;: Visa Checkout. This value is required for Visa Checkout transactions. For details, see &#x60;payment_solution&#x60; field description in [Visa Checkout Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/VCO_SCMP_API/html/)  - &#x60;001&#x60;: Apple Pay.  - &#x60;004&#x60;: Cybersource In-App Solution.  - &#x60;005&#x60;: Masterpass. This value is required for Masterpass transactions on OmniPay Direct. For details, see \&quot;Masterpass\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  - &#x60;006&#x60;: Android Pay.  - &#x60;007&#x60;: Chase Pay.  - &#x60;008&#x60;: Samsung Pay.  - &#x60;012&#x60;: Google Pay.  - &#x60;013&#x60;: Cybersource P2PE Decryption  - &#x60;014&#x60;: Mastercard credential on file (COF) payment network token. Returned in authorizations that use a payment network token associated with a TMS token.  - &#x60;015&#x60;: Visa credential on file (COF) payment network token. Returned in authorizations that use a payment network token associated with a TMS token.  - &#x60;027&#x60;: Click to Pay. 
   * @return paymentSolution
  **/
  @ApiModelProperty(value = "Type of digital payment solution for the transaction. Possible Values:   - `visacheckout`: Visa Checkout. This value is required for Visa Checkout transactions. For details, see `payment_solution` field description in [Visa Checkout Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/VCO_SCMP_API/html/)  - `001`: Apple Pay.  - `004`: Cybersource In-App Solution.  - `005`: Masterpass. This value is required for Masterpass transactions on OmniPay Direct. For details, see \"Masterpass\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  - `006`: Android Pay.  - `007`: Chase Pay.  - `008`: Samsung Pay.  - `012`: Google Pay.  - `013`: Cybersource P2PE Decryption  - `014`: Mastercard credential on file (COF) payment network token. Returned in authorizations that use a payment network token associated with a TMS token.  - `015`: Visa credential on file (COF) payment network token. Returned in authorizations that use a payment network token associated with a TMS token.  - `027`: Click to Pay. ")
  public String getPaymentSolution() {
    return paymentSolution;
  }

  public void setPaymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
  }

  public Ptsv2paymentsidreversalsProcessingInformation reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Please check with Cybersource customer support to see if your merchant account is configured correctly so you can include this field in your request. * For Payouts: max length for FDCCompass is String (22). 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Please check with Cybersource customer support to see if your merchant account is configured correctly so you can include this field in your request. * For Payouts: max length for FDCCompass is String (22). ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public Ptsv2paymentsidreversalsProcessingInformation linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

   /**
   * Value that links the current authorization request to the original authorization request. Set this value to the ID that was returned in the reply message from the original authorization request.  This value is used for:  - Partial authorizations - Split shipments  For details, see &#x60;link_to_request&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return linkId
  **/
  @ApiModelProperty(value = "Value that links the current authorization request to the original authorization request. Set this value to the ID that was returned in the reply message from the original authorization request.  This value is used for:  - Partial authorizations - Split shipments  For details, see `link_to_request` field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getLinkId() {
    return linkId;
  }

  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }

  public Ptsv2paymentsidreversalsProcessingInformation reportGroup(String reportGroup) {
    this.reportGroup = reportGroup;
    return this;
  }

   /**
   * Attribute that lets you define custom grouping for your processor reports. This field is supported only for **Worldpay VAP**.  For details, see &#x60;report_group&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return reportGroup
  **/
  @ApiModelProperty(value = "Attribute that lets you define custom grouping for your processor reports. This field is supported only for **Worldpay VAP**.  For details, see `report_group` field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getReportGroup() {
    return reportGroup;
  }

  public void setReportGroup(String reportGroup) {
    this.reportGroup = reportGroup;
  }

  public Ptsv2paymentsidreversalsProcessingInformation visaCheckoutId(String visaCheckoutId) {
    this.visaCheckoutId = visaCheckoutId;
    return this;
  }

   /**
   * Identifier for the **Visa Checkout** order. Visa Checkout provides a unique order ID for every transaction in the Visa Checkout **callID** field. 
   * @return visaCheckoutId
  **/
  @ApiModelProperty(value = "Identifier for the **Visa Checkout** order. Visa Checkout provides a unique order ID for every transaction in the Visa Checkout **callID** field. ")
  public String getVisaCheckoutId() {
    return visaCheckoutId;
  }

  public void setVisaCheckoutId(String visaCheckoutId) {
    this.visaCheckoutId = visaCheckoutId;
  }

  public Ptsv2paymentsidreversalsProcessingInformation issuer(Ptsv2paymentsIssuerInformation issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsIssuerInformation getIssuer() {
    return issuer;
  }

  public void setIssuer(Ptsv2paymentsIssuerInformation issuer) {
    this.issuer = issuer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidreversalsProcessingInformation ptsv2paymentsidreversalsProcessingInformation = (Ptsv2paymentsidreversalsProcessingInformation) o;
    return Objects.equals(this.paymentSolution, ptsv2paymentsidreversalsProcessingInformation.paymentSolution) &&
        Objects.equals(this.reconciliationId, ptsv2paymentsidreversalsProcessingInformation.reconciliationId) &&
        Objects.equals(this.linkId, ptsv2paymentsidreversalsProcessingInformation.linkId) &&
        Objects.equals(this.reportGroup, ptsv2paymentsidreversalsProcessingInformation.reportGroup) &&
        Objects.equals(this.visaCheckoutId, ptsv2paymentsidreversalsProcessingInformation.visaCheckoutId) &&
        Objects.equals(this.issuer, ptsv2paymentsidreversalsProcessingInformation.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSolution, reconciliationId, linkId, reportGroup, visaCheckoutId, issuer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidreversalsProcessingInformation {\n");
    
    sb.append("    paymentSolution: ").append(toIndentedString(paymentSolution)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    reportGroup: ").append(toIndentedString(reportGroup)).append("\n");
    sb.append("    visaCheckoutId: ").append(toIndentedString(visaCheckoutId)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

