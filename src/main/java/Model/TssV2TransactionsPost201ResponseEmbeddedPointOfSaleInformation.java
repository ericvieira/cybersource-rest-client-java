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
import Model.TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformationPartner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-22T14:46:25.834+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation {
  @SerializedName("terminalId")
  private String terminalId = null;

  @SerializedName("terminalSerialNumber")
  private String terminalSerialNumber = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("partner")
  private TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformationPartner partner = null;

  public TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Identifier for the terminal at your retail location. You can define this value yourself, but consult the processor for requirements.  #### CyberSource through VisaNet A list of all possible values is stored in your CyberSource account. If terminal ID validation is enabled for your CyberSource account, the value you send for this field is validated against the list each time you include the field in a request. To enable or disable terminal ID validation, contact CyberSource Customer Support.  When you do not include this field in a request, CyberSource uses the default value that is defined in your CyberSource account.  #### FDC Nashville Global To have your account configured to support this field, contact CyberSource Customer Support. This value must be a value that FDC Nashville Global issued to you.  #### For Payouts This field is applicable for CyberSource through VisaNet.  #### GPX Identifier for the terminal at your retail location. A list of all possible values is stored in your account. If terminal ID validation is enabled for your account, the value you send for this field is validated against the list each time you include the field in a request. To enable or disable terminal ID validation, contact customer support.  When you do not include this field in a request, the default value that is defined in your account is used.  Optional for authorizations.  #### Used by **Authorization** Optional for the following processors. When you do not include this field in a request, the default value that is defined in your account is used.   - American Express Direct   - Credit Mutuel-CIC   - FDC Nashville Global   - SIX - Chase Paymentech Solutions: Optional field. If you include this field in your request, you must also include &#x60;pointOfSaleInformation.catLevel&#x60;. - FDMS Nashville: The default value that is defined in your account is used. - GPX - OmniPay Direct: Optional field.  For the following processors, this field is not used. - GPN - JCN Gateway - RBS WorldPay Atlanta - TSYS Acquiring Solutions - Worldpay VAP  #### Card Present reply Terminal identifier assigned by the acquirer. This value must be printed on the receipt. 
   * @return terminalId
  **/
  @ApiModelProperty(value = "Identifier for the terminal at your retail location. You can define this value yourself, but consult the processor for requirements.  #### CyberSource through VisaNet A list of all possible values is stored in your CyberSource account. If terminal ID validation is enabled for your CyberSource account, the value you send for this field is validated against the list each time you include the field in a request. To enable or disable terminal ID validation, contact CyberSource Customer Support.  When you do not include this field in a request, CyberSource uses the default value that is defined in your CyberSource account.  #### FDC Nashville Global To have your account configured to support this field, contact CyberSource Customer Support. This value must be a value that FDC Nashville Global issued to you.  #### For Payouts This field is applicable for CyberSource through VisaNet.  #### GPX Identifier for the terminal at your retail location. A list of all possible values is stored in your account. If terminal ID validation is enabled for your account, the value you send for this field is validated against the list each time you include the field in a request. To enable or disable terminal ID validation, contact customer support.  When you do not include this field in a request, the default value that is defined in your account is used.  Optional for authorizations.  #### Used by **Authorization** Optional for the following processors. When you do not include this field in a request, the default value that is defined in your account is used.   - American Express Direct   - Credit Mutuel-CIC   - FDC Nashville Global   - SIX - Chase Paymentech Solutions: Optional field. If you include this field in your request, you must also include `pointOfSaleInformation.catLevel`. - FDMS Nashville: The default value that is defined in your account is used. - GPX - OmniPay Direct: Optional field.  For the following processors, this field is not used. - GPN - JCN Gateway - RBS WorldPay Atlanta - TSYS Acquiring Solutions - Worldpay VAP  #### Card Present reply Terminal identifier assigned by the acquirer. This value must be printed on the receipt. ")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation terminalSerialNumber(String terminalSerialNumber) {
    this.terminalSerialNumber = terminalSerialNumber;
    return this;
  }

   /**
   * Terminal serial number assigned by the hardware manufacturer. This value is provided by the client software that is installed on the POS terminal.  This value is not forwarded to the processor. Instead, the value is forwarded to the reporting functionality.  #### Used by **Authorization and Credit** Optional. This field is supported only by client software that is installed on your POS terminals for the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX 
   * @return terminalSerialNumber
  **/
  @ApiModelProperty(value = "Terminal serial number assigned by the hardware manufacturer. This value is provided by the client software that is installed on the POS terminal.  This value is not forwarded to the processor. Instead, the value is forwarded to the reporting functionality.  #### Used by **Authorization and Credit** Optional. This field is supported only by client software that is installed on your POS terminals for the following processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX ")
  public String getTerminalSerialNumber() {
    return terminalSerialNumber;
  }

  public void setTerminalSerialNumber(String terminalSerialNumber) {
    this.terminalSerialNumber = terminalSerialNumber;
  }

  public TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Value created by the client software that uniquely identifies the POS device. CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only for authorizations and credits on these processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX  Optional field. String (32) 
   * @return deviceId
  **/
  @ApiModelProperty(value = "Value created by the client software that uniquely identifies the POS device. CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only for authorizations and credits on these processors: - American Express Direct - Credit Mutuel-CIC - FDC Nashville Global - OmniPay Direct - SIX  Optional field. String (32) ")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation partner(TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformationPartner partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformationPartner getPartner() {
    return partner;
  }

  public void setPartner(TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformationPartner partner) {
    this.partner = partner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation tssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation = (TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation) o;
    return Objects.equals(this.terminalId, tssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation.terminalId) &&
        Objects.equals(this.terminalSerialNumber, tssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation.terminalSerialNumber) &&
        Objects.equals(this.deviceId, tssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation.deviceId) &&
        Objects.equals(this.partner, tssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation.partner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminalId, terminalSerialNumber, deviceId, partner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedPointOfSaleInformation {\n");
    
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    terminalSerialNumber: ").append(toIndentedString(terminalSerialNumber)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
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

