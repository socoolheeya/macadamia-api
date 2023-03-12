package com.lemon.macadamia.business.rateplans.domain.entity;

import com.lemon.macadamia.business.commons.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Description;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Description("요금제")
public class RatePlan extends BaseEntity {

    @Id
    BigInteger id;
    String name;
    String description;
    RatePlanPolicy ratePlanPolicy;
    CancelPolicy cancelPolicy;
    Boolean cancellable;
    int maxAdult;
    int minAdult;
    int maxChildren;
    int minChildren;
    int standard;





}
