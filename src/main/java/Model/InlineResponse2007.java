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
import Model.InlineResponse2005EmbeddedTotals;
import Model.InlineResponse2006Billing;
import Model.InlineResponse2007Records;
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
 * InlineResponse2007
 */

public class InlineResponse2007 {
  @SerializedName("version")
  private String version = null;

  @SerializedName("reportCreatedDate")
  private String reportCreatedDate = null;

  @SerializedName("batchId")
  private String batchId = null;

  @SerializedName("batchSource")
  private String batchSource = null;

  @SerializedName("batchCaEndpoints")
  private String batchCaEndpoints = null;

  @SerializedName("batchCreatedDate")
  private String batchCreatedDate = null;

  @SerializedName("merchantReference")
  private String merchantReference = null;

  @SerializedName("totals")
  private InlineResponse2005EmbeddedTotals totals = null;

  @SerializedName("billing")
  private InlineResponse2006Billing billing = null;

  @SerializedName("records")
  private List<InlineResponse2007Records> records = null;

  public InlineResponse2007 version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "1.0", value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public InlineResponse2007 reportCreatedDate(String reportCreatedDate) {
    this.reportCreatedDate = reportCreatedDate;
    return this;
  }

   /**
   * ISO-8601 format: yyyy-MM-ddTHH:mm:ssZ
   * @return reportCreatedDate
  **/
  @ApiModelProperty(example = "2018-05-22T14.38.57Z", value = "ISO-8601 format: yyyy-MM-ddTHH:mm:ssZ")
  public String getReportCreatedDate() {
    return reportCreatedDate;
  }

  public void setReportCreatedDate(String reportCreatedDate) {
    this.reportCreatedDate = reportCreatedDate;
  }

  public InlineResponse2007 batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * Unique identification number assigned to the submitted request.
   * @return batchId
  **/
  @ApiModelProperty(example = "16188390061150001062041064", value = "Unique identification number assigned to the submitted request.")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public InlineResponse2007 batchSource(String batchSource) {
    this.batchSource = batchSource;
    return this;
  }

   /**
   * Valid Values:   * SCHEDULER   * TOKEN_API   * CREDIT_CARD_FILE_UPLOAD   * AMEX_REGSITRY   * AMEX_REGISTRY_API   * AMEX_MAINTENANCE 
   * @return batchSource
  **/
  @ApiModelProperty(value = "Valid Values:   * SCHEDULER   * TOKEN_API   * CREDIT_CARD_FILE_UPLOAD   * AMEX_REGSITRY   * AMEX_REGISTRY_API   * AMEX_MAINTENANCE ")
  public String getBatchSource() {
    return batchSource;
  }

  public void setBatchSource(String batchSource) {
    this.batchSource = batchSource;
  }

  public InlineResponse2007 batchCaEndpoints(String batchCaEndpoints) {
    this.batchCaEndpoints = batchCaEndpoints;
    return this;
  }

   /**
   * Get batchCaEndpoints
   * @return batchCaEndpoints
  **/
  @ApiModelProperty(example = "VISA,MASTERCARD", value = "")
  public String getBatchCaEndpoints() {
    return batchCaEndpoints;
  }

  public void setBatchCaEndpoints(String batchCaEndpoints) {
    this.batchCaEndpoints = batchCaEndpoints;
  }

  public InlineResponse2007 batchCreatedDate(String batchCreatedDate) {
    this.batchCreatedDate = batchCreatedDate;
    return this;
  }

   /**
   * ISO-8601 format: yyyy-MM-ddTHH:mm:ssZ
   * @return batchCreatedDate
  **/
  @ApiModelProperty(example = "2018-05-22T14.38.57Z", value = "ISO-8601 format: yyyy-MM-ddTHH:mm:ssZ")
  public String getBatchCreatedDate() {
    return batchCreatedDate;
  }

  public void setBatchCreatedDate(String batchCreatedDate) {
    this.batchCreatedDate = batchCreatedDate;
  }

  public InlineResponse2007 merchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
    return this;
  }

   /**
   * Reference used by merchant to identify batch.
   * @return merchantReference
  **/
  @ApiModelProperty(example = "TC50171_3", value = "Reference used by merchant to identify batch.")
  public String getMerchantReference() {
    return merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }

  public InlineResponse2007 totals(InlineResponse2005EmbeddedTotals totals) {
    this.totals = totals;
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2005EmbeddedTotals getTotals() {
    return totals;
  }

  public void setTotals(InlineResponse2005EmbeddedTotals totals) {
    this.totals = totals;
  }

  public InlineResponse2007 billing(InlineResponse2006Billing billing) {
    this.billing = billing;
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2006Billing getBilling() {
    return billing;
  }

  public void setBilling(InlineResponse2006Billing billing) {
    this.billing = billing;
  }

  public InlineResponse2007 records(List<InlineResponse2007Records> records) {
    this.records = records;
    return this;
  }

  public InlineResponse2007 addRecordsItem(InlineResponse2007Records recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<InlineResponse2007Records>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2007Records> getRecords() {
    return records;
  }

  public void setRecords(List<InlineResponse2007Records> records) {
    this.records = records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(this.version, inlineResponse2007.version) &&
        Objects.equals(this.reportCreatedDate, inlineResponse2007.reportCreatedDate) &&
        Objects.equals(this.batchId, inlineResponse2007.batchId) &&
        Objects.equals(this.batchSource, inlineResponse2007.batchSource) &&
        Objects.equals(this.batchCaEndpoints, inlineResponse2007.batchCaEndpoints) &&
        Objects.equals(this.batchCreatedDate, inlineResponse2007.batchCreatedDate) &&
        Objects.equals(this.merchantReference, inlineResponse2007.merchantReference) &&
        Objects.equals(this.totals, inlineResponse2007.totals) &&
        Objects.equals(this.billing, inlineResponse2007.billing) &&
        Objects.equals(this.records, inlineResponse2007.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, reportCreatedDate, batchId, batchSource, batchCaEndpoints, batchCreatedDate, merchantReference, totals, billing, records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    reportCreatedDate: ").append(toIndentedString(reportCreatedDate)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchSource: ").append(toIndentedString(batchSource)).append("\n");
    sb.append("    batchCaEndpoints: ").append(toIndentedString(batchCaEndpoints)).append("\n");
    sb.append("    batchCreatedDate: ").append(toIndentedString(batchCreatedDate)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

