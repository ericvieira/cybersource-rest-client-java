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
 * TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-22T14:46:25.834+05:30")
public class TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions {
  @SerializedName("paymentMethod")
  private String paymentMethod = null;

  @SerializedName("terminalId")
  private String terminalId = null;

  @SerializedName("businessName")
  private String businessName = null;

  @SerializedName("businessNameKatakana")
  private String businessNameKatakana = null;

  public TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * This value is a 2-digit code indicating the payment method. Use Payment Method Code value that applies to the tranasction. - 10 (One-time payment) - 21, 22, 23, 24  (Bonus(one-time)payment) - 61 (Installment payment) - 31, 32, 33, 34  (Integrated (Bonus + Installment)payment) - 80 (Revolving payment) 
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "This value is a 2-digit code indicating the payment method. Use Payment Method Code value that applies to the tranasction. - 10 (One-time payment) - 21, 22, 23, 24  (Bonus(one-time)payment) - 61 (Installment payment) - 31, 32, 33, 34  (Integrated (Bonus + Installment)payment) - 80 (Revolving payment) ")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Unique Japan Credit Card Association (JCCA) terminal identifier.  The difference between this field and the &#x60;pointOfSaleInformation.terminalID&#x60; field is that you can define &#x60;pointOfSaleInformation.terminalID&#x60;, but &#x60;processingInformation.japanPaymentOptions.terminalId&#x60; is defined by the JCCA and is used only in Japan.  This field is supported only on CyberSource through VisaNet and JCN Gateway.  Optional field. 
   * @return terminalId
  **/
  @ApiModelProperty(value = "Unique Japan Credit Card Association (JCCA) terminal identifier.  The difference between this field and the `pointOfSaleInformation.terminalID` field is that you can define `pointOfSaleInformation.terminalID`, but `processingInformation.japanPaymentOptions.terminalId` is defined by the JCCA and is used only in Japan.  This field is supported only on CyberSource through VisaNet and JCN Gateway.  Optional field. ")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Business name in Japanese characters. This field is supported only on JCN Gateway and for the Sumitomo Mitsui Card Co. acquirer on CyberSource through VisaNet. 
   * @return businessName
  **/
  @ApiModelProperty(value = "Business name in Japanese characters. This field is supported only on JCN Gateway and for the Sumitomo Mitsui Card Co. acquirer on CyberSource through VisaNet. ")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions businessNameKatakana(String businessNameKatakana) {
    this.businessNameKatakana = businessNameKatakana;
    return this;
  }

   /**
   * Business name in Katakana characters. This field is supported only on JCN Gateway and for the Sumitomo Mitsui Card Co. acquirer on CyberSource through VisaNet. 
   * @return businessNameKatakana
  **/
  @ApiModelProperty(value = "Business name in Katakana characters. This field is supported only on JCN Gateway and for the Sumitomo Mitsui Card Co. acquirer on CyberSource through VisaNet. ")
  public String getBusinessNameKatakana() {
    return businessNameKatakana;
  }

  public void setBusinessNameKatakana(String businessNameKatakana) {
    this.businessNameKatakana = businessNameKatakana;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions tssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions = (TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions) o;
    return Objects.equals(this.paymentMethod, tssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions.paymentMethod) &&
        Objects.equals(this.terminalId, tssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions.terminalId) &&
        Objects.equals(this.businessName, tssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions.businessName) &&
        Objects.equals(this.businessNameKatakana, tssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions.businessNameKatakana);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, terminalId, businessName, businessNameKatakana);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions {\n");
    
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessNameKatakana: ").append(toIndentedString(businessNameKatakana)).append("\n");
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

