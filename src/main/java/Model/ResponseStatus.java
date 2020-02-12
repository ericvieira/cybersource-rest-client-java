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
import Model.InlineResponseDefaultResponseStatusDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ResponseStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-12T15:59:24.815+05:30")
public class ResponseStatus {
  @SerializedName("status")
  private BigDecimal status = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("correlationId")
  private String correlationId = null;

  @SerializedName("details")
  private List<InlineResponseDefaultResponseStatusDetails> details = null;

  public ResponseStatus status(BigDecimal status) {
    this.status = status;
    return this;
  }

   /**
   * HTTP Status code.
   * @return status
  **/
  @ApiModelProperty(value = "HTTP Status code.")
  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public ResponseStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Error Reason Code.
   * @return reason
  **/
  @ApiModelProperty(value = "Error Reason Code.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ResponseStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error Message.
   * @return message
  **/
  @ApiModelProperty(value = "Error Message.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ResponseStatus correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * API correlation ID.
   * @return correlationId
  **/
  @ApiModelProperty(value = "API correlation ID.")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public ResponseStatus details(List<InlineResponseDefaultResponseStatusDetails> details) {
    this.details = details;
    return this;
  }

  public ResponseStatus addDetailsItem(InlineResponseDefaultResponseStatusDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<InlineResponseDefaultResponseStatusDetails>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponseDefaultResponseStatusDetails> getDetails() {
    return details;
  }

  public void setDetails(List<InlineResponseDefaultResponseStatusDetails> details) {
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
    ResponseStatus responseStatus = (ResponseStatus) o;
    return Objects.equals(this.status, responseStatus.status) &&
        Objects.equals(this.reason, responseStatus.reason) &&
        Objects.equals(this.message, responseStatus.message) &&
        Objects.equals(this.correlationId, responseStatus.correlationId) &&
        Objects.equals(this.details, responseStatus.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reason, message, correlationId, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
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

