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
 * Ptsv2payoutsRecipientInformation
 */

public class Ptsv2payoutsRecipientInformation {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("middleInitial")
  private String middleInitial = null;

  @SerializedName("middleName")
  private String middleName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("dateOfBirth")
  private String dateOfBirth = null;

  public Ptsv2payoutsRecipientInformation firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of recipient. characters. * CTV (14) * Paymentech (30) 
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of recipient. characters. * CTV (14) * Paymentech (30) ")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Ptsv2payoutsRecipientInformation middleInitial(String middleInitial) {
    this.middleInitial = middleInitial;
    return this;
  }

   /**
   * Middle Initial of recipient. Required only for FDCCompass. 
   * @return middleInitial
  **/
  @ApiModelProperty(value = "Middle Initial of recipient. Required only for FDCCompass. ")
  public String getMiddleInitial() {
    return middleInitial;
  }

  public void setMiddleInitial(String middleInitial) {
    this.middleInitial = middleInitial;
  }

  public Ptsv2payoutsRecipientInformation middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Recipient&#39;s middle name. This field is a _passthrough_, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor. If the field is not required for the transaction, CyberSource does not forward it to the processor. 
   * @return middleName
  **/
  @ApiModelProperty(value = "Recipient's middle name. This field is a _passthrough_, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor. If the field is not required for the transaction, CyberSource does not forward it to the processor. ")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Ptsv2payoutsRecipientInformation lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of recipient. characters. * CTV (14) * Paymentech (30) 
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of recipient. characters. * CTV (14) * Paymentech (30) ")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Ptsv2payoutsRecipientInformation address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Recipient address information. Required only for FDCCompass.
   * @return address1
  **/
  @ApiModelProperty(value = "Recipient address information. Required only for FDCCompass.")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Ptsv2payoutsRecipientInformation locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Recipient city. Required only for FDCCompass.
   * @return locality
  **/
  @ApiModelProperty(value = "Recipient city. Required only for FDCCompass.")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Ptsv2payoutsRecipientInformation administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * Recipient State. Required only for FDCCompass.
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "Recipient State. Required only for FDCCompass.")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Ptsv2payoutsRecipientInformation country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Recipient country code. Required only for FDCCompass.
   * @return country
  **/
  @ApiModelProperty(value = "Recipient country code. Required only for FDCCompass.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Ptsv2payoutsRecipientInformation postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Recipient postal code. Required only for FDCCompass.
   * @return postalCode
  **/
  @ApiModelProperty(value = "Recipient postal code. Required only for FDCCompass.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Ptsv2payoutsRecipientInformation phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Recipient phone number. Required only for FDCCompass.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Recipient phone number. Required only for FDCCompass.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Ptsv2payoutsRecipientInformation dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Recipient date of birth in YYYYMMDD format. Required only for FDCCompass.
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Recipient date of birth in YYYYMMDD format. Required only for FDCCompass.")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2payoutsRecipientInformation ptsv2payoutsRecipientInformation = (Ptsv2payoutsRecipientInformation) o;
    return Objects.equals(this.firstName, ptsv2payoutsRecipientInformation.firstName) &&
        Objects.equals(this.middleInitial, ptsv2payoutsRecipientInformation.middleInitial) &&
        Objects.equals(this.middleName, ptsv2payoutsRecipientInformation.middleName) &&
        Objects.equals(this.lastName, ptsv2payoutsRecipientInformation.lastName) &&
        Objects.equals(this.address1, ptsv2payoutsRecipientInformation.address1) &&
        Objects.equals(this.locality, ptsv2payoutsRecipientInformation.locality) &&
        Objects.equals(this.administrativeArea, ptsv2payoutsRecipientInformation.administrativeArea) &&
        Objects.equals(this.country, ptsv2payoutsRecipientInformation.country) &&
        Objects.equals(this.postalCode, ptsv2payoutsRecipientInformation.postalCode) &&
        Objects.equals(this.phoneNumber, ptsv2payoutsRecipientInformation.phoneNumber) &&
        Objects.equals(this.dateOfBirth, ptsv2payoutsRecipientInformation.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleInitial, middleName, lastName, address1, locality, administrativeArea, country, postalCode, phoneNumber, dateOfBirth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2payoutsRecipientInformation {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleInitial: ").append(toIndentedString(middleInitial)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

