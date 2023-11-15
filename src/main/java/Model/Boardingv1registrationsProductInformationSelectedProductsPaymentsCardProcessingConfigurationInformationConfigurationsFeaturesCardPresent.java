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
import Model.Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresentProcessors;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresent
 */

public class Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresent {
  @SerializedName("processors")
  private Map<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresentProcessors> processors = null;

  @SerializedName("enableTerminalIdLookup")
  private Boolean enableTerminalIdLookup = null;

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresent processors(Map<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresentProcessors> processors) {
    this.processors = processors;
    return this;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresent putProcessorsItem(String key, Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresentProcessors processorsItem) {
    if (this.processors == null) {
      this.processors = new HashMap<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresentProcessors>();
    }
    this.processors.put(key, processorsItem);
    return this;
  }

   /**
   * e.g. * amexdirect * barclays2 * CUP * EFTPOS * fdiglobal * gpx * smartfdc * tsys * vero * VPC  For VPC, CUP and EFTPOS processors, replace the processor name from VPC or CUP or EFTPOS to the actual processor name in the sample request. e.g. replace VPC with &amp;lt;your vpc processor&amp;gt; 
   * @return processors
  **/
  @ApiModelProperty(value = "e.g. * amexdirect * barclays2 * CUP * EFTPOS * fdiglobal * gpx * smartfdc * tsys * vero * VPC  For VPC, CUP and EFTPOS processors, replace the processor name from VPC or CUP or EFTPOS to the actual processor name in the sample request. e.g. replace VPC with &lt;your vpc processor&gt; ")
  public Map<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresentProcessors> getProcessors() {
    return processors;
  }

  public void setProcessors(Map<String, Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresentProcessors> processors) {
    this.processors = processors;
  }

  public Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresent enableTerminalIdLookup(Boolean enableTerminalIdLookup) {
    this.enableTerminalIdLookup = enableTerminalIdLookup;
    return this;
  }

   /**
   * Used for Card Present and Virtual Terminal Transactions for Terminal ID lookup. Applicable for GPX (gpx) processor.
   * @return enableTerminalIdLookup
  **/
  @ApiModelProperty(value = "Used for Card Present and Virtual Terminal Transactions for Terminal ID lookup. Applicable for GPX (gpx) processor.")
  public Boolean getEnableTerminalIdLookup() {
    return enableTerminalIdLookup;
  }

  public void setEnableTerminalIdLookup(Boolean enableTerminalIdLookup) {
    this.enableTerminalIdLookup = enableTerminalIdLookup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresent boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresent = (Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresent) o;
    return Objects.equals(this.processors, boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresent.processors) &&
        Objects.equals(this.enableTerminalIdLookup, boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresent.enableTerminalIdLookup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processors, enableTerminalIdLookup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsProductInformationSelectedProductsPaymentsCardProcessingConfigurationInformationConfigurationsFeaturesCardPresent {\n");
    
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    enableTerminalIdLookup: ").append(toIndentedString(enableTerminalIdLookup)).append("\n");
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

