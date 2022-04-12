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
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tmsv2customersEmbeddedDefaultPaymentInstrumentCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-12T09:56:59.728+05:30")
public class Tmsv2customersEmbeddedDefaultPaymentInstrumentCard {
  @SerializedName("expirationMonth")
  private String expirationMonth = null;

  @SerializedName("expirationYear")
  private String expirationYear = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("issueNumber")
  private String issueNumber = null;

  @SerializedName("startMonth")
  private String startMonth = null;

  @SerializedName("startYear")
  private String startYear = null;

  @SerializedName("useAs")
  private String useAs = null;

  @SerializedName("tokenizedInformation")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation tokenizedInformation = null;

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Two-digit month in which the payment card expires.  Format: &#x60;MM&#x60;.  Valid values: &#x60;01&#x60; through &#x60;12&#x60;. 
   * @return expirationMonth
  **/
  @ApiModelProperty(value = "Two-digit month in which the payment card expires.  Format: `MM`.  Valid values: `01` through `12`. ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Four-digit year in which the credit card expires.  Format: &#x60;YYYY&#x60;. 
   * @return expirationYear
  **/
  @ApiModelProperty(value = "Four-digit year in which the credit card expires.  Format: `YYYY`. ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Value that indicates the card type. Valid v2 : v1 - description values:   * 001 : visa   * 002 : mastercard - Eurocard—European regional brand of Mastercard   * 003 : american express   * 004 : discover   * 005 : diners club   * 006 : carte blanche   * 007 : jcb   * 008 : optima   * 011 : twinpay credit   * 012 : twinpay debit   * 013 : walmart   * 014 : enRoute   * 015 : lowes consumer   * 016 : home depot consumer   * 017 : mbna   * 018 : dicks sportswear   * 019 : casual corner   * 020 : sears   * 021 : jal   * 023 : disney   * 024 : maestro uk domestic   * 025 : sams club consumer   * 026 : sams club business   * 028 : bill me later   * 029 : bebe   * 030 : restoration hardware   * 031 : delta online — use this value only for Ingenico ePayments. For other processors, use 001 for all Visa card types.   * 032 : solo   * 033 : visa electron   * 034 : dankort   * 035 : laser   * 036 : carte bleue — formerly Cartes Bancaires   * 037 : carta si   * 038 : pinless debit   * 039 : encoded account   * 040 : uatp   * 041 : household   * 042 : maestro international   * 043 : ge money uk   * 044 : korean cards   * 045 : style   * 046 : jcrew   * 047 : payease china processing ewallet   * 048 : payease china processing bank transfer   * 049 : meijer private label   * 050 : hipercard — supported only by the Comercio Latino processor.   * 051 : aura — supported only by the Comercio Latino processor.   * 052 : redecard   * 054 : elo — supported only by the Comercio Latino processor.   * 055 : capital one private label   * 056 : synchrony private label   * 057 : costco private label   * 060 : mada   * 062 : china union pay   * 063 : falabella private label 
   * @return type
  **/
  @ApiModelProperty(value = "Value that indicates the card type. Valid v2 : v1 - description values:   * 001 : visa   * 002 : mastercard - Eurocard—European regional brand of Mastercard   * 003 : american express   * 004 : discover   * 005 : diners club   * 006 : carte blanche   * 007 : jcb   * 008 : optima   * 011 : twinpay credit   * 012 : twinpay debit   * 013 : walmart   * 014 : enRoute   * 015 : lowes consumer   * 016 : home depot consumer   * 017 : mbna   * 018 : dicks sportswear   * 019 : casual corner   * 020 : sears   * 021 : jal   * 023 : disney   * 024 : maestro uk domestic   * 025 : sams club consumer   * 026 : sams club business   * 028 : bill me later   * 029 : bebe   * 030 : restoration hardware   * 031 : delta online — use this value only for Ingenico ePayments. For other processors, use 001 for all Visa card types.   * 032 : solo   * 033 : visa electron   * 034 : dankort   * 035 : laser   * 036 : carte bleue — formerly Cartes Bancaires   * 037 : carta si   * 038 : pinless debit   * 039 : encoded account   * 040 : uatp   * 041 : household   * 042 : maestro international   * 043 : ge money uk   * 044 : korean cards   * 045 : style   * 046 : jcrew   * 047 : payease china processing ewallet   * 048 : payease china processing bank transfer   * 049 : meijer private label   * 050 : hipercard — supported only by the Comercio Latino processor.   * 051 : aura — supported only by the Comercio Latino processor.   * 052 : redecard   * 054 : elo — supported only by the Comercio Latino processor.   * 055 : capital one private label   * 056 : synchrony private label   * 057 : costco private label   * 060 : mada   * 062 : china union pay   * 063 : falabella private label ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentCard issueNumber(String issueNumber) {
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

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentCard startMonth(String startMonth) {
    this.startMonth = startMonth;
    return this;
  }

   /**
   * Month of the start of the Maestro (UK Domestic) card validity period. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card. &#x60;Format: MM&#x60;. Valid values: 01 through 12.  **Note** The start date is not required for Maestro (UK Domestic) transactions. 
   * @return startMonth
  **/
  @ApiModelProperty(value = "Month of the start of the Maestro (UK Domestic) card validity period. Do not include the field, even with a blank value, if the card is not a Maestro (UK Domestic) card. `Format: MM`. Valid values: 01 through 12.  **Note** The start date is not required for Maestro (UK Domestic) transactions. ")
  public String getStartMonth() {
    return startMonth;
  }

  public void setStartMonth(String startMonth) {
    this.startMonth = startMonth;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentCard startYear(String startYear) {
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

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentCard useAs(String useAs) {
    this.useAs = useAs;
    return this;
  }

   /**
   * &#39;Payment Instrument was created / updated as part of a pinless debit transaction.&#39; 
   * @return useAs
  **/
  @ApiModelProperty(example = "pinless debit", value = "'Payment Instrument was created / updated as part of a pinless debit transaction.' ")
  public String getUseAs() {
    return useAs;
  }

  public void setUseAs(String useAs) {
    this.useAs = useAs;
  }

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentCard tokenizedInformation(Tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation tokenizedInformation) {
    this.tokenizedInformation = tokenizedInformation;
    return this;
  }

   /**
   * Get tokenizedInformation
   * @return tokenizedInformation
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation getTokenizedInformation() {
    return tokenizedInformation;
  }

  public void setTokenizedInformation(Tmsv2customersEmbeddedDefaultPaymentInstrumentCardTokenizedInformation tokenizedInformation) {
    this.tokenizedInformation = tokenizedInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultPaymentInstrumentCard tmsv2customersEmbeddedDefaultPaymentInstrumentCard = (Tmsv2customersEmbeddedDefaultPaymentInstrumentCard) o;
    return Objects.equals(this.expirationMonth, tmsv2customersEmbeddedDefaultPaymentInstrumentCard.expirationMonth) &&
        Objects.equals(this.expirationYear, tmsv2customersEmbeddedDefaultPaymentInstrumentCard.expirationYear) &&
        Objects.equals(this.type, tmsv2customersEmbeddedDefaultPaymentInstrumentCard.type) &&
        Objects.equals(this.issueNumber, tmsv2customersEmbeddedDefaultPaymentInstrumentCard.issueNumber) &&
        Objects.equals(this.startMonth, tmsv2customersEmbeddedDefaultPaymentInstrumentCard.startMonth) &&
        Objects.equals(this.startYear, tmsv2customersEmbeddedDefaultPaymentInstrumentCard.startYear) &&
        Objects.equals(this.useAs, tmsv2customersEmbeddedDefaultPaymentInstrumentCard.useAs) &&
        Objects.equals(this.tokenizedInformation, tmsv2customersEmbeddedDefaultPaymentInstrumentCard.tokenizedInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationMonth, expirationYear, type, issueNumber, startMonth, startYear, useAs, tokenizedInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultPaymentInstrumentCard {\n");
    
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    issueNumber: ").append(toIndentedString(issueNumber)).append("\n");
    sb.append("    startMonth: ").append(toIndentedString(startMonth)).append("\n");
    sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
    sb.append("    useAs: ").append(toIndentedString(useAs)).append("\n");
    sb.append("    tokenizedInformation: ").append(toIndentedString(tokenizedInformation)).append("\n");
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

