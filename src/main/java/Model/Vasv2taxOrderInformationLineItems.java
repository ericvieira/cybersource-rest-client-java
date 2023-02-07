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
import Model.Vasv2taxOrderInformationOrderAcceptance;
import Model.Vasv2taxOrderInformationOrderOrigin;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Vasv2taxOrderInformationLineItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class Vasv2taxOrderInformationLineItems {
  @SerializedName("productSKU")
  private String productSKU = null;

  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("productName")
  private String productName = null;

  @SerializedName("unitPrice")
  private String unitPrice = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  @SerializedName("orderAcceptance")
  private Vasv2taxOrderInformationOrderAcceptance orderAcceptance = null;

  @SerializedName("orderOrigin")
  private Vasv2taxOrderInformationOrderOrigin orderOrigin = null;

  @SerializedName("shipFromCountry")
  private String shipFromCountry = null;

  @SerializedName("shipFromAdministrativeArea")
  private String shipFromAdministrativeArea = null;

  @SerializedName("shipFromLocality")
  private String shipFromLocality = null;

  @SerializedName("shipFromPostalCode")
  private String shipFromPostalCode = null;

  @SerializedName("buyerVatRegistrationNumber")
  private String buyerVatRegistrationNumber = null;

  @SerializedName("sellerVatRegistrationNumber")
  private String sellerVatRegistrationNumber = null;

  public Vasv2taxOrderInformationLineItems productSKU(String productSKU) {
    this.productSKU = productSKU;
    return this;
  }

   /**
   * Product identifier code. Also known as the Stock Keeping Unit (SKU) code for the product.  For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not set to **default** or one of the other values that are related to shipping and/or handling.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not &#x60;default&#x60; or one of the values related to shipping and/or handling. 
   * @return productSKU
  **/
  @ApiModelProperty(value = "Product identifier code. Also known as the Stock Keeping Unit (SKU) code for the product.  For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not set to **default** or one of the other values that are related to shipping and/or handling.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not `default` or one of the values related to shipping and/or handling. ")
  public String getProductSKU() {
    return productSKU;
  }

  public void setProductSKU(String productSKU) {
    this.productSKU = productSKU;
  }

  public Vasv2taxOrderInformationLineItems productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Type of product. The value for this field is used to identify the product category (electronic, handling, physical, service, or shipping). The default value is &#x60;default&#x60;.  If you are performing an authorization transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;false&#x60;), and you set this field to a value other than &#x60;default&#x60; or one of the values related to shipping and/or handling, then &#x60;orderInformation.lineItems[].quantity&#x60;, &#x60;orderInformation.lineItems[].productName&#x60;, and &#x60;orderInformation.lineItems[].productSku&#x60; fields are required.  Optional field.  For details, see the &#x60;product_code&#x60; field description in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/).  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes.  To use the tax calculation service, use values listed in the Tax Product Code Guide. For information about this document, contact customer support. See \&quot;Product Codes,\&quot; page 14, for more information. 
   * @return productCode
  **/
  @ApiModelProperty(value = "Type of product. The value for this field is used to identify the product category (electronic, handling, physical, service, or shipping). The default value is `default`.  If you are performing an authorization transaction (`processingOptions.capture` is set to `false`), and you set this field to a value other than `default` or one of the values related to shipping and/or handling, then `orderInformation.lineItems[].quantity`, `orderInformation.lineItems[].productName`, and `orderInformation.lineItems[].productSku` fields are required.  Optional field.  For details, see the `product_code` field description in the [Credit Card Services Using the SCMP API Guide](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/).  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes.  To use the tax calculation service, use values listed in the Tax Product Code Guide. For information about this document, contact customer support. See \"Product Codes,\" page 14, for more information. ")
  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public Vasv2taxOrderInformationLineItems quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of units for this order. Must be a non-negative integer.  The default is &#x60;1&#x60;. For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not &#x60;default&#x60; or one of the other values related to shipping and/or handling.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. 
   * minimum: 1
   * maximum: 999999999
   * @return quantity
  **/
  @ApiModelProperty(value = "Number of units for this order. Must be a non-negative integer.  The default is `1`. For an authorization or capture transaction (`processingOptions.capture` is set to `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not `default` or one of the other values related to shipping and/or handling.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. ")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Vasv2taxOrderInformationLineItems productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not &#x60;default&#x60; or one of the other values that are related to shipping and/or handling.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. 
   * @return productName
  **/
  @ApiModelProperty(value = "For an authorization or capture transaction (`processingOptions.capture` is `true` or `false`), this field is required when `orderInformation.lineItems[].productCode` is not `default` or one of the other values that are related to shipping and/or handling.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. ")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Vasv2taxOrderInformationLineItems unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Per-item price of the product. This value for this field cannot be negative.  You must include either this field or the request-level field &#x60;orderInformation.amountDetails.totalAmount&#x60; in your request.  You can include a decimal point (.), but you cannot include any other special characters. The value is truncated to the correct number of decimal places.  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either the 1st line item in the order and this field, or the request-level field &#x60;orderInformation.amountDetails.totalAmount&#x60; in your request.  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in the [Merchant Descriptors Using the SCMP API Guide.] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### Tax Calculation Required field for U.S., Canadian, international and value added taxes.  #### Zero Amount Authorizations If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen.  #### Maximum Field Lengths For GPN and JCN Gateway: Decimal (10) All other processors: Decimal (15) 
   * @return unitPrice
  **/
  @ApiModelProperty(value = "Per-item price of the product. This value for this field cannot be negative.  You must include either this field or the request-level field `orderInformation.amountDetails.totalAmount` in your request.  You can include a decimal point (.), but you cannot include any other special characters. The value is truncated to the correct number of decimal places.  #### DCC with a Third-Party Provider Set this field to the converted amount that was returned by the DCC provider. You must include either the 1st line item in the order and this field, or the request-level field `orderInformation.amountDetails.totalAmount` in your request.  #### FDMS South If you accept IDR or CLP currencies, see the entry for FDMS South in the [Merchant Descriptors Using the SCMP API Guide.] (https://apps.cybersource.com/library/documentation/dev_guides/Merchant_Descriptors_SCMP_API/html/)  #### Tax Calculation Required field for U.S., Canadian, international and value added taxes.  #### Zero Amount Authorizations If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen.  #### Maximum Field Lengths For GPN and JCN Gateway: Decimal (10) All other processors: Decimal (15) ")
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Vasv2taxOrderInformationLineItems taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:   1. You include each line item in your request.  ..- 1st line item has amount&#x3D;10.00, quantity&#x3D;1, and taxAmount&#x3D;0.80  ..- 2nd line item has amount&#x3D;20.00, quantity&#x3D;1, and taxAmount&#x3D;1.60  2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  Optional field.  #### Airlines processing Tax portion of the order amount. This value cannot exceed 99999999999999 (fourteen 9s). Format: English characters only. Optional request field for a line item.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes.  Note if you send this field in your tax request, the value in the field will override the tax engine 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:   1. You include each line item in your request.  ..- 1st line item has amount=10.00, quantity=1, and taxAmount=0.80  ..- 2nd line item has amount=20.00, quantity=1, and taxAmount=1.60  2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  Optional field.  #### Airlines processing Tax portion of the order amount. This value cannot exceed 99999999999999 (fourteen 9s). Format: English characters only. Optional request field for a line item.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes.  Note if you send this field in your tax request, the value in the field will override the tax engine ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  public Vasv2taxOrderInformationLineItems orderAcceptance(Vasv2taxOrderInformationOrderAcceptance orderAcceptance) {
    this.orderAcceptance = orderAcceptance;
    return this;
  }

   /**
   * Get orderAcceptance
   * @return orderAcceptance
  **/
  @ApiModelProperty(value = "")
  public Vasv2taxOrderInformationOrderAcceptance getOrderAcceptance() {
    return orderAcceptance;
  }

  public void setOrderAcceptance(Vasv2taxOrderInformationOrderAcceptance orderAcceptance) {
    this.orderAcceptance = orderAcceptance;
  }

  public Vasv2taxOrderInformationLineItems orderOrigin(Vasv2taxOrderInformationOrderOrigin orderOrigin) {
    this.orderOrigin = orderOrigin;
    return this;
  }

   /**
   * Get orderOrigin
   * @return orderOrigin
  **/
  @ApiModelProperty(value = "")
  public Vasv2taxOrderInformationOrderOrigin getOrderOrigin() {
    return orderOrigin;
  }

  public void setOrderOrigin(Vasv2taxOrderInformationOrderOrigin orderOrigin) {
    this.orderOrigin = orderOrigin;
  }

  public Vasv2taxOrderInformationLineItems shipFromCountry(String shipFromCountry) {
    this.shipFromCountry = shipFromCountry;
    return this;
  }

   /**
   * Country from which the order is shipped. This field is used only when &#x60;orderInformation.shippingDetails.shipFromLocality&#x60; and &#x60;orderInformation.shippingDetails.shipFromAdministrativeArea&#x60; are present. Use the [ISO Standard Country Codes](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf).  **NOTE** If this field appears in a &#x60;lineItems&#x60; object, then the value of this field in the &#x60;lineItems&#x60; object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation This field is used to determine tax rules and/ or rates applied to the transaction based on sourcing.  Optional for U.S., Canadian, international tax, and value added taxes. 
   * @return shipFromCountry
  **/
  @ApiModelProperty(value = "Country from which the order is shipped. This field is used only when `orderInformation.shippingDetails.shipFromLocality` and `orderInformation.shippingDetails.shipFromAdministrativeArea` are present. Use the [ISO Standard Country Codes](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf).  **NOTE** If this field appears in a `lineItems` object, then the value of this field in the `lineItems` object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation This field is used to determine tax rules and/ or rates applied to the transaction based on sourcing.  Optional for U.S., Canadian, international tax, and value added taxes. ")
  public String getShipFromCountry() {
    return shipFromCountry;
  }

  public void setShipFromCountry(String shipFromCountry) {
    this.shipFromCountry = shipFromCountry;
  }

  public Vasv2taxOrderInformationLineItems shipFromAdministrativeArea(String shipFromAdministrativeArea) {
    this.shipFromAdministrativeArea = shipFromAdministrativeArea;
    return this;
  }

   /**
   * State from which the order is shipped. This field is used only when &#x60;orderInformation.shippingDetails.shipFromLocality&#x60; and &#x60;orderInformation.shippingDetails.shipFromCountry&#x60; are present. Use the [State, Province, and Territory Codes for the United States and Canada](http://apps.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  **NOTE** If this field appears in a &#x60;lineItems&#x60; object, then the value of this field in the &#x60;lineItems&#x60; object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation This field is used to determine tax rules and/or rates applied to the transaction based on sourcing.  Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. 
   * @return shipFromAdministrativeArea
  **/
  @ApiModelProperty(value = "State from which the order is shipped. This field is used only when `orderInformation.shippingDetails.shipFromLocality` and `orderInformation.shippingDetails.shipFromCountry` are present. Use the [State, Province, and Territory Codes for the United States and Canada](http://apps.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  **NOTE** If this field appears in a `lineItems` object, then the value of this field in the `lineItems` object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation This field is used to determine tax rules and/or rates applied to the transaction based on sourcing.  Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. ")
  public String getShipFromAdministrativeArea() {
    return shipFromAdministrativeArea;
  }

  public void setShipFromAdministrativeArea(String shipFromAdministrativeArea) {
    this.shipFromAdministrativeArea = shipFromAdministrativeArea;
  }

  public Vasv2taxOrderInformationLineItems shipFromLocality(String shipFromLocality) {
    this.shipFromLocality = shipFromLocality;
    return this;
  }

   /**
   * City where the product is shipped from. This field is used only when the &#x60;orderInformation.shipTo.administrativeArea&#x60; and &#x60;orderInformation.shipTo.country&#x60; fields are present.  **NOTE** If this field appears in a &#x60;lineItems&#x60; object, then the value of this field in the &#x60;lineItems&#x60; object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation This field is used to determine tax rules and/or rates applied to the transaction based on sourcing.  Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. 
   * @return shipFromLocality
  **/
  @ApiModelProperty(value = "City where the product is shipped from. This field is used only when the `orderInformation.shipTo.administrativeArea` and `orderInformation.shipTo.country` fields are present.  **NOTE** If this field appears in a `lineItems` object, then the value of this field in the `lineItems` object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation This field is used to determine tax rules and/or rates applied to the transaction based on sourcing.  Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. ")
  public String getShipFromLocality() {
    return shipFromLocality;
  }

  public void setShipFromLocality(String shipFromLocality) {
    this.shipFromLocality = shipFromLocality;
  }

  public Vasv2taxOrderInformationLineItems shipFromPostalCode(String shipFromPostalCode) {
    this.shipFromPostalCode = shipFromPostalCode;
    return this;
  }

   /**
   * Postal code where the product is shipped from.  #### Tax Calculation This field is used to determine tax rules and/or rates applied to the transaction based on sourcing.  Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. 
   * @return shipFromPostalCode
  **/
  @ApiModelProperty(value = "Postal code where the product is shipped from.  #### Tax Calculation This field is used to determine tax rules and/or rates applied to the transaction based on sourcing.  Optional for U.S. and Canadian taxes. Not applicable to international and value added taxes. ")
  public String getShipFromPostalCode() {
    return shipFromPostalCode;
  }

  public void setShipFromPostalCode(String shipFromPostalCode) {
    this.shipFromPostalCode = shipFromPostalCode;
  }

  public Vasv2taxOrderInformationLineItems buyerVatRegistrationNumber(String buyerVatRegistrationNumber) {
    this.buyerVatRegistrationNumber = buyerVatRegistrationNumber;
    return this;
  }

   /**
   * Buyer’s VAT registration number.  **NOTE** If this field appears in a &#x60;lineItems&#x60; object, then the value of this field in the &#x60;lineItems&#x60; object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation Optional field for international and value added taxes only. Not applicable to U.S. and Canadian taxes. 
   * @return buyerVatRegistrationNumber
  **/
  @ApiModelProperty(value = "Buyer’s VAT registration number.  **NOTE** If this field appears in a `lineItems` object, then the value of this field in the `lineItems` object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation Optional field for international and value added taxes only. Not applicable to U.S. and Canadian taxes. ")
  public String getBuyerVatRegistrationNumber() {
    return buyerVatRegistrationNumber;
  }

  public void setBuyerVatRegistrationNumber(String buyerVatRegistrationNumber) {
    this.buyerVatRegistrationNumber = buyerVatRegistrationNumber;
  }

  public Vasv2taxOrderInformationLineItems sellerVatRegistrationNumber(String sellerVatRegistrationNumber) {
    this.sellerVatRegistrationNumber = sellerVatRegistrationNumber;
    return this;
  }

   /**
   * VAT seller registration number.  For details, see \&quot;International Taxes and Value-Added Tax (VAT)\&quot; in [Tax Calculation Service Using the SCMP API](https://apps.cybersource.com/library/documentation/dev_guides/Tax_SCMP_API/html/).  **NOTE** If this field appears in a &#x60;lineItems&#x60; object, then the value of this field in the &#x60;lineItems&#x60; object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation Optional field for international and value added taxes only. Not applicable to U.S. and Canadian taxes. 
   * @return sellerVatRegistrationNumber
  **/
  @ApiModelProperty(value = "VAT seller registration number.  For details, see \"International Taxes and Value-Added Tax (VAT)\" in [Tax Calculation Service Using the SCMP API](https://apps.cybersource.com/library/documentation/dev_guides/Tax_SCMP_API/html/).  **NOTE** If this field appears in a `lineItems` object, then the value of this field in the `lineItems` object overrides the value of the corresponding field at the request-level or order-level object.  #### Tax Calculation Optional field for international and value added taxes only. Not applicable to U.S. and Canadian taxes. ")
  public String getSellerVatRegistrationNumber() {
    return sellerVatRegistrationNumber;
  }

  public void setSellerVatRegistrationNumber(String sellerVatRegistrationNumber) {
    this.sellerVatRegistrationNumber = sellerVatRegistrationNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vasv2taxOrderInformationLineItems vasv2taxOrderInformationLineItems = (Vasv2taxOrderInformationLineItems) o;
    return Objects.equals(this.productSKU, vasv2taxOrderInformationLineItems.productSKU) &&
        Objects.equals(this.productCode, vasv2taxOrderInformationLineItems.productCode) &&
        Objects.equals(this.quantity, vasv2taxOrderInformationLineItems.quantity) &&
        Objects.equals(this.productName, vasv2taxOrderInformationLineItems.productName) &&
        Objects.equals(this.unitPrice, vasv2taxOrderInformationLineItems.unitPrice) &&
        Objects.equals(this.taxAmount, vasv2taxOrderInformationLineItems.taxAmount) &&
        Objects.equals(this.orderAcceptance, vasv2taxOrderInformationLineItems.orderAcceptance) &&
        Objects.equals(this.orderOrigin, vasv2taxOrderInformationLineItems.orderOrigin) &&
        Objects.equals(this.shipFromCountry, vasv2taxOrderInformationLineItems.shipFromCountry) &&
        Objects.equals(this.shipFromAdministrativeArea, vasv2taxOrderInformationLineItems.shipFromAdministrativeArea) &&
        Objects.equals(this.shipFromLocality, vasv2taxOrderInformationLineItems.shipFromLocality) &&
        Objects.equals(this.shipFromPostalCode, vasv2taxOrderInformationLineItems.shipFromPostalCode) &&
        Objects.equals(this.buyerVatRegistrationNumber, vasv2taxOrderInformationLineItems.buyerVatRegistrationNumber) &&
        Objects.equals(this.sellerVatRegistrationNumber, vasv2taxOrderInformationLineItems.sellerVatRegistrationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productSKU, productCode, quantity, productName, unitPrice, taxAmount, orderAcceptance, orderOrigin, shipFromCountry, shipFromAdministrativeArea, shipFromLocality, shipFromPostalCode, buyerVatRegistrationNumber, sellerVatRegistrationNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vasv2taxOrderInformationLineItems {\n");
    
    sb.append("    productSKU: ").append(toIndentedString(productSKU)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    orderAcceptance: ").append(toIndentedString(orderAcceptance)).append("\n");
    sb.append("    orderOrigin: ").append(toIndentedString(orderOrigin)).append("\n");
    sb.append("    shipFromCountry: ").append(toIndentedString(shipFromCountry)).append("\n");
    sb.append("    shipFromAdministrativeArea: ").append(toIndentedString(shipFromAdministrativeArea)).append("\n");
    sb.append("    shipFromLocality: ").append(toIndentedString(shipFromLocality)).append("\n");
    sb.append("    shipFromPostalCode: ").append(toIndentedString(shipFromPostalCode)).append("\n");
    sb.append("    buyerVatRegistrationNumber: ").append(toIndentedString(buyerVatRegistrationNumber)).append("\n");
    sb.append("    sellerVatRegistrationNumber: ").append(toIndentedString(sellerVatRegistrationNumber)).append("\n");
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

