package com.lemon.macadamia.business.properties.adapter.in;

import com.lemon.macadamia.business.properties.application.port.in.SavePropertyUseCase;
import com.lemon.macadamia.business.properties.application.port.in.SearchPropertyUseCase;
import com.lemon.macadamia.business.properties.domain.entity.Property;
import com.lemon.macadamia.business.properties.domain.http.PropertyRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/properties")
public class PropertyController {

    private final SearchPropertyUseCase searchPropertyUseCase;
    private final SavePropertyUseCase savePropertyUseCase;

    @GetMapping("")
    public ResponseEntity<Flux<Property>> getProperties(PageRequest request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(searchPropertyUseCase.searchProperties(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mono<Property>> getProperty(@PathVariable BigInteger id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(searchPropertyUseCase.searchProperty(id));
    }

    @PostMapping("")
    public ResponseEntity<Mono<Property>> saveProperty(@RequestBody PropertyRequest.Save request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(savePropertyUseCase.saveProperty(request));
    }
}
