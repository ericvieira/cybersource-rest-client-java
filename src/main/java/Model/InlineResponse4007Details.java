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
 * InlineResponse4007Details
 */

public class InlineResponse4007Details {
  @SerializedName("field")
  private String field = null;

  @SerializedName("reason")
  private String reason = null;

  public InlineResponse4007Details field(String field) {
    this.field = field;
    return this;
  }

   /**
   * This is the flattened JSON object field name/path that is either missing or invalid.
   * @return field
  **/
  @ApiModelProperty(value = "This is the flattened JSON object field name/path that is either missing or invalid.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public InlineResponse4007Details reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Possible reasons for the error.
   * @return reason
  **/
  @ApiModelProperty(example = "MISSING_FIELD", value = "Possible reasons for the error.")
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
    InlineResponse4007Details inlineResponse4007Details = (InlineResponse4007Details) o;
    return Objects.equals(this.field, inlineResponse4007Details.field) &&
        Objects.equals(this.reason, inlineResponse4007Details.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4007Details {\n");
    
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

