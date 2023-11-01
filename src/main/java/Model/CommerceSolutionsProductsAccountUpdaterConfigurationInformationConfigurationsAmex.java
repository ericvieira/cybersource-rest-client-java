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
 * CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex
 */

public class CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex {
  @SerializedName("mode")
  private String mode = null;

  @SerializedName("seNumber")
  private String seNumber = null;

  @SerializedName("subscriberId")
  private String subscriberId = null;

  @SerializedName("active")
  private Boolean active = null;

  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Type of mode. Valid values are &#x60;tokenApi&#x60; or &#x60;dailyHarvest&#x60;.
   * @return mode
  **/
  @ApiModelProperty(value = "Type of mode. Valid values are `tokenApi` or `dailyHarvest`.")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex seNumber(String seNumber) {
    this.seNumber = seNumber;
    return this;
  }

   /**
   * Get seNumber
   * @return seNumber
  **/
  @ApiModelProperty(value = "")
  public String getSeNumber() {
    return seNumber;
  }

  public void setSeNumber(String seNumber) {
    this.seNumber = seNumber;
  }

  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex subscriberId(String subscriberId) {
    this.subscriberId = subscriberId;
    return this;
  }

   /**
   * Get subscriberId
   * @return subscriberId
  **/
  @ApiModelProperty(value = "")
  public String getSubscriberId() {
    return subscriberId;
  }

  public void setSubscriberId(String subscriberId) {
    this.subscriberId = subscriberId;
  }

  public CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex = (CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex) o;
    return Objects.equals(this.mode, commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex.mode) &&
        Objects.equals(this.seNumber, commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex.seNumber) &&
        Objects.equals(this.subscriberId, commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex.subscriberId) &&
        Objects.equals(this.active, commerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, seNumber, subscriberId, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommerceSolutionsProductsAccountUpdaterConfigurationInformationConfigurationsAmex {\n");
    
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    seNumber: ").append(toIndentedString(seNumber)).append("\n");
    sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

