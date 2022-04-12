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
 * PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-12T09:56:59.728+05:30")
public class PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor {
  @SerializedName("name")
  private String name = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("country")
  private String country = null;

  public PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Your merchant name.  **Note** For Paymentech processor using Cybersource Payouts, the maximum data length is 22.  #### PIN debit Your business name. This name is displayed on the cardholder’s statement. When you include more than one consecutive space, extra spaces are removed.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests.  #### Airline processing Your merchant name. This name is displayed on the cardholder’s statement. When you include more than one consecutive space, extra spaces are removed.  **Note** Some airline fee programs may require the original ticket number (ticket identifier) or the ancillary service description in positions 13 through 23 of this field.  **Important** This value must consist of English characters.  Required for captures and credits. 
   * @return name
  **/
  @ApiModelProperty(value = "Your merchant name.  **Note** For Paymentech processor using Cybersource Payouts, the maximum data length is 22.  #### PIN debit Your business name. This name is displayed on the cardholder’s statement. When you include more than one consecutive space, extra spaces are removed.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests.  #### Airline processing Your merchant name. This name is displayed on the cardholder’s statement. When you include more than one consecutive space, extra spaces are removed.  **Note** Some airline fee programs may require the original ticket number (ticket identifier) or the ancillary service description in positions 13 through 23 of this field.  **Important** This value must consist of English characters.  Required for captures and credits. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Merchant&#39;s City.  #### PIN debit City for your business location. This value might be displayed on the cardholder’s statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests. 
   * @return locality
  **/
  @ApiModelProperty(value = "Merchant's City.  #### PIN debit City for your business location. This value might be displayed on the cardholder’s statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters.  Optional field for PIN debit credit or PIN debit purchase requests. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Merchant&#39;s country.  #### PIN debit Country code for your business location. Use the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf) This value might be displayed on the cardholder’s statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters. **Note** If your business is located in the U.S. or Canada and you include this field in a request, you must also include &#x60;merchantInformation.merchantDescriptor.administrativeArea&#x60;.  Optional field for PIN debit credit or PIN debit purchase. 
   * @return country
  **/
  @ApiModelProperty(value = "Merchant's country.  #### PIN debit Country code for your business location. Use the [ISO Standard Country Codes](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf) This value might be displayed on the cardholder’s statement.  When you do not include this value in your PIN debit request, the merchant name from your account is used. **Important** This value must consist of English characters. **Note** If your business is located in the U.S. or Canada and you include this field in a request, you must also include `merchantInformation.merchantDescriptor.administrativeArea`.  Optional field for PIN debit credit or PIN debit purchase. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor ptsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor = (PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor) o;
    return Objects.equals(this.name, ptsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor.name) &&
        Objects.equals(this.locality, ptsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor.locality) &&
        Objects.equals(this.country, ptsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, locality, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PayoutsPost201ResponseMerchantInformationMerchantDescriptor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

