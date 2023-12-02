package com.lemon.macadamia.common.conveter;

import com.lemon.macadamia.common.enums.Supplier;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class SupplierConveter implements AttributeConverter<Supplier, String> {
    @Override
    public String convertToDatabaseColumn(Supplier attribute) {
        return attribute.name();
    }

    @Override
    public Supplier convertToEntityAttribute(String dbData) {
        return Supplier.getSupplier(Integer.parseInt(dbData));
    }
}
