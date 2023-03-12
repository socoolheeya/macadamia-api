package com.lemon.macadamia.business.rooms.adapter.out;

import com.lemon.macadamia.business.rooms.adapter.out.repository.RoomRepository;
import com.lemon.macadamia.business.rooms.application.port.out.RemoveRoomPort;
import com.lemon.macadamia.business.rooms.application.port.out.SaveRoomPort;
import com.lemon.macadamia.business.rooms.application.port.out.SearchRoomPort;
import com.lemon.macadamia.business.rooms.domain.entity.Room;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@Repository
@RequiredArgsConstructor
public class RoomAdapter implements SearchRoomPort, SaveRoomPort, RemoveRoomPort {

    private final RoomRepository roomRepository;

    @Override
    public Mono<Room> searchRoom(BigInteger roomId) {
        return roomRepository.findById(roomId);
    }

    @Override
    public Flux<Room> searchRooms(Pageable pageable) {
        return roomRepository.findAllBy(pageable);
    }

    @Override
    public Mono<Room> saveRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Mono<Void> RemoveRoom(BigInteger roomId) {
        return roomRepository.deleteById(roomId);
    }
}
