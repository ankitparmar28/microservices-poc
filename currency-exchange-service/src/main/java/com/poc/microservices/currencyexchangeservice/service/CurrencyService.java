package com.poc.microservices.currencyexchangeservice.service;

import com.poc.microservices.currencyexchangeservice.model.CurrencyExchange;
import com.poc.microservices.currencyexchangeservice.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    public CurrencyExchange retrieveConversionFactor(String from, String to){
        return currencyRepository.findByFromAndTo(from, to);
    }


}
