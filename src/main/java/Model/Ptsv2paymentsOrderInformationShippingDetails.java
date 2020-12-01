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
 * Contains shipping information not related to address.
 */
@ApiModel(description = "Contains shipping information not related to address.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-22T14:46:25.834+05:30")
public class Ptsv2paymentsOrderInformationShippingDetails {
  @SerializedName("giftWrap")
  private Boolean giftWrap = null;

  @SerializedName("shippingMethod")
  private String shippingMethod = null;

  @SerializedName("shipFromPostalCode")
  private String shipFromPostalCode = null;

  public Ptsv2paymentsOrderInformationShippingDetails giftWrap(Boolean giftWrap) {
    this.giftWrap = giftWrap;
    return this;
  }

   /**
   * Boolean that indicates whether the customer requested gift wrapping for this purchase. This field can contain one of the following values: - true: The customer requested gift wrapping. - false: The customer did not request gift wrapping. 
   * @return giftWrap
  **/
  @ApiModelProperty(value = "Boolean that indicates whether the customer requested gift wrapping for this purchase. This field can contain one of the following values: - true: The customer requested gift wrapping. - false: The customer did not request gift wrapping. ")
  public Boolean getGiftWrap() {
    return giftWrap;
  }

  public void setGiftWrap(Boolean giftWrap) {
    this.giftWrap = giftWrap;
  }

  public Ptsv2paymentsOrderInformationShippingDetails shippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    return this;
  }

   /**
   * Shipping method for the product. Possible values:   - &#x60;lowcost&#x60;: Lowest-cost service  - &#x60;sameday&#x60;: Courier or same-day service  - &#x60;oneday&#x60;: Next-day or overnight service  - &#x60;twoday&#x60;: Two-day service  - &#x60;threeday&#x60;: Three-day service  - &#x60;pickup&#x60;: Store pick-up  - &#x60;other&#x60;: Other shipping method  - &#x60;none&#x60;: No shipping method because product is a service or subscription 
   * @return shippingMethod
  **/
  @ApiModelProperty(value = "Shipping method for the product. Possible values:   - `lowcost`: Lowest-cost service  - `sameday`: Courier or same-day service  - `oneday`: Next-day or overnight service  - `twoday`: Two-day service  - `threeday`: Three-day service  - `pickup`: Store pick-up  - `other`: Other shipping method  - `none`: No shipping method because product is a service or subscription ")
  public String getShippingMethod() {
    return shippingMethod;
  }

  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }

  public Ptsv2paymentsOrderInformationShippingDetails shipFromPostalCode(String shipFromPostalCode) {
    this.shipFromPostalCode = shipFromPostalCode;
    return this;
  }

   /**
   * Postal code for the address from which the goods are shipped, which is used to establish nexus. The default is the postal code associated with your CyberSource account.  The postal code must consist of 5 to 9 digits. When the billing country is the U.S., the 9-digit postal code must follow this format:  &#x60;[5 digits][dash][4 digits]&#x60;  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format:  &#x60;[alpha][numeric][alpha][space] [numeric][alpha][numeric]&#x60;  Example A1B 2C3  This field is frequently used for Level II and Level III transactions. 
   * @return shipFromPostalCode
  **/
  @ApiModelProperty(value = "Postal code for the address from which the goods are shipped, which is used to establish nexus. The default is the postal code associated with your CyberSource account.  The postal code must consist of 5 to 9 digits. When the billing country is the U.S., the 9-digit postal code must follow this format:  `[5 digits][dash][4 digits]`  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format:  `[alpha][numeric][alpha][space] [numeric][alpha][numeric]`  Example A1B 2C3  This field is frequently used for Level II and Level III transactions. ")
  public String getShipFromPostalCode() {
    return shipFromPostalCode;
  }

  public void setShipFromPostalCode(String shipFromPostalCode) {
    this.shipFromPostalCode = shipFromPostalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsOrderInformationShippingDetails ptsv2paymentsOrderInformationShippingDetails = (Ptsv2paymentsOrderInformationShippingDetails) o;
    return Objects.equals(this.giftWrap, ptsv2paymentsOrderInformationShippingDetails.giftWrap) &&
        Objects.equals(this.shippingMethod, ptsv2paymentsOrderInformationShippingDetails.shippingMethod) &&
        Objects.equals(this.shipFromPostalCode, ptsv2paymentsOrderInformationShippingDetails.shipFromPostalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftWrap, shippingMethod, shipFromPostalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsOrderInformationShippingDetails {\n");
    
    sb.append("    giftWrap: ").append(toIndentedString(giftWrap)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("    shipFromPostalCode: ").append(toIndentedString(shipFromPostalCode)).append("\n");
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

