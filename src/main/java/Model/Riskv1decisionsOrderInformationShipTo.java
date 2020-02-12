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
 * Contains recipient shipping information.
 */
@ApiModel(description = "Contains recipient shipping information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-12T15:59:24.815+05:30")
public class Riskv1decisionsOrderInformationShipTo {
  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  public Riskv1decisionsOrderInformationShipTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of the shipping address.
   * @return address1
  **/
  @ApiModelProperty(value = "First line of the shipping address.")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Riskv1decisionsOrderInformationShipTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Second line of the shipping address.
   * @return address2
  **/
  @ApiModelProperty(value = "Second line of the shipping address.")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Riskv1decisionsOrderInformationShipTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province of the shipping address. Use the State, Province, and Territory Codes for the United States and Canada. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State or province of the shipping address. Use the State, Province, and Territory Codes for the United States and Canada. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Riskv1decisionsOrderInformationShipTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the shipping address. Use the two-character ISO Standard Country Codes.
   * @return country
  **/
  @ApiModelProperty(value = "Country of the shipping address. Use the two-character ISO Standard Country Codes.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Riskv1decisionsOrderInformationShipTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of the shipping address.
   * @return locality
  **/
  @ApiModelProperty(value = "City of the shipping address.")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Riskv1decisionsOrderInformationShipTo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the recipient.  **Processor specific maximum length**  - Litle: 25 - All other processors: 60 
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the recipient.  **Processor specific maximum length**  - Litle: 25 - All other processors: 60 ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Riskv1decisionsOrderInformationShipTo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the recipient.  **Processor-specific maximum length**  - Litle: 25 - All other processors: 60 
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the recipient.  **Processor-specific maximum length**  - Litle: 25 - All other processors: 60 ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Riskv1decisionsOrderInformationShipTo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number associated with the shipping address.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone number associated with the shipping address.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Riskv1decisionsOrderInformationShipTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code for the shipping address. The postal code must consist of 5 to 9 digits.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  Example A1B 2C3  **American Express Direct**\\ Before sending the postal code to the processor, CyberSource removes all nonalphanumeric characters and, if the remaining value is longer than nine characters, truncates the value starting from the right side. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code for the shipping address. The postal code must consist of 5 to 9 digits.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  Example A1B 2C3  **American Express Direct**\\ Before sending the postal code to the processor, CyberSource removes all nonalphanumeric characters and, if the remaining value is longer than nine characters, truncates the value starting from the right side. ")
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
    Riskv1decisionsOrderInformationShipTo riskv1decisionsOrderInformationShipTo = (Riskv1decisionsOrderInformationShipTo) o;
    return Objects.equals(this.address1, riskv1decisionsOrderInformationShipTo.address1) &&
        Objects.equals(this.address2, riskv1decisionsOrderInformationShipTo.address2) &&
        Objects.equals(this.administrativeArea, riskv1decisionsOrderInformationShipTo.administrativeArea) &&
        Objects.equals(this.country, riskv1decisionsOrderInformationShipTo.country) &&
        Objects.equals(this.locality, riskv1decisionsOrderInformationShipTo.locality) &&
        Objects.equals(this.firstName, riskv1decisionsOrderInformationShipTo.firstName) &&
        Objects.equals(this.lastName, riskv1decisionsOrderInformationShipTo.lastName) &&
        Objects.equals(this.phoneNumber, riskv1decisionsOrderInformationShipTo.phoneNumber) &&
        Objects.equals(this.postalCode, riskv1decisionsOrderInformationShipTo.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, administrativeArea, country, locality, firstName, lastName, phoneNumber, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsOrderInformationShipTo {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

