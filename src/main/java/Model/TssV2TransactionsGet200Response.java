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
import Model.Ptsv2paymentsHealthCareInformation;
import Model.Ptsv2paymentsMerchantDefinedInformation;
import Model.TssV2TransactionsGet200ResponseApplicationInformation;
import Model.TssV2TransactionsGet200ResponseBuyerInformation;
import Model.TssV2TransactionsGet200ResponseClientReferenceInformation;
import Model.TssV2TransactionsGet200ResponseConsumerAuthenticationInformation;
import Model.TssV2TransactionsGet200ResponseDeviceInformation;
import Model.TssV2TransactionsGet200ResponseErrorInformation;
import Model.TssV2TransactionsGet200ResponseFraudMarkingInformation;
import Model.TssV2TransactionsGet200ResponseInstallmentInformation;
import Model.TssV2TransactionsGet200ResponseLinks;
import Model.TssV2TransactionsGet200ResponseMerchantInformation;
import Model.TssV2TransactionsGet200ResponseOrderInformation;
import Model.TssV2TransactionsGet200ResponsePaymentInformation;
import Model.TssV2TransactionsGet200ResponsePointOfSaleInformation;
import Model.TssV2TransactionsGet200ResponseProcessingInformation;
import Model.TssV2TransactionsGet200ResponseProcessorInformation;
import Model.TssV2TransactionsGet200ResponseRiskInformation;
import Model.TssV2TransactionsGet200ResponseSenderInformation;
import Model.TssV2TransactionsGet200ResponseTokenInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TssV2TransactionsGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-12T09:56:59.728+05:30")
public class TssV2TransactionsGet200Response {
  @SerializedName("id")
  private String id = null;

  @SerializedName("rootId")
  private String rootId = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("merchantId")
  private String merchantId = null;

  @SerializedName("submitTimeUTC")
  private String submitTimeUTC = null;

  @SerializedName("applicationInformation")
  private TssV2TransactionsGet200ResponseApplicationInformation applicationInformation = null;

  @SerializedName("buyerInformation")
  private TssV2TransactionsGet200ResponseBuyerInformation buyerInformation = null;

  @SerializedName("clientReferenceInformation")
  private TssV2TransactionsGet200ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("consumerAuthenticationInformation")
  private TssV2TransactionsGet200ResponseConsumerAuthenticationInformation consumerAuthenticationInformation = null;

  @SerializedName("deviceInformation")
  private TssV2TransactionsGet200ResponseDeviceInformation deviceInformation = null;

  @SerializedName("errorInformation")
  private TssV2TransactionsGet200ResponseErrorInformation errorInformation = null;

  @SerializedName("installmentInformation")
  private TssV2TransactionsGet200ResponseInstallmentInformation installmentInformation = null;

  @SerializedName("fraudMarkingInformation")
  private TssV2TransactionsGet200ResponseFraudMarkingInformation fraudMarkingInformation = null;

  @SerializedName("healthCareInformation")
  private Ptsv2paymentsHealthCareInformation healthCareInformation = null;

  @SerializedName("merchantDefinedInformation")
  private List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation = null;

  @SerializedName("merchantInformation")
  private TssV2TransactionsGet200ResponseMerchantInformation merchantInformation = null;

  @SerializedName("orderInformation")
  private TssV2TransactionsGet200ResponseOrderInformation orderInformation = null;

  @SerializedName("paymentInformation")
  private TssV2TransactionsGet200ResponsePaymentInformation paymentInformation = null;

  @SerializedName("processingInformation")
  private TssV2TransactionsGet200ResponseProcessingInformation processingInformation = null;

  @SerializedName("processorInformation")
  private TssV2TransactionsGet200ResponseProcessorInformation processorInformation = null;

  @SerializedName("pointOfSaleInformation")
  private TssV2TransactionsGet200ResponsePointOfSaleInformation pointOfSaleInformation = null;

  @SerializedName("riskInformation")
  private TssV2TransactionsGet200ResponseRiskInformation riskInformation = null;

  @SerializedName("senderInformation")
  private TssV2TransactionsGet200ResponseSenderInformation senderInformation = null;

  @SerializedName("tokenInformation")
  private TssV2TransactionsGet200ResponseTokenInformation tokenInformation = null;

  @SerializedName("_links")
  private TssV2TransactionsGet200ResponseLinks links = null;

  public TssV2TransactionsGet200Response id(String id) {
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

  public TssV2TransactionsGet200Response rootId(String rootId) {
    this.rootId = rootId;
    return this;
  }

   /**
   * Contains the transaction identifier for the first transaction in the series of transactions. For example, you might send an authorization request for a payment, followed by a capture request for that payment, and then a refund request for that captured payment. Each of those requests, if successful, creates a resource that is assigned an identifier, which is returned in the response. The rootId identifies the first ID in the series, which in this case would be the ID of the original authorization.
   * @return rootId
  **/
  @ApiModelProperty(value = "Contains the transaction identifier for the first transaction in the series of transactions. For example, you might send an authorization request for a payment, followed by a capture request for that payment, and then a refund request for that captured payment. Each of those requests, if successful, creates a resource that is assigned an identifier, which is returned in the response. The rootId identifies the first ID in the series, which in this case would be the ID of the original authorization.")
  public String getRootId() {
    return rootId;
  }

  public void setRootId(String rootId) {
    this.rootId = rootId;
  }

  public TssV2TransactionsGet200Response reconciliationId(String reconciliationId) {
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

  public TssV2TransactionsGet200Response merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Your CyberSource merchant ID.
   * @return merchantId
  **/
  @ApiModelProperty(value = "Your CyberSource merchant ID.")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public TssV2TransactionsGet200Response submitTimeUTC(String submitTimeUTC) {
    this.submitTimeUTC = submitTimeUTC;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services. 
   * @return submitTimeUTC
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by Cybersource for all services. ")
  public String getSubmitTimeUTC() {
    return submitTimeUTC;
  }

  public void setSubmitTimeUTC(String submitTimeUTC) {
    this.submitTimeUTC = submitTimeUTC;
  }

  public TssV2TransactionsGet200Response applicationInformation(TssV2TransactionsGet200ResponseApplicationInformation applicationInformation) {
    this.applicationInformation = applicationInformation;
    return this;
  }

   /**
   * Get applicationInformation
   * @return applicationInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseApplicationInformation getApplicationInformation() {
    return applicationInformation;
  }

  public void setApplicationInformation(TssV2TransactionsGet200ResponseApplicationInformation applicationInformation) {
    this.applicationInformation = applicationInformation;
  }

  public TssV2TransactionsGet200Response buyerInformation(TssV2TransactionsGet200ResponseBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(TssV2TransactionsGet200ResponseBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public TssV2TransactionsGet200Response clientReferenceInformation(TssV2TransactionsGet200ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(TssV2TransactionsGet200ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public TssV2TransactionsGet200Response consumerAuthenticationInformation(TssV2TransactionsGet200ResponseConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
    return this;
  }

   /**
   * Get consumerAuthenticationInformation
   * @return consumerAuthenticationInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseConsumerAuthenticationInformation getConsumerAuthenticationInformation() {
    return consumerAuthenticationInformation;
  }

  public void setConsumerAuthenticationInformation(TssV2TransactionsGet200ResponseConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
  }

  public TssV2TransactionsGet200Response deviceInformation(TssV2TransactionsGet200ResponseDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseDeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(TssV2TransactionsGet200ResponseDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }

  public TssV2TransactionsGet200Response errorInformation(TssV2TransactionsGet200ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(TssV2TransactionsGet200ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }

  public TssV2TransactionsGet200Response installmentInformation(TssV2TransactionsGet200ResponseInstallmentInformation installmentInformation) {
    this.installmentInformation = installmentInformation;
    return this;
  }

   /**
   * Get installmentInformation
   * @return installmentInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseInstallmentInformation getInstallmentInformation() {
    return installmentInformation;
  }

  public void setInstallmentInformation(TssV2TransactionsGet200ResponseInstallmentInformation installmentInformation) {
    this.installmentInformation = installmentInformation;
  }

  public TssV2TransactionsGet200Response fraudMarkingInformation(TssV2TransactionsGet200ResponseFraudMarkingInformation fraudMarkingInformation) {
    this.fraudMarkingInformation = fraudMarkingInformation;
    return this;
  }

   /**
   * Get fraudMarkingInformation
   * @return fraudMarkingInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseFraudMarkingInformation getFraudMarkingInformation() {
    return fraudMarkingInformation;
  }

  public void setFraudMarkingInformation(TssV2TransactionsGet200ResponseFraudMarkingInformation fraudMarkingInformation) {
    this.fraudMarkingInformation = fraudMarkingInformation;
  }

  public TssV2TransactionsGet200Response healthCareInformation(Ptsv2paymentsHealthCareInformation healthCareInformation) {
    this.healthCareInformation = healthCareInformation;
    return this;
  }

   /**
   * Get healthCareInformation
   * @return healthCareInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsHealthCareInformation getHealthCareInformation() {
    return healthCareInformation;
  }

  public void setHealthCareInformation(Ptsv2paymentsHealthCareInformation healthCareInformation) {
    this.healthCareInformation = healthCareInformation;
  }

  public TssV2TransactionsGet200Response merchantDefinedInformation(List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
    return this;
  }

  public TssV2TransactionsGet200Response addMerchantDefinedInformationItem(Ptsv2paymentsMerchantDefinedInformation merchantDefinedInformationItem) {
    if (this.merchantDefinedInformation == null) {
      this.merchantDefinedInformation = new ArrayList<Ptsv2paymentsMerchantDefinedInformation>();
    }
    this.merchantDefinedInformation.add(merchantDefinedInformationItem);
    return this;
  }

   /**
   * The object containing the custom data that the merchant defines. 
   * @return merchantDefinedInformation
  **/
  @ApiModelProperty(value = "The object containing the custom data that the merchant defines. ")
  public List<Ptsv2paymentsMerchantDefinedInformation> getMerchantDefinedInformation() {
    return merchantDefinedInformation;
  }

  public void setMerchantDefinedInformation(List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
  }

  public TssV2TransactionsGet200Response merchantInformation(TssV2TransactionsGet200ResponseMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(TssV2TransactionsGet200ResponseMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public TssV2TransactionsGet200Response orderInformation(TssV2TransactionsGet200ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(TssV2TransactionsGet200ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public TssV2TransactionsGet200Response paymentInformation(TssV2TransactionsGet200ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponsePaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(TssV2TransactionsGet200ResponsePaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public TssV2TransactionsGet200Response processingInformation(TssV2TransactionsGet200ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(TssV2TransactionsGet200ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public TssV2TransactionsGet200Response processorInformation(TssV2TransactionsGet200ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(TssV2TransactionsGet200ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public TssV2TransactionsGet200Response pointOfSaleInformation(TssV2TransactionsGet200ResponsePointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
    return this;
  }

   /**
   * Get pointOfSaleInformation
   * @return pointOfSaleInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponsePointOfSaleInformation getPointOfSaleInformation() {
    return pointOfSaleInformation;
  }

  public void setPointOfSaleInformation(TssV2TransactionsGet200ResponsePointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
  }

  public TssV2TransactionsGet200Response riskInformation(TssV2TransactionsGet200ResponseRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
    return this;
  }

   /**
   * Get riskInformation
   * @return riskInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseRiskInformation getRiskInformation() {
    return riskInformation;
  }

  public void setRiskInformation(TssV2TransactionsGet200ResponseRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
  }

  public TssV2TransactionsGet200Response senderInformation(TssV2TransactionsGet200ResponseSenderInformation senderInformation) {
    this.senderInformation = senderInformation;
    return this;
  }

   /**
   * Get senderInformation
   * @return senderInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseSenderInformation getSenderInformation() {
    return senderInformation;
  }

  public void setSenderInformation(TssV2TransactionsGet200ResponseSenderInformation senderInformation) {
    this.senderInformation = senderInformation;
  }

  public TssV2TransactionsGet200Response tokenInformation(TssV2TransactionsGet200ResponseTokenInformation tokenInformation) {
    this.tokenInformation = tokenInformation;
    return this;
  }

   /**
   * Get tokenInformation
   * @return tokenInformation
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseTokenInformation getTokenInformation() {
    return tokenInformation;
  }

  public void setTokenInformation(TssV2TransactionsGet200ResponseTokenInformation tokenInformation) {
    this.tokenInformation = tokenInformation;
  }

  public TssV2TransactionsGet200Response links(TssV2TransactionsGet200ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(TssV2TransactionsGet200ResponseLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200Response tssV2TransactionsGet200Response = (TssV2TransactionsGet200Response) o;
    return Objects.equals(this.id, tssV2TransactionsGet200Response.id) &&
        Objects.equals(this.rootId, tssV2TransactionsGet200Response.rootId) &&
        Objects.equals(this.reconciliationId, tssV2TransactionsGet200Response.reconciliationId) &&
        Objects.equals(this.merchantId, tssV2TransactionsGet200Response.merchantId) &&
        Objects.equals(this.submitTimeUTC, tssV2TransactionsGet200Response.submitTimeUTC) &&
        Objects.equals(this.applicationInformation, tssV2TransactionsGet200Response.applicationInformation) &&
        Objects.equals(this.buyerInformation, tssV2TransactionsGet200Response.buyerInformation) &&
        Objects.equals(this.clientReferenceInformation, tssV2TransactionsGet200Response.clientReferenceInformation) &&
        Objects.equals(this.consumerAuthenticationInformation, tssV2TransactionsGet200Response.consumerAuthenticationInformation) &&
        Objects.equals(this.deviceInformation, tssV2TransactionsGet200Response.deviceInformation) &&
        Objects.equals(this.errorInformation, tssV2TransactionsGet200Response.errorInformation) &&
        Objects.equals(this.installmentInformation, tssV2TransactionsGet200Response.installmentInformation) &&
        Objects.equals(this.fraudMarkingInformation, tssV2TransactionsGet200Response.fraudMarkingInformation) &&
        Objects.equals(this.healthCareInformation, tssV2TransactionsGet200Response.healthCareInformation) &&
        Objects.equals(this.merchantDefinedInformation, tssV2TransactionsGet200Response.merchantDefinedInformation) &&
        Objects.equals(this.merchantInformation, tssV2TransactionsGet200Response.merchantInformation) &&
        Objects.equals(this.orderInformation, tssV2TransactionsGet200Response.orderInformation) &&
        Objects.equals(this.paymentInformation, tssV2TransactionsGet200Response.paymentInformation) &&
        Objects.equals(this.processingInformation, tssV2TransactionsGet200Response.processingInformation) &&
        Objects.equals(this.processorInformation, tssV2TransactionsGet200Response.processorInformation) &&
        Objects.equals(this.pointOfSaleInformation, tssV2TransactionsGet200Response.pointOfSaleInformation) &&
        Objects.equals(this.riskInformation, tssV2TransactionsGet200Response.riskInformation) &&
        Objects.equals(this.senderInformation, tssV2TransactionsGet200Response.senderInformation) &&
        Objects.equals(this.tokenInformation, tssV2TransactionsGet200Response.tokenInformation) &&
        Objects.equals(this.links, tssV2TransactionsGet200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rootId, reconciliationId, merchantId, submitTimeUTC, applicationInformation, buyerInformation, clientReferenceInformation, consumerAuthenticationInformation, deviceInformation, errorInformation, installmentInformation, fraudMarkingInformation, healthCareInformation, merchantDefinedInformation, merchantInformation, orderInformation, paymentInformation, processingInformation, processorInformation, pointOfSaleInformation, riskInformation, senderInformation, tokenInformation, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200Response {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    submitTimeUTC: ").append(toIndentedString(submitTimeUTC)).append("\n");
    sb.append("    applicationInformation: ").append(toIndentedString(applicationInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    consumerAuthenticationInformation: ").append(toIndentedString(consumerAuthenticationInformation)).append("\n");
    sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
    sb.append("    installmentInformation: ").append(toIndentedString(installmentInformation)).append("\n");
    sb.append("    fraudMarkingInformation: ").append(toIndentedString(fraudMarkingInformation)).append("\n");
    sb.append("    healthCareInformation: ").append(toIndentedString(healthCareInformation)).append("\n");
    sb.append("    merchantDefinedInformation: ").append(toIndentedString(merchantDefinedInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    pointOfSaleInformation: ").append(toIndentedString(pointOfSaleInformation)).append("\n");
    sb.append("    riskInformation: ").append(toIndentedString(riskInformation)).append("\n");
    sb.append("    senderInformation: ").append(toIndentedString(senderInformation)).append("\n");
    sb.append("    tokenInformation: ").append(toIndentedString(tokenInformation)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

