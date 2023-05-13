package com.lemon.macadamia.business.properties.adapter.out.entity;

import com.lemon.macadamia.business.commons.BaseEntity;
import com.lemon.macadamia.business.properties.domain.Property;
import com.lemon.macadamia.business.properties.domain.enums.PropertyEnum;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "property")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyEntity extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_id")
    BigInteger id;
    String name;
    BigInteger partnerId;
    PropertyEnum.Rating rating;
    String type;
    String description;

    @OneToOne(mappedBy = "property")
    PropertyAddressEntity address;
    @OneToMany(mappedBy = "property")
    List<PropertyImageEntity> images = new ArrayList<>();
    @ManyToOne @JoinColumn(name = "partner_id")
    PartnerEntity partner;
    @Builder
    public PropertyEntity(BigInteger id, String name, BigInteger partnerId, PropertyEnum.Rating rating, String type, String description) {
        this.id = id;
        this.name = name;
        this.partnerId = partnerId;
        this.rating = rating;
        this.type = type;
        this.description = description;
    }

    public static Property toDomain(PropertyEntity entity) {
        return Property.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}
