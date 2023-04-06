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
import Model.Rbsv1subscriptionsProcessingInformationAuthorizationOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Rbsv1subscriptionsProcessingInformation
 */

public class Rbsv1subscriptionsProcessingInformation {
  @SerializedName("commerceIndicator")
  private String commerceIndicator = null;

  @SerializedName("authorizationOptions")
  private Rbsv1subscriptionsProcessingInformationAuthorizationOptions authorizationOptions = null;

  public Rbsv1subscriptionsProcessingInformation commerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
    return this;
  }

   /**
   * Commerce Indicator is a way to identify the type of transaction. Some payment card companies use this information when determining discount rates.  Valid values: - &#x60;MOTO&#x60; - &#x60;RECURRING&#x60; 
   * @return commerceIndicator
  **/
  @ApiModelProperty(value = "Commerce Indicator is a way to identify the type of transaction. Some payment card companies use this information when determining discount rates.  Valid values: - `MOTO` - `RECURRING` ")
  public String getCommerceIndicator() {
    return commerceIndicator;
  }

  public void setCommerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
  }

  public Rbsv1subscriptionsProcessingInformation authorizationOptions(Rbsv1subscriptionsProcessingInformationAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
    return this;
  }

   /**
   * Get authorizationOptions
   * @return authorizationOptions
  **/
  @ApiModelProperty(value = "")
  public Rbsv1subscriptionsProcessingInformationAuthorizationOptions getAuthorizationOptions() {
    return authorizationOptions;
  }

  public void setAuthorizationOptions(Rbsv1subscriptionsProcessingInformationAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rbsv1subscriptionsProcessingInformation rbsv1subscriptionsProcessingInformation = (Rbsv1subscriptionsProcessingInformation) o;
    return Objects.equals(this.commerceIndicator, rbsv1subscriptionsProcessingInformation.commerceIndicator) &&
        Objects.equals(this.authorizationOptions, rbsv1subscriptionsProcessingInformation.authorizationOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commerceIndicator, authorizationOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rbsv1subscriptionsProcessingInformation {\n");
    
    sb.append("    commerceIndicator: ").append(toIndentedString(commerceIndicator)).append("\n");
    sb.append("    authorizationOptions: ").append(toIndentedString(authorizationOptions)).append("\n");
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

