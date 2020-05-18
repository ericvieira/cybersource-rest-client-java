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
 * PaymentInstrumentCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T15:31:38.576+05:30")
public class PaymentInstrumentCard {
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

  public PaymentInstrumentCard expirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Two-digit month in which the credit card expires. Format: &#x60;MM&#x60; Possible values: &#x60;01&#x60; through &#x60;12&#x60;  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. For more information about relaxed requirements, see the TMS REST API Developer Guide.  Important: It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return expirationMonth
  **/
  @ApiModelProperty(example = "12", value = "Two-digit month in which the credit card expires. Format: `MM` Possible values: `01` through `12`  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. For more information about relaxed requirements, see the TMS REST API Developer Guide.  Important: It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(String expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public PaymentInstrumentCard expirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Four-digit year in which the credit card expires. Format: &#x60;YYYY&#x60;. Possible values: &#x60;1900&#x60; through &#x60;2099&#x60;.  **FDC Nashville Global and FDMS South** You can send in 2 digits or 4 digits. When you send in 2 digits, they must be the last 2 digits of the year.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. For details, see [Relaxed Requirements for Address Data and Expiration Date.](https://www.cybersource.com/developers/integration_methods/relax_avs/). **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.&#39; 
   * @return expirationYear
  **/
  @ApiModelProperty(example = "2022", value = "Four-digit year in which the credit card expires. Format: `YYYY`. Possible values: `1900` through `2099`.  **FDC Nashville Global and FDMS South** You can send in 2 digits or 4 digits. When you send in 2 digits, they must be the last 2 digits of the year.  This field is optional if your CyberSource account is configured for relaxed requirements for address data and expiration date. For details, see [Relaxed Requirements for Address Data and Expiration Date.](https://www.cybersource.com/developers/integration_methods/relax_avs/). **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.' ")
  public String getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(String expirationYear) {
    this.expirationYear = expirationYear;
  }

  public PaymentInstrumentCard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of credit card. Possible values:   * **visa** -- Visa (001)   * **mastercard** -- Mastercard (002) - Eurocard—European regional brand of Mastercard   * **american express** -- American Express (003)   * **discover** -- Discover (004)   * **diners club** -- Diners Club (005)   * **carte blanche** -- Carte Blanche (006)   * **jcb** -- JCB (007)   * **optima** -- Optima (008)   * **twinpay credit** -- Twinpay Credit (011)   * **twinpay debit** -- Twinpay Debit (012)   * **walmart** -- Walmart (013)   * **enroute** -- EnRoute (014)   * **lowes consumer** -- Lowes consumer (015)   * **home depot consumer** -- Home Depot consumer (016)   * **mbna** -- MBNA (017)   * **dicks sportswear** -- Dicks Sportswear (018)   * **casual corner** -- Casual Corner (019)   * **sears** -- Sears (020)   * **jal** -- JAL (021)   * **disney** -- Disney (023)   * **maestro uk domestic** -- Maestro (024) - UK Domestic   * **sams club consumer** -- Sams Club consumer (025)   * **sams club business** -- Sams Club business (026)   * **bill me later** -- Bill me later (028)   * **bebe** -- Bebe (029)   * **restoration hardware** -- Restoration Hardware (030)   * **delta online** -- Delta (031) — use this value only for Ingenico ePayments. For other processors, use 001 for all Visa card types.   * **solo** -- Solo (032)   * **visa electron** -- Visa Electron (033)   * **dankort** -- Dankort (034)   * **laser** -- Laser (035)   * **carte bleue** -- Carte Bleue (036) — formerly Cartes Bancaires   * **carta si** -- Carta Si (037)   * **pinless debit** -- pinless debit (038)   * **encoded account** -- encoded account (039)   * **uatp** -- UATP (040)   * **household** -- Household (041)   * **maestro international** -- Maestro (042) - International   * **ge money uk** -- GE Money UK (043)   * **korean cards** -- Korean cards (044)   * **style** -- Style (045)   * **jcrew** -- JCrew (046)   * **payease china processing ewallet** -- PayEase China processing eWallet (047)   * **payease china processing bank transfer** -- PayEase China processing bank transfer (048)   * **meijer private label** -- Meijer Private Label (049)   * **hipercard** -- Hipercard (050) — supported only by the Comercio Latino processor.   * **aura** -- Aura (051) — supported only by the Comercio Latino processor.   * **redecard** -- Redecard (052)   * **elo** -- Elo (054) — supported only by the Comercio Latino processor.   * **capital one private label** -- Capital One Private Label (055)   * **synchrony private label** -- Synchrony Private Label (056)   * **costco private label** -- Costco Private Label (057)   * **mada** -- mada (060)   * **china union pay** -- China Union Pay (062)   * **falabella private label** -- Falabella private label (063) 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of credit card. Possible values:   * **visa** -- Visa (001)   * **mastercard** -- Mastercard (002) - Eurocard—European regional brand of Mastercard   * **american express** -- American Express (003)   * **discover** -- Discover (004)   * **diners club** -- Diners Club (005)   * **carte blanche** -- Carte Blanche (006)   * **jcb** -- JCB (007)   * **optima** -- Optima (008)   * **twinpay credit** -- Twinpay Credit (011)   * **twinpay debit** -- Twinpay Debit (012)   * **walmart** -- Walmart (013)   * **enroute** -- EnRoute (014)   * **lowes consumer** -- Lowes consumer (015)   * **home depot consumer** -- Home Depot consumer (016)   * **mbna** -- MBNA (017)   * **dicks sportswear** -- Dicks Sportswear (018)   * **casual corner** -- Casual Corner (019)   * **sears** -- Sears (020)   * **jal** -- JAL (021)   * **disney** -- Disney (023)   * **maestro uk domestic** -- Maestro (024) - UK Domestic   * **sams club consumer** -- Sams Club consumer (025)   * **sams club business** -- Sams Club business (026)   * **bill me later** -- Bill me later (028)   * **bebe** -- Bebe (029)   * **restoration hardware** -- Restoration Hardware (030)   * **delta online** -- Delta (031) — use this value only for Ingenico ePayments. For other processors, use 001 for all Visa card types.   * **solo** -- Solo (032)   * **visa electron** -- Visa Electron (033)   * **dankort** -- Dankort (034)   * **laser** -- Laser (035)   * **carte bleue** -- Carte Bleue (036) — formerly Cartes Bancaires   * **carta si** -- Carta Si (037)   * **pinless debit** -- pinless debit (038)   * **encoded account** -- encoded account (039)   * **uatp** -- UATP (040)   * **household** -- Household (041)   * **maestro international** -- Maestro (042) - International   * **ge money uk** -- GE Money UK (043)   * **korean cards** -- Korean cards (044)   * **style** -- Style (045)   * **jcrew** -- JCrew (046)   * **payease china processing ewallet** -- PayEase China processing eWallet (047)   * **payease china processing bank transfer** -- PayEase China processing bank transfer (048)   * **meijer private label** -- Meijer Private Label (049)   * **hipercard** -- Hipercard (050) — supported only by the Comercio Latino processor.   * **aura** -- Aura (051) — supported only by the Comercio Latino processor.   * **redecard** -- Redecard (052)   * **elo** -- Elo (054) — supported only by the Comercio Latino processor.   * **capital one private label** -- Capital One Private Label (055)   * **synchrony private label** -- Synchrony Private Label (056)   * **costco private label** -- Costco Private Label (057)   * **mada** -- mada (060)   * **china union pay** -- China Union Pay (062)   * **falabella private label** -- Falabella private label (063) ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PaymentInstrumentCard issueNumber(String issueNumber) {
    this.issueNumber = issueNumber;
    return this;
  }

   /**
   * Number of times a Maestro (UK Domestic) card has been issued to the account holder.
   * @return issueNumber
  **/
  @ApiModelProperty(example = "01", value = "Number of times a Maestro (UK Domestic) card has been issued to the account holder.")
  public String getIssueNumber() {
    return issueNumber;
  }

  public void setIssueNumber(String issueNumber) {
    this.issueNumber = issueNumber;
  }

  public PaymentInstrumentCard startMonth(String startMonth) {
    this.startMonth = startMonth;
    return this;
  }

   /**
   * Month of the start of the Maestro (UK Domestic) card validity period. Format: &#x60;MM&#x60;. Possible values: &#x60;01&#x60; through &#x60;12&#x60;. 
   * @return startMonth
  **/
  @ApiModelProperty(example = "12", value = "Month of the start of the Maestro (UK Domestic) card validity period. Format: `MM`. Possible values: `01` through `12`. ")
  public String getStartMonth() {
    return startMonth;
  }

  public void setStartMonth(String startMonth) {
    this.startMonth = startMonth;
  }

  public PaymentInstrumentCard startYear(String startYear) {
    this.startYear = startYear;
    return this;
  }

   /**
   * Year of the start of the Maestro (UK Domestic) card validity period.  Format: &#x60;YYYY&#x60;. Possible values: &#x60;1900&#x60; through &#x60;2099&#x60;. 
   * @return startYear
  **/
  @ApiModelProperty(example = "2022", value = "Year of the start of the Maestro (UK Domestic) card validity period.  Format: `YYYY`. Possible values: `1900` through `2099`. ")
  public String getStartYear() {
    return startYear;
  }

  public void setStartYear(String startYear) {
    this.startYear = startYear;
  }

  public PaymentInstrumentCard useAs(String useAs) {
    this.useAs = useAs;
    return this;
  }

   /**
   * Card Use As Field. Supported value of &#x60;pinless debit&#x60; only. Only for use with Pinless Debit tokens.
   * @return useAs
  **/
  @ApiModelProperty(example = "pinless debit", value = "Card Use As Field. Supported value of `pinless debit` only. Only for use with Pinless Debit tokens.")
  public String getUseAs() {
    return useAs;
  }

  public void setUseAs(String useAs) {
    this.useAs = useAs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentCard paymentInstrumentCard = (PaymentInstrumentCard) o;
    return Objects.equals(this.expirationMonth, paymentInstrumentCard.expirationMonth) &&
        Objects.equals(this.expirationYear, paymentInstrumentCard.expirationYear) &&
        Objects.equals(this.type, paymentInstrumentCard.type) &&
        Objects.equals(this.issueNumber, paymentInstrumentCard.issueNumber) &&
        Objects.equals(this.startMonth, paymentInstrumentCard.startMonth) &&
        Objects.equals(this.startYear, paymentInstrumentCard.startYear) &&
        Objects.equals(this.useAs, paymentInstrumentCard.useAs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationMonth, expirationYear, type, issueNumber, startMonth, startYear, useAs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentCard {\n");
    
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    issueNumber: ").append(toIndentedString(issueNumber)).append("\n");
    sb.append("    startMonth: ").append(toIndentedString(startMonth)).append("\n");
    sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
    sb.append("    useAs: ").append(toIndentedString(useAs)).append("\n");
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

