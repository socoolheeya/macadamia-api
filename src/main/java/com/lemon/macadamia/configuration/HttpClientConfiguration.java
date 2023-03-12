package com.lemon.macadamia.configuration;

import io.netty.channel.ChannelOption;
import io.netty.handler.codec.Headers;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.hc.client5.http.async.methods.SimpleRequestBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.http.codec.LoggingCodecSupport;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Collections;

@Slf4j
@Configuration
public class HttpClientConfiguration {

    @Value("${base.end.point}")
    private String baseEndPoint;

    @Bean
    public WebClient macadamiaWebclient() {
        return this.defaultWebclient().mutate()
                .baseUrl("https://macadamia.com")
                .build();
    }

    @Bean
    public WebClient kakaoWebClient() {
        return this.defaultWebclient()
                .mutate()
                .baseUrl("https://kakao.com")
                .build();
    }

    private WebClient defaultWebclient() {

        ExchangeStrategies exchangeStrategies = this.defaultExchangeStrategies();

        exchangeStrategies
                .messageWriters().stream()
                .filter(LoggingCodecSupport.class::isInstance)
                .forEach(writer -> ((LoggingCodecSupport)writer).setEnableLoggingRequestDetails(true));

        return WebClient.builder()
                .filter(ExchangeFilterFunction.ofRequestProcessor(
                        clientRequest -> {
                            log.debug("########### Request {} {}", clientRequest.method(), clientRequest.url());
                            clientRequest.headers()
                                    .forEach((name, values) ->
                                            values.forEach(value -> log.debug("{} : {}", name, value)));
                            return Mono.just(clientRequest);
                        }
                ))
                .filter(ExchangeFilterFunction.ofResponseProcessor(
                        clientResponse -> {
                            clientResponse.headers()
                                    .asHttpHeaders()
                                    .forEach((name, values) ->
                                            values.forEach(value -> log.debug("{} : {}", name, value)));
                            return Mono.just(clientResponse);
                        }
                ))
                .exchangeStrategies(exchangeStrategies)
                .clientConnector(new ReactorClientHttpConnector(this.defaultHttpClient()))
                .build()
                ;
    }

    private HttpClient defaultHttpClient() {
        return HttpClient.create()
                .baseUrl(baseEndPoint)
                .headers(header -> {
                    header.set("contentType", MediaType.APPLICATION_JSON_VALUE);
                    header.set("acceptCharset", Collections.singletonList(StandardCharsets.UTF_8));
                })
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 1000)
                .responseTimeout(Duration.ofSeconds(2));
    }

    private ExchangeStrategies defaultExchangeStrategies() {
        return ExchangeStrategies
                .builder()
                .codecs(configurer -> configurer.defaultCodecs()
                        .maxInMemorySize(1024*1024*50))
                .build();
    }
}
