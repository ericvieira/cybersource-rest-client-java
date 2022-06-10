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
import Model.Ptsv2paymentsPaymentInformationBankAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsPaymentInformationBank
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-10T13:11:55.460+05:30")
public class Ptsv2paymentsPaymentInformationBank {
  @SerializedName("account")
  private Ptsv2paymentsPaymentInformationBankAccount account = null;

  @SerializedName("routingNumber")
  private String routingNumber = null;

  @SerializedName("iban")
  private String iban = null;

  @SerializedName("swiftCode")
  private String swiftCode = null;

  public Ptsv2paymentsPaymentInformationBank account(Ptsv2paymentsPaymentInformationBankAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationBankAccount getAccount() {
    return account;
  }

  public void setAccount(Ptsv2paymentsPaymentInformationBankAccount account) {
    this.account = account;
  }

  public Ptsv2paymentsPaymentInformationBank routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Bank routing number. This is also called the _transit number_.  For details, see &#x60;ecp_rdfi&#x60; request field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) 
   * @return routingNumber
  **/
  @ApiModelProperty(value = "Bank routing number. This is also called the _transit number_.  For details, see `ecp_rdfi` request field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) ")
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public Ptsv2paymentsPaymentInformationBank iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * International Bank Account Number (IBAN) for the bank account. For some countries you can provide this number instead of the traditional bank account information. You can use this field only when scoring a direct debit transaction.  For all possible values, see the &#x60;bank_iban&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return iban
  **/
  @ApiModelProperty(value = "International Bank Account Number (IBAN) for the bank account. For some countries you can provide this number instead of the traditional bank account information. You can use this field only when scoring a direct debit transaction.  For all possible values, see the `bank_iban` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Ptsv2paymentsPaymentInformationBank swiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
    return this;
  }

   /**
   * Bank’s SWIFT code. You can use this field only when scoring a direct debit transaction. Required only for crossborder transactions.  For all possible values, see the &#x60;bank_swiftcode&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return swiftCode
  **/
  @ApiModelProperty(value = "Bank’s SWIFT code. You can use this field only when scoring a direct debit transaction. Required only for crossborder transactions.  For all possible values, see the `bank_swiftcode` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getSwiftCode() {
    return swiftCode;
  }

  public void setSwiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPaymentInformationBank ptsv2paymentsPaymentInformationBank = (Ptsv2paymentsPaymentInformationBank) o;
    return Objects.equals(this.account, ptsv2paymentsPaymentInformationBank.account) &&
        Objects.equals(this.routingNumber, ptsv2paymentsPaymentInformationBank.routingNumber) &&
        Objects.equals(this.iban, ptsv2paymentsPaymentInformationBank.iban) &&
        Objects.equals(this.swiftCode, ptsv2paymentsPaymentInformationBank.swiftCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, routingNumber, iban, swiftCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPaymentInformationBank {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    swiftCode: ").append(toIndentedString(swiftCode)).append("\n");
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

