package com.lemon.macadamia.business.rateplans.application.service;

import com.lemon.macadamia.business.rateplans.application.port.in.SaveRatePlanUseCase;
import com.lemon.macadamia.business.rateplans.application.port.in.SearchRatePlanUseCase;
import com.lemon.macadamia.business.rateplans.application.port.out.SaveRatePlanPort;
import com.lemon.macadamia.business.rateplans.application.port.out.SearchRatePlanPort;
import com.lemon.macadamia.business.rateplans.adapter.out.entity.RatePlanEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
public class RatePlanService implements SearchRatePlanUseCase, SaveRatePlanUseCase {
    private final SearchRatePlanPort searchRatePlanPort;
    private final SaveRatePlanPort saveRatePlanPort;

    public Flux<RatePlanEntity> searchRatePlans() {
        return searchRatePlanPort.loadRatePlans();
    }

    public Mono<RatePlanEntity> searchRatePlan(BigInteger ratePlanId) {
        return searchRatePlanPort.loadRatePlan(ratePlanId);
    }
}
