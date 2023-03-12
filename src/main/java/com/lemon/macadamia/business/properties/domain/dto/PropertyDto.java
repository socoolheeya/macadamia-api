package com.lemon.macadamia.business.properties.domain.dto;

import com.lemon.macadamia.business.properties.domain.entity.Property;
import com.lemon.macadamia.business.properties.domain.enums.PropertyEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@Builder
public class PropertyDto {

    BigInteger id;
    String name;
    BigInteger partnerId;
    PropertyEnum.Rating rating;
    String type;
    String description;

    public static PropertyDto toDomain(Property property) {
        return PropertyDto.builder()
                .id(property.getId())
                .name(property.getName())
                .partnerId(property.getPartnerId())
                .rating(property.getRating())
                .type(property.getType())
                .description(property.getDescription())
                .build();
    }
}
