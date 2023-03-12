package com.lemon.macadamia.business.members.repository;

import com.lemon.macadamia.business.members.model.Member;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;


@Repository
public interface MemberRepository extends R2dbcRepository<Member, Long> {

    Mono<Member> findByEmail(String email);
}
