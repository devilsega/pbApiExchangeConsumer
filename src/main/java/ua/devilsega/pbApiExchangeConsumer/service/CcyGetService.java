package ua.devilsega.pbApiExchangeConsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ua.devilsega.pbApiExchangeConsumer.model.ExchangeRate;
import ua.devilsega.pbApiExchangeConsumer.model.ExchangeRateHistoric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CcyGetService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${pb.ccuActual}")
    private String uriActual;

    @Value("${pb.ccuHistoric}")
    private String uriHistoric;

    public List<ExchangeRate> getCcu(){
        return Arrays.stream(restTemplate.getForObject(uriActual, ExchangeRate[].class)).collect(Collectors.toList());
    }

    public ExchangeRateHistoric getCcuHistory(String date){
        return restTemplate.getForObject(uriHistoric+date, ExchangeRateHistoric.class);

    }

}
