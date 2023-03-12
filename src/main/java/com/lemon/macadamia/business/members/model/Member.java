package com.lemon.macadamia.business.members.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@NoArgsConstructor
@Table
public class Member {

    @Id
    @Column(value = "member_id")
    private Long id;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String name;

    @Builder
    public Member(Long id, String email, String password, String name) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
    }


}
