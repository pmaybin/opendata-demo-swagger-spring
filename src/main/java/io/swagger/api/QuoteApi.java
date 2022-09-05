/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.35).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ModelApiResponse;
import io.swagger.model.Quote;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-05T11:52:05.450Z[GMT]")
@Validated
public interface QuoteApi {

    @Operation(summary = "Create a new quote", description = "Create a new quote", tags={ "quote" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request") })
    @RequestMapping(value = "/quote/new",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> addNewQuote(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Quote body);


    @Operation(summary = "Return all the quotes stored within the database", description = "Return all the quotes stored within the database", tags={ "quote" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Quote.class)))),
        
        @ApiResponse(responseCode = "400", description = "Bad request") })
    @RequestMapping(value = "/quote/all",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Quote>> getAllQuotes();


    @Operation(summary = "Get a quote from the quote numberCreate a new quote", description = "Create a new quote", tags={ "quote" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Quote.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request - Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Not Found - Quote not found") })
    @RequestMapping(value = "/quote/{quote_number}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Quote> getExistingQuote(@Parameter(in = ParameterIn.PATH, description = "number of quote", required=true, schema=@Schema()) @PathVariable("quote_number") Integer quoteNumber);

}

