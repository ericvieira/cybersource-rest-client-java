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
 * *NEW* Name of the payment processor. Example - \&quot;wellsfargoach\&quot;
 */
@ApiModel(description = "*NEW* Name of the payment processor. Example - \"wellsfargoach\"")

public class Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors {
  @SerializedName("avsAccountOwnershipService")
  private Boolean avsAccountOwnershipService = null;

  @SerializedName("avsAccountStatusService")
  private Boolean avsAccountStatusService = null;

  @SerializedName("avsSignedAgreement")
  private Boolean avsSignedAgreement = null;

  @SerializedName("avsAdditionalId")
  private String avsAdditionalId = null;

  @SerializedName("enableAvs")
  private Boolean enableAvs = true;

  @SerializedName("avsEntityId")
  private String avsEntityId = null;

  @SerializedName("enableAvsTokenCreation")
  private Boolean enableAvsTokenCreation = false;

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors avsAccountOwnershipService(Boolean avsAccountOwnershipService) {
    this.avsAccountOwnershipService = avsAccountOwnershipService;
    return this;
  }

   /**
   * *NEW* Determined in WF eTicket if account has opted into the Account Ownership Service.
   * @return avsAccountOwnershipService
  **/
  @ApiModelProperty(value = "*NEW* Determined in WF eTicket if account has opted into the Account Ownership Service.")
  public Boolean getAvsAccountOwnershipService() {
    return avsAccountOwnershipService;
  }

  public void setAvsAccountOwnershipService(Boolean avsAccountOwnershipService) {
    this.avsAccountOwnershipService = avsAccountOwnershipService;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors avsAccountStatusService(Boolean avsAccountStatusService) {
    this.avsAccountStatusService = avsAccountStatusService;
    return this;
  }

   /**
   * *NEW* Determined in WF eTicket if account has opted into the Account Status Service.
   * @return avsAccountStatusService
  **/
  @ApiModelProperty(value = "*NEW* Determined in WF eTicket if account has opted into the Account Status Service.")
  public Boolean getAvsAccountStatusService() {
    return avsAccountStatusService;
  }

  public void setAvsAccountStatusService(Boolean avsAccountStatusService) {
    this.avsAccountStatusService = avsAccountStatusService;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors avsSignedAgreement(Boolean avsSignedAgreement) {
    this.avsSignedAgreement = avsSignedAgreement;
    return this;
  }

   /**
   * *NEW* Taken from Addendum Agreement Column in boarding form.
   * @return avsSignedAgreement
  **/
  @ApiModelProperty(value = "*NEW* Taken from Addendum Agreement Column in boarding form.")
  public Boolean getAvsSignedAgreement() {
    return avsSignedAgreement;
  }

  public void setAvsSignedAgreement(Boolean avsSignedAgreement) {
    this.avsSignedAgreement = avsSignedAgreement;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors avsAdditionalId(String avsAdditionalId) {
    this.avsAdditionalId = avsAdditionalId;
    return this;
  }

   /**
   * *NEW* Also known as the Additional ID. Taken from the boarding form.
   * @return avsAdditionalId
  **/
  @ApiModelProperty(value = "*NEW* Also known as the Additional ID. Taken from the boarding form.")
  public String getAvsAdditionalId() {
    return avsAdditionalId;
  }

  public void setAvsAdditionalId(String avsAdditionalId) {
    this.avsAdditionalId = avsAdditionalId;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors enableAvs(Boolean enableAvs) {
    this.enableAvs = enableAvs;
    return this;
  }

   /**
   * *NEW*
   * @return enableAvs
  **/
  @ApiModelProperty(value = "*NEW*")
  public Boolean getEnableAvs() {
    return enableAvs;
  }

  public void setEnableAvs(Boolean enableAvs) {
    this.enableAvs = enableAvs;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors avsEntityId(String avsEntityId) {
    this.avsEntityId = avsEntityId;
    return this;
  }

   /**
   * *NEW* Also known as the AVS Gateway Entity ID.
   * @return avsEntityId
  **/
  @ApiModelProperty(value = "*NEW* Also known as the AVS Gateway Entity ID.")
  public String getAvsEntityId() {
    return avsEntityId;
  }

  public void setAvsEntityId(String avsEntityId) {
    this.avsEntityId = avsEntityId;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors enableAvsTokenCreation(Boolean enableAvsTokenCreation) {
    this.enableAvsTokenCreation = enableAvsTokenCreation;
    return this;
  }

   /**
   * *NEW* Applicable if the merchant wants to run AVS on token creation requests only.
   * @return enableAvsTokenCreation
  **/
  @ApiModelProperty(value = "*NEW* Applicable if the merchant wants to run AVS on token creation requests only.")
  public Boolean getEnableAvsTokenCreation() {
    return enableAvsTokenCreation;
  }

  public void setEnableAvsTokenCreation(Boolean enableAvsTokenCreation) {
    this.enableAvsTokenCreation = enableAvsTokenCreation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors = (Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors) o;
    return Objects.equals(this.avsAccountOwnershipService, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors.avsAccountOwnershipService) &&
        Objects.equals(this.avsAccountStatusService, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors.avsAccountStatusService) &&
        Objects.equals(this.avsSignedAgreement, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors.avsSignedAgreement) &&
        Objects.equals(this.avsAdditionalId, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors.avsAdditionalId) &&
        Objects.equals(this.enableAvs, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors.enableAvs) &&
        Objects.equals(this.avsEntityId, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors.avsEntityId) &&
        Objects.equals(this.enableAvsTokenCreation, boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors.enableAvsTokenCreation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avsAccountOwnershipService, avsAccountStatusService, avsSignedAgreement, avsAdditionalId, enableAvs, avsEntityId, enableAvsTokenCreation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsProductInformationSelectedProductsPaymentsECheckConfigurationInformationConfigurationsFeaturesAccountValidationServiceProcessors {\n");
    
    sb.append("    avsAccountOwnershipService: ").append(toIndentedString(avsAccountOwnershipService)).append("\n");
    sb.append("    avsAccountStatusService: ").append(toIndentedString(avsAccountStatusService)).append("\n");
    sb.append("    avsSignedAgreement: ").append(toIndentedString(avsSignedAgreement)).append("\n");
    sb.append("    avsAdditionalId: ").append(toIndentedString(avsAdditionalId)).append("\n");
    sb.append("    enableAvs: ").append(toIndentedString(enableAvs)).append("\n");
    sb.append("    avsEntityId: ").append(toIndentedString(avsEntityId)).append("\n");
    sb.append("    enableAvsTokenCreation: ").append(toIndentedString(enableAvsTokenCreation)).append("\n");
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

