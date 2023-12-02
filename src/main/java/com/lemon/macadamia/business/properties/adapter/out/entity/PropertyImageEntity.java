package com.lemon.macadamia.business.properties.adapter.out.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Description;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigInteger;

@Getter
@Entity
@Table(name = "property_image")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Description("숙소 이미지")
public class PropertyImageEntity {
    @Id
    @Column(name = "property_image_id")
    BigInteger id;
    String url;
    String name;
    String description;
    int order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    PropertyEntity property;

}
