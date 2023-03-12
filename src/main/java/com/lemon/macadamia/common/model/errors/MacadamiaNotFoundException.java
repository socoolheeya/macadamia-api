package com.lemon.macadamia.common.model.errors;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.nio.charset.Charset;

@Getter
@Setter
public class MacadamiaNotFoundException extends WebClientResponseException {
    private HttpHeaders headers;
    private byte[] body;
    public MacadamiaNotFoundException(HttpHeaders headers, byte[] body) {
        super(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.getReasonPhrase(), headers, body, Charset.defaultCharset());
        this.headers = headers;
        this.body = body;

    }
}
