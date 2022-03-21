package com.espire.examples.annotation;

import java.lang.annotation.Repeatable;

@Repeatable(value = Cars.class)
public @interface Manufacturer {

    String name();
}
