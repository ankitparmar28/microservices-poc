package com.poc.microservices.currencyconversionservice.proxy;

import com.poc.microservices.currencyconversionservice.model.CurrencyDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange-service")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyDetails convertCurrency(@PathVariable("from") String from, @PathVariable("to") String to);
}
