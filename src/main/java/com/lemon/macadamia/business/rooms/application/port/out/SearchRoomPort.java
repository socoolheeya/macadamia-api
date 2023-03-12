package com.lemon.macadamia.business.rooms.application.port.out;

import com.lemon.macadamia.business.rooms.domain.entity.Room;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

public interface SearchRoomPort {
    Mono<Room> searchRoom(BigInteger roomId);
    Flux<Room> searchRooms(Pageable pageable);
}
