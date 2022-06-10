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
 * invoice Details
 */
@ApiModel(description = "invoice Details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-10T13:11:55.460+05:30")
public class Ptsv2paymentsInvoiceDetails {
  @SerializedName("barcodeNumber")
  private String barcodeNumber = null;

  public Ptsv2paymentsInvoiceDetails barcodeNumber(String barcodeNumber) {
    this.barcodeNumber = barcodeNumber;
    return this;
  }

   /**
   * Barcode ID scanned from the Payment Application.
   * @return barcodeNumber
  **/
  @ApiModelProperty(value = "Barcode ID scanned from the Payment Application.")
  public String getBarcodeNumber() {
    return barcodeNumber;
  }

  public void setBarcodeNumber(String barcodeNumber) {
    this.barcodeNumber = barcodeNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsInvoiceDetails ptsv2paymentsInvoiceDetails = (Ptsv2paymentsInvoiceDetails) o;
    return Objects.equals(this.barcodeNumber, ptsv2paymentsInvoiceDetails.barcodeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsInvoiceDetails {\n");
    
    sb.append("    barcodeNumber: ").append(toIndentedString(barcodeNumber)).append("\n");
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

