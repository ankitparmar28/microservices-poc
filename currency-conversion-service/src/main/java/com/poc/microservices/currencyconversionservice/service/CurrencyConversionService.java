package com.poc.microservices.currencyconversionservice.service;

import com.poc.microservices.currencyconversionservice.model.CurrencyDetails;
import com.poc.microservices.currencyconversionservice.proxy.CurrencyExchangeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CurrencyConversionService {

    @Autowired
    private CurrencyExchangeProxy currencyExchangeProxy;

    public CurrencyDetails getCurrencyDetails(String from,String to){
        return currencyExchangeProxy.convertCurrency(from,to);
    }
}
