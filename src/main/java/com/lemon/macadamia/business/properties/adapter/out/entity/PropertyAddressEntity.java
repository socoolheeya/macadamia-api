package com.lemon.macadamia.business.properties.adapter.out.entity;

import lombok.Generated;
import lombok.Getter;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;

@Getter
@Entity
@Table(name = "property_address")
public class PropertyAddressEntity {
    @Id
    BigInteger id;
    String region;
    String city;
    String country;
    String address;
    String addressDetail;
    String zipCode;
    BigDecimal longitude;
    BigDecimal latitude;
    @OneToOne
    @JoinColumn(name = "property_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    PropertyEntity property;
}
