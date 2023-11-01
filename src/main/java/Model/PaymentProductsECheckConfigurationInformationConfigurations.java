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
import Model.PaymentProductsECheckConfigurationInformationConfigurationsCommon;
import Model.PaymentProductsECheckConfigurationInformationConfigurationsFeatures;
import Model.PaymentProductsECheckConfigurationInformationConfigurationsUnderwriting;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentProductsECheckConfigurationInformationConfigurations
 */

public class PaymentProductsECheckConfigurationInformationConfigurations {
  @SerializedName("common")
  private PaymentProductsECheckConfigurationInformationConfigurationsCommon common = null;

  @SerializedName("underwriting")
  private PaymentProductsECheckConfigurationInformationConfigurationsUnderwriting underwriting = null;

  @SerializedName("features")
  private PaymentProductsECheckConfigurationInformationConfigurationsFeatures features = null;

  public PaymentProductsECheckConfigurationInformationConfigurations common(PaymentProductsECheckConfigurationInformationConfigurationsCommon common) {
    this.common = common;
    return this;
  }

   /**
   * Get common
   * @return common
  **/
  @ApiModelProperty(value = "")
  public PaymentProductsECheckConfigurationInformationConfigurationsCommon getCommon() {
    return common;
  }

  public void setCommon(PaymentProductsECheckConfigurationInformationConfigurationsCommon common) {
    this.common = common;
  }

  public PaymentProductsECheckConfigurationInformationConfigurations underwriting(PaymentProductsECheckConfigurationInformationConfigurationsUnderwriting underwriting) {
    this.underwriting = underwriting;
    return this;
  }

   /**
   * Get underwriting
   * @return underwriting
  **/
  @ApiModelProperty(value = "")
  public PaymentProductsECheckConfigurationInformationConfigurationsUnderwriting getUnderwriting() {
    return underwriting;
  }

  public void setUnderwriting(PaymentProductsECheckConfigurationInformationConfigurationsUnderwriting underwriting) {
    this.underwriting = underwriting;
  }

  public PaymentProductsECheckConfigurationInformationConfigurations features(PaymentProductsECheckConfigurationInformationConfigurationsFeatures features) {
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public PaymentProductsECheckConfigurationInformationConfigurationsFeatures getFeatures() {
    return features;
  }

  public void setFeatures(PaymentProductsECheckConfigurationInformationConfigurationsFeatures features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProductsECheckConfigurationInformationConfigurations paymentProductsECheckConfigurationInformationConfigurations = (PaymentProductsECheckConfigurationInformationConfigurations) o;
    return Objects.equals(this.common, paymentProductsECheckConfigurationInformationConfigurations.common) &&
        Objects.equals(this.underwriting, paymentProductsECheckConfigurationInformationConfigurations.underwriting) &&
        Objects.equals(this.features, paymentProductsECheckConfigurationInformationConfigurations.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(common, underwriting, features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProductsECheckConfigurationInformationConfigurations {\n");
    
    sb.append("    common: ").append(toIndentedString(common)).append("\n");
    sb.append("    underwriting: ").append(toIndentedString(underwriting)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

