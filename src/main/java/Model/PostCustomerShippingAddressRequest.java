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
import Model.Tmsv2customersEmbeddedDefaultShippingAddressLinks;
import Model.Tmsv2customersEmbeddedDefaultShippingAddressMetadata;
import Model.Tmsv2customersEmbeddedDefaultShippingAddressShipTo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PostCustomerShippingAddressRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-12T17:46:06.587+05:30")
public class PostCustomerShippingAddressRequest {
  @SerializedName("_links")
  private Tmsv2customersEmbeddedDefaultShippingAddressLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("shipTo")
  private Tmsv2customersEmbeddedDefaultShippingAddressShipTo shipTo = null;

  @SerializedName("metadata")
  private Tmsv2customersEmbeddedDefaultShippingAddressMetadata metadata = null;

  public PostCustomerShippingAddressRequest links(Tmsv2customersEmbeddedDefaultShippingAddressLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultShippingAddressLinks getLinks() {
    return links;
  }

  public void setLinks(Tmsv2customersEmbeddedDefaultShippingAddressLinks links) {
    this.links = links;
  }

  public PostCustomerShippingAddressRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the Shipping Address Token.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the Shipping Address Token.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PostCustomerShippingAddressRequest _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Flag that indicates whether customer shipping address is the dafault. Valid values:  - &#x60;true&#x60;: Shipping Address is customer&#39;s default.  - &#x60;false&#x60;: Shipping Address is not customer&#39;s default. 
   * @return _default
  **/
  @ApiModelProperty(value = "Flag that indicates whether customer shipping address is the dafault. Valid values:  - `true`: Shipping Address is customer's default.  - `false`: Shipping Address is not customer's default. ")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public PostCustomerShippingAddressRequest shipTo(Tmsv2customersEmbeddedDefaultShippingAddressShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultShippingAddressShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(Tmsv2customersEmbeddedDefaultShippingAddressShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public PostCustomerShippingAddressRequest metadata(Tmsv2customersEmbeddedDefaultShippingAddressMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultShippingAddressMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Tmsv2customersEmbeddedDefaultShippingAddressMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCustomerShippingAddressRequest postCustomerShippingAddressRequest = (PostCustomerShippingAddressRequest) o;
    return Objects.equals(this.links, postCustomerShippingAddressRequest.links) &&
        Objects.equals(this.id, postCustomerShippingAddressRequest.id) &&
        Objects.equals(this._default, postCustomerShippingAddressRequest._default) &&
        Objects.equals(this.shipTo, postCustomerShippingAddressRequest.shipTo) &&
        Objects.equals(this.metadata, postCustomerShippingAddressRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, _default, shipTo, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCustomerShippingAddressRequest {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

