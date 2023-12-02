package com.lemon.macadamia.business.properties.adapter.out.entity;

import com.lemon.macadamia.business.commons.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;

@Getter
@Entity
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Table(name = "property_address")
public class PropertyAddressEntity extends BaseEntity {
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
