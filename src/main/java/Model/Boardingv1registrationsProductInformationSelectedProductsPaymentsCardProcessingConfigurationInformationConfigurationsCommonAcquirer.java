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
 * Identifies the financial institution acting as the acquirer of this customer transaction. The acquirer is the member or system user that signed the merchant.
 */
@ApiModel(description = "Identifies the financial institution acting as the acquirer of this customer transaction. The acquirer is the member or system user that signed the merchant.")

public class Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer {
  @SerializedName("institutionId")
  private String institutionId = null;

  @SerializedName("interbankCardAssociationId")
  private String interbankCardAssociationId = null;

  @SerializedName("discoverInstitutionId")
  private String discoverInstitutionId = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("fileDestinationBin")
  private String fileDestinationBin = null;

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer institutionId(String institutionId) {
    this.institutionId = institutionId;
    return this;
  }

   /**
   * Identifier of the acquirer. This number is usually assigned by Visa. Applicable for VPC, GPX (gpx), CMCIC (cmcic), EFTPOS, CB2A, CUP, American Express Direct (amexdirect) and Six (six) processors.  Validation details (for selected processors)...  &lt;table&gt; &lt;thead&gt;&lt;tr&gt;&lt;th&gt;Processor&lt;/th&gt;&lt;th&gt;Acceptance Type&lt;/th&gt;&lt;th&gt;Required&lt;/th&gt;&lt;th&gt;Min. Length&lt;/th&gt;&lt;th&gt;Max. Length&lt;/th&gt;&lt;th&gt;Regex&lt;/th&gt;&lt;th&gt;Default Value&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt; &lt;tr&gt;&lt;td&gt;American Express Direct&lt;/td&gt;&lt;td&gt;cnp, cp, hybrid&lt;/td&gt;&lt;td&gt;Yes&lt;/td&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;13&lt;/td&gt;&lt;td&gt;^[0-9]+$&lt;/td&gt;&lt;td&gt;1111&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; 
   * @return institutionId
  **/
  @ApiModelProperty(value = "Identifier of the acquirer. This number is usually assigned by Visa. Applicable for VPC, GPX (gpx), CMCIC (cmcic), EFTPOS, CB2A, CUP, American Express Direct (amexdirect) and Six (six) processors.  Validation details (for selected processors)...  <table> <thead><tr><th>Processor</th><th>Acceptance Type</th><th>Required</th><th>Min. Length</th><th>Max. Length</th><th>Regex</th><th>Default Value</th></tr></thead> <tr><td>American Express Direct</td><td>cnp, cp, hybrid</td><td>Yes</td><td>1</td><td>13</td><td>^[0-9]+$</td><td>1111</td></tr> </table> ")
  public String getInstitutionId() {
    return institutionId;
  }

  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer interbankCardAssociationId(String interbankCardAssociationId) {
    this.interbankCardAssociationId = interbankCardAssociationId;
    return this;
  }

   /**
   * Number assigned by MasterCard to banks to identify the member in transactions. Applicable for VPC and GPX (gpx) processors.
   * @return interbankCardAssociationId
  **/
  @ApiModelProperty(value = "Number assigned by MasterCard to banks to identify the member in transactions. Applicable for VPC and GPX (gpx) processors.")
  public String getInterbankCardAssociationId() {
    return interbankCardAssociationId;
  }

  public void setInterbankCardAssociationId(String interbankCardAssociationId) {
    this.interbankCardAssociationId = interbankCardAssociationId;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer discoverInstitutionId(String discoverInstitutionId) {
    this.discoverInstitutionId = discoverInstitutionId;
    return this;
  }

   /**
   * Assigned by Discover to identify the acquirer. Applicable for VPC and GPX (gpx) processors.
   * @return discoverInstitutionId
  **/
  @ApiModelProperty(value = "Assigned by Discover to identify the acquirer. Applicable for VPC and GPX (gpx) processors.")
  public String getDiscoverInstitutionId() {
    return discoverInstitutionId;
  }

  public void setDiscoverInstitutionId(String discoverInstitutionId) {
    this.discoverInstitutionId = discoverInstitutionId;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * ISO 4217 format. Applicable for VPC, GPX (gpx), EFTPOS, RUPAY, Prisma (prisma) and CUP processors.
   * @return countryCode
  **/
  @ApiModelProperty(value = "ISO 4217 format. Applicable for VPC, GPX (gpx), EFTPOS, RUPAY, Prisma (prisma) and CUP processors.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer fileDestinationBin(String fileDestinationBin) {
    this.fileDestinationBin = fileDestinationBin;
    return this;
  }

   /**
   * The BIN to which this capturefile is sent. This field must contain a valid BIN. Applicable for VPC and GPX (gpx) processors.
   * @return fileDestinationBin
  **/
  @ApiModelProperty(value = "The BIN to which this capturefile is sent. This field must contain a valid BIN. Applicable for VPC and GPX (gpx) processors.")
  public String getFileDestinationBin() {
    return fileDestinationBin;
  }

  public void setFileDestinationBin(String fileDestinationBin) {
    this.fileDestinationBin = fileDestinationBin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer = (Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer) o;
    return Objects.equals(this.institutionId, boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer.institutionId) &&
        Objects.equals(this.interbankCardAssociationId, boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer.interbankCardAssociationId) &&
        Objects.equals(this.discoverInstitutionId, boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer.discoverInstitutionId) &&
        Objects.equals(this.countryCode, boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer.countryCode) &&
        Objects.equals(this.fileDestinationBin, boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer.fileDestinationBin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutionId, interbankCardAssociationId, discoverInstitutionId, countryCode, fileDestinationBin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsCommonAcquirer {\n");
    
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    interbankCardAssociationId: ").append(toIndentedString(interbankCardAssociationId)).append("\n");
    sb.append("    discoverInstitutionId: ").append(toIndentedString(discoverInstitutionId)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    fileDestinationBin: ").append(toIndentedString(fileDestinationBin)).append("\n");
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

