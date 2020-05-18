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
import Model.TmsV1InstrumentIdentifiersPost200ResponseCard;
import Model.TmsV1InstrumentIdentifiersPost200ResponseIssuer;
import Model.TmsV1InstrumentIdentifiersPost200ResponseLinks;
import Model.TmsV1InstrumentIdentifiersPost200ResponseMetadata;
import Model.TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation;
import Model.TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard;
import Model.Tmsv1instrumentidentifiersBankAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TmsV1InstrumentIdentifiersPost200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T15:31:38.576+05:30")
public class TmsV1InstrumentIdentifiersPost200Response {
  @SerializedName("_links")
  private TmsV1InstrumentIdentifiersPost200ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("card")
  private TmsV1InstrumentIdentifiersPost200ResponseCard card = null;

  @SerializedName("tokenizedCard")
  private TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard tokenizedCard = null;

  @SerializedName("issuer")
  private TmsV1InstrumentIdentifiersPost200ResponseIssuer issuer = null;

  @SerializedName("bankAccount")
  private Tmsv1instrumentidentifiersBankAccount bankAccount = null;

  @SerializedName("processingInformation")
  private TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation processingInformation = null;

  @SerializedName("metadata")
  private TmsV1InstrumentIdentifiersPost200ResponseMetadata metadata = null;

  public TmsV1InstrumentIdentifiersPost200Response links(TmsV1InstrumentIdentifiersPost200ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(TmsV1InstrumentIdentifiersPost200ResponseLinks links) {
    this.links = links;
  }

   /**
   * Unique identification number assigned by CyberSource to the submitted request.
   * @return id
  **/
  @ApiModelProperty(example = "1234567890123456800", value = "Unique identification number assigned by CyberSource to the submitted request.")
  public String getId() {
    return id;
  }

   /**
   * &#39;Describes type of token.&#39;  Valid values: - instrumentIdentifier 
   * @return object
  **/
  @ApiModelProperty(example = "instrumentIdentifier", value = "'Describes type of token.'  Valid values: - instrumentIdentifier ")
  public String getObject() {
    return object;
  }

   /**
   * &#39;Current state of the token.&#39;  Valid values: - ACTIVE - CLOSED 
   * @return state
  **/
  @ApiModelProperty(example = "ACTIVE", value = "'Current state of the token.'  Valid values: - ACTIVE - CLOSED ")
  public String getState() {
    return state;
  }

  public TmsV1InstrumentIdentifiersPost200Response card(TmsV1InstrumentIdentifiersPost200ResponseCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseCard getCard() {
    return card;
  }

  public void setCard(TmsV1InstrumentIdentifiersPost200ResponseCard card) {
    this.card = card;
  }

  public TmsV1InstrumentIdentifiersPost200Response tokenizedCard(TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(TmsV1InstrumentIdentifiersPost200ResponseTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public TmsV1InstrumentIdentifiersPost200Response issuer(TmsV1InstrumentIdentifiersPost200ResponseIssuer issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseIssuer getIssuer() {
    return issuer;
  }

  public void setIssuer(TmsV1InstrumentIdentifiersPost200ResponseIssuer issuer) {
    this.issuer = issuer;
  }

  public TmsV1InstrumentIdentifiersPost200Response bankAccount(Tmsv1instrumentidentifiersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public Tmsv1instrumentidentifiersBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(Tmsv1instrumentidentifiersBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public TmsV1InstrumentIdentifiersPost200Response processingInformation(TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(TmsV1InstrumentIdentifiersPost200ResponseProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public TmsV1InstrumentIdentifiersPost200Response metadata(TmsV1InstrumentIdentifiersPost200ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public TmsV1InstrumentIdentifiersPost200ResponseMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(TmsV1InstrumentIdentifiersPost200ResponseMetadata metadata) {
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
    TmsV1InstrumentIdentifiersPost200Response tmsV1InstrumentIdentifiersPost200Response = (TmsV1InstrumentIdentifiersPost200Response) o;
    return Objects.equals(this.links, tmsV1InstrumentIdentifiersPost200Response.links) &&
        Objects.equals(this.id, tmsV1InstrumentIdentifiersPost200Response.id) &&
        Objects.equals(this.object, tmsV1InstrumentIdentifiersPost200Response.object) &&
        Objects.equals(this.state, tmsV1InstrumentIdentifiersPost200Response.state) &&
        Objects.equals(this.card, tmsV1InstrumentIdentifiersPost200Response.card) &&
        Objects.equals(this.tokenizedCard, tmsV1InstrumentIdentifiersPost200Response.tokenizedCard) &&
        Objects.equals(this.issuer, tmsV1InstrumentIdentifiersPost200Response.issuer) &&
        Objects.equals(this.bankAccount, tmsV1InstrumentIdentifiersPost200Response.bankAccount) &&
        Objects.equals(this.processingInformation, tmsV1InstrumentIdentifiersPost200Response.processingInformation) &&
        Objects.equals(this.metadata, tmsV1InstrumentIdentifiersPost200Response.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, object, state, card, tokenizedCard, issuer, bankAccount, processingInformation, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmsV1InstrumentIdentifiersPost200Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
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

