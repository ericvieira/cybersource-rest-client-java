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
 * Vasv2taxOrderInformationShippingDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-12T09:56:59.728+05:30")
public class Vasv2taxOrderInformationShippingDetails {
  @SerializedName("shipFromLocality")
  private String shipFromLocality = null;

  @SerializedName("shipFromCountry")
  private String shipFromCountry = null;

  @SerializedName("shipFromPostalCode")
  private String shipFromPostalCode = null;

  @SerializedName("shipFromAdministrativeArea")
  private String shipFromAdministrativeArea = null;

  public Vasv2taxOrderInformationShippingDetails shipFromLocality(String shipFromLocality) {
    this.shipFromLocality = shipFromLocality;
    return this;
  }

   /**
   * City where the product is shipped from. This field is used only when the &#x60;orderInformation.shipTo.administrativeArea&#x60; and &#x60;orderInformation.shipTo.country&#x60; fields are present.  **NOTE** If this field appears in a &#x60;lineItems&#x60; object, then the value of this field in the &#x60;lineItems&#x60; object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation This field is used to determine tax rules and/or rates applied to the transaction based on sourcing.  Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. 
   * @return shipFromLocality
  **/
  @ApiModelProperty(value = "City where the product is shipped from. This field is used only when the `orderInformation.shipTo.administrativeArea` and `orderInformation.shipTo.country` fields are present.  **NOTE** If this field appears in a `lineItems` object, then the value of this field in the `lineItems` object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation This field is used to determine tax rules and/or rates applied to the transaction based on sourcing.  Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. ")
  public String getShipFromLocality() {
    return shipFromLocality;
  }

  public void setShipFromLocality(String shipFromLocality) {
    this.shipFromLocality = shipFromLocality;
  }

  public Vasv2taxOrderInformationShippingDetails shipFromCountry(String shipFromCountry) {
    this.shipFromCountry = shipFromCountry;
    return this;
  }

   /**
   * Country from which the order is shipped. This field is used only when &#x60;orderInformation.shippingDetails.shipFromLocality&#x60; and &#x60;orderInformation.shippingDetails.shipFromAdministrativeArea&#x60; are present. Use the [ISO Standard Country Codes](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf).  **NOTE** If this field appears in a &#x60;lineItems&#x60; object, then the value of this field in the &#x60;lineItems&#x60; object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation This field is used to determine tax rules and/ or rates applied to the transaction based on sourcing.  Optional for U.S., Canadian, international tax, and value added taxes. 
   * @return shipFromCountry
  **/
  @ApiModelProperty(value = "Country from which the order is shipped. This field is used only when `orderInformation.shippingDetails.shipFromLocality` and `orderInformation.shippingDetails.shipFromAdministrativeArea` are present. Use the [ISO Standard Country Codes](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf).  **NOTE** If this field appears in a `lineItems` object, then the value of this field in the `lineItems` object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation This field is used to determine tax rules and/ or rates applied to the transaction based on sourcing.  Optional for U.S., Canadian, international tax, and value added taxes. ")
  public String getShipFromCountry() {
    return shipFromCountry;
  }

  public void setShipFromCountry(String shipFromCountry) {
    this.shipFromCountry = shipFromCountry;
  }

  public Vasv2taxOrderInformationShippingDetails shipFromPostalCode(String shipFromPostalCode) {
    this.shipFromPostalCode = shipFromPostalCode;
    return this;
  }

   /**
   * Postal code where the product is shipped from.  #### Tax Calculation This field is used to determine tax rules and/or rates applied to the transaction based on sourcing.  Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. 
   * @return shipFromPostalCode
  **/
  @ApiModelProperty(value = "Postal code where the product is shipped from.  #### Tax Calculation This field is used to determine tax rules and/or rates applied to the transaction based on sourcing.  Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. ")
  public String getShipFromPostalCode() {
    return shipFromPostalCode;
  }

  public void setShipFromPostalCode(String shipFromPostalCode) {
    this.shipFromPostalCode = shipFromPostalCode;
  }

  public Vasv2taxOrderInformationShippingDetails shipFromAdministrativeArea(String shipFromAdministrativeArea) {
    this.shipFromAdministrativeArea = shipFromAdministrativeArea;
    return this;
  }

   /**
   * State from which the order is shipped. This field is used only when &#x60;orderInformation.shippingDetails.shipFromLocality&#x60; and &#x60;orderInformation.shippingDetails.shipFromCountry&#x60; are present. Use the [State, Province, and Territory Codes for the United States and Canada](http://apps.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  **NOTE** If this field appears in a &#x60;lineItems&#x60; object, then the value of this field in the &#x60;lineItems&#x60; object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation This field is used to determine tax rules and/or rates applied to the transaction based on sourcing.  Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. 
   * @return shipFromAdministrativeArea
  **/
  @ApiModelProperty(value = "State from which the order is shipped. This field is used only when `orderInformation.shippingDetails.shipFromLocality` and `orderInformation.shippingDetails.shipFromCountry` are present. Use the [State, Province, and Territory Codes for the United States and Canada](http://apps.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  **NOTE** If this field appears in a `lineItems` object, then the value of this field in the `lineItems` object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation This field is used to determine tax rules and/or rates applied to the transaction based on sourcing.  Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. ")
  public String getShipFromAdministrativeArea() {
    return shipFromAdministrativeArea;
  }

  public void setShipFromAdministrativeArea(String shipFromAdministrativeArea) {
    this.shipFromAdministrativeArea = shipFromAdministrativeArea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vasv2taxOrderInformationShippingDetails vasv2taxOrderInformationShippingDetails = (Vasv2taxOrderInformationShippingDetails) o;
    return Objects.equals(this.shipFromLocality, vasv2taxOrderInformationShippingDetails.shipFromLocality) &&
        Objects.equals(this.shipFromCountry, vasv2taxOrderInformationShippingDetails.shipFromCountry) &&
        Objects.equals(this.shipFromPostalCode, vasv2taxOrderInformationShippingDetails.shipFromPostalCode) &&
        Objects.equals(this.shipFromAdministrativeArea, vasv2taxOrderInformationShippingDetails.shipFromAdministrativeArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipFromLocality, shipFromCountry, shipFromPostalCode, shipFromAdministrativeArea);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vasv2taxOrderInformationShippingDetails {\n");
    
    sb.append("    shipFromLocality: ").append(toIndentedString(shipFromLocality)).append("\n");
    sb.append("    shipFromCountry: ").append(toIndentedString(shipFromCountry)).append("\n");
    sb.append("    shipFromPostalCode: ").append(toIndentedString(shipFromPostalCode)).append("\n");
    sb.append("    shipFromAdministrativeArea: ").append(toIndentedString(shipFromAdministrativeArea)).append("\n");
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

