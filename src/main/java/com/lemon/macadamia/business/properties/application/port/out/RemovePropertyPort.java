package com.lemon.macadamia.business.properties.application.port.out;

import reactor.core.publisher.Mono;

import java.math.BigInteger;

public interface RemovePropertyPort {
    Mono<Void> removeProperty(BigInteger propertyId);
}
