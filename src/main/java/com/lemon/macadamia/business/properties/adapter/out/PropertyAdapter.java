package com.lemon.macadamia.business.properties.adapter.out;

import com.lemon.macadamia.business.properties.adapter.out.entity.PropertyEntity;
import com.lemon.macadamia.business.properties.adapter.out.repository.PropertyRepository;
import com.lemon.macadamia.business.properties.application.port.out.RemovePropertyPort;
import com.lemon.macadamia.business.properties.application.port.out.SavePropertyPort;
import com.lemon.macadamia.business.properties.application.port.out.SearchPropertyPort;
import com.lemon.macadamia.business.properties.domain.Property;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.math.BigInteger;

@Repository
@RequiredArgsConstructor
public class PropertyAdapter implements SearchPropertyPort, SavePropertyPort, RemovePropertyPort {

    private final PropertyRepository propertyRepository;

    @Override
    public Mono<Property> loadProperty(BigInteger propertyId) {
        return propertyRepository.findById(propertyId)
                .map(PropertyEntity::toDomain)
                .switchIfEmpty(Mono.error((new EntityNotFoundException("property entity not found with id :: " + propertyId))));
    }

    @Override
    public Flux<Property> loadProperties(PageRequest pageRequest) {
        return propertyRepository.findAllBy(pageRequest)
                .map(PropertyEntity::toDomain);
    }

    @Override
    @Transactional
    public Mono<Property> saveProperty(Property property) {
        return propertyRepository.save(Property.toEntity(property))
                .map(PropertyEntity::toDomain);
    }

    @Override
    @Transactional
    public Mono<Void> removeProperty(BigInteger propertyId) {
        return propertyRepository.deleteById(propertyId);
    }
}
