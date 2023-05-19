package com.lemon.macadamia.business.rateplans.domain;

import com.lemon.macadamia.business.rates.domain.Rate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RatePlan {
    BigInteger id;
    String name;
    Boolean cancelPolicy = false;
    Boolean roomOnly = false;
    MealPlan mealPlan;
    Boolean couponAvailable = false;
    List<Rate> rates;


}
