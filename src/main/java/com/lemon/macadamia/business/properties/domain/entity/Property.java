package com.lemon.macadamia.business.properties.domain.entity;

import com.lemon.macadamia.business.commons.BaseEntity;
import com.lemon.macadamia.business.properties.domain.dto.PropertyDto;
import com.lemon.macadamia.business.properties.domain.enums.PropertyEnum;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.math.BigInteger;

@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Property extends BaseEntity {

    BigInteger id;
    String name;
    BigInteger partnerId;
    PropertyEnum.Rating rating;
    String type;
    String description;

}
