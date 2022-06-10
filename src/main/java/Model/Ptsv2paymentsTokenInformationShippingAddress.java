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
 * Ptsv2paymentsTokenInformationShippingAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-10T13:11:55.460+05:30")
public class Ptsv2paymentsTokenInformationShippingAddress {
  @SerializedName("default")
  private Boolean _default = false;

  public Ptsv2paymentsTokenInformationShippingAddress _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Flag that specifies if the Shipping Address should be made the Customers default. Possible values: - true - false : (default) 
   * @return _default
  **/
  @ApiModelProperty(value = "Flag that specifies if the Shipping Address should be made the Customers default. Possible values: - true - false : (default) ")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTokenInformationShippingAddress ptsv2paymentsTokenInformationShippingAddress = (Ptsv2paymentsTokenInformationShippingAddress) o;
    return Objects.equals(this._default, ptsv2paymentsTokenInformationShippingAddress._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTokenInformationShippingAddress {\n");
    
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

