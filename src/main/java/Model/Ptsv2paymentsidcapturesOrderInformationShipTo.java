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
 * Ptsv2paymentsidcapturesOrderInformationShipTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-12T17:46:06.587+05:30")
public class Ptsv2paymentsidcapturesOrderInformationShipTo {
  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  public Ptsv2paymentsidcapturesOrderInformationShipTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province of the shipping address. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf)  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State or province of the shipping address. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf)  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Ptsv2paymentsidcapturesOrderInformationShipTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the shipping address. Use the two-character [ISO Standard Country Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf)  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. 
   * @return country
  **/
  @ApiModelProperty(value = "Country of the shipping address. Use the two-character [ISO Standard Country Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf)  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Ptsv2paymentsidcapturesOrderInformationShipTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code for the shipping address. The postal code must consist of 5 to 9 digits.  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  Example A1B 2C3  #### American Express Direct Before sending the postal code to the processor, all nonalphanumeric characters are removed and, if the remaining value is longer than nine characters, the value is truncated starting from the right side. #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code for the shipping address. The postal code must consist of 5 to 9 digits.  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  Example A1B 2C3  #### American Express Direct Before sending the postal code to the processor, all nonalphanumeric characters are removed and, if the remaining value is longer than nine characters, the value is truncated starting from the right side. #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. ")
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
    Ptsv2paymentsidcapturesOrderInformationShipTo ptsv2paymentsidcapturesOrderInformationShipTo = (Ptsv2paymentsidcapturesOrderInformationShipTo) o;
    return Objects.equals(this.administrativeArea, ptsv2paymentsidcapturesOrderInformationShipTo.administrativeArea) &&
        Objects.equals(this.country, ptsv2paymentsidcapturesOrderInformationShipTo.country) &&
        Objects.equals(this.postalCode, ptsv2paymentsidcapturesOrderInformationShipTo.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativeArea, country, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidcapturesOrderInformationShipTo {\n");
    
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

