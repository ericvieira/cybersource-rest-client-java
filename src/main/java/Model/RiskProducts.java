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
import Model.RiskProductsDecisionManager;
import Model.RiskProductsFraudManagementEssentials;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RiskProducts
 */

public class RiskProducts {
  @SerializedName("fraudManagementEssentials")
  private RiskProductsFraudManagementEssentials fraudManagementEssentials = null;

  @SerializedName("decisionManager")
  private RiskProductsDecisionManager decisionManager = null;

  public RiskProducts fraudManagementEssentials(RiskProductsFraudManagementEssentials fraudManagementEssentials) {
    this.fraudManagementEssentials = fraudManagementEssentials;
    return this;
  }

   /**
   * Get fraudManagementEssentials
   * @return fraudManagementEssentials
  **/
  @ApiModelProperty(value = "")
  public RiskProductsFraudManagementEssentials getFraudManagementEssentials() {
    return fraudManagementEssentials;
  }

  public void setFraudManagementEssentials(RiskProductsFraudManagementEssentials fraudManagementEssentials) {
    this.fraudManagementEssentials = fraudManagementEssentials;
  }

  public RiskProducts decisionManager(RiskProductsDecisionManager decisionManager) {
    this.decisionManager = decisionManager;
    return this;
  }

   /**
   * Get decisionManager
   * @return decisionManager
  **/
  @ApiModelProperty(value = "")
  public RiskProductsDecisionManager getDecisionManager() {
    return decisionManager;
  }

  public void setDecisionManager(RiskProductsDecisionManager decisionManager) {
    this.decisionManager = decisionManager;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskProducts riskProducts = (RiskProducts) o;
    return Objects.equals(this.fraudManagementEssentials, riskProducts.fraudManagementEssentials) &&
        Objects.equals(this.decisionManager, riskProducts.decisionManager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraudManagementEssentials, decisionManager);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskProducts {\n");
    
    sb.append("    fraudManagementEssentials: ").append(toIndentedString(fraudManagementEssentials)).append("\n");
    sb.append("    decisionManager: ").append(toIndentedString(decisionManager)).append("\n");
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

