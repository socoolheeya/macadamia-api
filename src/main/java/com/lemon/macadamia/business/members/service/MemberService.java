package com.lemon.macadamia.business.members.service;

import com.lemon.macadamia.business.members.model.Member;
import com.lemon.macadamia.business.members.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Mono<Member> getMember(long memberId) {
        return memberRepository.findById(memberId);
    }

    public Flux<Member> getMembers() {
        return memberRepository.findAll();
    }

    public Mono<Member> saveMember(Member member) {
        return memberRepository.save(member);
    }

    public Mono<Void> deleteMember(long memberId) {
        return memberRepository.deleteById(memberId);
    }
}
