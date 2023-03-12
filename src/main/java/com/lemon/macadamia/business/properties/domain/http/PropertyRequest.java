package com.lemon.macadamia.business.properties.domain.http;

import com.lemon.macadamia.business.commons.domain.Page;
import com.lemon.macadamia.business.properties.domain.entity.Property;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;

import java.math.BigInteger;

@UtilityClass
public class PropertyRequest {

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Search {
        Long property;
        String name;
    }

    @Getter
    @SuperBuilder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class SearchList extends Page {
        String name;
        BigInteger partnerId;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Save {
        Property property;

    }

    public static class Update {

    }

    public static class Delete {

    }
}
