package com.lemon.macadamia.business.rooms.application.port.out;

import reactor.core.publisher.Mono;

import java.math.BigInteger;

public interface RemoveRoomPort {
    Mono<Void> RemoveRoom(BigInteger roomId);
}
