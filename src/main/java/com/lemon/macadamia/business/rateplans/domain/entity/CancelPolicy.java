package com.lemon.macadamia.business.rateplans.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Description;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Description("취소 정책")
public class CancelPolicy {
    @Id
    BigInteger id;
    String name;
}
