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
import Model.PtsV2PaymentsPost201ResponseProcessorInformationAchVerification;
import Model.PtsV2PaymentsPost201ResponseProcessorInformationAvs;
import Model.Riskv1decisionsCardVerification;
import Model.TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults;
import Model.TssV2TransactionsGet200ResponseProcessorInformationProcessor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsGet200ResponseProcessorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-26T01:49:30.319+05:30")
public class TssV2TransactionsGet200ResponseProcessorInformation {
  @SerializedName("processor")
  private TssV2TransactionsGet200ResponseProcessorInformationProcessor processor = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("networkTransactionId")
  private String networkTransactionId = null;

  @SerializedName("responseId")
  private String responseId = null;

  @SerializedName("providerTransactionId")
  private String providerTransactionId = null;

  @SerializedName("approvalCode")
  private String approvalCode = null;

  @SerializedName("responseCode")
  private String responseCode = null;

  @SerializedName("avs")
  private PtsV2PaymentsPost201ResponseProcessorInformationAvs avs = null;

  @SerializedName("cardVerification")
  private Riskv1decisionsCardVerification cardVerification = null;

  @SerializedName("achVerification")
  private PtsV2PaymentsPost201ResponseProcessorInformationAchVerification achVerification = null;

  @SerializedName("electronicVerificationResults")
  private TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults electronicVerificationResults = null;

  @SerializedName("systemTraceAuditNumber")
  private String systemTraceAuditNumber = null;

  @SerializedName("responseCodeSource")
  private String responseCodeSource = null;

  public TssV2TransactionsGet200ResponseProcessorInformation processor(TssV2TransactionsGet200ResponseProcessorInformationProcessor processor) {
    this.processor = processor;
    return this;
  }

   /**
   * Get processor
   * @return processor
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseProcessorInformationProcessor getProcessor() {
    return processor;
  }

  public void setProcessor(TssV2TransactionsGet200ResponseProcessorInformationProcessor processor) {
    this.processor = processor;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Network transaction identifier (TID). You can use this value to identify a specific transaction when you are discussing the transaction with your processor. Not all processors provide this value.  #### Cielo For Cielo, this value is the non-sequential unit (NSU) and is supported for all transactions. The value is generated by Cielo or the issuing bank.  #### Comercio Latino For Comercio Latino, this value is the proof of sale or non-sequential unit (NSU) number generated by the acquirers Cielo and Rede, or the issuing bank.  #### CyberSource through VisaNet and GPN For details about this value for CyberSource through VisaNet and GPN, see \&quot;Network Transaction Identifiers\&quot; in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return transactionId
  **/
  @ApiModelProperty(value = "Network transaction identifier (TID). You can use this value to identify a specific transaction when you are discussing the transaction with your processor. Not all processors provide this value.  #### Cielo For Cielo, this value is the non-sequential unit (NSU) and is supported for all transactions. The value is generated by Cielo or the issuing bank.  #### Comercio Latino For Comercio Latino, this value is the proof of sale or non-sequential unit (NSU) number generated by the acquirers Cielo and Rede, or the issuing bank.  #### CyberSource through VisaNet and GPN For details about this value for CyberSource through VisaNet and GPN, see \"Network Transaction Identifiers\" in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation networkTransactionId(String networkTransactionId) {
    this.networkTransactionId = networkTransactionId;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return networkTransactionId
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getNetworkTransactionId() {
    return networkTransactionId;
  }

  public void setNetworkTransactionId(String networkTransactionId) {
    this.networkTransactionId = networkTransactionId;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

   /**
   * Response ID sent from the processor. 
   * @return responseId
  **/
  @ApiModelProperty(value = "Response ID sent from the processor. ")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation providerTransactionId(String providerTransactionId) {
    this.providerTransactionId = providerTransactionId;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return providerTransactionId
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getProviderTransactionId() {
    return providerTransactionId;
  }

  public void setProviderTransactionId(String providerTransactionId) {
    this.providerTransactionId = providerTransactionId;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

   /**
   * Authorization code. Returned only when the processor returns this value. 
   * @return approvalCode
  **/
  @ApiModelProperty(value = "Authorization code. Returned only when the processor returns this value. ")
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of the authorization.  #### AIBMS If this value is &#x60;08&#x60;, you can accept the transaction if the customer provides you with identification.  #### Atos This value is the response code sent from Atos and it might also include the response code from the bank. Format: &#x60;aa,bb&#x60; with the two values separated by a comma and where: - &#x60;aa&#x60; is the two-digit error message from Atos. - &#x60;bb&#x60; is the optional two-digit error message from the bank.  #### Comercio Latino This value is the status code and the error or response code received from the processor separated by a colon. Format: [status code]:E[error code] or [status code]:R[response code] Example &#x60;2:R06&#x60;  #### JCN Gateway Processor-defined detail error code. The associated response category code is in the &#x60;responseCategoryCode&#x60; field. 
   * @return responseCode
  **/
  @ApiModelProperty(value = "For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of the authorization.  #### AIBMS If this value is `08`, you can accept the transaction if the customer provides you with identification.  #### Atos This value is the response code sent from Atos and it might also include the response code from the bank. Format: `aa,bb` with the two values separated by a comma and where: - `aa` is the two-digit error message from Atos. - `bb` is the optional two-digit error message from the bank.  #### Comercio Latino This value is the status code and the error or response code received from the processor separated by a colon. Format: [status code]:E[error code] or [status code]:R[response code] Example `2:R06`  #### JCN Gateway Processor-defined detail error code. The associated response category code is in the `responseCategoryCode` field. ")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation avs(PtsV2PaymentsPost201ResponseProcessorInformationAvs avs) {
    this.avs = avs;
    return this;
  }

   /**
   * Get avs
   * @return avs
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseProcessorInformationAvs getAvs() {
    return avs;
  }

  public void setAvs(PtsV2PaymentsPost201ResponseProcessorInformationAvs avs) {
    this.avs = avs;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation cardVerification(Riskv1decisionsCardVerification cardVerification) {
    this.cardVerification = cardVerification;
    return this;
  }

   /**
   * Get cardVerification
   * @return cardVerification
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsCardVerification getCardVerification() {
    return cardVerification;
  }

  public void setCardVerification(Riskv1decisionsCardVerification cardVerification) {
    this.cardVerification = cardVerification;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation achVerification(PtsV2PaymentsPost201ResponseProcessorInformationAchVerification achVerification) {
    this.achVerification = achVerification;
    return this;
  }

   /**
   * Get achVerification
   * @return achVerification
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseProcessorInformationAchVerification getAchVerification() {
    return achVerification;
  }

  public void setAchVerification(PtsV2PaymentsPost201ResponseProcessorInformationAchVerification achVerification) {
    this.achVerification = achVerification;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation electronicVerificationResults(TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults electronicVerificationResults) {
    this.electronicVerificationResults = electronicVerificationResults;
    return this;
  }

   /**
   * Get electronicVerificationResults
   * @return electronicVerificationResults
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults getElectronicVerificationResults() {
    return electronicVerificationResults;
  }

  public void setElectronicVerificationResults(TssV2TransactionsGet200ResponseProcessorInformationElectronicVerificationResults electronicVerificationResults) {
    this.electronicVerificationResults = electronicVerificationResults;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation systemTraceAuditNumber(String systemTraceAuditNumber) {
    this.systemTraceAuditNumber = systemTraceAuditNumber;
    return this;
  }

   /**
   * This field is returned only for **American Express Direct** and **CyberSource through VisaNet**.  #### American Express Direct  System trace audit number (STAN). This value identifies the transaction and is useful when investigating a chargeback dispute.  #### CyberSource through VisaNet  System trace number that must be printed on the customer’s receipt.  For details, see &#x60;receipt_number&#x60; field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return systemTraceAuditNumber
  **/
  @ApiModelProperty(value = "This field is returned only for **American Express Direct** and **CyberSource through VisaNet**.  #### American Express Direct  System trace audit number (STAN). This value identifies the transaction and is useful when investigating a chargeback dispute.  #### CyberSource through VisaNet  System trace number that must be printed on the customer’s receipt.  For details, see `receipt_number` field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getSystemTraceAuditNumber() {
    return systemTraceAuditNumber;
  }

  public void setSystemTraceAuditNumber(String systemTraceAuditNumber) {
    this.systemTraceAuditNumber = systemTraceAuditNumber;
  }

  public TssV2TransactionsGet200ResponseProcessorInformation responseCodeSource(String responseCodeSource) {
    this.responseCodeSource = responseCodeSource;
    return this;
  }

   /**
   * Used by Visa only and contains the response source/reason code that identifies the source of the response decision. 
   * @return responseCodeSource
  **/
  @ApiModelProperty(value = "Used by Visa only and contains the response source/reason code that identifies the source of the response decision. ")
  public String getResponseCodeSource() {
    return responseCodeSource;
  }

  public void setResponseCodeSource(String responseCodeSource) {
    this.responseCodeSource = responseCodeSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseProcessorInformation tssV2TransactionsGet200ResponseProcessorInformation = (TssV2TransactionsGet200ResponseProcessorInformation) o;
    return Objects.equals(this.processor, tssV2TransactionsGet200ResponseProcessorInformation.processor) &&
        Objects.equals(this.transactionId, tssV2TransactionsGet200ResponseProcessorInformation.transactionId) &&
        Objects.equals(this.networkTransactionId, tssV2TransactionsGet200ResponseProcessorInformation.networkTransactionId) &&
        Objects.equals(this.responseId, tssV2TransactionsGet200ResponseProcessorInformation.responseId) &&
        Objects.equals(this.providerTransactionId, tssV2TransactionsGet200ResponseProcessorInformation.providerTransactionId) &&
        Objects.equals(this.approvalCode, tssV2TransactionsGet200ResponseProcessorInformation.approvalCode) &&
        Objects.equals(this.responseCode, tssV2TransactionsGet200ResponseProcessorInformation.responseCode) &&
        Objects.equals(this.avs, tssV2TransactionsGet200ResponseProcessorInformation.avs) &&
        Objects.equals(this.cardVerification, tssV2TransactionsGet200ResponseProcessorInformation.cardVerification) &&
        Objects.equals(this.achVerification, tssV2TransactionsGet200ResponseProcessorInformation.achVerification) &&
        Objects.equals(this.electronicVerificationResults, tssV2TransactionsGet200ResponseProcessorInformation.electronicVerificationResults) &&
        Objects.equals(this.systemTraceAuditNumber, tssV2TransactionsGet200ResponseProcessorInformation.systemTraceAuditNumber) &&
        Objects.equals(this.responseCodeSource, tssV2TransactionsGet200ResponseProcessorInformation.responseCodeSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processor, transactionId, networkTransactionId, responseId, providerTransactionId, approvalCode, responseCode, avs, cardVerification, achVerification, electronicVerificationResults, systemTraceAuditNumber, responseCodeSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseProcessorInformation {\n");
    
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    networkTransactionId: ").append(toIndentedString(networkTransactionId)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    providerTransactionId: ").append(toIndentedString(providerTransactionId)).append("\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    avs: ").append(toIndentedString(avs)).append("\n");
    sb.append("    cardVerification: ").append(toIndentedString(cardVerification)).append("\n");
    sb.append("    achVerification: ").append(toIndentedString(achVerification)).append("\n");
    sb.append("    electronicVerificationResults: ").append(toIndentedString(electronicVerificationResults)).append("\n");
    sb.append("    systemTraceAuditNumber: ").append(toIndentedString(systemTraceAuditNumber)).append("\n");
    sb.append("    responseCodeSource: ").append(toIndentedString(responseCodeSource)).append("\n");
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

