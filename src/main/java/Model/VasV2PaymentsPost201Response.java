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
import Model.PtsV2PaymentsPost201ResponseClientReferenceInformation;
import Model.VasV2PaymentsPost201ResponseLinks;
import Model.VasV2PaymentsPost201ResponseOrderInformation;
import Model.VasV2PaymentsPost201ResponseTaxInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VasV2PaymentsPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class VasV2PaymentsPost201Response {
  @SerializedName("_links")
  private VasV2PaymentsPost201ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("clientReferenceInformation")
  private PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("taxInformation")
  private VasV2PaymentsPost201ResponseTaxInformation taxInformation = null;

  @SerializedName("orderInformation")
  private VasV2PaymentsPost201ResponseOrderInformation orderInformation = null;

  public VasV2PaymentsPost201Response links(VasV2PaymentsPost201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public VasV2PaymentsPost201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(VasV2PaymentsPost201ResponseLinks links) {
    this.links = links;
  }

  public VasV2PaymentsPost201Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. 
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VasV2PaymentsPost201Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by Cybersource for all services. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public VasV2PaymentsPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.  Possible values:  - COMPLETED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.  Possible values:  - COMPLETED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public VasV2PaymentsPost201Response clientReferenceInformation(PtsV2PaymentsPost201ResponseClientReferenceInformation clientReferenceInformation) {
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

  public VasV2PaymentsPost201Response taxInformation(VasV2PaymentsPost201ResponseTaxInformation taxInformation) {
    this.taxInformation = taxInformation;
    return this;
  }

   /**
   * Get taxInformation
   * @return taxInformation
  **/
  @ApiModelProperty(value = "")
  public VasV2PaymentsPost201ResponseTaxInformation getTaxInformation() {
    return taxInformation;
  }

  public void setTaxInformation(VasV2PaymentsPost201ResponseTaxInformation taxInformation) {
    this.taxInformation = taxInformation;
  }

  public VasV2PaymentsPost201Response orderInformation(VasV2PaymentsPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public VasV2PaymentsPost201ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(VasV2PaymentsPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VasV2PaymentsPost201Response vasV2PaymentsPost201Response = (VasV2PaymentsPost201Response) o;
    return Objects.equals(this.links, vasV2PaymentsPost201Response.links) &&
        Objects.equals(this.id, vasV2PaymentsPost201Response.id) &&
        Objects.equals(this.submitTimeUtc, vasV2PaymentsPost201Response.submitTimeUtc) &&
        Objects.equals(this.status, vasV2PaymentsPost201Response.status) &&
        Objects.equals(this.clientReferenceInformation, vasV2PaymentsPost201Response.clientReferenceInformation) &&
        Objects.equals(this.taxInformation, vasV2PaymentsPost201Response.taxInformation) &&
        Objects.equals(this.orderInformation, vasV2PaymentsPost201Response.orderInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, clientReferenceInformation, taxInformation, orderInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VasV2PaymentsPost201Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    taxInformation: ").append(toIndentedString(taxInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
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

