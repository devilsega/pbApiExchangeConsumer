package ua.devilsega.pbApiExchangeConsumer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeRateHistoric {
    private String date;
    private String bank;
    private int baseCurrency;
    private String baseCurrencyLit;
    private List<ExchangeRateHistoricDetails> exchangeRate;

    public ExchangeRateHistoric(){}

    public ExchangeRateHistoric(String date, String bank, int baseCurrency, String baseCurrencyLit, List<ExchangeRateHistoricDetails> exchangeRate){
        this.date = date;
        this.bank = bank;
        this.baseCurrency = baseCurrency;
        this.baseCurrencyLit = baseCurrencyLit;
        this.exchangeRate = exchangeRate;
    }

    public String getDate() {
        return date;
    }

    public String getBank(){
        return bank;
    }

    public int getBaseCurrency() {
        return baseCurrency;
    }

    public String getBaseCurrencyLit() {
        return baseCurrencyLit;
    }

    public List<ExchangeRateHistoricDetails> getExchangeRate() {
        return exchangeRate;
    }
}
