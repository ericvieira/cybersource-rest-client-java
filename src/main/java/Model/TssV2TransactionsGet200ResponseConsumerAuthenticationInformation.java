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
 * TssV2TransactionsGet200ResponseConsumerAuthenticationInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-12T15:59:24.815+05:30")
public class TssV2TransactionsGet200ResponseConsumerAuthenticationInformation {
  @SerializedName("eciRaw")
  private String eciRaw = null;

  @SerializedName("cavv")
  private String cavv = null;

  @SerializedName("xid")
  private String xid = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  public TssV2TransactionsGet200ResponseConsumerAuthenticationInformation eciRaw(String eciRaw) {
    this.eciRaw = eciRaw;
    return this;
  }

   /**
   * Raw electronic commerce indicator (ECI).  For details, see &#x60;eci_raw&#x60; request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return eciRaw
  **/
  @ApiModelProperty(value = "Raw electronic commerce indicator (ECI).  For details, see `eci_raw` request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getEciRaw() {
    return eciRaw;
  }

  public void setEciRaw(String eciRaw) {
    this.eciRaw = eciRaw;
  }

  public TssV2TransactionsGet200ResponseConsumerAuthenticationInformation cavv(String cavv) {
    this.cavv = cavv;
    return this;
  }

   /**
   * Cardholder authentication verification value (CAVV).
   * @return cavv
  **/
  @ApiModelProperty(value = "Cardholder authentication verification value (CAVV).")
  public String getCavv() {
    return cavv;
  }

  public void setCavv(String cavv) {
    this.cavv = cavv;
  }

  public TssV2TransactionsGet200ResponseConsumerAuthenticationInformation xid(String xid) {
    this.xid = xid;
    return this;
  }

   /**
   * Transaction identifier.  For details, see &#x60;xid&#x60; request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) 
   * @return xid
  **/
  @ApiModelProperty(value = "Transaction identifier.  For details, see `xid` request field description in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/) ")
  public String getXid() {
    return xid;
  }

  public void setXid(String xid) {
    this.xid = xid;
  }

  public TssV2TransactionsGet200ResponseConsumerAuthenticationInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Payer auth Transaction identifier.
   * @return transactionId
  **/
  @ApiModelProperty(value = "Payer auth Transaction identifier.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseConsumerAuthenticationInformation tssV2TransactionsGet200ResponseConsumerAuthenticationInformation = (TssV2TransactionsGet200ResponseConsumerAuthenticationInformation) o;
    return Objects.equals(this.eciRaw, tssV2TransactionsGet200ResponseConsumerAuthenticationInformation.eciRaw) &&
        Objects.equals(this.cavv, tssV2TransactionsGet200ResponseConsumerAuthenticationInformation.cavv) &&
        Objects.equals(this.xid, tssV2TransactionsGet200ResponseConsumerAuthenticationInformation.xid) &&
        Objects.equals(this.transactionId, tssV2TransactionsGet200ResponseConsumerAuthenticationInformation.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eciRaw, cavv, xid, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseConsumerAuthenticationInformation {\n");
    
    sb.append("    eciRaw: ").append(toIndentedString(eciRaw)).append("\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

