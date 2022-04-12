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
import Model.Reportingv3reportsReportFilters;
import Model.Reportingv3reportsReportPreferences;
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
 * CreateAdhocReportRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-12T09:56:59.728+05:30")
public class CreateAdhocReportRequest {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("reportDefinitionName")
  private String reportDefinitionName = null;

  @SerializedName("reportFields")
  private List<String> reportFields = null;

  @SerializedName("reportMimeType")
  private String reportMimeType = null;

  @SerializedName("reportName")
  private String reportName = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("reportStartTime")
  private DateTime reportStartTime = null;

  @SerializedName("reportEndTime")
  private DateTime reportEndTime = null;

  @SerializedName("reportFilters")
  private Reportingv3reportsReportFilters reportFilters = null;

  @SerializedName("reportPreferences")
  private Reportingv3reportsReportPreferences reportPreferences = null;

  @SerializedName("groupName")
  private String groupName = null;

  public CreateAdhocReportRequest organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Valid CyberSource Organization Id
   * @return organizationId
  **/
  @ApiModelProperty(example = "Test_Merchatnt_id", value = "Valid CyberSource Organization Id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public CreateAdhocReportRequest reportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
    return this;
  }

   /**
   * Get reportDefinitionName
   * @return reportDefinitionName
  **/
  @ApiModelProperty(example = "TransactionRequestClass", value = "")
  public String getReportDefinitionName() {
    return reportDefinitionName;
  }

  public void setReportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
  }

  public CreateAdhocReportRequest reportFields(List<String> reportFields) {
    this.reportFields = reportFields;
    return this;
  }

  public CreateAdhocReportRequest addReportFieldsItem(String reportFieldsItem) {
    if (this.reportFields == null) {
      this.reportFields = new ArrayList<String>();
    }
    this.reportFields.add(reportFieldsItem);
    return this;
  }

   /**
   * List of fields which needs to get included in a report
   * @return reportFields
  **/
  @ApiModelProperty(example = "[\"Request.RequestID\",\"Request.TransactionDate\",\"Request.MerchantID\"]", value = "List of fields which needs to get included in a report")
  public List<String> getReportFields() {
    return reportFields;
  }

  public void setReportFields(List<String> reportFields) {
    this.reportFields = reportFields;
  }

  public CreateAdhocReportRequest reportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
    return this;
  }

   /**
   * &#39;Format of the report&#39;                  Valid values: - application/xml - text/csv 
   * @return reportMimeType
  **/
  @ApiModelProperty(example = "application/xml", value = "'Format of the report'                  Valid values: - application/xml - text/csv ")
  public String getReportMimeType() {
    return reportMimeType;
  }

  public void setReportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
  }

  public CreateAdhocReportRequest reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Name of the report
   * @return reportName
  **/
  @ApiModelProperty(example = "My Transaction Request report", value = "Name of the report")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public CreateAdhocReportRequest timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone of the report
   * @return timezone
  **/
  @ApiModelProperty(example = "America/Chicago", value = "Timezone of the report")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public CreateAdhocReportRequest reportStartTime(DateTime reportStartTime) {
    this.reportStartTime = reportStartTime;
    return this;
  }

   /**
   * Start time of the report
   * @return reportStartTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Start time of the report")
  public DateTime getReportStartTime() {
    return reportStartTime;
  }

  public void setReportStartTime(DateTime reportStartTime) {
    this.reportStartTime = reportStartTime;
  }

  public CreateAdhocReportRequest reportEndTime(DateTime reportEndTime) {
    this.reportEndTime = reportEndTime;
    return this;
  }

   /**
   * End time of the report
   * @return reportEndTime
  **/
  @ApiModelProperty(example = "2017-10-02T10:10:10+05:00", value = "End time of the report")
  public DateTime getReportEndTime() {
    return reportEndTime;
  }

  public void setReportEndTime(DateTime reportEndTime) {
    this.reportEndTime = reportEndTime;
  }

  public CreateAdhocReportRequest reportFilters(Reportingv3reportsReportFilters reportFilters) {
    this.reportFilters = reportFilters;
    return this;
  }

   /**
   * Get reportFilters
   * @return reportFilters
  **/
  @ApiModelProperty(value = "")
  public Reportingv3reportsReportFilters getReportFilters() {
    return reportFilters;
  }

  public void setReportFilters(Reportingv3reportsReportFilters reportFilters) {
    this.reportFilters = reportFilters;
  }

  public CreateAdhocReportRequest reportPreferences(Reportingv3reportsReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
    return this;
  }

   /**
   * Get reportPreferences
   * @return reportPreferences
  **/
  @ApiModelProperty(value = "")
  public Reportingv3reportsReportPreferences getReportPreferences() {
    return reportPreferences;
  }

  public void setReportPreferences(Reportingv3reportsReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
  }

  public CreateAdhocReportRequest groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Specifies the group name
   * @return groupName
  **/
  @ApiModelProperty(example = "myGroup", value = "Specifies the group name")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAdhocReportRequest createAdhocReportRequest = (CreateAdhocReportRequest) o;
    return Objects.equals(this.organizationId, createAdhocReportRequest.organizationId) &&
        Objects.equals(this.reportDefinitionName, createAdhocReportRequest.reportDefinitionName) &&
        Objects.equals(this.reportFields, createAdhocReportRequest.reportFields) &&
        Objects.equals(this.reportMimeType, createAdhocReportRequest.reportMimeType) &&
        Objects.equals(this.reportName, createAdhocReportRequest.reportName) &&
        Objects.equals(this.timezone, createAdhocReportRequest.timezone) &&
        Objects.equals(this.reportStartTime, createAdhocReportRequest.reportStartTime) &&
        Objects.equals(this.reportEndTime, createAdhocReportRequest.reportEndTime) &&
        Objects.equals(this.reportFilters, createAdhocReportRequest.reportFilters) &&
        Objects.equals(this.reportPreferences, createAdhocReportRequest.reportPreferences) &&
        Objects.equals(this.groupName, createAdhocReportRequest.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, reportDefinitionName, reportFields, reportMimeType, reportName, timezone, reportStartTime, reportEndTime, reportFilters, reportPreferences, groupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAdhocReportRequest {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    reportDefinitionName: ").append(toIndentedString(reportDefinitionName)).append("\n");
    sb.append("    reportFields: ").append(toIndentedString(reportFields)).append("\n");
    sb.append("    reportMimeType: ").append(toIndentedString(reportMimeType)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    reportStartTime: ").append(toIndentedString(reportStartTime)).append("\n");
    sb.append("    reportEndTime: ").append(toIndentedString(reportEndTime)).append("\n");
    sb.append("    reportFilters: ").append(toIndentedString(reportFilters)).append("\n");
    sb.append("    reportPreferences: ").append(toIndentedString(reportPreferences)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

