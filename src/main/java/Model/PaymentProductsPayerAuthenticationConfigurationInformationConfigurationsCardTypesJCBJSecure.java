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
import Model.PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisaCurrencies;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure
 */

public class PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure {
  @SerializedName("securePasswordForJCB")
  private String securePasswordForJCB = null;

  @SerializedName("enabled")
  private Boolean enabled = true;

  @SerializedName("currencies")
  private List<PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisaCurrencies> currencies = null;

  public PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure securePasswordForJCB(String securePasswordForJCB) {
    this.securePasswordForJCB = securePasswordForJCB;
    return this;
  }

   /**
   * JSecure currency password for Japan Credit Bureau
   * @return securePasswordForJCB
  **/
  @ApiModelProperty(value = "JSecure currency password for Japan Credit Bureau")
  public String getSecurePasswordForJCB() {
    return securePasswordForJCB;
  }

  public void setSecurePasswordForJCB(String securePasswordForJCB) {
    this.securePasswordForJCB = securePasswordForJCB;
  }

  public PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure enabled(Boolean enabled) {
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

  public PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure currencies(List<PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisaCurrencies> currencies) {
    this.currencies = currencies;
    return this;
  }

  public PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure addCurrenciesItem(PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisaCurrencies currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisaCurrencies>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * Get currencies
   * @return currencies
  **/
  @ApiModelProperty(value = "")
  public List<PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisaCurrencies> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(List<PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesVerifiedByVisaCurrencies> currencies) {
    this.currencies = currencies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure paymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure = (PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure) o;
    return Objects.equals(this.securePasswordForJCB, paymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure.securePasswordForJCB) &&
        Objects.equals(this.enabled, paymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure.enabled) &&
        Objects.equals(this.currencies, paymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure.currencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securePasswordForJCB, enabled, currencies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProductsPayerAuthenticationConfigurationInformationConfigurationsCardTypesJCBJSecure {\n");
    
    sb.append("    securePasswordForJCB: ").append(toIndentedString(securePasswordForJCB)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
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

