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
import Model.RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderAccurintCredentials;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss
 */

public class RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("enableRealTime")
  private Boolean enableRealTime = null;

  @SerializedName("credentials")
  private RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderAccurintCredentials credentials = null;

  public RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss enableRealTime(Boolean enableRealTime) {
    this.enableRealTime = enableRealTime;
    return this;
  }

   /**
   * Get enableRealTime
   * @return enableRealTime
  **/
  @ApiModelProperty(value = "")
  public Boolean getEnableRealTime() {
    return enableRealTime;
  }

  public void setEnableRealTime(Boolean enableRealTime) {
    this.enableRealTime = enableRealTime;
  }

  public RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss credentials(RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderAccurintCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(value = "")
  public RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderAccurintCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderAccurintCredentials credentials) {
    this.credentials = credentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss riskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss = (RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss) o;
    return Objects.equals(this.enabled, riskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss.enabled) &&
        Objects.equals(this.enableRealTime, riskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss.enableRealTime) &&
        Objects.equals(this.credentials, riskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, enableRealTime, credentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enableRealTime: ").append(toIndentedString(enableRealTime)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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

