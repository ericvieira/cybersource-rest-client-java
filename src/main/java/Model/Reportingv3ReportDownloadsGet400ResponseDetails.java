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
 * Provides failed validation input field detail 
 */
@ApiModel(description = "Provides failed validation input field detail ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-07T13:59:51.194+05:30")
public class Reportingv3ReportDownloadsGet400ResponseDetails {
  @SerializedName("field")
  private String field = null;

  @SerializedName("reason")
  private String reason = null;

  public Reportingv3ReportDownloadsGet400ResponseDetails field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Field in request that caused an error 
   * @return field
  **/
  @ApiModelProperty(value = "Field in request that caused an error ")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public Reportingv3ReportDownloadsGet400ResponseDetails reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Documented reason code 
   * @return reason
  **/
  @ApiModelProperty(value = "Documented reason code ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reportingv3ReportDownloadsGet400ResponseDetails reportingv3ReportDownloadsGet400ResponseDetails = (Reportingv3ReportDownloadsGet400ResponseDetails) o;
    return Objects.equals(this.field, reportingv3ReportDownloadsGet400ResponseDetails.field) &&
        Objects.equals(this.reason, reportingv3ReportDownloadsGet400ResponseDetails.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reportingv3ReportDownloadsGet400ResponseDetails {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

