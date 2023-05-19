package com.lemon.macadamia.business.rateplans.adapter.out.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Description;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigInteger;

@Getter
@Entity
@Table(name = "rate_plan_policy")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Description("요금제 정책")
public class RatePlanPolicyEntity {
    @Id @Column(name = "rate_plan_id")
    BigInteger id;
    String name;

    CancelPolicyEntity cancelPolicyEntity;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rate_plan_id")
    RatePlanEntity ratePlan;

}
