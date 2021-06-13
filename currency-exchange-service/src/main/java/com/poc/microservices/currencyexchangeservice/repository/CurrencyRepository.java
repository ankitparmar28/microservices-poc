package com.poc.microservices.currencyexchangeservice.repository;

import com.poc.microservices.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<CurrencyExchange,Integer> {

    CurrencyExchange findByFromAndTo(String from,String to);
}
