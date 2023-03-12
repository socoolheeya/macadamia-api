package com.lemon.macadamia.business.properties.adapter.out.repository;

import com.lemon.macadamia.business.properties.domain.entity.Property;
import org.springframework.data.domain.Pageable;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.math.BigInteger;

@Repository
public interface PropertyRepository extends R2dbcRepository<Property, BigInteger> {
    Flux<Property> findAllBy(Pageable pageable);
}
