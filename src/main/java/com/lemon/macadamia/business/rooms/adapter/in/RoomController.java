package com.lemon.macadamia.business.rooms.adapter.in;

import com.lemon.macadamia.business.rooms.application.port.in.SaveRoomUseCase;
import com.lemon.macadamia.business.rooms.application.port.in.SearchRoomUseCase;
import com.lemon.macadamia.business.rooms.domain.http.RoomRequest;
import com.lemon.macadamia.business.rooms.domain.http.RoomResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/rooms")
public class RoomController {
    private final SearchRoomUseCase searchRoomUseCase;
    private final SaveRoomUseCase saveRoomUseCase;

    @GetMapping("/{roomId}")
    public ResponseEntity<Mono<RoomResponse.Search>> getRoom(@PathVariable BigInteger roomId) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(searchRoomUseCase.searchRoom(roomId));
    }

    @GetMapping("")
    public ResponseEntity<Flux<RoomResponse.SearchList>> getRooms(PageRequest pageRequest) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(searchRoomUseCase.searchRooms(pageRequest));
    }

    @PostMapping("")
    public ResponseEntity<Mono<RoomResponse.Save>> saveRoom(RoomRequest.Save request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(saveRoomUseCase.saveRoom(request));
    }


}
