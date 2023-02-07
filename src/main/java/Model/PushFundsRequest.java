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
import Model.Ptsv1pushfundstransferAggregatorInformation;
import Model.Ptsv1pushfundstransferClientReferenceInformation;
import Model.Ptsv1pushfundstransferMerchantDefinedInformation;
import Model.Ptsv1pushfundstransferMerchantInformation;
import Model.Ptsv1pushfundstransferOrderInformation;
import Model.Ptsv1pushfundstransferPointOfServiceInformation;
import Model.Ptsv1pushfundstransferProcessingInformation;
import Model.Ptsv1pushfundstransferProcessingOptions;
import Model.Ptsv1pushfundstransferRecipientInformation;
import Model.Ptsv1pushfundstransferSenderInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PushFundsRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class PushFundsRequest {
  @SerializedName("clientReferenceInformation")
  private Ptsv1pushfundstransferClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("orderInformation")
  private Ptsv1pushfundstransferOrderInformation orderInformation = null;

  @SerializedName("processingInformation")
  private Ptsv1pushfundstransferProcessingInformation processingInformation = null;

  @SerializedName("processingOptions")
  private Ptsv1pushfundstransferProcessingOptions processingOptions = null;

  @SerializedName("recipientInformation")
  private Ptsv1pushfundstransferRecipientInformation recipientInformation = null;

  @SerializedName("senderInformation")
  private Ptsv1pushfundstransferSenderInformation senderInformation = null;

  @SerializedName("aggregatorInformation")
  private Ptsv1pushfundstransferAggregatorInformation aggregatorInformation = null;

  @SerializedName("merchantDefinedInformation")
  private Ptsv1pushfundstransferMerchantDefinedInformation merchantDefinedInformation = null;

  @SerializedName("merchantInformation")
  private Ptsv1pushfundstransferMerchantInformation merchantInformation = null;

  @SerializedName("pointOfServiceInformation")
  private Ptsv1pushfundstransferPointOfServiceInformation pointOfServiceInformation = null;

  public PushFundsRequest clientReferenceInformation(Ptsv1pushfundstransferClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Ptsv1pushfundstransferClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public PushFundsRequest orderInformation(Ptsv1pushfundstransferOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Ptsv1pushfundstransferOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public PushFundsRequest processingInformation(Ptsv1pushfundstransferProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Ptsv1pushfundstransferProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public PushFundsRequest processingOptions(Ptsv1pushfundstransferProcessingOptions processingOptions) {
    this.processingOptions = processingOptions;
    return this;
  }

   /**
   * Get processingOptions
   * @return processingOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferProcessingOptions getProcessingOptions() {
    return processingOptions;
  }

  public void setProcessingOptions(Ptsv1pushfundstransferProcessingOptions processingOptions) {
    this.processingOptions = processingOptions;
  }

  public PushFundsRequest recipientInformation(Ptsv1pushfundstransferRecipientInformation recipientInformation) {
    this.recipientInformation = recipientInformation;
    return this;
  }

   /**
   * Get recipientInformation
   * @return recipientInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferRecipientInformation getRecipientInformation() {
    return recipientInformation;
  }

  public void setRecipientInformation(Ptsv1pushfundstransferRecipientInformation recipientInformation) {
    this.recipientInformation = recipientInformation;
  }

  public PushFundsRequest senderInformation(Ptsv1pushfundstransferSenderInformation senderInformation) {
    this.senderInformation = senderInformation;
    return this;
  }

   /**
   * Get senderInformation
   * @return senderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferSenderInformation getSenderInformation() {
    return senderInformation;
  }

  public void setSenderInformation(Ptsv1pushfundstransferSenderInformation senderInformation) {
    this.senderInformation = senderInformation;
  }

  public PushFundsRequest aggregatorInformation(Ptsv1pushfundstransferAggregatorInformation aggregatorInformation) {
    this.aggregatorInformation = aggregatorInformation;
    return this;
  }

   /**
   * Get aggregatorInformation
   * @return aggregatorInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferAggregatorInformation getAggregatorInformation() {
    return aggregatorInformation;
  }

  public void setAggregatorInformation(Ptsv1pushfundstransferAggregatorInformation aggregatorInformation) {
    this.aggregatorInformation = aggregatorInformation;
  }

  public PushFundsRequest merchantDefinedInformation(Ptsv1pushfundstransferMerchantDefinedInformation merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
    return this;
  }

   /**
   * Get merchantDefinedInformation
   * @return merchantDefinedInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferMerchantDefinedInformation getMerchantDefinedInformation() {
    return merchantDefinedInformation;
  }

  public void setMerchantDefinedInformation(Ptsv1pushfundstransferMerchantDefinedInformation merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
  }

  public PushFundsRequest merchantInformation(Ptsv1pushfundstransferMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(Ptsv1pushfundstransferMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public PushFundsRequest pointOfServiceInformation(Ptsv1pushfundstransferPointOfServiceInformation pointOfServiceInformation) {
    this.pointOfServiceInformation = pointOfServiceInformation;
    return this;
  }

   /**
   * Get pointOfServiceInformation
   * @return pointOfServiceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferPointOfServiceInformation getPointOfServiceInformation() {
    return pointOfServiceInformation;
  }

  public void setPointOfServiceInformation(Ptsv1pushfundstransferPointOfServiceInformation pointOfServiceInformation) {
    this.pointOfServiceInformation = pointOfServiceInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushFundsRequest pushFundsRequest = (PushFundsRequest) o;
    return Objects.equals(this.clientReferenceInformation, pushFundsRequest.clientReferenceInformation) &&
        Objects.equals(this.orderInformation, pushFundsRequest.orderInformation) &&
        Objects.equals(this.processingInformation, pushFundsRequest.processingInformation) &&
        Objects.equals(this.processingOptions, pushFundsRequest.processingOptions) &&
        Objects.equals(this.recipientInformation, pushFundsRequest.recipientInformation) &&
        Objects.equals(this.senderInformation, pushFundsRequest.senderInformation) &&
        Objects.equals(this.aggregatorInformation, pushFundsRequest.aggregatorInformation) &&
        Objects.equals(this.merchantDefinedInformation, pushFundsRequest.merchantDefinedInformation) &&
        Objects.equals(this.merchantInformation, pushFundsRequest.merchantInformation) &&
        Objects.equals(this.pointOfServiceInformation, pushFundsRequest.pointOfServiceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, orderInformation, processingInformation, processingOptions, recipientInformation, senderInformation, aggregatorInformation, merchantDefinedInformation, merchantInformation, pointOfServiceInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFundsRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    processingOptions: ").append(toIndentedString(processingOptions)).append("\n");
    sb.append("    recipientInformation: ").append(toIndentedString(recipientInformation)).append("\n");
    sb.append("    senderInformation: ").append(toIndentedString(senderInformation)).append("\n");
    sb.append("    aggregatorInformation: ").append(toIndentedString(aggregatorInformation)).append("\n");
    sb.append("    merchantDefinedInformation: ").append(toIndentedString(merchantDefinedInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    pointOfServiceInformation: ").append(toIndentedString(pointOfServiceInformation)).append("\n");
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

