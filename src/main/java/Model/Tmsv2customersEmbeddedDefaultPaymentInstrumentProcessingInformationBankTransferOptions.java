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
 * Tmsv2customersEmbeddedDefaultPaymentInstrumentProcessingInformationBankTransferOptions
 */

public class Tmsv2customersEmbeddedDefaultPaymentInstrumentProcessingInformationBankTransferOptions {
  @SerializedName("SECCode")
  private String seCCode = null;

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentProcessingInformationBankTransferOptions seCCode(String seCCode) {
    this.seCCode = seCCode;
    return this;
  }

   /**
   * Specifies the authorization method for the transaction.  #### TeleCheck Possible Values: - &#x60;ARC&#x60;: account receivable conversion - &#x60;CCD&#x60;: corporate cash disbursement - &#x60;POP&#x60;: point of purchase conversion - &#x60;PPD&#x60;: prearranged payment and deposit entry - &#x60;TEL&#x60;: telephone-initiated entry - &#x60;WEB&#x60;: internet-initiated entry  For details, see &#x60;ecp_sec_code&#x60; field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) 
   * @return seCCode
  **/
  @ApiModelProperty(value = "Specifies the authorization method for the transaction.  #### TeleCheck Possible Values: - `ARC`: account receivable conversion - `CCD`: corporate cash disbursement - `POP`: point of purchase conversion - `PPD`: prearranged payment and deposit entry - `TEL`: telephone-initiated entry - `WEB`: internet-initiated entry  For details, see `ecp_sec_code` field description in the [Electronic Check Services Using the SCMP API Guide.](https://apps.cybersource.com/library/documentation/dev_guides/EChecks_SCMP_API/html/) ")
  public String getSeCCode() {
    return seCCode;
  }

  public void setSeCCode(String seCCode) {
    this.seCCode = seCCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultPaymentInstrumentProcessingInformationBankTransferOptions tmsv2customersEmbeddedDefaultPaymentInstrumentProcessingInformationBankTransferOptions = (Tmsv2customersEmbeddedDefaultPaymentInstrumentProcessingInformationBankTransferOptions) o;
    return Objects.equals(this.seCCode, tmsv2customersEmbeddedDefaultPaymentInstrumentProcessingInformationBankTransferOptions.seCCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seCCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultPaymentInstrumentProcessingInformationBankTransferOptions {\n");
    
    sb.append("    seCCode: ").append(toIndentedString(seCCode)).append("\n");
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

