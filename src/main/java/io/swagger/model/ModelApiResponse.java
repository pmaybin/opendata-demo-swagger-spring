package io.swagger.model;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelApiResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-05T11:52:05.450Z[GMT]")


public class ModelApiResponse   {

  public ModelApiResponse(Quote quote) {
    this.quoteNumber = quote.getQuoteNumber();
    this.streetAddress = quote.getStreetAddress();
    this.city = quote.getCity();
    this.zipCode = quote.getZipCode();
    this.state = quote.getState();
    this.yearBuilt = quote.getYearBuilt();
    this.constructionType = quote.getConstructionType();
    this.dateCreated = quote.getDateCreated();
    this.quotePremium = quote.getQuotePremium();
  }

  @JsonProperty("quote_number")
  private Integer quoteNumber = null;

  @JsonProperty("street_address")
  private String streetAddress = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("zip_code")
  private Integer zipCode = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("year_built")
  private Integer yearBuilt = null;

  @JsonProperty("construction_type")
  @Enumerated(EnumType.STRING)
  private ConstructionTypeEnum constructionType = null;

  /**
   * type of construction for building
   */
  @JsonProperty("created_date")
  private Date dateCreated = null;

  @JsonProperty("quote_premium")
  private Double quotePremium = null;

  public ModelApiResponse quoteNumber(Integer quoteNumber) {
    this.quoteNumber = quoteNumber;
    return this;
  }

  /**
   * Get quoteNumber
   * @return quoteNumber
   **/
  @Schema(description = "")
  
    public Integer getQuoteNumber() {
    return quoteNumber;
  }

  public void setQuoteNumber(Integer quoteNumber) {
    this.quoteNumber = quoteNumber;
  }

  public ModelApiResponse streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * Get streetAddress
   * @return streetAddress
   **/
  @Schema(example = "14064 Reindeer St", description = "")
  
    public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public ModelApiResponse city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   **/
  @Schema(example = "Springfield", description = "")
  
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ModelApiResponse zipCode(Integer zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
   **/
  @Schema(example = "34666", description = "")
  
    public Integer getZipCode() {
    return zipCode;
  }

  public void setZipCode(Integer zipCode) {
    this.zipCode = zipCode;
  }

  public ModelApiResponse state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @Schema(example = "FL", description = "")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ModelApiResponse yearBuilt(Integer yearBuilt) {
    this.yearBuilt = yearBuilt;
    return this;
  }

  /**
   * Get yearBuilt
   * @return yearBuilt
   **/
  @Schema(example = "1978", description = "")

    public Integer getYearBuilt() {
    return yearBuilt;
  }

  public void setYearBuilt(Integer yearBuilt) {
    this.yearBuilt = yearBuilt;
  }

  public ModelApiResponse constructionType(ConstructionTypeEnum constructionType) {
    this.constructionType = constructionType;
    return this;
  }

  /**
   * type of construction for building
   * @return constructionType
   **/
  @Schema(example = "MASONRY", description = "type of construction for building")
  
    public ConstructionTypeEnum getConstructionType() {
    return constructionType;
  }

  public void setConstructionType(ConstructionTypeEnum constructionType) {
    this.constructionType = constructionType;
  }

  public ModelApiResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
   **/
  @Schema(description = "")
  
    @Valid
    public Date getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  public ModelApiResponse quotePremium(Double quotePremium) {
    this.quotePremium = quotePremium;
    return this;
  }

  /**
   * Get quotePremium
   * @return quotePremium
   **/
  @Schema(example = "1523.74", description = "")
  
    public Double getQuotePremium() {
    return quotePremium;
  }

  public void setQuotePremium(Double quotePremium) {
    this.quotePremium = quotePremium;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelApiResponse _apiResponse = (ModelApiResponse) o;
    return Objects.equals(this.quoteNumber, _apiResponse.quoteNumber) &&
        Objects.equals(this.streetAddress, _apiResponse.streetAddress) &&
        Objects.equals(this.city, _apiResponse.city) &&
        Objects.equals(this.zipCode, _apiResponse.zipCode) &&
        Objects.equals(this.state, _apiResponse.state) &&
        Objects.equals(this.yearBuilt, _apiResponse.yearBuilt) &&
        Objects.equals(this.constructionType, _apiResponse.constructionType) &&
        Objects.equals(this.dateCreated, _apiResponse.dateCreated) &&
        Objects.equals(this.quotePremium, _apiResponse.quotePremium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteNumber, streetAddress, city, zipCode, state, yearBuilt, constructionType, dateCreated, quotePremium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelApiResponse {\n");
    
    sb.append("    quoteNumber: ").append(toIndentedString(quoteNumber)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    yearBuilt: ").append(toIndentedString(yearBuilt)).append("\n");
    sb.append("    constructionType: ").append(toIndentedString(constructionType)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    quotePremium: ").append(toIndentedString(quotePremium)).append("\n");
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
