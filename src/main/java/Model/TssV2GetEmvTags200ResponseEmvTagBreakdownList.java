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
 * TssV2GetEmvTags200ResponseEmvTagBreakdownList
 */

public class TssV2GetEmvTags200ResponseEmvTagBreakdownList {
  @SerializedName("tag")
  private String tag = null;

  @SerializedName("name")
  private String name = null;

  public TssV2GetEmvTags200ResponseEmvTagBreakdownList tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Hexadecimal code of tag. 
   * @return tag
  **/
  @ApiModelProperty(value = "Hexadecimal code of tag. ")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public TssV2GetEmvTags200ResponseEmvTagBreakdownList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of tag. 
   * @return name
  **/
  @ApiModelProperty(value = "Name of tag. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2GetEmvTags200ResponseEmvTagBreakdownList tssV2GetEmvTags200ResponseEmvTagBreakdownList = (TssV2GetEmvTags200ResponseEmvTagBreakdownList) o;
    return Objects.equals(this.tag, tssV2GetEmvTags200ResponseEmvTagBreakdownList.tag) &&
        Objects.equals(this.name, tssV2GetEmvTags200ResponseEmvTagBreakdownList.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2GetEmvTags200ResponseEmvTagBreakdownList {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

