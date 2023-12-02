package com.lemon.macadamia.business.properties.adapter.out.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Getter
@Entity
@Table(name = "property_option")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyOptionEntity {
    @Id
    BigInteger id;
    Boolean isKakao;
    Boolean isTodayReservation;


}
