package com.poc.microservices.currencyconversionservice.model;

public class CurrencyDetails {
    private int id;
    private String from;
    private String to;
    private Double conversionMultiple;
    private Double amount;
    private Double calculatedAmount;
    private String environment;

    public CurrencyDetails() {
    }

    public CurrencyDetails(int id, String from, String to, Double conversionMultiple, Double amount, Double calculatedAmount) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.amount = amount;
        this.calculatedAmount = calculatedAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Double getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(Double conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public Double getCalculatedAmount() {
        return calculatedAmount;
    }

    public void setCalculatedAmount(Double calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CurrencyDetails{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", conversionMultiple=" + conversionMultiple +
                ", amount=" + amount +
                ", calculatedAmount=" + calculatedAmount +
                ", environment='" + environment + '\'' +
                '}';
    }
}
