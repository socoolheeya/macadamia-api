package com.lemon.macadamia.business.rateplans.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MealPlan {
    Boolean breakfast;
    Boolean lunch;
    Boolean dinner;
}
