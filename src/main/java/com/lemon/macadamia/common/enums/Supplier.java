package com.lemon.macadamia.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.NoSuchElementException;

@Getter
@AllArgsConstructor
public enum Supplier {
    DERBY(1, "Derby"),
    TL_LINCOLN(2, "TL_Lincoln"),
    TRIPANZEE(3, "Tripanzee"),
    SITE_MINDER(4, "SiteMinder"),
    SANHA(5, "Sanha"),
    SONO(6, "Sono"),
    HANWHA(7, "Hanwha"),
    DDNAYO(8, "Ddnayo"),
    COUPANG(9, "Coupang"),
    HOTEL_STORY(10, "HotelStory"),
    TEMAIRAZU(11, "Temairazu");

    private final int code;
    private final String name;

    public static Supplier getSupplier(int code) {
        return Arrays.stream(Supplier.values())
                .filter(x -> x.getCode() == code)
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("존재하지 않는 Supplier 입니다."));
    }


}
