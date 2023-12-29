package com.lemon.macadamia.business.rooms.application.port.in;

import com.lemon.macadamia.business.rooms.domain.entity.Room;
import com.lemon.macadamia.business.rooms.domain.http.RoomResponse;
import org.springframework.data.domain.PageRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

public interface SearchRoomUseCase {
    Mono<RoomResponse.SearchList> searchRooms(PageRequest request);
    Mono<RoomResponse.Search> searchRoom(BigInteger roomId);

}
