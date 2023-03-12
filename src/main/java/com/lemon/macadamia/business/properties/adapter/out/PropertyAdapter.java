package com.lemon.macadamia.business.properties.adapter.out;

import com.lemon.macadamia.business.properties.adapter.out.repository.PropertyRepository;
import com.lemon.macadamia.business.properties.application.port.out.RemovePropertyPort;
import com.lemon.macadamia.business.properties.application.port.out.SavePropertyPort;
import com.lemon.macadamia.business.properties.application.port.out.SearchPropertyPort;
import com.lemon.macadamia.business.properties.domain.entity.Property;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@Repository
@RequiredArgsConstructor
public class PropertyAdapter implements SearchPropertyPort, SavePropertyPort, RemovePropertyPort {

    private final PropertyRepository propertyRepository;

    @Override
    public Mono<Property> loadProperty(BigInteger propertyId) {
        return propertyRepository.findById(propertyId);
    }

    @Override
    public Flux<Property> loadProperties(PageRequest pageRequest) {
        return propertyRepository.findAllBy(pageRequest);
    }

    @Override
    public Mono<Property> saveProperty(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    public Mono<Void> removeProperty(BigInteger propertyId) {
        return propertyRepository.deleteById(propertyId);
    }
}
