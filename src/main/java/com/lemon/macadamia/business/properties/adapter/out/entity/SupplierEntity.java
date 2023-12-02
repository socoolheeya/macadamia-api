package com.lemon.macadamia.business.properties.adapter.out.entity;

import com.lemon.macadamia.business.commons.BaseEntity;
import com.lemon.macadamia.common.enums.Supplier;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Getter
@Entity
@Table(name = "supplier")
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SupplierEntity extends BaseEntity {
    @Id
    BigInteger id;
    String name;
    String fullName;
    Supplier supplier;
    Boolean isActive;

    @Builder
    public SupplierEntity(BigInteger id, String name, Boolean isActive) {
        this.id = id;
        this.name = name;
    }
}
