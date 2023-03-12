package com.lemon.macadamia.business.rateplans.service;

import com.lemon.macadamia.business.rateplans.adapter.out.repository.RatePlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RatePlanService {
    private final RatePlanRepository ratePlanRepository;
}
