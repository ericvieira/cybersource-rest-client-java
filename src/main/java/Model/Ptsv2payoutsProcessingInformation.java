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
import Model.Ptsv2payoutsProcessingInformationFundingOptions;
import Model.Ptsv2payoutsProcessingInformationPayoutsOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2payoutsProcessingInformation
 */

public class Ptsv2payoutsProcessingInformation {
  @SerializedName("businessApplicationId")
  private String businessApplicationId = null;

  @SerializedName("networkRoutingOrder")
  private String networkRoutingOrder = null;

  @SerializedName("commerceIndicator")
  private String commerceIndicator = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("payoutsOptions")
  private Ptsv2payoutsProcessingInformationPayoutsOptions payoutsOptions = null;

  @SerializedName("transactionReason")
  private String transactionReason = null;

  @SerializedName("purposeOfPayment")
  private String purposeOfPayment = null;

  @SerializedName("fundingOptions")
  private Ptsv2payoutsProcessingInformationFundingOptions fundingOptions = null;

  public Ptsv2payoutsProcessingInformation businessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
    return this;
  }

   /**
   * Payouts transaction type.  Applicable Processors: FDC Compass, Paymentech, CtV  Possible values:  **Credit Card Bill Payment**   - **CP**: credit card bill payment  **Funds Disbursement**   - **FD**: funds disbursement  - **GD**: government disbursement  - **MD**: merchant disbursement  **Money Transfer**   - **AA**: account to account. Sender and receiver are same person.  - **PP**: person to person. Sender and receiver are different.  **Prepaid Load**   - **TU**: top up 
   * @return businessApplicationId
  **/
  @ApiModelProperty(value = "Payouts transaction type.  Applicable Processors: FDC Compass, Paymentech, CtV  Possible values:  **Credit Card Bill Payment**   - **CP**: credit card bill payment  **Funds Disbursement**   - **FD**: funds disbursement  - **GD**: government disbursement  - **MD**: merchant disbursement  **Money Transfer**   - **AA**: account to account. Sender and receiver are same person.  - **PP**: person to person. Sender and receiver are different.  **Prepaid Load**   - **TU**: top up ")
  public String getBusinessApplicationId() {
    return businessApplicationId;
  }

  public void setBusinessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
  }

  public Ptsv2payoutsProcessingInformation networkRoutingOrder(String networkRoutingOrder) {
    this.networkRoutingOrder = networkRoutingOrder;
    return this;
  }

   /**
   * This field is optionally used by Push Payments Gateway participants (merchants and acquirers) to get the attributes for specified networks only. The networks specified in this field must be a subset of the information provided during program enrollment. Refer to Sharing Group Code/Network Routing Order. Note: Supported only in US for domestic transactions involving Push Payments Gateway Service.  VisaNet checks to determine if there are issuer routing preferences for any of the networks specified by the network routing order. If an issuer preference exists for one of the specified debit networks, VisaNet makes a routing selection based on the issuer&#39;s preference.  If an issuer preference exists for more than one of the specified debit networks, or if no issuer preference exists, VisaNet makes a selection based on the acquirer&#39;s routing priorities.   For details, see the &#x60;network_order&#x60; field description in [BIN Lookup Service Using the SCMP API.](http://apps.cybersource.com/library/documentation/BIN_Lookup/BIN_Lookup_SCMP_API/html/) 
   * @return networkRoutingOrder
  **/
  @ApiModelProperty(value = "This field is optionally used by Push Payments Gateway participants (merchants and acquirers) to get the attributes for specified networks only. The networks specified in this field must be a subset of the information provided during program enrollment. Refer to Sharing Group Code/Network Routing Order. Note: Supported only in US for domestic transactions involving Push Payments Gateway Service.  VisaNet checks to determine if there are issuer routing preferences for any of the networks specified by the network routing order. If an issuer preference exists for one of the specified debit networks, VisaNet makes a routing selection based on the issuer's preference.  If an issuer preference exists for more than one of the specified debit networks, or if no issuer preference exists, VisaNet makes a selection based on the acquirer's routing priorities.   For details, see the `network_order` field description in [BIN Lookup Service Using the SCMP API.](http://apps.cybersource.com/library/documentation/BIN_Lookup/BIN_Lookup_SCMP_API/html/) ")
  public String getNetworkRoutingOrder() {
    return networkRoutingOrder;
  }

  public void setNetworkRoutingOrder(String networkRoutingOrder) {
    this.networkRoutingOrder = networkRoutingOrder;
  }

  public Ptsv2payoutsProcessingInformation commerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
    return this;
  }

   /**
   * Type of transaction.  Value for an OCT transaction: - &#x60;internet&#x60;  For details, see the &#x60;e_commerce_indicator&#x60; field description in [Payouts Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/payouts_SCMP/html/) 
   * @return commerceIndicator
  **/
  @ApiModelProperty(value = "Type of transaction.  Value for an OCT transaction: - `internet`  For details, see the `e_commerce_indicator` field description in [Payouts Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/payouts_SCMP/html/) ")
  public String getCommerceIndicator() {
    return commerceIndicator;
  }

  public void setCommerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
  }

  public Ptsv2payoutsProcessingInformation reconciliationId(String reconciliationId) {
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

  public Ptsv2payoutsProcessingInformation payoutsOptions(Ptsv2payoutsProcessingInformationPayoutsOptions payoutsOptions) {
    this.payoutsOptions = payoutsOptions;
    return this;
  }

   /**
   * Get payoutsOptions
   * @return payoutsOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsProcessingInformationPayoutsOptions getPayoutsOptions() {
    return payoutsOptions;
  }

  public void setPayoutsOptions(Ptsv2payoutsProcessingInformationPayoutsOptions payoutsOptions) {
    this.payoutsOptions = payoutsOptions;
  }

  public Ptsv2payoutsProcessingInformation transactionReason(String transactionReason) {
    this.transactionReason = transactionReason;
    return this;
  }

   /**
   * Transaction reason code. 
   * @return transactionReason
  **/
  @ApiModelProperty(value = "Transaction reason code. ")
  public String getTransactionReason() {
    return transactionReason;
  }

  public void setTransactionReason(String transactionReason) {
    this.transactionReason = transactionReason;
  }

  public Ptsv2payoutsProcessingInformation purposeOfPayment(String purposeOfPayment) {
    this.purposeOfPayment = purposeOfPayment;
    return this;
  }

   /**
   * This will send purpose of funds code for original credit transactions (OCTs). 
   * @return purposeOfPayment
  **/
  @ApiModelProperty(value = "This will send purpose of funds code for original credit transactions (OCTs). ")
  public String getPurposeOfPayment() {
    return purposeOfPayment;
  }

  public void setPurposeOfPayment(String purposeOfPayment) {
    this.purposeOfPayment = purposeOfPayment;
  }

  public Ptsv2payoutsProcessingInformation fundingOptions(Ptsv2payoutsProcessingInformationFundingOptions fundingOptions) {
    this.fundingOptions = fundingOptions;
    return this;
  }

   /**
   * Get fundingOptions
   * @return fundingOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsProcessingInformationFundingOptions getFundingOptions() {
    return fundingOptions;
  }

  public void setFundingOptions(Ptsv2payoutsProcessingInformationFundingOptions fundingOptions) {
    this.fundingOptions = fundingOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2payoutsProcessingInformation ptsv2payoutsProcessingInformation = (Ptsv2payoutsProcessingInformation) o;
    return Objects.equals(this.businessApplicationId, ptsv2payoutsProcessingInformation.businessApplicationId) &&
        Objects.equals(this.networkRoutingOrder, ptsv2payoutsProcessingInformation.networkRoutingOrder) &&
        Objects.equals(this.commerceIndicator, ptsv2payoutsProcessingInformation.commerceIndicator) &&
        Objects.equals(this.reconciliationId, ptsv2payoutsProcessingInformation.reconciliationId) &&
        Objects.equals(this.payoutsOptions, ptsv2payoutsProcessingInformation.payoutsOptions) &&
        Objects.equals(this.transactionReason, ptsv2payoutsProcessingInformation.transactionReason) &&
        Objects.equals(this.purposeOfPayment, ptsv2payoutsProcessingInformation.purposeOfPayment) &&
        Objects.equals(this.fundingOptions, ptsv2payoutsProcessingInformation.fundingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessApplicationId, networkRoutingOrder, commerceIndicator, reconciliationId, payoutsOptions, transactionReason, purposeOfPayment, fundingOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2payoutsProcessingInformation {\n");
    
    sb.append("    businessApplicationId: ").append(toIndentedString(businessApplicationId)).append("\n");
    sb.append("    networkRoutingOrder: ").append(toIndentedString(networkRoutingOrder)).append("\n");
    sb.append("    commerceIndicator: ").append(toIndentedString(commerceIndicator)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    payoutsOptions: ").append(toIndentedString(payoutsOptions)).append("\n");
    sb.append("    transactionReason: ").append(toIndentedString(transactionReason)).append("\n");
    sb.append("    purposeOfPayment: ").append(toIndentedString(purposeOfPayment)).append("\n");
    sb.append("    fundingOptions: ").append(toIndentedString(fundingOptions)).append("\n");
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

