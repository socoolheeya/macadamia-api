package com.lemon.macadamia.business.rateplans.application.port.out;

import com.lemon.macadamia.business.rateplans.adapter.out.entity.RatePlanEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

public interface SearchRatePlanPort {
    Flux<RatePlanEntity> loadRatePlans();
    Mono<RatePlanEntity> loadRatePlan(BigInteger ratePlanId);
}
