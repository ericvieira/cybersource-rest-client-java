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
 * TssV2TransactionsGet200ResponseApplicationInformationApplications
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-15T14:19:26.508+05:30")
public class TssV2TransactionsGet200ResponseApplicationInformationApplications {
  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reasonCode")
  private String reasonCode = null;

  @SerializedName("rCode")
  private String rCode = null;

  @SerializedName("rFlag")
  private String rFlag = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("rMessage")
  private String rMessage = null;

  @SerializedName("returnCode")
  private Integer returnCode = null;

  public TssV2TransactionsGet200ResponseApplicationInformationApplications name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the CyberSource transaction type (such as CC settlement or CC authorization) that the merchant wants to process in a transaction request. More than one transaction type can included in a transaction request. Each transaction type separately returns their own status, reasonCode, rCode, and rFlag messages. 
   * @return name
  **/
  @ApiModelProperty(value = "The name of the CyberSource transaction type (such as CC settlement or CC authorization) that the merchant wants to process in a transaction request. More than one transaction type can included in a transaction request. Each transaction type separately returns their own status, reasonCode, rCode, and rFlag messages. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TssV2TransactionsGet200ResponseApplicationInformationApplications status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return status
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TssV2TransactionsGet200ResponseApplicationInformationApplications reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * 3-digit reason code that indicates why the customer profile payment succeeded or failed.
   * @return reasonCode
  **/
  @ApiModelProperty(value = "3-digit reason code that indicates why the customer profile payment succeeded or failed.")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public TssV2TransactionsGet200ResponseApplicationInformationApplications rCode(String rCode) {
    this.rCode = rCode;
    return this;
  }

   /**
   * Indicates whether the service request was successful. Possible values:  - &#x60;-1&#x60;: An error occurred. - &#x60;0&#x60;: The request was declined. - &#x60;1&#x60;: The request was successful. 
   * @return rCode
  **/
  @ApiModelProperty(value = "Indicates whether the service request was successful. Possible values:  - `-1`: An error occurred. - `0`: The request was declined. - `1`: The request was successful. ")
  public String getRCode() {
    return rCode;
  }

  public void setRCode(String rCode) {
    this.rCode = rCode;
  }

  public TssV2TransactionsGet200ResponseApplicationInformationApplications rFlag(String rFlag) {
    this.rFlag = rFlag;
    return this;
  }

   /**
   * One-word description of the result of the application. 
   * @return rFlag
  **/
  @ApiModelProperty(value = "One-word description of the result of the application. ")
  public String getRFlag() {
    return rFlag;
  }

  public void setRFlag(String rFlag) {
    this.rFlag = rFlag;
  }

  public TssV2TransactionsGet200ResponseApplicationInformationApplications reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Reference number that you use to reconcile your CyberSource reports with your processor reports. 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Reference number that you use to reconcile your CyberSource reports with your processor reports. ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public TssV2TransactionsGet200ResponseApplicationInformationApplications rMessage(String rMessage) {
    this.rMessage = rMessage;
    return this;
  }

   /**
   * Message that explains the reply flag for the application. 
   * @return rMessage
  **/
  @ApiModelProperty(value = "Message that explains the reply flag for the application. ")
  public String getRMessage() {
    return rMessage;
  }

  public void setRMessage(String rMessage) {
    this.rMessage = rMessage;
  }

  public TssV2TransactionsGet200ResponseApplicationInformationApplications returnCode(Integer returnCode) {
    this.returnCode = returnCode;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return returnCode
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public Integer getReturnCode() {
    return returnCode;
  }

  public void setReturnCode(Integer returnCode) {
    this.returnCode = returnCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseApplicationInformationApplications tssV2TransactionsGet200ResponseApplicationInformationApplications = (TssV2TransactionsGet200ResponseApplicationInformationApplications) o;
    return Objects.equals(this.name, tssV2TransactionsGet200ResponseApplicationInformationApplications.name) &&
        Objects.equals(this.status, tssV2TransactionsGet200ResponseApplicationInformationApplications.status) &&
        Objects.equals(this.reasonCode, tssV2TransactionsGet200ResponseApplicationInformationApplications.reasonCode) &&
        Objects.equals(this.rCode, tssV2TransactionsGet200ResponseApplicationInformationApplications.rCode) &&
        Objects.equals(this.rFlag, tssV2TransactionsGet200ResponseApplicationInformationApplications.rFlag) &&
        Objects.equals(this.reconciliationId, tssV2TransactionsGet200ResponseApplicationInformationApplications.reconciliationId) &&
        Objects.equals(this.rMessage, tssV2TransactionsGet200ResponseApplicationInformationApplications.rMessage) &&
        Objects.equals(this.returnCode, tssV2TransactionsGet200ResponseApplicationInformationApplications.returnCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, reasonCode, rCode, rFlag, reconciliationId, rMessage, returnCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseApplicationInformationApplications {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    rCode: ").append(toIndentedString(rCode)).append("\n");
    sb.append("    rFlag: ").append(toIndentedString(rFlag)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    rMessage: ").append(toIndentedString(rMessage)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
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

