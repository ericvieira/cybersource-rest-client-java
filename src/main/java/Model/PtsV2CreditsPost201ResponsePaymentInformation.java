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
import Model.PtsV2PaymentsPost201ResponsePaymentInformationBank;
import Model.PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier;
import Model.Ptsv2paymentsPaymentInformationCustomer;
import Model.Ptsv2paymentsPaymentInformationPaymentInstrument;
import Model.Ptsv2paymentsPaymentInformationShippingAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2CreditsPost201ResponsePaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-12T17:46:06.587+05:30")
public class PtsV2CreditsPost201ResponsePaymentInformation {
  @SerializedName("bank")
  private PtsV2PaymentsPost201ResponsePaymentInformationBank bank = null;

  @SerializedName("customer")
  private Ptsv2paymentsPaymentInformationCustomer customer = null;

  @SerializedName("paymentInstrument")
  private Ptsv2paymentsPaymentInformationPaymentInstrument paymentInstrument = null;

  @SerializedName("instrumentIdentifier")
  private PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier instrumentIdentifier = null;

  @SerializedName("shippingAddress")
  private Ptsv2paymentsPaymentInformationShippingAddress shippingAddress = null;

  public PtsV2CreditsPost201ResponsePaymentInformation bank(PtsV2PaymentsPost201ResponsePaymentInformationBank bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformationBank getBank() {
    return bank;
  }

  public void setBank(PtsV2PaymentsPost201ResponsePaymentInformationBank bank) {
    this.bank = bank;
  }

  public PtsV2CreditsPost201ResponsePaymentInformation customer(Ptsv2paymentsPaymentInformationCustomer customer) {
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

  public PtsV2CreditsPost201ResponsePaymentInformation paymentInstrument(Ptsv2paymentsPaymentInformationPaymentInstrument paymentInstrument) {
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

  public PtsV2CreditsPost201ResponsePaymentInformation instrumentIdentifier(PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
    return this;
  }

   /**
   * Get instrumentIdentifier
   * @return instrumentIdentifier
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier getInstrumentIdentifier() {
    return instrumentIdentifier;
  }

  public void setInstrumentIdentifier(PtsV2PaymentsPost201ResponsePaymentInformationInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
  }

  public PtsV2CreditsPost201ResponsePaymentInformation shippingAddress(Ptsv2paymentsPaymentInformationShippingAddress shippingAddress) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2CreditsPost201ResponsePaymentInformation ptsV2CreditsPost201ResponsePaymentInformation = (PtsV2CreditsPost201ResponsePaymentInformation) o;
    return Objects.equals(this.bank, ptsV2CreditsPost201ResponsePaymentInformation.bank) &&
        Objects.equals(this.customer, ptsV2CreditsPost201ResponsePaymentInformation.customer) &&
        Objects.equals(this.paymentInstrument, ptsV2CreditsPost201ResponsePaymentInformation.paymentInstrument) &&
        Objects.equals(this.instrumentIdentifier, ptsV2CreditsPost201ResponsePaymentInformation.instrumentIdentifier) &&
        Objects.equals(this.shippingAddress, ptsV2CreditsPost201ResponsePaymentInformation.shippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bank, customer, paymentInstrument, instrumentIdentifier, shippingAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2CreditsPost201ResponsePaymentInformation {\n");
    
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    instrumentIdentifier: ").append(toIndentedString(instrumentIdentifier)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
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

