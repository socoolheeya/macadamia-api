package com.lemon.macadamia.business.rooms.application.port.in;

import com.lemon.macadamia.business.rooms.domain.http.RoomRequest;
import com.lemon.macadamia.business.rooms.domain.http.RoomResponse;
import reactor.core.publisher.Mono;

public interface SaveRoomUseCase {
    Mono<RoomResponse.Save> saveRoom(RoomRequest.Save request);
}
