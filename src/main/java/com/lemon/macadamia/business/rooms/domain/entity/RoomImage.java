package com.lemon.macadamia.business.rooms.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Description;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Description("룸 이미지")
public class RoomImage {
    BigInteger id;
    String name;
    String url;
    int order;

}
