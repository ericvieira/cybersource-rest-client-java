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
import Model.InlineResponse20012EmbeddedLinks;
import Model.InlineResponse20012EmbeddedTotals;
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
 * InlineResponse20012EmbeddedBatches
 */

public class InlineResponse20012EmbeddedBatches {
  @SerializedName("_links")
  private InlineResponse20012EmbeddedLinks links = null;

  @SerializedName("batchId")
  private String batchId = null;

  @SerializedName("batchCreatedDate")
  private String batchCreatedDate = null;

  @SerializedName("batchModifiedDate")
  private String batchModifiedDate = null;

  @SerializedName("batchSource")
  private String batchSource = null;

  @SerializedName("tokenSource")
  private String tokenSource = null;

  @SerializedName("merchantReference")
  private String merchantReference = null;

  @SerializedName("batchCaEndpoints")
  private List<String> batchCaEndpoints = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("totals")
  private InlineResponse20012EmbeddedTotals totals = null;

  public InlineResponse20012EmbeddedBatches links(InlineResponse20012EmbeddedLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20012EmbeddedLinks getLinks() {
    return links;
  }

  public void setLinks(InlineResponse20012EmbeddedLinks links) {
    this.links = links;
  }

  public InlineResponse20012EmbeddedBatches batchId(String batchId) {
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

  public InlineResponse20012EmbeddedBatches batchCreatedDate(String batchCreatedDate) {
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

  public InlineResponse20012EmbeddedBatches batchModifiedDate(String batchModifiedDate) {
    this.batchModifiedDate = batchModifiedDate;
    return this;
  }

   /**
   * ISO-8601 format: yyyy-MM-ddTHH:mm:ssZ
   * @return batchModifiedDate
  **/
  @ApiModelProperty(example = "2018-05-22T14.38.57Z", value = "ISO-8601 format: yyyy-MM-ddTHH:mm:ssZ")
  public String getBatchModifiedDate() {
    return batchModifiedDate;
  }

  public void setBatchModifiedDate(String batchModifiedDate) {
    this.batchModifiedDate = batchModifiedDate;
  }

  public InlineResponse20012EmbeddedBatches batchSource(String batchSource) {
    this.batchSource = batchSource;
    return this;
  }

   /**
   * Valid Values:   * SCHEDULER   * TOKEN_API   * CREDIT_CARD_FILE_UPLOAD   * AMEX_REGSITRY   * AMEX_REGISTRY_API   * AMEX_REGISTRY_API_SYNC   * AMEX_MAINTENANCE 
   * @return batchSource
  **/
  @ApiModelProperty(value = "Valid Values:   * SCHEDULER   * TOKEN_API   * CREDIT_CARD_FILE_UPLOAD   * AMEX_REGSITRY   * AMEX_REGISTRY_API   * AMEX_REGISTRY_API_SYNC   * AMEX_MAINTENANCE ")
  public String getBatchSource() {
    return batchSource;
  }

  public void setBatchSource(String batchSource) {
    this.batchSource = batchSource;
  }

  public InlineResponse20012EmbeddedBatches tokenSource(String tokenSource) {
    this.tokenSource = tokenSource;
    return this;
  }

   /**
   * Valid Values:   * SECURE_STORAGE   * TMS   * CYBERSOURCE 
   * @return tokenSource
  **/
  @ApiModelProperty(value = "Valid Values:   * SECURE_STORAGE   * TMS   * CYBERSOURCE ")
  public String getTokenSource() {
    return tokenSource;
  }

  public void setTokenSource(String tokenSource) {
    this.tokenSource = tokenSource;
  }

  public InlineResponse20012EmbeddedBatches merchantReference(String merchantReference) {
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

  public InlineResponse20012EmbeddedBatches batchCaEndpoints(List<String> batchCaEndpoints) {
    this.batchCaEndpoints = batchCaEndpoints;
    return this;
  }

  public InlineResponse20012EmbeddedBatches addBatchCaEndpointsItem(String batchCaEndpointsItem) {
    if (this.batchCaEndpoints == null) {
      this.batchCaEndpoints = new ArrayList<String>();
    }
    this.batchCaEndpoints.add(batchCaEndpointsItem);
    return this;
  }

   /**
   * Valid Values:   * VISA   * MASTERCARD   * AMEX 
   * @return batchCaEndpoints
  **/
  @ApiModelProperty(value = "Valid Values:   * VISA   * MASTERCARD   * AMEX ")
  public List<String> getBatchCaEndpoints() {
    return batchCaEndpoints;
  }

  public void setBatchCaEndpoints(List<String> batchCaEndpoints) {
    this.batchCaEndpoints = batchCaEndpoints;
  }

  public InlineResponse20012EmbeddedBatches status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Valid Values:   * REJECTED   * RECEIVED   * VALIDATED   * DECLINED   * PROCESSING   * COMPLETE 
   * @return status
  **/
  @ApiModelProperty(value = "Valid Values:   * REJECTED   * RECEIVED   * VALIDATED   * DECLINED   * PROCESSING   * COMPLETE ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse20012EmbeddedBatches totals(InlineResponse20012EmbeddedTotals totals) {
    this.totals = totals;
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20012EmbeddedTotals getTotals() {
    return totals;
  }

  public void setTotals(InlineResponse20012EmbeddedTotals totals) {
    this.totals = totals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012EmbeddedBatches inlineResponse20012EmbeddedBatches = (InlineResponse20012EmbeddedBatches) o;
    return Objects.equals(this.links, inlineResponse20012EmbeddedBatches.links) &&
        Objects.equals(this.batchId, inlineResponse20012EmbeddedBatches.batchId) &&
        Objects.equals(this.batchCreatedDate, inlineResponse20012EmbeddedBatches.batchCreatedDate) &&
        Objects.equals(this.batchModifiedDate, inlineResponse20012EmbeddedBatches.batchModifiedDate) &&
        Objects.equals(this.batchSource, inlineResponse20012EmbeddedBatches.batchSource) &&
        Objects.equals(this.tokenSource, inlineResponse20012EmbeddedBatches.tokenSource) &&
        Objects.equals(this.merchantReference, inlineResponse20012EmbeddedBatches.merchantReference) &&
        Objects.equals(this.batchCaEndpoints, inlineResponse20012EmbeddedBatches.batchCaEndpoints) &&
        Objects.equals(this.status, inlineResponse20012EmbeddedBatches.status) &&
        Objects.equals(this.totals, inlineResponse20012EmbeddedBatches.totals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, batchId, batchCreatedDate, batchModifiedDate, batchSource, tokenSource, merchantReference, batchCaEndpoints, status, totals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012EmbeddedBatches {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    batchCreatedDate: ").append(toIndentedString(batchCreatedDate)).append("\n");
    sb.append("    batchModifiedDate: ").append(toIndentedString(batchModifiedDate)).append("\n");
    sb.append("    batchSource: ").append(toIndentedString(batchSource)).append("\n");
    sb.append("    tokenSource: ").append(toIndentedString(tokenSource)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    batchCaEndpoints: ").append(toIndentedString(batchCaEndpoints)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
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

