package io.swagger.api;

import io.swagger.model.ModelApiResponse;
import io.swagger.model.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;

import io.swagger.v3.oas.annotations.media.Schema;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.Instant;
import java.util.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-05T11:52:05.450Z[GMT]")
@RestController

public class QuoteApiController implements QuoteApi {

    @Autowired
    QuoteRepository quoteRepository;

    private static final Logger log = LoggerFactory.getLogger(QuoteApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public QuoteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<ModelApiResponse> addNewQuote(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Quote body) {
        String accept = request.getHeader("Accept");
        System.out.print("/quote/new");

        if (accept != null) {
            try {
                System.out.println("Post NEW endpoint");
                DecimalFormat df = new DecimalFormat("0.00");
                df.setRoundingMode(RoundingMode.UP);
                System.out.println(body.getStreetAddress());
                Quote quote = new Quote();
                quote.setStreetAddress(body.getStreetAddress());
                quote.setCity(body.getCity());
                quote.setZipCode(body.getZipCode());
                quote.setState(body.getState());
                quote.setYearBuilt(body.getYearBuilt());
                quote.setConstructionType(body.getConstructionType());
                quote.dateCreated(Date.from(Instant.now()));

                Random r = new Random();
                double randomValue = 150 + (10000 - 150) * r.nextDouble();
                quote.setQuotePremium(Double.valueOf(df.format(randomValue)));

                Quote newQuote = quoteRepository.save(quote);
                System.out.println(newQuote.getQuoteNumber());

                return new ResponseEntity<ModelApiResponse>(new ModelApiResponse(quote), HttpStatus.OK);

//                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"construction_type\" : \"MASONRY\",\n  \"street_address\" : \"14064 Reindeer St\",\n  \"quote_number\" : 0,\n  \"city\" : \"Springfield\",\n  \"date_created\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"year_built\" : 1978,\n  \"state\" : \"FL\",\n  \"zip_code\" : 34666,\n  \"quote_premium\" : 1523.74\n}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {
                log.error("Error creating new quote", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<Quote>> getAllQuotes() {
        String accept = request.getHeader("Accept");
        System.out.println("/quote/all");
        if (accept != null) {
            try {
              List<Quote> quotes = new ArrayList<>();
              quoteRepository.findAll().forEach(quotes::add);
              return new ResponseEntity(quotes, HttpStatus.OK);
//              return new ResponseEntity<List<Quote>>(objectMapper.readValue("[ {\n  \"quote_number\" : 100222,\n  \"street_address\" : \"123 Main Street\",\n  \"city\" : \"Tempa Bay\",\n  \"zip_code\" : 346696,\n  \"state\" : \"FL\",\n  \"year_built\" : 1950,\n  \"construction_type\" : \"MASONRY\",\n  \"date_created\" : \"2022-09-02T15:03:44.000Z\",\n  \"quote_premium\" : 1599.89\n}, {\n  \"quote_number\" : 100402,\n  \"street_address\" : \"321 Back Street\",\n  \"city\" : \"Tempa Bay\",\n  \"zip_code\" : 456743,\n  \"state\" : \"FL\",\n  \"year_built\" : 1989,\n  \"construction_type\" : \"FRAME\",\n  \"date_created\" : \"2021-09-02T15:03:44.000Z\",\n  \"quote_premium\" : 3099.89\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Quote>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Quote>>(HttpStatus.NOT_IMPLEMENTED);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Quote> getExistingQuote(@Parameter(in = ParameterIn.PATH, description = "number of quote", required=true, schema=@Schema()) @PathVariable("quote_number") Integer quoteNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null) {
            try {
                Quote quote = quoteRepository.findById(quoteNumber).orElse(null);
                if (quote != null){
                    return new ResponseEntity<Quote>(quote, HttpStatus.OK);
                }else{
                    return new ResponseEntity<Quote>(new Quote(), HttpStatus.NOT_FOUND);
                }

            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Quote>(new Quote(), HttpStatus.NOT_FOUND);
            }
        }
        return new ResponseEntity<Quote>(HttpStatus.NOT_IMPLEMENTED);
    }

}
