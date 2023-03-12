package com.lemon.macadamia.common.security;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;


@Getter
public class JwtToken {
    @Id
    @Column(value = "TOKEN_ID")
    private long id;

    @Column(value = "USER_ID")
    private String userId;

    @Column(value = "ACCESS_TOKEN_KEY")
    private String accessTokenKey;

    @Column(value = "REFRESH_TOKEN_KEY")
    private String refreshTokenKey;

    @Builder
    public JwtToken(long id, String userId, String accessTokenKey, String refreshTokenKey) {
        this.id = id;
        this.userId = userId;
        this.accessTokenKey = accessTokenKey;
        this.refreshTokenKey = refreshTokenKey;
    }
}
