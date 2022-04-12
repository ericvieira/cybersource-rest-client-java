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
import Model.PtsV2PaymentsPost201ResponseErrorInformationDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RiskV1DecisionsPost201ResponseErrorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-12T09:56:59.728+05:30")
public class RiskV1DecisionsPost201ResponseErrorInformation {
  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details = null;

  public RiskV1DecisionsPost201ResponseErrorInformation reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason of the status.  Possible values:  - &#x60;EXPIRED_CARD&#x60;  - &#x60;SCORE_EXCEEDS_THRESHOLD&#x60;  - &#x60;DECISION_PROFILE_REVIEW&#x60;  - &#x60;DECISION_PROFILE_REJECT&#x60;  - &#x60;CONSUMER_AUTHENTICATION_REQUIRED&#x60;  - &#x60;INVALID_MERCHANT_CONFIGURATION&#x60;  - &#x60;CONSUMER_AUTHENTICATION_FAILED&#x60;  - &#x60;DECISION_PROFILE_CHALLENGE&#x60; 
   * @return reason
  **/
  @ApiModelProperty(value = "The reason of the status.  Possible values:  - `EXPIRED_CARD`  - `SCORE_EXCEEDS_THRESHOLD`  - `DECISION_PROFILE_REVIEW`  - `DECISION_PROFILE_REJECT`  - `CONSUMER_AUTHENTICATION_REQUIRED`  - `INVALID_MERCHANT_CONFIGURATION`  - `CONSUMER_AUTHENTICATION_FAILED`  - `DECISION_PROFILE_CHALLENGE` ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public RiskV1DecisionsPost201ResponseErrorInformation message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The detail message related to the status and reason listed above.
   * @return message
  **/
  @ApiModelProperty(value = "The detail message related to the status and reason listed above.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RiskV1DecisionsPost201ResponseErrorInformation details(List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details) {
    this.details = details;
    return this;
  }

  public RiskV1DecisionsPost201ResponseErrorInformation addDetailsItem(PtsV2PaymentsPost201ResponseErrorInformationDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<PtsV2PaymentsPost201ResponseErrorInformationDetails>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<PtsV2PaymentsPost201ResponseErrorInformationDetails> getDetails() {
    return details;
  }

  public void setDetails(List<PtsV2PaymentsPost201ResponseErrorInformationDetails> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1DecisionsPost201ResponseErrorInformation riskV1DecisionsPost201ResponseErrorInformation = (RiskV1DecisionsPost201ResponseErrorInformation) o;
    return Objects.equals(this.reason, riskV1DecisionsPost201ResponseErrorInformation.reason) &&
        Objects.equals(this.message, riskV1DecisionsPost201ResponseErrorInformation.message) &&
        Objects.equals(this.details, riskV1DecisionsPost201ResponseErrorInformation.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1DecisionsPost201ResponseErrorInformation {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

