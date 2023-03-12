package com.lemon.macadamia.business.rateplans.adapter.in;

import com.lemon.macadamia.business.rateplans.service.RatePlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RatePlanController {
    private final RatePlanService ratePlanService;

}




