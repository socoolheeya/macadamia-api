package com.lemon.macadamia.business.properties.application.port.in;

import com.lemon.macadamia.business.properties.domain.Property;
import com.lemon.macadamia.business.properties.domain.http.PropertyRequest;
import reactor.core.publisher.Mono;

public interface SavePropertyUseCase {
    Mono<Property> saveProperty(PropertyRequest.Registration request);
}
