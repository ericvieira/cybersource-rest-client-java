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
 * PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation
 */

public class PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation {
  @SerializedName("defaultStandardEntryClassCode")
  private String defaultStandardEntryClassCode = null;

  @SerializedName("defaultCountryCode")
  private String defaultCountryCode = null;

  @SerializedName("defaultCurrencyCode")
  private String defaultCurrencyCode = null;

  /**
   * Gets or Sets defaultTransactionType
   */
  @JsonAdapter(DefaultTransactionTypeEnum.Adapter.class)
  public enum DefaultTransactionTypeEnum {
    AUTHORIZATION("AUTHORIZATION"),
    
    SALE("SALE");

    private String value;

    DefaultTransactionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultTransactionTypeEnum fromValue(String text) {
      for (DefaultTransactionTypeEnum b : DefaultTransactionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DefaultTransactionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultTransactionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultTransactionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DefaultTransactionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("defaultTransactionType")
  private DefaultTransactionTypeEnum defaultTransactionType = null;

  /**
   * Gets or Sets defaultPaymentType
   */
  @JsonAdapter(DefaultPaymentTypeEnum.Adapter.class)
  public enum DefaultPaymentTypeEnum {
    CREDIT_CARD("CREDIT_CARD"),
    
    ECHECK("ECHECK");

    private String value;

    DefaultPaymentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultPaymentTypeEnum fromValue(String text) {
      for (DefaultPaymentTypeEnum b : DefaultPaymentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DefaultPaymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultPaymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultPaymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DefaultPaymentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("defaultPaymentType")
  private DefaultPaymentTypeEnum defaultPaymentType = null;

  @SerializedName("defaultTransactionSource")
  private String defaultTransactionSource = null;

  @SerializedName("displayRetail")
  private Boolean displayRetail = null;

  @SerializedName("displayMoto")
  private Boolean displayMoto = null;

  @SerializedName("displayInternet")
  private Boolean displayInternet = null;

  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation defaultStandardEntryClassCode(String defaultStandardEntryClassCode) {
    this.defaultStandardEntryClassCode = defaultStandardEntryClassCode;
    return this;
  }

   /**
   * Get defaultStandardEntryClassCode
   * @return defaultStandardEntryClassCode
  **/
  @ApiModelProperty(value = "")
  public String getDefaultStandardEntryClassCode() {
    return defaultStandardEntryClassCode;
  }

  public void setDefaultStandardEntryClassCode(String defaultStandardEntryClassCode) {
    this.defaultStandardEntryClassCode = defaultStandardEntryClassCode;
  }

  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation defaultCountryCode(String defaultCountryCode) {
    this.defaultCountryCode = defaultCountryCode;
    return this;
  }

   /**
   * ISO 4217 format
   * @return defaultCountryCode
  **/
  @ApiModelProperty(value = "ISO 4217 format")
  public String getDefaultCountryCode() {
    return defaultCountryCode;
  }

  public void setDefaultCountryCode(String defaultCountryCode) {
    this.defaultCountryCode = defaultCountryCode;
  }

  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation defaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
    return this;
  }

   /**
   * Three-character [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)
   * @return defaultCurrencyCode
  **/
  @ApiModelProperty(value = "Three-character [ISO Standard Currency Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/currencies.pdf)")
  public String getDefaultCurrencyCode() {
    return defaultCurrencyCode;
  }

  public void setDefaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
  }

  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation defaultTransactionType(DefaultTransactionTypeEnum defaultTransactionType) {
    this.defaultTransactionType = defaultTransactionType;
    return this;
  }

   /**
   * Get defaultTransactionType
   * @return defaultTransactionType
  **/
  @ApiModelProperty(value = "")
  public DefaultTransactionTypeEnum getDefaultTransactionType() {
    return defaultTransactionType;
  }

  public void setDefaultTransactionType(DefaultTransactionTypeEnum defaultTransactionType) {
    this.defaultTransactionType = defaultTransactionType;
  }

  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation defaultPaymentType(DefaultPaymentTypeEnum defaultPaymentType) {
    this.defaultPaymentType = defaultPaymentType;
    return this;
  }

   /**
   * Get defaultPaymentType
   * @return defaultPaymentType
  **/
  @ApiModelProperty(value = "")
  public DefaultPaymentTypeEnum getDefaultPaymentType() {
    return defaultPaymentType;
  }

  public void setDefaultPaymentType(DefaultPaymentTypeEnum defaultPaymentType) {
    this.defaultPaymentType = defaultPaymentType;
  }

  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation defaultTransactionSource(String defaultTransactionSource) {
    this.defaultTransactionSource = defaultTransactionSource;
    return this;
  }

   /**
   * Get defaultTransactionSource
   * @return defaultTransactionSource
  **/
  @ApiModelProperty(value = "")
  public String getDefaultTransactionSource() {
    return defaultTransactionSource;
  }

  public void setDefaultTransactionSource(String defaultTransactionSource) {
    this.defaultTransactionSource = defaultTransactionSource;
  }

  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation displayRetail(Boolean displayRetail) {
    this.displayRetail = displayRetail;
    return this;
  }

   /**
   * Get displayRetail
   * @return displayRetail
  **/
  @ApiModelProperty(value = "")
  public Boolean getDisplayRetail() {
    return displayRetail;
  }

  public void setDisplayRetail(Boolean displayRetail) {
    this.displayRetail = displayRetail;
  }

  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation displayMoto(Boolean displayMoto) {
    this.displayMoto = displayMoto;
    return this;
  }

   /**
   * Get displayMoto
   * @return displayMoto
  **/
  @ApiModelProperty(value = "")
  public Boolean getDisplayMoto() {
    return displayMoto;
  }

  public void setDisplayMoto(Boolean displayMoto) {
    this.displayMoto = displayMoto;
  }

  public PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation displayInternet(Boolean displayInternet) {
    this.displayInternet = displayInternet;
    return this;
  }

   /**
   * Get displayInternet
   * @return displayInternet
  **/
  @ApiModelProperty(value = "")
  public Boolean getDisplayInternet() {
    return displayInternet;
  }

  public void setDisplayInternet(Boolean displayInternet) {
    this.displayInternet = displayInternet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation = (PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation) o;
    return Objects.equals(this.defaultStandardEntryClassCode, paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation.defaultStandardEntryClassCode) &&
        Objects.equals(this.defaultCountryCode, paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation.defaultCountryCode) &&
        Objects.equals(this.defaultCurrencyCode, paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation.defaultCurrencyCode) &&
        Objects.equals(this.defaultTransactionType, paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation.defaultTransactionType) &&
        Objects.equals(this.defaultPaymentType, paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation.defaultPaymentType) &&
        Objects.equals(this.defaultTransactionSource, paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation.defaultTransactionSource) &&
        Objects.equals(this.displayRetail, paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation.displayRetail) &&
        Objects.equals(this.displayMoto, paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation.displayMoto) &&
        Objects.equals(this.displayInternet, paymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation.displayInternet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultStandardEntryClassCode, defaultCountryCode, defaultCurrencyCode, defaultTransactionType, defaultPaymentType, defaultTransactionSource, displayRetail, displayMoto, displayInternet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProductsVirtualTerminalConfigurationInformationConfigurationsCardNotPresentGlobalPaymentInformationBasicInformation {\n");
    
    sb.append("    defaultStandardEntryClassCode: ").append(toIndentedString(defaultStandardEntryClassCode)).append("\n");
    sb.append("    defaultCountryCode: ").append(toIndentedString(defaultCountryCode)).append("\n");
    sb.append("    defaultCurrencyCode: ").append(toIndentedString(defaultCurrencyCode)).append("\n");
    sb.append("    defaultTransactionType: ").append(toIndentedString(defaultTransactionType)).append("\n");
    sb.append("    defaultPaymentType: ").append(toIndentedString(defaultPaymentType)).append("\n");
    sb.append("    defaultTransactionSource: ").append(toIndentedString(defaultTransactionSource)).append("\n");
    sb.append("    displayRetail: ").append(toIndentedString(displayRetail)).append("\n");
    sb.append("    displayMoto: ").append(toIndentedString(displayMoto)).append("\n");
    sb.append("    displayInternet: ").append(toIndentedString(displayInternet)).append("\n");
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

