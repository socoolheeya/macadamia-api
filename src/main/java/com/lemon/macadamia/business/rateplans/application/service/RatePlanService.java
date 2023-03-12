package com.lemon.macadamia.business.rateplans.application.service;

import com.lemon.macadamia.business.rateplans.application.port.in.SaveRatePlanUseCase;
import com.lemon.macadamia.business.rateplans.application.port.in.SearchRatePlanUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RatePlanService implements SearchRatePlanUseCase, SaveRatePlanUseCase {
}
