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
 * Ptsv2paymentsidreversalsOrderInformationLineItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-07T13:59:51.194+05:30")
public class Ptsv2paymentsidreversalsOrderInformationLineItems {
  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("unitPrice")
  private String unitPrice = null;

  public Ptsv2paymentsidreversalsOrderInformationLineItems quantity(Integer quantity) {
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

  public Ptsv2paymentsidreversalsOrderInformationLineItems unitPrice(String unitPrice) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidreversalsOrderInformationLineItems ptsv2paymentsidreversalsOrderInformationLineItems = (Ptsv2paymentsidreversalsOrderInformationLineItems) o;
    return Objects.equals(this.quantity, ptsv2paymentsidreversalsOrderInformationLineItems.quantity) &&
        Objects.equals(this.unitPrice, ptsv2paymentsidreversalsOrderInformationLineItems.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, unitPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidreversalsOrderInformationLineItems {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

