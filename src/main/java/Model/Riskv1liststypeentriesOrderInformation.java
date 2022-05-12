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
import Model.Riskv1liststypeentriesOrderInformationAddress;
import Model.Riskv1liststypeentriesOrderInformationBillTo;
import Model.Riskv1liststypeentriesOrderInformationLineItems;
import Model.Riskv1liststypeentriesOrderInformationShipTo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Riskv1liststypeentriesOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-12T17:46:06.587+05:30")
public class Riskv1liststypeentriesOrderInformation {
  @SerializedName("address")
  private Riskv1liststypeentriesOrderInformationAddress address = null;

  @SerializedName("billTo")
  private Riskv1liststypeentriesOrderInformationBillTo billTo = null;

  @SerializedName("shipTo")
  private Riskv1liststypeentriesOrderInformationShipTo shipTo = null;

  @SerializedName("lineItems")
  private List<Riskv1liststypeentriesOrderInformationLineItems> lineItems = null;

  public Riskv1liststypeentriesOrderInformation address(Riskv1liststypeentriesOrderInformationAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Riskv1liststypeentriesOrderInformationAddress getAddress() {
    return address;
  }

  public void setAddress(Riskv1liststypeentriesOrderInformationAddress address) {
    this.address = address;
  }

  public Riskv1liststypeentriesOrderInformation billTo(Riskv1liststypeentriesOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public Riskv1liststypeentriesOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(Riskv1liststypeentriesOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }

  public Riskv1liststypeentriesOrderInformation shipTo(Riskv1liststypeentriesOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public Riskv1liststypeentriesOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(Riskv1liststypeentriesOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public Riskv1liststypeentriesOrderInformation lineItems(List<Riskv1liststypeentriesOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Riskv1liststypeentriesOrderInformation addLineItemsItem(Riskv1liststypeentriesOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<Riskv1liststypeentriesOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * This array contains detailed information about individual products in the order.
   * @return lineItems
  **/
  @ApiModelProperty(value = "This array contains detailed information about individual products in the order.")
  public List<Riskv1liststypeentriesOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<Riskv1liststypeentriesOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1liststypeentriesOrderInformation riskv1liststypeentriesOrderInformation = (Riskv1liststypeentriesOrderInformation) o;
    return Objects.equals(this.address, riskv1liststypeentriesOrderInformation.address) &&
        Objects.equals(this.billTo, riskv1liststypeentriesOrderInformation.billTo) &&
        Objects.equals(this.shipTo, riskv1liststypeentriesOrderInformation.shipTo) &&
        Objects.equals(this.lineItems, riskv1liststypeentriesOrderInformation.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, billTo, shipTo, lineItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1liststypeentriesOrderInformation {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
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

