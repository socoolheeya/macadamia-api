package com.lemon.macadamia.business.rateplans.adapter.out.entity;

import com.lemon.macadamia.business.commons.BaseEntity;
import com.lemon.macadamia.business.rates.adapter.out.entity.RateEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Description;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "rate_plan")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Description("요금제")
public class RatePlanEntity extends BaseEntity {

    @Id @Column(name = "rate_plan_id")
    BigInteger id;
    String name;
    String description;
    RatePlanPolicyEntity ratePlanPolicy;
    CancelPolicyEntity cancelPolicy;
    @OneToOne(mappedBy = "ratePlan")
    MealPlanEntity mealPlan;
    Boolean cancellable;
    int maxAdult;
    int minAdult;
    int maxChildren;
    int minChildren;
    int standard;
    @OneToMany(mappedBy = "ratePlan")
    List<RateEntity> rates = new ArrayList<>();
    @Builder
    public RatePlanEntity(BigInteger id, String name, String description, RatePlanPolicyEntity ratePlanPolicy, CancelPolicyEntity cancelPolicy, MealPlanEntity mealPlan, Boolean cancellable, int maxAdult, int minAdult, int maxChildren, int minChildren, int standard) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ratePlanPolicy = ratePlanPolicy;
        this.cancelPolicy = cancelPolicy;
        this.mealPlan = mealPlan;
        this.cancellable = cancellable;
        this.maxAdult = maxAdult;
        this.minAdult = minAdult;
        this.maxChildren = maxChildren;
        this.minChildren = minChildren;
        this.standard = standard;
    }
}
