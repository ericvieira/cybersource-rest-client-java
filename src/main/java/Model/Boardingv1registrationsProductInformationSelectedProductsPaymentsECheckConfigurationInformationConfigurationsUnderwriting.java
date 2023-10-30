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
import java.math.BigDecimal;

/**
 * Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting
 */

public class Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting {
  @SerializedName("standardEntryClassCodes")
  private String standardEntryClassCodes = "CCD,PPD,TEL,WEB";

  @SerializedName("enableHold")
  private Boolean enableHold = true;

  @SerializedName("monthlyTotalTransactionAmountLimit")
  private BigDecimal monthlyTotalTransactionAmountLimit = null;

  @SerializedName("holdingDays")
  private BigDecimal holdingDays = null;

  @SerializedName("enableCredits")
  private Boolean enableCredits = null;

  @SerializedName("transactionAmountLimit")
  private BigDecimal transactionAmountLimit = null;

  @SerializedName("riskReserveMethod")
  private String riskReserveMethod = null;

  @SerializedName("riskReserveRate")
  private BigDecimal riskReserveRate = null;

  @SerializedName("riskReserveTargetAmount")
  private BigDecimal riskReserveTargetAmount = null;

  @SerializedName("solutionOrganizationId")
  private String solutionOrganizationId = null;

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting standardEntryClassCodes(String standardEntryClassCodes) {
    this.standardEntryClassCodes = standardEntryClassCodes;
    return this;
  }

   /**
   * Mandatory  Free-text (csv)  Possible values (combination):  CCD — Cash Concentration or Disbursement, or CCD, is a charge or refund against a business checking account. One-time or recurring CCD transactions are fund transfers to or from a corporate entity. A standing authorization is required for recurring transactions. PPD — Prearranged Payment and Deposit Entry, or PPD, is a charge or refund against a customer’s checking or savings account. PPD entries can only be originated when payment and deposit terms between the merchant and the customer are prearranged. A written authorization from the customer is required for one-time transactions and a written standing authorization is required for recurring transactions. TEL — Telephone-Initiated Entry, or TEL, is a one-time charge against a customer’s checking or savings account. TEL transactions can only be originated when a business relationship between the merchant and the customer already exists; or if a relationship does not exist, then only when the customer initiates the telephone call to the merchant. Payment authorization is obtained from the customer by telephone. WEB — Internet-Initiated Entry or WEB is a charge against a customer’s checking or savings account. One-time or recurring WEB transactions are originated through the Internet. Payment authorization is also obtained from the customer through the Internet. 
   * @return standardEntryClassCodes
  **/
  @ApiModelProperty(required = true, value = "Mandatory  Free-text (csv)  Possible values (combination):  CCD — Cash Concentration or Disbursement, or CCD, is a charge or refund against a business checking account. One-time or recurring CCD transactions are fund transfers to or from a corporate entity. A standing authorization is required for recurring transactions. PPD — Prearranged Payment and Deposit Entry, or PPD, is a charge or refund against a customer’s checking or savings account. PPD entries can only be originated when payment and deposit terms between the merchant and the customer are prearranged. A written authorization from the customer is required for one-time transactions and a written standing authorization is required for recurring transactions. TEL — Telephone-Initiated Entry, or TEL, is a one-time charge against a customer’s checking or savings account. TEL transactions can only be originated when a business relationship between the merchant and the customer already exists; or if a relationship does not exist, then only when the customer initiates the telephone call to the merchant. Payment authorization is obtained from the customer by telephone. WEB — Internet-Initiated Entry or WEB is a charge against a customer’s checking or savings account. One-time or recurring WEB transactions are originated through the Internet. Payment authorization is also obtained from the customer through the Internet. ")
  public String getStandardEntryClassCodes() {
    return standardEntryClassCodes;
  }

  public void setStandardEntryClassCodes(String standardEntryClassCodes) {
    this.standardEntryClassCodes = standardEntryClassCodes;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting enableHold(Boolean enableHold) {
    this.enableHold = enableHold;
    return this;
  }

   /**
   * Mandatory  Determines whether CYBS has placed the merchant on a funding hold This will often be set to True for new merchants until the risk team has completed additional verification of their first transaction. It will be switched to \&quot;false\&quot; once underwriting review is completed and we are ready to start funding the merchant. 
   * @return enableHold
  **/
  @ApiModelProperty(required = true, value = "Mandatory  Determines whether CYBS has placed the merchant on a funding hold This will often be set to True for new merchants until the risk team has completed additional verification of their first transaction. It will be switched to \"false\" once underwriting review is completed and we are ready to start funding the merchant. ")
  public Boolean getEnableHold() {
    return enableHold;
  }

  public void setEnableHold(Boolean enableHold) {
    this.enableHold = enableHold;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting monthlyTotalTransactionAmountLimit(BigDecimal monthlyTotalTransactionAmountLimit) {
    this.monthlyTotalTransactionAmountLimit = monthlyTotalTransactionAmountLimit;
    return this;
  }

   /**
   * Mandatory  Monthly Maximum total Transaction Amount 12 digit including decimal 
   * @return monthlyTotalTransactionAmountLimit
  **/
  @ApiModelProperty(required = true, value = "Mandatory  Monthly Maximum total Transaction Amount 12 digit including decimal ")
  public BigDecimal getMonthlyTotalTransactionAmountLimit() {
    return monthlyTotalTransactionAmountLimit;
  }

  public void setMonthlyTotalTransactionAmountLimit(BigDecimal monthlyTotalTransactionAmountLimit) {
    this.monthlyTotalTransactionAmountLimit = monthlyTotalTransactionAmountLimit;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting holdingDays(BigDecimal holdingDays) {
    this.holdingDays = holdingDays;
    return this;
  }

   /**
   * Mandatory  Funds Hold Days (Number of days funds will be held before it will be deposited into merchant account) 3 digits 
   * @return holdingDays
  **/
  @ApiModelProperty(required = true, value = "Mandatory  Funds Hold Days (Number of days funds will be held before it will be deposited into merchant account) 3 digits ")
  public BigDecimal getHoldingDays() {
    return holdingDays;
  }

  public void setHoldingDays(BigDecimal holdingDays) {
    this.holdingDays = holdingDays;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting enableCredits(Boolean enableCredits) {
    this.enableCredits = enableCredits;
    return this;
  }

   /**
   * Optional  Allow Credits (True/False) 
   * @return enableCredits
  **/
  @ApiModelProperty(value = "Optional  Allow Credits (True/False) ")
  public Boolean getEnableCredits() {
    return enableCredits;
  }

  public void setEnableCredits(Boolean enableCredits) {
    this.enableCredits = enableCredits;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting transactionAmountLimit(BigDecimal transactionAmountLimit) {
    this.transactionAmountLimit = transactionAmountLimit;
    return this;
  }

   /**
   * Mandatory  Maximum total Transaction Amount This is a per transaction limit. For example, the merchant is limited to processing transactions under $100 12 digits (including decimal - USD only) 
   * @return transactionAmountLimit
  **/
  @ApiModelProperty(required = true, value = "Mandatory  Maximum total Transaction Amount This is a per transaction limit. For example, the merchant is limited to processing transactions under $100 12 digits (including decimal - USD only) ")
  public BigDecimal getTransactionAmountLimit() {
    return transactionAmountLimit;
  }

  public void setTransactionAmountLimit(BigDecimal transactionAmountLimit) {
    this.transactionAmountLimit = transactionAmountLimit;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting riskReserveMethod(String riskReserveMethod) {
    this.riskReserveMethod = riskReserveMethod;
    return this;
  }

   /**
   * Mandatory Reserve Method  Possible value: - fixed - none Most merchants do not have a reserve attached to their account so the default value would be \&quot;none.\&quot;   For a Fixed Reserve, the reserve balance is established by either, (1) a receipt of a lump sum deposit from a merchant, or (2) withholding funds at a Reserve Rate established for the account from each batch settlement until the reserve balance is equal to a set Reserve Target. A Fixed Reserve may also be established by a combination of lump sum deposit and withholding of settlement funds.  A Rolling Reserve balance is established by withholding from a merchant’s available settlement funds at a Reserve Rate (percentage) and no Reserve Target is specified. Rather, each amount withheld is retained for a specified number of Reserve Holding Days and then released back to the merchant. 
   * @return riskReserveMethod
  **/
  @ApiModelProperty(required = true, value = "Mandatory Reserve Method  Possible value: - fixed - none Most merchants do not have a reserve attached to their account so the default value would be \"none.\"   For a Fixed Reserve, the reserve balance is established by either, (1) a receipt of a lump sum deposit from a merchant, or (2) withholding funds at a Reserve Rate established for the account from each batch settlement until the reserve balance is equal to a set Reserve Target. A Fixed Reserve may also be established by a combination of lump sum deposit and withholding of settlement funds.  A Rolling Reserve balance is established by withholding from a merchant’s available settlement funds at a Reserve Rate (percentage) and no Reserve Target is specified. Rather, each amount withheld is retained for a specified number of Reserve Holding Days and then released back to the merchant. ")
  public String getRiskReserveMethod() {
    return riskReserveMethod;
  }

  public void setRiskReserveMethod(String riskReserveMethod) {
    this.riskReserveMethod = riskReserveMethod;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting riskReserveRate(BigDecimal riskReserveRate) {
    this.riskReserveRate = riskReserveRate;
    return this;
  }

   /**
   * Mandatory  Reserve Rate (% of TPV)&#x3D;&gt; Relevant for Rolling Reserve and Fixed Reserve The percentage rate at which risk funds are withheld from each eCheck.Net batch settlement. 
   * @return riskReserveRate
  **/
  @ApiModelProperty(required = true, value = "Mandatory  Reserve Rate (% of TPV)=> Relevant for Rolling Reserve and Fixed Reserve The percentage rate at which risk funds are withheld from each eCheck.Net batch settlement. ")
  public BigDecimal getRiskReserveRate() {
    return riskReserveRate;
  }

  public void setRiskReserveRate(BigDecimal riskReserveRate) {
    this.riskReserveRate = riskReserveRate;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting riskReserveTargetAmount(BigDecimal riskReserveTargetAmount) {
    this.riskReserveTargetAmount = riskReserveTargetAmount;
    return this;
  }

   /**
   * Mandatory  Reserve Target (fixed $ amount)&#x3D;&gt; Relevant for Fixed Reserve ONLY  The maximum dollar amount that can be held in Risk Reserve for a fixed reserve. Once risk withholdings reach the Reserve Target established for the eCheck.Net account, a portion of available funds will be deposited to the merchant’s bank account 12 digit including decimal 
   * @return riskReserveTargetAmount
  **/
  @ApiModelProperty(required = true, value = "Mandatory  Reserve Target (fixed $ amount)=> Relevant for Fixed Reserve ONLY  The maximum dollar amount that can be held in Risk Reserve for a fixed reserve. Once risk withholdings reach the Reserve Target established for the eCheck.Net account, a portion of available funds will be deposited to the merchant’s bank account 12 digit including decimal ")
  public BigDecimal getRiskReserveTargetAmount() {
    return riskReserveTargetAmount;
  }

  public void setRiskReserveTargetAmount(BigDecimal riskReserveTargetAmount) {
    this.riskReserveTargetAmount = riskReserveTargetAmount;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting solutionOrganizationId(String solutionOrganizationId) {
    this.solutionOrganizationId = solutionOrganizationId;
    return this;
  }

   /**
   * Solution organization id
   * @return solutionOrganizationId
  **/
  @ApiModelProperty(value = "Solution organization id")
  public String getSolutionOrganizationId() {
    return solutionOrganizationId;
  }

  public void setSolutionOrganizationId(String solutionOrganizationId) {
    this.solutionOrganizationId = solutionOrganizationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting = (Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting) o;
    return Objects.equals(this.standardEntryClassCodes, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting.standardEntryClassCodes) &&
        Objects.equals(this.enableHold, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting.enableHold) &&
        Objects.equals(this.monthlyTotalTransactionAmountLimit, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting.monthlyTotalTransactionAmountLimit) &&
        Objects.equals(this.holdingDays, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting.holdingDays) &&
        Objects.equals(this.enableCredits, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting.enableCredits) &&
        Objects.equals(this.transactionAmountLimit, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting.transactionAmountLimit) &&
        Objects.equals(this.riskReserveMethod, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting.riskReserveMethod) &&
        Objects.equals(this.riskReserveRate, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting.riskReserveRate) &&
        Objects.equals(this.riskReserveTargetAmount, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting.riskReserveTargetAmount) &&
        Objects.equals(this.solutionOrganizationId, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting.solutionOrganizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standardEntryClassCodes, enableHold, monthlyTotalTransactionAmountLimit, holdingDays, enableCredits, transactionAmountLimit, riskReserveMethod, riskReserveRate, riskReserveTargetAmount, solutionOrganizationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsUnderwriting {\n");
    
    sb.append("    standardEntryClassCodes: ").append(toIndentedString(standardEntryClassCodes)).append("\n");
    sb.append("    enableHold: ").append(toIndentedString(enableHold)).append("\n");
    sb.append("    monthlyTotalTransactionAmountLimit: ").append(toIndentedString(monthlyTotalTransactionAmountLimit)).append("\n");
    sb.append("    holdingDays: ").append(toIndentedString(holdingDays)).append("\n");
    sb.append("    enableCredits: ").append(toIndentedString(enableCredits)).append("\n");
    sb.append("    transactionAmountLimit: ").append(toIndentedString(transactionAmountLimit)).append("\n");
    sb.append("    riskReserveMethod: ").append(toIndentedString(riskReserveMethod)).append("\n");
    sb.append("    riskReserveRate: ").append(toIndentedString(riskReserveRate)).append("\n");
    sb.append("    riskReserveTargetAmount: ").append(toIndentedString(riskReserveTargetAmount)).append("\n");
    sb.append("    solutionOrganizationId: ").append(toIndentedString(solutionOrganizationId)).append("\n");
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

