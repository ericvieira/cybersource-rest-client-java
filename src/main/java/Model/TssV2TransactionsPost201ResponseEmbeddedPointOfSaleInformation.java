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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-12T15:59:24.815+05:30")
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
   * Identifier for the terminal at your retail location. You can define this value yourself, but consult the processor for requirements.  #### FDC Nashville Global To have your account configured to support this field, contact CyberSource Customer Support. This value must be a value that FDC Nashville Global issued to you.  For details, see the &#x60;terminal_id&#x60; field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/)  **For Payouts**: This field is applicable for CtV. 
   * @return terminalId
  **/
  @ApiModelProperty(value = "Identifier for the terminal at your retail location. You can define this value yourself, but consult the processor for requirements.  #### FDC Nashville Global To have your account configured to support this field, contact CyberSource Customer Support. This value must be a value that FDC Nashville Global issued to you.  For details, see the `terminal_id` field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/)  **For Payouts**: This field is applicable for CtV. ")
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
   * Terminal serial number assigned by the hardware manufacturer. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX.  For details, see the &#x60;terminal_serial_number&#x60; field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/) 
   * @return terminalSerialNumber
  **/
  @ApiModelProperty(value = "Terminal serial number assigned by the hardware manufacturer. This value is provided by the client software that is installed on the POS terminal.  CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only on American Express Direct, FDC Nashville Global, and SIX.  For details, see the `terminal_serial_number` field description in [Card-Present Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/) ")
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
   * Value created by the client software that uniquely identifies the POS device. CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only for specific CyberSource integrations. For details, see the &#x60;pos_device_id&#x60; field description in the [Card-Present Processing Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/) 
   * @return deviceId
  **/
  @ApiModelProperty(value = "Value created by the client software that uniquely identifies the POS device. CyberSource does not forward this value to the processor. Instead, the value is forwarded to the CyberSource reporting functionality.  This field is supported only for specific CyberSource integrations. For details, see the `pos_device_id` field description in the [Card-Present Processing Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/Retail_SCMP_API/html/) ")
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

