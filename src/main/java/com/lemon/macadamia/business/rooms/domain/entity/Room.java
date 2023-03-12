package com.lemon.macadamia.business.rooms.domain.entity;

import com.lemon.macadamia.business.commons.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Room extends BaseEntity {
    BigInteger id;
    String name;
    String description;
    int rooms;
    int bathRooms;
    int livingRooms;
    LocalDateTime checkin;


}
