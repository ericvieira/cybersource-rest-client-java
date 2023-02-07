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
import Model.PtsV2PaymentsCapturesPost201ResponseOrderInformationAmountDetails;
import Model.PtsV2PaymentsCapturesPost201ResponseOrderInformationInvoiceDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsCapturesPost201ResponseOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class PtsV2PaymentsCapturesPost201ResponseOrderInformation {
  @SerializedName("amountDetails")
  private PtsV2PaymentsCapturesPost201ResponseOrderInformationAmountDetails amountDetails = null;

  @SerializedName("invoiceDetails")
  private PtsV2PaymentsCapturesPost201ResponseOrderInformationInvoiceDetails invoiceDetails = null;

  public PtsV2PaymentsCapturesPost201ResponseOrderInformation amountDetails(PtsV2PaymentsCapturesPost201ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsCapturesPost201ResponseOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(PtsV2PaymentsCapturesPost201ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public PtsV2PaymentsCapturesPost201ResponseOrderInformation invoiceDetails(PtsV2PaymentsCapturesPost201ResponseOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
    return this;
  }

   /**
   * Get invoiceDetails
   * @return invoiceDetails
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsCapturesPost201ResponseOrderInformationInvoiceDetails getInvoiceDetails() {
    return invoiceDetails;
  }

  public void setInvoiceDetails(PtsV2PaymentsCapturesPost201ResponseOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsCapturesPost201ResponseOrderInformation ptsV2PaymentsCapturesPost201ResponseOrderInformation = (PtsV2PaymentsCapturesPost201ResponseOrderInformation) o;
    return Objects.equals(this.amountDetails, ptsV2PaymentsCapturesPost201ResponseOrderInformation.amountDetails) &&
        Objects.equals(this.invoiceDetails, ptsV2PaymentsCapturesPost201ResponseOrderInformation.invoiceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, invoiceDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsCapturesPost201ResponseOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
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

