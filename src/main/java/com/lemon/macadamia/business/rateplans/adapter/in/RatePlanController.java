package com.lemon.macadamia.business.rateplans.adapter.in;

import com.lemon.macadamia.business.rateplans.application.port.in.SearchRatePlanUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/rate-plans")
public class RatePlanController {
    private final SearchRatePlanUseCase searchRatePlanUseCase;

}




