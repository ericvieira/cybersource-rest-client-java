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
import Model.PtsV2PaymentsPost201ResponsePaymentAccountInformationCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PaymentsPost201ResponsePaymentAccountInformation
 */

public class PtsV2PaymentsPost201ResponsePaymentAccountInformation {
  @SerializedName("card")
  private PtsV2PaymentsPost201ResponsePaymentAccountInformationCard card = null;

  public PtsV2PaymentsPost201ResponsePaymentAccountInformation card(PtsV2PaymentsPost201ResponsePaymentAccountInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentAccountInformationCard getCard() {
    return card;
  }

  public void setCard(PtsV2PaymentsPost201ResponsePaymentAccountInformationCard card) {
    this.card = card;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponsePaymentAccountInformation ptsV2PaymentsPost201ResponsePaymentAccountInformation = (PtsV2PaymentsPost201ResponsePaymentAccountInformation) o;
    return Objects.equals(this.card, ptsV2PaymentsPost201ResponsePaymentAccountInformation.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponsePaymentAccountInformation {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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

