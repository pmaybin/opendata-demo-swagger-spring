package io.swagger.model;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Quote
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-05T11:52:05.450Z[GMT]")

@Entity
@Table(schema=("quote"))
public class Quote   {


  @Id
  @Column(name="quote_number")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("quote_number")
  private Integer quoteNumber = null;

  @Column(name="street_address")
  @JsonProperty("street_address")
  private String streetAddress = null;

  @Column(name="city")
  @JsonProperty("city")
  private String city = null;

  @Column(name="zip_code")
  @JsonProperty("zip_code")
  private Integer zipCode = null;

  @Column(name="state")
  @JsonProperty("state")
  private String state = null;

  @Column(name="year_built")
  @JsonProperty("year_built")
  private Integer yearBuilt = null;

  /**
   * type of construction for building
   */

  @Column(name="construction_type")
  @JsonProperty("construction_type")
  @Enumerated(EnumType.STRING)
  private ConstructionTypeEnum constructionType = null;

  @Column(name="created_date")
  @JsonProperty("created_date")
  @DateTimeFormat(pattern = "dd/mm/yyyy HH:MM")
  private Date dateCreated = null;

  @Column(name="quote_premium")
  @JsonProperty("quote_premium")
  private Double quotePremium = null;

  public Quote quoteNumber(Integer quoteNumber) {
    this.quoteNumber = quoteNumber;
    return this;
  }

  /**
   * Get quoteNumber
   * @return quoteNumber
   **/
  @Schema(example = "100001", required = true, description = "")
    public Integer getQuoteNumber() {
    return quoteNumber;
  }

  public void setQuoteNumber(Integer quoteNumber) {
    this.quoteNumber = quoteNumber;
  }

  public Quote streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * Get streetAddress
   * @return streetAddress
   **/
  @Schema(example = "14064 Reindeer St", required = true, description = "")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public Quote city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   **/
  @Schema(example = "Springfield", required = true, description = "")

    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Quote zipCode(Integer zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
   **/
  @Schema(example = "34666", required = true, description = "")

    public Integer getZipCode() {
    return zipCode;
  }

  public Quote(String streetAddress, String city, Integer zipCode, String state, Integer yearBuilt, ConstructionTypeEnum constructionType) {
    this.streetAddress = streetAddress;
    this.city = city;
    this.zipCode = zipCode;
    this.state = state;
    this.yearBuilt = yearBuilt;
    this.constructionType = constructionType;
  }

  public Quote() {
  }

  public void setZipCode(Integer zipCode) {
    this.zipCode = zipCode;
  }

  public Quote state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @Schema(example = "FL", required = true, description = "")

    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Quote yearBuilt(Integer yearBuilt) {
    this.yearBuilt = yearBuilt;
    return this;
  }

  /**
   * Get yearBuilt
   * @return yearBuilt
   **/
  @Schema(example = "1978", required = true, description = "")

    public Integer getYearBuilt() {
    return yearBuilt;
  }

  public void setYearBuilt(Integer yearBuilt) {
    this.yearBuilt = yearBuilt;
  }

  public Quote constructionType(ConstructionTypeEnum constructionType) {
    this.constructionType = constructionType;
    return this;
  }

  /**
   * type of construction for building
   * @return constructionType
   **/
  @Schema(example = "MASONRY", required = false, description = "type of construction for building")
    @Enumerated(EnumType.STRING)
    public ConstructionTypeEnum getConstructionType() {
    return constructionType;
  }
  @Enumerated(EnumType.STRING)
  public void setConstructionType(ConstructionTypeEnum constructionType) {
    this.constructionType = constructionType;
  }

  public Quote dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
   **/
  @Schema(required = false, description = "")
    @Valid
    public Date getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Quote quotePremium(Double quotePremium) {
    this.quotePremium = quotePremium;
    return this;
  }

  /**
   * Get quotePremium
   * @return quotePremium
   **/
  @Schema(example = "1523.74", required = false, description = "")
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
    Quote quote = (Quote) o;
    return Objects.equals(this.quoteNumber, quote.quoteNumber) &&
        Objects.equals(this.streetAddress, quote.streetAddress) &&
        Objects.equals(this.city, quote.city) &&
        Objects.equals(this.zipCode, quote.zipCode) &&
        Objects.equals(this.state, quote.state) &&
        Objects.equals(this.yearBuilt, quote.yearBuilt) &&
        Objects.equals(this.constructionType, quote.constructionType) &&
        Objects.equals(this.dateCreated, quote.dateCreated) &&
        Objects.equals(this.quotePremium, quote.quotePremium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteNumber, streetAddress, city, zipCode, state, yearBuilt, constructionType, dateCreated, quotePremium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quote {\n");

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
