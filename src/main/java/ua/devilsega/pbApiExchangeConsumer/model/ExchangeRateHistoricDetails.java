package ua.devilsega.pbApiExchangeConsumer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeRateHistoricDetails {
    private String baseCurrency;
    private String currency;
    private double saleRate;
    private double purchaseRate;

    public ExchangeRateHistoricDetails(){}

    public ExchangeRateHistoricDetails(String baseCurrency, String currency, double saleRate, double purchaseRate){
        this.baseCurrency = baseCurrency;
        this.currency = currency;
        this.saleRate = saleRate;
        this.purchaseRate = purchaseRate;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getCurrency(){
        return currency;
    }

    public double getSaleRate(){
        return saleRate;
    }

    public double getPurchaseRate(){
        return purchaseRate;
    }
}
