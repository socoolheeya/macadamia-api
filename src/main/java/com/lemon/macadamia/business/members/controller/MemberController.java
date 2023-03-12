package com.lemon.macadamia.business.members.controller;

import com.lemon.macadamia.business.members.model.Member;
import com.lemon.macadamia.business.members.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @Value("${spring.r2dbc.name}")
    private String dbUrl;

    @GetMapping("/test")
    public String test() throws InterruptedException {
        Thread.sleep(10000);
        return "1111";
    }

    @GetMapping("/member/{memberId}")
    public Mono<ResponseEntity<Member>> getMember(@PathVariable Long memberId) {
        return memberService.getMember(memberId)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());

    }



}
