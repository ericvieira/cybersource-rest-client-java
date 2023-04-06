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
import Model.Ptsv2payoutsProcessingInformationFundingOptionsInitiator;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2payoutsProcessingInformationFundingOptions
 */

public class Ptsv2payoutsProcessingInformationFundingOptions {
  @SerializedName("initiator")
  private Ptsv2payoutsProcessingInformationFundingOptionsInitiator initiator = null;

  public Ptsv2payoutsProcessingInformationFundingOptions initiator(Ptsv2payoutsProcessingInformationFundingOptionsInitiator initiator) {
    this.initiator = initiator;
    return this;
  }

   /**
   * Get initiator
   * @return initiator
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsProcessingInformationFundingOptionsInitiator getInitiator() {
    return initiator;
  }

  public void setInitiator(Ptsv2payoutsProcessingInformationFundingOptionsInitiator initiator) {
    this.initiator = initiator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2payoutsProcessingInformationFundingOptions ptsv2payoutsProcessingInformationFundingOptions = (Ptsv2payoutsProcessingInformationFundingOptions) o;
    return Objects.equals(this.initiator, ptsv2payoutsProcessingInformationFundingOptions.initiator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2payoutsProcessingInformationFundingOptions {\n");
    
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
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

