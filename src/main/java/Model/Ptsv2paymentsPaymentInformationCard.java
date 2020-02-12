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
 * Ptsv2paymentsPaymentInformationCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-12T15:59:24.815+05:30")
public class Ptsv2paymentsPaymentInformationCard {
  @SerializedName("number")
  private String number = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("useAs")
  private String useAs = null;

  @SerializedName("sourceAccountType")
  private String sourceAccountType = null;

  @SerializedName("sourceAccountTypeDetails")
  private String sourceAccountTypeDetails = null;

  @SerializedName("securityCode")
  private String securityCode = null;

  @SerializedName("securityCodeIndicator")
  private String securityCodeIndicator = null;

  @SerializedName("accountEncoderId")
  private String accountEncoderId = null;

  @SerializedName("issueNumber")
  private String issueNumber = null;

  @SerializedName("startMonth")
  private String startMonth = null;

  @SerializedName("startYear")
  private String startYear = null;

  @SerializedName("productName")
  private String productName = null;

  public Ptsv2paymentsPaymentInformationCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The customer’s payment card number, also known as the Primary Account Number (PAN). You can also use this field for encoded account numbers.  For processor-specific information, see the &#x60;customer_cc_number&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return number
  **/
  @ApiModelProperty(value = "The customer’s payment card number, also known as the Primary Account Number (PAN). You can also use this field for encoded account numbers.  For processor-specific information, see the `customer_cc_number` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Ptsv2paymentsPaymentInformationCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Two-digit month in which the payment card expires.  Format: &#x60;MM&#x60;.  Valid values: &#x60;01&#x60; through &#x60;12&#x60;.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (&#x60;01&#x60; through &#x60;12&#x60;) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (_type_&#x3D;039), if there is no expiration date on the card, use &#x60;12&#x60;.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  For processor-specific information, see the &#x60;customer_cc_expmo&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "Two-digit month in which the payment card expires.  Format: `MM`.  Valid values: `01` through `12`.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (`01` through `12`) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (_type_=039), if there is no expiration date on the card, use `12`.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  For processor-specific information, see the `customer_cc_expmo` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public Ptsv2paymentsPaymentInformationCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Four-digit year in which the credit card expires.  Format: &#x60;YYYY&#x60;.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (&#x60;1900&#x60; through &#x60;3000&#x60;) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (**_type_**&#x60;&#x3D;039&#x60;), if there is no expiration date on the card, use &#x60;2021&#x60;.  #### FDC Nashville Global and FDMS South You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  For processor-specific information, see the &#x60;customer_cc_expyr&#x60; field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return expirationYear
  **/
  @ApiModelProperty(value = "Four-digit year in which the credit card expires.  Format: `YYYY`.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (`1900` through `3000`) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (**_type_**`=039`), if there is no expiration date on the card, use `2021`.  #### FDC Nashville Global and FDMS South You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  For processor-specific information, see the `customer_cc_expyr` field description in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public Ptsv2paymentsPaymentInformationCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Three-digit value that indicates the card type.  Type of card to authorize. - 001 Visa - 002 Mastercard - 003 Amex - 004 Discover - 005: Diners Club - 007: JCB - 024: Maestro (UK Domestic) - 036: Cartes Bancaires - 039 Encoded account number - 042: Maestro (International)  For the complete list of possible values, see &#x60;card_type&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return type
  **/
  @ApiModelProperty(value = "Three-digit value that indicates the card type.  Type of card to authorize. - 001 Visa - 002 Mastercard - 003 Amex - 004 Discover - 005: Diners Club - 007: JCB - 024: Maestro (UK Domestic) - 036: Cartes Bancaires - 039 Encoded account number - 042: Maestro (International)  For the complete list of possible values, see `card_type` field description in the [Credit Card Services Using the SCMP API Guide.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv2paymentsPaymentInformationCard useAs(String useAs) {
    this.useAs = useAs;
    return this;
  }

   /**
   * Flag that specifies the type of account associated with the card. The cardholder provides this information during the payment process.  #### Cielo and Comercio Latino  Possible values:   - CREDIT: Credit card  - DEBIT: Debit card  This field is required for:  - Debit transactions on Cielo and Comercio Latino.  - Transactions with Brazilian-issued cards on CyberSource through VisaNet.  **Note** The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR0 - Position: 51 - Field: Combination Card Transaction Identifier  This field is supported only for Mastercard transactions in Brazil on CyberSource through VisaNet. 
   * @return useAs
  **/
  @ApiModelProperty(value = "Flag that specifies the type of account associated with the card. The cardholder provides this information during the payment process.  #### Cielo and Comercio Latino  Possible values:   - CREDIT: Credit card  - DEBIT: Debit card  This field is required for:  - Debit transactions on Cielo and Comercio Latino.  - Transactions with Brazilian-issued cards on CyberSource through VisaNet.  **Note** The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR0 - Position: 51 - Field: Combination Card Transaction Identifier  This field is supported only for Mastercard transactions in Brazil on CyberSource through VisaNet. ")
  public String getUseAs() {
    return useAs;
  }

  public void setUseAs(String useAs) {
    this.useAs = useAs;
  }

  public Ptsv2paymentsPaymentInformationCard sourceAccountType(String sourceAccountType) {
    this.sourceAccountType = sourceAccountType;
    return this;
  }

   /**
   * Flag that specifies the type of account associated with the card. The cardholder provides this information during the payment process.  This field is required in the following cases:   - Debit transactions on Cielo and Comercio Latino.   - Transactions with Brazilian-issued cards on CyberSource through VisaNet.   - Applicable only for CyberSource through VisaNet (CtV).      **Note** Combo cards in Brazil contain credit and debit functionality in a single card. Visa systems use a credit bank identification number (BIN) for this type of card. Using the BIN to determine whether a card is debit or credit can cause transactions with these cards to be processed incorrectly. CyberSource strongly recommends that you include this field for combo card transactions.  Possible values include the following.   - &#x60;CHECKING&#x60;: Checking account  - &#x60;CREDIT&#x60;: Credit card account  - &#x60;SAVING&#x60;: Saving account  - &#x60;LINE_OF_CREDIT&#x60;: Line of credit or credit portion of combo card  - &#x60;PREPAID&#x60;: Prepaid card account or prepaid portion of combo card  - &#x60;UNIVERSAL&#x60;: Universal account 
   * @return sourceAccountType
  **/
  @ApiModelProperty(value = "Flag that specifies the type of account associated with the card. The cardholder provides this information during the payment process.  This field is required in the following cases:   - Debit transactions on Cielo and Comercio Latino.   - Transactions with Brazilian-issued cards on CyberSource through VisaNet.   - Applicable only for CyberSource through VisaNet (CtV).      **Note** Combo cards in Brazil contain credit and debit functionality in a single card. Visa systems use a credit bank identification number (BIN) for this type of card. Using the BIN to determine whether a card is debit or credit can cause transactions with these cards to be processed incorrectly. CyberSource strongly recommends that you include this field for combo card transactions.  Possible values include the following.   - `CHECKING`: Checking account  - `CREDIT`: Credit card account  - `SAVING`: Saving account  - `LINE_OF_CREDIT`: Line of credit or credit portion of combo card  - `PREPAID`: Prepaid card account or prepaid portion of combo card  - `UNIVERSAL`: Universal account ")
  public String getSourceAccountType() {
    return sourceAccountType;
  }

  public void setSourceAccountType(String sourceAccountType) {
    this.sourceAccountType = sourceAccountType;
  }

  public Ptsv2paymentsPaymentInformationCard sourceAccountTypeDetails(String sourceAccountTypeDetails) {
    this.sourceAccountTypeDetails = sourceAccountTypeDetails;
    return this;
  }

   /**
   * Type of account that is being used when the value for the override_payment_method field is line of credit (LI) or prepaid card (PP). Possible values for line of credit: - &#x60;AGRC&#x60;: Visa Agro Custeio - &#x60;AGRE&#x60;: Visa Agro Electron - &#x60;AGRI&#x60;: Visa Agro Investimento - &#x60;AGRO&#x60;: Visa Agro Possible values for prepaid card: - &#x60;VVA&#x60;: Visa Vale Alimentacao - &#x60;VVF&#x60;: Visa Vale Flex - &#x60;VVR&#x60;: Visa Vale Refeicao This field is supported only for combo card transactions in Brazil on CyberSource through VisaNet. The value for this field corresponds to the following data in the TC 33 capture file5: Record: CP07 TCR0, Position: 44-47, Field: Account Accessed 
   * @return sourceAccountTypeDetails
  **/
  @ApiModelProperty(value = "Type of account that is being used when the value for the override_payment_method field is line of credit (LI) or prepaid card (PP). Possible values for line of credit: - `AGRC`: Visa Agro Custeio - `AGRE`: Visa Agro Electron - `AGRI`: Visa Agro Investimento - `AGRO`: Visa Agro Possible values for prepaid card: - `VVA`: Visa Vale Alimentacao - `VVF`: Visa Vale Flex - `VVR`: Visa Vale Refeicao This field is supported only for combo card transactions in Brazil on CyberSource through VisaNet. The value for this field corresponds to the following data in the TC 33 capture file5: Record: CP07 TCR0, Position: 44-47, Field: Account Accessed ")
  public String getSourceAccountTypeDetails() {
    return sourceAccountTypeDetails;
  }

  public void setSourceAccountTypeDetails(String sourceAccountTypeDetails) {
    this.sourceAccountTypeDetails = sourceAccountTypeDetails;
  }

  public Ptsv2paymentsPaymentInformationCard securityCode(String securityCode) {
    this.securityCode = securityCode;
    return this;
  }

   /**
   * Card Verification Number.  #### Ingenico ePayments Do not include this field when **commerceIndicator**&#x60;&#x3D;recurring&#x60;. **Note** Ingenico ePayments was previously called _Global Collect_. 
   * @return securityCode
  **/
  @ApiModelProperty(value = "Card Verification Number.  #### Ingenico ePayments Do not include this field when **commerceIndicator**`=recurring`. **Note** Ingenico ePayments was previously called _Global Collect_. ")
  public String getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }

  public Ptsv2paymentsPaymentInformationCard securityCodeIndicator(String securityCodeIndicator) {
    this.securityCodeIndicator = securityCodeIndicator;
    return this;
  }

   /**
   * Flag that indicates whether a CVN code was sent. Possible values:   - 0 (default): CVN service not requested. CyberSource uses this default value when you do not include      _securityCode_ field in the request.  - 1 (default): CVN service requested and supported. CyberSource uses this default value when you include      _securityCode_ field in the request.  - 2: CVN on credit card is illegible.  - 9: CVN was not imprinted on credit card. 
   * @return securityCodeIndicator
  **/
  @ApiModelProperty(value = "Flag that indicates whether a CVN code was sent. Possible values:   - 0 (default): CVN service not requested. CyberSource uses this default value when you do not include      _securityCode_ field in the request.  - 1 (default): CVN service requested and supported. CyberSource uses this default value when you include      _securityCode_ field in the request.  - 2: CVN on credit card is illegible.  - 9: CVN was not imprinted on credit card. ")
  public String getSecurityCodeIndicator() {
    return securityCodeIndicator;
  }

  public void setSecurityCodeIndicator(String securityCodeIndicator) {
    this.securityCodeIndicator = securityCodeIndicator;
  }

  public Ptsv2paymentsPaymentInformationCard accountEncoderId(String accountEncoderId) {
    this.accountEncoderId = accountEncoderId;
    return this;
  }

   /**
   * Identifier for the issuing bank that provided the customer’s encoded account number. Contact your processor for the bank’s ID. 
   * @return accountEncoderId
  **/
  @ApiModelProperty(value = "Identifier for the issuing bank that provided the customer’s encoded account number. Contact your processor for the bank’s ID. ")
  public String getAccountEncoderId() {
    return accountEncoderId;
  }

  public void setAccountEncoderId(String accountEncoderId) {
    this.accountEncoderId = accountEncoderId;
  }

  public Ptsv2paymentsPaymentInformationCard issueNumber(String issueNumber) {
    this.issueNumber = issueNumber;
    return this;
  }

   /**
   * Number of times a Maestro (UK Domestic) card has been issued to the account holder. The card might or might not have an issue number. The number can consist of one or two digits, and the first digit might be a zero. When you include this value in your request, include exactly what is printed on the card. A value of 2 is different than a value of 02. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card.  **Note** The issue number is not required for Maestro (UK Domestic) transactions. 
   * @return issueNumber
  **/
  @ApiModelProperty(value = "Number of times a Maestro (UK Domestic) card has been issued to the account holder. The card might or might not have an issue number. The number can consist of one or two digits, and the first digit might be a zero. When you include this value in your request, include exactly what is printed on the card. A value of 2 is different than a value of 02. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card.  **Note** The issue number is not required for Maestro (UK Domestic) transactions. ")
  public String getIssueNumber() {
    return issueNumber;
  }

  public void setIssueNumber(String issueNumber) {
    this.issueNumber = issueNumber;
  }

  public Ptsv2paymentsPaymentInformationCard startMonth(String startMonth) {
    this.startMonth = startMonth;
    return this;
  }

   /**
   * Month of the start of the Maestro (UK Domestic) card validity period. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card. &#x60;Format: MM&#x60;. Possible values: 01 through 12.  **Note** The start date is not required for Maestro (UK Domestic) transactions. 
   * @return startMonth
  **/
  @ApiModelProperty(value = "Month of the start of the Maestro (UK Domestic) card validity period. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card. `Format: MM`. Possible values: 01 through 12.  **Note** The start date is not required for Maestro (UK Domestic) transactions. ")
  public String getStartMonth() {
    return startMonth;
  }

  public void setStartMonth(String startMonth) {
    this.startMonth = startMonth;
  }

  public Ptsv2paymentsPaymentInformationCard startYear(String startYear) {
    this.startYear = startYear;
    return this;
  }

   /**
   * Year of the start of the Maestro (UK Domestic) card validity period. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card. &#x60;Format: YYYY&#x60;.  **Note** The start date is not required for Maestro (UK Domestic) transactions. 
   * @return startYear
  **/
  @ApiModelProperty(value = "Year of the start of the Maestro (UK Domestic) card validity period. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card. `Format: YYYY`.  **Note** The start date is not required for Maestro (UK Domestic) transactions. ")
  public String getStartYear() {
    return startYear;
  }

  public void setStartYear(String startYear) {
    this.startYear = startYear;
  }

  public Ptsv2paymentsPaymentInformationCard productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Name of the card product.  Possible value: - BNDES  This field is supported only for BNDES transactions on CyberSource through VisaNet. For details, see &#x60;card_product_name&#x60; field description in the [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/).  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR4 - Position: 115-120 - Field: Brazil Country Data 
   * @return productName
  **/
  @ApiModelProperty(value = "Name of the card product.  Possible value: - BNDES  This field is supported only for BNDES transactions on CyberSource through VisaNet. For details, see `card_product_name` field description in the [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/).  The value for this field corresponds to the following data in the TC 33 capture file5: - Record: CP07 TCR4 - Position: 115-120 - Field: Brazil Country Data ")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPaymentInformationCard ptsv2paymentsPaymentInformationCard = (Ptsv2paymentsPaymentInformationCard) o;
    return Objects.equals(this.number, ptsv2paymentsPaymentInformationCard.number) &&
        Objects.equals(this.expirationMonth, ptsv2paymentsPaymentInformationCard.expirationMonth) &&
        Objects.equals(this.expirationYear, ptsv2paymentsPaymentInformationCard.expirationYear) &&
        Objects.equals(this.type, ptsv2paymentsPaymentInformationCard.type) &&
        Objects.equals(this.useAs, ptsv2paymentsPaymentInformationCard.useAs) &&
        Objects.equals(this.sourceAccountType, ptsv2paymentsPaymentInformationCard.sourceAccountType) &&
        Objects.equals(this.sourceAccountTypeDetails, ptsv2paymentsPaymentInformationCard.sourceAccountTypeDetails) &&
        Objects.equals(this.securityCode, ptsv2paymentsPaymentInformationCard.securityCode) &&
        Objects.equals(this.securityCodeIndicator, ptsv2paymentsPaymentInformationCard.securityCodeIndicator) &&
        Objects.equals(this.accountEncoderId, ptsv2paymentsPaymentInformationCard.accountEncoderId) &&
        Objects.equals(this.issueNumber, ptsv2paymentsPaymentInformationCard.issueNumber) &&
        Objects.equals(this.startMonth, ptsv2paymentsPaymentInformationCard.startMonth) &&
        Objects.equals(this.startYear, ptsv2paymentsPaymentInformationCard.startYear) &&
        Objects.equals(this.productName, ptsv2paymentsPaymentInformationCard.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, expirationMonth, expirationYear, type, useAs, sourceAccountType, sourceAccountTypeDetails, securityCode, securityCodeIndicator, accountEncoderId, issueNumber, startMonth, startYear, productName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPaymentInformationCard {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    useAs: ").append(toIndentedString(useAs)).append("\n");
    sb.append("    sourceAccountType: ").append(toIndentedString(sourceAccountType)).append("\n");
    sb.append("    sourceAccountTypeDetails: ").append(toIndentedString(sourceAccountTypeDetails)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
    sb.append("    securityCodeIndicator: ").append(toIndentedString(securityCodeIndicator)).append("\n");
    sb.append("    accountEncoderId: ").append(toIndentedString(accountEncoderId)).append("\n");
    sb.append("    issueNumber: ").append(toIndentedString(issueNumber)).append("\n");
    sb.append("    startMonth: ").append(toIndentedString(startMonth)).append("\n");
    sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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

