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
 * Customer&#39;s bank account details
 */
@ApiModel(description = "Customer's bank account details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T15:31:38.576+05:30")
public class Riskv1liststypeentriesPaymentInformationBank {
  @SerializedName("accountNumber")
  private String accountNumber = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("iban")
  private String iban = null;

  public Riskv1liststypeentriesPaymentInformationBank accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Customer&#39;s bank account number. You can use this field only when scoring a direct debit transaction. Use this field if you do not or are not allowed to provide the IBAN. Note Do not use the IBAN in this field. Use nly the traditional account number information. For the IBAN, use bank_iban. 
   * @return accountNumber
  **/
  @ApiModelProperty(value = "Customer's bank account number. You can use this field only when scoring a direct debit transaction. Use this field if you do not or are not allowed to provide the IBAN. Note Do not use the IBAN in this field. Use nly the traditional account number information. For the IBAN, use bank_iban. ")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Riskv1liststypeentriesPaymentInformationBank code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Country-specific code used to identify the customer’s bank. Required for some countries if you do not or are not allowed to provide the IBAN instead. You can use this field only when scoring a direct debit transaction. For specific requirements, see \&quot;Required Bank Account Information by Country,\&quot; 
   * @return code
  **/
  @ApiModelProperty(value = "Country-specific code used to identify the customer’s bank. Required for some countries if you do not or are not allowed to provide the IBAN instead. You can use this field only when scoring a direct debit transaction. For specific requirements, see \"Required Bank Account Information by Country,\" ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Riskv1liststypeentriesPaymentInformationBank country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country where the bank is located. Use the two-character ISO codes. You can use this field only when scoring a direct debit transaction. 
   * @return country
  **/
  @ApiModelProperty(value = "Country where the bank is located. Use the two-character ISO codes. You can use this field only when scoring a direct debit transaction. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Riskv1liststypeentriesPaymentInformationBank iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * International Bank Account Number (IBAN) for the bank account. For some countries you can provide this number instead of the traditional bank account information. You can use this field only when scoring a direct debit transaction. For specific requirements, see \&quot;Required Bank Account Information by Country,\&quot; 
   * @return iban
  **/
  @ApiModelProperty(value = "International Bank Account Number (IBAN) for the bank account. For some countries you can provide this number instead of the traditional bank account information. You can use this field only when scoring a direct debit transaction. For specific requirements, see \"Required Bank Account Information by Country,\" ")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1liststypeentriesPaymentInformationBank riskv1liststypeentriesPaymentInformationBank = (Riskv1liststypeentriesPaymentInformationBank) o;
    return Objects.equals(this.accountNumber, riskv1liststypeentriesPaymentInformationBank.accountNumber) &&
        Objects.equals(this.code, riskv1liststypeentriesPaymentInformationBank.code) &&
        Objects.equals(this.country, riskv1liststypeentriesPaymentInformationBank.country) &&
        Objects.equals(this.iban, riskv1liststypeentriesPaymentInformationBank.iban);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, code, country, iban);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1liststypeentriesPaymentInformationBank {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
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

