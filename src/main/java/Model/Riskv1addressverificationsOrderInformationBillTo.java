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
 * Riskv1addressverificationsOrderInformationBillTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-10T13:11:55.460+05:30")
public class Riskv1addressverificationsOrderInformationBillTo {
  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("address3")
  private String address3 = null;

  @SerializedName("address4")
  private String address4 = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  public Riskv1addressverificationsOrderInformationBillTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Payment card billing street address as it appears on the credit card issuer’s records.  #### Atos This field must not contain colons (:).  #### CyberSource through VisaNet **Important** When you populate orderInformation.billTo.address1 and orderInformation.billTo.address2, CyberSource through VisaNet concatenates the two values. If the concatenated value exceeds 40 characters, CyberSource through VisaNet truncates the value at 40 characters before sending it to Visa and the issuing bank. Truncating this value affects AVS results and therefore might also affect risk decisions and chargebacks. Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### FDMS Nashville When the street name is numeric, it must be sent in numeric format. For example, if the address is _One First Street_, it must be sent as _1 1st Street_.  Required if keyed; not used if swiped.  String (20)  #### TSYS Acquiring Solutions Required when &#x60;processingInformation.billPaymentOptions.billPayment&#x3D;true&#x60; and &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;.  #### All other processors: Optional. String (60)  #### For Payouts This field may be sent only for FDC Compass.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting. 
   * @return address1
  **/
  @ApiModelProperty(required = true, value = "Payment card billing street address as it appears on the credit card issuer’s records.  #### Atos This field must not contain colons (:).  #### CyberSource through VisaNet **Important** When you populate orderInformation.billTo.address1 and orderInformation.billTo.address2, CyberSource through VisaNet concatenates the two values. If the concatenated value exceeds 40 characters, CyberSource through VisaNet truncates the value at 40 characters before sending it to Visa and the issuing bank. Truncating this value affects AVS results and therefore might also affect risk decisions and chargebacks. Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### FDMS Nashville When the street name is numeric, it must be sent in numeric format. For example, if the address is _One First Street_, it must be sent as _1 1st Street_.  Required if keyed; not used if swiped.  String (20)  #### TSYS Acquiring Solutions Required when `processingInformation.billPaymentOptions.billPayment=true` and `pointOfSaleInformation.entryMode=keyed`.  #### All other processors: Optional. String (60)  #### For Payouts This field may be sent only for FDC Compass.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Riskv1addressverificationsOrderInformationBillTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Used for additional address information. For example: _Attention: Accounts Payable_ Optional field.  For Payouts: This field may be sent only for FDC Compass.  #### Atos This field must not contain colons (:).  #### CyberSource through VisaNet **Important** When you populate &#x60;orderInformation.billTo.address1&#x60; and &#x60;orderInformation.billTo.address2&#x60;, CyberSource through VisaNet concatenates the two values. If the concatenated value exceeds 40 characters, CyberSource through VisaNet truncates the value at 40 characters before sending it to Visa and the issuing bank. Truncating this value affects AVS results and therefore might also affect risk decisions and chargebacks. Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### Chase Paymentech Solutions, FDC Compass, and TSYS Acquiring Solutions This value is used for AVS.  #### FDMS Nashville &#x60;orderInformation.billTo.address1&#x60; and &#x60;orderInformation.billTo.address2&#x60; together cannot exceed 20 characters. String (20)  #### All Other Processors String (60) 
   * @return address2
  **/
  @ApiModelProperty(value = "Used for additional address information. For example: _Attention: Accounts Payable_ Optional field.  For Payouts: This field may be sent only for FDC Compass.  #### Atos This field must not contain colons (:).  #### CyberSource through VisaNet **Important** When you populate `orderInformation.billTo.address1` and `orderInformation.billTo.address2`, CyberSource through VisaNet concatenates the two values. If the concatenated value exceeds 40 characters, CyberSource through VisaNet truncates the value at 40 characters before sending it to Visa and the issuing bank. Truncating this value affects AVS results and therefore might also affect risk decisions and chargebacks. Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### Chase Paymentech Solutions, FDC Compass, and TSYS Acquiring Solutions This value is used for AVS.  #### FDMS Nashville `orderInformation.billTo.address1` and `orderInformation.billTo.address2` together cannot exceed 20 characters. String (20)  #### All Other Processors String (60) ")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Riskv1addressverificationsOrderInformationBillTo address3(String address3) {
    this.address3 = address3;
    return this;
  }

   /**
   * Additional address information (third line of the billing address) 
   * @return address3
  **/
  @ApiModelProperty(value = "Additional address information (third line of the billing address) ")
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public Riskv1addressverificationsOrderInformationBillTo address4(String address4) {
    this.address4 = address4;
    return this;
  }

   /**
   * Additional address information (fourth line of the billing address) 
   * @return address4
  **/
  @ApiModelProperty(value = "Additional address information (fourth line of the billing address) ")
  public String getAddress4() {
    return address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public Riskv1addressverificationsOrderInformationBillTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province of the billing address. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  For Payouts: This field may be sent only for FDC Compass.  ##### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Chase Paymentech Solutions Optional field.  ####  Credit Mutuel-CIC Optional field.  #### OmniPay Direct Optional field.  #### SIX Optional field.  #### TSYS Acquiring Solutions Required when &#x60;processingInformation.billPaymentOptions.billPayment&#x3D;true&#x60; and &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;.  #### Worldpay VAP Optional field.  #### All other processors Not used. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State or province of the billing address. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  For Payouts: This field may be sent only for FDC Compass.  ##### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Chase Paymentech Solutions Optional field.  ####  Credit Mutuel-CIC Optional field.  #### OmniPay Direct Optional field.  #### SIX Optional field.  #### TSYS Acquiring Solutions Required when `processingInformation.billPaymentOptions.billPayment=true` and `pointOfSaleInformation.entryMode=keyed`.  #### Worldpay VAP Optional field.  #### All other processors Not used. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Riskv1addressverificationsOrderInformationBillTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Payment card billing country. Use the two-character [ISO Standard Country Codes](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf).  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Chase Paymentech Solutions Optional field.  ####  Credit Mutuel-CIC Optional field.  #### OmniPay Direct Optional field.  #### SIX Optional field.  #### TSYS Acquiring Solutions Required when &#x60;processingInformation.billPaymentOptions.billPayment&#x3D;true&#x60; and &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;.  #### Worldpay VAP Optional field.  #### All other processors Not used. 
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Payment card billing country. Use the two-character [ISO Standard Country Codes](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf).  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### Chase Paymentech Solutions Optional field.  ####  Credit Mutuel-CIC Optional field.  #### OmniPay Direct Optional field.  #### SIX Optional field.  #### TSYS Acquiring Solutions Required when `processingInformation.billPaymentOptions.billPayment=true` and `pointOfSaleInformation.entryMode=keyed`.  #### Worldpay VAP Optional field.  #### All other processors Not used. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Riskv1addressverificationsOrderInformationBillTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Payment card billing city.  #### Atos This field must not contain colons (:).  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### For Payouts: This field may be sent only for FDC Compass.  #### Chase Paymentech Solutions Optional field.  ####  Credit Mutuel-CIC Optional field.  #### OmniPay Direct Optional field.  #### SIX Optional field.  #### TSYS Acquiring Solutions Required when &#x60;processingInformation.billPaymentOptions.billPayment&#x3D;true&#x60; and &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;.  #### Worldpay VAP Optional field.  #### All other processors Not used. 
   * @return locality
  **/
  @ApiModelProperty(required = true, value = "Payment card billing city.  #### Atos This field must not contain colons (:).  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### For Payouts: This field may be sent only for FDC Compass.  #### Chase Paymentech Solutions Optional field.  ####  Credit Mutuel-CIC Optional field.  #### OmniPay Direct Optional field.  #### SIX Optional field.  #### TSYS Acquiring Solutions Required when `processingInformation.billPaymentOptions.billPayment=true` and `pointOfSaleInformation.entryMode=keyed`.  #### Worldpay VAP Optional field.  #### All other processors Not used. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Riskv1addressverificationsOrderInformationBillTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code for the billing address. The postal code must consist of 5 to 9 digits.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  **Example** &#x60;12345-6789&#x60;  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  **Example** &#x60;A1B 2C3&#x60;  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### For Payouts:  This field may be sent only for FDC Compass.  #### American Express Direct Before sending the postal code to the processor, CyberSource removes all nonalphanumeric characters and, if the remaining value is longer than nine characters, truncates the value starting from the right side.  #### Atos This field must not contain colons (:).  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### FDMS Nashville Required if &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60; and the address is in the U.S. or Canada. Optional if &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60; and the address is **not** in the U.S. or Canada. Not used if swiped.  #### RBS WorldPay Atlanta: For best card-present keyed rates, send the postal code if &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;.  #### TSYS Acquiring Solutions Required when &#x60;processingInformation.billPaymentOptions.billPayment&#x3D;true&#x60; and &#x60;pointOfSaleInformation.entryMode&#x3D;keyed&#x60;.  #### All other processors: Optional field. 
   * @return postalCode
  **/
  @ApiModelProperty(required = true, value = "Postal code for the billing address. The postal code must consist of 5 to 9 digits.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  **Example** `12345-6789`  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  **Example** `A1B 2C3`  **Important** It is your responsibility to determine whether a field is required for the transaction you are requesting.  #### For Payouts:  This field may be sent only for FDC Compass.  #### American Express Direct Before sending the postal code to the processor, CyberSource removes all nonalphanumeric characters and, if the remaining value is longer than nine characters, truncates the value starting from the right side.  #### Atos This field must not contain colons (:).  #### CyberSource through VisaNet Credit card networks cannot process transactions that contain non-ASCII characters. CyberSource through VisaNet accepts and stores non-ASCII characters correctly and displays them correctly in reports. However, the limitations of the credit card networks prevent CyberSource through VisaNet from transmitting non-ASCII characters to the credit card networks. Therefore, CyberSource through VisaNet replaces non-ASCII characters with meaningless ASCII characters for transmission to the credit card networks.  #### FDMS Nashville Required if `pointOfSaleInformation.entryMode=keyed` and the address is in the U.S. or Canada. Optional if `pointOfSaleInformation.entryMode=keyed` and the address is **not** in the U.S. or Canada. Not used if swiped.  #### RBS WorldPay Atlanta: For best card-present keyed rates, send the postal code if `pointOfSaleInformation.entryMode=keyed`.  #### TSYS Acquiring Solutions Required when `processingInformation.billPaymentOptions.billPayment=true` and `pointOfSaleInformation.entryMode=keyed`.  #### All other processors: Optional field. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1addressverificationsOrderInformationBillTo riskv1addressverificationsOrderInformationBillTo = (Riskv1addressverificationsOrderInformationBillTo) o;
    return Objects.equals(this.address1, riskv1addressverificationsOrderInformationBillTo.address1) &&
        Objects.equals(this.address2, riskv1addressverificationsOrderInformationBillTo.address2) &&
        Objects.equals(this.address3, riskv1addressverificationsOrderInformationBillTo.address3) &&
        Objects.equals(this.address4, riskv1addressverificationsOrderInformationBillTo.address4) &&
        Objects.equals(this.administrativeArea, riskv1addressverificationsOrderInformationBillTo.administrativeArea) &&
        Objects.equals(this.country, riskv1addressverificationsOrderInformationBillTo.country) &&
        Objects.equals(this.locality, riskv1addressverificationsOrderInformationBillTo.locality) &&
        Objects.equals(this.postalCode, riskv1addressverificationsOrderInformationBillTo.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, address3, address4, administrativeArea, country, locality, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1addressverificationsOrderInformationBillTo {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    address4: ").append(toIndentedString(address4)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

