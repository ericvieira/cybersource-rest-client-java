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
import Model.Ptsv2paymentsDeviceInformationRawData;
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
 * Riskv1authenticationsDeviceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-10T13:11:55.460+05:30")
public class Riskv1authenticationsDeviceInformation {
  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("rawData")
  private List<Ptsv2paymentsDeviceInformationRawData> rawData = null;

  @SerializedName("httpAcceptBrowserValue")
  private String httpAcceptBrowserValue = null;

  @SerializedName("httpAcceptContent")
  private String httpAcceptContent = null;

  @SerializedName("httpBrowserLanguage")
  private String httpBrowserLanguage = null;

  @SerializedName("httpBrowserJavaEnabled")
  private Boolean httpBrowserJavaEnabled = null;

  @SerializedName("httpBrowserJavaScriptEnabled")
  private Boolean httpBrowserJavaScriptEnabled = null;

  @SerializedName("httpBrowserColorDepth")
  private String httpBrowserColorDepth = null;

  @SerializedName("httpBrowserScreenHeight")
  private String httpBrowserScreenHeight = null;

  @SerializedName("httpBrowserScreenWidth")
  private String httpBrowserScreenWidth = null;

  @SerializedName("httpBrowserTimeDifference")
  private String httpBrowserTimeDifference = null;

  @SerializedName("userAgentBrowserValue")
  private String userAgentBrowserValue = null;

  public Riskv1authenticationsDeviceInformation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the customer.  #### Used by **Authorization, Capture, and Credit** Optional field. 
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address of the customer.  #### Used by **Authorization, Capture, and Credit** Optional field. ")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Riskv1authenticationsDeviceInformation rawData(List<Ptsv2paymentsDeviceInformationRawData> rawData) {
    this.rawData = rawData;
    return this;
  }

  public Riskv1authenticationsDeviceInformation addRawDataItem(Ptsv2paymentsDeviceInformationRawData rawDataItem) {
    if (this.rawData == null) {
      this.rawData = new ArrayList<Ptsv2paymentsDeviceInformationRawData>();
    }
    this.rawData.add(rawDataItem);
    return this;
  }

   /**
   * Get rawData
   * @return rawData
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsDeviceInformationRawData> getRawData() {
    return rawData;
  }

  public void setRawData(List<Ptsv2paymentsDeviceInformationRawData> rawData) {
    this.rawData = rawData;
  }

  public Riskv1authenticationsDeviceInformation httpAcceptBrowserValue(String httpAcceptBrowserValue) {
    this.httpAcceptBrowserValue = httpAcceptBrowserValue;
    return this;
  }

   /**
   * Value of the Accept header sent by the customer’s web browser. **Note** If the customer’s browser provides a value, you must include it in your request. 
   * @return httpAcceptBrowserValue
  **/
  @ApiModelProperty(value = "Value of the Accept header sent by the customer’s web browser. **Note** If the customer’s browser provides a value, you must include it in your request. ")
  public String getHttpAcceptBrowserValue() {
    return httpAcceptBrowserValue;
  }

  public void setHttpAcceptBrowserValue(String httpAcceptBrowserValue) {
    this.httpAcceptBrowserValue = httpAcceptBrowserValue;
  }

  public Riskv1authenticationsDeviceInformation httpAcceptContent(String httpAcceptContent) {
    this.httpAcceptContent = httpAcceptContent;
    return this;
  }

   /**
   * The exact content of the HTTP accept header. 
   * @return httpAcceptContent
  **/
  @ApiModelProperty(value = "The exact content of the HTTP accept header. ")
  public String getHttpAcceptContent() {
    return httpAcceptContent;
  }

  public void setHttpAcceptContent(String httpAcceptContent) {
    this.httpAcceptContent = httpAcceptContent;
  }

  public Riskv1authenticationsDeviceInformation httpBrowserLanguage(String httpBrowserLanguage) {
    this.httpBrowserLanguage = httpBrowserLanguage;
    return this;
  }

   /**
   * Value represents the browser language as defined in IETF BCP47. Example:en-US, refer  https://en.wikipedia.org/wiki/IETF_language_tag for more details. 
   * @return httpBrowserLanguage
  **/
  @ApiModelProperty(value = "Value represents the browser language as defined in IETF BCP47. Example:en-US, refer  https://en.wikipedia.org/wiki/IETF_language_tag for more details. ")
  public String getHttpBrowserLanguage() {
    return httpBrowserLanguage;
  }

  public void setHttpBrowserLanguage(String httpBrowserLanguage) {
    this.httpBrowserLanguage = httpBrowserLanguage;
  }

  public Riskv1authenticationsDeviceInformation httpBrowserJavaEnabled(Boolean httpBrowserJavaEnabled) {
    this.httpBrowserJavaEnabled = httpBrowserJavaEnabled;
    return this;
  }

   /**
   * A Boolean value that represents the ability of the cardholder browser to execute Java. Value is returned from the navigator.javaEnabled property. Possible Values:True/False 
   * @return httpBrowserJavaEnabled
  **/
  @ApiModelProperty(value = "A Boolean value that represents the ability of the cardholder browser to execute Java. Value is returned from the navigator.javaEnabled property. Possible Values:True/False ")
  public Boolean getHttpBrowserJavaEnabled() {
    return httpBrowserJavaEnabled;
  }

  public void setHttpBrowserJavaEnabled(Boolean httpBrowserJavaEnabled) {
    this.httpBrowserJavaEnabled = httpBrowserJavaEnabled;
  }

  public Riskv1authenticationsDeviceInformation httpBrowserJavaScriptEnabled(Boolean httpBrowserJavaScriptEnabled) {
    this.httpBrowserJavaScriptEnabled = httpBrowserJavaScriptEnabled;
    return this;
  }

   /**
   * A Boolean value that represents the ability of the cardholder browser to execute JavaScript. Possible Values:True/False. **Note**: Merchants should be able to know the values from fingerprint details of cardholder&#39;s browser. 
   * @return httpBrowserJavaScriptEnabled
  **/
  @ApiModelProperty(value = "A Boolean value that represents the ability of the cardholder browser to execute JavaScript. Possible Values:True/False. **Note**: Merchants should be able to know the values from fingerprint details of cardholder's browser. ")
  public Boolean getHttpBrowserJavaScriptEnabled() {
    return httpBrowserJavaScriptEnabled;
  }

  public void setHttpBrowserJavaScriptEnabled(Boolean httpBrowserJavaScriptEnabled) {
    this.httpBrowserJavaScriptEnabled = httpBrowserJavaScriptEnabled;
  }

  public Riskv1authenticationsDeviceInformation httpBrowserColorDepth(String httpBrowserColorDepth) {
    this.httpBrowserColorDepth = httpBrowserColorDepth;
    return this;
  }

   /**
   * Value represents the bit depth of the color palette for displaying images, in bits per pixel. Example : 24, refer https://en.wikipedia.org/wiki/Color_depth for more details 
   * @return httpBrowserColorDepth
  **/
  @ApiModelProperty(value = "Value represents the bit depth of the color palette for displaying images, in bits per pixel. Example : 24, refer https://en.wikipedia.org/wiki/Color_depth for more details ")
  public String getHttpBrowserColorDepth() {
    return httpBrowserColorDepth;
  }

  public void setHttpBrowserColorDepth(String httpBrowserColorDepth) {
    this.httpBrowserColorDepth = httpBrowserColorDepth;
  }

  public Riskv1authenticationsDeviceInformation httpBrowserScreenHeight(String httpBrowserScreenHeight) {
    this.httpBrowserScreenHeight = httpBrowserScreenHeight;
    return this;
  }

   /**
   * Total height of the Cardholder&#39;s scree in pixels, example: 864. 
   * @return httpBrowserScreenHeight
  **/
  @ApiModelProperty(value = "Total height of the Cardholder's scree in pixels, example: 864. ")
  public String getHttpBrowserScreenHeight() {
    return httpBrowserScreenHeight;
  }

  public void setHttpBrowserScreenHeight(String httpBrowserScreenHeight) {
    this.httpBrowserScreenHeight = httpBrowserScreenHeight;
  }

  public Riskv1authenticationsDeviceInformation httpBrowserScreenWidth(String httpBrowserScreenWidth) {
    this.httpBrowserScreenWidth = httpBrowserScreenWidth;
    return this;
  }

   /**
   * Total width of the cardholder&#39;s screen in pixels. Example: 1536. 
   * @return httpBrowserScreenWidth
  **/
  @ApiModelProperty(value = "Total width of the cardholder's screen in pixels. Example: 1536. ")
  public String getHttpBrowserScreenWidth() {
    return httpBrowserScreenWidth;
  }

  public void setHttpBrowserScreenWidth(String httpBrowserScreenWidth) {
    this.httpBrowserScreenWidth = httpBrowserScreenWidth;
  }

  public Riskv1authenticationsDeviceInformation httpBrowserTimeDifference(String httpBrowserTimeDifference) {
    this.httpBrowserTimeDifference = httpBrowserTimeDifference;
    return this;
  }

   /**
   * Time difference between UTC time and the cardholder browser local time, in minutes, Example:300 
   * @return httpBrowserTimeDifference
  **/
  @ApiModelProperty(value = "Time difference between UTC time and the cardholder browser local time, in minutes, Example:300 ")
  public String getHttpBrowserTimeDifference() {
    return httpBrowserTimeDifference;
  }

  public void setHttpBrowserTimeDifference(String httpBrowserTimeDifference) {
    this.httpBrowserTimeDifference = httpBrowserTimeDifference;
  }

  public Riskv1authenticationsDeviceInformation userAgentBrowserValue(String userAgentBrowserValue) {
    this.userAgentBrowserValue = userAgentBrowserValue;
    return this;
  }

   /**
   * Value of the User-Agent header sent by the customer’s web browser. Note If the customer’s browser provides a value, you must include it in your request. 
   * @return userAgentBrowserValue
  **/
  @ApiModelProperty(value = "Value of the User-Agent header sent by the customer’s web browser. Note If the customer’s browser provides a value, you must include it in your request. ")
  public String getUserAgentBrowserValue() {
    return userAgentBrowserValue;
  }

  public void setUserAgentBrowserValue(String userAgentBrowserValue) {
    this.userAgentBrowserValue = userAgentBrowserValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsDeviceInformation riskv1authenticationsDeviceInformation = (Riskv1authenticationsDeviceInformation) o;
    return Objects.equals(this.ipAddress, riskv1authenticationsDeviceInformation.ipAddress) &&
        Objects.equals(this.rawData, riskv1authenticationsDeviceInformation.rawData) &&
        Objects.equals(this.httpAcceptBrowserValue, riskv1authenticationsDeviceInformation.httpAcceptBrowserValue) &&
        Objects.equals(this.httpAcceptContent, riskv1authenticationsDeviceInformation.httpAcceptContent) &&
        Objects.equals(this.httpBrowserLanguage, riskv1authenticationsDeviceInformation.httpBrowserLanguage) &&
        Objects.equals(this.httpBrowserJavaEnabled, riskv1authenticationsDeviceInformation.httpBrowserJavaEnabled) &&
        Objects.equals(this.httpBrowserJavaScriptEnabled, riskv1authenticationsDeviceInformation.httpBrowserJavaScriptEnabled) &&
        Objects.equals(this.httpBrowserColorDepth, riskv1authenticationsDeviceInformation.httpBrowserColorDepth) &&
        Objects.equals(this.httpBrowserScreenHeight, riskv1authenticationsDeviceInformation.httpBrowserScreenHeight) &&
        Objects.equals(this.httpBrowserScreenWidth, riskv1authenticationsDeviceInformation.httpBrowserScreenWidth) &&
        Objects.equals(this.httpBrowserTimeDifference, riskv1authenticationsDeviceInformation.httpBrowserTimeDifference) &&
        Objects.equals(this.userAgentBrowserValue, riskv1authenticationsDeviceInformation.userAgentBrowserValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, rawData, httpAcceptBrowserValue, httpAcceptContent, httpBrowserLanguage, httpBrowserJavaEnabled, httpBrowserJavaScriptEnabled, httpBrowserColorDepth, httpBrowserScreenHeight, httpBrowserScreenWidth, httpBrowserTimeDifference, userAgentBrowserValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsDeviceInformation {\n");
    
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    rawData: ").append(toIndentedString(rawData)).append("\n");
    sb.append("    httpAcceptBrowserValue: ").append(toIndentedString(httpAcceptBrowserValue)).append("\n");
    sb.append("    httpAcceptContent: ").append(toIndentedString(httpAcceptContent)).append("\n");
    sb.append("    httpBrowserLanguage: ").append(toIndentedString(httpBrowserLanguage)).append("\n");
    sb.append("    httpBrowserJavaEnabled: ").append(toIndentedString(httpBrowserJavaEnabled)).append("\n");
    sb.append("    httpBrowserJavaScriptEnabled: ").append(toIndentedString(httpBrowserJavaScriptEnabled)).append("\n");
    sb.append("    httpBrowserColorDepth: ").append(toIndentedString(httpBrowserColorDepth)).append("\n");
    sb.append("    httpBrowserScreenHeight: ").append(toIndentedString(httpBrowserScreenHeight)).append("\n");
    sb.append("    httpBrowserScreenWidth: ").append(toIndentedString(httpBrowserScreenWidth)).append("\n");
    sb.append("    httpBrowserTimeDifference: ").append(toIndentedString(httpBrowserTimeDifference)).append("\n");
    sb.append("    userAgentBrowserValue: ").append(toIndentedString(userAgentBrowserValue)).append("\n");
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

