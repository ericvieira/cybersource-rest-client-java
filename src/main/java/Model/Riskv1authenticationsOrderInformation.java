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
import Model.Riskv1authenticationsOrderInformationAmountDetails;
import Model.Riskv1authenticationsOrderInformationBillTo;
import Model.Riskv1authenticationsOrderInformationLineItems;
import Model.Riskv1decisionsOrderInformationShipTo;
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
 * Riskv1authenticationsOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-10T13:11:55.460+05:30")
public class Riskv1authenticationsOrderInformation {
  @SerializedName("amountDetails")
  private Riskv1authenticationsOrderInformationAmountDetails amountDetails = null;

  @SerializedName("preOrder")
  private String preOrder = null;

  @SerializedName("preOrderDate")
  private String preOrderDate = null;

  @SerializedName("reordered")
  private Boolean reordered = null;

  @SerializedName("shipTo")
  private Riskv1decisionsOrderInformationShipTo shipTo = null;

  @SerializedName("lineItems")
  private List<Riskv1authenticationsOrderInformationLineItems> lineItems = null;

  @SerializedName("billTo")
  private Riskv1authenticationsOrderInformationBillTo billTo = null;

  @SerializedName("totalOffersCount")
  private String totalOffersCount = null;

  public Riskv1authenticationsOrderInformation amountDetails(Riskv1authenticationsOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(Riskv1authenticationsOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public Riskv1authenticationsOrderInformation preOrder(String preOrder) {
    this.preOrder = preOrder;
    return this;
  }

   /**
   * Indicates whether cardholder is placing an order with a future availability or release date. This field can contain one of these values: - MERCHANDISE_AVAILABLE: Merchandise available - FUTURE_AVAILABILITY: Future availability 
   * @return preOrder
  **/
  @ApiModelProperty(value = "Indicates whether cardholder is placing an order with a future availability or release date. This field can contain one of these values: - MERCHANDISE_AVAILABLE: Merchandise available - FUTURE_AVAILABILITY: Future availability ")
  public String getPreOrder() {
    return preOrder;
  }

  public void setPreOrder(String preOrder) {
    this.preOrder = preOrder;
  }

  public Riskv1authenticationsOrderInformation preOrderDate(String preOrderDate) {
    this.preOrderDate = preOrderDate;
    return this;
  }

   /**
   * Expected date that a pre-ordered purchase will be available. Format: YYYYMMDD 
   * @return preOrderDate
  **/
  @ApiModelProperty(value = "Expected date that a pre-ordered purchase will be available. Format: YYYYMMDD ")
  public String getPreOrderDate() {
    return preOrderDate;
  }

  public void setPreOrderDate(String preOrderDate) {
    this.preOrderDate = preOrderDate;
  }

  public Riskv1authenticationsOrderInformation reordered(Boolean reordered) {
    this.reordered = reordered;
    return this;
  }

   /**
   * Indicates whether the cardholder is reordering previously purchased merchandise. This field can contain one of these values: - false: First time ordered - true: Reordered 
   * @return reordered
  **/
  @ApiModelProperty(value = "Indicates whether the cardholder is reordering previously purchased merchandise. This field can contain one of these values: - false: First time ordered - true: Reordered ")
  public Boolean getReordered() {
    return reordered;
  }

  public void setReordered(Boolean reordered) {
    this.reordered = reordered;
  }

  public Riskv1authenticationsOrderInformation shipTo(Riskv1decisionsOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(Riskv1decisionsOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public Riskv1authenticationsOrderInformation lineItems(List<Riskv1authenticationsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Riskv1authenticationsOrderInformation addLineItemsItem(Riskv1authenticationsOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<Riskv1authenticationsOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * This array contains detailed information about individual products in the order.
   * @return lineItems
  **/
  @ApiModelProperty(value = "This array contains detailed information about individual products in the order.")
  public List<Riskv1authenticationsOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<Riskv1authenticationsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }

  public Riskv1authenticationsOrderInformation billTo(Riskv1authenticationsOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(Riskv1authenticationsOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }

  public Riskv1authenticationsOrderInformation totalOffersCount(String totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
    return this;
  }

   /**
   * Total number of articles/items in the order as a numeric decimal count. Possible values: 00 - 99 
   * @return totalOffersCount
  **/
  @ApiModelProperty(value = "Total number of articles/items in the order as a numeric decimal count. Possible values: 00 - 99 ")
  public String getTotalOffersCount() {
    return totalOffersCount;
  }

  public void setTotalOffersCount(String totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsOrderInformation riskv1authenticationsOrderInformation = (Riskv1authenticationsOrderInformation) o;
    return Objects.equals(this.amountDetails, riskv1authenticationsOrderInformation.amountDetails) &&
        Objects.equals(this.preOrder, riskv1authenticationsOrderInformation.preOrder) &&
        Objects.equals(this.preOrderDate, riskv1authenticationsOrderInformation.preOrderDate) &&
        Objects.equals(this.reordered, riskv1authenticationsOrderInformation.reordered) &&
        Objects.equals(this.shipTo, riskv1authenticationsOrderInformation.shipTo) &&
        Objects.equals(this.lineItems, riskv1authenticationsOrderInformation.lineItems) &&
        Objects.equals(this.billTo, riskv1authenticationsOrderInformation.billTo) &&
        Objects.equals(this.totalOffersCount, riskv1authenticationsOrderInformation.totalOffersCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, preOrder, preOrderDate, reordered, shipTo, lineItems, billTo, totalOffersCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    preOrder: ").append(toIndentedString(preOrder)).append("\n");
    sb.append("    preOrderDate: ").append(toIndentedString(preOrderDate)).append("\n");
    sb.append("    reordered: ").append(toIndentedString(reordered)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    totalOffersCount: ").append(toIndentedString(totalOffersCount)).append("\n");
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

