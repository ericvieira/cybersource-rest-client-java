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
import Model.Ptsv2paymentsPaymentInformationBank;
import Model.Ptsv2paymentsPaymentInformationCard;
import Model.Ptsv2paymentsPaymentInformationCustomer;
import Model.Ptsv2paymentsPaymentInformationEWallet;
import Model.Ptsv2paymentsPaymentInformationFluidData;
import Model.Ptsv2paymentsPaymentInformationInstrumentIdentifier;
import Model.Ptsv2paymentsPaymentInformationLegacyToken;
import Model.Ptsv2paymentsPaymentInformationPaymentInstrument;
import Model.Ptsv2paymentsPaymentInformationPaymentType;
import Model.Ptsv2paymentsPaymentInformationShippingAddress;
import Model.Ptsv2paymentsPaymentInformationTokenizedCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsPaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-27T11:49:34.253+05:30")
public class Ptsv2paymentsPaymentInformation {
  @SerializedName("intent")
  private String intent = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("card")
  private Ptsv2paymentsPaymentInformationCard card = null;

  @SerializedName("tokenizedCard")
  private Ptsv2paymentsPaymentInformationTokenizedCard tokenizedCard = null;

  @SerializedName("fluidData")
  private Ptsv2paymentsPaymentInformationFluidData fluidData = null;

  @SerializedName("customer")
  private Ptsv2paymentsPaymentInformationCustomer customer = null;

  @SerializedName("paymentInstrument")
  private Ptsv2paymentsPaymentInformationPaymentInstrument paymentInstrument = null;

  @SerializedName("instrumentIdentifier")
  private Ptsv2paymentsPaymentInformationInstrumentIdentifier instrumentIdentifier = null;

  @SerializedName("shippingAddress")
  private Ptsv2paymentsPaymentInformationShippingAddress shippingAddress = null;

  @SerializedName("legacyToken")
  private Ptsv2paymentsPaymentInformationLegacyToken legacyToken = null;

  @SerializedName("bank")
  private Ptsv2paymentsPaymentInformationBank bank = null;

  @SerializedName("paymentType")
  private Ptsv2paymentsPaymentInformationPaymentType paymentType = null;

  @SerializedName("initiationChannel")
  private String initiationChannel = null;

  @SerializedName("eWallet")
  private Ptsv2paymentsPaymentInformationEWallet eWallet = null;

  public Ptsv2paymentsPaymentInformation intent(String intent) {
    this.intent = intent;
    return this;
  }

   /**
   * Intent. 
   * @return intent
  **/
  @ApiModelProperty(value = "Intent. ")
  public String getIntent() {
    return intent;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public Ptsv2paymentsPaymentInformation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code. 
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country code. ")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Ptsv2paymentsPaymentInformation card(Ptsv2paymentsPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(Ptsv2paymentsPaymentInformationCard card) {
    this.card = card;
  }

  public Ptsv2paymentsPaymentInformation tokenizedCard(Ptsv2paymentsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(Ptsv2paymentsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public Ptsv2paymentsPaymentInformation fluidData(Ptsv2paymentsPaymentInformationFluidData fluidData) {
    this.fluidData = fluidData;
    return this;
  }

   /**
   * Get fluidData
   * @return fluidData
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationFluidData getFluidData() {
    return fluidData;
  }

  public void setFluidData(Ptsv2paymentsPaymentInformationFluidData fluidData) {
    this.fluidData = fluidData;
  }

  public Ptsv2paymentsPaymentInformation customer(Ptsv2paymentsPaymentInformationCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(Ptsv2paymentsPaymentInformationCustomer customer) {
    this.customer = customer;
  }

  public Ptsv2paymentsPaymentInformation paymentInstrument(Ptsv2paymentsPaymentInformationPaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

   /**
   * Get paymentInstrument
   * @return paymentInstrument
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationPaymentInstrument getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(Ptsv2paymentsPaymentInformationPaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }

  public Ptsv2paymentsPaymentInformation instrumentIdentifier(Ptsv2paymentsPaymentInformationInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
    return this;
  }

   /**
   * Get instrumentIdentifier
   * @return instrumentIdentifier
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationInstrumentIdentifier getInstrumentIdentifier() {
    return instrumentIdentifier;
  }

  public void setInstrumentIdentifier(Ptsv2paymentsPaymentInformationInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
  }

  public Ptsv2paymentsPaymentInformation shippingAddress(Ptsv2paymentsPaymentInformationShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationShippingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Ptsv2paymentsPaymentInformationShippingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Ptsv2paymentsPaymentInformation legacyToken(Ptsv2paymentsPaymentInformationLegacyToken legacyToken) {
    this.legacyToken = legacyToken;
    return this;
  }

   /**
   * Get legacyToken
   * @return legacyToken
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationLegacyToken getLegacyToken() {
    return legacyToken;
  }

  public void setLegacyToken(Ptsv2paymentsPaymentInformationLegacyToken legacyToken) {
    this.legacyToken = legacyToken;
  }

  public Ptsv2paymentsPaymentInformation bank(Ptsv2paymentsPaymentInformationBank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationBank getBank() {
    return bank;
  }

  public void setBank(Ptsv2paymentsPaymentInformationBank bank) {
    this.bank = bank;
  }

  public Ptsv2paymentsPaymentInformation paymentType(Ptsv2paymentsPaymentInformationPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationPaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(Ptsv2paymentsPaymentInformationPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public Ptsv2paymentsPaymentInformation initiationChannel(String initiationChannel) {
    this.initiationChannel = initiationChannel;
    return this;
  }

   /**
   * Mastercard-defined code that indicates how the account information was obtained.  - &#x60;00&#x60;: Card - &#x60;01&#x60;: Mobile Network Operator (MNO) controlled removable secure element (SIM or UICC) personalized for use with a mobile phone or smartphone - &#x60;02&#x60;: Key fob - &#x60;03&#x60;: Watch using a contactless chip or a fixed (non-removable) secure element not controlled by the MNO - &#x60;04&#x60;: Mobile tag - &#x60;05&#x60;: Wristband - &#x60;06&#x60;: Mobile phone case or sleeve - &#x60;07&#x60;: Mobile phone or smartphone with a fixed (non-removable) secure element controlled by the MNO,for example, code division multiple access (CDMA) - &#x60;08&#x60;: Removable secure element not controlled by the MNO, for example, memory card personalized forused with a mobile phone or smartphone - &#x60;09&#x60;: Mobile Phone or smartphone with a fixed (non-removable) secure element not controlled by the MNO - &#x60;10&#x60;: MNO controlled removable secure element (SIM or UICC) personalized for use with a tablet or e-book - &#x60;11&#x60;: Tablet or e-book with a fixed (non-removable) secure element controlled by the MNO - &#x60;12&#x60;: Removable secure element not controlled by the MNO, for example, memory card personalized foruse with a tablet or e-book - &#x60;13&#x60;: Tablet or e-book with fixed (non-removable) secure element not controlled by the MNO - &#x60;14&#x60;: Mobile phone or smartphone with a payment application running in a host processor - &#x60;15&#x60;: Tablet or e-book with a payment application running in a host processor - &#x60;16&#x60;: Mobile phone or smartphone with a payment application running in the Trusted ExecutionEnvironment (TEE) of a host processor - &#x60;17&#x60;: Tablet or e-book with a payment application running in the TEE of a host processor - &#x60;18&#x60;: Watch with a payment application running in the TEE of a host processor - &#x60;19&#x60;: Watch with a payment application running in a host processor  Values from 20–99 exclusively indicate the form factor only without also indicating the storage technology  - &#x60;20&#x60;: Card - &#x60;21&#x60;: Phone e.g. Mobile Phone - &#x60;22&#x60;: Tablet/e-reader - &#x60;23&#x60;: Watch/Wristband e.g. Watch or wristband, including a fitness band, smart strap, disposable band, watch add-on, and security/ID band - &#x60;24&#x60;: Sticker - &#x60;25&#x60;: PC - &#x60;26&#x60;: Device Peripheral e.g. mobile phone case or sleeve - &#x60;27&#x60;: Tag e.g. key fob or mobile tag - &#x60;28&#x60;: Jewelry e.g. ring, bracelet, necklace and cuff links - &#x60;29&#x60;: Fashion Accessory e.g. handbag, bag charm and glasses - &#x60;30&#x60;: Garment e.g. dress - &#x60;31&#x60;: Domestic Appliance e.g refrigerator, washing machine - &#x60;32&#x60;: Vehicle e.g. vehicle, including vehicle attached devices - &#x60;33&#x60;: Media/Gaming Device e.g. media or gaming device, including a set top box, media player and television  34–99 are reserved for future form factors. Any value in this range may occur within form factor and transaction data without prior notice.  This field is supported only for Mastercard on CyberSource through VisaNet. When initiation channel is not provided via this API field, the value is extracted from EMV tag 9F6E for Mastercard transactions. To enable this feature please call support.  #### Used by **Authorization** Optional field. 
   * @return initiationChannel
  **/
  @ApiModelProperty(value = "Mastercard-defined code that indicates how the account information was obtained.  - `00`: Card - `01`: Mobile Network Operator (MNO) controlled removable secure element (SIM or UICC) personalized for use with a mobile phone or smartphone - `02`: Key fob - `03`: Watch using a contactless chip or a fixed (non-removable) secure element not controlled by the MNO - `04`: Mobile tag - `05`: Wristband - `06`: Mobile phone case or sleeve - `07`: Mobile phone or smartphone with a fixed (non-removable) secure element controlled by the MNO,for example, code division multiple access (CDMA) - `08`: Removable secure element not controlled by the MNO, for example, memory card personalized forused with a mobile phone or smartphone - `09`: Mobile Phone or smartphone with a fixed (non-removable) secure element not controlled by the MNO - `10`: MNO controlled removable secure element (SIM or UICC) personalized for use with a tablet or e-book - `11`: Tablet or e-book with a fixed (non-removable) secure element controlled by the MNO - `12`: Removable secure element not controlled by the MNO, for example, memory card personalized foruse with a tablet or e-book - `13`: Tablet or e-book with fixed (non-removable) secure element not controlled by the MNO - `14`: Mobile phone or smartphone with a payment application running in a host processor - `15`: Tablet or e-book with a payment application running in a host processor - `16`: Mobile phone or smartphone with a payment application running in the Trusted ExecutionEnvironment (TEE) of a host processor - `17`: Tablet or e-book with a payment application running in the TEE of a host processor - `18`: Watch with a payment application running in the TEE of a host processor - `19`: Watch with a payment application running in a host processor  Values from 20–99 exclusively indicate the form factor only without also indicating the storage technology  - `20`: Card - `21`: Phone e.g. Mobile Phone - `22`: Tablet/e-reader - `23`: Watch/Wristband e.g. Watch or wristband, including a fitness band, smart strap, disposable band, watch add-on, and security/ID band - `24`: Sticker - `25`: PC - `26`: Device Peripheral e.g. mobile phone case or sleeve - `27`: Tag e.g. key fob or mobile tag - `28`: Jewelry e.g. ring, bracelet, necklace and cuff links - `29`: Fashion Accessory e.g. handbag, bag charm and glasses - `30`: Garment e.g. dress - `31`: Domestic Appliance e.g refrigerator, washing machine - `32`: Vehicle e.g. vehicle, including vehicle attached devices - `33`: Media/Gaming Device e.g. media or gaming device, including a set top box, media player and television  34–99 are reserved for future form factors. Any value in this range may occur within form factor and transaction data without prior notice.  This field is supported only for Mastercard on CyberSource through VisaNet. When initiation channel is not provided via this API field, the value is extracted from EMV tag 9F6E for Mastercard transactions. To enable this feature please call support.  #### Used by **Authorization** Optional field. ")
  public String getInitiationChannel() {
    return initiationChannel;
  }

  public void setInitiationChannel(String initiationChannel) {
    this.initiationChannel = initiationChannel;
  }

  public Ptsv2paymentsPaymentInformation eWallet(Ptsv2paymentsPaymentInformationEWallet eWallet) {
    this.eWallet = eWallet;
    return this;
  }

   /**
   * Get eWallet
   * @return eWallet
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsPaymentInformationEWallet getEWallet() {
    return eWallet;
  }

  public void setEWallet(Ptsv2paymentsPaymentInformationEWallet eWallet) {
    this.eWallet = eWallet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsPaymentInformation ptsv2paymentsPaymentInformation = (Ptsv2paymentsPaymentInformation) o;
    return Objects.equals(this.intent, ptsv2paymentsPaymentInformation.intent) &&
        Objects.equals(this.countryCode, ptsv2paymentsPaymentInformation.countryCode) &&
        Objects.equals(this.card, ptsv2paymentsPaymentInformation.card) &&
        Objects.equals(this.tokenizedCard, ptsv2paymentsPaymentInformation.tokenizedCard) &&
        Objects.equals(this.fluidData, ptsv2paymentsPaymentInformation.fluidData) &&
        Objects.equals(this.customer, ptsv2paymentsPaymentInformation.customer) &&
        Objects.equals(this.paymentInstrument, ptsv2paymentsPaymentInformation.paymentInstrument) &&
        Objects.equals(this.instrumentIdentifier, ptsv2paymentsPaymentInformation.instrumentIdentifier) &&
        Objects.equals(this.shippingAddress, ptsv2paymentsPaymentInformation.shippingAddress) &&
        Objects.equals(this.legacyToken, ptsv2paymentsPaymentInformation.legacyToken) &&
        Objects.equals(this.bank, ptsv2paymentsPaymentInformation.bank) &&
        Objects.equals(this.paymentType, ptsv2paymentsPaymentInformation.paymentType) &&
        Objects.equals(this.initiationChannel, ptsv2paymentsPaymentInformation.initiationChannel) &&
        Objects.equals(this.eWallet, ptsv2paymentsPaymentInformation.eWallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intent, countryCode, card, tokenizedCard, fluidData, customer, paymentInstrument, instrumentIdentifier, shippingAddress, legacyToken, bank, paymentType, initiationChannel, eWallet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsPaymentInformation {\n");
    
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    fluidData: ").append(toIndentedString(fluidData)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    instrumentIdentifier: ").append(toIndentedString(instrumentIdentifier)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    legacyToken: ").append(toIndentedString(legacyToken)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    initiationChannel: ").append(toIndentedString(initiationChannel)).append("\n");
    sb.append("    eWallet: ").append(toIndentedString(eWallet)).append("\n");
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

