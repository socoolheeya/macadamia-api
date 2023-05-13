package com.lemon.macadamia.business.rateplans.domain.http;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.UtilityClass;

@UtilityClass
public class RatePlanRequest {

    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class SearchList {


    }

    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class Search {

    }

    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class Save {

    }
}
