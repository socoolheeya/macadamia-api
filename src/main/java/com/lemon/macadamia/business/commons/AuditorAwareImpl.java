package com.lemon.macadamia.business.commons;

import org.springframework.data.domain.ReactiveAuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import reactor.core.publisher.Mono;


public class AuditorAwareImpl implements ReactiveAuditorAware<String> {

    @Override
    public Mono<String> getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userId = "";
        if(authentication != null) {
            userId = authentication.getName();
        }
        return Mono.just(userId);
    }
}
