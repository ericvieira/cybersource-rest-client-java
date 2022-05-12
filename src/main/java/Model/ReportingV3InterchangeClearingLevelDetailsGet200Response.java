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
import Model.ReportingV3InterchangeClearingLevelDetailsGet200ResponseInterchangeClearingLevelDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * ReportingV3InterchangeClearingLevelDetailsGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-12T17:46:06.587+05:30")
public class ReportingV3InterchangeClearingLevelDetailsGet200Response {
  @SerializedName("startDate")
  private DateTime startDate = null;

  @SerializedName("endDate")
  private DateTime endDate = null;

  @SerializedName("interchangeClearingLevelDetails")
  private List<ReportingV3InterchangeClearingLevelDetailsGet200ResponseInterchangeClearingLevelDetails> interchangeClearingLevelDetails = null;

  public ReportingV3InterchangeClearingLevelDetailsGet200Response startDate(DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Valid report Start Date in **ISO 8601 format**. Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14  **Example:** - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ 
   * @return startDate
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Valid report Start Date in **ISO 8601 format**. Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14  **Example:** - yyyy-MM-dd'T'HH:mm:ss.SSSZZ ")
  public DateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTime startDate) {
    this.startDate = startDate;
  }

  public ReportingV3InterchangeClearingLevelDetailsGet200Response endDate(DateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Valid report Start Date in **ISO 8601 format**. 
   * @return endDate
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Valid report Start Date in **ISO 8601 format**. ")
  public DateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(DateTime endDate) {
    this.endDate = endDate;
  }

  public ReportingV3InterchangeClearingLevelDetailsGet200Response interchangeClearingLevelDetails(List<ReportingV3InterchangeClearingLevelDetailsGet200ResponseInterchangeClearingLevelDetails> interchangeClearingLevelDetails) {
    this.interchangeClearingLevelDetails = interchangeClearingLevelDetails;
    return this;
  }

  public ReportingV3InterchangeClearingLevelDetailsGet200Response addInterchangeClearingLevelDetailsItem(ReportingV3InterchangeClearingLevelDetailsGet200ResponseInterchangeClearingLevelDetails interchangeClearingLevelDetailsItem) {
    if (this.interchangeClearingLevelDetails == null) {
      this.interchangeClearingLevelDetails = new ArrayList<ReportingV3InterchangeClearingLevelDetailsGet200ResponseInterchangeClearingLevelDetails>();
    }
    this.interchangeClearingLevelDetails.add(interchangeClearingLevelDetailsItem);
    return this;
  }

   /**
   * List of InterchangeClearingLevelDetail
   * @return interchangeClearingLevelDetails
  **/
  @ApiModelProperty(value = "List of InterchangeClearingLevelDetail")
  public List<ReportingV3InterchangeClearingLevelDetailsGet200ResponseInterchangeClearingLevelDetails> getInterchangeClearingLevelDetails() {
    return interchangeClearingLevelDetails;
  }

  public void setInterchangeClearingLevelDetails(List<ReportingV3InterchangeClearingLevelDetailsGet200ResponseInterchangeClearingLevelDetails> interchangeClearingLevelDetails) {
    this.interchangeClearingLevelDetails = interchangeClearingLevelDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3InterchangeClearingLevelDetailsGet200Response reportingV3InterchangeClearingLevelDetailsGet200Response = (ReportingV3InterchangeClearingLevelDetailsGet200Response) o;
    return Objects.equals(this.startDate, reportingV3InterchangeClearingLevelDetailsGet200Response.startDate) &&
        Objects.equals(this.endDate, reportingV3InterchangeClearingLevelDetailsGet200Response.endDate) &&
        Objects.equals(this.interchangeClearingLevelDetails, reportingV3InterchangeClearingLevelDetailsGet200Response.interchangeClearingLevelDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, interchangeClearingLevelDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3InterchangeClearingLevelDetailsGet200Response {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    interchangeClearingLevelDetails: ").append(toIndentedString(interchangeClearingLevelDetails)).append("\n");
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

