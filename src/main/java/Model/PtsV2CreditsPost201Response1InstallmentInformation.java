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
 * PtsV2CreditsPost201Response1InstallmentInformation
 */

public class PtsV2CreditsPost201Response1InstallmentInformation {
  @SerializedName("identifier")
  private String identifier = null;

  public PtsV2CreditsPost201Response1InstallmentInformation identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Identifier 
   * @return identifier
  **/
  @ApiModelProperty(value = "Identifier ")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2CreditsPost201Response1InstallmentInformation ptsV2CreditsPost201Response1InstallmentInformation = (PtsV2CreditsPost201Response1InstallmentInformation) o;
    return Objects.equals(this.identifier, ptsV2CreditsPost201Response1InstallmentInformation.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2CreditsPost201Response1InstallmentInformation {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

