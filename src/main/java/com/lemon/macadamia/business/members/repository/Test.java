package com.lemon.macadamia.business.members.repository;

import com.lemon.macadamia.business.properties.domain.Property;

import java.util.List;
import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        List<Property> list = null;

        boolean a = Optional.ofNullable(list).isPresent();
        System.out.println("###### test : " + a);
    }
}
