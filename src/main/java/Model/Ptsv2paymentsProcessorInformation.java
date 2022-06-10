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
import Model.Ptsv2paymentsProcessorInformationAuthorizationOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Processor Information
 */
@ApiModel(description = "Processor Information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-10T13:11:55.460+05:30")
public class Ptsv2paymentsProcessorInformation {
  @SerializedName("preApprovalToken")
  private String preApprovalToken = null;

  @SerializedName("authorizationOptions")
  private Ptsv2paymentsProcessorInformationAuthorizationOptions authorizationOptions = null;

  public Ptsv2paymentsProcessorInformation preApprovalToken(String preApprovalToken) {
    this.preApprovalToken = preApprovalToken;
    return this;
  }

   /**
   * Token received in original session service.
   * @return preApprovalToken
  **/
  @ApiModelProperty(value = "Token received in original session service.")
  public String getPreApprovalToken() {
    return preApprovalToken;
  }

  public void setPreApprovalToken(String preApprovalToken) {
    this.preApprovalToken = preApprovalToken;
  }

  public Ptsv2paymentsProcessorInformation authorizationOptions(Ptsv2paymentsProcessorInformationAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
    return this;
  }

   /**
   * Get authorizationOptions
   * @return authorizationOptions
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsProcessorInformationAuthorizationOptions getAuthorizationOptions() {
    return authorizationOptions;
  }

  public void setAuthorizationOptions(Ptsv2paymentsProcessorInformationAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsProcessorInformation ptsv2paymentsProcessorInformation = (Ptsv2paymentsProcessorInformation) o;
    return Objects.equals(this.preApprovalToken, ptsv2paymentsProcessorInformation.preApprovalToken) &&
        Objects.equals(this.authorizationOptions, ptsv2paymentsProcessorInformation.authorizationOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preApprovalToken, authorizationOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsProcessorInformation {\n");
    
    sb.append("    preApprovalToken: ").append(toIndentedString(preApprovalToken)).append("\n");
    sb.append("    authorizationOptions: ").append(toIndentedString(authorizationOptions)).append("\n");
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

