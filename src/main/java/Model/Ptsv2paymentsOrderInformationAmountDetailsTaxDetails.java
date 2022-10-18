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
 * Ptsv2paymentsOrderInformationAmountDetailsTaxDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-17T14:26:30.480+05:30")
public class Ptsv2paymentsOrderInformationAmountDetailsTaxDetails {
  @SerializedName("type")
  private String type = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("rate")
  private String rate = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("taxId")
  private String taxId = null;

  @SerializedName("applied")
  private Boolean applied = null;

  @SerializedName("exemptionCode")
  private String exemptionCode = null;

  public Ptsv2paymentsOrderInformationAmountDetailsTaxDetails type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the type of tax data for the _taxDetails_ object.  Possible values:  - &#x60;alternate&#x60; - &#x60;local&#x60; - &#x60;national&#x60; - &#x60;vat&#x60; - &#x60;other&#x60;  For processor-specific details, see the &#x60;alternate_tax_amount&#x60;, &#x60;local_tax&#x60;, &#x60;national_tax&#x60; or &#x60;vat_tax_amount&#x60; field descriptions in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) 
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the type of tax data for the _taxDetails_ object.  Possible values:  - `alternate` - `local` - `national` - `vat` - `other`  For processor-specific details, see the `alternate_tax_amount`, `local_tax`, `national_tax` or `vat_tax_amount` field descriptions in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsTaxDetails amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Indicates the amount of tax based on the &#x60;type&#x60; field as described in the table below:  | type      | type description | | ------------- |:-------------:| | &#x60;alternate&#x60; | Total amount of alternate tax for the order. | | &#x60;local&#x60;     | Sales tax for the order. | | &#x60;national&#x60;  | National tax for the order. | | &#x60;vat&#x60;       | Total amount of value added tax (VAT) included in the order. | | &#x60;other&#x60;     | Other tax. | 
   * @return amount
  **/
  @ApiModelProperty(value = "Indicates the amount of tax based on the `type` field as described in the table below:  | type      | type description | | ------------- |:-------------:| | `alternate` | Total amount of alternate tax for the order. | | `local`     | Sales tax for the order. | | `national`  | National tax for the order. | | `vat`       | Total amount of value added tax (VAT) included in the order. | | `other`     | Other tax. | ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsTaxDetails rate(String rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Rate of VAT or other tax for the order.  Example 0.040 (&#x3D;4%)  Valid range: 0.01 to 0.99 (1% to 99%, with only whole percentage values accepted; values with additional decimal places will be truncated)  For processor-specific details, see the &#x60;alternate_tax_amount&#x60;, &#x60;vat_rate&#x60;, &#x60;vat_tax_rate&#x60;, &#x60;local_tax&#x60;, &#x60;national_tax&#x60;, &#x60;vat_tax_amount&#x60; or &#x60;other_tax#_rate&#x60; field descriptions in the [Level II and Level III Processing Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) 
   * @return rate
  **/
  @ApiModelProperty(value = "Rate of VAT or other tax for the order.  Example 0.040 (=4%)  Valid range: 0.01 to 0.99 (1% to 99%, with only whole percentage values accepted; values with additional decimal places will be truncated)  For processor-specific details, see the `alternate_tax_amount`, `vat_rate`, `vat_tax_rate`, `local_tax`, `national_tax`, `vat_tax_amount` or `other_tax#_rate` field descriptions in the [Level II and Level III Processing Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) ")
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsTaxDetails code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Type of tax being applied to the item.  For possible values, see the processor-specific field descriptions in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/):  #### FDC Nashville Global - &#x60;alternate_tax_type_applied&#x60; - &#x60;alternate_tax_type_identifier&#x60;  #### Worldpay VAP - &#x60;alternate_tax_type_identifier&#x60;  #### RBS WorldPay Atlanta - &#x60;tax_type_applied&#x60;  #### TSYS Acquiring Solutions - &#x60;tax_type_applied&#x60; - &#x60;local_tax_indicator&#x60;  #### Chase Paymentech Solutions - &#x60;tax_type_applied&#x60;  #### Elavon Americas - &#x60;local_tax_indicator&#x60;  #### FDC Compass - &#x60;tax_type_applied&#x60;  #### OmniPay Direct - &#x60;local_tax_indicator&#x60; 
   * @return code
  **/
  @ApiModelProperty(value = "Type of tax being applied to the item.  For possible values, see the processor-specific field descriptions in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/):  #### FDC Nashville Global - `alternate_tax_type_applied` - `alternate_tax_type_identifier`  #### Worldpay VAP - `alternate_tax_type_identifier`  #### RBS WorldPay Atlanta - `tax_type_applied`  #### TSYS Acquiring Solutions - `tax_type_applied` - `local_tax_indicator`  #### Chase Paymentech Solutions - `tax_type_applied`  #### Elavon Americas - `local_tax_indicator`  #### FDC Compass - `tax_type_applied`  #### OmniPay Direct - `local_tax_indicator` ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsTaxDetails taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * Your tax ID number to use for the alternate tax amount. Required if you set alternate tax amount to any value, including zero. You may send this field without sending alternate tax amount.  For processor-specific details, see &#x60;alternate_tax_id&#x60; field description in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) 
   * @return taxId
  **/
  @ApiModelProperty(value = "Your tax ID number to use for the alternate tax amount. Required if you set alternate tax amount to any value, including zero. You may send this field without sending alternate tax amount.  For processor-specific details, see `alternate_tax_id` field description in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) ")
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsTaxDetails applied(Boolean applied) {
    this.applied = applied;
    return this;
  }

   /**
   * Flag that indicates whether the alternate tax amount (&#x60;orderInformation.amountDetails.taxDetails[].amount&#x60;) is included in the request.  Possible values: - &#x60;false&#x60;: alternate tax amount is not included in the request. - &#x60;true&#x60;: alternate tax amount is included in the request.  For processor-specific details, see &#x60;alternate_tax_amount_indicator&#x60; field description in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) 
   * @return applied
  **/
  @ApiModelProperty(value = "Flag that indicates whether the alternate tax amount (`orderInformation.amountDetails.taxDetails[].amount`) is included in the request.  Possible values: - `false`: alternate tax amount is not included in the request. - `true`: alternate tax amount is included in the request.  For processor-specific details, see `alternate_tax_amount_indicator` field description in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) ")
  public Boolean getApplied() {
    return applied;
  }

  public void setApplied(Boolean applied) {
    this.applied = applied;
  }

  public Ptsv2paymentsOrderInformationAmountDetailsTaxDetails exemptionCode(String exemptionCode) {
    this.exemptionCode = exemptionCode;
    return this;
  }

   /**
   * Status code for exemption from sales and use tax. This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor.  For possible values and important information for using this field, see _Appendix B, \&quot;Exemption Status Values_ and _Offer-Level Tax Fields_ in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) 
   * @return exemptionCode
  **/
  @ApiModelProperty(value = "Status code for exemption from sales and use tax. This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor.  For possible values and important information for using this field, see _Appendix B, \"Exemption Status Values_ and _Offer-Level Tax Fields_ in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) ")
  public String getExemptionCode() {
    return exemptionCode;
  }

  public void setExemptionCode(String exemptionCode) {
    this.exemptionCode = exemptionCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsOrderInformationAmountDetailsTaxDetails ptsv2paymentsOrderInformationAmountDetailsTaxDetails = (Ptsv2paymentsOrderInformationAmountDetailsTaxDetails) o;
    return Objects.equals(this.type, ptsv2paymentsOrderInformationAmountDetailsTaxDetails.type) &&
        Objects.equals(this.amount, ptsv2paymentsOrderInformationAmountDetailsTaxDetails.amount) &&
        Objects.equals(this.rate, ptsv2paymentsOrderInformationAmountDetailsTaxDetails.rate) &&
        Objects.equals(this.code, ptsv2paymentsOrderInformationAmountDetailsTaxDetails.code) &&
        Objects.equals(this.taxId, ptsv2paymentsOrderInformationAmountDetailsTaxDetails.taxId) &&
        Objects.equals(this.applied, ptsv2paymentsOrderInformationAmountDetailsTaxDetails.applied) &&
        Objects.equals(this.exemptionCode, ptsv2paymentsOrderInformationAmountDetailsTaxDetails.exemptionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amount, rate, code, taxId, applied, exemptionCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsOrderInformationAmountDetailsTaxDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
    sb.append("    exemptionCode: ").append(toIndentedString(exemptionCode)).append("\n");
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

