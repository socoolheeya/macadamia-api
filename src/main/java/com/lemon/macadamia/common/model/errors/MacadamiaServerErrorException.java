package com.lemon.macadamia.common.model.errors;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.nio.charset.Charset;

@Getter
@Setter
public class MacadamiaServerErrorException extends WebClientResponseException {
    private HttpHeaders headers;
    private byte[] body;
    public MacadamiaServerErrorException(HttpHeaders headers, byte[] body) {
        super(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), headers, body, Charset.defaultCharset());
        this.headers = headers;
        this.body = body;

    }
}
