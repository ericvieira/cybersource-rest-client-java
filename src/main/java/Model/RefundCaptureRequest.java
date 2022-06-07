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
import Model.Ptsv2paymentsClientReferenceInformation;
import Model.Ptsv2paymentsMerchantDefinedInformation;
import Model.Ptsv2paymentsPromotionInformation;
import Model.Ptsv2paymentsTravelInformation;
import Model.Ptsv2paymentsidcapturesAggregatorInformation;
import Model.Ptsv2paymentsidcapturesBuyerInformation;
import Model.Ptsv2paymentsidcapturesDeviceInformation;
import Model.Ptsv2paymentsidrefundsMerchantInformation;
import Model.Ptsv2paymentsidrefundsOrderInformation;
import Model.Ptsv2paymentsidrefundsPaymentInformation;
import Model.Ptsv2paymentsidrefundsPointOfSaleInformation;
import Model.Ptsv2paymentsidrefundsProcessingInformation;
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
 * RefundCaptureRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-07T13:59:51.194+05:30")
public class RefundCaptureRequest {
  @SerializedName("clientReferenceInformation")
  private Ptsv2paymentsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processingInformation")
  private Ptsv2paymentsidrefundsProcessingInformation processingInformation = null;

  @SerializedName("paymentInformation")
  private Ptsv2paymentsidrefundsPaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private Ptsv2paymentsidrefundsOrderInformation orderInformation = null;

  @SerializedName("buyerInformation")
  private Ptsv2paymentsidcapturesBuyerInformation buyerInformation = null;

  @SerializedName("deviceInformation")
  private Ptsv2paymentsidcapturesDeviceInformation deviceInformation = null;

  @SerializedName("merchantInformation")
  private Ptsv2paymentsidrefundsMerchantInformation merchantInformation = null;

  @SerializedName("aggregatorInformation")
  private Ptsv2paymentsidcapturesAggregatorInformation aggregatorInformation = null;

  @SerializedName("pointOfSaleInformation")
  private Ptsv2paymentsidrefundsPointOfSaleInformation pointOfSaleInformation = null;

  @SerializedName("merchantDefinedInformation")
  private List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation = null;

  @SerializedName("travelInformation")
  private Ptsv2paymentsTravelInformation travelInformation = null;

  @SerializedName("promotionInformation")
  private Ptsv2paymentsPromotionInformation promotionInformation = null;

  public RefundCaptureRequest clientReferenceInformation(Ptsv2paymentsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Ptsv2paymentsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public RefundCaptureRequest processingInformation(Ptsv2paymentsidrefundsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidrefundsProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Ptsv2paymentsidrefundsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public RefundCaptureRequest paymentInformation(Ptsv2paymentsidrefundsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidrefundsPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Ptsv2paymentsidrefundsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public RefundCaptureRequest orderInformation(Ptsv2paymentsidrefundsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidrefundsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Ptsv2paymentsidrefundsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public RefundCaptureRequest buyerInformation(Ptsv2paymentsidcapturesBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidcapturesBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(Ptsv2paymentsidcapturesBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public RefundCaptureRequest deviceInformation(Ptsv2paymentsidcapturesDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidcapturesDeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(Ptsv2paymentsidcapturesDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }

  public RefundCaptureRequest merchantInformation(Ptsv2paymentsidrefundsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidrefundsMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(Ptsv2paymentsidrefundsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public RefundCaptureRequest aggregatorInformation(Ptsv2paymentsidcapturesAggregatorInformation aggregatorInformation) {
    this.aggregatorInformation = aggregatorInformation;
    return this;
  }

   /**
   * Get aggregatorInformation
   * @return aggregatorInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidcapturesAggregatorInformation getAggregatorInformation() {
    return aggregatorInformation;
  }

  public void setAggregatorInformation(Ptsv2paymentsidcapturesAggregatorInformation aggregatorInformation) {
    this.aggregatorInformation = aggregatorInformation;
  }

  public RefundCaptureRequest pointOfSaleInformation(Ptsv2paymentsidrefundsPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
    return this;
  }

   /**
   * Get pointOfSaleInformation
   * @return pointOfSaleInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidrefundsPointOfSaleInformation getPointOfSaleInformation() {
    return pointOfSaleInformation;
  }

  public void setPointOfSaleInformation(Ptsv2paymentsidrefundsPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
  }

  public RefundCaptureRequest merchantDefinedInformation(List<Ptsv2paymentsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
    return this;
  }

  public RefundCaptureRequest addMerchantDefinedInformationItem(Ptsv2paymentsMerchantDefinedInformation merchantDefinedInformationItem) {
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

  public RefundCaptureRequest travelInformation(Ptsv2paymentsTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
    return this;
  }

   /**
   * Get travelInformation
   * @return travelInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsTravelInformation getTravelInformation() {
    return travelInformation;
  }

  public void setTravelInformation(Ptsv2paymentsTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
  }

  public RefundCaptureRequest promotionInformation(Ptsv2paymentsPromotionInformation promotionInformation) {
    this.promotionInformation = promotionInformation;
    return this;
  }

   /**
   * Get promotionInformation
   * @return promotionInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPromotionInformation getPromotionInformation() {
    return promotionInformation;
  }

  public void setPromotionInformation(Ptsv2paymentsPromotionInformation promotionInformation) {
    this.promotionInformation = promotionInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundCaptureRequest refundCaptureRequest = (RefundCaptureRequest) o;
    return Objects.equals(this.clientReferenceInformation, refundCaptureRequest.clientReferenceInformation) &&
        Objects.equals(this.processingInformation, refundCaptureRequest.processingInformation) &&
        Objects.equals(this.paymentInformation, refundCaptureRequest.paymentInformation) &&
        Objects.equals(this.orderInformation, refundCaptureRequest.orderInformation) &&
        Objects.equals(this.buyerInformation, refundCaptureRequest.buyerInformation) &&
        Objects.equals(this.deviceInformation, refundCaptureRequest.deviceInformation) &&
        Objects.equals(this.merchantInformation, refundCaptureRequest.merchantInformation) &&
        Objects.equals(this.aggregatorInformation, refundCaptureRequest.aggregatorInformation) &&
        Objects.equals(this.pointOfSaleInformation, refundCaptureRequest.pointOfSaleInformation) &&
        Objects.equals(this.merchantDefinedInformation, refundCaptureRequest.merchantDefinedInformation) &&
        Objects.equals(this.travelInformation, refundCaptureRequest.travelInformation) &&
        Objects.equals(this.promotionInformation, refundCaptureRequest.promotionInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, processingInformation, paymentInformation, orderInformation, buyerInformation, deviceInformation, merchantInformation, aggregatorInformation, pointOfSaleInformation, merchantDefinedInformation, travelInformation, promotionInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundCaptureRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    aggregatorInformation: ").append(toIndentedString(aggregatorInformation)).append("\n");
    sb.append("    pointOfSaleInformation: ").append(toIndentedString(pointOfSaleInformation)).append("\n");
    sb.append("    merchantDefinedInformation: ").append(toIndentedString(merchantDefinedInformation)).append("\n");
    sb.append("    travelInformation: ").append(toIndentedString(travelInformation)).append("\n");
    sb.append("    promotionInformation: ").append(toIndentedString(promotionInformation)).append("\n");
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

