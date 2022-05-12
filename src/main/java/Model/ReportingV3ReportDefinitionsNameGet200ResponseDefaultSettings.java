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
import Model.Reportingv3reportsReportPreferences;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-12T17:46:06.587+05:30")
public class ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings {
  @SerializedName("reportMimeType")
  private String reportMimeType = null;

  @SerializedName("reportFrequency")
  private String reportFrequency = null;

  @SerializedName("reportName")
  private String reportName = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("startDay")
  private Integer startDay = null;

  @SerializedName("reportFilters")
  private Map<String, List<String>> reportFilters = null;

  @SerializedName("reportPreferences")
  private Reportingv3reportsReportPreferences reportPreferences = null;

  public ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings reportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
    return this;
  }

   /**
   * Report Format Valid values:   - application/xml   - text/csv 
   * @return reportMimeType
  **/
  @ApiModelProperty(example = "application/xml", value = "Report Format Valid values:   - application/xml   - text/csv ")
  public String getReportMimeType() {
    return reportMimeType;
  }

  public void setReportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings reportFrequency(String reportFrequency) {
    this.reportFrequency = reportFrequency;
    return this;
  }

   /**
   * Report Frequency Value Valid Values:   - DAILY   - WEEKLY   - MONTHLY   - ADHOC 
   * @return reportFrequency
  **/
  @ApiModelProperty(example = "DAILY", value = "Report Frequency Value Valid Values:   - DAILY   - WEEKLY   - MONTHLY   - ADHOC ")
  public String getReportFrequency() {
    return reportFrequency;
  }

  public void setReportFrequency(String reportFrequency) {
    this.reportFrequency = reportFrequency;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Report Name
   * @return reportName
  **/
  @ApiModelProperty(example = "My Transaction Request Detail Report", value = "Report Name")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Time Zone
   * @return timezone
  **/
  @ApiModelProperty(example = "America/Chicago", value = "Time Zone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Start Time
   * @return startTime
  **/
  @ApiModelProperty(example = "0000", value = "Start Time")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings startDay(Integer startDay) {
    this.startDay = startDay;
    return this;
  }

   /**
   * Start Day
   * @return startDay
  **/
  @ApiModelProperty(example = "1", value = "Start Day")
  public Integer getStartDay() {
    return startDay;
  }

  public void setStartDay(Integer startDay) {
    this.startDay = startDay;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings reportFilters(Map<String, List<String>> reportFilters) {
    this.reportFilters = reportFilters;
    return this;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings putReportFiltersItem(String key, List<String> reportFiltersItem) {
    if (this.reportFilters == null) {
      this.reportFilters = new HashMap<String, List<String>>();
    }
    this.reportFilters.put(key, reportFiltersItem);
    return this;
  }

   /**
   * List of filters to apply
   * @return reportFilters
  **/
  @ApiModelProperty(example = "{\"Application.Name\":[\"ics_auth\",\"ics_bill\"]}", value = "List of filters to apply")
  public Map<String, List<String>> getReportFilters() {
    return reportFilters;
  }

  public void setReportFilters(Map<String, List<String>> reportFilters) {
    this.reportFilters = reportFilters;
  }

  public ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings reportPreferences(Reportingv3reportsReportPreferences reportPreferences) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings reportingV3ReportDefinitionsNameGet200ResponseDefaultSettings = (ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings) o;
    return Objects.equals(this.reportMimeType, reportingV3ReportDefinitionsNameGet200ResponseDefaultSettings.reportMimeType) &&
        Objects.equals(this.reportFrequency, reportingV3ReportDefinitionsNameGet200ResponseDefaultSettings.reportFrequency) &&
        Objects.equals(this.reportName, reportingV3ReportDefinitionsNameGet200ResponseDefaultSettings.reportName) &&
        Objects.equals(this.timezone, reportingV3ReportDefinitionsNameGet200ResponseDefaultSettings.timezone) &&
        Objects.equals(this.startTime, reportingV3ReportDefinitionsNameGet200ResponseDefaultSettings.startTime) &&
        Objects.equals(this.startDay, reportingV3ReportDefinitionsNameGet200ResponseDefaultSettings.startDay) &&
        Objects.equals(this.reportFilters, reportingV3ReportDefinitionsNameGet200ResponseDefaultSettings.reportFilters) &&
        Objects.equals(this.reportPreferences, reportingV3ReportDefinitionsNameGet200ResponseDefaultSettings.reportPreferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportMimeType, reportFrequency, reportName, timezone, startTime, startDay, reportFilters, reportPreferences);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ReportDefinitionsNameGet200ResponseDefaultSettings {\n");
    
    sb.append("    reportMimeType: ").append(toIndentedString(reportMimeType)).append("\n");
    sb.append("    reportFrequency: ").append(toIndentedString(reportFrequency)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
    sb.append("    reportFilters: ").append(toIndentedString(reportFilters)).append("\n");
    sb.append("    reportPreferences: ").append(toIndentedString(reportPreferences)).append("\n");
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

