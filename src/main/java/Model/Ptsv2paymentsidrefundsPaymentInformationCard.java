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
 * Ptsv2paymentsidrefundsPaymentInformationCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-15T14:19:26.508+05:30")
public class Ptsv2paymentsidrefundsPaymentInformationCard {
  @SerializedName("number")
  private String number = null;

  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("accountEncoderId")
  private String accountEncoderId = null;

  @SerializedName("issueNumber")
  private String issueNumber = null;

  @SerializedName("startMonth")
  private String startMonth = null;

  @SerializedName("startYear")
  private String startYear = null;

  @SerializedName("sourceAccountType")
  private String sourceAccountType = null;

  @SerializedName("sourceAccountTypeDetails")
  private String sourceAccountTypeDetails = null;

  public Ptsv2paymentsidrefundsPaymentInformationCard number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The customer’s payment card number, also known as the Primary Account Number (PAN). You can also use this field for encoded account numbers.  #### FDMS Nashville Required. String (19)  #### GPX Required if &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;. However, this field is optional if your account is configured for relaxed requirements for address data and expiration date. **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### All other processors Required if &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;. However, this field is optional if your account is configured for relaxed requirements for address data and expiration date. **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return number
  **/
  @ApiModelProperty(value = "The customer’s payment card number, also known as the Primary Account Number (PAN). You can also use this field for encoded account numbers.  #### FDMS Nashville Required. String (19)  #### GPX Required if `pointOfSaleInformation.entryMode=keyed`. However, this field is optional if your account is configured for relaxed requirements for address data and expiration date. **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### All other processors Required if `pointOfSaleInformation.entryMode=keyed`. However, this field is optional if your account is configured for relaxed requirements for address data and expiration date. **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Ptsv2paymentsidrefundsPaymentInformationCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Two-digit month in which the payment card expires.  Format: &#x60;MM&#x60;.  Valid values: &#x60;01&#x60; through &#x60;12&#x60;. Leading 0 is required.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (&#x60;01&#x60; through &#x60;12&#x60;) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (_type_&#x3D;039), if there is no expiration date on the card, use &#x60;12&#x60;.  #### FDMS Nashville Required field.  #### All other processors Required if &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;. However, this field is optional if your account is configured for relaxed requirements for address data and expiration date. **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response. 
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "Two-digit month in which the payment card expires.  Format: `MM`.  Valid values: `01` through `12`. Leading 0 is required.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (`01` through `12`) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (_type_=039), if there is no expiration date on the card, use `12`.  #### FDMS Nashville Required field.  #### All other processors Required if `pointOfSaleInformation.entryMode=keyed`. However, this field is optional if your account is configured for relaxed requirements for address data and expiration date. **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response. ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public Ptsv2paymentsidrefundsPaymentInformationCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Four-digit year in which the payment card expires.  Format: &#x60;YYYY&#x60;.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (&#x60;1900&#x60; through &#x60;3000&#x60;) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (**_type_**&#x60;&#x3D;039&#x60;), if there is no expiration date on the card, use &#x60;2021&#x60;.  #### FDMS Nashville Required field.  #### FDC Nashville Global and FDMS South You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  #### All other processors Required if &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;. However, this field is optional if your account is configured for relaxed requirements for address data and expiration date. **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response. 
   * @return expirationYear
  **/
  @ApiModelProperty(value = "Four-digit year in which the payment card expires.  Format: `YYYY`.  #### Barclays and Streamline For Maestro (UK Domestic) and Maestro (International) cards on Barclays and Streamline, this must be a valid value (`1900` through `3000`) but is not required to be a valid expiration date. In other words, an expiration date that is in the past does not cause CyberSource to reject your request. However, an invalid expiration date might cause the issuer to reject your request.  #### Encoded Account Numbers For encoded account numbers (**_type_**`=039`), if there is no expiration date on the card, use `2021`.  #### FDMS Nashville Required field.  #### FDC Nashville Global and FDMS South You can send in 2 digits or 4 digits. If you send in 2 digits, they must be the last 2 digits of the year.  #### All other processors Required if `pointOfSaleInformation.entryMode=keyed`. However, this field is optional if your account is configured for relaxed requirements for address data and expiration date. **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response. ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public Ptsv2paymentsidrefundsPaymentInformationCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Three-digit value that indicates the card type.  **IMPORTANT** It is strongly recommended that you include the card type field in request messages even if it is optional for your processor and card type. Omitting the card type can cause the transaction to be processed with the wrong card type.  Possible values: - &#x60;001&#x60;: Visa. For card-present transactions on all processors except SIX, the Visa Electron card type is processed the same way that the Visa debit card is processed. Use card type value &#x60;001&#x60; for Visa Electron. - &#x60;002&#x60;: Mastercard, Eurocard[^1], which is a European regional brand of Mastercard. - &#x60;003&#x60;: American Express - &#x60;004&#x60;: Discover - &#x60;005&#x60;: Diners Club - &#x60;006&#x60;: Carte Blanche[^1] - &#x60;007&#x60;: JCB[^1] - &#x60;014&#x60;: Enroute[^1] - &#x60;021&#x60;: JAL[^1] - &#x60;024&#x60;: Maestro (UK Domestic)[^1] - &#x60;031&#x60;: Delta[^1]: Use this value only for Ingenico ePayments. For other processors, use &#x60;001&#x60; for all Visa card types. - &#x60;033&#x60;: Visa Electron[^1]. Use this value only for Ingenico ePayments and SIX. For other processors, use &#x60;001&#x60; for all Visa card types. - &#x60;034&#x60;: Dankort[^1] - &#x60;036&#x60;: Cartes Bancaires[^1,4] - &#x60;037&#x60;: Carta Si[^1] - &#x60;039&#x60;: Encoded account number[^1] - &#x60;040&#x60;: UATP[^1] - &#x60;042&#x60;: Maestro (International)[^1] - &#x60;050&#x60;: Hipercard[^2,3] - &#x60;051&#x60;: Aura - &#x60;054&#x60;: Elo[^3] - &#x60;062&#x60;: China UnionPay  [^1]: For this card type, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in your request for an authorization or a stand-alone credit. [^2]: For this card type on Cielo 3.0, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in a request for an authorization or a stand-alone credit. This card type is not supported on Cielo 1.5. [^3]: For this card type on Getnet and Rede, you must include the &#x60;paymentInformation.card.type&#x60; or &#x60;paymentInformation.tokenizedCard.type&#x60; field in a request for an authorization or a stand-alone credit. [^4]: For this card type, you must include the &#x60;paymentInformation.card.type&#x60; in your request for any payer authentication services.  #### Used by **Authorization** Required for Carte Blanche and JCB. Optional for all other card types.  #### Card Present reply This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details. You must contact customer support to have your account enabled to receive these fields in the credit reply message.  Returned by the Credit service.  This reply field is only supported by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response.  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International 
   * @return type
  **/
  @ApiModelProperty(value = "Three-digit value that indicates the card type.  **IMPORTANT** It is strongly recommended that you include the card type field in request messages even if it is optional for your processor and card type. Omitting the card type can cause the transaction to be processed with the wrong card type.  Possible values: - `001`: Visa. For card-present transactions on all processors except SIX, the Visa Electron card type is processed the same way that the Visa debit card is processed. Use card type value `001` for Visa Electron. - `002`: Mastercard, Eurocard[^1], which is a European regional brand of Mastercard. - `003`: American Express - `004`: Discover - `005`: Diners Club - `006`: Carte Blanche[^1] - `007`: JCB[^1] - `014`: Enroute[^1] - `021`: JAL[^1] - `024`: Maestro (UK Domestic)[^1] - `031`: Delta[^1]: Use this value only for Ingenico ePayments. For other processors, use `001` for all Visa card types. - `033`: Visa Electron[^1]. Use this value only for Ingenico ePayments and SIX. For other processors, use `001` for all Visa card types. - `034`: Dankort[^1] - `036`: Cartes Bancaires[^1,4] - `037`: Carta Si[^1] - `039`: Encoded account number[^1] - `040`: UATP[^1] - `042`: Maestro (International)[^1] - `050`: Hipercard[^2,3] - `051`: Aura - `054`: Elo[^3] - `062`: China UnionPay  [^1]: For this card type, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in your request for an authorization or a stand-alone credit. [^2]: For this card type on Cielo 3.0, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in a request for an authorization or a stand-alone credit. This card type is not supported on Cielo 1.5. [^3]: For this card type on Getnet and Rede, you must include the `paymentInformation.card.type` or `paymentInformation.tokenizedCard.type` field in a request for an authorization or a stand-alone credit. [^4]: For this card type, you must include the `paymentInformation.card.type` in your request for any payer authentication services.  #### Used by **Authorization** Required for Carte Blanche and JCB. Optional for all other card types.  #### Card Present reply This field is included in the reply message when the client software that is installed on the POS terminal uses the token management service (TMS) to retrieve tokenized payment details. You must contact customer support to have your account enabled to receive these fields in the credit reply message.  Returned by the Credit service.  This reply field is only supported by the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX  #### Google Pay transactions For PAN-based Google Pay transactions, this field is returned in the API response.  #### GPX This field only supports transactions from the following card types: - Visa - Mastercard - AMEX - Discover - Diners - JCB - Union Pay International ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv2paymentsidrefundsPaymentInformationCard accountEncoderId(String accountEncoderId) {
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

  public Ptsv2paymentsidrefundsPaymentInformationCard issueNumber(String issueNumber) {
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

  public Ptsv2paymentsidrefundsPaymentInformationCard startMonth(String startMonth) {
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

  public Ptsv2paymentsidrefundsPaymentInformationCard startYear(String startYear) {
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

  public Ptsv2paymentsidrefundsPaymentInformationCard sourceAccountType(String sourceAccountType) {
    this.sourceAccountType = sourceAccountType;
    return this;
  }

   /**
   * Flag that specifies the type of account associated with the card. The cardholder provides this information during the payment process.  This field is required in the following cases:   - Debit transactions on Cielo and Comercio Latino.   - Transactions with Brazilian-issued cards on CyberSource through VisaNet.   - Applicable only for CyberSource through VisaNet (CtV).  **Note** Combo cards in Brazil contain credit and debit functionality in a single card. Visa systems use a credit bank identification number (BIN) for this type of card. Using the BIN to determine whether a card is debit or credit can cause transactions with these cards to be processed incorrectly. CyberSource strongly recommends that you include this field for combo card transactions.  Possible values include the following.   - &#x60;CHECKING&#x60;: Checking account  - &#x60;CREDIT&#x60;: Credit card account  - &#x60;SAVING&#x60;: Saving account  - &#x60;LINE_OF_CREDIT&#x60;: Line of credit or credit portion of combo card  - &#x60;PREPAID&#x60;: Prepaid card account or prepaid portion of combo card  - &#x60;UNIVERSAL&#x60;: Universal account 
   * @return sourceAccountType
  **/
  @ApiModelProperty(value = "Flag that specifies the type of account associated with the card. The cardholder provides this information during the payment process.  This field is required in the following cases:   - Debit transactions on Cielo and Comercio Latino.   - Transactions with Brazilian-issued cards on CyberSource through VisaNet.   - Applicable only for CyberSource through VisaNet (CtV).  **Note** Combo cards in Brazil contain credit and debit functionality in a single card. Visa systems use a credit bank identification number (BIN) for this type of card. Using the BIN to determine whether a card is debit or credit can cause transactions with these cards to be processed incorrectly. CyberSource strongly recommends that you include this field for combo card transactions.  Possible values include the following.   - `CHECKING`: Checking account  - `CREDIT`: Credit card account  - `SAVING`: Saving account  - `LINE_OF_CREDIT`: Line of credit or credit portion of combo card  - `PREPAID`: Prepaid card account or prepaid portion of combo card  - `UNIVERSAL`: Universal account ")
  public String getSourceAccountType() {
    return sourceAccountType;
  }

  public void setSourceAccountType(String sourceAccountType) {
    this.sourceAccountType = sourceAccountType;
  }

  public Ptsv2paymentsidrefundsPaymentInformationCard sourceAccountTypeDetails(String sourceAccountTypeDetails) {
    this.sourceAccountTypeDetails = sourceAccountTypeDetails;
    return this;
  }

   /**
   * Type of account that is being used when the value for the override_payment_method field is line of credit (LI) or prepaid card (PP). Possible values for line of credit: - &#x60;AGRC&#x60;: Visa Agro Custeio - &#x60;AGRE&#x60;: Visa Agro Electron - &#x60;AGRI&#x60;: Visa Agro Investimento - &#x60;AGRO&#x60;: Visa Agro Possible values for prepaid card: - &#x60;VVA&#x60;: Visa Vale Alimentacao - &#x60;VVF&#x60;: Visa Vale Flex - &#x60;VVR&#x60;: Visa Vale Refeicao This field is supported only for combo card transactions in Brazil on CyberSource through VisaNet. 
   * @return sourceAccountTypeDetails
  **/
  @ApiModelProperty(value = "Type of account that is being used when the value for the override_payment_method field is line of credit (LI) or prepaid card (PP). Possible values for line of credit: - `AGRC`: Visa Agro Custeio - `AGRE`: Visa Agro Electron - `AGRI`: Visa Agro Investimento - `AGRO`: Visa Agro Possible values for prepaid card: - `VVA`: Visa Vale Alimentacao - `VVF`: Visa Vale Flex - `VVR`: Visa Vale Refeicao This field is supported only for combo card transactions in Brazil on CyberSource through VisaNet. ")
  public String getSourceAccountTypeDetails() {
    return sourceAccountTypeDetails;
  }

  public void setSourceAccountTypeDetails(String sourceAccountTypeDetails) {
    this.sourceAccountTypeDetails = sourceAccountTypeDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidrefundsPaymentInformationCard ptsv2paymentsidrefundsPaymentInformationCard = (Ptsv2paymentsidrefundsPaymentInformationCard) o;
    return Objects.equals(this.number, ptsv2paymentsidrefundsPaymentInformationCard.number) &&
        Objects.equals(this.expirationMonth, ptsv2paymentsidrefundsPaymentInformationCard.expirationMonth) &&
        Objects.equals(this.expirationYear, ptsv2paymentsidrefundsPaymentInformationCard.expirationYear) &&
        Objects.equals(this.type, ptsv2paymentsidrefundsPaymentInformationCard.type) &&
        Objects.equals(this.accountEncoderId, ptsv2paymentsidrefundsPaymentInformationCard.accountEncoderId) &&
        Objects.equals(this.issueNumber, ptsv2paymentsidrefundsPaymentInformationCard.issueNumber) &&
        Objects.equals(this.startMonth, ptsv2paymentsidrefundsPaymentInformationCard.startMonth) &&
        Objects.equals(this.startYear, ptsv2paymentsidrefundsPaymentInformationCard.startYear) &&
        Objects.equals(this.sourceAccountType, ptsv2paymentsidrefundsPaymentInformationCard.sourceAccountType) &&
        Objects.equals(this.sourceAccountTypeDetails, ptsv2paymentsidrefundsPaymentInformationCard.sourceAccountTypeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, expirationMonth, expirationYear, type, accountEncoderId, issueNumber, startMonth, startYear, sourceAccountType, sourceAccountTypeDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidrefundsPaymentInformationCard {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accountEncoderId: ").append(toIndentedString(accountEncoderId)).append("\n");
    sb.append("    issueNumber: ").append(toIndentedString(issueNumber)).append("\n");
    sb.append("    startMonth: ").append(toIndentedString(startMonth)).append("\n");
    sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
    sb.append("    sourceAccountType: ").append(toIndentedString(sourceAccountType)).append("\n");
    sb.append("    sourceAccountTypeDetails: ").append(toIndentedString(sourceAccountTypeDetails)).append("\n");
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

