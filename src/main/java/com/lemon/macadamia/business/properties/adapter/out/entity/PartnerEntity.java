package com.lemon.macadamia.business.properties.adapter.out.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "partner")
public class PartnerEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partner_id")
    BigInteger id;
    String name;

    @OneToMany(mappedBy = "partner")
    List<PropertyEntity> properties = new ArrayList<>();

    @Builder
    public PartnerEntity(BigInteger id, String name, List<PropertyEntity> properties) {
        this.id = id;
        this.name = name;
        this.properties = properties;
    }
}
