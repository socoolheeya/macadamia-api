package com.lemon.macadamia.configuration;

import com.lemon.macadamia.business.commons.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.ReactiveAuditorAware;

@Configuration
public class AuditConfiguration {

    @Bean
    public ReactiveAuditorAware<String> auditorProvider() {
        return new AuditorAwareImpl();
    }
}
