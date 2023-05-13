package com.lemon.macadamia.business.rateplans.adapter.out;

import com.lemon.macadamia.business.rateplans.adapter.out.repository.RatePlanRepository;
import com.lemon.macadamia.business.rateplans.application.port.out.SearchRatePlanPort;
import com.lemon.macadamia.business.rateplans.adapter.out.entity.RatePlanEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@Repository
@RequiredArgsConstructor
public class RatePlanAdapter implements SearchRatePlanPort {
    private final RatePlanRepository ratePlanRepository;
    @Override
    public Flux<RatePlanEntity> loadRatePlans() {
        return ratePlanRepository.findAll();
    }

    @Override
    public Mono<RatePlanEntity> loadRatePlan(BigInteger ratePlanId) {
        return ratePlanRepository.findById(ratePlanId);
    }
}
