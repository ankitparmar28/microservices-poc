package com.poc.microservices.currencyexchangeservice.controller;

import com.poc.microservices.currencyexchangeservice.model.CurrencyExchange;
import com.poc.microservices.currencyexchangeservice.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency-exchange")
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/from/{from}/to/{to}")
    public CurrencyExchange convertCurrency(@PathVariable("from") String from, @PathVariable("to") String to) {
        CurrencyExchange exchange = currencyService.retrieveConversionFactor(from, to);
        exchange.setEnvironment("Exchange Service : "+environment.getProperty("server.port"));
        return exchange;
    }
}
