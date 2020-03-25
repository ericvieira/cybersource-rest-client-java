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
 * Provide validation failed input field details
 */
@ApiModel(description = "Provide validation failed input field details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-26T01:49:30.319+05:30")
public class ErrorFieldBean {
  @SerializedName("path")
  private String path = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("localizationKey")
  private String localizationKey = null;

  public ErrorFieldBean path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path of the failed property
   * @return path
  **/
  @ApiModelProperty(value = "Path of the failed property")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ErrorFieldBean message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error description about validation failed field
   * @return message
  **/
  @ApiModelProperty(value = "Error description about validation failed field")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorFieldBean localizationKey(String localizationKey) {
    this.localizationKey = localizationKey;
    return this;
  }

   /**
   * Localized Key Name
   * @return localizationKey
  **/
  @ApiModelProperty(value = "Localized Key Name")
  public String getLocalizationKey() {
    return localizationKey;
  }

  public void setLocalizationKey(String localizationKey) {
    this.localizationKey = localizationKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorFieldBean errorFieldBean = (ErrorFieldBean) o;
    return Objects.equals(this.path, errorFieldBean.path) &&
        Objects.equals(this.message, errorFieldBean.message) &&
        Objects.equals(this.localizationKey, errorFieldBean.localizationKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, message, localizationKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorFieldBean {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    localizationKey: ").append(toIndentedString(localizationKey)).append("\n");
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

