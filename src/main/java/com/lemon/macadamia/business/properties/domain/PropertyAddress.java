package com.lemon.macadamia.business.properties.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PropertyAddress {

    BigInteger id;
    String countryCode;
    String cityCode;
    String address;
    String addressDetail;
    String zipCode;

    @Builder
    public PropertyAddress(BigInteger id, String countryCode, String cityCode, String address, String addressDetail, String zipCode) {
        this.id = id;
        this.countryCode = countryCode;
        this. cityCode = cityCode;
        this.address = address;
        this.addressDetail = addressDetail;
        this.zipCode = zipCode;
    }

}
