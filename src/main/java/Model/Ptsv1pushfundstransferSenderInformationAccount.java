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
 * Ptsv1pushfundstransferSenderInformationAccount
 */

public class Ptsv1pushfundstransferSenderInformationAccount {
  @SerializedName("fundsSource")
  private String fundsSource = null;

  @SerializedName("number")
  private String number = null;

  public Ptsv1pushfundstransferSenderInformationAccount fundsSource(String fundsSource) {
    this.fundsSource = fundsSource;
    return this;
  }

   /**
   * Source of funds. Possible values:  Chase Paymentech, FDC Compass, Visa Platform Connect:  - &#x60;01&#x60;: Credit card - &#x60;02&#x60;: Debit card - &#x60;03&#x60;: Prepaid card  Chase Paymentech, Visa Platform Connect:  - &#x60;04&#x60;: Cash - &#x60;05&#x60;: Debit or deposit account that is not linked to a Visa card. Includes checking accounts, savings accounts, and proprietary debit or ATM cards. - &#x60;06&#x60;: Credit account that is not linked to a Visa card. Includes credit cards and proprietary lines of credit.  FDC Compass: - &#x60;04&#x60;: Deposit Account  Funds Disbursement This value is most likely 05 to identify that the originator used a deposit account to fund the disbursement.  Credit Card Bill Payment This value must be 02, 03, 04, or 05. 
   * @return fundsSource
  **/
  @ApiModelProperty(value = "Source of funds. Possible values:  Chase Paymentech, FDC Compass, Visa Platform Connect:  - `01`: Credit card - `02`: Debit card - `03`: Prepaid card  Chase Paymentech, Visa Platform Connect:  - `04`: Cash - `05`: Debit or deposit account that is not linked to a Visa card. Includes checking accounts, savings accounts, and proprietary debit or ATM cards. - `06`: Credit account that is not linked to a Visa card. Includes credit cards and proprietary lines of credit.  FDC Compass: - `04`: Deposit Account  Funds Disbursement This value is most likely 05 to identify that the originator used a deposit account to fund the disbursement.  Credit Card Bill Payment This value must be 02, 03, 04, or 05. ")
  public String getFundsSource() {
    return fundsSource;
  }

  public void setFundsSource(String fundsSource) {
    this.fundsSource = fundsSource;
  }

  public Ptsv1pushfundstransferSenderInformationAccount number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The account number of the entity funding the transaction. It is the sender&#39;s account number. It can be a debit/credit card account number or bank account number.  Funds disbursements  This field is optional.  All other transactions  This field is required when the sender funds the transaction with a financial instrument, for example debit card. Length:  FDC Compass (&lt;&#x3D; 19) Chase Paymentech (&lt;&#x3D; 16) 
   * @return number
  **/
  @ApiModelProperty(value = "The account number of the entity funding the transaction. It is the sender's account number. It can be a debit/credit card account number or bank account number.  Funds disbursements  This field is optional.  All other transactions  This field is required when the sender funds the transaction with a financial instrument, for example debit card. Length:  FDC Compass (<= 19) Chase Paymentech (<= 16) ")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv1pushfundstransferSenderInformationAccount ptsv1pushfundstransferSenderInformationAccount = (Ptsv1pushfundstransferSenderInformationAccount) o;
    return Objects.equals(this.fundsSource, ptsv1pushfundstransferSenderInformationAccount.fundsSource) &&
        Objects.equals(this.number, ptsv1pushfundstransferSenderInformationAccount.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsSource, number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv1pushfundstransferSenderInformationAccount {\n");
    
    sb.append("    fundsSource: ").append(toIndentedString(fundsSource)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

