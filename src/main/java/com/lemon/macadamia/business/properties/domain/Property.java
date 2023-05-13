package com.lemon.macadamia.business.properties.domain;

import com.lemon.macadamia.business.properties.adapter.out.entity.PropertyEntity;
import com.lemon.macadamia.business.properties.domain.enums.PropertyEnum;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Property {

    BigInteger id;
    String name;
    BigInteger partnerId;
    PropertyEnum.Rating rating;
    String type;
    String description;

    @Builder
    public Property(BigInteger id, String name, BigInteger partnerId, PropertyEnum.Rating rating, String type, String description) {
        this.id = id;
        this.name = name;
        this.partnerId = partnerId;
        this.rating = rating;
        this.type = type;
        this.description = description;
    }

    public static PropertyEntity toEntity(Property property) {
        return PropertyEntity.builder()
                .id(property.getId())
                .name(property.getName())
                .partnerId(property.getPartnerId())
                .rating(property.getRating())
                .type(property.getType())
                .description(property.getDescription())
                .build();
    }
}
