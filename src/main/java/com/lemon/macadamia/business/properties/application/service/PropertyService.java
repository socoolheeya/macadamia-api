package com.lemon.macadamia.business.properties.application.service;

import com.lemon.macadamia.business.properties.application.port.in.SavePropertyUseCase;
import com.lemon.macadamia.business.properties.application.port.in.SearchPropertyUseCase;
import com.lemon.macadamia.business.properties.application.port.out.SavePropertyPort;
import com.lemon.macadamia.business.properties.application.port.out.SearchPropertyPort;
import com.lemon.macadamia.business.properties.domain.Property;
import com.lemon.macadamia.business.properties.domain.http.PropertyRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PropertyService implements SearchPropertyUseCase, SavePropertyUseCase {
    private final SearchPropertyPort searchPropertyPort;
    private final SavePropertyPort savePropertyPort;

    @Override
    public Flux<Property> searchProperties(PageRequest request) {
        return searchPropertyPort.loadProperties(request);
    }

    @Override
    public Mono<Property> searchProperty(BigInteger id) {
        return searchPropertyPort.loadProperty(id);
    }

    @Override
    public Mono<Property> saveProperty(PropertyRequest.Registration request) {
        return savePropertyPort.saveProperty(request.getProperty());
    }
}
