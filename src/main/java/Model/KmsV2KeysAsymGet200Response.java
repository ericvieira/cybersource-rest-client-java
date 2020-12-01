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
import Model.KmsV2KeysAsymGet200ResponseKeyInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * KmsV2KeysAsymGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-22T14:46:25.834+05:30")
public class KmsV2KeysAsymGet200Response {
  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("keyInformation")
  private KmsV2KeysAsymGet200ResponseKeyInformation keyInformation = null;

  public KmsV2KeysAsymGet200Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by authorization service.  #### PIN debit Time when the PIN debit credit, PIN debit purchase or PIN debit reversal was requested.  Returned by PIN debit credit, PIN debit purchase or PIN debit reversal. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by authorization service.  #### PIN debit Time when the PIN debit credit, PIN debit purchase or PIN debit reversal was requested.  Returned by PIN debit credit, PIN debit purchase or PIN debit reversal. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public KmsV2KeysAsymGet200Response keyInformation(KmsV2KeysAsymGet200ResponseKeyInformation keyInformation) {
    this.keyInformation = keyInformation;
    return this;
  }

   /**
   * Get keyInformation
   * @return keyInformation
  **/
  @ApiModelProperty(value = "")
  public KmsV2KeysAsymGet200ResponseKeyInformation getKeyInformation() {
    return keyInformation;
  }

  public void setKeyInformation(KmsV2KeysAsymGet200ResponseKeyInformation keyInformation) {
    this.keyInformation = keyInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KmsV2KeysAsymGet200Response kmsV2KeysAsymGet200Response = (KmsV2KeysAsymGet200Response) o;
    return Objects.equals(this.submitTimeUtc, kmsV2KeysAsymGet200Response.submitTimeUtc) &&
        Objects.equals(this.keyInformation, kmsV2KeysAsymGet200Response.keyInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitTimeUtc, keyInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KmsV2KeysAsymGet200Response {\n");
    
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    keyInformation: ").append(toIndentedString(keyInformation)).append("\n");
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

