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
 * TssV2TransactionsGet200ResponsePaymentInformationAccountFeatures
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-12T17:46:06.587+05:30")
public class TssV2TransactionsGet200ResponsePaymentInformationAccountFeatures {
  @SerializedName("balanceAmount")
  private String balanceAmount = null;

  @SerializedName("previousBalanceAmount")
  private String previousBalanceAmount = null;

  @SerializedName("currency")
  private String currency = null;

  public TssV2TransactionsGet200ResponsePaymentInformationAccountFeatures balanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
    return this;
  }

   /**
   * Remaining balance on the account.  Returned by authorization service.  #### PIN debit Remaining balance on the prepaid card.  Returned by PIN debit purchase. 
   * @return balanceAmount
  **/
  @ApiModelProperty(value = "Remaining balance on the account.  Returned by authorization service.  #### PIN debit Remaining balance on the prepaid card.  Returned by PIN debit purchase. ")
  public String getBalanceAmount() {
    return balanceAmount;
  }

  public void setBalanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationAccountFeatures previousBalanceAmount(String previousBalanceAmount) {
    this.previousBalanceAmount = previousBalanceAmount;
    return this;
  }

   /**
   * Remaining balance on the account.  Returned by authorization service.  #### PIN debit Remaining balance on the prepaid card.  Returned by PIN debit purchase. 
   * @return previousBalanceAmount
  **/
  @ApiModelProperty(value = "Remaining balance on the account.  Returned by authorization service.  #### PIN debit Remaining balance on the prepaid card.  Returned by PIN debit purchase. ")
  public String getPreviousBalanceAmount() {
    return previousBalanceAmount;
  }

  public void setPreviousBalanceAmount(String previousBalanceAmount) {
    this.previousBalanceAmount = previousBalanceAmount;
  }

  public TssV2TransactionsGet200ResponsePaymentInformationAccountFeatures currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of the remaining balance on the account. For the possible values, see the [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  Returned by authorization service.  #### PIN debit Currency of the remaining balance on the prepaid card.  Returned by PIN debit purchase. 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency of the remaining balance on the account. For the possible values, see the [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)  Returned by authorization service.  #### PIN debit Currency of the remaining balance on the prepaid card.  Returned by PIN debit purchase. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePaymentInformationAccountFeatures tssV2TransactionsGet200ResponsePaymentInformationAccountFeatures = (TssV2TransactionsGet200ResponsePaymentInformationAccountFeatures) o;
    return Objects.equals(this.balanceAmount, tssV2TransactionsGet200ResponsePaymentInformationAccountFeatures.balanceAmount) &&
        Objects.equals(this.previousBalanceAmount, tssV2TransactionsGet200ResponsePaymentInformationAccountFeatures.previousBalanceAmount) &&
        Objects.equals(this.currency, tssV2TransactionsGet200ResponsePaymentInformationAccountFeatures.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAmount, previousBalanceAmount, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePaymentInformationAccountFeatures {\n");
    
    sb.append("    balanceAmount: ").append(toIndentedString(balanceAmount)).append("\n");
    sb.append("    previousBalanceAmount: ").append(toIndentedString(previousBalanceAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

