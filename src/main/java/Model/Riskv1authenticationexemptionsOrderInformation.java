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
import Model.Riskv1authenticationexemptionsOrderInformationBillTo;
import Model.Riskv1authenticationexemptionsOrderInformationLineItems;
import Model.Riskv1authenticationexemptionsOrderInformationShipTo;
import Model.Riskv1decisionsOrderInformationAmountDetails;
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
 * Riskv1authenticationexemptionsOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-12T15:59:24.815+05:30")
public class Riskv1authenticationexemptionsOrderInformation {
  @SerializedName("amountDetails")
  private Riskv1decisionsOrderInformationAmountDetails amountDetails = null;

  @SerializedName("shipTo")
  private Riskv1authenticationexemptionsOrderInformationShipTo shipTo = null;

  @SerializedName("lineItems")
  private List<Riskv1authenticationexemptionsOrderInformationLineItems> lineItems = null;

  @SerializedName("billTo")
  private Riskv1authenticationexemptionsOrderInformationBillTo billTo = null;

  public Riskv1authenticationexemptionsOrderInformation amountDetails(Riskv1decisionsOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(Riskv1decisionsOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public Riskv1authenticationexemptionsOrderInformation shipTo(Riskv1authenticationexemptionsOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationexemptionsOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(Riskv1authenticationexemptionsOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public Riskv1authenticationexemptionsOrderInformation lineItems(List<Riskv1authenticationexemptionsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Riskv1authenticationexemptionsOrderInformation addLineItemsItem(Riskv1authenticationexemptionsOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<Riskv1authenticationexemptionsOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<Riskv1authenticationexemptionsOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<Riskv1authenticationexemptionsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }

  public Riskv1authenticationexemptionsOrderInformation billTo(Riskv1authenticationexemptionsOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationexemptionsOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(Riskv1authenticationexemptionsOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationexemptionsOrderInformation riskv1authenticationexemptionsOrderInformation = (Riskv1authenticationexemptionsOrderInformation) o;
    return Objects.equals(this.amountDetails, riskv1authenticationexemptionsOrderInformation.amountDetails) &&
        Objects.equals(this.shipTo, riskv1authenticationexemptionsOrderInformation.shipTo) &&
        Objects.equals(this.lineItems, riskv1authenticationexemptionsOrderInformation.lineItems) &&
        Objects.equals(this.billTo, riskv1authenticationexemptionsOrderInformation.billTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, shipTo, lineItems, billTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationexemptionsOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
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

