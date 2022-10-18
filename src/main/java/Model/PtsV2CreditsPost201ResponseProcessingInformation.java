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
import Model.PtsV2CreditsPost201ResponseProcessingInformationBankTransferOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2CreditsPost201ResponseProcessingInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-17T14:26:30.480+05:30")
public class PtsV2CreditsPost201ResponseProcessingInformation {
  @SerializedName("bankTransferOptions")
  private PtsV2CreditsPost201ResponseProcessingInformationBankTransferOptions bankTransferOptions = null;

  @SerializedName("enhancedDataEnabled")
  private Boolean enhancedDataEnabled = null;

  public PtsV2CreditsPost201ResponseProcessingInformation bankTransferOptions(PtsV2CreditsPost201ResponseProcessingInformationBankTransferOptions bankTransferOptions) {
    this.bankTransferOptions = bankTransferOptions;
    return this;
  }

   /**
   * Get bankTransferOptions
   * @return bankTransferOptions
  **/
  @ApiModelProperty(value = "")
  public PtsV2CreditsPost201ResponseProcessingInformationBankTransferOptions getBankTransferOptions() {
    return bankTransferOptions;
  }

  public void setBankTransferOptions(PtsV2CreditsPost201ResponseProcessingInformationBankTransferOptions bankTransferOptions) {
    this.bankTransferOptions = bankTransferOptions;
  }

  public PtsV2CreditsPost201ResponseProcessingInformation enhancedDataEnabled(Boolean enhancedDataEnabled) {
    this.enhancedDataEnabled = enhancedDataEnabled;
    return this;
  }

   /**
   * The possible values for the reply field are: - &#x60;true&#x60; : the airline data was included in the request to the processor. - &#x60;false&#x60; : the airline data was not included in the request to the processor.  Returned by authorization, capture, or credit services. 
   * @return enhancedDataEnabled
  **/
  @ApiModelProperty(value = "The possible values for the reply field are: - `true` : the airline data was included in the request to the processor. - `false` : the airline data was not included in the request to the processor.  Returned by authorization, capture, or credit services. ")
  public Boolean getEnhancedDataEnabled() {
    return enhancedDataEnabled;
  }

  public void setEnhancedDataEnabled(Boolean enhancedDataEnabled) {
    this.enhancedDataEnabled = enhancedDataEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2CreditsPost201ResponseProcessingInformation ptsV2CreditsPost201ResponseProcessingInformation = (PtsV2CreditsPost201ResponseProcessingInformation) o;
    return Objects.equals(this.bankTransferOptions, ptsV2CreditsPost201ResponseProcessingInformation.bankTransferOptions) &&
        Objects.equals(this.enhancedDataEnabled, ptsV2CreditsPost201ResponseProcessingInformation.enhancedDataEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankTransferOptions, enhancedDataEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2CreditsPost201ResponseProcessingInformation {\n");
    
    sb.append("    bankTransferOptions: ").append(toIndentedString(bankTransferOptions)).append("\n");
    sb.append("    enhancedDataEnabled: ").append(toIndentedString(enhancedDataEnabled)).append("\n");
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

