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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * InlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus
 */

public class InlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus {
  @SerializedName("configurationId")
  private UUID configurationId = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    
    PARTIAL("PARTIAL"),
    
    PENDING("PENDING"),
    
    NOT_SETUP("NOT_SETUP");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  /**
   * Gets or Sets reason
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    PENDING_PROVISIONING_PROCESS("PENDING_PROVISIONING_PROCESS"),
    
    MISSING_DATA("MISSING_DATA"),
    
    INVALID_DATA("INVALID_DATA"),
    
    DUPLICATE_FIELD("DUPLICATE_FIELD"),
    
    NOT_APPLICABLE("NOT_APPLICABLE");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String text) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reason")
  private ReasonEnum reason = null;

  @SerializedName("details")
  private List<Map<String, String>> details = null;

  @SerializedName("message")
  private String message = null;

  public InlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus configurationId(UUID configurationId) {
    this.configurationId = configurationId;
    return this;
  }

   /**
   * This is NOT for MVP
   * @return configurationId
  **/
  @ApiModelProperty(value = "This is NOT for MVP")
  public UUID getConfigurationId() {
    return configurationId;
  }

  public void setConfigurationId(UUID configurationId) {
    this.configurationId = configurationId;
  }

  public InlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public InlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. `Format: YYYY-MM-DDThh:mm:ssZ`  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public InlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public InlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public InlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus details(List<Map<String, String>> details) {
    this.details = details;
    return this;
  }

  public InlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus addDetailsItem(Map<String, String> detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<Map<String, String>>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<Map<String, String>> getDetails() {
    return details;
  }

  public void setDetails(List<Map<String, String>> details) {
    this.details = details;
  }

  public InlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus inlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus = (InlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus) o;
    return Objects.equals(this.configurationId, inlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus.configurationId) &&
        Objects.equals(this.version, inlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus.version) &&
        Objects.equals(this.submitTimeUtc, inlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus.submitTimeUtc) &&
        Objects.equals(this.status, inlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus.status) &&
        Objects.equals(this.reason, inlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus.reason) &&
        Objects.equals(this.details, inlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus.details) &&
        Objects.equals(this.message, inlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationId, version, submitTimeUtc, status, reason, details, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2011SetupsPaymentsCardProcessingConfigurationStatus {\n");
    
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

