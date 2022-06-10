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
import Model.ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails;
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
import org.joda.time.DateTime;

/**
 * ReportingV3RetrievalDetailsGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-10T13:11:55.460+05:30")
public class ReportingV3RetrievalDetailsGet200Response {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("endTime")
  private DateTime endTime = null;

  @SerializedName("retrievalDetails")
  private List<ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails> retrievalDetails = null;

  public ReportingV3RetrievalDetailsGet200Response organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Organization Id
   * @return organizationId
  **/
  @ApiModelProperty(example = "testrest", value = "Organization Id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public ReportingV3RetrievalDetailsGet200Response startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Report Start Date (ISO 8601 Extended)
   * @return startTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Report Start Date (ISO 8601 Extended)")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public ReportingV3RetrievalDetailsGet200Response endTime(DateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Report Start Date (ISO 8601 Extended)
   * @return endTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Report Start Date (ISO 8601 Extended)")
  public DateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(DateTime endTime) {
    this.endTime = endTime;
  }

  public ReportingV3RetrievalDetailsGet200Response retrievalDetails(List<ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails> retrievalDetails) {
    this.retrievalDetails = retrievalDetails;
    return this;
  }

  public ReportingV3RetrievalDetailsGet200Response addRetrievalDetailsItem(ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails retrievalDetailsItem) {
    if (this.retrievalDetails == null) {
      this.retrievalDetails = new ArrayList<ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails>();
    }
    this.retrievalDetails.add(retrievalDetailsItem);
    return this;
  }

   /**
   * List of Retrieval Details list.
   * @return retrievalDetails
  **/
  @ApiModelProperty(value = "List of Retrieval Details list.")
  public List<ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails> getRetrievalDetails() {
    return retrievalDetails;
  }

  public void setRetrievalDetails(List<ReportingV3RetrievalDetailsGet200ResponseRetrievalDetails> retrievalDetails) {
    this.retrievalDetails = retrievalDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3RetrievalDetailsGet200Response reportingV3RetrievalDetailsGet200Response = (ReportingV3RetrievalDetailsGet200Response) o;
    return Objects.equals(this.organizationId, reportingV3RetrievalDetailsGet200Response.organizationId) &&
        Objects.equals(this.startTime, reportingV3RetrievalDetailsGet200Response.startTime) &&
        Objects.equals(this.endTime, reportingV3RetrievalDetailsGet200Response.endTime) &&
        Objects.equals(this.retrievalDetails, reportingV3RetrievalDetailsGet200Response.retrievalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, startTime, endTime, retrievalDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3RetrievalDetailsGet200Response {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    retrievalDetails: ").append(toIndentedString(retrievalDetails)).append("\n");
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

