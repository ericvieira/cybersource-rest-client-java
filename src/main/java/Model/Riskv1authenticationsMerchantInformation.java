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
import Model.Riskv1authenticationsMerchantInformationMerchantDescriptor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1authenticationsMerchantInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-12T15:59:24.815+05:30")
public class Riskv1authenticationsMerchantInformation {
  @SerializedName("merchantDescriptor")
  private Riskv1authenticationsMerchantInformationMerchantDescriptor merchantDescriptor = null;

  @SerializedName("merchantName")
  private String merchantName = null;

  public Riskv1authenticationsMerchantInformation merchantDescriptor(Riskv1authenticationsMerchantInformationMerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
    return this;
  }

   /**
   * Get merchantDescriptor
   * @return merchantDescriptor
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsMerchantInformationMerchantDescriptor getMerchantDescriptor() {
    return merchantDescriptor;
  }

  public void setMerchantDescriptor(Riskv1authenticationsMerchantInformationMerchantDescriptor merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
  }

  public Riskv1authenticationsMerchantInformation merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Your company’s name as you want it to appear to the customer in the issuing bank’s authentication form. This value overrides the value specified by your merchant bank. 
   * @return merchantName
  **/
  @ApiModelProperty(value = "Your company’s name as you want it to appear to the customer in the issuing bank’s authentication form. This value overrides the value specified by your merchant bank. ")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsMerchantInformation riskv1authenticationsMerchantInformation = (Riskv1authenticationsMerchantInformation) o;
    return Objects.equals(this.merchantDescriptor, riskv1authenticationsMerchantInformation.merchantDescriptor) &&
        Objects.equals(this.merchantName, riskv1authenticationsMerchantInformation.merchantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantDescriptor, merchantName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsMerchantInformation {\n");
    
    sb.append("    merchantDescriptor: ").append(toIndentedString(merchantDescriptor)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
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

