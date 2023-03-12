package com.lemon.macadamia.business.members.service;

import com.lemon.macadamia.business.members.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class MemberServiceTest {

    @Mock
    private MemberRepository memberRepository;

    @Test
    void getMember() {
        //memberRepository.findById();
    }

    @Test
    void getMembers() {
    }

    @Test
    void saveMember() {
    }

    @Test
    void deleteMember() {
    }
}