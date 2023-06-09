package com.lemon.macadamia.business.properties.adapter.out.repository;

import com.lemon.macadamia.business.properties.adapter.out.entity.PropertyAddressEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface PropertyAddressRepository extends R2dbcRepository<PropertyAddressEntity, BigInteger> {
}
