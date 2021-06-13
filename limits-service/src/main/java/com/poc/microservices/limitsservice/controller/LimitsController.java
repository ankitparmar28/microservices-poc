package com.poc.microservices.limitsservice.controller;

import com.poc.microservices.limitsservice.config.LimitConfig;
import com.poc.microservices.limitsservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(limitConfig.getMin(), limitConfig.getMax());
    }
}
