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
 * TssV2TransactionsPost201ResponseEmbeddedProcessingInformation
 */

public class TssV2TransactionsPost201ResponseEmbeddedProcessingInformation {
  @SerializedName("paymentSolution")
  private String paymentSolution = null;

  @SerializedName("businessApplicationId")
  private String businessApplicationId = null;

  @SerializedName("commerceIndicator")
  private String commerceIndicator = null;

  @SerializedName("commerceIndicatorLabel")
  private String commerceIndicatorLabel = null;

  public TssV2TransactionsPost201ResponseEmbeddedProcessingInformation paymentSolution(String paymentSolution) {
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

  public TssV2TransactionsPost201ResponseEmbeddedProcessingInformation businessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
    return this;
  }

   /**
   * Payouts transaction type. Required for OCT transactions. This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor. **Note** When the request includes this field, this value overrides the information in your CyberSource account.  For valid values, see the &#x60;invoiceHeader_businessApplicationID&#x60; field description in [Payouts Using the Simple Order API.](http://apps.cybersource.com/library/documentation/dev_guides/payouts_SO/Payouts_SO_API.pdf) 
   * @return businessApplicationId
  **/
  @ApiModelProperty(value = "Payouts transaction type. Required for OCT transactions. This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor. **Note** When the request includes this field, this value overrides the information in your CyberSource account.  For valid values, see the `invoiceHeader_businessApplicationID` field description in [Payouts Using the Simple Order API.](http://apps.cybersource.com/library/documentation/dev_guides/payouts_SO/Payouts_SO_API.pdf) ")
  public String getBusinessApplicationId() {
    return businessApplicationId;
  }

  public void setBusinessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
  }

  public TssV2TransactionsPost201ResponseEmbeddedProcessingInformation commerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
    return this;
  }

   /**
   * Type of transaction. Some payment card companies use this information when determining discount rates.  #### Used by **Authorization** Required payer authentication transactions; otherwise, optional. **Credit** Required for standalone credits on Chase Paymentech solutions; otherwise, optional.  The list of valid values in this field depends on your processor. See Appendix I, \&quot;Commerce Indicators,\&quot; on page 441 of the Cybersource Credit Card Guide.  #### Ingenico ePayments When you omit this field for Ingenico ePayments, the processor uses the default transaction type they have on file for you instead of the default value (listed in Appendix I, \&quot;Commerce Indicators,\&quot; on page 441.)  #### Payer Authentication Transactions For the possible values and requirements, see \&quot;Payer Authentication,\&quot; page 195.  #### Card Present You must set this field to &#x60;retail&#x60;. This field is required for a card-present transaction. Note that this should ONLY be used when the cardholder and card are present at the time of the transaction. For all keyed transactions originated from a POS terminal where the cardholder and card are not present, commerceIndicator should be submitted as \&quot;moto\&quot; 
   * @return commerceIndicator
  **/
  @ApiModelProperty(value = "Type of transaction. Some payment card companies use this information when determining discount rates.  #### Used by **Authorization** Required payer authentication transactions; otherwise, optional. **Credit** Required for standalone credits on Chase Paymentech solutions; otherwise, optional.  The list of valid values in this field depends on your processor. See Appendix I, \"Commerce Indicators,\" on page 441 of the Cybersource Credit Card Guide.  #### Ingenico ePayments When you omit this field for Ingenico ePayments, the processor uses the default transaction type they have on file for you instead of the default value (listed in Appendix I, \"Commerce Indicators,\" on page 441.)  #### Payer Authentication Transactions For the possible values and requirements, see \"Payer Authentication,\" page 195.  #### Card Present You must set this field to `retail`. This field is required for a card-present transaction. Note that this should ONLY be used when the cardholder and card are present at the time of the transaction. For all keyed transactions originated from a POS terminal where the cardholder and card are not present, commerceIndicator should be submitted as \"moto\" ")
  public String getCommerceIndicator() {
    return commerceIndicator;
  }

  public void setCommerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
  }

  public TssV2TransactionsPost201ResponseEmbeddedProcessingInformation commerceIndicatorLabel(String commerceIndicatorLabel) {
    this.commerceIndicatorLabel = commerceIndicatorLabel;
    return this;
  }

   /**
   * Type of transaction. Some payment card companies use this information when determining discount rates.  #### Used by **Authorization** Required payer authentication transactions; otherwise, optional. **Credit** Required for standalone credits on Chase Paymentech solutions; otherwise, optional.  The list of valid values in this field depends on your processor. See Appendix I, \&quot;Commerce Indicators,\&quot; on page 441 of the Cybersource Credit Card Guide.  #### Ingenico ePayments When you omit this field for Ingenico ePayments, the processor uses the default transaction type they have on file for you instead of the default value (listed in Appendix I, \&quot;Commerce Indicators,\&quot; on page 441.)  #### Payer Authentication Transactions For the possible values and requirements, see \&quot;Payer Authentication,\&quot; page 195.  #### Card Present You must set this field to &#x60;retail&#x60;. This field is required for a card-present transaction. Note that this should ONLY be used when the cardholder and card are present at the time of the transaction. For all keyed transactions originated from a POS terminal where the cardholder and card are not present, commerceIndicator should be submitted as \&quot;moto\&quot; 
   * @return commerceIndicatorLabel
  **/
  @ApiModelProperty(value = "Type of transaction. Some payment card companies use this information when determining discount rates.  #### Used by **Authorization** Required payer authentication transactions; otherwise, optional. **Credit** Required for standalone credits on Chase Paymentech solutions; otherwise, optional.  The list of valid values in this field depends on your processor. See Appendix I, \"Commerce Indicators,\" on page 441 of the Cybersource Credit Card Guide.  #### Ingenico ePayments When you omit this field for Ingenico ePayments, the processor uses the default transaction type they have on file for you instead of the default value (listed in Appendix I, \"Commerce Indicators,\" on page 441.)  #### Payer Authentication Transactions For the possible values and requirements, see \"Payer Authentication,\" page 195.  #### Card Present You must set this field to `retail`. This field is required for a card-present transaction. Note that this should ONLY be used when the cardholder and card are present at the time of the transaction. For all keyed transactions originated from a POS terminal where the cardholder and card are not present, commerceIndicator should be submitted as \"moto\" ")
  public String getCommerceIndicatorLabel() {
    return commerceIndicatorLabel;
  }

  public void setCommerceIndicatorLabel(String commerceIndicatorLabel) {
    this.commerceIndicatorLabel = commerceIndicatorLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedProcessingInformation tssV2TransactionsPost201ResponseEmbeddedProcessingInformation = (TssV2TransactionsPost201ResponseEmbeddedProcessingInformation) o;
    return Objects.equals(this.paymentSolution, tssV2TransactionsPost201ResponseEmbeddedProcessingInformation.paymentSolution) &&
        Objects.equals(this.businessApplicationId, tssV2TransactionsPost201ResponseEmbeddedProcessingInformation.businessApplicationId) &&
        Objects.equals(this.commerceIndicator, tssV2TransactionsPost201ResponseEmbeddedProcessingInformation.commerceIndicator) &&
        Objects.equals(this.commerceIndicatorLabel, tssV2TransactionsPost201ResponseEmbeddedProcessingInformation.commerceIndicatorLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSolution, businessApplicationId, commerceIndicator, commerceIndicatorLabel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedProcessingInformation {\n");
    
    sb.append("    paymentSolution: ").append(toIndentedString(paymentSolution)).append("\n");
    sb.append("    businessApplicationId: ").append(toIndentedString(businessApplicationId)).append("\n");
    sb.append("    commerceIndicator: ").append(toIndentedString(commerceIndicator)).append("\n");
    sb.append("    commerceIndicatorLabel: ").append(toIndentedString(commerceIndicatorLabel)).append("\n");
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

