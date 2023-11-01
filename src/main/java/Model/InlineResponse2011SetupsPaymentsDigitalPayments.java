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
import Model.InlineResponse2011SetupsPaymentsCardProcessingSubscriptionStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse2011SetupsPaymentsDigitalPayments
 */

public class InlineResponse2011SetupsPaymentsDigitalPayments {
  @SerializedName("subscriptionStatus")
  private InlineResponse2011SetupsPaymentsCardProcessingSubscriptionStatus subscriptionStatus = null;

  public InlineResponse2011SetupsPaymentsDigitalPayments subscriptionStatus(InlineResponse2011SetupsPaymentsCardProcessingSubscriptionStatus subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
    return this;
  }

   /**
   * Get subscriptionStatus
   * @return subscriptionStatus
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2011SetupsPaymentsCardProcessingSubscriptionStatus getSubscriptionStatus() {
    return subscriptionStatus;
  }

  public void setSubscriptionStatus(InlineResponse2011SetupsPaymentsCardProcessingSubscriptionStatus subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2011SetupsPaymentsDigitalPayments inlineResponse2011SetupsPaymentsDigitalPayments = (InlineResponse2011SetupsPaymentsDigitalPayments) o;
    return Objects.equals(this.subscriptionStatus, inlineResponse2011SetupsPaymentsDigitalPayments.subscriptionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2011SetupsPaymentsDigitalPayments {\n");
    
    sb.append("    subscriptionStatus: ").append(toIndentedString(subscriptionStatus)).append("\n");
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

