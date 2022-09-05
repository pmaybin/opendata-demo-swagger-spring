package io.swagger.api;

import io.swagger.model.Quote;
import org.apache.catalina.util.ErrorPageSupport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Integer> {
}
