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
 * PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-10T13:11:55.460+05:30")
public class PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults {
  @SerializedName("code")
  private String code = null;

  @SerializedName("codeRaw")
  private String codeRaw = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("emailRaw")
  private String emailRaw = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("phoneNumberRaw")
  private String phoneNumberRaw = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("postalCodeRaw")
  private String postalCodeRaw = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("streetRaw")
  private String streetRaw = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nameRaw")
  private String nameRaw = null;

  public PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customer’s name.  For details, see &#x60;auth_ev_name&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return code
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customer’s name.  For details, see `auth_ev_name` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults codeRaw(String codeRaw) {
    this.codeRaw = codeRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customer’s last name
   * @return codeRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customer’s last name")
  public String getCodeRaw() {
    return codeRaw;
  }

  public void setCodeRaw(String codeRaw) {
    this.codeRaw = codeRaw;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customer’s email address.  For details, see &#x60;auth_ev_email&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return email
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customer’s email address.  For details, see `auth_ev_email` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults emailRaw(String emailRaw) {
    this.emailRaw = emailRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customer’s email address.
   * @return emailRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customer’s email address.")
  public String getEmailRaw() {
    return emailRaw;
  }

  public void setEmailRaw(String emailRaw) {
    this.emailRaw = emailRaw;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customer’s phone number.  For details, see &#x60;auth_ev_phone_number&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customer’s phone number.  For details, see `auth_ev_phone_number` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults phoneNumberRaw(String phoneNumberRaw) {
    this.phoneNumberRaw = phoneNumberRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customer’s phone number.
   * @return phoneNumberRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customer’s phone number.")
  public String getPhoneNumberRaw() {
    return phoneNumberRaw;
  }

  public void setPhoneNumberRaw(String phoneNumberRaw) {
    this.phoneNumberRaw = phoneNumberRaw;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customer’s postal code.  For details, see &#x60;auth_ev_postal_code&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customer’s postal code.  For details, see `auth_ev_postal_code` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults postalCodeRaw(String postalCodeRaw) {
    this.postalCodeRaw = postalCodeRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customer’s postal code.
   * @return postalCodeRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customer’s postal code.")
  public String getPostalCodeRaw() {
    return postalCodeRaw;
  }

  public void setPostalCodeRaw(String postalCodeRaw) {
    this.postalCodeRaw = postalCodeRaw;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customer’s street address.  For details, see &#x60;auth_ev_street&#x60; field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return street
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customer’s street address.  For details, see `auth_ev_street` field description in the [Credit Card Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults streetRaw(String streetRaw) {
    this.streetRaw = streetRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customer’s street address.
   * @return streetRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customer’s street address.")
  public String getStreetRaw() {
    return streetRaw;
  }

  public void setStreetRaw(String streetRaw) {
    this.streetRaw = streetRaw;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Mapped Electronic Verification response code for the customer’s name. 
   * @return name
  **/
  @ApiModelProperty(value = "Mapped Electronic Verification response code for the customer’s name. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults nameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
    return this;
  }

   /**
   * Raw Electronic Verification response code from the processor for the customer’s name. 
   * @return nameRaw
  **/
  @ApiModelProperty(value = "Raw Electronic Verification response code from the processor for the customer’s name. ")
  public String getNameRaw() {
    return nameRaw;
  }

  public void setNameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults ptsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults = (PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults) o;
    return Objects.equals(this.code, ptsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults.code) &&
        Objects.equals(this.codeRaw, ptsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults.codeRaw) &&
        Objects.equals(this.email, ptsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults.email) &&
        Objects.equals(this.emailRaw, ptsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults.emailRaw) &&
        Objects.equals(this.phoneNumber, ptsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults.phoneNumber) &&
        Objects.equals(this.phoneNumberRaw, ptsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults.phoneNumberRaw) &&
        Objects.equals(this.postalCode, ptsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults.postalCode) &&
        Objects.equals(this.postalCodeRaw, ptsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults.postalCodeRaw) &&
        Objects.equals(this.street, ptsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults.street) &&
        Objects.equals(this.streetRaw, ptsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults.streetRaw) &&
        Objects.equals(this.name, ptsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults.name) &&
        Objects.equals(this.nameRaw, ptsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults.nameRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, codeRaw, email, emailRaw, phoneNumber, phoneNumberRaw, postalCode, postalCodeRaw, street, streetRaw, name, nameRaw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseProcessorInformationElectronicVerificationResults {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeRaw: ").append(toIndentedString(codeRaw)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailRaw: ").append(toIndentedString(emailRaw)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberRaw: ").append(toIndentedString(phoneNumberRaw)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    postalCodeRaw: ").append(toIndentedString(postalCodeRaw)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetRaw: ").append(toIndentedString(streetRaw)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameRaw: ").append(toIndentedString(nameRaw)).append("\n");
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

