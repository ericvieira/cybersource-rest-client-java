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
 * Boardingv1registrationsProductInformationSelectedProductsCommerceSolutionsTokenManagementConfigurationInformationConfigurations
 */

public class Boardingv1registrationsProductInformationSelectedProductsCommerceSolutionsTokenManagementConfigurationInformationConfigurations {
  @SerializedName("parentProfileId")
  private String parentProfileId = null;

  public Boardingv1registrationsProductInformationSelectedProductsCommerceSolutionsTokenManagementConfigurationInformationConfigurations parentProfileId(String parentProfileId) {
    this.parentProfileId = parentProfileId;
    return this;
  }

   /**
   * Specify the Vault ID to which transacting MID needs to be assigned.Provide Vault ID as seen on EBC Vault management page. If not provided , transacting MID will be assigned to the existing default Vault at merchant&#39;s level. If there are no Vaults at merchant level , a new Vault will be created and transacting MID will be assigned to it.
   * @return parentProfileId
  **/
  @ApiModelProperty(value = "Specify the Vault ID to which transacting MID needs to be assigned.Provide Vault ID as seen on EBC Vault management page. If not provided , transacting MID will be assigned to the existing default Vault at merchant's level. If there are no Vaults at merchant level , a new Vault will be created and transacting MID will be assigned to it.")
  public String getParentProfileId() {
    return parentProfileId;
  }

  public void setParentProfileId(String parentProfileId) {
    this.parentProfileId = parentProfileId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsProductInformationSelectedProductsCommerceSolutionsTokenManagementConfigurationInformationConfigurations boardingv1registrationsProductInformationSelectedProductsCommerceSolutionsTokenManagementConfigurationInformationConfigurations = (Boardingv1registrationsProductInformationSelectedProductsCommerceSolutionsTokenManagementConfigurationInformationConfigurations) o;
    return Objects.equals(this.parentProfileId, boardingv1registrationsProductInformationSelectedProductsCommerceSolutionsTokenManagementConfigurationInformationConfigurations.parentProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentProfileId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsProductInformationSelectedProductsCommerceSolutionsTokenManagementConfigurationInformationConfigurations {\n");
    
    sb.append("    parentProfileId: ").append(toIndentedString(parentProfileId)).append("\n");
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

