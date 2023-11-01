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
import Model.RiskProductsDecisionManagerConfigurationInformationConfigurations;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * RiskProductsDecisionManagerConfigurationInformation
 */

public class RiskProductsDecisionManagerConfigurationInformation {
  @SerializedName("templateId")
  private UUID templateId = null;

  @SerializedName("configurations")
  private RiskProductsDecisionManagerConfigurationInformationConfigurations configurations = null;

  public RiskProductsDecisionManagerConfigurationInformation templateId(UUID templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @ApiModelProperty(value = "")
  public UUID getTemplateId() {
    return templateId;
  }

  public void setTemplateId(UUID templateId) {
    this.templateId = templateId;
  }

  public RiskProductsDecisionManagerConfigurationInformation configurations(RiskProductsDecisionManagerConfigurationInformationConfigurations configurations) {
    this.configurations = configurations;
    return this;
  }

   /**
   * Get configurations
   * @return configurations
  **/
  @ApiModelProperty(value = "")
  public RiskProductsDecisionManagerConfigurationInformationConfigurations getConfigurations() {
    return configurations;
  }

  public void setConfigurations(RiskProductsDecisionManagerConfigurationInformationConfigurations configurations) {
    this.configurations = configurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskProductsDecisionManagerConfigurationInformation riskProductsDecisionManagerConfigurationInformation = (RiskProductsDecisionManagerConfigurationInformation) o;
    return Objects.equals(this.templateId, riskProductsDecisionManagerConfigurationInformation.templateId) &&
        Objects.equals(this.configurations, riskProductsDecisionManagerConfigurationInformation.configurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, configurations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskProductsDecisionManagerConfigurationInformation {\n");
    
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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

