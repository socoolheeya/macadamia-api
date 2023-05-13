package com.lemon.macadamia.business.properties.domain;

import com.lemon.macadamia.business.properties.adapter.out.entity.PartnerEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Partner {
    BigInteger id;
    String name;

    @Builder
    public Partner(BigInteger id, String name) {
        this.id = id;
        this.name = name;
    }
    public static PartnerEntity toEntity(Partner partner) {
        return PartnerEntity.builder()
                .id(partner.getId())
                .name(partner.getName())
                .build();
    }
}
