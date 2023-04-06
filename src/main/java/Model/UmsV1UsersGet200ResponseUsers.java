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
import Model.UmsV1UsersGet200ResponseAccountInformation;
import Model.UmsV1UsersGet200ResponseContactInformation;
import Model.UmsV1UsersGet200ResponseOrganizationInformation;
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
 * UmsV1UsersGet200ResponseUsers
 */

public class UmsV1UsersGet200ResponseUsers {
  @SerializedName("accountInformation")
  private UmsV1UsersGet200ResponseAccountInformation accountInformation = null;

  @SerializedName("organizationInformation")
  private UmsV1UsersGet200ResponseOrganizationInformation organizationInformation = null;

  @SerializedName("contactInformation")
  private UmsV1UsersGet200ResponseContactInformation contactInformation = null;

  @SerializedName("customFields")
  private Map<String, String> customFields = null;

  public UmsV1UsersGet200ResponseUsers accountInformation(UmsV1UsersGet200ResponseAccountInformation accountInformation) {
    this.accountInformation = accountInformation;
    return this;
  }

   /**
   * Get accountInformation
   * @return accountInformation
  **/
  @ApiModelProperty(value = "")
  public UmsV1UsersGet200ResponseAccountInformation getAccountInformation() {
    return accountInformation;
  }

  public void setAccountInformation(UmsV1UsersGet200ResponseAccountInformation accountInformation) {
    this.accountInformation = accountInformation;
  }

  public UmsV1UsersGet200ResponseUsers organizationInformation(UmsV1UsersGet200ResponseOrganizationInformation organizationInformation) {
    this.organizationInformation = organizationInformation;
    return this;
  }

   /**
   * Get organizationInformation
   * @return organizationInformation
  **/
  @ApiModelProperty(value = "")
  public UmsV1UsersGet200ResponseOrganizationInformation getOrganizationInformation() {
    return organizationInformation;
  }

  public void setOrganizationInformation(UmsV1UsersGet200ResponseOrganizationInformation organizationInformation) {
    this.organizationInformation = organizationInformation;
  }

  public UmsV1UsersGet200ResponseUsers contactInformation(UmsV1UsersGet200ResponseContactInformation contactInformation) {
    this.contactInformation = contactInformation;
    return this;
  }

   /**
   * Get contactInformation
   * @return contactInformation
  **/
  @ApiModelProperty(value = "")
  public UmsV1UsersGet200ResponseContactInformation getContactInformation() {
    return contactInformation;
  }

  public void setContactInformation(UmsV1UsersGet200ResponseContactInformation contactInformation) {
    this.contactInformation = contactInformation;
  }

  public UmsV1UsersGet200ResponseUsers customFields(Map<String, String> customFields) {
    this.customFields = customFields;
    return this;
  }

  public UmsV1UsersGet200ResponseUsers putCustomFieldsItem(String key, String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<String, String>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Map<String, String> customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UmsV1UsersGet200ResponseUsers umsV1UsersGet200ResponseUsers = (UmsV1UsersGet200ResponseUsers) o;
    return Objects.equals(this.accountInformation, umsV1UsersGet200ResponseUsers.accountInformation) &&
        Objects.equals(this.organizationInformation, umsV1UsersGet200ResponseUsers.organizationInformation) &&
        Objects.equals(this.contactInformation, umsV1UsersGet200ResponseUsers.contactInformation) &&
        Objects.equals(this.customFields, umsV1UsersGet200ResponseUsers.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountInformation, organizationInformation, contactInformation, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UmsV1UsersGet200ResponseUsers {\n");
    
    sb.append("    accountInformation: ").append(toIndentedString(accountInformation)).append("\n");
    sb.append("    organizationInformation: ").append(toIndentedString(organizationInformation)).append("\n");
    sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

