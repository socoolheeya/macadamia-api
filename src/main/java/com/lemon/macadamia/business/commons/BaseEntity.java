package com.lemon.macadamia.business.commons;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseEntity {
    @CreatedBy
    String createdBy;

    @CreatedDate
    LocalDateTime createdAt;

    @LastModifiedBy
    String updatedBy;

    @LastModifiedDate
    LocalDateTime updatedAt;
}
