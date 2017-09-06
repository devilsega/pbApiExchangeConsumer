package ua.devilsega.pbApiExchangeConsumer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.net.InetSocketAddress;
import java.net.Proxy;

@Configuration
public class RestTemplateConfig {

    @Value("${proxy.url}")
    private String proxyUrl;

    @Value("${proxy.port}")
    private int proxyPort;

    @Bean
    public RestTemplate restTemplate() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();

        Proxy proxy= new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyUrl, proxyPort));
        requestFactory.setProxy(proxy);

        return new RestTemplate(requestFactory);
    }

}
