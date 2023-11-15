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
 * Optional configuration object for if your API or server requires oAuth for an incoming webhook.
 */
@ApiModel(description = "Optional configuration object for if your API or server requires oAuth for an incoming webhook.")

public class Notificationsubscriptionsv1webhooksSecurityPolicyConfig {
  @SerializedName("oAuthTokenExpiry")
  private String oAuthTokenExpiry = null;

  @SerializedName("oAuthURL")
  private String oAuthURL = null;

  @SerializedName("oAuthTokenType")
  private String oAuthTokenType = null;

  public Notificationsubscriptionsv1webhooksSecurityPolicyConfig oAuthTokenExpiry(String oAuthTokenExpiry) {
    this.oAuthTokenExpiry = oAuthTokenExpiry;
    return this;
  }

   /**
   * Token expiration for the oAuth server.
   * @return oAuthTokenExpiry
  **/
  @ApiModelProperty(value = "Token expiration for the oAuth server.")
  public String getOAuthTokenExpiry() {
    return oAuthTokenExpiry;
  }

  public void setOAuthTokenExpiry(String oAuthTokenExpiry) {
    this.oAuthTokenExpiry = oAuthTokenExpiry;
  }

  public Notificationsubscriptionsv1webhooksSecurityPolicyConfig oAuthURL(String oAuthURL) {
    this.oAuthURL = oAuthURL;
    return this;
  }

   /**
   * Client direct endpoint to the oAuth server.
   * @return oAuthURL
  **/
  @ApiModelProperty(value = "Client direct endpoint to the oAuth server.")
  public String getOAuthURL() {
    return oAuthURL;
  }

  public void setOAuthURL(String oAuthURL) {
    this.oAuthURL = oAuthURL;
  }

  public Notificationsubscriptionsv1webhooksSecurityPolicyConfig oAuthTokenType(String oAuthTokenType) {
    this.oAuthTokenType = oAuthTokenType;
    return this;
  }

   /**
   * Token type for the oAuth config.
   * @return oAuthTokenType
  **/
  @ApiModelProperty(value = "Token type for the oAuth config.")
  public String getOAuthTokenType() {
    return oAuthTokenType;
  }

  public void setOAuthTokenType(String oAuthTokenType) {
    this.oAuthTokenType = oAuthTokenType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notificationsubscriptionsv1webhooksSecurityPolicyConfig notificationsubscriptionsv1webhooksSecurityPolicyConfig = (Notificationsubscriptionsv1webhooksSecurityPolicyConfig) o;
    return Objects.equals(this.oAuthTokenExpiry, notificationsubscriptionsv1webhooksSecurityPolicyConfig.oAuthTokenExpiry) &&
        Objects.equals(this.oAuthURL, notificationsubscriptionsv1webhooksSecurityPolicyConfig.oAuthURL) &&
        Objects.equals(this.oAuthTokenType, notificationsubscriptionsv1webhooksSecurityPolicyConfig.oAuthTokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oAuthTokenExpiry, oAuthURL, oAuthTokenType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificationsubscriptionsv1webhooksSecurityPolicyConfig {\n");
    
    sb.append("    oAuthTokenExpiry: ").append(toIndentedString(oAuthTokenExpiry)).append("\n");
    sb.append("    oAuthURL: ").append(toIndentedString(oAuthURL)).append("\n");
    sb.append("    oAuthTokenType: ").append(toIndentedString(oAuthTokenType)).append("\n");
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

