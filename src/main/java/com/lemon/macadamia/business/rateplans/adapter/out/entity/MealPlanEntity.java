package com.lemon.macadamia.business.rateplans.adapter.out.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigInteger;

@Getter
@Entity
@Table(name = "meal_plan")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MealPlanEntity {
    @Id @Column(name = "rate_plan_id")
    BigInteger id;
    Boolean breakfast;
    Boolean lunch;
    Boolean dinner;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    RatePlanEntity ratePlan;

    @Builder
    public MealPlanEntity(Boolean breakfast, Boolean lunch, Boolean dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

}
