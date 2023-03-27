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
 * Upv1capturecontextsCheckoutApiInitialization
 */

public class Upv1capturecontextsCheckoutApiInitialization {
  @SerializedName("profile_id")
  private String profileId = null;

  @SerializedName("access_key")
  private String accessKey = null;

  @SerializedName("reference_number")
  private String referenceNumber = null;

  @SerializedName("transaction_uuid")
  private String transactionUuid = null;

  @SerializedName("transaction_type")
  private String transactionType = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("override_custom_receipt_page")
  private String overrideCustomReceiptPage = null;

  @SerializedName("unsigned_field_names")
  private String unsignedFieldNames = null;

  public Upv1capturecontextsCheckoutApiInitialization profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * Get profileId
   * @return profileId
  **/
  @ApiModelProperty(example = "12341234-1234-1234-1234-123412341234", value = "")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public Upv1capturecontextsCheckoutApiInitialization accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @ApiModelProperty(example = "acce55acce55acce55acce55acce5500", value = "")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public Upv1capturecontextsCheckoutApiInitialization referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Get referenceNumber
   * @return referenceNumber
  **/
  @ApiModelProperty(example = "1611305732", value = "")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public Upv1capturecontextsCheckoutApiInitialization transactionUuid(String transactionUuid) {
    this.transactionUuid = transactionUuid;
    return this;
  }

   /**
   * Get transactionUuid
   * @return transactionUuid
  **/
  @ApiModelProperty(example = "1611305732-001", value = "")
  public String getTransactionUuid() {
    return transactionUuid;
  }

  public void setTransactionUuid(String transactionUuid) {
    this.transactionUuid = transactionUuid;
  }

  public Upv1capturecontextsCheckoutApiInitialization transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(example = "authorization", value = "")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public Upv1capturecontextsCheckoutApiInitialization currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(example = "USD", value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Upv1capturecontextsCheckoutApiInitialization amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "100", value = "")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Upv1capturecontextsCheckoutApiInitialization locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(example = "en-us", value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Upv1capturecontextsCheckoutApiInitialization overrideCustomReceiptPage(String overrideCustomReceiptPage) {
    this.overrideCustomReceiptPage = overrideCustomReceiptPage;
    return this;
  }

   /**
   * Get overrideCustomReceiptPage
   * @return overrideCustomReceiptPage
  **/
  @ApiModelProperty(example = "https://the-up-demo.appspot.com/demos/demo5/receipt", value = "")
  public String getOverrideCustomReceiptPage() {
    return overrideCustomReceiptPage;
  }

  public void setOverrideCustomReceiptPage(String overrideCustomReceiptPage) {
    this.overrideCustomReceiptPage = overrideCustomReceiptPage;
  }

  public Upv1capturecontextsCheckoutApiInitialization unsignedFieldNames(String unsignedFieldNames) {
    this.unsignedFieldNames = unsignedFieldNames;
    return this;
  }

   /**
   * Get unsignedFieldNames
   * @return unsignedFieldNames
  **/
  @ApiModelProperty(example = "transient_token", value = "")
  public String getUnsignedFieldNames() {
    return unsignedFieldNames;
  }

  public void setUnsignedFieldNames(String unsignedFieldNames) {
    this.unsignedFieldNames = unsignedFieldNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Upv1capturecontextsCheckoutApiInitialization upv1capturecontextsCheckoutApiInitialization = (Upv1capturecontextsCheckoutApiInitialization) o;
    return Objects.equals(this.profileId, upv1capturecontextsCheckoutApiInitialization.profileId) &&
        Objects.equals(this.accessKey, upv1capturecontextsCheckoutApiInitialization.accessKey) &&
        Objects.equals(this.referenceNumber, upv1capturecontextsCheckoutApiInitialization.referenceNumber) &&
        Objects.equals(this.transactionUuid, upv1capturecontextsCheckoutApiInitialization.transactionUuid) &&
        Objects.equals(this.transactionType, upv1capturecontextsCheckoutApiInitialization.transactionType) &&
        Objects.equals(this.currency, upv1capturecontextsCheckoutApiInitialization.currency) &&
        Objects.equals(this.amount, upv1capturecontextsCheckoutApiInitialization.amount) &&
        Objects.equals(this.locale, upv1capturecontextsCheckoutApiInitialization.locale) &&
        Objects.equals(this.overrideCustomReceiptPage, upv1capturecontextsCheckoutApiInitialization.overrideCustomReceiptPage) &&
        Objects.equals(this.unsignedFieldNames, upv1capturecontextsCheckoutApiInitialization.unsignedFieldNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileId, accessKey, referenceNumber, transactionUuid, transactionType, currency, amount, locale, overrideCustomReceiptPage, unsignedFieldNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Upv1capturecontextsCheckoutApiInitialization {\n");
    
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    transactionUuid: ").append(toIndentedString(transactionUuid)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    overrideCustomReceiptPage: ").append(toIndentedString(overrideCustomReceiptPage)).append("\n");
    sb.append("    unsignedFieldNames: ").append(toIndentedString(unsignedFieldNames)).append("\n");
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

