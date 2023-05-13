package com.lemon.macadamia.business.properties.application.port.in;

import com.lemon.macadamia.business.properties.domain.Property;
import org.springframework.data.domain.PageRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

public interface SearchPropertyUseCase {
    Flux<Property> searchProperties(PageRequest request);
    Mono<Property> searchProperty(BigInteger id);
}
