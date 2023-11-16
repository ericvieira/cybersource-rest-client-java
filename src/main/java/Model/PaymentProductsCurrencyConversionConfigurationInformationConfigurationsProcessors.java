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
 * PaymentProductsCurrencyConversionConfigurationInformationConfigurationsProcessors
 */

public class PaymentProductsCurrencyConversionConfigurationInformationConfigurationsProcessors {
  @SerializedName("merchantId")
  private String merchantId = null;

  @SerializedName("acquirerId")
  private String acquirerId = null;

  public PaymentProductsCurrencyConversionConfigurationInformationConfigurationsProcessors merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The merchant identifier for the Currency Conversion service. Check with your Currency Conversion Provider for details.
   * @return merchantId
  **/
  @ApiModelProperty(value = "The merchant identifier for the Currency Conversion service. Check with your Currency Conversion Provider for details.")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public PaymentProductsCurrencyConversionConfigurationInformationConfigurationsProcessors acquirerId(String acquirerId) {
    this.acquirerId = acquirerId;
    return this;
  }

   /**
   * Get acquirerId
   * @return acquirerId
  **/
  @ApiModelProperty(value = "")
  public String getAcquirerId() {
    return acquirerId;
  }

  public void setAcquirerId(String acquirerId) {
    this.acquirerId = acquirerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProductsCurrencyConversionConfigurationInformationConfigurationsProcessors paymentProductsCurrencyConversionConfigurationInformationConfigurationsProcessors = (PaymentProductsCurrencyConversionConfigurationInformationConfigurationsProcessors) o;
    return Objects.equals(this.merchantId, paymentProductsCurrencyConversionConfigurationInformationConfigurationsProcessors.merchantId) &&
        Objects.equals(this.acquirerId, paymentProductsCurrencyConversionConfigurationInformationConfigurationsProcessors.acquirerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, acquirerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProductsCurrencyConversionConfigurationInformationConfigurationsProcessors {\n");
    
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    acquirerId: ").append(toIndentedString(acquirerId)).append("\n");
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

