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
 * Vasv2taxOrderInformationBillTo
 */

public class Vasv2taxOrderInformationBillTo {
  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("country")
  private String country = null;

  public Vasv2taxOrderInformationBillTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of the billing street address.  #### Tax Calculation Required for U.S. and Canadian taxes. Not applicable to international and value added taxes. 
   * @return address1
  **/
  @ApiModelProperty(value = "First line of the billing street address.  #### Tax Calculation Required for U.S. and Canadian taxes. Not applicable to international and value added taxes. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Vasv2taxOrderInformationBillTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Second line of the billing street address.  #### Tax Calculation Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. 
   * @return address2
  **/
  @ApiModelProperty(value = "Second line of the billing street address.  #### Tax Calculation Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. ")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Vasv2taxOrderInformationBillTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Credit card billing city.  #### Tax Calculation Required for U.S. and Canadian taxes only. Not applicable to international and value added taxes. 
   * @return locality
  **/
  @ApiModelProperty(value = "Credit card billing city.  #### Tax Calculation Required for U.S. and Canadian taxes only. Not applicable to international and value added taxes. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Vasv2taxOrderInformationBillTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * Credit card billing state or province.  #### Tax Calculation Required for U.S. and Canadian taxes. Not applicable to international and value added taxes. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "Credit card billing state or province.  #### Tax Calculation Required for U.S. and Canadian taxes. Not applicable to international and value added taxes. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Vasv2taxOrderInformationBillTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code for the billing address. The postal code must consist of 5 to 9 digits. If the billing country is the U.S., the 9-digit postal code must follow this format:  [5 digits][dash][4 digits]  **Example**: 12345-6789  If the billing country is Canada, the 6-digit postal code must follow this format:  [alpha][numeric][alpha] [numeric][alpha][numeric]  **Example**: A1B 2C3  #### Tax Calculation Required for U.S. and Canadian taxes. Not applicable to international and value added taxes. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code for the billing address. The postal code must consist of 5 to 9 digits. If the billing country is the U.S., the 9-digit postal code must follow this format:  [5 digits][dash][4 digits]  **Example**: 12345-6789  If the billing country is Canada, the 6-digit postal code must follow this format:  [alpha][numeric][alpha] [numeric][alpha][numeric]  **Example**: A1B 2C3  #### Tax Calculation Required for U.S. and Canadian taxes. Not applicable to international and value added taxes. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Vasv2taxOrderInformationBillTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Credit card billing country. Use the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf).  If &#x60;orderInformation.shipTo.country&#x60; is not provided, &#x60;orderInformation.billTo.country&#x60; is used in its place. If  &#x60;orderInformation.billTo.country&#x60; is set to &#x60;US&#x60; or &#x60;CA&#x60;, then &#x60;orderInformation.billTo.postalCode&#x60; and &#x60;orderInformation.billTo.administrativeArea&#x60; are also required.  #### Tax Calculation Required for U.S., Canadian, international and value added taxes. 
   * @return country
  **/
  @ApiModelProperty(value = "Credit card billing country. Use the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf).  If `orderInformation.shipTo.country` is not provided, `orderInformation.billTo.country` is used in its place. If  `orderInformation.billTo.country` is set to `US` or `CA`, then `orderInformation.billTo.postalCode` and `orderInformation.billTo.administrativeArea` are also required.  #### Tax Calculation Required for U.S., Canadian, international and value added taxes. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vasv2taxOrderInformationBillTo vasv2taxOrderInformationBillTo = (Vasv2taxOrderInformationBillTo) o;
    return Objects.equals(this.address1, vasv2taxOrderInformationBillTo.address1) &&
        Objects.equals(this.address2, vasv2taxOrderInformationBillTo.address2) &&
        Objects.equals(this.locality, vasv2taxOrderInformationBillTo.locality) &&
        Objects.equals(this.administrativeArea, vasv2taxOrderInformationBillTo.administrativeArea) &&
        Objects.equals(this.postalCode, vasv2taxOrderInformationBillTo.postalCode) &&
        Objects.equals(this.country, vasv2taxOrderInformationBillTo.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, locality, administrativeArea, postalCode, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vasv2taxOrderInformationBillTo {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

