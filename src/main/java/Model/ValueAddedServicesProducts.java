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
import Model.PaymentProductsTax;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ValueAddedServicesProducts
 */

public class ValueAddedServicesProducts {
  @SerializedName("reporting")
  private PaymentProductsTax reporting = null;

  @SerializedName("transactionSearch")
  private PaymentProductsTax transactionSearch = null;

  public ValueAddedServicesProducts reporting(PaymentProductsTax reporting) {
    this.reporting = reporting;
    return this;
  }

   /**
   * Get reporting
   * @return reporting
  **/
  @ApiModelProperty(value = "")
  public PaymentProductsTax getReporting() {
    return reporting;
  }

  public void setReporting(PaymentProductsTax reporting) {
    this.reporting = reporting;
  }

  public ValueAddedServicesProducts transactionSearch(PaymentProductsTax transactionSearch) {
    this.transactionSearch = transactionSearch;
    return this;
  }

   /**
   * Get transactionSearch
   * @return transactionSearch
  **/
  @ApiModelProperty(value = "")
  public PaymentProductsTax getTransactionSearch() {
    return transactionSearch;
  }

  public void setTransactionSearch(PaymentProductsTax transactionSearch) {
    this.transactionSearch = transactionSearch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueAddedServicesProducts valueAddedServicesProducts = (ValueAddedServicesProducts) o;
    return Objects.equals(this.reporting, valueAddedServicesProducts.reporting) &&
        Objects.equals(this.transactionSearch, valueAddedServicesProducts.transactionSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reporting, transactionSearch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueAddedServicesProducts {\n");
    
    sb.append("    reporting: ").append(toIndentedString(reporting)).append("\n");
    sb.append("    transactionSearch: ").append(toIndentedString(transactionSearch)).append("\n");
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

