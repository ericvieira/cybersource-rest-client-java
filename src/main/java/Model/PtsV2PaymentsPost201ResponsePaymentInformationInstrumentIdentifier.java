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
 * PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier {
  @SerializedName("id")
  private String id = null;

  @SerializedName("state")
  private String state = null;

  public PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the Instrument Identifier token used in the transaction. When you include this value in your request, many of the fields that can be supplied for an authorization or credit become optional. 
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for the Instrument Identifier token used in the transaction. When you include this value in your request, many of the fields that can be supplied for an authorization or credit become optional. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Issuers state for the card number. Valid values: - ACTIVE - CLOSED : The account has been closed. 
   * @return state
  **/
  @ApiModelProperty(value = "Issuers state for the card number. Valid values: - ACTIVE - CLOSED : The account has been closed. ")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier ptsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier = (PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier) o;
    return Objects.equals(this.id, ptsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier.id) &&
        Objects.equals(this.state, ptsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

