package ua.devilsega.pbApiExchangeConsumer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeRate {
    @JsonProperty("base_ccy")
    private String baseCcy;
    @JsonProperty("ccy")
    private String ccy;
    @JsonProperty("buy")
    private double buyVal;
    @JsonProperty("sale")
    private double saleVal;

    public ExchangeRate(){}

    public ExchangeRate(String baseCcy, String ccy, double buyVal, double saleVal){
        this.baseCcy = baseCcy;
        this.ccy = ccy;
        this.buyVal = buyVal;
        this.saleVal = saleVal;
    }

    public String getBaseCcy() {
        return baseCcy;
    }

    public String getCcy() {
        return ccy;
    }

    public double getBuyVal() {
        return buyVal;
    }

    public double getSaleVal() {
        return saleVal;
    }

}
