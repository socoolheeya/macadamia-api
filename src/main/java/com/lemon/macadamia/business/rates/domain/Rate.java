package com.lemon.macadamia.business.rates.domain;

import com.lemon.macadamia.business.rateplans.domain.RatePlan;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Rate {
    BigInteger id;

    BigDecimal totalPrice;

    RatePlan ratePlan;

}
