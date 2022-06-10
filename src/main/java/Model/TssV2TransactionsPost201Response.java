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
import Model.PtsV2IncrementalAuthorizationPatch201ResponseLinks;
import Model.TssV2TransactionsPost201ResponseEmbedded;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsPost201Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-10T13:11:55.460+05:30")
public class TssV2TransactionsPost201Response {
  @SerializedName("searchId")
  private String searchId = null;

  @SerializedName("save")
  private Boolean save = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("sort")
  private String sort = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("totalCount")
  private Integer totalCount = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("_embedded")
  private TssV2TransactionsPost201ResponseEmbedded embedded = null;

  @SerializedName("_links")
  private PtsV2IncrementalAuthorizationPatch201ResponseLinks links = null;

  public TssV2TransactionsPost201Response searchId(String searchId) {
    this.searchId = searchId;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify each Search request.
   * @return searchId
  **/
  @ApiModelProperty(value = "An unique identification number assigned by CyberSource to identify each Search request.")
  public String getSearchId() {
    return searchId;
  }

  public void setSearchId(String searchId) {
    this.searchId = searchId;
  }

  public TssV2TransactionsPost201Response save(Boolean save) {
    this.save = save;
    return this;
  }

   /**
   * Indicates whether or not you want to save this search request for future use. The options are:  * &#x60;true&#x60; * &#x60;false&#x60; (default value)  If set to &#x60;true&#x60;, this field returns &#x60;searchID&#x60; in the response. You can use this value to retrieve the details of the saved search. 
   * @return save
  **/
  @ApiModelProperty(value = "Indicates whether or not you want to save this search request for future use. The options are:  * `true` * `false` (default value)  If set to `true`, this field returns `searchID` in the response. You can use this value to retrieve the details of the saved search. ")
  public Boolean getSave() {
    return save;
  }

  public void setSave(Boolean save) {
    this.save = save;
  }

  public TssV2TransactionsPost201Response name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of this search. When &#x60;save&#x60; is set to &#x60;true&#x60;, this search is saved with this name. 
   * @return name
  **/
  @ApiModelProperty(value = "Name of this search. When `save` is set to `true`, this search is saved with this name. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TssV2TransactionsPost201Response timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Merchant’s time zone in ISO standard, using the TZ database format. For example: &#x60;America/Chicago&#x60; 
   * @return timezone
  **/
  @ApiModelProperty(value = "Merchant’s time zone in ISO standard, using the TZ database format. For example: `America/Chicago` ")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public TssV2TransactionsPost201Response query(String query) {
    this.query = query;
    return this;
  }

   /**
   * String that contains the filters and variables for which you want to search. For information about supported field-filters and operators, see the [Query Filters]( https://developer.cybersource.com/api/developer-guides/dita-txn-search-details-rest-api-dev-guide-102718/txn-search-intro/txn-filtering.html) section of the Transaction Search Developer Guide. 
   * @return query
  **/
  @ApiModelProperty(value = "String that contains the filters and variables for which you want to search. For information about supported field-filters and operators, see the [Query Filters]( https://developer.cybersource.com/api/developer-guides/dita-txn-search-details-rest-api-dev-guide-102718/txn-search-intro/txn-filtering.html) section of the Transaction Search Developer Guide. ")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public TssV2TransactionsPost201Response offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Controls the starting point within the collection of results, which defaults to 0. The first item in the collection is retrieved by setting a zero offset.  For example, if you have a collection of 15 items to be retrieved from a resource and you specify limit&#x3D;5, you can retrieve the entire set of results in 3 successive requests by varying the offset value like this:  &#x60;offset&#x3D;0&#x60; &#x60;offset&#x3D;5&#x60; &#x60;offset&#x3D;10&#x60;  **Note:** If an offset larger than the number of results is provided, this will result in no embedded object being returned. 
   * @return offset
  **/
  @ApiModelProperty(value = "Controls the starting point within the collection of results, which defaults to 0. The first item in the collection is retrieved by setting a zero offset.  For example, if you have a collection of 15 items to be retrieved from a resource and you specify limit=5, you can retrieve the entire set of results in 3 successive requests by varying the offset value like this:  `offset=0` `offset=5` `offset=10`  **Note:** If an offset larger than the number of results is provided, this will result in no embedded object being returned. ")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public TssV2TransactionsPost201Response limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Controls the maximum number of items that may be returned for a single request. The default is 20, the maximum is 2000. 
   * @return limit
  **/
  @ApiModelProperty(value = "Controls the maximum number of items that may be returned for a single request. The default is 20, the maximum is 2000. ")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public TssV2TransactionsPost201Response sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * A comma separated list of the following form:  &#x60;submitTimeUtc:desc&#x60; 
   * @return sort
  **/
  @ApiModelProperty(value = "A comma separated list of the following form:  `submitTimeUtc:desc` ")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public TssV2TransactionsPost201Response count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Results for this page, this could be below the limit.
   * @return count
  **/
  @ApiModelProperty(value = "Results for this page, this could be below the limit.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public TssV2TransactionsPost201Response totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of results.
   * @return totalCount
  **/
  @ApiModelProperty(value = "Total number of results.")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public TssV2TransactionsPost201Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the submitted transaction.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the submitted transaction.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TssV2TransactionsPost201Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by Cybersource for all services. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public TssV2TransactionsPost201Response embedded(TssV2TransactionsPost201ResponseEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(TssV2TransactionsPost201ResponseEmbedded embedded) {
    this.embedded = embedded;
  }

  public TssV2TransactionsPost201Response links(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV2IncrementalAuthorizationPatch201ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV2IncrementalAuthorizationPatch201ResponseLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201Response tssV2TransactionsPost201Response = (TssV2TransactionsPost201Response) o;
    return Objects.equals(this.searchId, tssV2TransactionsPost201Response.searchId) &&
        Objects.equals(this.save, tssV2TransactionsPost201Response.save) &&
        Objects.equals(this.name, tssV2TransactionsPost201Response.name) &&
        Objects.equals(this.timezone, tssV2TransactionsPost201Response.timezone) &&
        Objects.equals(this.query, tssV2TransactionsPost201Response.query) &&
        Objects.equals(this.offset, tssV2TransactionsPost201Response.offset) &&
        Objects.equals(this.limit, tssV2TransactionsPost201Response.limit) &&
        Objects.equals(this.sort, tssV2TransactionsPost201Response.sort) &&
        Objects.equals(this.count, tssV2TransactionsPost201Response.count) &&
        Objects.equals(this.totalCount, tssV2TransactionsPost201Response.totalCount) &&
        Objects.equals(this.status, tssV2TransactionsPost201Response.status) &&
        Objects.equals(this.submitTimeUtc, tssV2TransactionsPost201Response.submitTimeUtc) &&
        Objects.equals(this.embedded, tssV2TransactionsPost201Response.embedded) &&
        Objects.equals(this.links, tssV2TransactionsPost201Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchId, save, name, timezone, query, offset, limit, sort, count, totalCount, status, submitTimeUtc, embedded, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201Response {\n");
    
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    save: ").append(toIndentedString(save)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

