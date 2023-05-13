package com.lemon.macadamia.business.properties.application.port.out;

import com.lemon.macadamia.business.properties.domain.Property;
import org.springframework.data.domain.PageRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

public interface SearchPropertyPort {
    Mono<Property> loadProperty(BigInteger propertyId);
    Flux<Property> loadProperties(PageRequest pageRequest);
}
