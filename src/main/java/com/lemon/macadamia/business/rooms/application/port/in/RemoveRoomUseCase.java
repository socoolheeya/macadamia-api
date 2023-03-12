package com.lemon.macadamia.business.rooms.application.port.in;

import reactor.core.publisher.Mono;

import java.math.BigInteger;

public interface RemoveRoomUseCase {
    Mono<Void> removeRoom(BigInteger roomId);
}
