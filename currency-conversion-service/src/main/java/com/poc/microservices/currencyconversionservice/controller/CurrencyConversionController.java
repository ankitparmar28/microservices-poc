package com.poc.microservices.currencyconversionservice.controller;

import com.poc.microservices.currencyconversionservice.model.CurrencyDetails;
import com.poc.microservices.currencyconversionservice.service.CurrencyConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency-conversion")
public class CurrencyConversionController {

    @Autowired
    private CurrencyConversionService currencyConversionService;

    @GetMapping("/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyDetails convertCurrency(@PathVariable("from")String from, @PathVariable("to")String to, @PathVariable("quantity")double quantity){
        CurrencyDetails currencyDetails = currencyConversionService.getCurrencyDetails(from, to);
        currencyDetails.setAmount(quantity);
        currencyDetails.setCalculatedAmount(currencyDetails.getConversionMultiple()*quantity);
        return currencyDetails;
    }
}
