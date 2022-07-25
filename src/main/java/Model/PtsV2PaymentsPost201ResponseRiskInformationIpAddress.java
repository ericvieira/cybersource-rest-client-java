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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains detailed response information about the customer&#39;s IP address.
 */
@ApiModel(description = "Contains detailed response information about the customer's IP address.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-15T14:19:26.508+05:30")
public class PtsV2PaymentsPost201ResponseRiskInformationIpAddress {
  @SerializedName("anonymizerStatus")
  private String anonymizerStatus = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("routingMethod")
  private String routingMethod = null;

  @SerializedName("carrier")
  private String carrier = null;

  @SerializedName("organization")
  private String organization = null;

  public PtsV2PaymentsPost201ResponseRiskInformationIpAddress anonymizerStatus(String anonymizerStatus) {
    this.anonymizerStatus = anonymizerStatus;
    return this;
  }

   /**
   * Indicates whether the transaction IP address is associated with a known anonymous proxy.  For all possible values, see the &#x60;score_ip_anonymizer_status&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return anonymizerStatus
  **/
  @ApiModelProperty(value = "Indicates whether the transaction IP address is associated with a known anonymous proxy.  For all possible values, see the `score_ip_anonymizer_status` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getAnonymizerStatus() {
    return anonymizerStatus;
  }

  public void setAnonymizerStatus(String anonymizerStatus) {
    this.anonymizerStatus = anonymizerStatus;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationIpAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Name of the city decoded from the IP address used directly or indirectly by the customer to send the order.  For all possible values, see the &#x60;score_ip_city&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return locality
  **/
  @ApiModelProperty(value = "Name of the city decoded from the IP address used directly or indirectly by the customer to send the order.  For all possible values, see the `score_ip_city` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationIpAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Name of the country decoded from the IP address used directly or indirectly by the customer to send the order.  For all possible values, see the &#x60;score_ip_country&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return country
  **/
  @ApiModelProperty(value = "Name of the country decoded from the IP address used directly or indirectly by the customer to send the order.  For all possible values, see the `score_ip_country` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationIpAddress administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * Name of the state decoded from the IP address used directly or indirectly by the customer to send the order.  For all possible values, see the &#x60;score_ip_state&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "Name of the state decoded from the IP address used directly or indirectly by the customer to send the order.  For all possible values, see the `score_ip_state` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationIpAddress routingMethod(String routingMethod) {
    this.routingMethod = routingMethod;
    return this;
  }

   /**
   * Routing method decoded from the IP address used directly or indirectly by the customer to send the order.  For all possible values, see the &#x60;score_ip_routing_method&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return routingMethod
  **/
  @ApiModelProperty(value = "Routing method decoded from the IP address used directly or indirectly by the customer to send the order.  For all possible values, see the `score_ip_routing_method` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public String getRoutingMethod() {
    return routingMethod;
  }

  public void setRoutingMethod(String routingMethod) {
    this.routingMethod = routingMethod;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationIpAddress carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Provides the name of the organization that owns the ASN. The carrier is responsible for the traffic carried on the network or set of networks designated as an Autonomous System (AS) and identified by the ASN. While there are more than 27,000 active ASNs, there are fewer carriers, because a single carrier often manages several ASNs. 
   * @return carrier
  **/
  @ApiModelProperty(value = "Provides the name of the organization that owns the ASN. The carrier is responsible for the traffic carried on the network or set of networks designated as an Autonomous System (AS) and identified by the ASN. While there are more than 27,000 active ASNs, there are fewer carriers, because a single carrier often manages several ASNs. ")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public PtsV2PaymentsPost201ResponseRiskInformationIpAddress organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * The Registering Organization is the entity responsible for the actions and content associated with a given block of IP addresses. This is in contrast to the carrier, which is responsible for the routing of traffic for network blocks. Registering Organizations include many types of entities, including corporate, government, or educational entities, and ISPs managing the allocation and use of network blocks. 
   * @return organization
  **/
  @ApiModelProperty(value = "The Registering Organization is the entity responsible for the actions and content associated with a given block of IP addresses. This is in contrast to the carrier, which is responsible for the routing of traffic for network blocks. Registering Organizations include many types of entities, including corporate, government, or educational entities, and ISPs managing the allocation and use of network blocks. ")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseRiskInformationIpAddress ptsV2PaymentsPost201ResponseRiskInformationIpAddress = (PtsV2PaymentsPost201ResponseRiskInformationIpAddress) o;
    return Objects.equals(this.anonymizerStatus, ptsV2PaymentsPost201ResponseRiskInformationIpAddress.anonymizerStatus) &&
        Objects.equals(this.locality, ptsV2PaymentsPost201ResponseRiskInformationIpAddress.locality) &&
        Objects.equals(this.country, ptsV2PaymentsPost201ResponseRiskInformationIpAddress.country) &&
        Objects.equals(this.administrativeArea, ptsV2PaymentsPost201ResponseRiskInformationIpAddress.administrativeArea) &&
        Objects.equals(this.routingMethod, ptsV2PaymentsPost201ResponseRiskInformationIpAddress.routingMethod) &&
        Objects.equals(this.carrier, ptsV2PaymentsPost201ResponseRiskInformationIpAddress.carrier) &&
        Objects.equals(this.organization, ptsV2PaymentsPost201ResponseRiskInformationIpAddress.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anonymizerStatus, locality, country, administrativeArea, routingMethod, carrier, organization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseRiskInformationIpAddress {\n");
    
    sb.append("    anonymizerStatus: ").append(toIndentedString(anonymizerStatus)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    routingMethod: ").append(toIndentedString(routingMethod)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

