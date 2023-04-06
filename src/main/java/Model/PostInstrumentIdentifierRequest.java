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
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierBankAccount;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierBillTo;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierIssuer;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierLinks;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierMetadata;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformation;
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierTokenizedCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PostInstrumentIdentifierRequest
 */

public class PostInstrumentIdentifierRequest {
  @SerializedName("_links")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("card")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard card = null;

  @SerializedName("bankAccount")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierBankAccount bankAccount = null;

  @SerializedName("tokenizedCard")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierTokenizedCard tokenizedCard = null;

  @SerializedName("issuer")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierIssuer issuer = null;

  @SerializedName("processingInformation")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformation processingInformation = null;

  @SerializedName("billTo")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierBillTo billTo = null;

  @SerializedName("metadata")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierMetadata metadata = null;

  public PostInstrumentIdentifierRequest links(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierLinks getLinks() {
    return links;
  }

  public void setLinks(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierLinks links) {
    this.links = links;
  }

  public PostInstrumentIdentifierRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Id of the Instrument Identifier Token. 
   * @return id
  **/
  @ApiModelProperty(value = "The Id of the Instrument Identifier Token. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The type.  Possible Values: - instrumentIdentifier 
   * @return object
  **/
  @ApiModelProperty(example = "instrumentIdentifier", value = "The type.  Possible Values: - instrumentIdentifier ")
  public String getObject() {
    return object;
  }

   /**
   * Issuers state for the card number. Possible Values: - ACTIVE - CLOSED : The account has been closed. 
   * @return state
  **/
  @ApiModelProperty(example = "ACTIVE", value = "Issuers state for the card number. Possible Values: - ACTIVE - CLOSED : The account has been closed. ")
  public String getState() {
    return state;
  }

  public PostInstrumentIdentifierRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of Instrument Identifier. Possible Values: - enrollable card 
   * @return type
  **/
  @ApiModelProperty(value = "The type of Instrument Identifier. Possible Values: - enrollable card ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PostInstrumentIdentifierRequest card(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard getCard() {
    return card;
  }

  public void setCard(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierCard card) {
    this.card = card;
  }

  public PostInstrumentIdentifierRequest bankAccount(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierBankAccount bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierBankAccount getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public PostInstrumentIdentifierRequest tokenizedCard(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public PostInstrumentIdentifierRequest issuer(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierIssuer issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierIssuer getIssuer() {
    return issuer;
  }

  public void setIssuer(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierIssuer issuer) {
    this.issuer = issuer;
  }

  public PostInstrumentIdentifierRequest processingInformation(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public PostInstrumentIdentifierRequest billTo(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierBillTo billTo) {
    this.billTo = billTo;
  }

  public PostInstrumentIdentifierRequest metadata(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifierMetadata metadata) {
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
    PostInstrumentIdentifierRequest postInstrumentIdentifierRequest = (PostInstrumentIdentifierRequest) o;
    return Objects.equals(this.links, postInstrumentIdentifierRequest.links) &&
        Objects.equals(this.id, postInstrumentIdentifierRequest.id) &&
        Objects.equals(this.object, postInstrumentIdentifierRequest.object) &&
        Objects.equals(this.state, postInstrumentIdentifierRequest.state) &&
        Objects.equals(this.type, postInstrumentIdentifierRequest.type) &&
        Objects.equals(this.card, postInstrumentIdentifierRequest.card) &&
        Objects.equals(this.bankAccount, postInstrumentIdentifierRequest.bankAccount) &&
        Objects.equals(this.tokenizedCard, postInstrumentIdentifierRequest.tokenizedCard) &&
        Objects.equals(this.issuer, postInstrumentIdentifierRequest.issuer) &&
        Objects.equals(this.processingInformation, postInstrumentIdentifierRequest.processingInformation) &&
        Objects.equals(this.billTo, postInstrumentIdentifierRequest.billTo) &&
        Objects.equals(this.metadata, postInstrumentIdentifierRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, object, state, type, card, bankAccount, tokenizedCard, issuer, processingInformation, billTo, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInstrumentIdentifierRequest {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
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

