package com.lemon.macadamia.common.model.errors;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.nio.charset.Charset;

@Getter
@Setter
public class MacadamiaBadRequestException extends WebClientResponseException {

    private HttpHeaders headers;
    private byte[] body;
    public MacadamiaBadRequestException(HttpHeaders headers, byte[] body) {
        super(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), headers, body, Charset.defaultCharset());
        this.headers = headers;
        this.body = body;

    }
}
