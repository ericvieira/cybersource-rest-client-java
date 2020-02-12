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
import Model.PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation;
import Model.PtsV2IncrementalAuthorizationPatch201ResponseLinks;
import Model.PtsV2PaymentsPost201ResponseErrorInformation;
import Model.RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RiskV1ExportComplianceInquiriesPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-12T15:59:24.815+05:30")
public class RiskV1ExportComplianceInquiriesPost201Response {
  @SerializedName("_links")
  private PtsV2IncrementalAuthorizationPatch201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("submitTimeLocal")
  private String submitTimeLocal = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("exportComplianceInformation")
  private RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation exportComplianceInformation = null;

  @SerializedName("errorInformation")
  private PtsV2PaymentsPost201ResponseErrorInformation errorInformation = null;

  public RiskV1ExportComplianceInquiriesPost201Response links(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
  }

  public RiskV1ExportComplianceInquiriesPost201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request. It is also appended to the endpoint of the resource.  On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. 
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number assigned by CyberSource to identify the submitted request. It is also appended to the endpoint of the resource.  On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RiskV1ExportComplianceInquiriesPost201Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; Example &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` Example `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public RiskV1ExportComplianceInquiriesPost201Response submitTimeLocal(String submitTimeLocal) {
    this.submitTimeLocal = submitTimeLocal;
    return this;
  }

   /**
   * Time that the transaction was submitted in local time.
   * @return submitTimeLocal
  **/
  @ApiModelProperty(value = "Time that the transaction was submitted in local time.")
  public String getSubmitTimeLocal() {
    return submitTimeLocal;
  }

  public void setSubmitTimeLocal(String submitTimeLocal) {
    this.submitTimeLocal = submitTimeLocal;
  }

  public RiskV1ExportComplianceInquiriesPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status for the call can be: - COMPLETED - INVALID_REQUEST - DECLINED 
   * @return status
  **/
  @ApiModelProperty(value = "The status for the call can be: - COMPLETED - INVALID_REQUEST - DECLINED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RiskV1ExportComplianceInquiriesPost201Response reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason of the status. Value can be   - CUSTOMER_WATCHLIST_MATCH   - ADDRESS_COUNTRY_WATCHLIST_MATCH   - EMAIL_COUNTRY_WATCHLIST_MATCH   - IP_COUNTRY_WATCHLIST_MATCH 
   * @return reason
  **/
  @ApiModelProperty(value = "The reason of the status. Value can be   - CUSTOMER_WATCHLIST_MATCH   - ADDRESS_COUNTRY_WATCHLIST_MATCH   - EMAIL_COUNTRY_WATCHLIST_MATCH   - IP_COUNTRY_WATCHLIST_MATCH ")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public RiskV1ExportComplianceInquiriesPost201Response message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The message describing the reason of the status. Value can be   - The customer matched the Denied Parties List   - The Export bill_country/ship_country  match   - Export email_country match   - Export hostname_country/ip_country match 
   * @return message
  **/
  @ApiModelProperty(value = "The message describing the reason of the status. Value can be   - The customer matched the Denied Parties List   - The Export bill_country/ship_country  match   - Export email_country match   - Export hostname_country/ip_country match ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RiskV1ExportComplianceInquiriesPost201Response clientReferenceInformation(PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(PtsV2IncrementalAuthorizationPatch201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public RiskV1ExportComplianceInquiriesPost201Response exportComplianceInformation(RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation exportComplianceInformation) {
    this.exportComplianceInformation = exportComplianceInformation;
    return this;
  }

   /**
   * Get exportComplianceInformation
   * @return exportComplianceInformation
  **/
  @ApiModelProperty(value = "")
  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation getExportComplianceInformation() {
    return exportComplianceInformation;
  }

  public void setExportComplianceInformation(RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformation exportComplianceInformation) {
    this.exportComplianceInformation = exportComplianceInformation;
  }

  public RiskV1ExportComplianceInquiriesPost201Response errorInformation(PtsV2PaymentsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(PtsV2PaymentsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1ExportComplianceInquiriesPost201Response riskV1ExportComplianceInquiriesPost201Response = (RiskV1ExportComplianceInquiriesPost201Response) o;
    return Objects.equals(this.links, riskV1ExportComplianceInquiriesPost201Response.links) &&
        Objects.equals(this.id, riskV1ExportComplianceInquiriesPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, riskV1ExportComplianceInquiriesPost201Response.submitTimeUtc) &&
        Objects.equals(this.submitTimeLocal, riskV1ExportComplianceInquiriesPost201Response.submitTimeLocal) &&
        Objects.equals(this.status, riskV1ExportComplianceInquiriesPost201Response.status) &&
        Objects.equals(this.reason, riskV1ExportComplianceInquiriesPost201Response.reason) &&
        Objects.equals(this.message, riskV1ExportComplianceInquiriesPost201Response.message) &&
        Objects.equals(this.clientReferenceInformation, riskV1ExportComplianceInquiriesPost201Response.clientReferenceInformation) &&
        Objects.equals(this.exportComplianceInformation, riskV1ExportComplianceInquiriesPost201Response.exportComplianceInformation) &&
        Objects.equals(this.errorInformation, riskV1ExportComplianceInquiriesPost201Response.errorInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, submitTimeLocal, status, reason, message, clientReferenceInformation, exportComplianceInformation, errorInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1ExportComplianceInquiriesPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    submitTimeLocal: ").append(toIndentedString(submitTimeLocal)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    exportComplianceInformation: ").append(toIndentedString(exportComplianceInformation)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
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

