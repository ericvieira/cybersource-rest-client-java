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
import Model.Ptsv1pushfundstransferRecipientInformationPaymentInformationCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv1pushfundstransferRecipientInformationPaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class Ptsv1pushfundstransferRecipientInformationPaymentInformation {
  @SerializedName("card")
  private Ptsv1pushfundstransferRecipientInformationPaymentInformationCard card = null;

  public Ptsv1pushfundstransferRecipientInformationPaymentInformation card(Ptsv1pushfundstransferRecipientInformationPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Ptsv1pushfundstransferRecipientInformationPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(Ptsv1pushfundstransferRecipientInformationPaymentInformationCard card) {
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
    Ptsv1pushfundstransferRecipientInformationPaymentInformation ptsv1pushfundstransferRecipientInformationPaymentInformation = (Ptsv1pushfundstransferRecipientInformationPaymentInformation) o;
    return Objects.equals(this.card, ptsv1pushfundstransferRecipientInformationPaymentInformation.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv1pushfundstransferRecipientInformationPaymentInformation {\n");
    
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

