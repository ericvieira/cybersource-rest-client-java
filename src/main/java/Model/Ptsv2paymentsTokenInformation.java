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
import Model.Ptsv2paymentsTokenInformationPaymentInstrument;
import Model.Ptsv2paymentsTokenInformationShippingAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsTokenInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-12T17:46:06.587+05:30")
public class Ptsv2paymentsTokenInformation {
  @SerializedName("jti")
  private String jti = null;

  @SerializedName("transientTokenJwt")
  private String transientTokenJwt = null;

  @SerializedName("paymentInstrument")
  private Ptsv2paymentsTokenInformationPaymentInstrument paymentInstrument = null;

  @SerializedName("shippingAddress")
  private Ptsv2paymentsTokenInformationShippingAddress shippingAddress = null;

  @SerializedName("networkTokenOption")
  private String networkTokenOption = null;

  public Ptsv2paymentsTokenInformation jti(String jti) {
    this.jti = jti;
    return this;
  }

   /**
   * TMS Transient Token, 64 hexadecimal id value representing captured payment credentials (including Sensitive Authentication Data, e.g. CVV). 
   * @return jti
  **/
  @ApiModelProperty(value = "TMS Transient Token, 64 hexadecimal id value representing captured payment credentials (including Sensitive Authentication Data, e.g. CVV). ")
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }

  public Ptsv2paymentsTokenInformation transientTokenJwt(String transientTokenJwt) {
    this.transientTokenJwt = transientTokenJwt;
    return this;
  }

   /**
   * Flex API Transient Token encoded as JWT (JSON Web Token), e.g. Flex microform or Unified Payment checkout result. 
   * @return transientTokenJwt
  **/
  @ApiModelProperty(value = "Flex API Transient Token encoded as JWT (JSON Web Token), e.g. Flex microform or Unified Payment checkout result. ")
  public String getTransientTokenJwt() {
    return transientTokenJwt;
  }

  public void setTransientTokenJwt(String transientTokenJwt) {
    this.transientTokenJwt = transientTokenJwt;
  }

  public Ptsv2paymentsTokenInformation paymentInstrument(Ptsv2paymentsTokenInformationPaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

   /**
   * Get paymentInstrument
   * @return paymentInstrument
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsTokenInformationPaymentInstrument getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(Ptsv2paymentsTokenInformationPaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  public Ptsv2paymentsTokenInformation shippingAddress(Ptsv2paymentsTokenInformationShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsTokenInformationShippingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Ptsv2paymentsTokenInformationShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Ptsv2paymentsTokenInformation networkTokenOption(String networkTokenOption) {
    this.networkTokenOption = networkTokenOption;
    return this;
  }

   /**
   * Indicates whether a payment network token associated with a TMS token should be used for authorization. This field can contain one of following values:  - &#x60;ignore&#x60;: Use a tokenized card number for an authorization, even if the TMS token has an associated payment network token. - &#x60;prefer&#x60;: (Default) Use an associated payment network token for an authorization if the TMS token has one; otherwise, use the tokenized card number. 
   * @return networkTokenOption
  **/
  @ApiModelProperty(value = "Indicates whether a payment network token associated with a TMS token should be used for authorization. This field can contain one of following values:  - `ignore`: Use a tokenized card number for an authorization, even if the TMS token has an associated payment network token. - `prefer`: (Default) Use an associated payment network token for an authorization if the TMS token has one; otherwise, use the tokenized card number. ")
  public String getNetworkTokenOption() {
    return networkTokenOption;
  }

  public void setNetworkTokenOption(String networkTokenOption) {
    this.networkTokenOption = networkTokenOption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTokenInformation ptsv2paymentsTokenInformation = (Ptsv2paymentsTokenInformation) o;
    return Objects.equals(this.jti, ptsv2paymentsTokenInformation.jti) &&
        Objects.equals(this.transientTokenJwt, ptsv2paymentsTokenInformation.transientTokenJwt) &&
        Objects.equals(this.paymentInstrument, ptsv2paymentsTokenInformation.paymentInstrument) &&
        Objects.equals(this.shippingAddress, ptsv2paymentsTokenInformation.shippingAddress) &&
        Objects.equals(this.networkTokenOption, ptsv2paymentsTokenInformation.networkTokenOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jti, transientTokenJwt, paymentInstrument, shippingAddress, networkTokenOption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTokenInformation {\n");
    
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
    sb.append("    transientTokenJwt: ").append(toIndentedString(transientTokenJwt)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    networkTokenOption: ").append(toIndentedString(networkTokenOption)).append("\n");
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

