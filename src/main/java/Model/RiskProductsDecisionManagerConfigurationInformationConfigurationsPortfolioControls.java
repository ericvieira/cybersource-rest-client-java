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
 * RiskProductsDecisionManagerConfigurationInformationConfigurationsPortfolioControls
 */

public class RiskProductsDecisionManagerConfigurationInformationConfigurationsPortfolioControls {
  @SerializedName("hideRiskMenus")
  private Boolean hideRiskMenus = null;

  @SerializedName("hideRiskTransactionData")
  private Boolean hideRiskTransactionData = null;

  public RiskProductsDecisionManagerConfigurationInformationConfigurationsPortfolioControls hideRiskMenus(Boolean hideRiskMenus) {
    this.hideRiskMenus = hideRiskMenus;
    return this;
  }

   /**
   * Get hideRiskMenus
   * @return hideRiskMenus
  **/
  @ApiModelProperty(value = "")
  public Boolean getHideRiskMenus() {
    return hideRiskMenus;
  }

  public void setHideRiskMenus(Boolean hideRiskMenus) {
    this.hideRiskMenus = hideRiskMenus;
  }

  public RiskProductsDecisionManagerConfigurationInformationConfigurationsPortfolioControls hideRiskTransactionData(Boolean hideRiskTransactionData) {
    this.hideRiskTransactionData = hideRiskTransactionData;
    return this;
  }

   /**
   * Get hideRiskTransactionData
   * @return hideRiskTransactionData
  **/
  @ApiModelProperty(value = "")
  public Boolean getHideRiskTransactionData() {
    return hideRiskTransactionData;
  }

  public void setHideRiskTransactionData(Boolean hideRiskTransactionData) {
    this.hideRiskTransactionData = hideRiskTransactionData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskProductsDecisionManagerConfigurationInformationConfigurationsPortfolioControls riskProductsDecisionManagerConfigurationInformationConfigurationsPortfolioControls = (RiskProductsDecisionManagerConfigurationInformationConfigurationsPortfolioControls) o;
    return Objects.equals(this.hideRiskMenus, riskProductsDecisionManagerConfigurationInformationConfigurationsPortfolioControls.hideRiskMenus) &&
        Objects.equals(this.hideRiskTransactionData, riskProductsDecisionManagerConfigurationInformationConfigurationsPortfolioControls.hideRiskTransactionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideRiskMenus, hideRiskTransactionData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskProductsDecisionManagerConfigurationInformationConfigurationsPortfolioControls {\n");
    
    sb.append("    hideRiskMenus: ").append(toIndentedString(hideRiskMenus)).append("\n");
    sb.append("    hideRiskTransactionData: ").append(toIndentedString(hideRiskTransactionData)).append("\n");
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

