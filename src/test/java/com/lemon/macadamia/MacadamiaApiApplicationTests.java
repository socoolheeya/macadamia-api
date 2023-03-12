package com.lemon.macadamia;

import com.lemon.macadamia.business.members.service.MemberService;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.test.StepVerifier;


@WebFluxTest
@ExtendWith(SpringExtension.class)
class MacadamiaApiApplicationTests {

    @Autowired
    private MemberService memberService;

    @Test
    void contextLoads() {
    }

    @Test
    void jasypt() {
        String url = "r2dbc:mariadb://localhost:3306://macadamia?useUnicode=true&characterEncoding=utf8";
        String username = "macadamia-api";
        String password = "1234";

        System.out.println(jasyptEncoding(url));
        System.out.println(jasyptEncoding(username));
        System.out.println(jasyptEncoding(password));


    }

    @Test
    public void getMemberTest() {
        StepVerifier.create(memberService.getMember(1L))
                .expectNextCount(1)
                .verifyComplete();
    }

    public String jasyptEncoding(String value) {

        String key = "macadamia";
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword(key);
        return pbeEnc.encrypt(value);
    }

}
