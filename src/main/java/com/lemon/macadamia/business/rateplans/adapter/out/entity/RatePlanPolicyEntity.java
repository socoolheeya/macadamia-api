package com.lemon.macadamia.business.rateplans.adapter.out.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Description;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Description("요금제 정책")
public class RatePlanPolicyEntity {
    @Id
    BigInteger id;
    String name;
    CancelPolicyEntity cancelPolicyEntity;

}
