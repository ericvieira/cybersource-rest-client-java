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
import Model.TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBank
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-15T14:19:26.508+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBank {
  @SerializedName("account")
  private TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount account = null;

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBank account(TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount getAccount() {
    return account;
  }

  public void setAccount(TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBankAccount account) {
    this.account = account;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBank tssV2TransactionsPost201ResponseEmbeddedPaymentInformationBank = (TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBank) o;
    return Objects.equals(this.account, tssV2TransactionsPost201ResponseEmbeddedPaymentInformationBank.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedPaymentInformationBank {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

