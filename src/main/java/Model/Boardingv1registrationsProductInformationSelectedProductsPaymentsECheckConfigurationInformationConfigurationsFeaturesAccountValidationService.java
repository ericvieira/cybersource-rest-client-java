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
import Model.Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceInternalOnly;
import Model.Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors;
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
 * Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationService
 */

public class Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationService {
  @SerializedName("internalOnly")
  private Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceInternalOnly internalOnly = null;

  @SerializedName("processors")
  private Map<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors> processors = null;

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationService internalOnly(Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceInternalOnly internalOnly) {
    this.internalOnly = internalOnly;
    return this;
  }

   /**
   * Get internalOnly
   * @return internalOnly
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceInternalOnly getInternalOnly() {
    return internalOnly;
  }

  public void setInternalOnly(Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceInternalOnly internalOnly) {
    this.internalOnly = internalOnly;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationService processors(Map<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors> processors) {
    this.processors = processors;
    return this;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationService putProcessorsItem(String key, Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors processorsItem) {
    if (this.processors == null) {
      this.processors = new HashMap<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors>();
    }
    this.processors.put(key, processorsItem);
    return this;
  }

   /**
   * *NEW* Payment Processing connection used to support eCheck, aka ACH, payment methods. Example * \&quot;bofaach\&quot; * \&quot;wellsfargoach\&quot; 
   * @return processors
  **/
  @ApiModelProperty(value = "*NEW* Payment Processing connection used to support eCheck, aka ACH, payment methods. Example * \"bofaach\" * \"wellsfargoach\" ")
  public Map<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors> getProcessors() {
    return processors;
  }

  public void setProcessors(Map<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors> processors) {
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
    Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationService boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationService = (Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationService) o;
    return Objects.equals(this.internalOnly, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationService.internalOnly) &&
        Objects.equals(this.processors, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationService.processors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalOnly, processors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationService {\n");
    
    sb.append("    internalOnly: ").append(toIndentedString(internalOnly)).append("\n");
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

