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
import Model.PaymentProductsECheckConfigurationInformation;
import Model.PaymentProductsECheckSubscriptionInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentProductsECheck
 */

public class PaymentProductsECheck {
  @SerializedName("subscriptionInformation")
  private PaymentProductsECheckSubscriptionInformation subscriptionInformation = null;

  @SerializedName("configurationInformation")
  private PaymentProductsECheckConfigurationInformation configurationInformation = null;

  public PaymentProductsECheck subscriptionInformation(PaymentProductsECheckSubscriptionInformation subscriptionInformation) {
    this.subscriptionInformation = subscriptionInformation;
    return this;
  }

   /**
   * Get subscriptionInformation
   * @return subscriptionInformation
  **/
  @ApiModelProperty(value = "")
  public PaymentProductsECheckSubscriptionInformation getSubscriptionInformation() {
    return subscriptionInformation;
  }

  public void setSubscriptionInformation(PaymentProductsECheckSubscriptionInformation subscriptionInformation) {
    this.subscriptionInformation = subscriptionInformation;
  }

  public PaymentProductsECheck configurationInformation(PaymentProductsECheckConfigurationInformation configurationInformation) {
    this.configurationInformation = configurationInformation;
    return this;
  }

   /**
   * Get configurationInformation
   * @return configurationInformation
  **/
  @ApiModelProperty(value = "")
  public PaymentProductsECheckConfigurationInformation getConfigurationInformation() {
    return configurationInformation;
  }

  public void setConfigurationInformation(PaymentProductsECheckConfigurationInformation configurationInformation) {
    this.configurationInformation = configurationInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProductsECheck paymentProductsECheck = (PaymentProductsECheck) o;
    return Objects.equals(this.subscriptionInformation, paymentProductsECheck.subscriptionInformation) &&
        Objects.equals(this.configurationInformation, paymentProductsECheck.configurationInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionInformation, configurationInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProductsECheck {\n");
    
    sb.append("    subscriptionInformation: ").append(toIndentedString(subscriptionInformation)).append("\n");
    sb.append("    configurationInformation: ").append(toIndentedString(configurationInformation)).append("\n");
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

