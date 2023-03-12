package com.lemon.macadamia.business.rooms.domain.http;

import com.lemon.macadamia.business.rooms.domain.entity.Room;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;

@UtilityClass
public class RoomRequest {

    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Save {
        Room room;
    }
}
