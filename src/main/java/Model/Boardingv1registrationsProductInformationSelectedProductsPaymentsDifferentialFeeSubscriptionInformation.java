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
import Model.Boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformationFeatures;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformation
 */

public class Boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformation {
  @SerializedName("enabled")
  private Boolean enabled = null;

  /**
   * Indicates if the organization can enable this product using self service.
   */
  @JsonAdapter(SelfServiceabilityEnum.Adapter.class)
  public enum SelfServiceabilityEnum {
    SELF_SERVICEABLE("SELF_SERVICEABLE"),
    
    NOT_SELF_SERVICEABLE("NOT_SELF_SERVICEABLE"),
    
    SELF_SERVICE_ONLY("SELF_SERVICE_ONLY");

    private String value;

    SelfServiceabilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SelfServiceabilityEnum fromValue(String text) {
      for (SelfServiceabilityEnum b : SelfServiceabilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SelfServiceabilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SelfServiceabilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SelfServiceabilityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SelfServiceabilityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("selfServiceability")
  private SelfServiceabilityEnum selfServiceability = SelfServiceabilityEnum.NOT_SELF_SERVICEABLE;

  @SerializedName("features")
  private Boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformationFeatures features = null;

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformation enabled(Boolean enabled) {
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

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformation selfServiceability(SelfServiceabilityEnum selfServiceability) {
    this.selfServiceability = selfServiceability;
    return this;
  }

   /**
   * Indicates if the organization can enable this product using self service.
   * @return selfServiceability
  **/
  @ApiModelProperty(value = "Indicates if the organization can enable this product using self service.")
  public SelfServiceabilityEnum getSelfServiceability() {
    return selfServiceability;
  }

  public void setSelfServiceability(SelfServiceabilityEnum selfServiceability) {
    this.selfServiceability = selfServiceability;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformation features(Boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformationFeatures features) {
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformationFeatures getFeatures() {
    return features;
  }

  public void setFeatures(Boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformationFeatures features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformation boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformation = (Boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformation) o;
    return Objects.equals(this.enabled, boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformation.enabled) &&
        Objects.equals(this.selfServiceability, boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformation.selfServiceability) &&
        Objects.equals(this.features, boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformation.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, selfServiceability, features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsProductInformationSelectedProductsPaymentsDifferentialFeeSubscriptionInformation {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    selfServiceability: ").append(toIndentedString(selfServiceability)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

