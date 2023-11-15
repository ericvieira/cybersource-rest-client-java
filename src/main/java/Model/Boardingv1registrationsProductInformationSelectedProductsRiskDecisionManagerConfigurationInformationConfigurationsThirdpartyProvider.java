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
import Model.Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderAccurint;
import Model.Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderCredilink;
import Model.Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderEkata;
import Model.Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderEmailage;
import Model.Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss;
import Model.Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd;
import Model.Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider
 */

public class Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider {
  @SerializedName("accurint")
  private Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderAccurint accurint = null;

  @SerializedName("credilink")
  private Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderCredilink credilink = null;

  @SerializedName("ekata")
  private Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderEkata ekata = null;

  @SerializedName("emailage")
  private Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderEmailage emailage = null;

  @SerializedName("perseuss")
  private Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss perseuss = null;

  @SerializedName("signifyd")
  private Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd signifyd = null;

  @SerializedName("targus")
  private Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargus targus = null;

  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider accurint(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderAccurint accurint) {
    this.accurint = accurint;
    return this;
  }

   /**
   * Get accurint
   * @return accurint
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderAccurint getAccurint() {
    return accurint;
  }

  public void setAccurint(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderAccurint accurint) {
    this.accurint = accurint;
  }

  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider credilink(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderCredilink credilink) {
    this.credilink = credilink;
    return this;
  }

   /**
   * Get credilink
   * @return credilink
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderCredilink getCredilink() {
    return credilink;
  }

  public void setCredilink(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderCredilink credilink) {
    this.credilink = credilink;
  }

  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider ekata(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderEkata ekata) {
    this.ekata = ekata;
    return this;
  }

   /**
   * Get ekata
   * @return ekata
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderEkata getEkata() {
    return ekata;
  }

  public void setEkata(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderEkata ekata) {
    this.ekata = ekata;
  }

  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider emailage(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderEmailage emailage) {
    this.emailage = emailage;
    return this;
  }

   /**
   * Get emailage
   * @return emailage
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderEmailage getEmailage() {
    return emailage;
  }

  public void setEmailage(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderEmailage emailage) {
    this.emailage = emailage;
  }

  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider perseuss(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss perseuss) {
    this.perseuss = perseuss;
    return this;
  }

   /**
   * Get perseuss
   * @return perseuss
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss getPerseuss() {
    return perseuss;
  }

  public void setPerseuss(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderPerseuss perseuss) {
    this.perseuss = perseuss;
  }

  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider signifyd(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd signifyd) {
    this.signifyd = signifyd;
    return this;
  }

   /**
   * Get signifyd
   * @return signifyd
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd getSignifyd() {
    return signifyd;
  }

  public void setSignifyd(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderSignifyd signifyd) {
    this.signifyd = signifyd;
  }

  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider targus(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargus targus) {
    this.targus = targus;
    return this;
  }

   /**
   * Get targus
   * @return targus
  **/
  @ApiModelProperty(value = "")
  public Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargus getTargus() {
    return targus;
  }

  public void setTargus(Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProviderTargus targus) {
    this.targus = targus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider = (Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider) o;
    return Objects.equals(this.accurint, boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider.accurint) &&
        Objects.equals(this.credilink, boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider.credilink) &&
        Objects.equals(this.ekata, boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider.ekata) &&
        Objects.equals(this.emailage, boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider.emailage) &&
        Objects.equals(this.perseuss, boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider.perseuss) &&
        Objects.equals(this.signifyd, boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider.signifyd) &&
        Objects.equals(this.targus, boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider.targus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accurint, credilink, ekata, emailage, perseuss, signifyd, targus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsProductInformationSelectedProductsRiskDecisionManagerConfigurationInformationConfigurationsThirdpartyProvider {\n");
    
    sb.append("    accurint: ").append(toIndentedString(accurint)).append("\n");
    sb.append("    credilink: ").append(toIndentedString(credilink)).append("\n");
    sb.append("    ekata: ").append(toIndentedString(ekata)).append("\n");
    sb.append("    emailage: ").append(toIndentedString(emailage)).append("\n");
    sb.append("    perseuss: ").append(toIndentedString(perseuss)).append("\n");
    sb.append("    signifyd: ").append(toIndentedString(signifyd)).append("\n");
    sb.append("    targus: ").append(toIndentedString(targus)).append("\n");
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

