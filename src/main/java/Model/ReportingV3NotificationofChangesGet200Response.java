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
import Model.ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges;
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

/**
 * ReportingV3NotificationofChangesGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T15:49:19.042+05:30")
public class ReportingV3NotificationofChangesGet200Response {
  @SerializedName("notificationOfChanges")
  private List<ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges> notificationOfChanges = null;

  public ReportingV3NotificationofChangesGet200Response notificationOfChanges(List<ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges> notificationOfChanges) {
    this.notificationOfChanges = notificationOfChanges;
    return this;
  }

  public ReportingV3NotificationofChangesGet200Response addNotificationOfChangesItem(ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges notificationOfChangesItem) {
    if (this.notificationOfChanges == null) {
      this.notificationOfChanges = new ArrayList<ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges>();
    }
    this.notificationOfChanges.add(notificationOfChangesItem);
    return this;
  }

   /**
   * List of Notification Of Change Info values
   * @return notificationOfChanges
  **/
  @ApiModelProperty(value = "List of Notification Of Change Info values")
  public List<ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges> getNotificationOfChanges() {
    return notificationOfChanges;
  }

  public void setNotificationOfChanges(List<ReportingV3NotificationofChangesGet200ResponseNotificationOfChanges> notificationOfChanges) {
    this.notificationOfChanges = notificationOfChanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3NotificationofChangesGet200Response reportingV3NotificationofChangesGet200Response = (ReportingV3NotificationofChangesGet200Response) o;
    return Objects.equals(this.notificationOfChanges, reportingV3NotificationofChangesGet200Response.notificationOfChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationOfChanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3NotificationofChangesGet200Response {\n");
    
    sb.append("    notificationOfChanges: ").append(toIndentedString(notificationOfChanges)).append("\n");
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

