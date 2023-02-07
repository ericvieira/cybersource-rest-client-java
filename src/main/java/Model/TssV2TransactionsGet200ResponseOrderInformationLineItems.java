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
 * TssV2TransactionsGet200ResponseOrderInformationLineItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class TssV2TransactionsGet200ResponseOrderInformationLineItems {
  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("productName")
  private String productName = null;

  @SerializedName("productSku")
  private String productSku = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("unitPrice")
  private String unitPrice = null;

  @SerializedName("fulfillmentType")
  private String fulfillmentType = null;

  public TssV2TransactionsGet200ResponseOrderInformationLineItems productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Type of product. This value is used to determine the category that the product is in: electronic, handling, physical, service, or shipping. The default value is **default**.  For a payment, when you set this field to a value other than default or any of the values related to shipping and handling, below fields _quantity_, _productName_, and _productSKU_ are required. 
   * @return productCode
  **/
  @ApiModelProperty(value = "Type of product. This value is used to determine the category that the product is in: electronic, handling, physical, service, or shipping. The default value is **default**.  For a payment, when you set this field to a value other than default or any of the values related to shipping and handling, below fields _quantity_, _productName_, and _productSKU_ are required. ")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public TssV2TransactionsGet200ResponseOrderInformationLineItems productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * For PAYMENT and CAPTURE API, this field is required when above _productCode_ is not **default** or one of the values related to shipping and handling. 
   * @return productName
  **/
  @ApiModelProperty(value = "For PAYMENT and CAPTURE API, this field is required when above _productCode_ is not **default** or one of the values related to shipping and handling. ")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public TssV2TransactionsGet200ResponseOrderInformationLineItems productSku(String productSku) {
    this.productSku = productSku;
    return this;
  }

   /**
   * Identification code for the product. For Payment and Capture APIs, this field is required when above &#x60;productCode&#x60; is not **default** or one of the values related to shipping and/or handling. 
   * @return productSku
  **/
  @ApiModelProperty(value = "Identification code for the product. For Payment and Capture APIs, this field is required when above `productCode` is not **default** or one of the values related to shipping and/or handling. ")
  public String getProductSku() {
    return productSku;
  }

  public void setProductSku(String productSku) {
    this.productSku = productSku;
  }

  public TssV2TransactionsGet200ResponseOrderInformationLineItems taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:  1. You include each line item in your request.     - 1st line item has &#x60;amount&#x3D;10.00&#x60;, &#x60;quantity&#x3D;1&#x60;, and &#x60;taxAmount&#x3D;0.80&#x60;     - 2nd line item has &#x60;amount&#x3D;20.00&#x60;, &#x60;quantity&#x3D;1&#x60;, and &#x60;taxAmount&#x3D;1.60&#x60; 2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  This field is frequently used for Level II and Level III transactions.  For details, see &#x60;tax_amount&#x60; field description in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:  1. You include each line item in your request.     - 1st line item has `amount=10.00`, `quantity=1`, and `taxAmount=0.80`     - 2nd line item has `amount=20.00`, `quantity=1`, and `taxAmount=1.60` 2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  This field is frequently used for Level II and Level III transactions.  For details, see `tax_amount` field description in [Level II and Level III Processing Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html/) ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  public TssV2TransactionsGet200ResponseOrderInformationLineItems quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * For a payment or capture, this field is required when _productCode_ is not **default** or one of the values related to shipping and handling. 
   * minimum: 1
   * maximum: 999999999
   * @return quantity
  **/
  @ApiModelProperty(value = "For a payment or capture, this field is required when _productCode_ is not **default** or one of the values related to shipping and handling. ")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public TssV2TransactionsGet200ResponseOrderInformationLineItems unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Per-item price of the product. This value cannot be negative. You can include a decimal point (.), but you cannot include any other special characters. CyberSource truncates the amount to the correct number of decimal places.  For processor-specific information, see the amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return unitPrice
  **/
  @ApiModelProperty(value = "Per-item price of the product. This value cannot be negative. You can include a decimal point (.), but you cannot include any other special characters. CyberSource truncates the amount to the correct number of decimal places.  For processor-specific information, see the amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }

  public TssV2TransactionsGet200ResponseOrderInformationLineItems fulfillmentType(String fulfillmentType) {
    this.fulfillmentType = fulfillmentType;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return fulfillmentType
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getFulfillmentType() {
    return fulfillmentType;
  }

  public void setFulfillmentType(String fulfillmentType) {
    this.fulfillmentType = fulfillmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseOrderInformationLineItems tssV2TransactionsGet200ResponseOrderInformationLineItems = (TssV2TransactionsGet200ResponseOrderInformationLineItems) o;
    return Objects.equals(this.productCode, tssV2TransactionsGet200ResponseOrderInformationLineItems.productCode) &&
        Objects.equals(this.productName, tssV2TransactionsGet200ResponseOrderInformationLineItems.productName) &&
        Objects.equals(this.productSku, tssV2TransactionsGet200ResponseOrderInformationLineItems.productSku) &&
        Objects.equals(this.taxAmount, tssV2TransactionsGet200ResponseOrderInformationLineItems.taxAmount) &&
        Objects.equals(this.quantity, tssV2TransactionsGet200ResponseOrderInformationLineItems.quantity) &&
        Objects.equals(this.unitPrice, tssV2TransactionsGet200ResponseOrderInformationLineItems.unitPrice) &&
        Objects.equals(this.fulfillmentType, tssV2TransactionsGet200ResponseOrderInformationLineItems.fulfillmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, productName, productSku, taxAmount, quantity, unitPrice, fulfillmentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseOrderInformationLineItems {\n");
    
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    fulfillmentType: ").append(toIndentedString(fulfillmentType)).append("\n");
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

