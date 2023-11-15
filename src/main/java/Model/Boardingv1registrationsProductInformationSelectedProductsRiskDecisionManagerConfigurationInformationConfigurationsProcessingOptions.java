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
 * Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsProcessingOptions
 */

public class Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsProcessingOptions {
  @SerializedName("stepUpAuthEnabled")
  private Boolean stepUpAuthEnabled = null;

  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsProcessingOptions stepUpAuthEnabled(Boolean stepUpAuthEnabled) {
    this.stepUpAuthEnabled = stepUpAuthEnabled;
    return this;
  }

   /**
   * Get stepUpAuthEnabled
   * @return stepUpAuthEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean getStepUpAuthEnabled() {
    return stepUpAuthEnabled;
  }

  public void setStepUpAuthEnabled(Boolean stepUpAuthEnabled) {
    this.stepUpAuthEnabled = stepUpAuthEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsProcessingOptions boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsProcessingOptions = (Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsProcessingOptions) o;
    return Objects.equals(this.stepUpAuthEnabled, boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsProcessingOptions.stepUpAuthEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepUpAuthEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsProcessingOptions {\n");
    
    sb.append("    stepUpAuthEnabled: ").append(toIndentedString(stepUpAuthEnabled)).append("\n");
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

