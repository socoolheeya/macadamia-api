package com.lemon.macadamia.business.rooms.application.port.out;

import com.lemon.macadamia.business.rooms.domain.entity.Room;
import reactor.core.publisher.Mono;

public interface SaveRoomPort {
    Mono<Room> saveRoom(Room room);
}
