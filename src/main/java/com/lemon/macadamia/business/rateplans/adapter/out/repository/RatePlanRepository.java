package com.lemon.macadamia.business.rateplans.adapter.out.repository;

import com.lemon.macadamia.business.rateplans.domain.entity.RatePlan;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface RatePlanRepository extends R2dbcRepository<RatePlan, BigInteger> {
}
