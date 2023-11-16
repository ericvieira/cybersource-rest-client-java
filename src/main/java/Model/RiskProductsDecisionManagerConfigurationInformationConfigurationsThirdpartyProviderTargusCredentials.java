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
 * RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargusCredentials
 */

public class RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargusCredentials {
  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("serviceId")
  private String serviceId = null;

  public RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargusCredentials username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargusCredentials password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargusCredentials serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(value = "")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargusCredentials riskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargusCredentials = (RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargusCredentials) o;
    return Objects.equals(this.username, riskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargusCredentials.username) &&
        Objects.equals(this.password, riskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargusCredentials.password) &&
        Objects.equals(this.serviceId, riskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargusCredentials.serviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, serviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskProductsDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargusCredentials {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

