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
import Model.PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayoutsCurrencies;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts
 */

public class PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts {
  @SerializedName("reimbursementCode")
  private String reimbursementCode = null;

  @SerializedName("acquiringInstitutionId")
  private String acquiringInstitutionId = null;

  @SerializedName("businessApplicationId")
  private String businessApplicationId = null;

  @SerializedName("financialInstitutionId")
  private String financialInstitutionId = null;

  @SerializedName("merchantAbaNumber")
  private String merchantAbaNumber = null;

  @SerializedName("networkOrder")
  private String networkOrder = null;

  @SerializedName("currencies")
  private Map<String, PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayoutsCurrencies> currencies = null;

  @SerializedName("merchantId")
  private String merchantId = null;

  @SerializedName("terminalId")
  private String terminalId = null;

  public PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts reimbursementCode(String reimbursementCode) {
    this.reimbursementCode = reimbursementCode;
    return this;
  }

   /**
   * Applicable for VPC processors.
   * @return reimbursementCode
  **/
  @ApiModelProperty(value = "Applicable for VPC processors.")
  public String getReimbursementCode() {
    return reimbursementCode;
  }

  public void setReimbursementCode(String reimbursementCode) {
    this.reimbursementCode = reimbursementCode;
  }

  public PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts acquiringInstitutionId(String acquiringInstitutionId) {
    this.acquiringInstitutionId = acquiringInstitutionId;
    return this;
  }

   /**
   * This code identifies the financial institution acting as the acquirer of this customer transaction. The acquirer is the member or system user that signed the merchant. This number is usually a Visa-assigned. Applicable for VPC processors.
   * @return acquiringInstitutionId
  **/
  @ApiModelProperty(value = "This code identifies the financial institution acting as the acquirer of this customer transaction. The acquirer is the member or system user that signed the merchant. This number is usually a Visa-assigned. Applicable for VPC processors.")
  public String getAcquiringInstitutionId() {
    return acquiringInstitutionId;
  }

  public void setAcquiringInstitutionId(String acquiringInstitutionId) {
    this.acquiringInstitutionId = acquiringInstitutionId;
  }

  public PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts businessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
    return this;
  }

   /**
   * Transaction type. List of supported identifiers documented in the Developer Guide. Applicable for GPX (gpx) and VPC processors.
   * @return businessApplicationId
  **/
  @ApiModelProperty(value = "Transaction type. List of supported identifiers documented in the Developer Guide. Applicable for GPX (gpx) and VPC processors.")
  public String getBusinessApplicationId() {
    return businessApplicationId;
  }

  public void setBusinessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
  }

  public PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts financialInstitutionId(String financialInstitutionId) {
    this.financialInstitutionId = financialInstitutionId;
    return this;
  }

   /**
   * Applicable for GPX (gpx) and VPC processors.
   * @return financialInstitutionId
  **/
  @ApiModelProperty(value = "Applicable for GPX (gpx) and VPC processors.")
  public String getFinancialInstitutionId() {
    return financialInstitutionId;
  }

  public void setFinancialInstitutionId(String financialInstitutionId) {
    this.financialInstitutionId = financialInstitutionId;
  }

  public PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts merchantAbaNumber(String merchantAbaNumber) {
    this.merchantAbaNumber = merchantAbaNumber;
    return this;
  }

   /**
   * Routing Number to identify banks within the United States. Applicable for VPC processors.
   * @return merchantAbaNumber
  **/
  @ApiModelProperty(value = "Routing Number to identify banks within the United States. Applicable for VPC processors.")
  public String getMerchantAbaNumber() {
    return merchantAbaNumber;
  }

  public void setMerchantAbaNumber(String merchantAbaNumber) {
    this.merchantAbaNumber = merchantAbaNumber;
  }

  public PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts networkOrder(String networkOrder) {
    this.networkOrder = networkOrder;
    return this;
  }

   /**
   * Order of the networks in which Visa should make routing decisions. Applicable for VPC processors.
   * @return networkOrder
  **/
  @ApiModelProperty(value = "Order of the networks in which Visa should make routing decisions. Applicable for VPC processors.")
  public String getNetworkOrder() {
    return networkOrder;
  }

  public void setNetworkOrder(String networkOrder) {
    this.networkOrder = networkOrder;
  }

  public PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts currencies(Map<String, PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayoutsCurrencies> currencies) {
    this.currencies = currencies;
    return this;
  }

  public PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts putCurrenciesItem(String key, PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayoutsCurrencies currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new HashMap<String, PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayoutsCurrencies>();
    }
    this.currencies.put(key, currenciesItem);
    return this;
  }

   /**
   * Three-character [ISO 4217 ALPHA-3 Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)
   * @return currencies
  **/
  @ApiModelProperty(example = "{\"USD\":{\"enabled\":true,\"enabledCardPresent\":false,\"enabledCardNotPresent\":true,\"merchantId\":\"merchantId\",\"terminalIds\":[\"12345678\",\"12345678\"],\"serviceEnablementNumber\":\"serviceEnablementNumber\"}}", value = "Three-character [ISO 4217 ALPHA-3 Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)")
  public Map<String, PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayoutsCurrencies> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(Map<String, PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayoutsCurrencies> currencies) {
    this.currencies = currencies;
  }

  public PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Merchant ID assigned by an acquirer or a processor. Should not be overridden by any other party.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;Barclays&lt;/td&gt;&lt;td&gt;cnp, hybrid&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;11&lt;/td&gt;&lt;td&gt;^[0-9]+$&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return merchantId
  **/
  @ApiModelProperty(value = "Merchant ID assigned by an acquirer or a processor. Should not be overridden by any other party.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th></tr></thead> <tr><td>Barclays</td><td>cnp, hybrid</td><td>No</td><td>1</td><td>11</td><td>^[0-9]+$</td></tr> </table> ")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * The &#39;Terminal Id&#39; aka TID, is an identifier used for with your payments processor. Depending on the processor and payment acceptance type this may also be the default Terminal ID used for Card Present and Virtual Terminal transactions.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;Barclays&lt;/td&gt;&lt;td&gt;cnp, hybrid&lt;/td&gt;&lt;td&gt;No&lt;/td&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;255&lt;/td&gt;&lt;td&gt;^[0-9:&amp;#92;-]+$&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return terminalId
  **/
  @ApiModelProperty(value = "The 'Terminal Id' aka TID, is an identifier used for with your payments processor. Depending on the processor and payment acceptance type this may also be the default Terminal ID used for Card Present and Virtual Terminal transactions.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th></tr></thead> <tr><td>Barclays</td><td>cnp, hybrid</td><td>No</td><td>1</td><td>255</td><td>^[0-9:&#92;-]+$</td></tr> </table> ")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts paymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts = (PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts) o;
    return Objects.equals(this.reimbursementCode, paymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts.reimbursementCode) &&
        Objects.equals(this.acquiringInstitutionId, paymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts.acquiringInstitutionId) &&
        Objects.equals(this.businessApplicationId, paymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts.businessApplicationId) &&
        Objects.equals(this.financialInstitutionId, paymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts.financialInstitutionId) &&
        Objects.equals(this.merchantAbaNumber, paymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts.merchantAbaNumber) &&
        Objects.equals(this.networkOrder, paymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts.networkOrder) &&
        Objects.equals(this.currencies, paymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts.currencies) &&
        Objects.equals(this.merchantId, paymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts.merchantId) &&
        Objects.equals(this.terminalId, paymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts.terminalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reimbursementCode, acquiringInstitutionId, businessApplicationId, financialInstitutionId, merchantAbaNumber, networkOrder, currencies, merchantId, terminalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProductsCardProcessingConfigurationInformationConfigurationsFeaturesCardNotPresentPayouts {\n");
    
    sb.append("    reimbursementCode: ").append(toIndentedString(reimbursementCode)).append("\n");
    sb.append("    acquiringInstitutionId: ").append(toIndentedString(acquiringInstitutionId)).append("\n");
    sb.append("    businessApplicationId: ").append(toIndentedString(businessApplicationId)).append("\n");
    sb.append("    financialInstitutionId: ").append(toIndentedString(financialInstitutionId)).append("\n");
    sb.append("    merchantAbaNumber: ").append(toIndentedString(merchantAbaNumber)).append("\n");
    sb.append("    networkOrder: ").append(toIndentedString(networkOrder)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
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

