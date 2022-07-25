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
import Model.InvoicingV2InvoicesAllGet200ResponseCustomerInformation;
import Model.InvoicingV2InvoicesAllGet200ResponseInvoiceInformation;
import Model.InvoicingV2InvoicesAllGet200ResponseLinks1;
import Model.InvoicingV2InvoicesAllGet200ResponseOrderInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A list of invoices.
 */
@ApiModel(description = "A list of invoices.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-15T14:19:26.508+05:30")
public class InvoicingV2InvoicesAllGet200ResponseInvoices {
  @SerializedName("_links")
  private InvoicingV2InvoicesAllGet200ResponseLinks1 links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("customerInformation")
  private InvoicingV2InvoicesAllGet200ResponseCustomerInformation customerInformation = null;

  @SerializedName("invoiceInformation")
  private InvoicingV2InvoicesAllGet200ResponseInvoiceInformation invoiceInformation = null;

  @SerializedName("orderInformation")
  private InvoicingV2InvoicesAllGet200ResponseOrderInformation orderInformation = null;

  public InvoicingV2InvoicesAllGet200ResponseInvoices links(InvoicingV2InvoicesAllGet200ResponseLinks1 links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesAllGet200ResponseLinks1 getLinks() {
    return links;
  }

  public void setLinks(InvoicingV2InvoicesAllGet200ResponseLinks1 links) {
    this.links = links;
  }

  public InvoicingV2InvoicesAllGet200ResponseInvoices id(String id) {
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

  public InvoicingV2InvoicesAllGet200ResponseInvoices status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the invoice.  Possible values: - DRAFT - CREATED - SENT - PARTIAL - PAID - CANCELED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the invoice.  Possible values: - DRAFT - CREATED - SENT - PARTIAL - PAID - CANCELED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InvoicingV2InvoicesAllGet200ResponseInvoices customerInformation(InvoicingV2InvoicesAllGet200ResponseCustomerInformation customerInformation) {
    this.customerInformation = customerInformation;
    return this;
  }

   /**
   * Get customerInformation
   * @return customerInformation
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesAllGet200ResponseCustomerInformation getCustomerInformation() {
    return customerInformation;
  }

  public void setCustomerInformation(InvoicingV2InvoicesAllGet200ResponseCustomerInformation customerInformation) {
    this.customerInformation = customerInformation;
  }

  public InvoicingV2InvoicesAllGet200ResponseInvoices invoiceInformation(InvoicingV2InvoicesAllGet200ResponseInvoiceInformation invoiceInformation) {
    this.invoiceInformation = invoiceInformation;
    return this;
  }

   /**
   * Get invoiceInformation
   * @return invoiceInformation
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesAllGet200ResponseInvoiceInformation getInvoiceInformation() {
    return invoiceInformation;
  }

  public void setInvoiceInformation(InvoicingV2InvoicesAllGet200ResponseInvoiceInformation invoiceInformation) {
    this.invoiceInformation = invoiceInformation;
  }

  public InvoicingV2InvoicesAllGet200ResponseInvoices orderInformation(InvoicingV2InvoicesAllGet200ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesAllGet200ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(InvoicingV2InvoicesAllGet200ResponseOrderInformation orderInformation) {
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
    InvoicingV2InvoicesAllGet200ResponseInvoices invoicingV2InvoicesAllGet200ResponseInvoices = (InvoicingV2InvoicesAllGet200ResponseInvoices) o;
    return Objects.equals(this.links, invoicingV2InvoicesAllGet200ResponseInvoices.links) &&
        Objects.equals(this.id, invoicingV2InvoicesAllGet200ResponseInvoices.id) &&
        Objects.equals(this.status, invoicingV2InvoicesAllGet200ResponseInvoices.status) &&
        Objects.equals(this.customerInformation, invoicingV2InvoicesAllGet200ResponseInvoices.customerInformation) &&
        Objects.equals(this.invoiceInformation, invoicingV2InvoicesAllGet200ResponseInvoices.invoiceInformation) &&
        Objects.equals(this.orderInformation, invoicingV2InvoicesAllGet200ResponseInvoices.orderInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, status, customerInformation, invoiceInformation, orderInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoicesAllGet200ResponseInvoices {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerInformation: ").append(toIndentedString(customerInformation)).append("\n");
    sb.append("    invoiceInformation: ").append(toIndentedString(invoiceInformation)).append("\n");
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

