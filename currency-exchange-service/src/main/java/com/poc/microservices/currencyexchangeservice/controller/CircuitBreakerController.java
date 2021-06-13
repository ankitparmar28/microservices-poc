package com.poc.microservices.currencyexchangeservice.controller;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerController {

    private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("/sample-api")
    //@Retry(name = "sample-api" ,fallbackMethod = "hardCodedResponse")
    @CircuitBreaker(name = "sample-api" ,fallbackMethod = "hardCodedResponse")
    @RateLimiter(name="default")
    @Bulkhead(name="default")
    public String sampleApi(){
        logger.info("Sample Api call received");
        return new RestTemplate().getForEntity("http://localhost:8080/some-dummy-url",String.class).getBody();
    }

    public String hardCodedResponse(Exception ex){
        return "Hard coded response";
    }
}
