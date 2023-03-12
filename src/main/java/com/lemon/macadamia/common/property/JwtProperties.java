package com.lemon.macadamia.common.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "spring.security.jwt")
public class JwtProperties {

    /**
     * secret key
     */
    private String secretKey;

    /**
     * 유효 토큰 시간
     */
    private int accessExpirationTime = 1000 * 60 * 60 * 2;

    /**
     * 갱신 토큰 시간
     */
    private int refreshExpirationTime = 1000 * 60 * 60 * 24 * 10;
}
