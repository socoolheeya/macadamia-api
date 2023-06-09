package com.lemon.macadamia.business.properties.application.port.out;

import com.lemon.macadamia.business.properties.domain.Property;
import reactor.core.publisher.Mono;

public interface SavePropertyPort {
    Mono<Property> saveProperty(Property property);
}
