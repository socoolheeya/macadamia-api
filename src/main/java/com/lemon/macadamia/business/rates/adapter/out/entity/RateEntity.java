package com.lemon.macadamia.business.rates.adapter.out.entity;

import com.lemon.macadamia.business.rateplans.adapter.out.entity.RatePlanEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;

@Getter
@Entity
@Table(name = "rate")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RateEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rate_id")
    BigInteger id;

    @Column(name = "total_price")
    BigDecimal totalPrice;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rate_plan_id")
    RatePlanEntity ratePlan;

}
