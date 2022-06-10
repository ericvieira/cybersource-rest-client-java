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
import Model.Ptsv2paymentsTravelInformationAgency;
import Model.Ptsv2paymentsTravelInformationAutoRental;
import Model.Ptsv2paymentsTravelInformationLodging;
import Model.Ptsv2paymentsTravelInformationTransit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsTravelInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-10T13:11:55.460+05:30")
public class Ptsv2paymentsTravelInformation {
  @SerializedName("duration")
  private String duration = null;

  @SerializedName("agency")
  private Ptsv2paymentsTravelInformationAgency agency = null;

  @SerializedName("autoRental")
  private Ptsv2paymentsTravelInformationAutoRental autoRental = null;

  @SerializedName("lodging")
  private Ptsv2paymentsTravelInformationLodging lodging = null;

  @SerializedName("transit")
  private Ptsv2paymentsTravelInformationTransit transit = null;

  public Ptsv2paymentsTravelInformation duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration of the auto rental or lodging rental.  #### Auto rental This field is supported for Visa, MasterCard, and American Express. **Important** If this field is not included when the &#x60;processingInformation.industryDataType&#x60; is auto rental, the transaction is declined. 
   * @return duration
  **/
  @ApiModelProperty(value = "Duration of the auto rental or lodging rental.  #### Auto rental This field is supported for Visa, MasterCard, and American Express. **Important** If this field is not included when the `processingInformation.industryDataType` is auto rental, the transaction is declined. ")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Ptsv2paymentsTravelInformation agency(Ptsv2paymentsTravelInformationAgency agency) {
    this.agency = agency;
    return this;
  }

   /**
   * Get agency
   * @return agency
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsTravelInformationAgency getAgency() {
    return agency;
  }

  public void setAgency(Ptsv2paymentsTravelInformationAgency agency) {
    this.agency = agency;
  }

  public Ptsv2paymentsTravelInformation autoRental(Ptsv2paymentsTravelInformationAutoRental autoRental) {
    this.autoRental = autoRental;
    return this;
  }

   /**
   * Get autoRental
   * @return autoRental
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsTravelInformationAutoRental getAutoRental() {
    return autoRental;
  }

  public void setAutoRental(Ptsv2paymentsTravelInformationAutoRental autoRental) {
    this.autoRental = autoRental;
  }

  public Ptsv2paymentsTravelInformation lodging(Ptsv2paymentsTravelInformationLodging lodging) {
    this.lodging = lodging;
    return this;
  }

   /**
   * Get lodging
   * @return lodging
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsTravelInformationLodging getLodging() {
    return lodging;
  }

  public void setLodging(Ptsv2paymentsTravelInformationLodging lodging) {
    this.lodging = lodging;
  }

  public Ptsv2paymentsTravelInformation transit(Ptsv2paymentsTravelInformationTransit transit) {
    this.transit = transit;
    return this;
  }

   /**
   * Get transit
   * @return transit
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsTravelInformationTransit getTransit() {
    return transit;
  }

  public void setTransit(Ptsv2paymentsTravelInformationTransit transit) {
    this.transit = transit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTravelInformation ptsv2paymentsTravelInformation = (Ptsv2paymentsTravelInformation) o;
    return Objects.equals(this.duration, ptsv2paymentsTravelInformation.duration) &&
        Objects.equals(this.agency, ptsv2paymentsTravelInformation.agency) &&
        Objects.equals(this.autoRental, ptsv2paymentsTravelInformation.autoRental) &&
        Objects.equals(this.lodging, ptsv2paymentsTravelInformation.lodging) &&
        Objects.equals(this.transit, ptsv2paymentsTravelInformation.transit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, agency, autoRental, lodging, transit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTravelInformation {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
    sb.append("    autoRental: ").append(toIndentedString(autoRental)).append("\n");
    sb.append("    lodging: ").append(toIndentedString(lodging)).append("\n");
    sb.append("    transit: ").append(toIndentedString(transit)).append("\n");
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

