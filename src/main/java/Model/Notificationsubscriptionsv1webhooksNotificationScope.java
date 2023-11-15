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
import java.util.ArrayList;
import java.util.List;

/**
 * Notificationsubscriptionsv1webhooksNotificationScope
 */

public class Notificationsubscriptionsv1webhooksNotificationScope {
  @SerializedName("scope")
  private String scope = "SELF";

  @SerializedName("scopeData")
  private List<String> scopeData = null;

  public Notificationsubscriptionsv1webhooksNotificationScope scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The webhook scope. 1. SELF The Webhook is used to deliver webhooks for only this Organization (or Merchant). 2. DESCENDANTS The Webhook is used to deliver webhooks for this Organization and its children. 3. CUSTOM The Webhook is used to deliver webhooks for the OrgIds (or MiDs) explicitly listed in scopeData field
   * @return scope
  **/
  @ApiModelProperty(value = "The webhook scope. 1. SELF The Webhook is used to deliver webhooks for only this Organization (or Merchant). 2. DESCENDANTS The Webhook is used to deliver webhooks for this Organization and its children. 3. CUSTOM The Webhook is used to deliver webhooks for the OrgIds (or MiDs) explicitly listed in scopeData field")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public Notificationsubscriptionsv1webhooksNotificationScope scopeData(List<String> scopeData) {
    this.scopeData = scopeData;
    return this;
  }

  public Notificationsubscriptionsv1webhooksNotificationScope addScopeDataItem(String scopeDataItem) {
    if (this.scopeData == null) {
      this.scopeData = new ArrayList<String>();
    }
    this.scopeData.add(scopeDataItem);
    return this;
  }

   /**
   * Applicable only if scope&#x3D;CUSTOM. This should contains a Set of MIDs or OrgIDs for which this subscription is applicable.
   * @return scopeData
  **/
  @ApiModelProperty(value = "Applicable only if scope=CUSTOM. This should contains a Set of MIDs or OrgIDs for which this subscription is applicable.")
  public List<String> getScopeData() {
    return scopeData;
  }

  public void setScopeData(List<String> scopeData) {
    this.scopeData = scopeData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notificationsubscriptionsv1webhooksNotificationScope notificationsubscriptionsv1webhooksNotificationScope = (Notificationsubscriptionsv1webhooksNotificationScope) o;
    return Objects.equals(this.scope, notificationsubscriptionsv1webhooksNotificationScope.scope) &&
        Objects.equals(this.scopeData, notificationsubscriptionsv1webhooksNotificationScope.scopeData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, scopeData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificationsubscriptionsv1webhooksNotificationScope {\n");
    
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    scopeData: ").append(toIndentedString(scopeData)).append("\n");
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

