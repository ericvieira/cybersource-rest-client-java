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
import Model.Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurationsProcessors;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurations
 */

public class Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurations {
  @SerializedName("processors")
  private Map<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurationsProcessors> processors = null;

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurations processors(Map<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurationsProcessors> processors) {
    this.processors = processors;
    return this;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurations putProcessorsItem(String key, Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurationsProcessors processorsItem) {
    if (this.processors == null) {
      this.processors = new HashMap<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurationsProcessors>();
    }
    this.processors.put(key, processorsItem);
    return this;
  }

   /**
   * Get processors
   * @return processors
  **/
  @ApiModelProperty(value = "")
  public Map<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurationsProcessors> getProcessors() {
    return processors;
  }

  public void setProcessors(Map<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurationsProcessors> processors) {
    this.processors = processors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurations boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurations = (Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurations) o;
    return Objects.equals(this.processors, boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurations.processors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsProductInformationSelectedProductsPaymentsCurrencyConversionConfigurationInformationConfigurations {\n");
    
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
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

