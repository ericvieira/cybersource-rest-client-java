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
import Model.PaymentProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypesCardTypes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object containing Payment Types supported
 */
@ApiModel(description = "Object containing Payment Types supported")

public class PaymentProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypes {
  @SerializedName("cardTypes")
  private PaymentProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypesCardTypes cardTypes = null;

  public PaymentProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypes cardTypes(PaymentProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypesCardTypes cardTypes) {
    this.cardTypes = cardTypes;
    return this;
  }

   /**
   * Get cardTypes
   * @return cardTypes
  **/
  @ApiModelProperty(value = "")
  public PaymentProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypesCardTypes getCardTypes() {
    return cardTypes;
  }

  public void setCardTypes(PaymentProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypesCardTypes cardTypes) {
    this.cardTypes = cardTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypes paymentProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypes = (PaymentProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypes) o;
    return Objects.equals(this.cardTypes, paymentProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypes.cardTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProductsSecureAcceptanceConfigurationInformationConfigurationsPaymentTypes {\n");
    
    sb.append("    cardTypes: ").append(toIndentedString(cardTypes)).append("\n");
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

