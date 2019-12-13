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
import Model.Ptsv2creditsProcessingInformationBankTransferOptions;
import Model.Ptsv2creditsProcessingInformationElectronicBenefitsTransfer;
import Model.Ptsv2creditsProcessingInformationPurchaseOptions;
import Model.Ptsv2paymentsidrefundsProcessingInformationRecurringOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2creditsProcessingInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T15:49:19.042+05:30")
public class Ptsv2creditsProcessingInformation {
  @SerializedName("commerceIndicator")
  private String commerceIndicator = null;

  @SerializedName("processorId")
  private String processorId = null;

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

  @SerializedName("purchaseLevel")
  private String purchaseLevel = null;

  @SerializedName("industryDataType")
  private String industryDataType = null;

  @SerializedName("recurringOptions")
  private Ptsv2paymentsidrefundsProcessingInformationRecurringOptions recurringOptions = null;

  @SerializedName("bankTransferOptions")
  private Ptsv2creditsProcessingInformationBankTransferOptions bankTransferOptions = null;

  @SerializedName("purchaseOptions")
  private Ptsv2creditsProcessingInformationPurchaseOptions purchaseOptions = null;

  @SerializedName("electronicBenefitsTransfer")
  private Ptsv2creditsProcessingInformationElectronicBenefitsTransfer electronicBenefitsTransfer = null;

  public Ptsv2creditsProcessingInformation commerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
    return this;
  }

   /**
   * Type of transaction. Some payment card companies use this information when determining discount rates. When you omit this field for **Ingenico ePayments**, the processor uses the default transaction type they have on file for you instead of the default value listed here. 
   * @return commerceIndicator
  **/
  @ApiModelProperty(value = "Type of transaction. Some payment card companies use this information when determining discount rates. When you omit this field for **Ingenico ePayments**, the processor uses the default transaction type they have on file for you instead of the default value listed here. ")
  public String getCommerceIndicator() {
    return commerceIndicator;
  }

  public void setCommerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
  }

  public Ptsv2creditsProcessingInformation processorId(String processorId) {
    this.processorId = processorId;
    return this;
  }

   /**
   * Value that identifies the processor/acquirer to use for the transaction. This value is supported only for **CyberSource through VisaNet**.  Contact CyberSource Customer Support to get the value for this field. 
   * @return processorId
  **/
  @ApiModelProperty(value = "Value that identifies the processor/acquirer to use for the transaction. This value is supported only for **CyberSource through VisaNet**.  Contact CyberSource Customer Support to get the value for this field. ")
  public String getProcessorId() {
    return processorId;
  }

  public void setProcessorId(String processorId) {
    this.processorId = processorId;
  }

  public Ptsv2creditsProcessingInformation paymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
    return this;
  }

   /**
   * Type of digital payment solution for the transaction. Possible Values:   - &#x60;visacheckout&#x60;: Visa Checkout. This value is required for Visa Checkout transactions. For details, see &#x60;payment_solution&#x60; field description in [Visa Checkout Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/VCO_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  - &#x60;001&#x60;: Apple Pay.  - &#x60;004&#x60;: Cybersource In-App Solution.  - &#x60;005&#x60;: Masterpass. This value is required for Masterpass transactions on OmniPay Direct. For details, see \&quot;Masterpass\&quot; in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  - &#x60;006&#x60;: Android Pay.  - &#x60;007&#x60;: Chase Pay.  - &#x60;008&#x60;: Samsung Pay.  - &#x60;012&#x60;: Google Pay. 
   * @return paymentSolution
  **/
  @ApiModelProperty(value = "Type of digital payment solution for the transaction. Possible Values:   - `visacheckout`: Visa Checkout. This value is required for Visa Checkout transactions. For details, see `payment_solution` field description in [Visa Checkout Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/VCO_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  - `001`: Apple Pay.  - `004`: Cybersource In-App Solution.  - `005`: Masterpass. This value is required for Masterpass transactions on OmniPay Direct. For details, see \"Masterpass\" in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm)  - `006`: Android Pay.  - `007`: Chase Pay.  - `008`: Samsung Pay.  - `012`: Google Pay. ")
  public String getPaymentSolution() {
    return paymentSolution;
  }

  public void setPaymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
  }

  public Ptsv2creditsProcessingInformation reconciliationId(String reconciliationId) {
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

  public Ptsv2creditsProcessingInformation linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

   /**
   * Value that links the current authorization request to the original authorization request. Set this value to the ID that was returned in the reply message from the original authorization request.  This value is used for:  - Partial authorizations - Split shipments  For details, see &#x60;link_to_request&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return linkId
  **/
  @ApiModelProperty(value = "Value that links the current authorization request to the original authorization request. Set this value to the ID that was returned in the reply message from the original authorization request.  This value is used for:  - Partial authorizations - Split shipments  For details, see `link_to_request` field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getLinkId() {
    return linkId;
  }

  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }

  public Ptsv2creditsProcessingInformation reportGroup(String reportGroup) {
    this.reportGroup = reportGroup;
    return this;
  }

   /**
   * Attribute that lets you define custom grouping for your processor reports. This field is supported only for **Worldpay VAP**.  For details, see &#x60;report_group&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return reportGroup
  **/
  @ApiModelProperty(value = "Attribute that lets you define custom grouping for your processor reports. This field is supported only for **Worldpay VAP**.  For details, see `report_group` field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getReportGroup() {
    return reportGroup;
  }

  public void setReportGroup(String reportGroup) {
    this.reportGroup = reportGroup;
  }

  public Ptsv2creditsProcessingInformation visaCheckoutId(String visaCheckoutId) {
    this.visaCheckoutId = visaCheckoutId;
    return this;
  }

   /**
   * Identifier for the **Visa Checkout** order. Visa Checkout provides a unique order ID for every transaction in the Visa Checkout **callID** field.  For details, see the &#x60;vc_order_id&#x60; field description in [Visa Checkout Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/VCO_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) 
   * @return visaCheckoutId
  **/
  @ApiModelProperty(value = "Identifier for the **Visa Checkout** order. Visa Checkout provides a unique order ID for every transaction in the Visa Checkout **callID** field.  For details, see the `vc_order_id` field description in [Visa Checkout Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/VCO_SCMP_API/html/wwhelp/wwhimpl/js/html/wwhelp.htm) ")
  public String getVisaCheckoutId() {
    return visaCheckoutId;
  }

  public void setVisaCheckoutId(String visaCheckoutId) {
    this.visaCheckoutId = visaCheckoutId;
  }

  public Ptsv2creditsProcessingInformation purchaseLevel(String purchaseLevel) {
    this.purchaseLevel = purchaseLevel;
    return this;
  }

   /**
   * Set this field to 3 to indicate that the request includes Level III data.
   * @return purchaseLevel
  **/
  @ApiModelProperty(value = "Set this field to 3 to indicate that the request includes Level III data.")
  public String getPurchaseLevel() {
    return purchaseLevel;
  }

  public void setPurchaseLevel(String purchaseLevel) {
    this.purchaseLevel = purchaseLevel;
  }

  public Ptsv2creditsProcessingInformation industryDataType(String industryDataType) {
    this.industryDataType = industryDataType;
    return this;
  }

   /**
   * Flag that indicates that the transaction includes airline data or restaurant data.  This field must be set to &#x60;airline&#x60; in order for airline data to be sent to the processor.  For example, if this field is not set to airline or is not included in the request, CyberSource does not send airline data to the processor.  You must set this field to &#x60;restaurant&#x60; in order for restaurant data to be sent to the processor.  When this field is not set to restaurant or is not included in the request, CyberSource does not send restaurant data to the processor.  Possible Values:  - **airline** - **restaurant** 
   * @return industryDataType
  **/
  @ApiModelProperty(value = "Flag that indicates that the transaction includes airline data or restaurant data.  This field must be set to `airline` in order for airline data to be sent to the processor.  For example, if this field is not set to airline or is not included in the request, CyberSource does not send airline data to the processor.  You must set this field to `restaurant` in order for restaurant data to be sent to the processor.  When this field is not set to restaurant or is not included in the request, CyberSource does not send restaurant data to the processor.  Possible Values:  - **airline** - **restaurant** ")
  public String getIndustryDataType() {
    return industryDataType;
  }

  public void setIndustryDataType(String industryDataType) {
    this.industryDataType = industryDataType;
  }

  public Ptsv2creditsProcessingInformation recurringOptions(Ptsv2paymentsidrefundsProcessingInformationRecurringOptions recurringOptions) {
    this.recurringOptions = recurringOptions;
    return this;
  }

   /**
   * Get recurringOptions
   * @return recurringOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidrefundsProcessingInformationRecurringOptions getRecurringOptions() {
    return recurringOptions;
  }

  public void setRecurringOptions(Ptsv2paymentsidrefundsProcessingInformationRecurringOptions recurringOptions) {
    this.recurringOptions = recurringOptions;
  }

  public Ptsv2creditsProcessingInformation bankTransferOptions(Ptsv2creditsProcessingInformationBankTransferOptions bankTransferOptions) {
    this.bankTransferOptions = bankTransferOptions;
    return this;
  }

   /**
   * Get bankTransferOptions
   * @return bankTransferOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2creditsProcessingInformationBankTransferOptions getBankTransferOptions() {
    return bankTransferOptions;
  }

  public void setBankTransferOptions(Ptsv2creditsProcessingInformationBankTransferOptions bankTransferOptions) {
    this.bankTransferOptions = bankTransferOptions;
  }

  public Ptsv2creditsProcessingInformation purchaseOptions(Ptsv2creditsProcessingInformationPurchaseOptions purchaseOptions) {
    this.purchaseOptions = purchaseOptions;
    return this;
  }

   /**
   * Get purchaseOptions
   * @return purchaseOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2creditsProcessingInformationPurchaseOptions getPurchaseOptions() {
    return purchaseOptions;
  }

  public void setPurchaseOptions(Ptsv2creditsProcessingInformationPurchaseOptions purchaseOptions) {
    this.purchaseOptions = purchaseOptions;
  }

  public Ptsv2creditsProcessingInformation electronicBenefitsTransfer(Ptsv2creditsProcessingInformationElectronicBenefitsTransfer electronicBenefitsTransfer) {
    this.electronicBenefitsTransfer = electronicBenefitsTransfer;
    return this;
  }

   /**
   * Get electronicBenefitsTransfer
   * @return electronicBenefitsTransfer
  **/
  @ApiModelProperty(value = "")
  public Ptsv2creditsProcessingInformationElectronicBenefitsTransfer getElectronicBenefitsTransfer() {
    return electronicBenefitsTransfer;
  }

  public void setElectronicBenefitsTransfer(Ptsv2creditsProcessingInformationElectronicBenefitsTransfer electronicBenefitsTransfer) {
    this.electronicBenefitsTransfer = electronicBenefitsTransfer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2creditsProcessingInformation ptsv2creditsProcessingInformation = (Ptsv2creditsProcessingInformation) o;
    return Objects.equals(this.commerceIndicator, ptsv2creditsProcessingInformation.commerceIndicator) &&
        Objects.equals(this.processorId, ptsv2creditsProcessingInformation.processorId) &&
        Objects.equals(this.paymentSolution, ptsv2creditsProcessingInformation.paymentSolution) &&
        Objects.equals(this.reconciliationId, ptsv2creditsProcessingInformation.reconciliationId) &&
        Objects.equals(this.linkId, ptsv2creditsProcessingInformation.linkId) &&
        Objects.equals(this.reportGroup, ptsv2creditsProcessingInformation.reportGroup) &&
        Objects.equals(this.visaCheckoutId, ptsv2creditsProcessingInformation.visaCheckoutId) &&
        Objects.equals(this.purchaseLevel, ptsv2creditsProcessingInformation.purchaseLevel) &&
        Objects.equals(this.industryDataType, ptsv2creditsProcessingInformation.industryDataType) &&
        Objects.equals(this.recurringOptions, ptsv2creditsProcessingInformation.recurringOptions) &&
        Objects.equals(this.bankTransferOptions, ptsv2creditsProcessingInformation.bankTransferOptions) &&
        Objects.equals(this.purchaseOptions, ptsv2creditsProcessingInformation.purchaseOptions) &&
        Objects.equals(this.electronicBenefitsTransfer, ptsv2creditsProcessingInformation.electronicBenefitsTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commerceIndicator, processorId, paymentSolution, reconciliationId, linkId, reportGroup, visaCheckoutId, purchaseLevel, industryDataType, recurringOptions, bankTransferOptions, purchaseOptions, electronicBenefitsTransfer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2creditsProcessingInformation {\n");
    
    sb.append("    commerceIndicator: ").append(toIndentedString(commerceIndicator)).append("\n");
    sb.append("    processorId: ").append(toIndentedString(processorId)).append("\n");
    sb.append("    paymentSolution: ").append(toIndentedString(paymentSolution)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    reportGroup: ").append(toIndentedString(reportGroup)).append("\n");
    sb.append("    visaCheckoutId: ").append(toIndentedString(visaCheckoutId)).append("\n");
    sb.append("    purchaseLevel: ").append(toIndentedString(purchaseLevel)).append("\n");
    sb.append("    industryDataType: ").append(toIndentedString(industryDataType)).append("\n");
    sb.append("    recurringOptions: ").append(toIndentedString(recurringOptions)).append("\n");
    sb.append("    bankTransferOptions: ").append(toIndentedString(bankTransferOptions)).append("\n");
    sb.append("    purchaseOptions: ").append(toIndentedString(purchaseOptions)).append("\n");
    sb.append("    electronicBenefitsTransfer: ").append(toIndentedString(electronicBenefitsTransfer)).append("\n");
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

