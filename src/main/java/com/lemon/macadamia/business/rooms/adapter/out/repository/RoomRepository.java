package com.lemon.macadamia.business.rooms.adapter.out.repository;

import com.lemon.macadamia.business.rooms.domain.entity.Room;
import org.springframework.data.domain.Pageable;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.math.BigInteger;


@Repository
public interface RoomRepository extends R2dbcRepository<Room, BigInteger> {

    Flux<Room> findAllBy(Pageable pageable);
}
