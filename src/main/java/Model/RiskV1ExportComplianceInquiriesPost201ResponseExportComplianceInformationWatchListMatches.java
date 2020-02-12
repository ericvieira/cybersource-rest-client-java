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
import java.util.ArrayList;
import java.util.List;

/**
 * RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-12T15:59:24.815+05:30")
public class RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches {
  @SerializedName("addresses")
  private List<String> addresses = null;

  @SerializedName("sanctionList")
  private String sanctionList = null;

  @SerializedName("aliases")
  private List<String> aliases = null;

  @SerializedName("programs")
  private List<String> programs = null;

  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<String>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Address found on the list specified in export_matchN_list for the entity (name and address) in the request. 
   * @return addresses
  **/
  @ApiModelProperty(value = "Address found on the list specified in export_matchN_list for the entity (name and address) in the request. ")
  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches sanctionList(String sanctionList) {
    this.sanctionList = sanctionList;
    return this;
  }

   /**
   * List on which the first Denied Parties List check match appears. For a list of codes, see \&quot;Denied Parties List Check Codes,\&quot; page 56. 
   * @return sanctionList
  **/
  @ApiModelProperty(value = "List on which the first Denied Parties List check match appears. For a list of codes, see \"Denied Parties List Check Codes,\" page 56. ")
  public String getSanctionList() {
    return sanctionList;
  }

  public void setSanctionList(String sanctionList) {
    this.sanctionList = sanctionList;
  }

  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches aliases(List<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches addAliasesItem(String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<String>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Name found on the list specified in export_matchN_list for the entity (name and address) in the request. 
   * @return aliases
  **/
  @ApiModelProperty(value = "Name found on the list specified in export_matchN_list for the entity (name and address) in the request. ")
  public List<String> getAliases() {
    return aliases;
  }

  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }

  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches programs(List<String> programs) {
    this.programs = programs;
    return this;
  }

  public RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches addProgramsItem(String programsItem) {
    if (this.programs == null) {
      this.programs = new ArrayList<String>();
    }
    this.programs.add(programsItem);
    return this;
  }

   /**
   * Sub-lists matched by the order data. List members are separated by carets (^).
   * @return programs
  **/
  @ApiModelProperty(value = "Sub-lists matched by the order data. List members are separated by carets (^).")
  public List<String> getPrograms() {
    return programs;
  }

  public void setPrograms(List<String> programs) {
    this.programs = programs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches riskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches = (RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches) o;
    return Objects.equals(this.addresses, riskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches.addresses) &&
        Objects.equals(this.sanctionList, riskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches.sanctionList) &&
        Objects.equals(this.aliases, riskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches.aliases) &&
        Objects.equals(this.programs, riskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches.programs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, sanctionList, aliases, programs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1ExportComplianceInquiriesPost201ResponseExportComplianceInformationWatchListMatches {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    sanctionList: ").append(toIndentedString(sanctionList)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
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

