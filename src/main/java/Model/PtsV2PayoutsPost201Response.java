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
import Model.PtsV2IncrementalAuthorizationPatch201ResponseLinks;
import Model.PtsV2PaymentsPost201ResponseClientReferenceInformation;
import Model.PtsV2PayoutsPost201ResponseErrorInformation;
import Model.PtsV2PayoutsPost201ResponseMerchantInformation;
import Model.PtsV2PayoutsPost201ResponseOrderInformation;
import Model.PtsV2PayoutsPost201ResponseProcessorInformation;
import Model.PtsV2PayoutsPost201ResponseRecipientInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PayoutsPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-12T15:59:24.815+05:30")
public class PtsV2PayoutsPost201Response {
  @SerializedName("_links")
  private PtsV2IncrementalAuthorizationPatch201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reconciliationId")
  private String reconciliationId = null;

  @SerializedName("errorInformation")
  private PtsV2PayoutsPost201ResponseErrorInformation errorInformation = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("merchantInformation")
  private PtsV2PayoutsPost201ResponseMerchantInformation merchantInformation = null;

  @SerializedName("orderInformation")
  private PtsV2PayoutsPost201ResponseOrderInformation orderInformation = null;

  @SerializedName("processorInformation")
  private PtsV2PayoutsPost201ResponseProcessorInformation processorInformation = null;

  @SerializedName("recipientInformation")
  private PtsV2PayoutsPost201ResponseRecipientInformation recipientInformation = null;

  public PtsV2PayoutsPost201Response links(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
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

  public PtsV2PayoutsPost201Response id(String id) {
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

  public PtsV2PayoutsPost201Response submitTimeUtc(String submitTimeUtc) {
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

  public PtsV2PayoutsPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - ACCEPTED  - DECLINED  - INVALID_REQUEST 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - ACCEPTED  - DECLINED  - INVALID_REQUEST ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PtsV2PayoutsPost201Response reconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
    return this;
  }

   /**
   * Cybersource or merchant generated transaction reference number. This is sent to the processor and is echoed back in the response to the merchant. This is This value is used for reconciliation purposes. 
   * @return reconciliationId
  **/
  @ApiModelProperty(value = "Cybersource or merchant generated transaction reference number. This is sent to the processor and is echoed back in the response to the merchant. This is This value is used for reconciliation purposes. ")
  public String getReconciliationId() {
    return reconciliationId;
  }

  public void setReconciliationId(String reconciliationId) {
    this.reconciliationId = reconciliationId;
  }

  public PtsV2PayoutsPost201Response errorInformation(PtsV2PayoutsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PayoutsPost201ResponseErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(PtsV2PayoutsPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }

  public PtsV2PayoutsPost201Response clientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public PtsV2PayoutsPost201Response merchantInformation(PtsV2PayoutsPost201ResponseMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PayoutsPost201ResponseMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(PtsV2PayoutsPost201ResponseMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public PtsV2PayoutsPost201Response orderInformation(PtsV2PayoutsPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PayoutsPost201ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(PtsV2PayoutsPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public PtsV2PayoutsPost201Response processorInformation(PtsV2PayoutsPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PayoutsPost201ResponseProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(PtsV2PayoutsPost201ResponseProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public PtsV2PayoutsPost201Response recipientInformation(PtsV2PayoutsPost201ResponseRecipientInformation recipientInformation) {
    this.recipientInformation = recipientInformation;
    return this;
  }

   /**
   * Get recipientInformation
   * @return recipientInformation
  **/
  @ApiModelProperty(value = "")
  public PtsV2PayoutsPost201ResponseRecipientInformation getRecipientInformation() {
    return recipientInformation;
  }

  public void setRecipientInformation(PtsV2PayoutsPost201ResponseRecipientInformation recipientInformation) {
    this.recipientInformation = recipientInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PayoutsPost201Response ptsV2PayoutsPost201Response = (PtsV2PayoutsPost201Response) o;
    return Objects.equals(this.links, ptsV2PayoutsPost201Response.links) &&
        Objects.equals(this.id, ptsV2PayoutsPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, ptsV2PayoutsPost201Response.submitTimeUtc) &&
        Objects.equals(this.status, ptsV2PayoutsPost201Response.status) &&
        Objects.equals(this.reconciliationId, ptsV2PayoutsPost201Response.reconciliationId) &&
        Objects.equals(this.errorInformation, ptsV2PayoutsPost201Response.errorInformation) &&
        Objects.equals(this.clientReferenceInformation, ptsV2PayoutsPost201Response.clientReferenceInformation) &&
        Objects.equals(this.merchantInformation, ptsV2PayoutsPost201Response.merchantInformation) &&
        Objects.equals(this.orderInformation, ptsV2PayoutsPost201Response.orderInformation) &&
        Objects.equals(this.processorInformation, ptsV2PayoutsPost201Response.processorInformation) &&
        Objects.equals(this.recipientInformation, ptsV2PayoutsPost201Response.recipientInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, reconciliationId, errorInformation, clientReferenceInformation, merchantInformation, orderInformation, processorInformation, recipientInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PayoutsPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reconciliationId: ").append(toIndentedString(reconciliationId)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    recipientInformation: ").append(toIndentedString(recipientInformation)).append("\n");
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

