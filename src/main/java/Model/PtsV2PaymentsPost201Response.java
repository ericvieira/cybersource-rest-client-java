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
import Model.PtsV2PaymentsPost201ResponseBuyerInformation;
import Model.PtsV2PaymentsPost201ResponseClientReferenceInformation;
import Model.PtsV2PaymentsPost201ResponseConsumerAuthenticationInformation;
import Model.PtsV2PaymentsPost201ResponseErrorInformation;
import Model.PtsV2PaymentsPost201ResponseInstallmentInformation;
import Model.PtsV2PaymentsPost201ResponseIssuerInformation;
import Model.PtsV2PaymentsPost201ResponseLinks;
import Model.PtsV2PaymentsPost201ResponseOrderInformation;
import Model.PtsV2PaymentsPost201ResponsePaymentAccountInformation;
import Model.PtsV2PaymentsPost201ResponsePaymentInformation;
import Model.PtsV2PaymentsPost201ResponsePointOfSaleInformation;
import Model.PtsV2PaymentsPost201ResponseProcessingInformation;
import Model.PtsV2PaymentsPost201ResponseProcessorInformation;
import Model.PtsV2PaymentsPost201ResponseRiskInformation;
import Model.PtsV2PaymentsPost201ResponseTokenInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-12T09:56:59.728+05:30")
public class PtsV2PaymentsPost201Response {
  @SerializedName("_links")
  private PtsV2PaymentsPost201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("errorInformation")
  private PtsV2PaymentsPost201ResponseErrorInformation errorInformation = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processingInformation")
  private PtsV2PaymentsPost201ResponseProcessingInformation processingInformation = null;

  @SerializedName("processorInformation")
  private PtsV2PaymentsPost201ResponseProcessorInformation processorInformation = null;

  @SerializedName("issuerInformation")
  private PtsV2PaymentsPost201ResponseIssuerInformation issuerInformation = null;

  @SerializedName("paymentAccountInformation")
  private PtsV2PaymentsPost201ResponsePaymentAccountInformation paymentAccountInformation = null;

  @SerializedName("paymentInformation")
  private PtsV2PaymentsPost201ResponsePaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private PtsV2PaymentsPost201ResponseOrderInformation orderInformation = null;

  @SerializedName("pointOfSaleInformation")
  private PtsV2PaymentsPost201ResponsePointOfSaleInformation pointOfSaleInformation = null;

  @SerializedName("installmentInformation")
  private PtsV2PaymentsPost201ResponseInstallmentInformation installmentInformation = null;

  @SerializedName("tokenInformation")
  private PtsV2PaymentsPost201ResponseTokenInformation tokenInformation = null;

  @SerializedName("buyerInformation")
  private PtsV2PaymentsPost201ResponseBuyerInformation buyerInformation = null;

  @SerializedName("riskInformation")
  private PtsV2PaymentsPost201ResponseRiskInformation riskInformation = null;

  @SerializedName("consumerAuthenticationInformation")
  private PtsV2PaymentsPost201ResponseConsumerAuthenticationInformation consumerAuthenticationInformation = null;

  public PtsV2PaymentsPost201Response links(PtsV2PaymentsPost201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2PaymentsPost201ResponseLinks links) {
    this.links = links;
  }

  public PtsV2PaymentsPost201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. 
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PtsV2PaymentsPost201Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by Cybersource for all services. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public PtsV2PaymentsPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - AUTHORIZED  - PARTIAL_AUTHORIZED  - AUTHORIZED_PENDING_REVIEW  - AUTHORIZED_RISK_DECLINED  - PENDING_AUTHENTICATION  - PENDING_REVIEW  - DECLINED  - INVALID_REQUEST 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - AUTHORIZED  - PARTIAL_AUTHORIZED  - AUTHORIZED_PENDING_REVIEW  - AUTHORIZED_RISK_DECLINED  - PENDING_AUTHENTICATION  - PENDING_REVIEW  - DECLINED  - INVALID_REQUEST ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PtsV2PaymentsPost201Response reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Reference number for the transaction. Depending on how your Cybersource account is configured, this value could either be provided in the API request or generated by CyberSource. The actual value used in the request to the processor is provided back to you by Cybersource in the response. 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Reference number for the transaction. Depending on how your Cybersource account is configured, this value could either be provided in the API request or generated by CyberSource. The actual value used in the request to the processor is provided back to you by Cybersource in the response. ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public PtsV2PaymentsPost201Response errorInformation(PtsV2PaymentsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(PtsV2PaymentsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }

  public PtsV2PaymentsPost201Response clientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public PtsV2PaymentsPost201Response processingInformation(PtsV2PaymentsPost201ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(PtsV2PaymentsPost201ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public PtsV2PaymentsPost201Response processorInformation(PtsV2PaymentsPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(PtsV2PaymentsPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public PtsV2PaymentsPost201Response issuerInformation(PtsV2PaymentsPost201ResponseIssuerInformation issuerInformation) {
    this.issuerInformation = issuerInformation;
    return this;
  }

   /**
   * Get issuerInformation
   * @return issuerInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseIssuerInformation getIssuerInformation() {
    return issuerInformation;
  }

  public void setIssuerInformation(PtsV2PaymentsPost201ResponseIssuerInformation issuerInformation) {
    this.issuerInformation = issuerInformation;
  }

  public PtsV2PaymentsPost201Response paymentAccountInformation(PtsV2PaymentsPost201ResponsePaymentAccountInformation paymentAccountInformation) {
    this.paymentAccountInformation = paymentAccountInformation;
    return this;
  }

   /**
   * Get paymentAccountInformation
   * @return paymentAccountInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentAccountInformation getPaymentAccountInformation() {
    return paymentAccountInformation;
  }

  public void setPaymentAccountInformation(PtsV2PaymentsPost201ResponsePaymentAccountInformation paymentAccountInformation) {
    this.paymentAccountInformation = paymentAccountInformation;
  }

  public PtsV2PaymentsPost201Response paymentInformation(PtsV2PaymentsPost201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(PtsV2PaymentsPost201ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public PtsV2PaymentsPost201Response orderInformation(PtsV2PaymentsPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(PtsV2PaymentsPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public PtsV2PaymentsPost201Response pointOfSaleInformation(PtsV2PaymentsPost201ResponsePointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
    return this;
  }

   /**
   * Get pointOfSaleInformation
   * @return pointOfSaleInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePointOfSaleInformation getPointOfSaleInformation() {
    return pointOfSaleInformation;
  }

  public void setPointOfSaleInformation(PtsV2PaymentsPost201ResponsePointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
  }

  public PtsV2PaymentsPost201Response installmentInformation(PtsV2PaymentsPost201ResponseInstallmentInformation installmentInformation) {
    this.installmentInformation = installmentInformation;
    return this;
  }

   /**
   * Get installmentInformation
   * @return installmentInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseInstallmentInformation getInstallmentInformation() {
    return installmentInformation;
  }

  public void setInstallmentInformation(PtsV2PaymentsPost201ResponseInstallmentInformation installmentInformation) {
    this.installmentInformation = installmentInformation;
  }

  public PtsV2PaymentsPost201Response tokenInformation(PtsV2PaymentsPost201ResponseTokenInformation tokenInformation) {
    this.tokenInformation = tokenInformation;
    return this;
  }

   /**
   * Get tokenInformation
   * @return tokenInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseTokenInformation getTokenInformation() {
    return tokenInformation;
  }

  public void setTokenInformation(PtsV2PaymentsPost201ResponseTokenInformation tokenInformation) {
    this.tokenInformation = tokenInformation;
  }

  public PtsV2PaymentsPost201Response buyerInformation(PtsV2PaymentsPost201ResponseBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(PtsV2PaymentsPost201ResponseBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public PtsV2PaymentsPost201Response riskInformation(PtsV2PaymentsPost201ResponseRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
    return this;
  }

   /**
   * Get riskInformation
   * @return riskInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseRiskInformation getRiskInformation() {
    return riskInformation;
  }

  public void setRiskInformation(PtsV2PaymentsPost201ResponseRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
  }

  public PtsV2PaymentsPost201Response consumerAuthenticationInformation(PtsV2PaymentsPost201ResponseConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
    return this;
  }

   /**
   * Get consumerAuthenticationInformation
   * @return consumerAuthenticationInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseConsumerAuthenticationInformation getConsumerAuthenticationInformation() {
    return consumerAuthenticationInformation;
  }

  public void setConsumerAuthenticationInformation(PtsV2PaymentsPost201ResponseConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201Response ptsV2PaymentsPost201Response = (PtsV2PaymentsPost201Response) o;
    return Objects.equals(this.links, ptsV2PaymentsPost201Response.links) &&
        Objects.equals(this.id, ptsV2PaymentsPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, ptsV2PaymentsPost201Response.submitTimeUtc) &&
        Objects.equals(this.status, ptsV2PaymentsPost201Response.status) &&
        Objects.equals(this.reconciliationId, ptsV2PaymentsPost201Response.reconciliationId) &&
        Objects.equals(this.errorInformation, ptsV2PaymentsPost201Response.errorInformation) &&
        Objects.equals(this.clientReferenceInformation, ptsV2PaymentsPost201Response.clientReferenceInformation) &&
        Objects.equals(this.processingInformation, ptsV2PaymentsPost201Response.processingInformation) &&
        Objects.equals(this.processorInformation, ptsV2PaymentsPost201Response.processorInformation) &&
        Objects.equals(this.issuerInformation, ptsV2PaymentsPost201Response.issuerInformation) &&
        Objects.equals(this.paymentAccountInformation, ptsV2PaymentsPost201Response.paymentAccountInformation) &&
        Objects.equals(this.paymentInformation, ptsV2PaymentsPost201Response.paymentInformation) &&
        Objects.equals(this.orderInformation, ptsV2PaymentsPost201Response.orderInformation) &&
        Objects.equals(this.pointOfSaleInformation, ptsV2PaymentsPost201Response.pointOfSaleInformation) &&
        Objects.equals(this.installmentInformation, ptsV2PaymentsPost201Response.installmentInformation) &&
        Objects.equals(this.tokenInformation, ptsV2PaymentsPost201Response.tokenInformation) &&
        Objects.equals(this.buyerInformation, ptsV2PaymentsPost201Response.buyerInformation) &&
        Objects.equals(this.riskInformation, ptsV2PaymentsPost201Response.riskInformation) &&
        Objects.equals(this.consumerAuthenticationInformation, ptsV2PaymentsPost201Response.consumerAuthenticationInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, reconciliationId, errorInformation, clientReferenceInformation, processingInformation, processorInformation, issuerInformation, paymentAccountInformation, paymentInformation, orderInformation, pointOfSaleInformation, installmentInformation, tokenInformation, buyerInformation, riskInformation, consumerAuthenticationInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    issuerInformation: ").append(toIndentedString(issuerInformation)).append("\n");
    sb.append("    paymentAccountInformation: ").append(toIndentedString(paymentAccountInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    pointOfSaleInformation: ").append(toIndentedString(pointOfSaleInformation)).append("\n");
    sb.append("    installmentInformation: ").append(toIndentedString(installmentInformation)).append("\n");
    sb.append("    tokenInformation: ").append(toIndentedString(tokenInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    riskInformation: ").append(toIndentedString(riskInformation)).append("\n");
    sb.append("    consumerAuthenticationInformation: ").append(toIndentedString(consumerAuthenticationInformation)).append("\n");
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

