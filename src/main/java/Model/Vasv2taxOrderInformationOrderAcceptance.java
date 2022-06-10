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
 * The place of business where you accept/approve the customer’s order, thereby becoming contractually obligated to make the sale.
 */
@ApiModel(description = "The place of business where you accept/approve the customer’s order, thereby becoming contractually obligated to make the sale.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-10T13:11:55.460+05:30")
public class Vasv2taxOrderInformationOrderAcceptance {
  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("country")
  private String country = null;

  public Vasv2taxOrderInformationOrderAcceptance locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Order acceptance city. This field is not used unless the &#x60;orderInformation.orderAcceptance.administrativeArea&#x60; and &#x60;orderInformation.orderAcceptance.country&#x60; fields are present.  **NOTE** If this field appears in a &#x60;lineItems&#x60; object, then the value of this field in the &#x60;lineItems&#x60; object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. The place of business where you accept/approve the customer’s order, thereby becoming contractually obligated to make the sale. 
   * @return locality
  **/
  @ApiModelProperty(value = "Order acceptance city. This field is not used unless the `orderInformation.orderAcceptance.administrativeArea` and `orderInformation.orderAcceptance.country` fields are present.  **NOTE** If this field appears in a `lineItems` object, then the value of this field in the `lineItems` object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. The place of business where you accept/approve the customer’s order, thereby becoming contractually obligated to make the sale. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Vasv2taxOrderInformationOrderAcceptance administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * Order acceptance state. This field is not used unless the &#x60;orderInformation.orderAcceptance.locality&#x60; and &#x60;orderInformation.orderAcceptance.country&#x60; fields are present. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  **NOTE** If this field appears in a &#x60;lineItems&#x60; object, then the value of this field in the &#x60;lineItems&#x60; object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. The place of business where you accept/approve the customer’s order, thereby becoming contractually obligated to make the sale. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "Order acceptance state. This field is not used unless the `orderInformation.orderAcceptance.locality` and `orderInformation.orderAcceptance.country` fields are present. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  **NOTE** If this field appears in a `lineItems` object, then the value of this field in the `lineItems` object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. The place of business where you accept/approve the customer’s order, thereby becoming contractually obligated to make the sale. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Vasv2taxOrderInformationOrderAcceptance postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Order acceptance postal code. This field is not used unless the &#x60;orderInformation.orderAcceptance.locality&#x60;, &#x60;orderInformation.orderAcceptance.administrativeArea&#x60;, and &#x60;orderInformation.orderAcceptance.country&#x60; fields are present. Must be sent at the line or offer level to be surfaced in the Tax Detail Report.  **NOTE** If this field appears in a &#x60;lineItems&#x60; object, then the value of this field in the &#x60;lineItems&#x60; object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. The place of business where you accept/approve the customer’s order, thereby becoming contractually obligated to make the sale. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Order acceptance postal code. This field is not used unless the `orderInformation.orderAcceptance.locality`, `orderInformation.orderAcceptance.administrativeArea`, and `orderInformation.orderAcceptance.country` fields are present. Must be sent at the line or offer level to be surfaced in the Tax Detail Report.  **NOTE** If this field appears in a `lineItems` object, then the value of this field in the `lineItems` object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. The place of business where you accept/approve the customer’s order, thereby becoming contractually obligated to make the sale. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Vasv2taxOrderInformationOrderAcceptance country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Order acceptance country. This field is not used unless the &#x60;orderInformation.orderAcceptance.administrativeArea&#x60; and &#x60;orderInformation.orderAcceptance.locality&#x60; fields are present. Use the [ISO Standard Country Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf)  **NOTE** If this field appears in a &#x60;lineItems&#x60; object, then the value of this field in the &#x60;lineItems&#x60; object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. The place of business where you accept/approve the customer’s order, thereby becoming contractually obligated to make the sale. 
   * @return country
  **/
  @ApiModelProperty(value = "Order acceptance country. This field is not used unless the `orderInformation.orderAcceptance.administrativeArea` and `orderInformation.orderAcceptance.locality` fields are present. Use the [ISO Standard Country Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf)  **NOTE** If this field appears in a `lineItems` object, then the value of this field in the `lineItems` object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. The place of business where you accept/approve the customer’s order, thereby becoming contractually obligated to make the sale. ")
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
    Vasv2taxOrderInformationOrderAcceptance vasv2taxOrderInformationOrderAcceptance = (Vasv2taxOrderInformationOrderAcceptance) o;
    return Objects.equals(this.locality, vasv2taxOrderInformationOrderAcceptance.locality) &&
        Objects.equals(this.administrativeArea, vasv2taxOrderInformationOrderAcceptance.administrativeArea) &&
        Objects.equals(this.postalCode, vasv2taxOrderInformationOrderAcceptance.postalCode) &&
        Objects.equals(this.country, vasv2taxOrderInformationOrderAcceptance.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locality, administrativeArea, postalCode, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vasv2taxOrderInformationOrderAcceptance {\n");
    
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

