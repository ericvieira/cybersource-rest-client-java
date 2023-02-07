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
import Model.PtsV2PaymentsPost201ResponseLinksSelf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VasV2PaymentsPost201ResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class VasV2PaymentsPost201ResponseLinks {
  @SerializedName("void")
  private PtsV2PaymentsPost201ResponseLinksSelf _void = null;

  public VasV2PaymentsPost201ResponseLinks _void(PtsV2PaymentsPost201ResponseLinksSelf _void) {
    this._void = _void;
    return this;
  }

   /**
   * Get _void
   * @return _void
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseLinksSelf getVoid() {
    return _void;
  }

  public void setVoid(PtsV2PaymentsPost201ResponseLinksSelf _void) {
    this._void = _void;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VasV2PaymentsPost201ResponseLinks vasV2PaymentsPost201ResponseLinks = (VasV2PaymentsPost201ResponseLinks) o;
    return Objects.equals(this._void, vasV2PaymentsPost201ResponseLinks._void);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_void);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VasV2PaymentsPost201ResponseLinks {\n");
    
    sb.append("    _void: ").append(toIndentedString(_void)).append("\n");
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

